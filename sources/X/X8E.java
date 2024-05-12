package X;

import Y.ARunnableS51S0100000_15;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8E {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(X8H.LJLIL);

    public final HashMap<X8X, java.util.Set<X8F>> LIZJ() {
        return (HashMap) this.LIZ.getValue();
    }

    public final java.util.Set<X8F> LIZIZ(X8X x8x) {
        return LIZJ().get(x8x);
    }

    public final X8X LIZLLL(String str) {
        java.util.Set<X8X> keySet = LIZJ().keySet();
        o.LJFF(keySet, "map.keys");
        for (X8X x8x : keySet) {
            if (o.LJ(str, x8x.LJLJJLL)) {
                return x8x;
            }
        }
        return null;
    }

    public final X8X LJ(String str) {
        java.util.Set<X8X> keySet = LIZJ().keySet();
        o.LJFF(keySet, "map.keys");
        for (X8X x8x : keySet) {
            if (o.LJ(str, x8x.LJLJL)) {
                return x8x;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(X8X x8x, X8D x8d, X8P<?> task, String str) {
        X8F x8f;
        o.LJIIJ(task, "task");
        if (LIZJ().containsKey(x8x)) {
            java.util.Set<X8F> set = LIZJ().get(x8x);
            if (set != null) {
                Iterator<X8F> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        x8f = it.next();
                        if (x8f.L(x8d.getClass(), str)) {
                            break;
                        }
                    } else {
                        x8f = null;
                        break;
                    }
                }
                X8F x8f2 = x8f;
                if (x8f2 == null) {
                    if (set != null) {
                        X8F x8f3 = new X8F(x8d.getClass(), str);
                        x8f3.LJLIL = task;
                        set.add(x8f3);
                    }
                } else {
                    new AqS165S0100000_15(task, 875);
                    C84339X8d.LIZJ.getClass();
                    if (C84339X8d.LIZ == null || X8G.LIZ != null) {
                        x8f2.LJLIL = task;
                    } else {
                        o.LJIJI("config");
                        throw null;
                    }
                }
            }
        } else {
            HashMap<X8X, java.util.Set<X8F>> LIZJ = LIZJ();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            new X8F(x8d.getClass(), str);
            LIZJ.put(x8x, linkedHashSet);
        }
        X8N x8n = X8G.LIZ;
        if (x8n != null) {
            x8n.LIZLLL.invoke().execute(new ARunnableS51S0100000_15(task, 107));
        } else {
            o.LJIJI("config");
            throw null;
        }
    }
}
