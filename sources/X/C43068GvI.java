package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.GvI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43068GvI<T> extends HashSet<T> {
    public final InterfaceC88472Yns<T, Boolean> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C43068GvI() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43068GvI(InterfaceC88472Yns<? super T, Boolean> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        InterfaceC88472Yns<T, Boolean> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null && !interfaceC88472Yns.invoke(t).booleanValue()) {
            return false;
        }
        return super.add(t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return true;
    }

    public /* synthetic */ C43068GvI(InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC88472Yns);
    }
}
