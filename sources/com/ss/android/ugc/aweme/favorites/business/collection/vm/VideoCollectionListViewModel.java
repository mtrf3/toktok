package com.ss.android.ugc.aweme.favorites.business.collection.vm;

import X.C192677hH;
import X.C192847hY;
import X.C192857hZ;
import X.C214188as;
import X.C78404Ups;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class VideoCollectionListViewModel extends AssemViewModel<C192847hY> {
    public static final Map<String, CollectionDetail> LJLJJL = new LinkedHashMap();
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public final C214188as LJLJJI = C78404Ups.LIZJ(this, C192677hH.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C192847hY defaultState() {
        return new C192847hY(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((LinkedHashMap) LJLJJL).clear();
    }

    public static void gv0(VideoCollectionListViewModel videoCollectionListViewModel, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        videoCollectionListViewModel.getClass();
        videoCollectionListViewModel.withState(new C192857hZ(z, videoCollectionListViewModel, null, z2));
    }
}
