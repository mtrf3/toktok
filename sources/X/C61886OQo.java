package X;

import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.OQo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61886OQo<E> extends OJR<E> {
    public final Object[] LJLILLLLZI;
    public final Object[] LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final E get(int i) {
        Object[] objArr;
        C61879OQh.LIZ(i, LIZJ());
        if (((LIZJ() - 1) & (-32)) <= i) {
            objArr = this.LJLJI;
        } else {
            objArr = this.LJLILLLLZI;
            for (int i2 = this.LJLJJL; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                if (obj != null) {
                    objArr = (Object[]) obj;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final ListIterator<E> listIterator(int i) {
        C61879OQh.LIZIZ(i, LIZJ());
        return new ORI(i, LIZJ(), (this.LJLJJL / 5) + 1, this.LJLILLLLZI, this.LJLJI);
    }

    public C61886OQo(int i, int i2, Object[] objArr, Object[] tail) {
        o.LJIIIZ(tail, "tail");
        this.LJLILLLLZI = objArr;
        this.LJLJI = tail;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        if (i > 32) {
            return;
        }
        String LJIILLIIL = o.LJIILLIIL(Integer.valueOf(i), "Trie-based persistent vector should have at least 33 elements, got ");
        LJIILLIIL.toString();
        throw new IllegalArgumentException(LJIILLIIL);
    }
}
