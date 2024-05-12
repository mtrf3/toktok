package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: X.QXj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67159QXj {
    public static final long LIZ = TimeUnit.MINUTES.toMillis(1);
    public static final Object LIZIZ = new Object();
    public static C67158QXi LIZJ;

    public static void LIZ(Context context) {
        if (LIZJ == null) {
            C67158QXi c67158QXi = new C67158QXi(context);
            LIZJ = c67158QXi;
            synchronized (c67158QXi.LIZ) {
                c67158QXi.LJI = true;
            }
        }
    }

    public static void LIZIZ(Intent intent) {
        synchronized (LIZIZ) {
            if (LIZJ != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                LIZJ.LIZJ();
            }
        }
    }

    public static ComponentName LIZJ(Context context, Intent intent) {
        synchronized (LIZIZ) {
            LIZ(context);
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName LLLL = C16880lQ.LLLL(context, intent);
            if (LLLL == null) {
                return null;
            }
            if (!booleanExtra) {
                LIZJ.LIZ(LIZ);
            }
            return LLLL;
        }
    }
}
