package com.ss.android.ugc.aweme.favorites.business.collection.vm;

import X.C192027gE;
import X.C192467gw;
import X.C214188as;
import X.C72912tb;
import X.C78404Ups;
import X.InterfaceC192457gv;
import X.T16;
import Y.AfS55S0100000_3;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoCollectionContentViewModel extends AssemViewModel<C192027gE> {
    public static final /* synthetic */ int LJLJI = 0;
    public final String LJLIL;
    public final C214188as LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C192027gE defaultState() {
        return new C192027gE((C72912tb) null, 0L, false, 15);
    }

    public VideoCollectionContentViewModel() {
        this.LJLILLLLZI = C78404Ups.LIZJ(this, C192467gw.LJLIL);
    }

    public VideoCollectionContentViewModel(String collectionId) {
        o.LJIIIZ(collectionId, "collectionId");
        this.LJLILLLLZI = C78404Ups.LIZJ(this, C192467gw.LJLIL);
        this.LJLIL = collectionId;
    }

    public static void hv0(VideoCollectionContentViewModel videoCollectionContentViewModel) {
        String str = videoCollectionContentViewModel.LJLIL;
        if (str == null) {
            return;
        }
        videoCollectionContentViewModel.disposeOnClear(((InterfaceC192457gv) videoCollectionContentViewModel.LJLILLLLZI.getValue().getOperator()).LJJLIIIIJ(str).LJJL(T16.LIZ()).LJJJLIIL(new AfS55S0100000_3(videoCollectionContentViewModel, 53), new AfS55S0100000_3(videoCollectionContentViewModel, 54)));
    }

    public final void gv0(boolean z) {
        withState(new AqS46S0110000_3(this, z, 4));
    }
}
