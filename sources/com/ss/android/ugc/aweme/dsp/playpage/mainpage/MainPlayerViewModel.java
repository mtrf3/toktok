package com.ss.android.ugc.aweme.dsp.playpage.mainpage;

import X.AbstractC73672Svk;
import X.AbstractC91380Ztg;
import X.AbstractC91590Zx4;
import X.C47261Igj;
import X.C73805Sxt;
import X.C73969T1h;
import X.C91207Zqt;
import X.C91208Zqu;
import X.C91220Zr6;
import X.C91237ZrN;
import X.C91249ZrZ;
import X.C91299ZsN;
import X.C91382Zti;
import X.C91383Ztj;
import X.C91384Ztk;
import X.C91385Ztl;
import X.C91386Ztm;
import X.C91435ZuZ;
import X.C91436Zua;
import X.C91467Zv5;
import X.C91494ZvW;
import X.CallableC91236ZrM;
import X.InterfaceC91296ZsK;
import X.SVF;
import X.SVI;
import X.T16;
import X.YBM;
import X.YXW;
import Y.IDfS125S0200000_29;
import Y.IDfS293S0100000_29;
import Y.IDhS109S0100000_29;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MainPlayerViewModel extends BasePlayerViewModel {
    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel
    public final AbstractC91590Zx4 gv0() {
        return C91220Zr6.LIZIZ(this.LJLJLLL).LIZ.getMainPlayerController();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel, X.InterfaceC91291ZsF
    public final void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
        super.a50(c91299ZsN, playable);
        AbstractC91380Ztg LJIIZILJ = gv0().LJIIZILJ();
        if (LJIIZILJ != null && LJIIZILJ.LJI(playable)) {
            iv0();
        }
        if (!ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited()) {
            SVF.LJIILIIL(SVI.DSP_YDM.getNumber(), playable.LIZIZ());
            C91249ZrZ.LJIIIIZZ(playable.getEventData());
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel
    public final void hv0(long j, String str) {
        C73805Sxt LJJIJL;
        if (ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited()) {
            YBM.LIZ.getClass();
            if (!YBM.LIZJ()) {
                jv0(false);
                this.LJLJJI.setValue(Boolean.FALSE);
                return;
            }
        }
        C91494ZvW c91494ZvW = new C91494ZvW(new C91467Zv5("track_reco", "track_reco", this.LJLJLLL, str, j, 3));
        C91382Zti c91382Zti = c91494ZvW.LJLJJLL;
        c91382Zti.LIZJ.LJLJI = Long.valueOf(SystemClock.elapsedRealtime());
        C91467Zv5 c91467Zv5 = c91382Zti.LIZJ.LJLJL;
        String str2 = c91467Zv5.LJLJJLL;
        boolean z = !C47261Igj.LJJIJIIJI("full_song_anchor", "full_song_button", "feed_fav_button").contains(c91467Zv5.LJLJJL);
        DspDetailListResponse LIZIZ = C91208Zqu.LIZ.LIZIZ(str2);
        if (LIZIZ != null) {
            C91494ZvW c91494ZvW2 = c91382Zti.LIZJ;
            c91494ZvW2.LJLJJI = true;
            c91494ZvW2.LIZJ(LIZIZ);
            AbstractC73672Svk LJJL = AbstractC73672Svk.LJJIJIL(c91382Zti.LIZJ.LJLIL).LJJL(T16.LIZ());
            YXW.LIZ.getClass();
            if (!YXW.LJI) {
                LJJL = LJJL.LJJJ(C73969T1h.LIZIZ());
            }
            LJJIJL = LJJL.LJJIJL(C91384Ztk.LJLIL);
        } else {
            c91382Zti.LIZJ.LJLJJI = false;
            AbstractC73672Svk remoteObservable = C91207Zqt.LIZ().LJJIII(new C91386Ztm(c91382Zti, str2, z), false);
            if (z && !C91237ZrN.LIZ && C91237ZrN.LIZIZ()) {
                o.LJIIIIZZ(remoteObservable, "remoteObservable");
                remoteObservable = AbstractC73672Svk.LJJIIJZLJL(new CallableC91236ZrM(false)).LJJJJ(C91383Ztj.LJLIL).LJJIII(new IDhS109S0100000_29(remoteObservable, 3), false);
            }
            AbstractC73672Svk LJJIJL2 = remoteObservable.LJJL(T16.LIZ()).LJJIJL(new C91385Ztl(z, c91382Zti.LIZJ, str2));
            YXW.LIZ.getClass();
            if (!YXW.LJI) {
                LJJIJL2 = LJJIJL2.LJJJ(C73969T1h.LIZIZ());
            }
            LJJIJL = LJJIJL2.LJJIJL(new IDhS109S0100000_29(c91382Zti.LIZJ, 4));
        }
        this.LJLIL.LIZ(LJJIJL.LJIL(C91435ZuZ.LJLIL).LJIILLIIL(C91436Zua.LIZ).LJJJLIIL(new IDfS125S0200000_29(this, c91494ZvW, 3), new IDfS293S0100000_29(this, 12)));
    }
}
