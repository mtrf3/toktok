package X;

import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.google.GoogleOneTapAuth;

/* renamed from: X.QBt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66597QBt implements InterfaceC67680QhI {
    public final /* synthetic */ GoogleOneTapAuth LJLIL;

    @Override // X.InterfaceC67680QhI
    public final void LIZ() {
        Q8M q8m = new Q8M("google_onetap", 1);
        q8m.LIZ = false;
        q8m.LIZIZ = new C66504Q8e(4, "Google OneTap login cancelled");
        this.LJLIL.LJLJJL.hv0(new AuthResult(q8m));
    }

    public C66597QBt(GoogleOneTapAuth googleOneTapAuth) {
        this.LJLIL = googleOneTapAuth;
    }
}
