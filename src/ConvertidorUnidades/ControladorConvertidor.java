package ConvertidorUnidades;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class ControladorConvertidor {

    private final JButton btnIntercambiar;
    private final JComboBox<String> cmbFinal;
    private final JComboBox<String> cmbInicio;
    private final JSpinner spnVal;
    private final JTextField txtResultado;

    public ControladorConvertidor(JComboBox<String> cmbInicio, JComboBox<String> cmbFinal,
                                   JSpinner spnVal, JTextField txtResultado,
                                   JButton btnIntercambiar) {
        this.cmbInicio = cmbInicio;
        this.cmbFinal = cmbFinal;
        this.spnVal = spnVal;
        this.txtResultado = txtResultado;
        this.btnIntercambiar = btnIntercambiar;
        configurarControlador();
    }

    private void configurarControlador() {
        spnVal.addChangeListener(e -> calcular());
        cmbInicio.addActionListener(e -> calcular());
        cmbFinal.addActionListener(e -> calcular());

        btnIntercambiar.addActionListener(e -> {
            Object temp = cmbInicio.getSelectedItem();
            cmbInicio.setSelectedItem(cmbFinal.getSelectedItem());
            cmbFinal.setSelectedItem(temp);
        });

        calcular();
    }

    private void calcular() {
        try {
            double valor = Double.parseDouble(spnVal.getValue().toString());
            String origen = cmbInicio.getSelectedItem().toString();
            String destino = cmbFinal.getSelectedItem().toString();
            double resultado = temperatura.convertir(valor, origen, destino);
            txtResultado.setText(String.format("%.2f", resultado));
        } catch (Exception ex) {
            txtResultado.setText("Error, valor inváSlido.");
        }
    }
}