package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JXL extends AbstractC49300JWm<SearchMixFeed> {
    public final JXK LIZIZ = JXK.LIZ;

    @Override // X.AbstractC49300JWm
    public final EnumC49272JVk LIZIZ() {
        return EnumC49272JVk.ALL_COLUMNS;
    }

    @Override // X.AbstractC49300JWm
    public final JWX<SearchMixFeed> LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC49300JWm
    public final List LIZ(SearchMixFeed searchMixFeed, C49847JhL streamRoot) {
        SearchMixFeed item = searchMixFeed;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(streamRoot, "streamRoot");
        return item.bot.getAwemeList();
    }
}
