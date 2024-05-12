package X;

import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JdE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49592JdE extends AbstractC49300JWm<SearchMixFeed> {
    public final C49591JdD LIZIZ = C49591JdD.LIZ;
    public final C49854JhS LIZJ = new C49854JhS(true, false, true, true, false, false, false, 3092);

    @Override // X.AbstractC49300JWm
    public final EnumC49272JVk LIZIZ() {
        return EnumC49272JVk.ALL_COLUMNS;
    }

    @Override // X.AbstractC49300JWm
    public final JWX<SearchMixFeed> LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC49300JWm
    public final C49854JhS LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.AbstractC49300JWm
    public final List LIZ(SearchMixFeed searchMixFeed, C49847JhL streamRoot) {
        Aweme aweme;
        SearchMixFeed item = searchMixFeed;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(streamRoot, "streamRoot");
        EComShopCardStruct eComShopCardStruct = item.shopCard;
        if (eComShopCardStruct != null && (aweme = eComShopCardStruct.liveEntity) != null) {
            return C47261Igj.LJJIJ(aweme);
        }
        return null;
    }
}
