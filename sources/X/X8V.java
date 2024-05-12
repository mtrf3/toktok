package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8V {
    public X8S LIZ;

    public final void LIZ(Bundle bundle, Class<? extends X8D> clazz, X8Q x8q) {
        o.LJIIJ(clazz, "clazz");
        C84339X8d.LIZJ.getClass();
        if (C84339X8d.LIZ != null) {
            try {
                X8S x8s = this.LIZ;
                if (x8s != null) {
                    X8D newInstance = clazz.newInstance();
                    o.LJFF(newInstance, "clazz.newInstance()");
                    x8s.LIZ(newInstance, bundle, x8q);
                    return;
                }
                o.LJIJI("preloadProxy");
                throw null;
            } catch (Exception e) {
                X8G.LIZ(e);
            }
        }
    }
}
