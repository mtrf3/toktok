package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QmD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67985QmD extends AbstractC67751QiR {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC67754QiU LJ(Status status) {
        return status;
    }

    public C67985QmD(C67727Qi3 c67727Qi3) {
        super(c67727Qi3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC67748QiO
    public final void LJIILIIL(InterfaceC67836Qjo interfaceC67836Qjo) {
        C67704Qhg c67704Qhg = (C67704Qhg) interfaceC67836Qjo;
        C68000QmS c68000QmS = (C68000QmS) c67704Qhg.LJJIIJ();
        BinderC68004QmW binderC68004QmW = new BinderC68004QmW(this);
        GoogleSignInOptions googleSignInOptions = c67704Qhg.LLIIIL;
        Parcel LJLJI = c68000QmS.LJLJI();
        C67988QmG.LIZLLL(LJLJI, binderC68004QmW);
        C67988QmG.LIZJ(LJLJI, googleSignInOptions);
        c68000QmS.LLJI(LJLJI, 103);
    }
}
