package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.0M8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0M8<K, V> implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    public int LJLIL;
    public int LJLILLLLZI = -1;
    public boolean LJLJI;
    public final /* synthetic */ C0M9 LJLJJI;

    @Override // java.util.Map.Entry
    public final K getKey() {
        if (this.LJLJI) {
            return (K) this.LJLJJI.LIZIZ(this.LJLILLLLZI, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        if (this.LJLJI) {
            return (V) this.LJLJJI.LIZIZ(this.LJLILLLLZI, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI < this.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.LJLJI) {
            int i = 0;
            Object LIZIZ = this.LJLJJI.LIZIZ(this.LJLILLLLZI, 0);
            Object LIZIZ2 = this.LJLJJI.LIZIZ(this.LJLILLLLZI, 1);
            if (LIZIZ == null) {
                hashCode = 0;
            } else {
                hashCode = LIZIZ.hashCode();
            }
            if (LIZIZ2 != null) {
                i = LIZIZ2.hashCode();
            }
            return hashCode ^ i;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.LJLJI) {
            this.LJLJJI.LJII(this.LJLILLLLZI);
            this.LJLILLLLZI--;
            this.LJLIL--;
            this.LJLJI = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.LJLILLLLZI++;
            this.LJLJI = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getKey());
        LIZ.append("=");
        LIZ.append(getValue());
        return X1D.LIZIZ(LIZ);
    }

    public C0M8(C0M9 c0m9) {
        this.LJLJJI = c0m9;
        this.LJLIL = c0m9.LIZLLL() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.LJLJI) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object LIZIZ = this.LJLJJI.LIZIZ(this.LJLILLLLZI, 0);
            if (key != LIZIZ && (key == null || !key.equals(LIZIZ))) {
                return false;
            }
            Object value = entry.getValue();
            Object LIZIZ2 = this.LJLJJI.LIZIZ(this.LJLILLLLZI, 1);
            if (value != LIZIZ2 && (value == null || !value.equals(LIZIZ2))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (this.LJLJI) {
            return (V) this.LJLJJI.LJIIIIZZ(this.LJLILLLLZI, v);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
}
