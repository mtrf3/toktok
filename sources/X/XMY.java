package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XMY {
    public static <E extends XMZ> boolean LIZ(XMV<E> xmv, InterfaceC57784Mm4 other) {
        XMV xmv2;
        XMZ LIZLLL;
        o.LJIIIZ(other, "other");
        String str = null;
        if ((other instanceof XMV) && (xmv2 = (XMV) other) != null && (LIZLLL = xmv2.LIZLLL()) != null) {
            str = LIZLLL.getId();
        }
        return o.LJ(str, xmv.LIZLLL().getId());
    }
}
