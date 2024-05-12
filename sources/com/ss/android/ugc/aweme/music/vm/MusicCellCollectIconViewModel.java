package com.ss.android.ugc.aweme.music.vm;

import X.C203727z6;
import X.C213358Yx;
import X.C36922EeM;
import X.C42625Go9;
import X.C47704Ins;
import X.C55749LuL;
import X.C99K;
import X.InterfaceC203737z7;
import X.QD3;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class MusicCellCollectIconViewModel extends AssemViewModel<C99K> implements InterfaceC203737z7 {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, OriginMusicArg.class, null), true);
    public String LJLILLLLZI = "";
    public final C203727z6 LJLJI = new C203727z6();

    @Override // X.InterfaceC203737z7
    public final void ix() {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C99K defaultState() {
        return new C99K(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        this.LJLJI.LJLILLLLZI = this;
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C42625Go9.LIZJ(this);
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
        setState(new AqS29S1000000_4(str, 13));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectMusicEvent(C213358Yx event) {
        o.LJIIIZ(event, "event");
        boolean z = true;
        if (event.LJLILLLLZI != 1) {
            z = false;
        }
        if (!o.LJ(event.LJLIL, this.LJLILLLLZI)) {
            return;
        }
        setState(new AqS9S0010000_4(z, 12));
    }
}
