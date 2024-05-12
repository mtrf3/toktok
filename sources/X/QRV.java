package X;

import android.app.Application;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class QRV {
    public static QRR LIZ() {
        QRU qru = new QRU();
        qru.LIZ = EF7.LJIIIZ;
        qru.LJFF = EF7.LIZ();
        qru.LJ = EF7.LJIILIIL;
        qru.LIZLLL = (int) EF7.LJFF();
        qru.LIZIZ = (int) EF7.LJI();
        qru.LIZJ = EF7.LJII();
        QRW qrw = new QRW((Application) EF7.LIZIZ(), qru);
        qrw.LIZIZ = false;
        qrw.LJIILL = true;
        qrw.LJIILJJIL = new QTE();
        new C06420Na();
        qrw.LIZJ = FCD.LIZ(EF7.LIZIZ());
        qrw.LIZLLL = new QS6("");
        qrw.LJIIJ = new HHB();
        qrw.LJI = new C67019QRz();
        qrw.LJFF = new R39();
        qrw.LJIIIIZZ = new C47956Irw();
        QQZ qqz = new QQZ();
        if (!((ArrayList) qrw.LJ).contains(qqz)) {
            ((ArrayList) qrw.LJ).add(qqz);
        }
        qrw.LJIIJJI = new V52();
        QRU qru2 = qrw.LJIILIIL;
        if (qru2 == null) {
            qrw.LIZ("appinfo is null");
        } else {
            if (qru2.LIZ <= 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" aid {");
                LIZ.append(qru2.LIZ);
                LIZ.append("} is invalid");
                qrw.LIZ(X1D.LIZIZ(LIZ));
            }
            if (TextUtils.isEmpty(qru2.LJFF)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("appName {");
                LIZ2.append(qru2.LJFF);
                LIZ2.append("} is invalid");
                qrw.LIZ(X1D.LIZIZ(LIZ2));
            }
            if (TextUtils.isEmpty(qru2.LIZJ)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("versionName {");
                LIZ3.append(qru2.LIZJ);
                LIZ3.append("} is invalid");
                qrw.LIZ(X1D.LIZIZ(LIZ3));
            }
            if (qru2.LIZIZ <= 0) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("versionCode {");
                LIZ4.append(qru2.LIZIZ);
                LIZ4.append("} is invalid");
                qrw.LIZ(X1D.LIZIZ(LIZ4));
            }
            if (qru2.LIZLLL <= 0) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("updateVersionCode {");
                LIZ5.append(qru2.LIZLLL);
                LIZ5.append("} is invalid");
                qrw.LIZ(X1D.LIZIZ(LIZ5));
            }
            if (TextUtils.isEmpty(qru2.LJ)) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("channel {");
                LIZ6.append(qru2.LJ);
                LIZ6.append("} is invalid");
                qrw.LIZ(X1D.LIZIZ(LIZ6));
            }
        }
        if (qrw.LJFF == null) {
            qrw.LIZ("please implement the event callback");
        }
        if (qrw.LJIIJ == null) {
            qrw.LIZ("click event listener is null, you'll not receive the event when user click notifications.Please implement it.");
        }
        if (TextUtils.isEmpty(qrw.LIZJ)) {
            qrw.LIZJ = FCD.LIZ(qrw.LIZ);
        }
        if (qrw.LJII == null) {
            qrw.LJII = new C62819Ol5(0);
        }
        if (qrw.LJIIIZ == null) {
            qrw.LJIIIZ = new C63933P7h();
        }
        if (qrw.LJIIL == null) {
            qrw.LJIIL = new C43001GuD();
        }
        if (qrw.LJIILJJIL == null) {
            qrw.LJIILJJIL = new QTD();
        }
        C64319PMd c64319PMd = new C64319PMd(qrw.LJI, qrw.LJIIIZ);
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("debuggable = ");
        LIZ7.append(qrw.LIZIZ);
        X1D.LIZIZ(LIZ7);
        if (qrw.LIZIZ) {
            QRU qru3 = qrw.LJIILIIL;
            if (qru3 != null) {
                qru3.toString();
            }
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("process:\t");
            LIZ8.append(qrw.LIZJ);
            X1D.LIZIZ(LIZ8);
        }
        return new QRR(qrw.LIZ, qrw.LJIILIIL, qrw.LIZIZ, qrw.LIZJ, qrw.LIZLLL, qrw.LJ, qrw.LJFF, c64319PMd, qrw.LJII, qrw.LJIIIIZZ, qrw.LJIIJ, qrw.LJIIJJI, qrw.LJIILJJIL, qrw);
    }
}
