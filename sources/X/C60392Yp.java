package X;

import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.2Yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60392Yp {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        LIZ(str, msg, 8);
    }

    public static void LIZ(String str, String msg, int i) {
        o.LJIIIZ(msg, "msg");
        if (!C60402Yq.LIZ) {
            return;
        }
        String LJFF = i0.LJFF("LFeedCorePrint>", str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(msg);
        LIZ2.append(" >>> ");
        LIZ2.append("");
        C36922EeM.LIZLLL(4, LJFF, X1D.LIZIZ(LIZ2));
    }
}
