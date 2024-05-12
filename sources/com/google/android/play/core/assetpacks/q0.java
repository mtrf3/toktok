package com.google.android.play.core.assetpacks;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class q0 {
    public final Map<String, Double> LIZ = new HashMap();

    public final synchronized void LIZ(String str) {
        ((HashMap) this.LIZ).put(str, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
    }
}
