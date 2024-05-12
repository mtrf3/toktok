package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.XLs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84692XLs extends AbstractList<String> implements InterfaceC84696XLw, RandomAccess {
    public final InterfaceC84696XLw LJLIL;

    @Override // X.InterfaceC84696XLw
    public final InterfaceC84696XLw LJJIIJZLJL() {
        return this;
    }

    @Override // X.InterfaceC84696XLw
    public final List<?> LJJIJIIJIL() {
        return this.LJLIL.LJJIJIIJIL();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C84694XLu(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLIL.size();
    }

    public C84692XLs(InterfaceC84696XLw interfaceC84696XLw) {
        this.LJLIL = interfaceC84696XLw;
    }

    @Override // X.InterfaceC84696XLw
    public final Object LJJ(int i) {
        return this.LJLIL.LJJ(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return this.LJLIL.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C84693XLt(this, i);
    }
}
