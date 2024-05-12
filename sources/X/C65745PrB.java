package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.PrB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65745PrB<T> implements Iterable<T> {
    public final /* synthetic */ Iterable LJLIL;

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C65746PrC(this);
    }

    public C65745PrB(Iterable iterable) {
        this.LJLIL = iterable;
    }
}
