package X;

import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CnW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32394CnW {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(Gift gift, Long l) {
        if (l == null) {
            if (gift == null) {
                return 0L;
            }
            return gift.primaryEffectId;
        }
        if (gift == null) {
            return 0L;
        }
        List<GiftColorInfo> list = gift.colorInfos;
        if (list != null) {
            for (GiftColorInfo giftColorInfo : list) {
                if (o.LJ(l, giftColorInfo.colorId)) {
                    Long l2 = giftColorInfo.colorEffectId;
                    o.LJIIIIZZ(l2, "colorInfo.colorEffectId");
                    return l2.longValue();
                }
            }
        }
        return gift.primaryEffectId;
    }

    public static long LIZIZ(Gift gift, Long l, Long l2) {
        Long valueOf;
        if (l2 == null) {
            if (l != null) {
                return l.longValue();
            }
            if (gift == null || (valueOf = Long.valueOf(gift.primaryEffectId)) == null) {
                return 0L;
            }
            return valueOf.longValue();
        }
        if (gift != null) {
            List<GiftColorInfo> list = gift.colorInfos;
            if (list != null) {
                for (GiftColorInfo giftColorInfo : list) {
                    if (o.LJ(l2, giftColorInfo.colorId)) {
                        Long l3 = giftColorInfo.colorEffectId;
                        o.LJIIIIZZ(l3, "colorInfo.colorEffectId");
                        return l3.longValue();
                    }
                }
            }
            if (l != null) {
                return l.longValue();
            }
            return gift.primaryEffectId;
        }
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }
}
