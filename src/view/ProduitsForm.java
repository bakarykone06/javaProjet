package view;

import javax.swing.*;
import java.awt.*;

public class ProduitsForm extends JFrame {

    public ProduitsForm() {
        setTitle("Gestion des produits et categories");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane onglets = new JTabbedPane();

        JPanel panelCategories = new JPanel();
        JPanel panelProduits = new JPanel();

        panelCategories.setLayout(null);

JLabel lblNom = new JLabel("Nom :");
lblNom.setBounds(20, 20, 50, 25);
panelCategories.add(lblNom);

JTextField txtNom = new JTextField();
txtNom.setBounds(80, 20, 180, 25);
panelCategories.add(txtNom);

JLabel lblDescription = new JLabel("Description :");
lblDescription.setBounds(300, 20, 80, 25);
panelCategories.add(lblDescription);

JTextField txtDescription = new JTextField();
txtDescription.setBounds(390, 20, 250, 25);
panelCategories.add(txtDescription);

panelProduits.setLayout(null);

JLabel lblNomProduit = new JLabel("Nom :");
lblNomProduit.setBounds(20, 20, 80, 25);
panelProduits.add(lblNomProduit);

JTextField txtNomProduit = new JTextField();
txtNomProduit.setBounds(100, 20, 200, 25);
panelProduits.add(txtNomProduit);

JLabel lblDescriptionProduit = new JLabel("Description :");
lblDescriptionProduit.setBounds(320, 20, 80, 25);
panelProduits.add(lblDescriptionProduit);

JTextField txtDescriptionProduit = new JTextField();
txtDescriptionProduit.setBounds(410, 20, 250, 25);
panelProduits.add(txtDescriptionProduit);

JLabel lblPrix = new JLabel("Prix :");
lblPrix.setBounds(20, 70, 80, 25);
panelProduits.add(lblPrix);

JTextField txtPrix = new JTextField();
txtPrix.setBounds(100, 70, 120, 25);
panelProduits.add(txtPrix);

JLabel lblQuantite = new JLabel("Quantité :");
lblQuantite.setBounds(250, 70, 80, 25);
panelProduits.add(lblQuantite);

JTextField txtQuantite = new JTextField();
txtQuantite.setBounds(330, 70, 120, 25);
panelProduits.add(txtQuantite);

JLabel lblCategorie = new JLabel("Catégorie :");
lblCategorie.setBounds(480, 70, 80, 25);
panelProduits.add(lblCategorie);

JComboBox<String> cbCategorie = new JComboBox<>();
cbCategorie.addItem("Sélectionner une catégorie");
cbCategorie.setBounds(570, 70, 180, 25);
panelProduits.add(cbCategorie);


JButton btnAjouterProduit = new JButton("Ajouter");
btnAjouterProduit.setBounds(100, 120, 120, 35);
btnAjouterProduit.setBackground(new Color(46, 204, 113));
btnAjouterProduit.setForeground(Color.WHITE);

JButton btnModifierProduit = new JButton("Modifier");
btnModifierProduit.setBounds(240, 120, 120, 35);
btnModifierProduit.setBackground(new Color(52, 152, 219));
btnModifierProduit.setForeground(Color.WHITE);

JButton btnSupprimerProduit = new JButton("Supprimer");
btnSupprimerProduit.setBounds(380, 120, 120, 35);
btnSupprimerProduit.setBackground(new Color(231, 76, 60));
btnSupprimerProduit.setForeground(Color.WHITE);

JButton btnViderProduit = new JButton("Vider");
btnViderProduit.setBounds(520, 120, 120, 35);
btnViderProduit.setBackground(new Color(149, 165, 166));
btnViderProduit.setForeground(Color.WHITE);

panelProduits.add(btnAjouterProduit);
panelProduits.add(btnModifierProduit);
panelProduits.add(btnSupprimerProduit);
panelProduits.add(btnViderProduit);

String[] colonnesProduits = {
    "ID", "Nom", "Description", "Prix", "Quantité", "Catégorie"
};

JTable tableProduits = new JTable(
    new Object[][] {},
    colonnesProduits
);

tableProduits.setRowHeight(25);
tableProduits.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
tableProduits.setFont(new Font("Arial", Font.PLAIN, 13));
tableProduits.setFillsViewportHeight(true);

JScrollPane scrollProduits = new JScrollPane(tableProduits);
scrollProduits.setBounds(20, 180, 840, 320);

panelProduits.add(scrollProduits);


JButton btnAjouter = new JButton("Ajouter");
btnAjouter.setBounds(80, 120, 120, 35);
btnAjouter.setBackground(new Color(46, 204, 113));
btnAjouter.setForeground(Color.WHITE);

JButton btnModifier = new JButton("Modifier");
btnModifier.setBounds(220, 120, 120, 35);
btnModifier.setBackground(new Color(52, 152, 219));
btnModifier.setForeground(Color.WHITE);

JButton btnSupprimer = new JButton("Supprimer");
btnSupprimer.setBounds(360, 120, 120, 35);
btnSupprimer.setBackground(new Color(231, 76, 60));
btnSupprimer.setForeground(Color.WHITE);

JButton btnVider = new JButton("Vider");
btnVider.setBounds(500, 120, 120, 35);
btnVider.setBackground(new Color(149, 165, 166));
btnVider.setForeground(Color.WHITE);

panelCategories.add(btnAjouter);
panelCategories.add(btnModifier);
panelCategories.add(btnSupprimer);
panelCategories.add(btnVider);

String[] colonnesCategories = {
    "ID", "Nom", "Description"
};

JTable tableCategories = new JTable(
    new Object[][] {},
    colonnesCategories
);

tableCategories.setRowHeight(25);
tableCategories.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
tableCategories.setFont(new Font("Arial", Font.PLAIN, 13));
tableCategories.setFillsViewportHeight(true);

JScrollPane scrollCategories = new JScrollPane(tableCategories);
scrollCategories.setBounds(20, 180, 840, 320);

panelCategories.add(scrollCategories);

        onglets.addTab("Catégories", panelCategories);
        onglets.addTab("Produits", panelProduits);

        add(onglets);

        getContentPane().setBackground(new Color(236, 240, 241));
        setVisible(true);
    }

    public static void main(String[] args) {
        new ProduitsForm();
    }
}