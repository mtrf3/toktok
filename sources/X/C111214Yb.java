package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111214Yb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(": ");
        LIZ2.append(msg);
        LIZ2.append(' ');
        C34B.LIZJ("Camera", X1D.LIZIZ(LIZ2));
    }

    public static void LIZIZ(String str, Throwable th) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(": ");
        LIZ2.append(th);
        LIZ2.append(' ');
        C34B.LIZJ("Camera", X1D.LIZIZ(LIZ2));
    }

    public static void LIZJ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(": ");
        LIZ2.append(msg);
        LIZ2.append(' ');
        C34B.LJI("Camera", X1D.LIZIZ(LIZ2));
    }
}
