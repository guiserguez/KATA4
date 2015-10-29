/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.util.ArrayList;

/**
 *
 * @author guise
 */
public class MailHistogramBuilder {
    public static Histogram<String> build (ArrayList<String> mailList){
        Histogram<String> histogram = new Histogram<>();
        for (String mail : mailList) {
            Mail domi = new Mail(mail);
            histogram.increment(domi.getDominio());
            //La linea de abajo hace lo mismo que tenemos arriba
            //histogram.increment(new Mail(mail.Dominio()));
        }
        return histogram;
    }
}
