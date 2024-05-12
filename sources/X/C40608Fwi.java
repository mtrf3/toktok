package X;

import Y.AfS58S0100000_6;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.api.BetaAppApi;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.lego.BetaAppTask;

/* renamed from: X.Fwi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40608Fwi implements LEA {
    public final /* synthetic */ BetaAppTask LJLIL;

    public C40608Fwi(BetaAppTask betaAppTask) {
        this.LJLIL = betaAppTask;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            if (i == 1 || i == 2) {
                BetaAppTask betaAppTask = this.LJLIL;
                betaAppTask.getClass();
                if (!BetaAppExperiment.LJII) {
                    C40609Fwj c40609Fwj = BetaAppApi.LIZ;
                    AfS58S0100000_6 afS58S0100000_6 = new AfS58S0100000_6(betaAppTask, 32);
                    InterfaceC64592gB<? super Throwable> interfaceC64592gB = C40613Fwn.LJLIL;
                    c40609Fwj.getClass();
                    C40609Fwj.LIZIZ.latestVersionFromBits().LJJL(T16.LIZ()).LJJJLIIL(afS58S0100000_6, interfaceC64592gB);
                }
            }
        }
    }
}
