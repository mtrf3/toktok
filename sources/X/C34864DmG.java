package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ml.model.PreloadStrategyV2Config;
import defpackage.i0;

/* renamed from: X.DmG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34864DmG {
    public static boolean LIZ;
    public static PreloadStrategyV2Config LIZIZ;
    public static m LIZJ;

    public static PreloadStrategyV2Config LIZ() {
        if (!LIZ) {
            LIZ = true;
            m mVar = (m) i0.LJ(false, "smart_preload_strategy_v2", 31744, m.class, null);
            LIZJ = mVar;
            if (mVar != null) {
                LIZIZ = (PreloadStrategyV2Config) GsonProtectorUtils.fromJson(new Gson(), (j) LIZJ, PreloadStrategyV2Config.class);
            }
        }
        return LIZIZ;
    }
}
