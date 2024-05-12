package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BillingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ays, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28002Ays {
    public final Boolean LIZ;
    public final PaymentInfo LIZIZ;
    public final CopyOnWriteArrayList<PaymentMethod> LIZJ;
    public final List<PaymentMethod> LIZLLL;
    public final List<PaymentMethod> LJ;
    public final List<String> LJFF;
    public final String LJI;
    public final BillingAddressData LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28002Ays)) {
            return false;
        }
        C28002Ays c28002Ays = (C28002Ays) obj;
        return o.LJ(this.LIZ, c28002Ays.LIZ) && o.LJ(this.LIZIZ, c28002Ays.LIZIZ) && o.LJ(this.LIZJ, c28002Ays.LIZJ) && o.LJ(this.LIZLLL, c28002Ays.LIZLLL) && o.LJ(this.LJ, c28002Ays.LJ) && o.LJ(this.LJFF, c28002Ays.LJFF) && o.LJ(this.LJI, c28002Ays.LJI) && o.LJ(this.LJII, c28002Ays.LJII);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        PaymentInfo paymentInfo = this.LIZIZ;
        int hashCode2 = (hashCode + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31;
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = this.LIZJ;
        int hashCode3 = (hashCode2 + (copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.hashCode())) * 31;
        List<PaymentMethod> list = this.LIZLLL;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<PaymentMethod> list2 = this.LJ;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.LJFF;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.LJI;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        BillingAddressData billingAddressData = this.LJII;
        return hashCode7 + (billingAddressData != null ? billingAddressData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentInfoListVO(isSelectedPaymentInfoFromOSP=");
        LIZ.append(this.LIZ);
        LIZ.append(", selectedPaymentInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", recommendPaymentMethodList=");
        LIZ.append(this.LIZJ);
        LIZ.append(", paymentMethodList=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", storedPaymentMethodList=");
        LIZ.append(this.LJ);
        LIZ.append(", methodsPhotos=");
        LIZ.append(this.LJFF);
        LIZ.append(", paymentMethodText=");
        LIZ.append(this.LJI);
        LIZ.append(", billingAddress=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C28002Ays(Boolean bool, PaymentInfo paymentInfo, CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList, List<PaymentMethod> list, List<PaymentMethod> list2, List<String> list3, String str, BillingAddressData billingAddressData) {
        this.LIZ = bool;
        this.LIZIZ = paymentInfo;
        this.LIZJ = copyOnWriteArrayList;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = list3;
        this.LJI = str;
        this.LJII = billingAddressData;
    }
}
