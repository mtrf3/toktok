package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1J {
    public final PaymentMethod LIZ;
    public final boolean LIZIZ;
    public int LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentMethodVO(paymentMethod=");
        LIZ.append(this.LIZ);
        LIZ.append(", need_verify=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", rank=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (System.identityHashCode(this) == System.identityHashCode(obj)) {
            return true;
        }
        return false;
    }

    public B1J(PaymentMethod paymentMethod, boolean z, int i) {
        o.LJIIIZ(paymentMethod, "paymentMethod");
        this.LIZ = paymentMethod;
        this.LIZIZ = z;
        this.LIZJ = i;
    }

    public static B1J LIZ(B1J b1j, PaymentMethod paymentMethod, int i) {
        boolean z;
        if ((i & 1) != 0) {
            paymentMethod = b1j.LIZ;
        }
        int i2 = 0;
        if ((i & 2) != 0) {
            z = b1j.LIZIZ;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            i2 = b1j.LIZJ;
        }
        b1j.getClass();
        o.LJIIIZ(paymentMethod, "paymentMethod");
        return new B1J(paymentMethod, z, i2);
    }
}
