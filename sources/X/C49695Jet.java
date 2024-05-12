package X;

import com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel.SearchTakoCardUIVM;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import java.util.List;

/* renamed from: X.Jet, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49695Jet implements InterfaceC50046JkY {
    public final /* synthetic */ SearchJediMixFeedFragment LIZ;

    public C49695Jet(SearchJediMixFeedFragment searchJediMixFeedFragment) {
        this.LIZ = searchJediMixFeedFragment;
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZ() {
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC50046JkY
    public final void LIZIZ(boolean z) {
        List<SearchMixFeed> items;
        if (!z) {
            MusicPlayHelper musicPlayHelper = this.LIZ.LLJJLIIIJLLLLLLLZ;
            if (musicPlayHelper != null) {
                musicPlayHelper.hv0();
            }
            C49825Jgz c49825Jgz = this.LIZ.LLLFF;
            if (c49825Jgz != null && (items = c49825Jgz.getItems()) != null) {
                for (SearchMixFeed searchMixFeed : items) {
                    if (searchMixFeed.getFeedType() == 35) {
                        if (searchMixFeed != null) {
                            SearchJediMixFeedFragment searchJediMixFeedFragment = this.LIZ;
                            ((TakoPollingVM) searchJediMixFeedFragment.LLLLIILL.getValue()).gv0();
                            ((SearchTakoCardUIVM) searchJediMixFeedFragment.LLLLIIL.getValue()).hv0(0);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
