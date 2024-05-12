package com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel;

import X.K2M;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes9.dex */
public final class ChooseSearchMusicStateViewModel extends AssemViewModel<K2M> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final K2M defaultState() {
        return new K2M(0);
    }

    public final String gv0() {
        if (getState().LJLJJL) {
            return "search_music";
        }
        return "change_music_page";
    }

    public final boolean hv0() {
        K2M state = getState();
        if (state.LJLILLLLZI == 0 || state.LJLJI == 0) {
            return true;
        }
        return false;
    }
}
