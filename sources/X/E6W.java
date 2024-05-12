package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes7.dex */
public final class E6W implements LEA {
    public static final E6W LJLIL = new E6W();

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (!z) {
            return;
        }
        if (i != 1 && i != 2) {
            return;
        }
        C1DJ.LJI("account_change", true);
    }
}
