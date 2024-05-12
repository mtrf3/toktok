package X;

import Y.ARunnableS0S3100000_6;
import Y.ARunnableS7S1100000_6;
import android.os.Handler;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Dzc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35692Dzc implements M6Y {
    public static final C35692Dzc LIZJ = new C35692Dzc();
    public static final java.util.Map<String, String> LIZLLL = E2C.LIZJ("push_cold_start", "enter_deep_link_activity_v2");
    public final HashMap<String, HashMap<String, String>> LIZ = new HashMap<>();
    public final HashMap<String, Boolean> LIZIZ = new HashMap<>();

    @Override // X.M6Y
    public final void LIZ() {
        Handler LIZ = C15610jN.LIZ();
        if (LIZ != null) {
            LIZ.post(new ARunnableS7S1100000_6(this, 9));
        }
    }

    @Override // X.M6Y
    public final void LIZIZ(String str) {
        LIZJ(str, String.valueOf(System.currentTimeMillis()));
    }

    @Override // X.M6Y
    public final void LIZJ(String key, String time) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(time, "time");
        Handler LIZ = C15610jN.LIZ();
        if (LIZ != null) {
            LIZ.post(new ARunnableS0S3100000_6(key, this, time, 0));
        }
    }
}
