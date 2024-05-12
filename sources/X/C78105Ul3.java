package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Ul3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78105Ul3 {
    public static boolean LIZ(EnumC78089Ukn enumC78089Ukn) {
        o.LJIIIZ(enumC78089Ukn, "<this>");
        if (LiveMultiHostGiftTrayOptSetting.INSTANCE.isTinyGiftTray() && enumC78089Ukn == EnumC78089Ukn.MULTI_HOST_SMALL) {
            return true;
        }
        return false;
    }
}
