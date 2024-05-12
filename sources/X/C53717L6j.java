package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import defpackage.e1;
import java.util.HashMap;

/* renamed from: X.L6j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53717L6j {
    public static C53717L6j LIZLLL;
    public final long LIZ = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
    public final long LIZIZ = 86400000;
    public final java.util.Map<String, Long> LIZJ = new HashMap();

    public static C53717L6j LIZ() {
        if (LIZLLL == null) {
            synchronized (C53717L6j.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C53717L6j();
                }
            }
        }
        return LIZLLL;
    }

    public final boolean LIZIZ(String str) {
        if (e1.LIZ(31744, "creative_tools_effect_platform_caching", true, false) && ((HashMap) this.LIZJ).containsKey(str) && System.currentTimeMillis() <= ((Long) ((HashMap) this.LIZJ).get(str)).longValue()) {
            return true;
        }
        return false;
    }

    public final void LIZJ(String str) {
        if (e1.LIZ(31744, "creative_tools_effect_platform_caching", true, false)) {
            if (str.equals("default") || str.equals("trending") || str.equals("editingeffect")) {
                ((HashMap) this.LIZJ).put(str, Long.valueOf(System.currentTimeMillis() + this.LIZ));
            } else {
                ((HashMap) this.LIZJ).put(str, Long.valueOf(System.currentTimeMillis() + this.LIZIZ));
            }
        }
    }
}
