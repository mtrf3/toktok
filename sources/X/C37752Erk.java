package X;

import com.bytedance.lynx.hybrid.settings.HybridSettings;
import org.json.JSONObject;

/* renamed from: X.Erk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37752Erk {
    public static final int LIZ;

    static {
        Object LIZ2;
        int i;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("resource_prefetch_config");
            if (config != null) {
                LIZ2 = Integer.valueOf(config.optInt("resource_prefetch_thread_priority"));
            } else {
                LIZ2 = null;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Integer num = (Integer) (C3C5.m12isFailureimpl(LIZ2) ? null : LIZ2);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 5;
        }
        LIZ = i;
    }
}
