package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public final class ORT<T> extends AbstractList<T> implements RandomAccess, Serializable {
    public final List<T> LJLIL;
    public List<T> LJLILLLLZI;

    private Object writeReplace() {
        return new ArrayList(this.LJLILLLLZI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLILLLLZI.size();
    }

    public ORT(List<T> list) {
        this.LJLIL = list;
        this.LJLILLLLZI = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) ListProtector.get(this.LJLILLLLZI, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        if (this.LJLILLLLZI == this.LJLIL) {
            this.LJLILLLLZI = new ArrayList(this.LJLIL);
        }
        return (T) ListProtector.remove(this.LJLILLLLZI, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        if (this.LJLILLLLZI == this.LJLIL) {
            this.LJLILLLLZI = new ArrayList(this.LJLIL);
        }
        ListProtector.add(this.LJLILLLLZI, i, t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        if (this.LJLILLLLZI == this.LJLIL) {
            this.LJLILLLLZI = new ArrayList(this.LJLIL);
        }
        return (T) ListProtector.set(this.LJLILLLLZI, i, t);
    }
}
