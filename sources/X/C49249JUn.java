package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* renamed from: X.JUn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49249JUn extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchMixFeed, String, Boolean> {
    public static final C49249JUn LJLIL = new C49249JUn();

    public C49249JUn() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(SearchMixFeed searchMixFeed, String aid) {
        String str;
        SearchMixFeed searchMixFeed2 = searchMixFeed;
        o.LJIIIZ(searchMixFeed2, "searchMixFeed");
        o.LJIIIZ(aid, "aid");
        Aweme aweme = searchMixFeed2.getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        return Boolean.valueOf(o.LJ(str, aid));
    }
}
