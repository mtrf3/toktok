package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QmE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67986QmE extends AbstractC67751QiR {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC67754QiU LJ(Status status) {
        return status;
    }

    public C67986QmE(AbstractC67709Qhl abstractC67709Qhl) {
        super(abstractC67709Qhl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC67748QiO
    public final void LJIILIIL(InterfaceC67836Qjo interfaceC67836Qjo) {
        C67704Qhg c67704Qhg = (C67704Qhg) interfaceC67836Qjo;
        C68000QmS c68000QmS = (C68000QmS) c67704Qhg.LJJIIJ();
        BinderC68003QmV binderC68003QmV = new BinderC68003QmV(this);
        GoogleSignInOptions googleSignInOptions = c67704Qhg.LLIIIL;
        Parcel LJLJI = c68000QmS.LJLJI();
        C67988QmG.LIZLLL(LJLJI, binderC68003QmV);
        C67988QmG.LIZJ(LJLJI, googleSignInOptions);
        c68000QmS.LLJI(LJLJI, 102);
    }
}
