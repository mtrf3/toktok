package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199177rl implements XGE<C199087rc> {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199177rl)) {
            return false;
        }
        C199177rl c199177rl = (C199177rl) obj;
        return o.LJ(this.LJLIL, c199177rl.LJLIL) && o.LJ(this.LJLILLLLZI, c199177rl.LJLILLLLZI) && this.LJLJI == c199177rl.LJLJI && o.LJ(this.LJLJJI, c199177rl.LJLJJI);
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return new C57332Mem(2, 1000L, true);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31) + this.LJLJI) * 31;
        String str = this.LJLJJI;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DoPoiReviewInteractMutation(poiId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", reviewId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", interaction=");
        LIZ.append(this.LJLJI);
        LIZ.append(", serverParam=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r10, X.InterfaceC67352kd<? super X.C199087rc> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C199227rq
            if (r0 == 0) goto L41
            r8 = r11
            X.7rq r8 = (X.C199227rq) r8
            int r2 = r8.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r8.LJLJI = r2
        L12:
            java.lang.Object r3 = r8.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJI
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L47
            X.C141335gf.LIZJ(r3)
        L20:
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r3
            X.7rc r0 = new X.7rc
            r0.<init>(r3)
            return r0
        L28:
            java.lang.Class<com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi> r0 = com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.class
            java.lang.Object r3 = X.C05L.LIZIZ(r3, r10, r0)
            com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi r3 = (com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi) r3
            java.lang.String r4 = r9.LJLIL
            java.lang.String r5 = r9.LJLILLLLZI
            int r6 = r9.LJLJI
            java.lang.String r7 = r9.LJLJJI
            r8.LJLJI = r1
            java.lang.Object r3 = r3.doPoiReviewInteract(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L20
            return r2
        L41:
            X.7rq r8 = new X.7rq
            r8.<init>(r9, r11)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199177rl.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C199177rl(String poiId, String reviewId, int i, String str) {
        o.LJIIIZ(poiId, "poiId");
        o.LJIIIZ(reviewId, "reviewId");
        this.LJLIL = poiId;
        this.LJLILLLLZI = reviewId;
        this.LJLJI = i;
        this.LJLJJI = str;
    }
}
