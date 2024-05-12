package X;

import Y.AfS58S0100000_6;
import com.google.android.play.core.appupdate.a;
import com.ss.android.ugc.aweme.setting.api.BetaAppApi;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.lego.BetaAppTask;

/* renamed from: X.Fwg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40606Fwg<ResultT> implements InterfaceC40563Fvz {
    public final /* synthetic */ BetaAppTask LJLIL;

    public C40606Fwg(BetaAppTask betaAppTask) {
        this.LJLIL = betaAppTask;
    }

    @Override // X.InterfaceC40563Fvz
    public final void onSuccess(Object obj) {
        BetaAppExperiment.LJIIIIZZ.getClass();
        int LIZ = ((a) obj).LIZ();
        BetaAppTask betaAppTask = this.LJLIL;
        betaAppTask.getClass();
        if (BetaAppExperiment.LIZIZ(LIZ)) {
            BetaAppExperiment.LIZLLL(LIZ);
            return;
        }
        if (BetaAppExperiment.LJII) {
            return;
        }
        C40609Fwj c40609Fwj = BetaAppApi.LIZ;
        AfS58S0100000_6 afS58S0100000_6 = new AfS58S0100000_6(betaAppTask, 32);
        InterfaceC64592gB<? super Throwable> interfaceC64592gB = C40613Fwn.LJLIL;
        c40609Fwj.getClass();
        C40609Fwj.LIZIZ.latestVersionFromBits().LJJL(T16.LIZ()).LJJJLIIL(afS58S0100000_6, interfaceC64592gB);
    }
}
