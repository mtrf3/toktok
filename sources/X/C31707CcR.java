package X;

import android.content.Context;

/* renamed from: X.CcR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31707CcR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str) {
        if (context == null) {
            C0NB.LJ(str, "context == null");
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("context != null,class:");
        LIZ2.append(context.getClass());
        C0NB.LJ(str, X1D.LIZIZ(LIZ2));
    }
}
