package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.2HI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HI<E> extends C28Q<E> implements InterfaceC37411dR<E> {
    public static final C2HI LJLJI = new C2HI(new Object[0]);
    public final Object[] LJLILLLLZI;

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLILLLLZI.length;
    }

    @Override // X.InterfaceC44221oQ
    public final C2HH builder() {
        return new C2HH(this, null, this.LJLILLLLZI, 0);
    }

    public C2HI(Object[] objArr) {
        this.LJLILLLLZI = objArr;
    }

    @Override // X.InterfaceC44221oQ
    public final InterfaceC44221oQ LJJJJ(IDqS416S0100000 iDqS416S0100000) {
        Object[] objArr = this.LJLILLLLZI;
        int length = objArr.length;
        int length2 = objArr.length;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = this.LJLILLLLZI[i];
            if (((Boolean) iDqS416S0100000.invoke(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.LJLILLLLZI;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    o.LJIIIIZZ(objArr, "copyOf(this, size)");
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr[length] = obj;
                length++;
            }
        }
        if (length == this.LJLILLLLZI.length) {
            return this;
        }
        if (length == 0) {
            return LJLJI;
        }
        return new C2HI(C61898ORa.LJIL(0, length, objArr));
    }

    @Override // X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> LJJJJIZL(int i) {
        C00B.LIZ(i, this.LJLILLLLZI.length);
        Object[] objArr = this.LJLILLLLZI;
        if (objArr.length == 1) {
            return LJLJI;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
        Object[] objArr2 = this.LJLILLLLZI;
        C61898ORa.LJIIZILJ(i, i + 1, objArr2.length, objArr2, copyOf);
        return new C2HI(copyOf);
    }

    @Override // java.util.Collection, java.util.List, X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> add(E e) {
        Object[] objArr = this.LJLILLLLZI;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            copyOf[this.LJLILLLLZI.length] = e;
            return new C2HI(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new C2HG(objArr.length + 1, 0, objArr, objArr2);
    }

    @Override // X.C28Q, java.util.Collection, java.util.List, X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> addAll(Collection<? extends E> elements) {
        o.LJIIIZ(elements, "elements");
        if (elements.size() + this.LJLILLLLZI.length <= 32) {
            Object[] objArr = this.LJLILLLLZI;
            Object[] copyOf = Arrays.copyOf(objArr, elements.size() + objArr.length);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            int length = this.LJLILLLLZI.length;
            Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                copyOf[length] = it.next();
                length++;
            }
            return new C2HI(copyOf);
        }
        C2HH builder = builder();
        builder.addAll(elements);
        return builder.LIZJ();
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final E get(int i) {
        C00B.LIZ(i, LIZJ());
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
    public final ListIterator<E> listIterator(final int i) {
        C00B.LIZIZ(i, LIZJ());
        final Object[] objArr = this.LJLILLLLZI;
        o.LJII(objArr, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector>");
        final int LIZJ = LIZJ();
        return new AbstractC37961eK(i, LIZJ, objArr) { // from class: X.1of
            public final T[] LJLJJI;

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                if (hasNext()) {
                    T[] tArr = this.LJLJJI;
                    int i2 = this.LJLILLLLZI;
                    this.LJLILLLLZI = i2 + 1;
                    return tArr[i2];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final T previous() {
                if (hasPrevious()) {
                    T[] tArr = this.LJLJJI;
                    int i2 = this.LJLILLLLZI - 1;
                    this.LJLILLLLZI = i2;
                    return tArr[i2];
                }
                throw new NoSuchElementException();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LJLJJI = objArr;
            }
        };
    }

    @Override // java.util.List, X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> add(int i, E e) {
        C00B.LIZIZ(i, this.LJLILLLLZI.length);
        Object[] objArr = this.LJLILLLLZI;
        if (i == objArr.length) {
            return add((C2HI<E>) e);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            C61898ORa.LJIJJ(objArr, objArr2, 0, 0, i, 6);
            Object[] objArr3 = this.LJLILLLLZI;
            C61898ORa.LJIIZILJ(i + 1, i, objArr3.length, objArr3, objArr2);
            objArr2[i] = e;
            return new C2HI(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        o.LJIIIIZZ(copyOf, "copyOf(this, size)");
        C61898ORa.LJIIZILJ(i + 1, i, r2.length - 1, this.LJLILLLLZI, copyOf);
        copyOf[i] = e;
        Object[] objArr4 = this.LJLILLLLZI;
        Object[] objArr5 = new Object[32];
        objArr5[0] = objArr4[31];
        return new C2HG(objArr4.length + 1, 0, copyOf, objArr5);
    }

    @Override // X.AbstractC61884OQm, java.util.List, X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> set(int i, E e) {
        C00B.LIZ(i, LIZJ());
        Object[] objArr = this.LJLILLLLZI;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        o.LJIIIIZZ(copyOf, "copyOf(this, size)");
        copyOf[i] = e;
        return new C2HI(copyOf);
    }
}
