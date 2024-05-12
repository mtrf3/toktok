package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.G1o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40852G1o implements InterfaceC252619vl {
    public final /* synthetic */ C40842G1e LJLIL;

    public C40852G1o(C40842G1e c40842G1e) {
        this.LJLIL = c40842G1e;
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
