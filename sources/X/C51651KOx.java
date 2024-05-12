package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.KOx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51651KOx<E> implements Iterator<E>, InterfaceC90533gv {
    public final Iterator<T> LJLIL;
    public Iterator<? extends E> LJLILLLLZI;
    public final /* synthetic */ C51652KOy<T, R, E> LJLJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            r5 = this;
            java.util.Iterator<? extends E> r0 = r5.LJLILLLLZI
            r4 = 1
            r3 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lf
            r0 = 0
            r5.LJLILLLLZI = r0
        Lf:
            java.util.Iterator<? extends E> r0 = r5.LJLILLLLZI
            if (r0 != 0) goto L3a
            java.util.Iterator<T> r0 = r5.LJLIL
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1c
            return r3
        L1c:
            java.util.Iterator<T> r0 = r5.LJLIL
            java.lang.Object r2 = r0.next()
            X.KOy<T, R, E> r0 = r5.LJLJI
            X.Yns<R, java.util.Iterator<E>> r1 = r0.LIZJ
            X.Yns<T, R> r0 = r0.LIZIZ
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Object r1 = r1.invoke(r0)
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lf
            r5.LJLILLLLZI = r1
        L3a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51651KOx.LIZ():boolean");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return LIZ();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (LIZ()) {
            Iterator<? extends E> it = this.LJLILLLLZI;
            o.LJI(it);
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public C51651KOx(C51652KOy<T, R, E> c51652KOy) {
        this.LJLJI = c51652KOy;
        this.LJLIL = c51652KOy.LIZ.iterator();
    }
}
