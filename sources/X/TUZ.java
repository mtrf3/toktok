package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* loaded from: classes14.dex */
public final class TUZ {
    public static boolean LIZ() {
        if (LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_gifter_priority_v2") == 1 && !TV3.LJIIJ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        Integer LIZIZ = U4C.LIZIZ("multi_guest_gifter_priority_v2");
        if (LIZIZ == null || LIZIZ.intValue() != 1 || TV3.LJIIJ()) {
            return false;
        }
        return true;
    }
}
