import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MyFrame extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyFrame frame = new MyFrame();
       frame.setVisible(true);
       frame.setSize(600, 600);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       JPanel jPanel = new JPanel(new GridLayout());
       GridBagConstraints gc = new GridBagConstraints();
       gc.gridx=0;
       gc.gridy=2;
       gc.anchor = GridBagConstraints.CENTER;
       jPanel.setSize(100,100);
       jPanel.setBackground(Color.PINK);
       frame.add(jPanel);
       
       
      
       /*
       tes
       JButton btn = new JButton("OK");
       jPanel.add(btn);
       

       JLabel label = new JLabel("Enter your name");
       jPanel.add(label);
       
       JTextField txt = new JTextField();
       txt.setSize(100,25);
       jPanel.add(txt);
      
       
       JTextArea text = new JTextArea();
       text.setSize(100,100);
     jPanel.add(text);
     */
     JMenuBar bar = new JMenuBar();
     
     bar.setSize(100,70);
     JMenu fileMenu = new JMenu("File");
     
     JMenuItem newItem = new JMenuItem("New");
     JMenuItem openItem = new JMenuItem("Open");
     JMenuItem saveItem = new JMenuItem("Save");
     JMenuItem exitItem = new JMenuItem("Exit");
     
     openItem.setAccelerator(KeyStroke.getKeyStroke('O',KeyEvent.CTRL_MASK));
     saveItem.setAccelerator(KeyStroke.getKeyStroke('S',KeyEvent.CTRL_MASK));

     newItem.setAccelerator(KeyStroke.getKeyStroke('N',KeyEvent.CTRL_MASK));
     exitItem.setAccelerator(KeyStroke.getKeyStroke('E',KeyEvent.CTRL_MASK));
      openItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame, "open is performed");
			
		}
	});
      
      saveItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(frame, "Save is performed");
		}
	});
      
      newItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(frame, "New is performed");

		}
	});
      
      exitItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(frame, "Exit is performed");
			
		}
	});
      
     
     fileMenu.add(openItem);
     fileMenu.add(newItem);
     fileMenu.add(saveItem);
     fileMenu.add(exitItem);
     
     
     JMenu editMenu = new JMenu("Edit");
     
     JMenuItem cutItem = new JMenuItem("Cut");
     JMenuItem copyItem = new JMenuItem("Copy");
     JMenuItem pasteItem = new JMenuItem("Paste");
     JMenuItem deleteItem = new JMenuItem("Delete");
     JMenuItem selectAllItem = new JMenuItem("Select All");
      
     editMenu.add(cutItem);
     editMenu.add(copyItem);
     editMenu.add(pasteItem);
     editMenu.add(deleteItem);
     editMenu.add(selectAllItem);
     
     JMenu helpMenu = new JMenu("Help");
     JMenuItem aboutItem = new JMenuItem("About");
     
     aboutItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(frame, "Done on 14 Dec 2020 \n"+"Written by Nourhan ElChiaty");
		}
	});
     helpMenu.add(aboutItem);
     
     bar.add(fileMenu);
     bar.add(editMenu);
     bar.add(helpMenu);
     frame.setJMenuBar(bar);
       
     
     JTextField txt = new JTextField();
     txt.setBackground(Color.CYAN);;
     txt.setSize(50,25);
     jPanel.add(txt,gc);
	}

}
