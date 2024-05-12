package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56632Kd {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String eventTitle, String enterFrom, String str) {
        o.LJIIIZ(eventTitle, "eventTitle");
        o.LJIIIZ(enterFrom, "enterFrom");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("enter_");
        LIZ2.append(eventTitle);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", str);
        FMX.LJIIL(LIZIZ, c188727au.LIZ);
    }
}
