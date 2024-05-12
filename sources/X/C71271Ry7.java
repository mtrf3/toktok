package X;

import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ry7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71271Ry7 implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final List<PromotionLogo> LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71271Ry7)) {
            return false;
        }
        C71271Ry7 c71271Ry7 = (C71271Ry7) obj;
        return o.LJ(this.LJLIL, c71271Ry7.LJLIL) && o.LJ(this.LJLILLLLZI, c71271Ry7.LJLILLLLZI) && o.LJ(this.LJLJI, c71271Ry7.LJLJI) && o.LJ(this.LJLJJI, c71271Ry7.LJLJJI) && o.LJ(this.LJLJJL, c71271Ry7.LJLJJL) && o.LJ(this.LJLJJLL, c71271Ry7.LJLJJLL) && o.LJ(this.LJLJL, c71271Ry7.LJLJL) && o.LJ(this.LJLJLJ, c71271Ry7.LJLJLJ) && this.LJLJLLL == c71271Ry7.LJLJLLL && this.LJLL == c71271Ry7.LJLL;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public C71271Ry7() {
        this("", "", "", "", null, "", "", "", 0, -1);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31);
        List<PromotionLogo> list = this.LJLJJL;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((C79062V1e.LJ(this.LJLJLJ, C79062V1e.LJ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, (LJ + hashCode) * 31, 31), 31), 31) + this.LJLJLLL) * 31) + this.LJLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductListItem(productId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", coverUrl=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", coverUrlKey=");
        LIZ.append(this.LJLJI);
        LIZ.append(", title=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", promotionLogos=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", formatOriginPrice=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", formatAvailablePrice=");
        LIZ.append(this.LJLJL);
        LIZ.append(", price=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", platform=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", index=");
        return b0.LIZJ(LIZ, this.LJLL, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C71271Ry7)) {
            return false;
        }
        C71271Ry7 c71271Ry7 = (C71271Ry7) interfaceC57784Mm4;
        if (c71271Ry7.LJLIL.length() <= 0 || !o.LJ(c71271Ry7.LJLIL, this.LJLIL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C71271Ry7)) {
            return false;
        }
        C71271Ry7 c71271Ry7 = (C71271Ry7) interfaceC57784Mm4;
        if (c71271Ry7.LJLIL.length() <= 0 || !o.LJ(c71271Ry7.LJLIL, this.LJLIL)) {
            return false;
        }
        return true;
    }

    public C71271Ry7(String productId, String coverUrl, String coverUrlKey, String title, List<PromotionLogo> list, String formatOriginPrice, String formatAvailablePrice, String price, int i, int i2) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(coverUrl, "coverUrl");
        o.LJIIIZ(coverUrlKey, "coverUrlKey");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(formatOriginPrice, "formatOriginPrice");
        o.LJIIIZ(formatAvailablePrice, "formatAvailablePrice");
        o.LJIIIZ(price, "price");
        this.LJLIL = productId;
        this.LJLILLLLZI = coverUrl;
        this.LJLJI = coverUrlKey;
        this.LJLJJI = title;
        this.LJLJJL = list;
        this.LJLJJLL = formatOriginPrice;
        this.LJLJL = formatAvailablePrice;
        this.LJLJLJ = price;
        this.LJLJLLL = i;
        this.LJLL = i2;
    }
}
