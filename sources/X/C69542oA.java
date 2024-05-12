package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2oA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69542oA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("@RelStorage_");
        LIZ2.append(str);
        C221018lt.LJFF(X1D.LIZIZ(LIZ2), msg);
    }

    public static void LIZ(String str, String msg, Throwable th) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("@RelStorage_");
        LIZ2.append(str);
        C221018lt.LIZJ(X1D.LIZIZ(LIZ2), msg, th);
    }
}
