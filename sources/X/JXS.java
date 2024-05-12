package X;

import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JXS implements InterfaceC49027JLz, InterfaceC49000JKy, InterfaceC48999JKx, InterfaceC49026JLy, JMS {
    public final SearchMixFeedBase LJLIL;
    public final Aweme LJLILLLLZI;
    public final C48462J0g LJLJI = C87277YNd.LJJIFFI(new AqS174S0100000_8(this, 11));

    @Override // X.InterfaceC48999JKx
    public final boolean n() {
        return false;
    }

    @Override // X.InterfaceC48999JKx
    public final String A() {
        String str;
        EComShopCardStruct eComShopCardStruct = this.LJLIL.shopCard;
        if (eComShopCardStruct == null || (str = eComShopCardStruct.liveUserCountFormatted) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC49026JLy
    public final User getCurrentUser() {
        EComShopCardStruct eComShopCardStruct = this.LJLIL.shopCard;
        if (eComShopCardStruct != null) {
            return eComShopCardStruct.userInfo;
        }
        return null;
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreCardRenderData(searchMixFeedBase=");
        LIZ.append(this.LJLIL);
        LIZ.append(", aweme=");
        return C770830u.LIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC49027JLz
    public final SearchMixFeedBase LJJJJZI() {
        return this.LJLIL;
    }

    @Override // X.JMS
    public final C48462J0g LLLF() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC49000JKy
    public final Aweme getAweme() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JXS)) {
            return false;
        }
        JXS jxs = (JXS) obj;
        if (o.LJ(this.LJLIL, jxs.LJLIL) && o.LJ(this.LJLILLLLZI, jxs.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public JXS(SearchMixFeedBase searchMixFeedBase, Aweme aweme) {
        this.LJLIL = searchMixFeedBase;
        this.LJLILLLLZI = aweme;
    }
}
