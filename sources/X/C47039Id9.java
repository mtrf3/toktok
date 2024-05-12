package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.Id9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47039Id9<T> {
    public final int LIZ;
    public final InterfaceC47037Id7<T> LIZIZ;
    public final Queue<T> LIZJ = new LinkedList();

    public final int LIZJ() {
        return ((LinkedList) this.LIZJ).size();
    }

    public final T LIZLLL() {
        return (T) ((LinkedList) this.LIZJ).poll();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CachePoolImpl@");
        LIZ.append(Integer.toHexString(hashCode()));
        LIZ.append(" [\n");
        StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
        for (T t : this.LIZJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('\t');
            LIZ2.append(t);
            LIZ2.append(",\n");
            sb.append(X1D.LIZIZ(LIZ2));
        }
        return C0EH.LIZJ(sb, "]", "sb.toString()");
    }

    public final void LIZ(InterfaceC88472Yns<? super T, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        Iterator<T> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public final boolean LIZIZ(T t) {
        if (t == null) {
            return false;
        }
        return ((LinkedList) this.LIZJ).remove(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public final T LJ(InterfaceC88472Yns<? super T, Boolean> filter) {
        o.LJIIIZ(filter, "filter");
        for (T t : this.LIZJ) {
            if (filter.invoke(t).booleanValue()) {
                if (t != 0) {
                    ((LinkedList) this.LIZJ).remove(t);
                    return t;
                }
                return t;
            }
        }
        return null;
    }

    public C47039Id9(int i, C47704Ins c47704Ins) {
        this.LIZ = i;
        this.LIZIZ = c47704Ins;
    }
}
