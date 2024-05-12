package com.ss.android.ugc.aweme.viewModel;

import X.InterfaceC61312at;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;

/* loaded from: classes13.dex */
public final class ProfileNaviHubViewModel extends BaseJediViewModel<ProfileNaviHubState> {
    public final UserPresenter LJLJJLL = new UserPresenter();

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new ProfileNaviHubState(false, false, false, 7, null);
    }
}
