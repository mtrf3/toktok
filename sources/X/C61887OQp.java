package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.OQp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61887OQp<E> extends OJR<E> implements OJP<E> {
    public static final C61887OQp LJLJI = new C61887OQp(new Object[0]);
    public final Object[] LJLILLLLZI;

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLILLLLZI.length;
    }

    public final ORE LJIIIIZZ() {
        return new ORE(this, null, this.LJLILLLLZI, 0);
    }

    public C61887OQp(Object[] objArr) {
        this.LJLILLLLZI = objArr;
    }

    public final OJQ<E> LJII(Collection<? extends E> collection) {
        if (collection.size() + this.LJLILLLLZI.length <= 32) {
            Object[] objArr = this.LJLILLLLZI;
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            int length = this.LJLILLLLZI.length;
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                copyOf[length] = it.next();
                length++;
            }
            return new C61887OQp(copyOf);
        }
        ORE LJIIIIZZ = LJIIIIZZ();
        LJIIIIZZ.addAll(collection);
        return LJIIIIZZ.build();
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final E get(int i) {
        C61879OQh.LIZ(i, LIZJ());
        return (E) this.LJLILLLLZI[i];
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final int indexOf(Object obj) {
        return ORY.LJJJJIZL(obj, this.LJLILLLLZI);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final int lastIndexOf(Object obj) {
        return ORY.LJJJLIIL(obj, this.LJLILLLLZI);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final ListIterator<E> listIterator(int i) {
        C61879OQh.LIZIZ(i, LIZJ());
        return new ORJ(i, LIZJ(), this.LJLILLLLZI);
    }
}
