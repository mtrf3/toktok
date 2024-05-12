package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C241269dS;
import X.C241959eZ;
import X.QD3;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class MusicCellFeaturedVideosIconViewModel extends AssemViewModel<C241959eZ> {
    public String LJLIL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C241959eZ defaultState() {
        return new C241959eZ(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3
    public final void onUpdateFeaturedAwemeEvent(C241269dS event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI && this.LJLIL.length() > 0 && o.LJ(this.LJLIL, event.LJLIL)) {
            setState(new AqS170S0100000_4(event, 424));
        }
    }
}
