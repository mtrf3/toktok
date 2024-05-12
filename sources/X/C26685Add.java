package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotionItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Add, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26685Add {
    public final String LIZ;
    public final String LIZIZ;
    public final List<SellerPromotionItem> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26685Add)) {
            return false;
        }
        C26685Add c26685Add = (C26685Add) obj;
        return o.LJ(this.LIZ, c26685Add.LIZ) && o.LJ(this.LIZIZ, c26685Add.LIZIZ) && o.LJ(this.LIZJ, c26685Add.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UsSellerPromotionVO(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", schema=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", promotions=");
        return C1NE.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C26685Add(String str, String str2, List<SellerPromotionItem> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
    }
}
