package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public final class MAL implements InterfaceC252619vl {
    public static final MAL LJLIL = new MAL();

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 11) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("user_change::");
        LIZ.append(i);
        MCI.LJ(X1D.LIZIZ(LIZ));
    }
}
