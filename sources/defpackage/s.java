package defpackage;

import X.InterfaceC88472Yns;
import X.ORZ;
import defpackage.PasskeyFrequencySettingsModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class s<E> extends CopyOnWriteArrayList<E> {
    public final int LJLIL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public s(int i) {
        this.LJLIL = i;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean add(E e) {
        boolean add = super.add(e);
        while (size() > this.LJLIL) {
            remove(ORZ.LJLLLL(this));
        }
        return add;
    }

    public final s<E> filter(InterfaceC88472Yns<? super E, Boolean> predicate) {
        o.LJIIIZ(predicate, "predicate");
        s<E> sVar = new s<>(this.LJLIL);
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (predicate.invoke(next).booleanValue()) {
                sVar.add(next);
            }
        }
        return sVar;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ E remove(int i) {
        return (E) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final void removeIfCompat(InterfaceC88472Yns<? super E, Boolean> predicate) {
        o.LJIIIZ(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            PasskeyFrequencySettingsModel.a aVar = (Object) it.next();
            if (!predicate.invoke(aVar).booleanValue()) {
                arrayList.add(aVar);
            }
        }
        clear();
        addAll(arrayList);
    }
}
