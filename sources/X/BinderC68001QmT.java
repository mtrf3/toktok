package X;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QmT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class BinderC68001QmT extends BinderC68002QmU {
    public final /* synthetic */ C67987QmF LJLIL;

    public BinderC68001QmT(C67987QmF c67987QmF) {
        this.LJLIL = c67987QmF;
    }

    @Override // X.InterfaceC68006QmY
    public final void LJJL(Status status) {
        this.LJLIL.LIZ(new C68014Qmg(status, null));
    }

    @Override // X.BinderC68002QmU, X.InterfaceC68006QmY
    public final void I(Status status, Credential credential) {
        this.LJLIL.LIZ(new C68014Qmg(status, credential));
    }
}
