package X;

import java.io.Serializable;

/* renamed from: X.Pnz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65547Pnz extends AbstractC65550Po2<Comparable> implements Serializable {
    public static final C65547Pnz LJLIL = new C65547Pnz();
    public static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural()";
    }

    private Object readResolve() {
        return LJLIL;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        obj2.getClass();
        return comparable.compareTo(obj2);
    }
}
