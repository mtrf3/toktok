package X;

import Y.AfS67S0100000_15;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.paidcontent.api.PaidCollectionReviewDetailApi;

/* renamed from: X.XwE, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86442XwE {
    public final InterfaceC86443XwF LIZ;
    public final long LIZIZ;
    public final int LIZJ = 20;
    public final int LIZLLL = 10;
    public boolean LJ;
    public long LJFF;

    public final void LIZ(boolean z) {
        int i;
        if (!this.LJ) {
            this.LJ = true;
            if (z) {
                this.LJFF = 0L;
            }
            PaidCollectionReviewDetailApi.LIZ.getClass();
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
            PaidCollectionReviewDetailApi paidCollectionReviewDetailApi = (PaidCollectionReviewDetailApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, PaidCollectionReviewDetailApi.class);
            long j = this.LIZIZ;
            long j2 = this.LJFF;
            if (j2 == 0) {
                i = this.LIZJ;
            } else {
                i = this.LIZLLL;
            }
            paidCollectionReviewDetailApi.request(j, j2, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJ(new AfS67S0100000_15(this, 57)).LJJJLIIL(new AfS67S0100000_15(this, 58), new AfS67S0100000_15(this, 59));
        }
    }

    public C86442XwE(C25580A2e c25580A2e, long j) {
        this.LIZ = c25580A2e;
        this.LIZIZ = j;
    }
}
