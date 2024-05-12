package X;

import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* renamed from: X.JdF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49593JdF implements JWX<SearchMixFeed> {
    public static final C49593JdF LIZ = new C49593JdF();

    @Override // X.JWX
    public final JWV LIZ(SearchMixFeed searchMixFeedBase, Aweme aweme) {
        Aweme aweme2;
        o.LJIIIZ(searchMixFeedBase, "searchMixFeedBase");
        JWW jww = JWW.LIZ;
        EComShopCardStruct eComShopCardStruct = searchMixFeedBase.shopCard;
        if (eComShopCardStruct != null) {
            aweme2 = eComShopCardStruct.liveEntity;
        } else {
            aweme2 = null;
        }
        if (!o.LJ(aweme2, aweme)) {
            return null;
        }
        return jww;
    }
}
