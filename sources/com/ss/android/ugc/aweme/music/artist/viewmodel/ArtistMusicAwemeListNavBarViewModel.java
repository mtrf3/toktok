package com.ss.android.ugc.aweme.music.artist.viewmodel;

import X.C236139On;
import X.C237039Rz;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C78404Ups;
import X.C9C5;
import X.EV6;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes5.dex */
public final class ArtistMusicAwemeListNavBarViewModel extends AssemViewModel<C9C5> {
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final EV6 LJLILLLLZI = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C237039Rz.class));
    public final C55749LuL LJLJI = new C55749LuL(C47704Ins.LJFF(this, C236139On.class, "hierarchy_data_artist_music"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C9C5 defaultState() {
        return new C9C5(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLIL.dispose();
        super.onCleared();
    }
}
