package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* renamed from: X.Q6k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66458Q6k {
    public static final C66461Q6n LIZ = C66461Q6n.LJ("safe_mode_v2_status");

    public static synchronized C66459Q6l LIZ() {
        C66459Q6l c66459Q6l;
        synchronized (C66458Q6k.class) {
            try {
                c66459Q6l = (C66459Q6l) new Gson().LJI(LIZ.LIZJ("protected_activity_result", ""), C66459Q6l.class);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                c66459Q6l = null;
            }
        }
        return c66459Q6l;
    }

    public static synchronized void LIZIZ(boolean z) {
        synchronized (C66458Q6k.class) {
            LIZ.LIZ.edit().putBoolean("last_operator_is_clean", z).apply();
        }
    }

    public static synchronized void LIZJ(C66459Q6l c66459Q6l) {
        synchronized (C66458Q6k.class) {
            LIZ.LJII("protected_activity_result", GsonProtectorUtils.toJson(new Gson(), c66459Q6l, C66459Q6l.class));
        }
    }
}
