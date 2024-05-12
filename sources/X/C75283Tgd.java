package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Tgd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75283Tgd {
    public static boolean LIZLLL() {
        if (LIZJ(true)) {
            Boolean LIZJ = InterfaceC30442Bx8.r3.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_MULTI_GUEST_SHARED_…RED_DOT_SHOULD_SHOW.value");
            if (LIZJ.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ() {
        EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
        if (LIZJ == EnumC74778TWk.GRID || LIZJ == EnumC74778TWk.GRID_FIX) {
            return true;
        }
        return false;
    }

    public static String LIZ(String str) {
        if (str == null || TextUtils.isEmpty(str) || o.LJ(CardStruct.IStatusCode.DEFAULT, str)) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return str;
    }

    public static boolean LIZJ(boolean z) {
        int intValue;
        if (z) {
            intValue = LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_shared_bg_version");
        } else {
            Integer LIZIZ = U4C.LIZIZ("linkmic_shared_bg_version");
            if (LIZIZ == null) {
                return false;
            }
            intValue = LIZIZ.intValue();
        }
        if (intValue <= 0 || TV3.LJIIJ()) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(String str, String str2, InterfaceC88472Yns interfaceC88472Yns) {
        if (str2 == null || str == null) {
            return;
        }
        C79258V8s.LIZ.LIZIZ(new C31824CeK(str, EnumC31874Cf8.SHARE_EFFECT, null, null, str2, null, false, 3, false, 748), interfaceC88472Yns);
    }
}
