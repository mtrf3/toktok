package com.ss.android.ugc.aweme.music.vm;

import X.C203727z6;
import X.C213358Yx;
import X.C240949cw;
import X.C241269dS;
import X.C36922EeM;
import X.InterfaceC203737z7;
import X.QD3;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS1S1211000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class MusicCellViewModel extends AssemViewModel<C240949cw> implements InterfaceC203737z7 {
    public String LJLIL = "";
    public final C203727z6 LJLILLLLZI = new C203727z6();

    @Override // X.InterfaceC203737z7
    public final void ix() {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C240949cw defaultState() {
        return new C240949cw(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        this.LJLILLLLZI.LJLILLLLZI = this;
    }

    public MusicCellViewModel() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.InterfaceC203737z7
    public final void aB(Exception exc) {
        C36922EeM.LJFF(exc);
    }

    @Override // X.InterfaceC203737z7
    public final void gd(String str) {
        if (str == null) {
            return;
        }
        setState(new AqS29S1000000_4(str, 14));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectMusicEvent(C213358Yx event) {
        o.LJIIIZ(event, "event");
        boolean z = true;
        if (event.LJLILLLLZI != 1) {
            z = false;
        }
        if (!o.LJ(event.LJLIL, this.LJLIL)) {
            return;
        }
        setState(new AqS9S0010000_4(z, 13));
    }

    @QD3
    public final void onUpdateFeaturedAwemeEvent(C241269dS event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI && this.LJLIL.length() > 0 && o.LJ(this.LJLIL, event.LJLIL)) {
            setState(new AqS170S0100000_4(event, 452));
        }
    }

    public final void gv0(MusicModel model, String str, int i, boolean z) {
        o.LJIIIZ(model, "model");
        setState(new AqS1S1211000_4(this, str, model, i, z, 0));
    }
}
