package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QmL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67993QmL extends AbstractC67820QjY {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC67754QiU LJ(Status status) {
        return status;
    }

    public C67993QmL(C67727Qi3 c67727Qi3) {
        super(c67727Qi3);
    }

    @Override // X.AbstractC67820QjY
    public final void LJIILL(C67929QlJ c67929QlJ) {
        BinderC68007QmZ binderC68007QmZ = new BinderC68007QmZ(this);
        Parcel LJLJI = c67929QlJ.LJLJI();
        C67988QmG.LIZLLL(LJLJI, binderC68007QmZ);
        c67929QlJ.LLJI(LJLJI, 4);
    }
}
