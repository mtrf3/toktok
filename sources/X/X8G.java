package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8G {
    public static X8N LIZ;

    public static void LIZ(Exception exc) {
        C84339X8d.LIZJ.getClass();
        if (C84339X8d.LIZ != null) {
            X8N x8n = LIZ;
            if (x8n != null) {
                if (x8n.LIZIZ) {
                    throw exc;
                }
            } else {
                o.LJIJI("config");
                throw null;
            }
        }
        C16880lQ.LLLLIIL(exc);
    }
}
