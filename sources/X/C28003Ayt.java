package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28003Ayt {
    public final PaymentMethod LIZ;
    public final List<PaymentMethod> LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28003Ayt)) {
            return false;
        }
        C28003Ayt c28003Ayt = (C28003Ayt) obj;
        return o.LJ(this.LIZ, c28003Ayt.LIZ) && o.LJ(this.LIZIZ, c28003Ayt.LIZIZ) && o.LJ(this.LIZJ, c28003Ayt.LIZJ) && o.LJ(this.LIZLLL, c28003Ayt.LIZLLL) && this.LJ == c28003Ayt.LJ && this.LJFF == c28003Ayt.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        PaymentMethod paymentMethod = this.LIZ;
        int hashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
        List<PaymentMethod> list = this.LIZIZ;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode4 + i) * 31) + (this.LJFF ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentInfoVO(recommendedPayment=");
        LIZ.append(this.LIZ);
        LIZ.append(", paymentMethodList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", methodsPhotos=");
        LIZ.append(this.LIZJ);
        LIZ.append(", paymentMethodText=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", hasStoredMethod=");
        LIZ.append(this.LJ);
        LIZ.append(", reachable=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C28003Ayt(PaymentMethod paymentMethod, List list, List list2, String str, boolean z) {
        this.LIZ = paymentMethod;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = str;
        this.LJ = z;
    }
}
