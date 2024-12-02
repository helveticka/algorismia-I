package View;

import java.awt.event.ActionListener;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Harpo Joan i Juan José Marí
 * 
 * Classe que conté la logica de tota la finestra principal
 */
public class MainWindow extends javax.swing.JFrame {

    private final ChessBoardPanel tauler;

    public MainWindow() {
        initComponents();
        tauler = (ChessBoardPanel) T;
    }

    public void attachActionLister(ActionListener actionListener) {
        this.btn_compute.setActionCommand("compute");
        this.btn_compute.addActionListener(actionListener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        T = new ChessBoardPanel(8);
        panel_options = new javax.swing.JPanel();
        cb_piece = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lb_piece = new javax.swing.JLabel();
        btn_compute = new javax.swing.JButton();
        panel_options1 = new javax.swing.JPanel();
        sp_filaInicial = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        sp_columnaInicial = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chess");
        setResizable(false);

        T.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout TLayout = new javax.swing.GroupLayout(T);
        T.setLayout(TLayout);
        TLayout.setHorizontalGroup(
                TLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 601, Short.MAX_VALUE)
        );
        TLayout.setVerticalGroup(
                TLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 634, Short.MAX_VALUE)
        );

        cb_piece.addItem("Knight");
        cb_piece.addItem("Queen");
        cb_piece.addItem("King");
        cb_piece.addItem("Pawn");
        cb_piece.addItem("Rook");
        cb_piece.addItem("Bishop");

        jLabel2.setText("Select Piece:");

        lb_piece.setText("Piece");

        javax.swing.GroupLayout panel_optionsLayout = new javax.swing.GroupLayout(panel_options);
        panel_options.setLayout(panel_optionsLayout);
        panel_optionsLayout.setHorizontalGroup(
                panel_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_optionsLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(lb_piece)
                                        .addComponent(cb_piece, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(426, 426, 426))
                        .addGroup(panel_optionsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_optionsLayout.setVerticalGroup(
                panel_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_optionsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_piece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_piece)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addContainerGap())
        );

        btn_compute.setBackground(new java.awt.Color(19, 16, 200));
        btn_compute.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btn_compute.setForeground(new java.awt.Color(242, 242, 242));
        btn_compute.setText("Compute");

        sp_filaInicial.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel3.setText("Fila Inicial");

        sp_columnaInicial.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel4.setText("Columna inicial");

        javax.swing.GroupLayout panel_options1Layout = new javax.swing.GroupLayout(panel_options1);
        panel_options1.setLayout(panel_options1Layout);
        panel_options1Layout.setHorizontalGroup(
                panel_options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_options1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_options1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(77, 77, 77)
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(panel_options1Layout.createSequentialGroup()
                                                .addComponent(sp_columnaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sp_filaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        panel_options1Layout.setVerticalGroup(
                panel_options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_options1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sp_columnaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sp_filaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(panel_options, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(16, 16, 16))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(btn_compute, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(41, 41, 41)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(panel_options1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(panel_options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_options1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_compute))
                                        .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel T;
    javax.swing.JButton btn_compute;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenu jMenu2;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JLabel lb_piece;
    javax.swing.JPanel panel_options;
    javax.swing.JPanel panel_options1;
    javax.swing.JComboBox cb_piece;
    javax.swing.JSpinner sp_columnaInicial;
    javax.swing.JSpinner sp_filaInicial;
    // End of variables declaration//GEN-END:variables

    public void desactivarBotones() {
        btn_compute.setEnabled(false);
        sp_columnaInicial.setEnabled(false);
        sp_filaInicial.setEnabled(false);
        cb_piece.setEnabled(false);
    }

    public void activarBotones() {
        btn_compute.setEnabled(true);
        sp_columnaInicial.setEnabled(true);
        sp_filaInicial.setEnabled(true);
        cb_piece.setEnabled(true);
    }

    public void setMaximoSpFilaInicial(int max) {
        sp_filaInicial.setModel(new SpinnerNumberModel(0, 0, 7, 1));
    }

    public void setMaximoSpColumnaInicial(int max) {
        sp_columnaInicial.setModel(new SpinnerNumberModel(0, 0, 7, 1));
    }

    public int getValorSpFila() {
        return (int) sp_filaInicial.getValue();
    }

    public int getValorSpColumna() {
        return (int) sp_columnaInicial.getValue();
    }

    public String getValorCbPiece() {
        return (String) cb_piece.getSelectedItem();
    }
    
    public void colocaPeces(CellDrawable[][] pecesColocades) {
        for (int i = 0; i < pecesColocades.length; i++) {

            CellDrawable[] fila = pecesColocades[i];

            for (int j = 0; j < fila.length; j++) {

                CellDrawable piece = fila[j];

                if (piece != null) {
                    tauler.printPiece(j, i, piece);
                }
            }
        }
    }

    public void reset() {
        tauler.resetBoard();
    }
}