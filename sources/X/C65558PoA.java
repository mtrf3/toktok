package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.PasskeyFrequencySettingsModel;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.PoA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65558PoA<E> extends AbstractCollection<E> {
    public final Collection<E> LJLIL;
    public final InterfaceC65503PnH<? super E> LJLILLLLZI;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection<E> collection = this.LJLIL;
        InterfaceC65503PnH<? super E> interfaceC65503PnH = this.LJLILLLLZI;
        if ((collection instanceof RandomAccess) && (collection instanceof List)) {
            List list = (List) collection;
            interfaceC65503PnH.getClass();
            int i = 0;
            int i2 = 0;
            while (i < list.size()) {
                PasskeyFrequencySettingsModel passkeyFrequencySettingsModel = (Object) ListProtector.get(list, i);
                if (!interfaceC65503PnH.apply(passkeyFrequencySettingsModel)) {
                    if (i > i2) {
                        try {
                            ListProtector.set(list, i2, passkeyFrequencySettingsModel);
                        } catch (IllegalArgumentException unused) {
                            C146165oS.LJ(list, interfaceC65503PnH, i2, i);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            C146165oS.LJ(list, interfaceC65503PnH, i2, i);
                            return;
                        }
                    }
                    i2++;
                }
                i++;
            }
            list.subList(i2, list.size()).clear();
            return;
        }
        Iterator<E> it = collection.iterator();
        interfaceC65503PnH.getClass();
        while (it.hasNext()) {
            if (interfaceC65503PnH.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection<E> collection = this.LJLIL;
        InterfaceC65503PnH<? super E> interfaceC65503PnH = this.LJLILLLLZI;
        Iterator<E> it = collection.iterator();
        C76917UGr.LJII(interfaceC65503PnH, "predicate");
        boolean z = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (interfaceC65503PnH.apply(it.next())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            z = true;
        }
        return true ^ z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.LJLIL.iterator();
        InterfaceC65503PnH<? super E> interfaceC65503PnH = this.LJLILLLLZI;
        it.getClass();
        interfaceC65503PnH.getClass();
        return new C65553Po5(it, interfaceC65503PnH);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.LJLIL.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.LJLILLLLZI.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        C65631PpL.LIZ(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        C76917UGr.LJ(this.LJLILLLLZI.apply(e));
        return this.LJLIL.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            C76917UGr.LJ(this.LJLILLLLZI.apply(it.next()));
        }
        return this.LJLIL.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Collection<E> collection = this.LJLIL;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.LJLILLLLZI.apply(obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (contains(obj) && this.LJLIL.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.LJLIL.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.LJLILLLLZI.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.LJLIL.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.LJLILLLLZI.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        C65631PpL.LIZ(arrayList, it);
        return (T[]) arrayList.toArray(tArr);
    }

    public C65558PoA(Collection<E> collection, InterfaceC65503PnH<? super E> interfaceC65503PnH) {
        this.LJLIL = collection;
        this.LJLILLLLZI = interfaceC65503PnH;
    }
}
