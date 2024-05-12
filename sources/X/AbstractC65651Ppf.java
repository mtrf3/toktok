package X;

import defpackage.g0;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.Ppf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65651Ppf<E> extends AbstractC65653Pph<E> implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: X.Ppf$c */
    /* loaded from: classes12.dex */
    public abstract class c<T> implements Iterator<T> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            AbstractC65651Ppf.this.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final T next() {
            AbstractC65651Ppf.this.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            AbstractC65651Ppf.this.getClass();
            throw null;
        }

        public c() {
            AbstractC65651Ppf.this.getClass();
            throw null;
        }
    }

    public abstract void LJIIIZ();

    @Override // X.AbstractC65653Pph
    public final Iterator<E> LJII() {
        new C65711Pqd(this);
        throw null;
    }

    @Override // X.AbstractC65653Pph
    public final Iterator<InterfaceC65712Pqe<E>> LJIIIIZZ() {
        new C65710Pqc(this);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new C65650Ppe(this, entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC65672Pq0
    public final int size() {
        return C65713Pqf.LIZ(0L);
    }

    @Override // X.AbstractC65653Pph
    public final int LJFF() {
        throw null;
    }

    @Override // X.AbstractC65653Pph, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        LJIIIZ();
        if (readInt <= 0) {
            return;
        }
        add(objectInputStream.readObject(), objectInputStream.readInt());
        throw null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(entrySet().size());
        for (InterfaceC65712Pqe<E> interfaceC65712Pqe : entrySet()) {
            objectOutputStream.writeObject(interfaceC65712Pqe.LIZLLL());
            objectOutputStream.writeInt(interfaceC65712Pqe.getCount());
        }
    }

    @Override // X.InterfaceC65672Pq0
    public final int count(Object obj) {
        throw null;
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public final int add(E e, int i) {
        if (i != 0) {
            if (i > 0) {
                throw null;
            }
            throw new IllegalArgumentException(C76917UGr.LJIL("occurrences cannot be negative: %s", Integer.valueOf(i)));
        }
        throw null;
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public final int remove(Object obj, int i) {
        if (i != 0) {
            if (i > 0) {
                throw null;
            }
            throw new IllegalArgumentException(C76917UGr.LJIL("occurrences cannot be negative: %s", Integer.valueOf(i)));
        }
        throw null;
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public final int setCount(E e, int i) {
        g0.LJIIIIZZ(i, "count");
        throw null;
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public final boolean setCount(E e, int i, int i2) {
        g0.LJIIIIZZ(i, "oldCount");
        g0.LJIIIIZZ(i2, "newCount");
        throw null;
    }
}
