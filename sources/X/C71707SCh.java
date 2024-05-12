package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.SCh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71707SCh extends AbstractC71736SDk {
    public final PaymentMethod LIZ;
    public final PaymentMethod LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71707SCh)) {
            return false;
        }
        C71707SCh c71707SCh = (C71707SCh) obj;
        return o.LJ(this.LIZ, c71707SCh.LIZ) && o.LJ(this.LIZIZ, c71707SCh.LIZIZ);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LIZ;
        int hashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
        PaymentMethod paymentMethod2 = this.LIZIZ;
        return hashCode + (paymentMethod2 != null ? paymentMethod2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentChange(newPayment=");
        LIZ.append(this.LIZ);
        LIZ.append(", oldPayment=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C71707SCh(PaymentMethod paymentMethod, PaymentMethod paymentMethod2) {
        this.LIZ = paymentMethod;
        this.LIZIZ = paymentMethod2;
    }
}
