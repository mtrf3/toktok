package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XHA {
    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends XHD> E LIZ(XHD xhd, XHG<E> key) {
        o.LJIIIZ(key, "key");
        if (o.LJ(xhd.getKey(), key)) {
            return xhd;
        }
        return null;
    }

    public static XH8 LIZIZ(XHD xhd, XHG<?> key) {
        o.LJIIIZ(key, "key");
        if (o.LJ(xhd.getKey(), key)) {
            return XHC.LIZIZ;
        }
        return xhd;
    }
}
