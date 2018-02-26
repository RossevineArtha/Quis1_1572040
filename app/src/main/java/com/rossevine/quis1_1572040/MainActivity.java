package com.rossevine.quis1_1572040;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.Stack;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    EditText txtUtama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        txtUtama = findViewById(R.id.editText2);
    }
    @OnClick(R.id.button)
    public void buttonClearOnClick(){

        txtUtama.setText("");
    }
    @OnClick(R.id.button2)
    public void buttonDeleteOnClick(){
        String isiTxtUtama = txtUtama.getText().toString();
        String sekarang =  isiTxtUtama.substring(0,isiTxtUtama.length()-1);
        txtUtama.setText(sekarang);
    }
    @OnClick(R.id.button3)
    public void buttonTujuhOnClick(){
        String sekarang = txtUtama.getText().toString();
        txtUtama.setText(sekarang+"7");
    }
    @OnClick(R.id.button4)
    public void buttonDelapanOnClick(){
        String sekarang = txtUtama.getText().toString();
        txtUtama.setText(sekarang+"8");
    }
    @OnClick(R.id.button5)
    public void buttonSembilanOnClick(){
        String sekarang = txtUtama.getText().toString();
        txtUtama.setText(sekarang+"9");
    }
    @OnClick(R.id.button6)
    public void buttonBagiOnClick(){
        String sekarang = txtUtama.getText().toString();
        float total;
        if(sekarang.contains("+")){
            int indekOp = sekarang.indexOf("+");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1+angka2;
            sekarang=String.valueOf(total);
            sekarang+="/";
        }
        else if(sekarang.contains("-")&& sekarang.indexOf("-")!=0){
            int indekOp = sekarang.indexOf("-");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1-angka2;
            sekarang=String.valueOf(total);
            sekarang+="/";
        }
        else if(sekarang.contains("*")){
            int indekOp = sekarang.indexOf("*");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1*angka2;
            sekarang=String.valueOf(total);
            sekarang+="/";
        }
        else if(sekarang.contains("/")){
            int indekOp = sekarang.indexOf("/");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1/angka2;
            sekarang=String.valueOf(total);

        }
        else{
            sekarang+="/";
        }
        txtUtama.setText(sekarang);
    }
    @OnClick(R.id.button7)
    public void buttonEmpatOnClick(){
        String sekarang = txtUtama.getText().toString();
        txtUtama.setText(sekarang+"4");
    }
    @OnClick(R.id.button8)
    public void buttonLimaOnClick(){
        String sekarang = txtUtama.getText().toString();
        txtUtama.setText(sekarang+"5");
    }
    @OnClick(R.id.button9)
    public void buttonEnamOnClick(){
        String sekarang = txtUtama.getText().toString();
        txtUtama.setText(sekarang+"6");
    }
    @OnClick(R.id.button10)
    public void buttonKaliOnClick(){
        String sekarang = txtUtama.getText().toString();
        Float total;
        if(sekarang.contains("+")){
            int indekOp = sekarang.indexOf("+");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1+angka2;
            sekarang=String.valueOf(total);
            sekarang+="*";
        }
        else if(sekarang.contains("-")){
            int indekOp = sekarang.indexOf("-");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1-angka2;
            sekarang=String.valueOf(total);
            sekarang+="*";
        }
        else if(sekarang.contains("*")){
            int indekOp = sekarang.indexOf("*");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1*angka2;
            sekarang=String.valueOf(total);

        }
        else if(sekarang.contains("/")){
            int indekOp = sekarang.indexOf("/");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1/angka2;
            sekarang=String.valueOf(total);
            sekarang+="*";
        }
        else{
            sekarang+="*";
        }
        txtUtama.setText(sekarang);
    }
    @OnClick(R.id.button11)
    public void buttonSatuOnClick(){
        String sekarang = txtUtama.getText().toString();
        txtUtama.setText(sekarang+"1");
    }
    @OnClick(R.id.button12)
    public void buttonDuaOnClick(){
        String sekarang = txtUtama.getText().toString();
        txtUtama.setText(sekarang+"2");
    }
    @OnClick(R.id.button13)
    public void buttonTigaOnClick(){
        String sekarang = txtUtama.getText().toString();
        txtUtama.setText(sekarang+"3");

    }
    @OnClick(R.id.button14)
    public void buttonKurangOnClick(){
        String sekarang = txtUtama.getText().toString();
        Float total;
        if(sekarang.contains("+")){
            int indekOp = sekarang.indexOf("+");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1+angka2;
            sekarang=String.valueOf(total);
            sekarang+="-";
        }
        else if(sekarang.contains("-")){
            int indekOp = sekarang.indexOf("-");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1-angka2;
            sekarang=String.valueOf(total);

        }
        else if(sekarang.contains("*")){
            int indekOp = sekarang.indexOf("*");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1*angka2;
            sekarang=String.valueOf(total);
            sekarang+="-";
        }
        else if(sekarang.contains("/")){
            int indekOp = sekarang.indexOf("/");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1/angka2;
            sekarang=String.valueOf(total);
            sekarang+="-";
        }
        else{
            sekarang+="-";
        }
        txtUtama.setText(sekarang);
    }
    @OnClick(R.id.button15)
    public void buttonKomaOnClick(){
        String sekarang = txtUtama.getText().toString();
        sekarang+=".";
        int index = sekarang.indexOf(".");
        if (sekarang.charAt(0) == '.') {
            sekarang = '0'+sekarang;sekarang+=".";
        }
        else if(sekarang.charAt(index-1)=='+'||sekarang.charAt(index-1)=='/'||sekarang.charAt(index-1)=='*'||sekarang.charAt(index-1)=='-'){
            sekarang='0'+sekarang;
            sekarang+=".";
        }
        else{
            sekarang+=".";
        }
        txtUtama.setText(sekarang);
    }
    @OnClick(R.id.button16)
    public void buttonNolOnClick(){
        String sekarang = txtUtama.getText().toString();
        txtUtama.setText(sekarang+"0");
    }
    @OnClick(R.id.button17)
    public void buttonHasilSamaDenganOnClick(){
        String isiDariTxtUtama=txtUtama.getText().toString().trim();
        System.out.println(isiDariTxtUtama.charAt(0));
        if (isiDariTxtUtama.charAt(0) == '+' || isiDariTxtUtama.charAt(0) == '-' || isiDariTxtUtama.charAt(0) == '*' || isiDariTxtUtama.charAt(0) == '/'  ) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Tolong Masukkan Angka Terlebih dahulu");

            builder.show();
        }
        else{

        }


    }
    @OnClick(R.id.button18)
    public void buttonTambahOnClick(){
        String sekarang = txtUtama.getText().toString();
        Float total;
        if(sekarang.contains("+")){
            int indekOp = sekarang.indexOf("+");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
             total = angka1+angka2;
            sekarang=String.valueOf(total);
        }
        else if(sekarang.contains("-")){
            int indekOp = sekarang.indexOf("-");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1-angka2;
            sekarang=String.valueOf(total);
            sekarang+="+";
        }
        else if(sekarang.contains("*")){
            int indekOp = sekarang.indexOf("*");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1*angka2;
            sekarang=String.valueOf(total);
            sekarang+="+";
        }
        else if(sekarang.contains("/")){
            int indekOp = sekarang.indexOf("/");
            Float angka1 = Float.valueOf(sekarang.substring(0,indekOp));
            Float angka2 = Float.valueOf(sekarang.substring(indekOp+1,sekarang.length()));
            total = angka1/angka2;
            sekarang=String.valueOf(total);
            sekarang+="+";
        }
        else{
            sekarang+="+";
        }
        txtUtama.setText(sekarang);
    }
}
