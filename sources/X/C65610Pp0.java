package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Pp0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65610Pp0<K, V> extends AbstractC65611Pp1<K, V> implements InterfaceC65637PpR<K, V> {
    public static final long serialVersionUID = 0;
    public transient C65610Pp0<V, K> LJLJLJ;

    public static <K, V> C65621PpB<K, V> builder() {
        return new C65621PpB<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1
    public C65610Pp0<V, K> inverse() {
        C65610Pp0<V, K> c65610Pp0 = this.LJLJLJ;
        if (c65610Pp0 == null) {
            C65621PpB builder = builder();
            AbstractC65557Po9 it = entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                builder.LJ(entry.getValue(), entry.getKey());
            }
            C65610Pp0<V, K> LIZLLL = builder.LIZLLL();
            LIZLLL.LJLJLJ = this;
            this.LJLJLJ = LIZLLL;
            return LIZLLL;
        }
        return c65610Pp0;
    }

    public static <K, V> C65610Pp0<K, V> of() {
        return C65627PpH.LJLJLLL;
    }

    public static C65610Pp0 LJII(Collection collection) {
        if (collection.isEmpty()) {
            return of();
        }
        C65534Pnm c65534Pnm = new C65534Pnm(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC65590Pog copyOf = AbstractC65590Pog.copyOf((Collection) entry.getValue());
            if (!copyOf.isEmpty()) {
                c65534Pnm.LIZIZ(key, copyOf);
                i += copyOf.size();
            }
        }
        return new C65610Pp0(c65534Pnm.LIZ(), i);
    }

    public static <K, V> C65610Pp0<K, V> copyOf(InterfaceC65633PpN<? extends K, ? extends V> interfaceC65633PpN) {
        if (interfaceC65633PpN.isEmpty()) {
            return of();
        }
        if (interfaceC65633PpN instanceof C65610Pp0) {
            C65610Pp0<K, V> c65610Pp0 = (C65610Pp0) interfaceC65633PpN;
            if (!c65610Pp0.LJLJJLL.LJ()) {
                return c65610Pp0;
            }
        }
        return LJII(interfaceC65633PpN.asMap().entrySet());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C65534Pnm builder = AbstractC65564PoG.builder();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C65587Pod builder2 = AbstractC65590Pog.builder();
                    int i3 = 0;
                    do {
                        builder2.LIZIZ(objectInputStream.readObject());
                        i3++;
                    } while (i3 < readInt2);
                    builder.LIZIZ(readObject, builder2.LJ());
                    i += readInt2;
                } else {
                    throw new InvalidObjectException(KMP.LJ("Invalid value count ", readInt2));
                }
            }
            try {
                C65625PpF.LIZ.LIZ(this, builder.LIZ());
                C65623PpD<AbstractC65611Pp1> c65623PpD = C65625PpF.LIZIZ;
                c65623PpD.getClass();
                try {
                    c65623PpD.LIZ.set(this, Integer.valueOf(i));
                    return;
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (IllegalArgumentException e2) {
                throw new InvalidObjectException(e2.getMessage()).initCause(e2);
            }
        }
        throw new InvalidObjectException(KMP.LJ("Invalid key count ", readInt));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C65612Pp2.LIZIZ(this, objectOutputStream);
    }

    @Override // X.AbstractC65611Pp1, X.InterfaceC65633PpN
    public AbstractC65590Pog<V> get(K k) {
        AbstractC65590Pog<V> abstractC65590Pog = (AbstractC65590Pog) this.LJLJJLL.get(k);
        if (abstractC65590Pog == null) {
            return AbstractC65590Pog.of();
        }
        return abstractC65590Pog;
    }

    @Override // X.AbstractC65611Pp1, X.InterfaceC65633PpN
    public AbstractC65590Pog<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C65610Pp0<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C65621PpB c65621PpB = new C65621PpB();
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            c65621PpB.LIZJ(it.next());
        }
        return c65621PpB.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.InterfaceC65633PpN
    public /* bridge */ /* synthetic */ AbstractC65578PoU get(Object obj) {
        return get((C65610Pp0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.InterfaceC65633PpN
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((C65610Pp0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.InterfaceC65633PpN
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return get((C65610Pp0<K, V>) obj);
    }

    public C65610Pp0(AbstractC65564PoG<K, AbstractC65590Pog<V>> abstractC65564PoG, int i) {
        super(abstractC65564PoG, i);
    }

    public static <K, V> C65610Pp0<K, V> of(K k, V v) {
        C65621PpB builder = builder();
        builder.LJ(k, v);
        return builder.LIZLLL();
    }

    @Override // X.AbstractC65611Pp1, X.AbstractC65632PpM
    public AbstractC65590Pog<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.AbstractC65632PpM
    public /* bridge */ /* synthetic */ AbstractC65578PoU replaceValues(Object obj, Iterable iterable) {
        return replaceValues((C65610Pp0<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.AbstractC65632PpM
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((C65610Pp0<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.AbstractC65632PpM
    public /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return replaceValues((C65610Pp0<K, V>) obj, iterable);
    }

    public static <K, V> C65610Pp0<K, V> of(K k, V v, K k2, V v2) {
        C65621PpB builder = builder();
        builder.LJ(k, v);
        builder.LJ(k2, v2);
        return builder.LIZLLL();
    }

    public static <K, V> C65610Pp0<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        C65621PpB builder = builder();
        builder.LJ(k, v);
        builder.LJ(k2, v2);
        builder.LJ(k3, v3);
        return builder.LIZLLL();
    }

    public static <K, V> C65610Pp0<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C65621PpB builder = builder();
        builder.LJ(k, v);
        builder.LJ(k2, v2);
        builder.LJ(k3, v3);
        builder.LJ(k4, v4);
        return builder.LIZLLL();
    }

    public static <K, V> C65610Pp0<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v6) {
        C65621PpB builder = builder();
        builder.LJ(k, v);
        builder.LJ(k2, v2);
        builder.LJ(k3, v3);
        builder.LJ(k4, v4);
        builder.LJ(k5, v6);
        return builder.LIZLLL();
    }
}
