package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ib4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46910Ib4 {
    public static float LIZ(InterfaceC46904Iay interfaceC46904Iay) {
        o.LJIIIZ(interfaceC46904Iay, "this");
        if (interfaceC46904Iay.LIZLLL() <= 0 || interfaceC46904Iay.LIZIZ() <= 0) {
            return 0.0f;
        }
        if (interfaceC46904Iay.LIZIZ() >= interfaceC46904Iay.LIZLLL()) {
            return 1.0f;
        }
        return (((float) interfaceC46904Iay.LIZIZ()) * 1.0f) / ((float) interfaceC46904Iay.LIZLLL());
    }
}
