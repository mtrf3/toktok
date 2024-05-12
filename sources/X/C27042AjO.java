package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AjO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27042AjO {
    public final List<C27051AjX> LIZ;
    public final Price LIZIZ;
    public final Price LIZJ;
    public final java.util.Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27042AjO)) {
            return false;
        }
        C27042AjO c27042AjO = (C27042AjO) obj;
        return o.LJ(this.LIZ, c27042AjO.LIZ) && o.LJ(this.LIZIZ, c27042AjO.LIZIZ) && o.LJ(this.LIZJ, c27042AjO.LIZJ) && o.LJ(this.LIZLLL, c27042AjO.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Price price = this.LIZIZ;
        int hashCode2 = (hashCode + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (price2 == null ? 0 : price2.hashCode())) * 31;
        java.util.Map<String, Object> map = this.LIZLLL;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SummaryVO(billItems=");
        LIZ.append(this.LIZ);
        LIZ.append(", total=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", totalDiscount=");
        LIZ.append(this.LIZJ);
        LIZ.append(", daInfo=");
        return C15890jp.LIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C27042AjO(List<C27051AjX> billItems, Price price, Price price2, java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(billItems, "billItems");
        this.LIZ = billItems;
        this.LIZIZ = price;
        this.LIZJ = price2;
        this.LIZLLL = map;
    }
}
