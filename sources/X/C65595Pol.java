package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.Pol, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65595Pol<E> extends AbstractC65590Pog<E> {
    public final transient int LJLJI;
    public final transient int LJLJJI;
    public final /* synthetic */ AbstractC65590Pog LJLJJL;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC65590Pog, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // X.AbstractC65590Pog, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJI;
    }

    @Override // java.util.List
    public final E get(int i) {
        C76917UGr.LJFF(i, this.LJLJJI);
        return this.LJLJJL.get(i + this.LJLJI);
    }

    @Override // X.AbstractC65590Pog, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    @Override // X.AbstractC65590Pog, java.util.List
    public final AbstractC65590Pog<E> subList(int i, int i2) {
        C76917UGr.LJIIIZ(i, i2, this.LJLJJI);
        AbstractC65590Pog abstractC65590Pog = this.LJLJJL;
        int i3 = this.LJLJI;
        return abstractC65590Pog.subList(i + i3, i2 + i3);
    }

    @Override // X.AbstractC65590Pog, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    public C65595Pol(AbstractC65590Pog abstractC65590Pog, int i, int i2) {
        this.LJLJJL = abstractC65590Pog;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
