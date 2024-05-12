package X;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QhB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67673QhB implements InterfaceC67754QiU {
    public final Status LJLIL;
    public final GoogleSignInAccount LJLILLLLZI;

    public C67673QhB(GoogleSignInAccount googleSignInAccount, Status status) {
        this.LJLILLLLZI = googleSignInAccount;
        this.LJLIL = status;
    }

    @Override // X.InterfaceC67754QiU
    public final Status getStatus() {
        return this.LJLIL;
    }
}
