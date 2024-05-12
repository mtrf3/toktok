package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Ag7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26839Ag7 implements InterfaceC27632Asu {
    public final Integer LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI = EnumC27721AuL.REVIEW.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26839Ag7)) {
            return false;
        }
        C26839Ag7 c26839Ag7 = (C26839Ag7) obj;
        return o.LJ(this.LJLIL, c26839Ag7.LJLIL) && o.LJ(this.LJLILLLLZI, c26839Ag7.LJLILLLLZI);
    }

    public final int hashCode() {
        Integer num = this.LJLIL;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalShopReviewTitleVO(reviewCount=");
        LIZ.append(this.LJLIL);
        LIZ.append(", reviewCountStr=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJI;
    }

    public C26839Ag7(Integer num, String str) {
        this.LJLIL = num;
        this.LJLILLLLZI = str;
    }
}
