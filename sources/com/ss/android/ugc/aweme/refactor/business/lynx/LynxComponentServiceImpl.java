package com.ss.android.ugc.aweme.refactor.business.lynx;

import X.C31968Cge;
import X.C40741Fyr;
import X.EF7;
import X.InterfaceC40806Fzu;
import X.VNS;
import X.X1D;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.plugin.journey.NewUserJourneyStep;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class LynxComponentServiceImpl extends ViewModel implements InterfaceC40806Fzu {
    public volatile C31968Cge LJLIL;
    public volatile NewUserJourneyStep LJLILLLLZI;
    public VNS LJLJI;

    @Override // X.InterfaceC40806Fzu
    public final C31968Cge R4() {
        if (this.LJLIL == null) {
            this.LJLIL = new C31968Cge(EF7.LIZIZ());
        }
        return this.LJLIL;
    }

    @Override // X.InterfaceC40806Fzu
    public final String a7() {
        NewUserJourneyStep newUserJourneyStep = this.LJLILLLLZI;
        if (newUserJourneyStep != null) {
            return newUserJourneyStep.pageType;
        }
        return null;
    }

    @Override // X.InterfaceC40806Fzu
    public final WeakReference<VNS> v80() {
        VNS vns;
        if (this.LJLJI == null) {
            C31968Cge c31968Cge = this.LJLIL;
            if (c31968Cge != null) {
                vns = c31968Cge.LIZIZ();
            } else {
                vns = null;
            }
            this.LJLJI = vns;
        }
        return new WeakReference<>(this.LJLJI);
    }

    @Override // X.InterfaceC40806Fzu
    public final void Vf0(NewUserJourneyStep newUserJourneyStep) {
        boolean z;
        VNS vns;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init newUserJourneyStep is null? ");
        if (newUserJourneyStep == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        if (newUserJourneyStep != null) {
            this.LJLILLLLZI = newUserJourneyStep;
        }
        if (this.LJLIL == null) {
            this.LJLIL = new C31968Cge(EF7.LIZIZ());
        }
        if (this.LJLJI == null) {
            C31968Cge c31968Cge = this.LJLIL;
            if (c31968Cge != null) {
                vns = c31968Cge.LIZIZ();
            } else {
                vns = null;
            }
            this.LJLJI = vns;
        }
    }
}
