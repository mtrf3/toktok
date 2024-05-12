package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpCouponsViewHolder;
import kotlin.jvm.internal.AqS12S1201000_12;
import kotlin.jvm.internal.AqS162S0100000_12;

/* renamed from: X.RlP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC70483RlP implements Runnable {
    public final /* synthetic */ C70469RlB LJLIL;
    public final /* synthetic */ Voucher LJLILLLLZI;
    public final /* synthetic */ PdpCouponsViewHolder LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public RunnableC70483RlP(C70469RlB c70469RlB, Voucher voucher, PdpCouponsViewHolder pdpCouponsViewHolder, String str, int i) {
        this.LJLIL = c70469RlB;
        this.LJLILLLLZI = voucher;
        this.LJLJI = pdpCouponsViewHolder;
        this.LJLJJI = str;
        this.LJLJJL = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            X6V.LIZIZ(this.LJLIL, new AqS162S0100000_12(this.LJLILLLLZI, 364), new AqS12S1201000_12(this.LJLJI, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, 0));
        } finally {
            if (LIZ) {
            }
        }
    }
}
