package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.G1p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40853G1p implements InterfaceC252619vl {
    public final /* synthetic */ C40841G1d LJLIL;

    public C40853G1p(C40841G1d c40841G1d) {
        this.LJLIL = c40841G1d;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Account onChanged type:");
        LIZ.append(i);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        if (i != 4 && i != 12) {
            return;
        }
        this.LJLIL.LIZLLL();
    }
}
