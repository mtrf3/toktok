package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.QPg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66948QPg implements LEA {
    public final /* synthetic */ C66946QPe LJLIL;

    public C66948QPg(C66946QPe c66946QPe) {
        this.LJLIL = c66946QPe;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 1 && i != 2) {
            return;
        }
        this.LJLIL.LJ();
    }
}
