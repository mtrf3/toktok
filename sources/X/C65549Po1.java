package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.Po1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65549Po1<T> extends AbstractC65550Po2<T> implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator<T> LJLIL;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        return this.LJLIL.toString();
    }

    public C65549Po1(Comparator<T> comparator) {
        comparator.getClass();
        this.LJLIL = comparator;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C65549Po1) {
            return this.LJLIL.equals(((C65549Po1) obj).LJLIL);
        }
        return false;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.LJLIL.compare(t, t2);
    }
}
