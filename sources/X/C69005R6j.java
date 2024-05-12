package X;

import com.bytedance.lobby.auth.AuthResult;
import kotlin.jvm.internal.o;

/* renamed from: X.R6j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69005R6j implements R6I {
    public static final String[] LJLIL = {"Authorize failed.", "Authorization failed, request was canceled.", "Failed to get authorization, bundle incomplete"};

    @Override // X.R6I
    public final void LJIILLIIL(AuthResult authResult, int i, C69008R6m c69008R6m) {
        String str;
        int i2;
        C69008R6m LIZIZ = C69007R6l.LIZIZ(this, authResult, c69008R6m, "twitter");
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
            i2 = c66504Q8e.getErrorCode();
            str = c66504Q8e.getMessage();
        } else {
            str = null;
            i2 = 0;
        }
        if (ORY.LJJIJIIJIL(str, LJLIL)) {
            C69009R6n.LIZIZ(LIZIZ, null, i2, str);
            C69007R6l.LIZ(i, 2, "twitter", i2, str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" | ");
        C66504Q8e c66504Q8e2 = authResult.mErrorCause;
        if (c66504Q8e2 != null && c66504Q8e2.getStackTrace() != null) {
            C66504Q8e c66504Q8e3 = authResult.mErrorCause;
            o.LJI(c66504Q8e3);
            StackTraceElement[] stackTrace = c66504Q8e3.getStackTrace();
            o.LJIIIIZZ(stackTrace, "authResult.errorCause!!.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        V16.LJJJLIIL(sb2, "twitter");
        C69007R6l.LIZ(i, 1, "twitter", -10000, sb2);
        C69009R6n.LIZJ(LIZIZ, sb2, i2, str);
    }
}
