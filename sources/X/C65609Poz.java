package X;

import defpackage.b0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Poz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65609Poz<K, V> extends AbstractC65611Pp1<K, V> implements InterfaceC65628PpI<K, V> {
    public static final long serialVersionUID = 0;
    public final transient AbstractC65583PoZ<V> LJLJLJ;
    public transient C65609Poz<V, K> LJLJLLL;
    public transient C65615Pp5 LJLL;

    public static <K, V> C65619Pp9<K, V> builder() {
        return new C65619Pp9<>();
    }

    @Override // X.AbstractC65611Pp1, X.AbstractC65632PpM, X.InterfaceC65633PpN
    public AbstractC65583PoZ<Map.Entry<K, V>> entries() {
        C65615Pp5 c65615Pp5 = this.LJLL;
        if (c65615Pp5 == null) {
            C65615Pp5 c65615Pp52 = new C65615Pp5(this);
            this.LJLL = c65615Pp52;
            return c65615Pp52;
        }
        return c65615Pp5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1
    public C65609Poz<V, K> inverse() {
        C65609Poz<V, K> c65609Poz = this.LJLJLLL;
        if (c65609Poz == null) {
            C65619Pp9 builder = builder();
            Iterator it = entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                builder.LJ(entry.getValue(), entry.getKey());
            }
            C65609Poz<V, K> LIZLLL = builder.LIZLLL();
            LIZLLL.LJLJLLL = this;
            this.LJLJLLL = LIZLLL;
            return LIZLLL;
        }
        return c65609Poz;
    }

    public static <K, V> C65609Poz<K, V> of() {
        return C65565PoH.LJLLI;
    }

    public static C65609Poz LJII(Collection collection) {
        if (collection.isEmpty()) {
            return of();
        }
        C65534Pnm c65534Pnm = new C65534Pnm(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC65583PoZ copyOf = AbstractC65583PoZ.copyOf((Collection) entry.getValue());
            if (!copyOf.isEmpty()) {
                c65534Pnm.LIZIZ(key, copyOf);
                i += copyOf.size();
            }
        }
        return new C65609Poz(c65534Pnm.LIZ(), i);
    }

    public static <K, V> C65609Poz<K, V> copyOf(InterfaceC65633PpN<? extends K, ? extends V> interfaceC65633PpN) {
        interfaceC65633PpN.getClass();
        if (interfaceC65633PpN.isEmpty()) {
            return of();
        }
        if (interfaceC65633PpN instanceof C65609Poz) {
            C65609Poz<K, V> c65609Poz = (C65609Poz) interfaceC65633PpN;
            if (!c65609Poz.LJLJJLL.LJ()) {
                return c65609Poz;
            }
        }
        return LJII(interfaceC65633PpN.asMap().entrySet());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        Object LJIILLIIL;
        C65584Poa c65588Poe;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C65534Pnm builder = AbstractC65564PoG.builder();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        c65588Poe = new C65584Poa();
                    } else {
                        c65588Poe = new C65588Poe(comparator);
                    }
                    int i3 = 0;
                    do {
                        c65588Poe.LIZLLL(objectInputStream.readObject());
                        i3++;
                    } while (i3 < readInt2);
                    AbstractC65583PoZ LJFF = c65588Poe.LJFF();
                    if (LJFF.size() == readInt2) {
                        builder.LIZIZ(readObject, LJFF);
                        i += readInt2;
                    } else {
                        throw new InvalidObjectException(b0.LIZIZ("Duplicate key-value pairs exist for key ", readObject));
                    }
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
                    C65623PpD<C65609Poz> c65623PpD2 = C65626PpG.LIZ;
                    if (comparator == null) {
                        LJIILLIIL = AbstractC65583PoZ.of();
                    } else {
                        LJIILLIIL = AbstractC65591Poh.LJIILLIIL(comparator);
                    }
                    c65623PpD2.LIZ(this, LJIILLIIL);
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
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        AbstractC65583PoZ<V> abstractC65583PoZ = this.LJLJLJ;
        if (abstractC65583PoZ instanceof AbstractC65591Poh) {
            comparator = ((AbstractC65591Poh) abstractC65583PoZ).comparator();
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        C65612Pp2.LIZIZ(this, objectOutputStream);
    }

    @Override // X.AbstractC65611Pp1, X.InterfaceC65633PpN
    public AbstractC65583PoZ<V> get(K k) {
        return (AbstractC65583PoZ) C65749PrF.LIZ(this.LJLJJLL.get(k), this.LJLJLJ);
    }

    @Override // X.AbstractC65611Pp1, X.InterfaceC65633PpN
    public AbstractC65583PoZ<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C65609Poz<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C65619Pp9 c65619Pp9 = new C65619Pp9();
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            c65619Pp9.LIZJ(it.next());
        }
        return c65619Pp9.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.InterfaceC65633PpN
    public /* bridge */ /* synthetic */ AbstractC65578PoU get(Object obj) {
        return get((C65609Poz<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.InterfaceC65633PpN
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((C65609Poz<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.InterfaceC65633PpN
    public /* bridge */ /* synthetic */ java.util.Set get(Object obj) {
        return get((C65609Poz<K, V>) obj);
    }

    public C65609Poz(AbstractC65564PoG abstractC65564PoG, int i) {
        super(abstractC65564PoG, i);
        this.LJLJLJ = AbstractC65583PoZ.of();
    }

    public static <K, V> C65609Poz<K, V> of(K k, V v) {
        C65619Pp9 builder = builder();
        builder.LJ(k, v);
        return builder.LIZLLL();
    }

    @Override // X.AbstractC65611Pp1, X.AbstractC65632PpM
    public AbstractC65583PoZ<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.AbstractC65632PpM
    public /* bridge */ /* synthetic */ AbstractC65578PoU replaceValues(Object obj, Iterable iterable) {
        return replaceValues((C65609Poz<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.AbstractC65632PpM
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((C65609Poz<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65611Pp1, X.AbstractC65632PpM
    public /* bridge */ /* synthetic */ java.util.Set replaceValues(Object obj, Iterable iterable) {
        return replaceValues((C65609Poz<K, V>) obj, iterable);
    }

    public static <K, V> C65609Poz<K, V> of(K k, V v, K k2, V v2) {
        C65619Pp9 builder = builder();
        builder.LJ(k, v);
        builder.LJ(k2, v2);
        return builder.LIZLLL();
    }

    public static <K, V> C65609Poz<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        C65619Pp9 builder = builder();
        builder.LJ(k, v);
        builder.LJ(k2, v2);
        builder.LJ(k3, v3);
        return builder.LIZLLL();
    }

    public static <K, V> C65609Poz<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C65619Pp9 builder = builder();
        builder.LJ(k, v);
        builder.LJ(k2, v2);
        builder.LJ(k3, v3);
        builder.LJ(k4, v4);
        return builder.LIZLLL();
    }

    public static <K, V> C65609Poz<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v6) {
        C65619Pp9 builder = builder();
        builder.LJ(k, v);
        builder.LJ(k2, v2);
        builder.LJ(k3, v3);
        builder.LJ(k4, v4);
        builder.LJ(k5, v6);
        return builder.LIZLLL();
    }
}
