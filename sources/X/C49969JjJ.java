package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.JjJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49969JjJ implements InterfaceC49992Jjg {
    public final JVO LIZ;

    public C49969JjJ(JVS jvs) {
        this.LIZ = jvs;
    }

    @Override // X.InterfaceC49295JWh
    public final AbstractC49294JWg LJ(C50420Jqa videoEvent) {
        o.LJIIIZ(videoEvent, "videoEvent");
        return C49990Jje.LIZ(this, videoEvent);
    }

    @Override // X.InterfaceC49992Jjg
    public final AbstractC49294JWg LIZ(int i, Aweme aweme) {
        return C49989Jjd.LIZ(i, aweme);
    }

    @Override // X.InterfaceC49991Jjf
    public final boolean LIZIZ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(videoEvent, "videoEvent");
        return true;
    }

    @Override // X.InterfaceC49992Jjg
    public final int LIZJ(C50420Jqa videoEvent, Aweme aweme) {
        Aweme aweme2;
        Aweme aweme3;
        java.util.Map<String, String> searchExtraParams;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(videoEvent, "videoEvent");
        SearchMixFeed LJLZ = this.LIZ.LJLZ();
        if (LJLZ != null && (aweme2 = LJLZ.getAweme()) != null && TrendingDetailServiceImpl.LIZLLL().LIZ() && this.LIZ.LJZI()) {
            SearchMixFeed LJLZ2 = this.LIZ.LJLZ();
            if (LJLZ2 != null && (aweme3 = LJLZ2.getAweme()) != null && (searchExtraParams = aweme3.getSearchExtraParams()) != null) {
                searchExtraParams.remove("is_click_trending_native_card_enter");
            }
            return this.LIZ.LJLLLLLL(aweme2);
        }
        return -1;
    }

    @Override // X.InterfaceC49991Jjf
    public final AbstractC49294JWg LIZLLL(C50420Jqa c50420Jqa, Aweme aweme) {
        return C49989Jjd.LIZIZ(c50420Jqa, aweme, this);
    }
}
