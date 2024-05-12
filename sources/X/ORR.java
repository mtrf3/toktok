package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ORR<T> extends ORP<T> {
    public final List<T> LJLIL;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // X.ORP
    public final int getSize() {
        return this.LJLIL.size();
    }

    public ORR(List<T> delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LJLIL = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) ListProtector.get(this.LJLIL, ORS.LJJZZI(i, this));
    }

    @Override // X.ORP
    public final T removeAt(int i) {
        return (T) ListProtector.remove(this.LJLIL, ORS.LJJZZI(i, this));
    }

    @Override // X.ORP, java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        List<T> list = this.LJLIL;
        if (new C40517FvF(0, size()).LJIILJJIL(i)) {
            ListProtector.add(list, size() - i, t);
            return;
        }
        StringBuilder LJ = C7MY.LJ("Position index ", i, " must be in range [");
        LJ.append(new C40517FvF(0, size()));
        LJ.append("].");
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
    }

    @Override // X.ORP, java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return (T) ListProtector.set(this.LJLIL, ORS.LJJZZI(i, this), t);
    }
}
