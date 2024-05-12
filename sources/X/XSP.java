package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XSP {
    public static XSQ LIZ() {
        if (XSQ.LIZ == null) {
            synchronized (XSQ.class) {
                if (XSQ.LIZ == null) {
                    XSQ.LIZ = new XSQ();
                }
            }
        }
        XSQ xsq = XSQ.LIZ;
        o.LJI(xsq);
        return xsq;
    }
}
