package com.edu.udea.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double resultado , valor1, valor2;
    private boolean operador1, operador2, igual, inicio = true;
    private String tipoOperaciones;
    private TextView Tauxiliar, Tresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tauxiliar = (TextView) findViewById(R.id.Tauxiliar);
        Tresultado = (TextView) findViewById(R.id.Tresultado);
    }

    //Método con las operaciones suma, resta, multiplicacion y división
    private void Operaciones(double valor1, double valor2) {
        //Swich que evalua la variable tipoOperaciones
        switch (tipoOperaciones) {
            //case con la función suma
            case "+":
                resultado = valor1 + valor2;
                Tresultado.setText(resultado + (""));
                valor1 = Double.parseDouble(Tresultado.getText().toString());
                break;

            case "-":
                resultado = valor1 - valor2;
                Tresultado.setText(resultado + (""));
                valor1 = Double.parseDouble(Tresultado.getText().toString());
                break;
            //case con la función multiplicar
            case "*":
                resultado = valor1 * valor2;
                Tresultado.setText(resultado + (""));
                valor1 = Double.parseDouble(Tresultado.getText().toString());
                break;
            //case con la función dividir
            case "/":
                if (valor2 == 0) {
                    Tresultado.setText("Error");
                    break;
                } else {
                    resultado = valor1 / valor2;
                    Tresultado.setText(resultado + (""));
                    valor1 = Double.parseDouble(Tresultado.getText().toString());
                    break;

                }
        }
    }


    //Botones Numericos
    public void BotonCero(View view) {
        if (inicio == true) {
            Tresultado.setText("");
            Tresultado.setText("0");
            inicio = false;
        } else {
            Tresultado.setText(Tresultado.getText() + "0");

        }
    }

    public void BotonUno(View view) {
        if (inicio == true) {
            Tresultado.setText("");
            Tresultado.setText("1");
            inicio = false;
        } else {
            Tresultado.setText(Tresultado.getText() + "1");

        }
    }

    public void BotonDos(View view) {

        if (inicio == true) {
            Tresultado.setText("");
            Tresultado.setText("2");
            inicio = false;
        } else {
            Tresultado.setText(Tresultado.getText() + "2");

        }
    }

    public void BotonTres(View view) {

        if (inicio == true) {
            Tresultado.setText("");
            Tresultado.setText("");
            inicio = false;
        } else {
            Tresultado.setText(Tresultado.getText() + "3");

        }
    }

    public void BotonCuatro(View view) {

        if (inicio == true) {
            Tresultado.setText("");
            Tresultado.setText("4");
            inicio = false;
        } else {
            Tresultado.setText(Tresultado.getText() + "4");

        }
    }

    public void BotonCinco(View view) {

        if (inicio == true) {
            Tresultado.setText("");
            Tresultado.setText("5");
            inicio = false;
        } else {
            Tresultado.setText(Tresultado.getText() + "5");

        }
    }

    public void BotonSeis(View view) {

        if (inicio == true) {
            Tresultado.setText("");
            Tresultado.setText("6");
            inicio = false;
        } else {
            Tresultado.setText(Tresultado.getText() + "6");

        }
    }

    public void BotonSiete(View view) {

        if (inicio == true) {
            Tresultado.setText("");
            Tresultado.setText("7");
            inicio = false;
        } else {
            Tresultado.setText(Tresultado.getText() + "7");

        }
    }

    public void BotonOcho(View view) {

        if (inicio == true) {
            Tresultado.setText("");
            Tresultado.setText("8");
            inicio = false;
        } else {
            Tresultado.setText(Tresultado.getText() + "8");

        }
    }

    public void BotonNueve(View view) {

        if (inicio == true) {
            Tresultado.setText("");
            Tresultado.setText("9");
            inicio = false;
        } else {
            Tresultado.setText(Tresultado.getText() + "9");

        }
    }

    public void BotonPunto(View view) {

        if (".".contains(Tresultado.getText())) {

        } else {
            Tresultado.setText(Tresultado.getText() + ".");
            inicio = false;
        }
    }

    //Botones Operadores

    public void BotonMas(View view) {

        igual = true;
        inicio = true;
        //Condición para la variable operador 1
        if (operador1 = true) {
            valor1 = Double.parseDouble(Tresultado.getText().toString());
            Tauxiliar.setText("");
            Tauxiliar.setText(Tresultado.getText() + ("+"));
            operador1 = false;
        } else {
            //Condición para la variable operador 2
            if (operador2 == true) {
                valor2 = Double.parseDouble(Tresultado.getText().toString());
                Tauxiliar.setText("");
                Tauxiliar.setText(Tresultado.getText() + ("+"));
                operador2 = false;
            } else {
                Tauxiliar.setText(Tresultado.getText() + ("+"));
                Operaciones(resultado, valor2);
            }
        }
        tipoOperaciones = "+";
    }

    public void BotonMenos(View view) {

        igual = true;
        inicio = true;
        //Condición para la variable operador 1
        if (operador1 = true) {
            valor1 = Double.parseDouble(Tresultado.getText().toString());
            Tauxiliar.setText("");
            Tauxiliar.setText(Tresultado.getText() + ("-"));
            operador1 = false;
        } else {
            //Condición para la variable operador 2
            if (operador2 == true) {
                valor2 = Double.parseDouble(Tresultado.getText().toString());
                Tauxiliar.setText("");
                Tauxiliar.setText(Tresultado.getText() + ("-"));
                operador2 = false;
            } else {
                Tauxiliar.setText(Tresultado.getText() + ("-"));
                Operaciones(resultado, valor2);
            }
        }
        tipoOperaciones = "-";
    }

    public void BotonPor(View view) {
        igual = true;
        inicio = true;
        //Condición para la variable operador 1
        if (operador1 = true) {
            valor1 = Double.parseDouble(Tresultado.getText().toString());
            Tauxiliar.setText("");
            Tauxiliar.setText(Tresultado.getText() + ("*"));
            operador1 = false;
        } else {
            //Condición para la variable operador 2
            if (operador2 == true) {
                valor2 = Double.parseDouble(Tresultado.getText().toString());
                Tauxiliar.setText("");
                Tauxiliar.setText(Tresultado.getText() + ("*"));
                operador2 = false;
            } else {
                Tauxiliar.setText(Tresultado.getText() + ("*"));
                Operaciones(resultado, valor2);
            }
        }
        tipoOperaciones = "*";
    }

    public void BotonDivision(View view) {
        igual = true;
        inicio = true;
        //Condición para la variable operador 1
        if (operador1 = true) {
            valor1 = Double.parseDouble(Tresultado.getText().toString());
            Tauxiliar.setText("");
            Tauxiliar.setText(Tresultado.getText() + ("/"));
            operador1 = false;
        } else {
            //Condición para la variable operador 2
            if (operador2 == true) {
                valor2 = Double.parseDouble(Tresultado.getText().toString());
                Tauxiliar.setText("");
                Tauxiliar.setText(Tresultado.getText() + ("/"));
                operador2 = false;
            } else {
                Tauxiliar.setText(Tresultado.getText() + ("/"));
                Operaciones(resultado, valor2);
            }
        }
        tipoOperaciones = "/";
    }

    public void BotonDelete(View view) {
        Tauxiliar.setText("");
        Tresultado.setText("");
    }

    public void igual(View view) {
        inicio=true;
        operador1=true;
        if(igual=true){
            if(tipoOperaciones==null){
            }else{
                valor2 = Double.parseDouble(Tresultado.getText().toString());
                Tauxiliar.setText(Tauxiliar.getText()+Tresultado.getText().toString());
                Operaciones(valor1,valor2);
            }
            igual=false;
        }
        else{
            Tauxiliar.setText("");
            Operaciones(valor1,valor2);
        }
    }


}

