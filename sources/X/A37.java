package X;

import com.ss.android.ugc.aweme.model.PaidCollectionPaymentResponse;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A37 implements C33Q {
    public final AbstractC72932td<PaidCollectionPaymentResponse> LJLIL;
    public final AbstractC72932td<C25597A2v> LJLILLLLZI;
    public final A4L LJLJI;
    public final Boolean LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final int LJLJL;
    public final String LJLJLJ;

    public A37() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A37)) {
            return false;
        }
        A37 a37 = (A37) obj;
        return o.LJ(this.LJLIL, a37.LJLIL) && o.LJ(this.LJLILLLLZI, a37.LJLILLLLZI) && o.LJ(this.LJLJI, a37.LJLJI) && o.LJ(this.LJLJJI, a37.LJLJJI) && this.LJLJJL == a37.LJLJJL && this.LJLJJLL == a37.LJLJJLL && this.LJLJL == a37.LJLJL && o.LJ(this.LJLJLJ, a37.LJLJLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LJLJI.hashCode() + C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31)) * 31;
        Boolean bool = this.LJLJJI;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        boolean z = this.LJLJJL;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        if (!this.LJLJJLL) {
            i2 = 0;
        }
        return this.LJLJLJ.hashCode() + ((((i4 + i2) * 31) + this.LJLJL) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentDetailPurchaseState(orderResponse=");
        LIZ.append(this.LJLIL);
        LIZ.append(", purchaseStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", priceStatus=");
        LIZ.append(this.LJLJI);
        LIZ.append(", hasRefund=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", shouldBlockUIFromRefund=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", hasSubmittedRating=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", ratingValue=");
        LIZ.append(this.LJLJL);
        LIZ.append(", webPaymentPrice=");
        return q.LIZIZ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ A37(int r10) {
        /*
            r9 = this;
            X.33X r1 = X.C33X.LIZ
            X.A4L r3 = new X.A4L
            r5 = 0
            r3.<init>(r5)
            r4 = 0
            java.lang.String r8 = ""
            r0 = r9
            r2 = r1
            r6 = r5
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A37.<init>(int):void");
    }

    public A37(AbstractC72932td<PaidCollectionPaymentResponse> orderResponse, AbstractC72932td<C25597A2v> purchaseStatus, A4L priceStatus, Boolean bool, boolean z, boolean z2, int i, String webPaymentPrice) {
        o.LJIIIZ(orderResponse, "orderResponse");
        o.LJIIIZ(purchaseStatus, "purchaseStatus");
        o.LJIIIZ(priceStatus, "priceStatus");
        o.LJIIIZ(webPaymentPrice, "webPaymentPrice");
        this.LJLIL = orderResponse;
        this.LJLILLLLZI = purchaseStatus;
        this.LJLJI = priceStatus;
        this.LJLJJI = bool;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = i;
        this.LJLJLJ = webPaymentPrice;
    }

    public static A37 LIZ(A37 a37, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, A4L a4l, Boolean bool, boolean z, boolean z2, int i, String str, int i2) {
        String webPaymentPrice = str;
        int i3 = i;
        AbstractC72932td purchaseStatus = abstractC72932td2;
        AbstractC72932td orderResponse = abstractC72932td;
        A4L priceStatus = a4l;
        Boolean bool2 = bool;
        boolean z3 = z;
        boolean z4 = z2;
        if ((i2 & 1) != 0) {
            orderResponse = a37.LJLIL;
        }
        if ((i2 & 2) != 0) {
            purchaseStatus = a37.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            priceStatus = a37.LJLJI;
        }
        if ((i2 & 8) != 0) {
            bool2 = a37.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            z3 = a37.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            z4 = a37.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            i3 = a37.LJLJL;
        }
        if ((i2 & 128) != 0) {
            webPaymentPrice = a37.LJLJLJ;
        }
        a37.getClass();
        o.LJIIIZ(orderResponse, "orderResponse");
        o.LJIIIZ(purchaseStatus, "purchaseStatus");
        o.LJIIIZ(priceStatus, "priceStatus");
        o.LJIIIZ(webPaymentPrice, "webPaymentPrice");
        return new A37(orderResponse, purchaseStatus, priceStatus, bool2, z3, z4, i3, webPaymentPrice);
    }
}
