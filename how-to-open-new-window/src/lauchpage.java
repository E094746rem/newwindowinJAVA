import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class lauchpage implements ActionListener {

	JFrame frame = new JFrame();
	JButton button = new JButton(" NEW WINDOW");

	lauchpage() {
		button.setBounds(100, 120, 200, 70);
		button.setFocusable(false);
		button.addActionListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			frame.dispose();
			newwindow mywindow = new newwindow();
		}
	}
}
