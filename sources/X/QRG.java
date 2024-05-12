package X;

import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

/* loaded from: classes12.dex */
public final class QRG {
    public static QRG LIZ;

    public static QRG LIZIZ() {
        if (LIZ == null) {
            synchronized (QRG.class) {
                if (LIZ == null) {
                    LIZ = new QRG();
                }
            }
        }
        return LIZ;
    }

    public static LocalSettings LIZJ() {
        return (LocalSettings) PT6.LIZ(QM0.LIZ, LocalSettings.class);
    }

    public static PushOnlineSettings LIZLLL() {
        return (PushOnlineSettings) PT6.LIZ(QM0.LIZ, PushOnlineSettings.class);
    }

    public QRG() {
        PushMultiProcessSharedProvider.LIZLLL(QM0.LIZ);
    }

    public static boolean LIZ() {
        return LIZLLL().LJJIII().LIZ;
    }

    public static boolean LJ() {
        if (LIZJ().LJIIIIZZ() && LIZLLL().LJII()) {
            return true;
        }
        return false;
    }
}
