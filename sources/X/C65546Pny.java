package X;

import java.io.Serializable;

/* renamed from: X.Pny, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65546Pny extends AbstractC65550Po2<Comparable> implements Serializable {
    public static final C65546Pny LJLIL = new C65546Pny();
    public static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    private Object readResolve() {
        return LJLIL;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        obj.getClass();
        if (obj == comparable) {
            return 0;
        }
        return comparable.compareTo(obj);
    }
}
