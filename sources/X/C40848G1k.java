package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.G1k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40848G1k implements InterfaceC252619vl {
    public final /* synthetic */ C40840G1c LJLIL;

    public C40848G1k(C40840G1c c40840G1c) {
        this.LJLIL = c40840G1c;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loginListener onChanged type：");
        LIZ.append(i);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        if (i != 4 && i != 12) {
            return;
        }
        this.LJLIL.LJIIIIZZ();
    }
}
