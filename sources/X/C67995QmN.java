package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbp;

/* renamed from: X.QmN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67995QmN extends AbstractC67820QjY {
    public final /* synthetic */ Credential LJIILLIIL;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC67754QiU LJ(Status status) {
        return status;
    }

    @Override // X.AbstractC67820QjY
    public final void LJIILL(C67929QlJ c67929QlJ) {
        BinderC68007QmZ binderC68007QmZ = new BinderC68007QmZ(this);
        zbp zbpVar = new zbp(this.LJIILLIIL);
        Parcel LJLJI = c67929QlJ.LJLJI();
        C67988QmG.LIZLLL(LJLJI, binderC68007QmZ);
        C67988QmG.LIZJ(LJLJI, zbpVar);
        c67929QlJ.LLJI(LJLJI, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67995QmN(C67727Qi3 c67727Qi3, Credential credential) {
        super(c67727Qi3);
        this.LJIILLIIL = credential;
    }
}
