package X;

import android.content.IntentSender;
import android.os.Bundle;
import com.bytedance.lobby.google.GoogleOneTapAuth;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.ss.android.ugc.aweme.account.login.GoogleOneTapLogger;

/* renamed from: X.Qh3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67665Qh3 implements InterfaceC67677QhF<BeginSignInResult> {
    public final /* synthetic */ Bundle LJLIL;
    public final /* synthetic */ Long LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;
    public final /* synthetic */ GoogleOneTapAuth LJLJJI;

    @Override // X.InterfaceC67677QhF
    public final void onSuccess(BeginSignInResult beginSignInResult) {
        BeginSignInResult beginSignInResult2 = beginSignInResult;
        try {
            GoogleOneTapLogger.LIZLLL().LIZIZ(this.LJLIL);
            GoogleOneTapLogger.LIZLLL().LIZ(this.LJLILLLLZI, 1, 1);
            this.LJLJI.startIntentSenderForResult(beginSignInResult2.zba.getIntentSender(), 1, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            GoogleOneTapAuth googleOneTapAuth = this.LJLJJI;
            String localizedMessage = e.getLocalizedMessage();
            googleOneTapAuth.getClass();
            this.LJLJJI.iv0(GoogleOneTapAuth.gv0(localizedMessage));
            GoogleOneTapLogger.LIZLLL().LIZ(this.LJLILLLLZI, 1, 0);
        }
    }

    public C67665Qh3(Bundle bundle, ActivityC45651qj activityC45651qj, GoogleOneTapAuth googleOneTapAuth, Long l) {
        this.LJLJJI = googleOneTapAuth;
        this.LJLIL = bundle;
        this.LJLILLLLZI = l;
        this.LJLJI = activityC45651qj;
    }
}
