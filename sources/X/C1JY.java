package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1JY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JY implements InterfaceC07280Qi, Iterable<Map.Entry<? extends C07270Qh<?>, ? extends Object>>, InterfaceC90533gv {
    public final java.util.Map<C07270Qh<?>, Object> LJLIL = new LinkedHashMap();
    public boolean LJLILLLLZI;
    public boolean LJLJI;

    public final int hashCode() {
        return C16880lQ.LLJILJIL(this.LJLJI) + C07250Qf.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends C07270Qh<?>, ? extends Object>> iterator() {
        return ((LinkedHashMap) this.LJLIL).entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.LJLILLLLZI) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.LJLJI) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LJLIL).entrySet()) {
            C07270Qh c07270Qh = (C07270Qh) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(c07270Qh.LIZ);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C78880UxY.LJLI(this));
        LIZ.append("{ ");
        LIZ.append((Object) sb);
        LIZ.append(" }");
        return X1D.LIZIZ(LIZ);
    }

    public final <T> boolean LJII(C07270Qh<T> key) {
        o.LJIIIZ(key, "key");
        return this.LJLIL.containsKey(key);
    }

    public final <T> T LJIIIIZZ(C07270Qh<T> key) {
        o.LJIIIZ(key, "key");
        T t = (T) ((LinkedHashMap) this.LJLIL).get(key);
        if (t != null) {
            return t;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Key not present: ");
        LIZ.append(key);
        LIZ.append(" - consider getOrElse or getOrNull");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1JY)) {
            return false;
        }
        C1JY c1jy = (C1JY) obj;
        if (o.LJ(this.LJLIL, c1jy.LJLIL) && this.LJLILLLLZI == c1jy.LJLILLLLZI && this.LJLJI == c1jy.LJLJI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC07280Qi
    public final <T> void LIZJ(C07270Qh<T> key, T t) {
        o.LJIIIZ(key, "key");
        this.LJLIL.put(key, t);
    }
}
