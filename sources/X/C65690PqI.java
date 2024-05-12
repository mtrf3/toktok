package X;

import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [T, F] */
/* renamed from: X.PqI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65690PqI<F, T> extends AbstractC65646Ppa<F, T> {
    public final /* synthetic */ C65663Ppr LJLILLLLZI;

    @Override // X.AbstractC65645PpZ
    public final T LIZ(F f) {
        return this.LJLILLLLZI.LJLILLLLZI.apply(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65690PqI(C65663Ppr c65663Ppr, ListIterator listIterator) {
        super(listIterator);
        this.LJLILLLLZI = c65663Ppr;
    }
}
