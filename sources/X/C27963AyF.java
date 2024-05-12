package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AyF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27963AyF {
    public final BillInfoData LIZ;
    public final boolean LIZIZ;
    public final java.util.Map<String, List<MainOrderInfo>> LIZJ;
    public final List<ShopOrderNew> LIZLLL;
    public final boolean LJ;
    public final PaymentMethod LJFF;
    public final boolean LJI;
    public final CopyOnWriteArrayList<PaymentMethod> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27963AyF)) {
            return false;
        }
        C27963AyF c27963AyF = (C27963AyF) obj;
        return o.LJ(this.LIZ, c27963AyF.LIZ) && this.LIZIZ == c27963AyF.LIZIZ && o.LJ(this.LIZJ, c27963AyF.LIZJ) && o.LJ(this.LIZLLL, c27963AyF.LIZLLL) && this.LJ == c27963AyF.LJ && o.LJ(this.LJFF, c27963AyF.LJFF) && this.LJI == c27963AyF.LJI && o.LJ(this.LJII, c27963AyF.LJII);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GenerateDataParams(bill=");
        LIZ.append(this.LIZ);
        LIZ.append(", hasAddress=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", unavailableMainOrders=");
        LIZ.append(this.LIZJ);
        LIZ.append(", availableShopOrder=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", addressChanged=");
        LIZ.append(this.LJ);
        LIZ.append(", recommendedPayment=");
        LIZ.append(this.LJFF);
        LIZ.append(", hasStoredMethod=");
        LIZ.append(this.LJI);
        LIZ.append(", recommendedPayments=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZLLL, C12400eC.LIZ(this.LIZJ, (hashCode2 + i2) * 31, 31), 31);
        boolean z2 = this.LJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (LIZIZ + i3) * 31;
        PaymentMethod paymentMethod = this.LJFF;
        int i5 = 0;
        if (paymentMethod == null) {
            hashCode = 0;
        } else {
            hashCode = paymentMethod.hashCode();
        }
        int i6 = (i4 + hashCode) * 31;
        if (!this.LJI) {
            i = 0;
        }
        int i7 = (i6 + i) * 31;
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = this.LJII;
        if (copyOnWriteArrayList != null) {
            i5 = copyOnWriteArrayList.hashCode();
        }
        return i7 + i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27963AyF(BillInfoData bill, boolean z, java.util.Map<String, ? extends List<MainOrderInfo>> map, List<ShopOrderNew> list, boolean z2, PaymentMethod paymentMethod, boolean z3, CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList) {
        o.LJIIIZ(bill, "bill");
        this.LIZ = bill;
        this.LIZIZ = z;
        this.LIZJ = map;
        this.LIZLLL = list;
        this.LJ = z2;
        this.LJFF = paymentMethod;
        this.LJI = z3;
        this.LJII = copyOnWriteArrayList;
    }
}
