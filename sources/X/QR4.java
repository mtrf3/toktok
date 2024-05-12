package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.third.PushManager;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class QR4 {
    public final QR6 LIZ;
    public final QRR LIZIZ;

    public final Pair<String, String> LIZ(int i) {
        C67007QRn LJI = C67007QRn.LJI(QM0.LIZ);
        QRR qrr = this.LIZIZ;
        LJI.getClass();
        if (i == 10) {
            qrr.LJIILJJIL.getClass();
            return new Pair<>(QR5.LIZ, QR5.LIZIZ);
        }
        return null;
    }

    public QR4(QRP qrp, QRR qrr) {
        this.LIZ = qrp;
        this.LIZIZ = qrr;
    }

    public static final void LIZIZ(int i, String str, String str2) {
        StringBuilder LIZ = C06830Op.LIZ("registerSenderFailed: pushType=", i, " ,errorId=", str, " ,msg=");
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
    }

    public final void LIZJ(Context context, int i, String str) {
        if (C36929EeT.LJFF(context)) {
            C66980QQm c66980QQm = new C66980QQm(str, i);
            QRM.LJIIIIZZ().getClass();
            RunnableC39007FSp.LIZIZ(new RunnableC66976QQi(context, c66980QQm));
        }
        if (((PushOnlineSettings) PT6.LIZ(QM0.LIZ, PushOnlineSettings.class)).LJIJ() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("forbid set alias. pushType = ");
            LIZ.append(i);
            LIZ.append(", token = ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            return;
        }
        Application application = QM0.LIZ;
        QRG.LIZIZ().getClass();
        QQO LIZ2 = QQO.LIZ();
        LIZ2.getClass();
        HashMap hashMap = new HashMap();
        LIZ2.LIZIZ(hashMap);
        String str2 = (String) hashMap.get("device_id");
        if (!TextUtils.isEmpty(str2)) {
            QR6 qr6 = this.LIZ;
            Context LLLLL = C16880lQ.LLLLL(application);
            qr6.getClass();
            PushManager.inst().setAlias(LLLLL, str2, i);
        }
    }
}
