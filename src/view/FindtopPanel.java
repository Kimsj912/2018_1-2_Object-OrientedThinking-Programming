package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import global.Constants.EBasictopPanel;


public class FindtopPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JPanel headerTopPanel;
	private JPanel headerLabelPanel;
	private JPanel headerBtnAllPanel;
	private JPanel headerBottomPanel;

	private ActionListener actionHandler;
	private JButton backToFindPanelBtn;
	private JButton RePanelBtn;

	public FindtopPanel(ActionListener actionHandler) {

		this.setLayout(new BorderLayout());
		this.actionHandler = actionHandler;

		// ��� �ٲٱ�� �� �г�
		this.headerTopPanel = new JPanel();
		headerTopPanel.add(new JLabel(), BorderLayout.CENTER);
		this.add(headerTopPanel, BorderLayout.NORTH);

		// ����г�
		this.headerLabelPanel = new JPanel();
		headerLabelPanel.setLayout(new BorderLayout());

		headerLabelPanel.add(new JLabel("      "), BorderLayout.WEST);
		JLabel header = new JLabel(EBasictopPanel.headerLabel.getString());
		headerLabelPanel.add(header, BorderLayout.CENTER);
		this.add(headerLabelPanel, BorderLayout.WEST);

		// ��ư �ǳ�
		this.headerBtnAllPanel = new JPanel();
		headerBtnAllPanel.setLayout(new BorderLayout());

		JPanel headerBtnPartPanel = new JPanel();
		this.backToFindPanelBtn = new JButton(EBasictopPanel.backToFindPanelBtn.getString());
		backToFindPanelBtn.addActionListener(this.actionHandler);
		backToFindPanelBtn.setActionCommand(EBasictopPanel.backToFindPanelBtn.getString());
		headerBtnPartPanel.add(backToFindPanelBtn);

		this.RePanelBtn = new JButton(EBasictopPanel.rePanelBtn.getString());
		RePanelBtn.addActionListener(this.actionHandler);
		RePanelBtn.setActionCommand(EBasictopPanel.rePanelBtn.getString());
		headerBtnPartPanel.add(RePanelBtn);

		headerBtnAllPanel.add(headerBtnPartPanel, BorderLayout.CENTER);
		headerBtnAllPanel.add(new JLabel("      "), BorderLayout.EAST);
		this.add(headerBtnAllPanel, BorderLayout.EAST);

		// ��� �ٲٱ�� �� �г�
		this.headerBottomPanel = new JPanel();
		headerBottomPanel.add(new JLabel(), BorderLayout.CENTER);
		this.add(headerBottomPanel, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void initialize() {
		

	}
	
	public void refresh() {
		
	}

}
