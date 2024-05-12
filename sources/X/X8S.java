package X;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8S {
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;

    public X8S(X8N config) {
        o.LJIIJ(config, "config");
        this.LIZ = C221108m2.LIZIZ(X8Z.LJLIL);
        this.LIZIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 845));
        X8G.LIZ = config;
        X8V x8v = C74782wc.LIZ().LIZ;
        x8v.getClass();
        x8v.LIZ = this;
        config.LIZ.registerActivityLifecycleCallbacks(new X8U(this));
    }

    public final void LIZIZ(X8X x8x, Bundle bundle) {
        ArrayList arrayList;
        String str;
        if (x8x.LJLJL != null) {
            x8x.LJLIL = true;
        }
        List<String> list = x8x.LJLJJI;
        if (list.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Object newInstance = Class.forName(it.next()).newInstance();
                o.LJFF(newInstance, "preload.newInstance()");
                arrayList.add(newInstance);
            }
        }
        x8x.LJLJI = arrayList;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                X8D x8d = (X8D) it2.next();
                if (x8d.enable(bundle)) {
                    X8N x8n = X8G.LIZ;
                    if (x8n != null) {
                        X8P<X8D> LIZ = x8n.LIZJ.LIZ(x8d, x8x, bundle);
                        if (LIZ != null) {
                            C36411bp c36411bp = LIZ.LJLJI;
                            InterfaceC74236TBo property = X8P.LJLJL[2];
                            c36411bp.getClass();
                            o.LJIIJ(property, "property");
                            c36411bp.LJLIL = new WeakReference(null);
                        }
                        X8E x8e = (X8E) this.LIZ.getValue();
                        if (LIZ != null) {
                            if (bundle != null) {
                                str = C44206HWo.LIZIZ(bundle);
                            } else {
                                str = null;
                            }
                            x8e.LIZ(x8x, x8d, LIZ, str);
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    } else {
                        o.LJIJI("config");
                        throw null;
                    }
                }
            }
        }
    }

    public final void LIZ(X8D x8d, Bundle bundle, X8Q x8q) {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        String str = null;
        X8X x8x = new X8X(c61878OQg, c61878OQg, null, null);
        x8x.LJLJI = C47261Igj.LJJIJ(x8d);
        if (!x8d.enable(bundle)) {
            return;
        }
        X8N x8n = X8G.LIZ;
        if (x8n != null) {
            X8P<X8D> LIZ = x8n.LIZJ.LIZ(x8d, x8x, bundle);
            if (LIZ != null) {
                C36411bp c36411bp = LIZ.LJLJI;
                InterfaceC74236TBo property = X8P.LJLJL[2];
                c36411bp.getClass();
                o.LJIIJ(property, "property");
                c36411bp.LJLIL = new WeakReference(x8q);
            }
            X8E x8e = (X8E) this.LIZ.getValue();
            if (LIZ != null) {
                if (bundle != null) {
                    str = C44206HWo.LIZIZ(bundle);
                }
                x8e.LIZ(x8x, x8d, LIZ, str);
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIJI("config");
        throw null;
    }
}
