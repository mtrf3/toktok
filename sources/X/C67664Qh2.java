package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.lobby.google.GoogleOneTapAuth;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.ss.android.ugc.aweme.account.login.GoogleOneTapLogger;

/* renamed from: X.Qh2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67664Qh2 implements InterfaceC67679QhH {
    public final /* synthetic */ Long LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;
    public final /* synthetic */ GoogleOneTapAuth LJLJJI;

    @Override // X.InterfaceC67679QhH
    public final void onFailure(Exception exc) {
        GoogleOneTapLogger.LIZLLL().LIZ(this.LJLIL, 1, 0);
        GoogleOneTapAuth googleOneTapAuth = this.LJLJJI;
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        Bundle bundle = this.LJLJI;
        BeginSignInRequest hv0 = googleOneTapAuth.hv0(Boolean.FALSE);
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        C67646Qgk LJ = googleOneTapAuth.LJLJJI.LJ(hv0);
        C67666Qh4 c67666Qh4 = new C67666Qh4(bundle, activityC45651qj, googleOneTapAuth, valueOf);
        LJ.getClass();
        ExecutorC46398IIw executorC46398IIw = C67641Qgf.LIZ;
        C67651Qgp c67651Qgp = new C67651Qgp(executorC46398IIw, c67666Qh4);
        LJ.LIZIZ.LIZIZ(c67651Qgp);
        C67663Qh1.LJIIIZ(activityC45651qj).LJIIJ(c67651Qgp);
        LJ.LJIJJ();
        C67656Qgu c67656Qgu = new C67656Qgu(executorC46398IIw, new C67667Qh5(googleOneTapAuth, valueOf));
        LJ.LIZIZ.LIZIZ(c67656Qgu);
        C67663Qh1.LJIIIZ(activityC45651qj).LJIIJ(c67656Qgu);
        LJ.LJIJJ();
        C67658Qgw c67658Qgw = new C67658Qgw(executorC46398IIw, new C66598QBu(googleOneTapAuth));
        LJ.LIZIZ.LIZIZ(c67658Qgw);
        C67663Qh1.LJIIIZ(activityC45651qj).LJIIJ(c67658Qgw);
        LJ.LJIJJ();
    }

    public C67664Qh2(Bundle bundle, ActivityC45651qj activityC45651qj, GoogleOneTapAuth googleOneTapAuth, Long l) {
        this.LJLJJI = googleOneTapAuth;
        this.LJLIL = l;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = bundle;
    }
}
