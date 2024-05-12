package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes5.dex */
public final class AUC implements InterfaceC72729SgX {
    public final /* synthetic */ AUA LIZ;

    @Override // X.InterfaceC72729SgX
    public final void LIZ() {
        C86184Xs4 c86184Xs4 = this.LIZ.LIZLLL;
        if (c86184Xs4 != null) {
            c86184Xs4.LJIILJJIL(0);
        }
    }

    @Override // X.InterfaceC72729SgX
    public final void LIZIZ() {
        C43256GyK c43256GyK = new C43256GyK();
        AUA aua = this.LIZ;
        c43256GyK.LIZ(aua.LIZ, new AUB(aua));
    }

    @Override // X.InterfaceC72729SgX
    public final void LIZJ() {
        AUA aua = this.LIZ;
        User user = aua.LIZJ;
        if (user != null) {
            C87030YDq.LIZIZ.startHeaderDetailActivity(aua.LIZ, aua.LIZIZ, user, false, false);
        }
    }

    public AUC(AUA aua) {
        this.LIZ = aua;
    }
}
