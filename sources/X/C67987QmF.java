package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QmF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67987QmF extends AbstractC67820QjY {
    public final /* synthetic */ CredentialRequest LJIILLIIL;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC67754QiU LJ(Status status) {
        return new C68014Qmg(status, null);
    }

    @Override // X.AbstractC67820QjY
    public final void LJIILL(C67929QlJ c67929QlJ) {
        BinderC68001QmT binderC68001QmT = new BinderC68001QmT(this);
        CredentialRequest credentialRequest = this.LJIILLIIL;
        Parcel LJLJI = c67929QlJ.LJLJI();
        C67988QmG.LIZLLL(LJLJI, binderC68001QmT);
        C67988QmG.LIZJ(LJLJI, credentialRequest);
        c67929QlJ.LLJI(LJLJI, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67987QmF(C67727Qi3 c67727Qi3, CredentialRequest credentialRequest) {
        super(c67727Qi3);
        this.LJIILLIIL = credentialRequest;
    }
}
