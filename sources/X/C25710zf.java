package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.o;

/* renamed from: X.0zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25710zf<T> implements RandomAccess {
    public T[] LJLIL;
    public AnonymousClass276 LJLILLLLZI;
    public int LJLJI = 0;

    public final List<T> LJI() {
        AnonymousClass276 anonymousClass276 = this.LJLILLLLZI;
        if (anonymousClass276 == null) {
            AnonymousClass276 anonymousClass2762 = new AnonymousClass276(this);
            this.LJLILLLLZI = anonymousClass2762;
            return anonymousClass2762;
        }
        return anonymousClass276;
    }

    public final void LJII() {
        T[] tArr = this.LJLIL;
        for (int i = this.LJLJI - 1; -1 < i; i--) {
            tArr[i] = null;
        }
        this.LJLJI = 0;
    }

    public final boolean LJIIJ() {
        if (this.LJLJI == 0) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJJI() {
        if (this.LJLJI != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C25710zf(Object[] objArr) {
        this.LJLIL = objArr;
    }

    public final void LIZLLL(Object obj) {
        LJIIIZ(this.LJLJI + 1);
        Object[] objArr = (T[]) this.LJLIL;
        int i = this.LJLJI;
        objArr[i] = obj;
        this.LJLJI = i + 1;
    }

    public final boolean LJIIIIZZ(T t) {
        int i = this.LJLJI - 1;
        if (i >= 0) {
            for (int i2 = 0; !o.LJ(this.LJLIL[i2], t); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void LJIIIZ(int i) {
        T[] tArr = this.LJLIL;
        if (tArr.length < i) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            o.LJIIIIZZ(tArr2, "copyOf(this, newSize)");
            this.LJLIL = tArr2;
        }
    }

    public final boolean LJIIL(T t) {
        int i = this.LJLJI;
        if (i > 0) {
            T[] tArr = this.LJLIL;
            o.LJII(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            while (true) {
                if (o.LJ(t, tArr[i2])) {
                    if (i2 >= 0) {
                        LJIILJJIL(i2);
                        return true;
                    }
                } else {
                    i2++;
                    if (i2 >= i) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final void LJIILIIL(C25710zf elements) {
        o.LJIIIZ(elements, "elements");
        int i = elements.LJLJI - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                LJIIL(elements.LJLIL[i2]);
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final T LJIILJJIL(int i) {
        T[] tArr = this.LJLIL;
        T t = tArr[i];
        int i2 = this.LJLJI;
        if (i != i2 - 1) {
            C61898ORa.LJIIZILJ(i, i + 1, i2, tArr, tArr);
        }
        int i3 = this.LJLJI - 1;
        this.LJLJI = i3;
        tArr[i3] = null;
        return t;
    }

    public final void LJIIZILJ(Comparator<T> comparator) {
        o.LJIIIZ(comparator, "comparator");
        T[] tArr = this.LJLIL;
        o.LJII(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        Arrays.sort(tArr, 0, this.LJLJI, comparator);
    }

    public final void LIZJ(int i, T t) {
        LJIIIZ(this.LJLJI + 1);
        T[] tArr = this.LJLIL;
        int i2 = this.LJLJI;
        if (i != i2) {
            C61898ORa.LJIIZILJ(i + 1, i, i2, tArr, tArr);
        }
        tArr[i] = t;
        this.LJLJI++;
    }

    public final void LJ(int i, C25710zf elements) {
        o.LJIIIZ(elements, "elements");
        if (elements.LJIIJ()) {
            return;
        }
        LJIIIZ(this.LJLJI + elements.LJLJI);
        T[] tArr = this.LJLIL;
        int i2 = this.LJLJI;
        if (i != i2) {
            C61898ORa.LJIIZILJ(elements.LJLJI + i, i, i2, tArr, tArr);
        }
        C61898ORa.LJIIZILJ(i, 0, elements.LJLJI, elements.LJLIL, tArr);
        this.LJLJI += elements.LJLJI;
    }

    public final boolean LJFF(int i, Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        int i2 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        LJIIIZ(elements.size() + this.LJLJI);
        T[] tArr = this.LJLIL;
        if (i != this.LJLJI) {
            C61898ORa.LJIIZILJ(elements.size() + i, i, this.LJLJI, tArr, tArr);
        }
        for (T t : elements) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                tArr[i2 + i] = t;
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        this.LJLJI = elements.size() + this.LJLJI;
        return true;
    }

    public final void LJIILLIIL(int i, int i2) {
        if (i2 > i) {
            int i3 = this.LJLJI;
            if (i2 < i3) {
                T[] tArr = this.LJLIL;
                C61898ORa.LJIIZILJ(i, i2, i3, tArr, tArr);
            }
            int i4 = this.LJLJI;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.LJLIL[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.LJLJI = i5;
        }
    }
}
