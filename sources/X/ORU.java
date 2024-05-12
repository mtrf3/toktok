package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public final class ORU<T> extends AbstractList<T> implements RandomAccess, Serializable {
    public final ArrayList<T> LJLIL;

    private Object writeReplace() {
        return Collections.unmodifiableList(this.LJLIL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.LJLIL.toArray();
    }

    public ORU(List<T> list) {
        this.LJLIL = new ArrayList<>(list);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) ListProtector.get(this.LJLIL, i);
    }
}
