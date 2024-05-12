package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimSuccessEvent;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AyA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27958AyA<T> implements InterfaceC64592gB {
    public final /* synthetic */ C27954Ay6 LJLIL;
    public final /* synthetic */ HashMap<String, Object> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C68322mC<Throwable> LJLJJL;

    public C27958AyA(C27954Ay6 c27954Ay6, HashMap<String, Object> hashMap, boolean z, boolean z2, C68322mC<Throwable> c68322mC) {
        this.LJLIL = c27954Ay6;
        this.LJLILLLLZI = hashMap;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = c68322mC;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        BillInfoData billInfoData;
        BillInfoData billInfoData2;
        BillInfoData billInfoData3;
        List<Voucher> autoVouchers;
        BillInfoResponse billInfoResponse = (BillInfoResponse) obj;
        C36746EbW.LIZ(4, "doOnNext");
        if (billInfoResponse != null && (billInfoData3 = (BillInfoData) billInfoResponse.data) != null && (autoVouchers = billInfoData3.getAutoVouchers()) != null) {
            C26059AKp.LIZ().LIZ("ec_vouchers_claim_success_event", C27739Aud.LJI(new CouponClaimSuccessEvent(C27739Aud.LJI(autoVouchers))));
        }
        C27954Ay6 c27954Ay6 = this.LJLIL;
        BillInfoResponse billInfoResponse2 = c27954Ay6.LJLJL;
        String str = null;
        if (billInfoResponse2 != null) {
            BillInfoData billInfoData4 = (BillInfoData) billInfoResponse2.data;
            if (billInfoData4 != null) {
                billInfoData = billInfoData4.mergeChunk((BillInfoData) billInfoResponse.data);
            } else {
                billInfoData = null;
            }
            int i = billInfoResponse.code;
            if (i == 0) {
                BillInfoResponse billInfoResponse3 = this.LJLIL.LJLJL;
                if (billInfoResponse3 != null) {
                    i = billInfoResponse3.code;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (!TextUtils.isEmpty(billInfoResponse.message) || (billInfoResponse = this.LJLIL.LJLJL) != null) {
                billInfoResponse = new BillInfoResponse(i, billInfoResponse.message, billInfoData);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        c27954Ay6.LJLJL = billInfoResponse;
        C27954Ay6 c27954Ay62 = this.LJLIL;
        BillInfoResponse billInfoResponse4 = c27954Ay62.LJLJL;
        if (billInfoResponse4 != null && (billInfoData2 = (BillInfoData) billInfoResponse4.data) != null) {
            HashMap<String, Object> hashMap = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            boolean z2 = this.LJLJJI;
            C68322mC<Throwable> c68322mC = this.LJLJJL;
            Integer LIZJ = C27964AyG.LIZJ(billInfoData2);
            String LIZ = C27964AyG.LIZ(billInfoData2);
            C27949Ay1 c27949Ay1 = C27949Ay1.LIZ;
            C27949Ay1.LIZIZ(LIZJ, LIZ);
            if (o.LJ(billInfoData2.getLastChunk(), Boolean.TRUE)) {
                C27949Ay1.LJII = SystemClock.elapsedRealtime() - C27949Ay1.LJI;
                C27954Ay6.LLLZL(hashMap, c27954Ay62.LJLJL, z, z2);
                BillInfoResponse billInfoResponse5 = c27954Ay62.LJLJL;
                Boolean valueOf = Boolean.valueOf(z2);
                Throwable th = c68322mC.element;
                if (th != null) {
                    str = th.getMessage();
                }
                c27949Ay1.LJJJJI(billInfoResponse5, valueOf, str);
            }
        }
    }
}
