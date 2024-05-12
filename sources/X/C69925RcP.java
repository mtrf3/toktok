package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RcP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69925RcP implements InterfaceC27632Asu {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final LinkRichText LJLJI;
    public final String LJLJJI;
    public final List<Feed> LJLJJL;
    public final C69926RcQ LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public final int LJLLI = EnumC27721AuL.BUY_TOGETHER.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69925RcP)) {
            return false;
        }
        C69925RcP c69925RcP = (C69925RcP) obj;
        return o.LJ(this.LJLIL, c69925RcP.LJLIL) && o.LJ(this.LJLILLLLZI, c69925RcP.LJLILLLLZI) && o.LJ(this.LJLJI, c69925RcP.LJLJI) && o.LJ(this.LJLJJI, c69925RcP.LJLJJI) && o.LJ(this.LJLJJL, c69925RcP.LJLJJL) && o.LJ(this.LJLJJLL, c69925RcP.LJLJJLL);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkRichText linkRichText = this.LJLJI;
        int hashCode3 = (hashCode2 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        String str3 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Feed> list = this.LJLJJL;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        C69926RcQ c69926RcQ = this.LJLJJLL;
        return hashCode5 + (c69926RcQ != null ? c69926RcQ.hashCode() : 0);
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BuyTogetherVO(title=");
        LIZ.append(this.LJLIL);
        LIZ.append(", addToCartButtonText=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", promotion=");
        LIZ.append(this.LJLJI);
        LIZ.append(", bundlePriceText=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", feedList=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", state=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLLI;
    }

    public C69925RcP(String str, String str2, LinkRichText linkRichText, String str3, List<Feed> list, C69926RcQ c69926RcQ) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = linkRichText;
        this.LJLJJI = str3;
        this.LJLJJL = list;
        this.LJLJJLL = c69926RcQ;
    }
}
