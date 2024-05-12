package X;

import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Je4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49644Je4 implements InterfaceC50046JkY {
    public final /* synthetic */ SearchFeedFragment LIZ;

    public C49644Je4(SearchFeedFragment searchFeedFragment) {
        this.LIZ = searchFeedFragment;
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZ() {
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC50046JkY
    public final void LIZIZ(boolean z) {
        boolean z2;
        SearchFeedFragment searchFeedFragment = this.LIZ;
        JQT jqt = searchFeedFragment.LLJL;
        if (jqt != null) {
            jqt.LJJJI(z);
            if (z) {
                Boolean value = searchFeedFragment.fm().isRefreshingData.getValue();
                Boolean bool = Boolean.TRUE;
                if (!o.LJ(value, bool) && !o.LJ(searchFeedFragment.fm().isShowingFilters.getValue(), bool) && !o.LJ(searchFeedFragment.fm().shouldBlockMediaPlay.getValue(), bool)) {
                    jqt.LJJJJ();
                }
            }
            jqt.LJJJJI();
        }
        SearchFeedFragment searchFeedFragment2 = this.LIZ;
        C49578Jd0 c49578Jd0 = searchFeedFragment2.LLJLILLLLZIIL;
        if (c49578Jd0 != null) {
            if (z && searchFeedFragment2.getUserVisibleHint()) {
                z2 = true;
            } else {
                z2 = false;
            }
            c49578Jd0.LIZIZ(Boolean.valueOf(z2));
        }
    }
}
