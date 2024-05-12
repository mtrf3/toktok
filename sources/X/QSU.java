package X;

import com.bytedance.push.settings.PushOnlineSettings;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QSU {
    public static volatile InterfaceC67020QSa LIZ;

    public static void LIZ(String str, String str2, int i, JSONObject jSONObject) {
        if (((PushOnlineSettings) PT6.LIZ(QM0.LIZ, PushOnlineSettings.class)).LJIILL() <= 0) {
            if (LIZ == null) {
                synchronized (QSU.class) {
                    if (LIZ == null) {
                        QSW qsw = new QSW();
                        qsw.LIZ = QM0.LIZ;
                        QRM.LJIIIIZZ.LIZ.getClass();
                        qsw.LIZLLL = QSB.LIZ();
                        qsw.LIZIZ = "push";
                        qsw.LIZJ = "3.2.4-alpha.29";
                        qsw.LJ = 1;
                        LIZ = QSX.LIZ(qsw.LIZ());
                    }
                }
            }
            LIZ.LIZ(str, str2, i, jSONObject);
        }
    }
}
