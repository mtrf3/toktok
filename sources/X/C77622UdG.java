package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UdG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77622UdG {
    public static C77518Uba LIZ(C77623UdH c77623UdH) {
        C77518Uba c77518Uba = new C77518Uba();
        String orderId = c77623UdH.getOrderId();
        o.LJIIIZ(orderId, "<set-?>");
        c77518Uba.LIZIZ = orderId;
        c77623UdH.getErrorCode();
        c77623UdH.getDetailCode();
        c77623UdH.getAction();
        c77518Uba.LIZ = c77623UdH.getException();
        return c77518Uba;
    }
}
