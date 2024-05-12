package X;

import android.accounts.Account;
import android.content.Context;
import defpackage.i0;

/* loaded from: classes9.dex */
public final class JFY {
    public static void LIZ(Context context, C48852JFg c48852JFg, QIF qif) {
        String LIZIZ;
        String LIZIZ2;
        if (c48852JFg.LJLJI) {
            LIZIZ2 = C48847JFb.LIZIZ(c48852JFg, "dp");
        } else {
            if (qif.LJJIIZI) {
                LIZIZ = "device_parameters";
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("device_parameters_");
                LIZ.append(qif.LIZ);
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            LIZIZ2 = C48847JFb.LIZIZ(c48852JFg, LIZIZ);
        }
        if (qif.LJJIFFI) {
            LIZIZ2 = i0.LJFF(LIZIZ2, "_local");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ2);
        LIZ2.append(".dat");
        X1D.LIZIZ(LIZ2);
        JFO jfo = new JFO();
        jfo.LIZ = c48852JFg.LIZ(qif);
        jfo.LIZIZ = qif.LJJIFFI;
        Account account = qif.LJIL;
        String LIZIZ3 = C48847JFb.LIZIZ(c48852JFg, "");
        jfo.LIZJ = account;
        jfo.LIZLLL = LIZIZ3;
        jfo.LJ = qif;
        Object jfn = new JFN(context, jfo);
        QJI qji = (QJI) JFZ.LIZ(QJI.class, qif.LIZ());
        if (qji != null) {
            jfn = qji.LIZJ();
        }
        JFZ.LIZIZ(QKU.class, qif.LIZ(), jfn);
    }
}
