package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* renamed from: X.JhE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49840JhE extends AbstractC65781Prl implements InterfaceC88472Yns<SearchMixFeed, Boolean> {
    public static final C49840JhE LJLIL = new C49840JhE();

    public C49840JhE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(SearchMixFeed searchMixFeed) {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        SearchMixFeed it = searchMixFeed;
        o.LJIIIZ(it, "it");
        boolean z = false;
        if (it.getFeedType() == 65280 && (aweme = it.getAweme()) != null && !aweme.isAd() && (aweme2 = it.getAweme()) != null && !aweme2.isPhotoMode() && it.LJLJJI != 2 && (!C49835Jh9.LIZ() || (aweme3 = it.getAweme()) == null || !C78949Uyf.LJJIFFI(aweme3))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
