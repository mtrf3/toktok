package com.ss.android.ugc.aweme.dsp.playpage.favpage;

import X.AbstractC91590Zx4;
import X.C91220Zr6;
import X.C91435ZuZ;
import X.C91436Zua;
import X.C91467Zv5;
import X.C91495ZvX;
import X.C91603ZxH;
import X.C91604ZxI;
import X.EnumC91180ZqS;
import X.InterfaceC91296ZsK;
import X.ORZ;
import X.YBM;
import Y.IDfS125S0200000_29;
import Y.IDfS293S0100000_29;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel;
import java.util.List;
import kotlin.jvm.internal.IDqS417S0100000_29;

/* loaded from: classes22.dex */
public final class FavPlayerViewModel extends BasePlayerViewModel {
    public final MutableLiveData<List<InterfaceC91296ZsK>> LJLLL = new MutableLiveData<>();

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel
    public final AbstractC91590Zx4 gv0() {
        return C91220Zr6.LIZIZ(this.LJLJLLL).LIZ.getSubPlayerController();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel
    public final void hv0(long j, String str) {
        if (ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited()) {
            YBM.LIZ.getClass();
            if (!YBM.LIZJ()) {
                jv0(false);
                this.LJLJJI.setValue(Boolean.FALSE);
                return;
            }
        }
        C91495ZvX c91495ZvX = new C91495ZvX(gv0(), new C91467Zv5("my_playlist", "my_playlist", this.LJLJLLL, str, j, 3), C91603ZxH.LJLIL, "", EnumC91180ZqS.REFRESH);
        c91495ZvX.LJLJLJ = new IDqS417S0100000_29(this, 30);
        this.LJLIL.LIZ(c91495ZvX.LJLL.LIZIZ(ORZ.LLD(gv0().LJ(null), ",", null, null, C91604ZxI.LJLIL, 30)).LJIL(C91435ZuZ.LJLIL).LJIILLIIL(C91436Zua.LIZ).LJJJLIIL(new IDfS125S0200000_29(this, c91495ZvX, 2), new IDfS293S0100000_29(this, 11)));
    }
}
