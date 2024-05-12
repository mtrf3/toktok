package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ag6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26838Ag6 implements InterfaceC27632Asu {
    public final Integer LJLIL;
    public final String LJLILLLLZI;
    public final List<ReviewFilterStruct> LJLJI;
    public final int LJLJJI = EnumC27721AuL.REVIEW.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26838Ag6)) {
            return false;
        }
        C26838Ag6 c26838Ag6 = (C26838Ag6) obj;
        return o.LJ(this.LJLIL, c26838Ag6.LJLIL) && o.LJ(this.LJLILLLLZI, c26838Ag6.LJLILLLLZI) && o.LJ(this.LJLJI, c26838Ag6.LJLJI);
    }

    public final int hashCode() {
        Integer num = this.LJLIL;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ReviewFilterStruct> list = this.LJLJI;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpShopReviewTitleVO(reviewCount=");
        LIZ.append(this.LJLIL);
        LIZ.append(", reviewCountStr=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", reviewFilters=");
        return C1NE.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJJI;
    }

    public C26838Ag6(Integer num, String str, List<ReviewFilterStruct> list) {
        this.LJLIL = num;
        this.LJLILLLLZI = str;
        this.LJLJI = list;
    }
}
