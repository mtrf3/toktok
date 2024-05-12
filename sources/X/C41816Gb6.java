package X;

import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Gb6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41816Gb6 {
    public static volatile InterfaceC41817Gb7 LIZ = new C41814Gb4();

    public static void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        InterfaceC41817Gb7 interfaceC41817Gb7 = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("WaveDetail: ");
        LIZ2.append(msg);
        interfaceC41817Gb7.log(X1D.LIZIZ(LIZ2));
    }

    public static void LIZIZ(int i, String msg, Throwable th) {
        o.LJIIIZ(msg, "msg");
        String code = String.valueOf(i);
        o.LJIIIZ(code, "code");
        LIZ.LIZ(new C41815Gb5(i0.LJFF("WaveReporter | msg:", msg), code, th));
    }
}
