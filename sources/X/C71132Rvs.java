package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.OrderEntranceApi;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Rvs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71132Rvs {
    public static final Keva LIZ;
    public static final TradeEntranceInfo LIZIZ;

    static {
        TradeEntranceInfo tradeEntranceInfo;
        Keva keva = Keva.getRepo("ec_order_center_entrance_infos");
        LIZ = keva;
        o.LJIIIIZZ(keva, "keva");
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C79057V0z.LJJIFFI(keva, LIZIZ()), C65330PkU.LIZJ(C65352Pkq.LIZLLL(TradeEntranceInfo.class)));
            if (!(fromJson instanceof TradeEntranceInfo)) {
                fromJson = null;
            }
            tradeEntranceInfo = (TradeEntranceInfo) fromJson;
        } catch (s e) {
            C78983UzD.LJIIZILJ(e);
        }
        if (tradeEntranceInfo == null) {
            tradeEntranceInfo = new TradeEntranceInfo(null, null, null, null, null, null, null, null, 255, null);
        }
        LIZIZ = tradeEntranceInfo;
    }

    public static String LIZIZ() {
        String uid = ((RBX) HG3.LJIILL()).getCurUserId();
        if (uid == null || uid.length() == 0) {
            return "unknown";
        }
        o.LJIIIIZZ(uid, "uid");
        return uid;
    }

    public static void LIZ(String str) {
        Keva keva = LIZ;
        o.LJIIIIZZ(keva, "keva");
        C79057V0z.LJJJJJ(keva, LIZIZ(), C27739Aud.LJI(new TradeEntranceInfo(null, null, str, null, null, null, null, null, 251, null)));
    }

    public static void LIZJ(InterfaceC88472Yns interfaceC88472Yns) {
        OrderEntranceApi.LIZ.getClass();
        ((OrderEntranceApi) C71131Rvr.LIZIZ.create(OrderEntranceApi.class)).getEntranceInfo().LJJL(T16.LIZ()).LIZ(new RYF(interfaceC88472Yns));
    }
}
