package X;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.Vqv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81017Vqv<T> extends ArrayList<T> {
    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        remove(t);
        return super.add(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        removeAll(elements);
        return super.addAll(elements);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }
}
