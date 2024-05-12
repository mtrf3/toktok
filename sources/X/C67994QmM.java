package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbu;

/* renamed from: X.QmM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67994QmM extends AbstractC67820QjY {
    public final /* synthetic */ Credential LJIILLIIL;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC67754QiU LJ(Status status) {
        return status;
    }

    @Override // X.AbstractC67820QjY
    public final void LJIILL(C67929QlJ c67929QlJ) {
        BinderC68007QmZ binderC68007QmZ = new BinderC68007QmZ(this);
        zbu zbuVar = new zbu(this.LJIILLIIL);
        Parcel LJLJI = c67929QlJ.LJLJI();
        C67988QmG.LIZLLL(LJLJI, binderC68007QmZ);
        C67988QmG.LIZJ(LJLJI, zbuVar);
        c67929QlJ.LLJI(LJLJI, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67994QmM(C67727Qi3 c67727Qi3, Credential credential) {
        super(c67727Qi3);
        this.LJIILLIIL = credential;
    }
}
