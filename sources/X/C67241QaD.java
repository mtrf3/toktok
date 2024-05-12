package X;

import android.app.NotificationManager;
import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.QaD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67241QaD {
    public static final C67241QaD LIZ = new C67241QaD();
    public static final C67244QaG LIZIZ = C67244QaG.LJLIL;
    public static final C67242QaE LIZJ = C67242QaE.LJLIL;
    public static final C67243QaF LIZLLL = C67243QaF.LJLIL;
    public static NotificationManager LJ;
    public static int LJFF;
    public static int LJI;

    public static NotificationManager LIZ(Context context) {
        NotificationManager notificationManager = LJ;
        if (notificationManager == null) {
            Object LLILL = C16880lQ.LLILL(context, "notification");
            o.LJII(LLILL, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager2 = (NotificationManager) LLILL;
            LJ = notificationManager2;
            return notificationManager2;
        }
        return notificationManager;
    }
}
