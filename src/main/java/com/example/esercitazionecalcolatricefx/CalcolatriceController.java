package com.example.esercitazionecalcolatricefx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Objects;

public class CalcolatriceController {
    @FXML
    private Label displayLabel;
    private boolean flgSostituisci = true;
    private double operando1;
    private double operando2;
    private String tipoOp;
    private String tipoOp2;
    private double numMemoria;

    private boolean isUguale = false; //tipoOp = "=";

    @FXML
    protected void on1Click(){
        if (flgSostituisci){
            displayLabel.setText("1");
            flgSostituisci = false;
        }else {

            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "1";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("1");
                flgSostituisci = false;
            }

        }

    }

    @FXML
    protected void on2Click(){
        if (flgSostituisci){
            displayLabel.setText("2");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "2";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("2");
                flgSostituisci = false;
            }
        }

    }

    @FXML
    protected void on3Click(){
        if (flgSostituisci){
            displayLabel.setText("3");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "3";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("3");
                flgSostituisci = false;
            }
        }

    }

    @FXML
    protected void on4Click(){
        if (flgSostituisci){
            displayLabel.setText("4");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "4";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("4");
                flgSostituisci = false;
            }
        }
    }

    @FXML
    protected void on5Click(){
        if (flgSostituisci){
            displayLabel.setText("5");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "5";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("5");
                flgSostituisci = false;
            }
        }
    }

    @FXML
    protected void on6Click(){
        if (flgSostituisci){
            displayLabel.setText("6");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "6";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("6");
                flgSostituisci = false;
            }
        }
    }

    @FXML
    protected void on7Click(){
        if (flgSostituisci){
            displayLabel.setText("7");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "7";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("7");
                flgSostituisci = false;
            }
        }
    }

    @FXML
    protected void on8Click(){
        if (flgSostituisci){
            displayLabel.setText("8");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "8";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("8");
                flgSostituisci = false;
            }
        }
    }

    @FXML
    protected void on9Click(){
        if (flgSostituisci){
            displayLabel.setText("9");
            flgSostituisci = false;
        }else {
            if (!Objects.equals(displayLabel.getText(), "0")) {
                String dispString = displayLabel.getText() + "9";
                displayLabel.setText(dispString);
            }else{
                displayLabel.setText("9");
                flgSostituisci = false;
            }
        }
    }

    @FXML
    protected void on0Click(){
        if (flgSostituisci){

                displayLabel.setText("0");
                flgSostituisci = false;


        }else {
            String dispString = displayLabel.getText() + "0";
            displayLabel.setText(dispString);
        }
    }

    @FXML
    protected void onMenoClick(){
        String strOperando1 = displayLabel.getText();
        operando1 = Double.parseDouble(strOperando1);
        flgSostituisci = true;
        tipoOp = "-";
        tipoOp2 = "-";
    }

    @FXML
    protected void onPerClick(){
        String strOperando1 = displayLabel.getText();
        operando1 = Double.parseDouble(strOperando1);
        flgSostituisci = true;
        tipoOp = "*";
        tipoOp2 = "*";
    }

    @FXML
    protected void onDivisoClick(){
        String strOperando1 = displayLabel.getText();
        operando1 = Double.parseDouble(strOperando1);
        flgSostituisci = true;
        tipoOp = "/";
        tipoOp2 = "/";
    }

    @FXML
    protected void onVirgolaClick(){ //la virgola viene riconosciuta come punto
        if (!displayLabel.getText().contains(".")) { //se la stringa non contiene la virgola, la mette, sennò non la mette
            String primaVirgola = displayLabel.getText() + ".";
            //operando1 = Double.parseDouble(primaVirgola);
            flgSostituisci = false;
            displayLabel.setText(primaVirgola);

        }
    }

    @FXML
    protected void onPiuClick(){
        String strOperando1 = displayLabel.getText();
        operando1 = Double.parseDouble(strOperando1);
        flgSostituisci = true;
        tipoOp = "+";
        tipoOp2 = "+";
    }

    @FXML
    protected void onPercentoClick(){
        String strOperando1 = displayLabel.getText();
        operando1 = Double.parseDouble(strOperando1);
        flgSostituisci = true;
        tipoOp = "%";
    }

    @FXML
    protected void onUgualeClick(){

        if (isUguale){
            double result = Double.parseDouble(displayLabel.getText());
            result = result + operando2;
            displayLabel.setText(String.valueOf(result));
        }else {
            isUguale = true;
            String strOperando2 = displayLabel.getText();
            operando2 = Double.parseDouble(strOperando2);
            flgSostituisci = true;
            String strSomma;

            switch (tipoOp) {
                case "+" -> {
                    strSomma = String.valueOf(operando1 + operando2);
                    displayLabel.setText(strSomma);
                    tipoOp = null;
                }
                case "-" -> {
                    if (operando2 < 0){
                        //System.out.println("operando2 = " + operando2);
                        operando2 = -operando2;
                        strSomma = String.valueOf(operando1 + operando2);
                    }else{
                        strSomma = String.valueOf(operando1 - operando2);
                    }
                    displayLabel.setText(strSomma);
                    tipoOp = null;
                }
                case "*" -> {
                    strSomma = String.valueOf(operando1 * operando2);
                    displayLabel.setText(strSomma);
                    tipoOp = null;
                }
                case "/" -> {
                    strSomma = String.valueOf(operando1 / operando2);
                    displayLabel.setText(strSomma);
                    tipoOp = null;
                }
                case "%" -> {
                    switch (tipoOp2) {
                        case "+" -> {
                            strSomma = String.valueOf(operando1 + (operando1 * operando2) / 100);
                            displayLabel.setText(strSomma);
                            //tipoOp = null;
                        }
                        case "-" -> {
                            strSomma = String.valueOf(operando1 - (operando1 * operando2) / 100);
                            displayLabel.setText(strSomma);
                            //tipoOp = null;
                        }
                        case "*" -> {
                            strSomma = String.valueOf((operando1 * operando2) / 100);
                            displayLabel.setText(strSomma);
                            //tipoOp = null;
                        }
                        case "/" -> {
                            strSomma = String.valueOf(operando1 * (100 / operando2));
                            displayLabel.setText(strSomma);
                            //tipoOp = null;
                        }
                    }
                    tipoOp = null;
                }
            }
        }

    }

    private static String removeLastChar(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceFirst(".$", "");
    }

    @FXML
    protected void delete1char(){

        String dispString = displayLabel.getText();
        displayLabel.setText(removeLastChar((dispString)));
    }

    @FXML
    protected void deleteOperando(){ //CE

        if (tipoOp!=null){

            operando2=0;
            displayLabel.setText("0");
        }else {
            operando1=0;
            displayLabel.setText("0");
        }
    }

    @FXML
    protected void deleteTutto(){ //C

        operando1 = 0;
        operando2 = 0;

        displayLabel.setText("0");
        isUguale=false;
    }

    @FXML
    protected void onMSclick(){


        numMemoria = Double.parseDouble(displayLabel.getText());
    }

    @FXML
    protected void onMRclick(){

        if (numMemoria != 0) {
            if (operando1==0){
                operando1 = numMemoria;
                displayLabel.setText(String.valueOf(operando1));
            }else{
                operando2 = numMemoria;
                displayLabel.setText(String.valueOf(operando2));
            }
        }

    }

    @FXML
    protected void onMplusClick(){

        double numeroDaAggiungere = Double.parseDouble(displayLabel.getText());
        numMemoria = numMemoria + numeroDaAggiungere;
    }

    @FXML
    protected void onMmenoClick(){

        double numeroDaSottrarre = Double.parseDouble(displayLabel.getText());
        numMemoria = numMemoria - numeroDaSottrarre;
    }

    @FXML
    protected void onMclearClick(){
        if (numMemoria!=0){
            numMemoria = 0;
        }
    }

    @FXML
    protected void onFrazioneClick(){

        double numeroFrazione = Double.parseDouble(displayLabel.getText());
        displayLabel.setText(String.valueOf(1/numeroFrazione));
    }

    @FXML
    protected void onQuadratoClick(){

        double numeroQuadrato = Double.parseDouble(displayLabel.getText());
        displayLabel.setText(String.valueOf(numeroQuadrato*numeroQuadrato));
    }

    @FXML
    protected void onRadiceClick(){

        double numeroRadice = Double.parseDouble(displayLabel.getText());
        if (numeroRadice > 0){
            displayLabel.setText(String.valueOf(Math.sqrt(numeroRadice)));
        }else {
            displayLabel.setText("0");
        }


    }

    @FXML
    protected void onChangeSignClick(){

        double numero = Double.parseDouble(displayLabel.getText());
        numero = -numero;
        displayLabel.setText(String.valueOf(numero));
    }

}

/*

- MS --> salvare il numero in memoria
- MR --> caricarlo nell'operazione corrente
- M+ --> aggiungere il numero sul display a ciò che sta in memoria
- M- --> sottrarre il numero sul display da ciò che sta in memoria
- MC --> cancella la memoria

Quindi il numero in memoria sarò solo 1.
Il numero verrà aggioranto se si cilcca su M+ e M-
Se la stringa sul display è vuota o 0, il numero verrà caricato nell'operazione
Se verrà cliccato su MC il numero verrà cancellato dalla memoria

 */