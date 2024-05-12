package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.Pnw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65544Pnw<E> extends AbstractC65540Pns<E> {
    public final /* synthetic */ Iterable LJLILLLLZI;

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.LJLILLLLZI.iterator();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65544Pnw(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.LJLILLLLZI = iterable2;
    }
}
