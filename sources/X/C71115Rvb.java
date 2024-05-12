package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.VoucherInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rvb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71115Rvb implements InterfaceC74132vZ {
    public final /* synthetic */ C71113RvZ LIZ;

    public C71115Rvb(C71113RvZ c71113RvZ) {
        this.LIZ = c71113RvZ;
    }

    @Override // X.InterfaceC74132vZ
    public final void LIZ(long j) {
        Long l;
        Long l2;
        String str;
        this.LIZ.LJ(false);
        Room room = this.LIZ.LIZIZ;
        String str2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        Room room2 = this.LIZ.LIZIZ;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        } else {
            l2 = null;
        }
        String valueOf2 = String.valueOf(l2);
        VoucherInfo voucherInfo = this.LIZ.LJIIIZ;
        if (voucherInfo != null) {
            str = voucherInfo.voucherId;
            str2 = voucherInfo.voucherTypeId;
        } else {
            str = null;
        }
        String role = EnumC71217RxF.AUDIENCE.toString();
        o.LJIIIZ(role, "role");
        LinkedHashMap LIZIZ = JF1.LIZIZ("author_id", valueOf, "room_id", valueOf2);
        if (str == null || ujb.o.LJJJJJL(str)) {
            str = "-1";
        }
        LIZIZ.put("coupon_id", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZIZ.put("coupon_type_id", str2);
        LIZIZ.put("duration", String.valueOf(j));
        LIZIZ.put("live_role", role);
        C48658J7u.LIZ("rd_tiktokec_live_pop_coupon_card_show_duration", LIZIZ);
    }
}
