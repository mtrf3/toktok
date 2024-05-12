package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public final class LRE implements LEA {
    public final /* synthetic */ LR0 LJLIL;

    public LRE(LR0 lr0) {
        this.LJLIL = lr0;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z && i == 1) {
            this.LJLIL.LJIJ();
        }
    }
}
