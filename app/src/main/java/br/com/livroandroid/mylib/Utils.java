package br.com.livroandroid.mylib;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ricardo on 11/01/15.
 */
public class Utils {
    public static String hello() {
        return "Hello World from Lib 0.0.3";
    }

    public static void toast(Context context, String msg) {
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
