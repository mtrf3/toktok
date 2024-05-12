package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.aeq, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94304aeq implements LEA {
    public static final ConcurrentHashMap<String, Boolean> LJLIL;

    static {
        C94304aeq c94304aeq = new C94304aeq();
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(c94304aeq);
        LJLIL = new ConcurrentHashMap<>();
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        LJLIL.clear();
    }
}
