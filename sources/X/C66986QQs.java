package X;

import Y.ARunnableS22S0300000_11;
import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.QQs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66986QQs implements QRB {
    public static volatile C66986QQs LJ;
    public C66985QQr LIZ;
    public final Context LIZIZ;
    public QOL LIZJ;
    public String LIZLLL;

    @Override // X.QRB
    public final void LIZIZ() {
        QOL qol = this.LIZJ;
        if (qol != null) {
            qol.LIZJ();
        }
    }

    @Override // X.QRB
    public final synchronized void LIZ(QR9 qr9) {
        C66985QQr c66985QQr = this.LIZ;
        if (c66985QQr != null) {
            QOX LIZJ = LIZJ(c66985QQr);
            if (LIZJ != null) {
                QOL qol = this.LIZJ;
                if (qol != null) {
                    qol.LIZ(LIZJ);
                } else {
                    this.LIZJ = QOV.LIZJ(this.LIZIZ, LIZJ, qr9);
                }
            }
        } else {
            QR7 LIZIZ = C66993QQz.LIZ().LIZIZ();
            if (LIZIZ == null) {
                return;
            }
            Context context = this.LIZIZ;
            C66992QQy c66992QQy = new C66992QQy(this, qr9);
            QR0 qr0 = (QR0) LIZIZ;
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                RunnableC39007FSp.LIZIZ(new ARunnableS22S0300000_11(qr0, context, c66992QQy, 11));
            } else {
                qr0.LIZ.LIZJ(context, c66992QQy);
            }
        }
    }

    public final QOX LIZJ(C66985QQr c66985QQr) {
        if (c66985QQr != null && c66985QQr.LIZ()) {
            this.LIZ = c66985QQr;
            HashMap hashMap = new HashMap();
            QRG.LIZIZ().getClass();
            QQO.LIZ().LIZIZ(hashMap);
            String str = (String) hashMap.get("install_id");
            String str2 = (String) hashMap.get("device_id");
            QRR qrr = QRM.LJIIIIZZ.LIZIZ;
            if (qrr == null) {
                return null;
            }
            try {
                QOD qod = new QOD(10006);
                qod.LJ = c66985QQr.LIZ;
                qod.LJIIIIZZ = str2;
                qod.LJIIIZ = str;
                qod.LJFF = c66985QQr.LIZIZ;
                qod.LJII = c66985QQr.LIZJ;
                qod.LJI = 30204;
                List<String> list = c66985QQr.LIZLLL;
                if (list != null) {
                    ((ArrayList) qod.LIZLLL).addAll(list);
                }
                String valueOf = String.valueOf(qrr.LIZIZ);
                if (!C38354F3m.LJ("host_aid")) {
                    ((HashMap) qod.LIZIZ).put("host_aid", valueOf);
                }
                String valueOf2 = String.valueOf(qrr.LIZJ);
                if (!C38354F3m.LJ("host_version")) {
                    ((HashMap) qod.LIZIZ).put("host_version", valueOf2);
                }
                String str3 = this.LIZLLL;
                if (!C38354F3m.LJ("sid")) {
                    ((HashMap) qod.LIZIZ).put("sid", str3);
                }
                return qod.LIZ();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return null;
    }

    public C66986QQs(Context context, String str) {
        this.LIZIZ = context;
        this.LIZLLL = str;
    }
}
