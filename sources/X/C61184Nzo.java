package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.Nzo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61184Nzo {
    public static final C62005OVd LIZ;

    static {
        C16880lQ.LJLLJ(C61184Nzo.class);
        if (Build.VERSION.SDK_INT >= 23) {
            LIZ = new C61183Nzn();
        } else {
            LIZ = new C62005OVd();
        }
    }

    public static int LIZ(Context context) {
        return LIZ.LIZIZ(context);
    }
}
