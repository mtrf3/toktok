package com.ss.android.ugc.aweme.viewModel;

import X.C72594SeM;
import X.C72595SeN;
import X.InterfaceC61312at;
import com.bytedance.jedi.arch.BaseJediViewModel;

/* loaded from: classes13.dex */
public final class ProfileNaviAutoCreationViewModel extends BaseJediViewModel<ProfileNaviAutoCreationState> {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new ProfileNaviAutoCreationState(false, null, false, false, false, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJLL() {
        ProfileNaviAutoCreationState profileNaviAutoCreationState = (ProfileNaviAutoCreationState) lv0();
        profileNaviAutoCreationState.setBackPressed(false);
        profileNaviAutoCreationState.setAutoCreationComplete(false);
        profileNaviAutoCreationState.setSelfieBitmap(null);
        profileNaviAutoCreationState.setCreateProfileImage(false);
        profileNaviAutoCreationState.setShouldShowSkintoneSelectFragment(false);
        profileNaviAutoCreationState.setProfileNaviDataModel(null);
        setStateImmediate(C72594SeM.LJLIL);
        setStateImmediate(C72595SeN.LJLIL);
    }
}
