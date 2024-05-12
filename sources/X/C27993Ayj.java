package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27993Ayj {
    public final Integer LIZ;
    public final PaymentMethodsData LIZIZ;
    public final PaymentInfo LIZJ;

    public C27993Ayj() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27993Ayj)) {
            return false;
        }
        C27993Ayj c27993Ayj = (C27993Ayj) obj;
        return o.LJ(this.LIZ, c27993Ayj.LIZ) && o.LJ(this.LIZIZ, c27993Ayj.LIZIZ) && o.LJ(this.LIZJ, c27993Ayj.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        PaymentMethodsData paymentMethodsData = this.LIZIZ;
        int hashCode2 = (hashCode + (paymentMethodsData == null ? 0 : paymentMethodsData.hashCode())) * 31;
        PaymentInfo paymentInfo = this.LIZJ;
        return hashCode2 + (paymentInfo != null ? paymentInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentRefreshData(bizType=");
        LIZ.append(this.LIZ);
        LIZ.append(", paymentMethods=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", paymentInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C27993Ayj(Integer num, PaymentMethodsData paymentMethodsData, PaymentInfo paymentInfo) {
        this.LIZ = num;
        this.LIZIZ = paymentMethodsData;
        this.LIZJ = paymentInfo;
    }
}
