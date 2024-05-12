package X;

import com.bytedance.lobby.auth.AuthResult;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.R6k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69006R6k implements R6I {
    public static final List<Integer> LJLIL = C47261Igj.LJJIJIIJI(7, 8, 16, 12501, 12502);

    @Override // X.R6I
    public final void LJIILLIIL(AuthResult authResult, int i, C69008R6m c69008R6m) {
        int i2;
        String str;
        C69008R6m LIZIZ = C69007R6l.LIZIZ(this, authResult, c69008R6m, "google");
        if (LIZIZ == null) {
            return;
        }
        o.LJI(authResult);
        if (authResult.mIsSuccessful) {
            C69009R6n.LIZLLL(LIZIZ);
            return;
        }
        C66504Q8e c66504Q8e = authResult.mErrorCause;
        if (c66504Q8e != null) {
            i2 = c66504Q8e.getProviderErrorCode();
            c66504Q8e.getErrorCode();
            str = c66504Q8e.getMessage();
        } else {
            i2 = 0;
            str = null;
        }
        String LIZLLL = C012403c.LIZLLL("googleErrorCode: ", i2, ", errorDesc: ", str);
        if (authResult.mIsCancelled || LJLIL.contains(Integer.valueOf(i2))) {
            C69007R6l.LIZ(i, 2, "google", i2, str);
            C69009R6n.LIZIZ(LIZIZ, LIZLLL, i2, str);
        } else {
            V16.LJJJJZI(i2, str, "google");
            C69007R6l.LIZ(i, 1, "google", i2, str);
            C69009R6n.LIZJ(LIZIZ, LIZLLL, i2, str);
        }
    }
}
