package X;

import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;

/* loaded from: classes9.dex */
public final class KGS implements InterfaceC50133Jlx {
    public final /* synthetic */ ChooseSearchMusicFragment LIZ;

    public KGS(ChooseSearchMusicFragment chooseSearchMusicFragment) {
        this.LIZ = chooseSearchMusicFragment;
    }

    @Override // X.InterfaceC50133Jlx
    public final void LIZ(C50287JoR c50287JoR) {
        String str;
        if (!this.LIZ.isViewValid()) {
            return;
        }
        ChooseSearchMusicFragment chooseSearchMusicFragment = this.LIZ;
        chooseSearchMusicFragment.getClass();
        C51468KHw c51468KHw = new C51468KHw();
        SearchKeywordPresenter searchKeywordPresenter = chooseSearchMusicFragment.LJLJJL;
        if (searchKeywordPresenter != null) {
            str = searchKeywordPresenter.getKeyword().LJLIL;
        } else {
            str = null;
        }
        c51468KHw.LIZIZ = str;
        c51468KHw.LIZ = "normal_search";
        c51468KHw.LJ = c50287JoR;
        chooseSearchMusicFragment.Al(c51468KHw);
        this.LIZ.vl(true, c50287JoR.isDefaultOption());
    }

    @Override // X.InterfaceC50133Jlx
    public final void LIZIZ(C50287JoR c50287JoR) {
        this.LIZ.LJLJLJ = c50287JoR;
    }
}
