package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XBf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84419XBf {
    public static XBE LIZ() {
        XBE xbe = XBE.LJII;
        if (xbe != null) {
            return xbe;
        }
        throw new IllegalStateException("AlgorithmManager has not initialized,call AlgorithmManager#initialize first!");
    }

    public static boolean LIZJ() {
        if (XBE.LJII != null) {
            return true;
        }
        return false;
    }

    public final synchronized void LIZIZ(XCG config) {
        o.LJIIJ(config, "config");
        if (XBE.LJII == null) {
            XBE.LJII = new XBE(config);
        } else {
            throw new IllegalStateException("Duplicate initialization");
        }
    }
}
