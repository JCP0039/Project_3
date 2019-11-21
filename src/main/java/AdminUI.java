import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//CHECK

public class AdminUI {

    public UserModel user = null;

    public JFrame view;

    public JButton btnSystemConfig = new JButton("System Configuration");
    public JButton btnAddNewUser = new JButton("Add a new User");
    public JButton btnDeleteUSer = new JButton("Delete User");

    public AdminUI(final UserModel user) {

        this.user = user;

        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Admin View");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelUser = new JPanel(new FlowLayout());
        panelUser.add(new JLabel("Fullname: " + user.mFullname));
        panelUser.add(new JLabel("AdminID: " + user.mCustomerID));

        view.getContentPane().add(panelUser);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnSystemConfig);
        panelButtons.add(btnDeleteUSer);
        panelButtons.add(btnAddNewUser);

        view.getContentPane().add(panelButtons);



        //functionality currently not implemented. These two buttons mirror the customer options for now.
        //***********************************************************************************************
        btnDeleteUSer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PurchaseHistoryUI ui = new PurchaseHistoryUI(user);
                ui.view.setVisible(true);
            }
        });

        btnSystemConfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ManageCustomerUI ui = new ManageCustomerUI();
                ui.run();
            }
        });

    }
}