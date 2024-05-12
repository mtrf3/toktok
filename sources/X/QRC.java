package X;

import Y.ARunnableS14S0201000_11;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.push.PushBody;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class QRC implements InterfaceC39118FWw {
    public final C64319PMd LIZ;
    public final R39 LIZIZ;
    public final HHB LIZJ;
    public final QRR LJFF;
    public final List<Long> LJ = new ArrayList();
    public final Q9N LIZLLL = new Q9N();

    public static String LIZLLL() {
        InterfaceC66999QRf interfaceC66999QRf = QRM.LJIIIIZZ.LIZIZ.LJIJJ;
        if (interfaceC66999QRf != null) {
            String secUid = interfaceC66999QRf.getSecUid();
            if (!TextUtils.isEmpty(secUid)) {
                return secUid;
            }
            return "";
        }
        return "";
    }

    public final void LIZJ() {
        try {
            QRI LIZLLL = QRI.LIZLLL(this.LJFF.LIZ);
            QRG.LIZIZ().getClass();
            LIZLLL.LIZJ(QRG.LIZLLL().LJJIII().LIZJ);
        } catch (Throwable unused) {
        }
    }

    public QRC(QRR qrr) {
        this.LIZ = qrr.LJIIL;
        this.LIZIZ = qrr.LJIIJJI;
        this.LIZJ = qrr.LJIILLIIL;
        this.LJFF = qrr;
    }

    public static boolean LJFF(String str) {
        InterfaceC66999QRf interfaceC66999QRf = QRM.LJIIIIZZ.LIZIZ.LJIJJ;
        if (interfaceC66999QRf == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, LIZLLL())) {
            return true;
        }
        List<String> LIZIZ = interfaceC66999QRf.LIZIZ();
        if (LIZIZ == null || !LIZIZ.contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean LJII(PushBody pushBody) {
        InterfaceC66999QRf interfaceC66999QRf;
        if (TextUtils.isEmpty(pushBody.targetSecUid) || (interfaceC66999QRf = QRM.LJIIIIZZ.LIZIZ.LJIJJ) == null || !pushBody.needFilterMsgByUid || TextUtils.equals(interfaceC66999QRf.getSecUid(), pushBody.targetSecUid)) {
            return false;
        }
        return true;
    }

    public final boolean LIZ(PushBody pushBody) {
        QRG.LIZIZ().getClass();
        if (!QRG.LIZLLL().LJJIII().LIZ) {
            return false;
        }
        return QRI.LIZLLL(this.LJFF.LIZ).LIZIZ(pushBody.rid64);
    }

    public final boolean LIZIZ(int i, PushBody pushBody) {
        QRG.LIZIZ().getClass();
        if (!QRG.LIZLLL().LJJIII().LIZ || pushBody.expire_time <= 0 || System.currentTimeMillis() / 1000 <= pushBody.expire_time) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cur body ");
        LIZ.append(pushBody);
        LIZ.append(" is expire time, from ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        try {
            ARunnableS14S0201000_11 aRunnableS14S0201000_11 = new ARunnableS14S0201000_11(i, pushBody, this, 12);
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                RunnableC39007FSp.LIZIZ(aRunnableS14S0201000_11);
            } else {
                aRunnableS14S0201000_11.run();
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:10|(2:43|(11:46|(1:48)|13|(5:15|16|17|(1:19)(1:22)|20)|24|(1:27)|28|29|30|31|(1:39)(3:35|36|37))(1:45))|12|13|(0)|24|(1:27)|28|29|30|31|(2:33|39)(1:40)) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QRC.LJ(int, java.lang.String):void");
    }

    public final void LJI(int i, PushBody pushBody, boolean z) {
        QRE qre = new QRE(this, pushBody, i, z);
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            RunnableC39007FSp.LIZIZ(qre);
        } else {
            qre.run();
        }
        RunnableC39007FSp.LIZIZ(new C66972QQe(i, pushBody));
    }
}
