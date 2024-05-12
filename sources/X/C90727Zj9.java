package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.Zj9, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90727Zj9 extends AbstractList<String> implements RandomAccess, InterfaceC90398Zdq {
    public final InterfaceC90398Zdq LJLIL;

    @Override // X.InterfaceC90398Zdq
    public final InterfaceC90398Zdq LIZLLL() {
        return this;
    }

    @Override // X.InterfaceC90398Zdq
    public final List<?> LJI() {
        return this.LJLIL.LJI();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C90336Zcq(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLIL.size();
    }

    public C90727Zj9(InterfaceC90398Zdq interfaceC90398Zdq) {
        this.LJLIL = interfaceC90398Zdq;
    }

    @Override // X.InterfaceC90398Zdq
    public final Object LJIJJ(int i) {
        return this.LJLIL.LJIJJ(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C90900Zlw) this.LJLIL).get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C90328Zci(this, i);
    }
}
