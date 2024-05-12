package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEffectExpV2Asia;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEffectExpV2NonAsia;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestStickerExceptRegionList;
import com.bytedance.android.livesdkapi.host.IHostUser;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.BXw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28952BXw {
    public static boolean LIZ() {
        InterfaceC06390Mx LIZ = CN1.LIZ(IHostUser.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        String currentRegionCode = ((IHostUser) LIZ).getCurrentRegionCode();
        o.LJIIIIZZ(currentRegionCode, "service<IHostUser>().currentRegionCode");
        String lowerCase = currentRegionCode.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String[] asiaRegionList = MultiGuestStickerExceptRegionList.getAsiaRegionList();
        boolean LJJIJIIJIL = ORY.LJJIJIIJIL(lowerCase, asiaRegionList);
        if ((MultiGuestEffectExpV2NonAsia.useNewEffect() && !LJJIJIIJIL) || asiaRegionList.length == 0) {
            return true;
        }
        if (MultiGuestEffectExpV2Asia.useNewEffect() && LJJIJIIJIL) {
            return true;
        }
        return false;
    }
}
