package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* renamed from: X.TRm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74650TRm {
    public static boolean LIZ;

    public static boolean LIZ() {
        int intValue;
        if (LIZ) {
            intValue = LiveAbLabelSetting.INSTANCE.getIntValue("live_linkmic_enable_state_consistency");
        } else {
            Integer LIZIZ = U4C.LIZIZ("live_linkmic_enable_state_consistency");
            if (LIZIZ == null) {
                return false;
            }
            intValue = LIZIZ.intValue();
        }
        if ((intValue & 1) != 1) {
            return false;
        }
        return true;
    }
}
