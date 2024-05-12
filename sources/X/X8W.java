package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8W {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C84336X8a.LJLIL);
    public final X8V LIZ;

    public final void LIZIZ(Bundle bundle, Class<? extends X8D> clazz, X8Q x8q) {
        o.LJIIJ(clazz, "clazz");
        this.LIZ.LIZ(bundle, clazz, x8q);
    }

    public X8W(X8V x8v) {
        this.LIZ = x8v;
    }

    public final void LIZ(Bundle bundle, Class<? extends X8D> cls) {
        X8V x8v = this.LIZ;
        x8v.getClass();
        x8v.LIZ(bundle, cls, null);
    }

    public final void LIZJ(String str, Class<? extends Activity> cls, Class<? extends Fragment> cls2, Bundle bundle) {
        X8X LIZ;
        X8V x8v = this.LIZ;
        x8v.getClass();
        C84339X8d.LIZJ.getClass();
        if (C84339X8d.LIZ != null && (LIZ = C84343X8h.LIZ(str)) != null && o.LJ(LIZ.LJLJL, cls2.getName())) {
            if (bundle != null) {
                try {
                    C78847Ux1.LJJIJLIJ(bundle);
                } catch (Exception e) {
                    X8G.LIZ(e);
                    return;
                }
            }
            LIZ.LJLJJLL = cls.getName();
            X8S x8s = x8v.LIZ;
            if (x8s != null) {
                x8s.LIZIZ(LIZ, bundle);
            } else {
                o.LJIJI("preloadProxy");
                throw null;
            }
        }
    }
}
