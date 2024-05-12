package X;

import com.bytedance.lobby.google.GoogleOneTapAuth;
import com.ss.android.ugc.aweme.account.login.GoogleOneTapLogger;

/* renamed from: X.Qh5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67667Qh5 implements InterfaceC67679QhH {
    public final /* synthetic */ Long LJLIL;
    public final /* synthetic */ GoogleOneTapAuth LJLILLLLZI;

    @Override // X.InterfaceC67679QhH
    public final void onFailure(Exception exc) {
        GoogleOneTapAuth googleOneTapAuth = this.LJLILLLLZI;
        String localizedMessage = exc.getLocalizedMessage();
        googleOneTapAuth.getClass();
        this.LJLILLLLZI.iv0(GoogleOneTapAuth.gv0(localizedMessage));
        GoogleOneTapLogger.LIZLLL().LIZ(this.LJLIL, 0, 0);
    }

    public C67667Qh5(GoogleOneTapAuth googleOneTapAuth, Long l) {
        this.LJLILLLLZI = googleOneTapAuth;
        this.LJLIL = l;
    }
}
