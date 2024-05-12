package X;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.PrY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65768PrY<T> extends CopyOnWriteArrayList<T> {
    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean add(T t) {
        remove(t);
        return super.add(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        removeAll(elements);
        return super.addAll(elements);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }
}
