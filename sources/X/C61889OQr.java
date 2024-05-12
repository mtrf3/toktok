package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.o;

/* renamed from: X.OQr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61889OQr<T> extends AbstractC61884OQm<T> implements RandomAccess {
    public final Object[] LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;
    public int LJLJJL;

    @Override // X.AbstractC61884OQm, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new C61890OQs(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.OQZ, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[LIZJ()]);
    }

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLJJL;
    }

    public final void LJII(int i) {
        if (i >= 0) {
            if (i <= this.LJLJJL) {
                if (i > 0) {
                    int i2 = this.LJLJJI;
                    int i3 = this.LJLJI;
                    int i4 = (i2 + i) % i3;
                    if (i2 > i4) {
                        C61898ORa.LJJ(i2, i3, this.LJLILLLLZI);
                        C61898ORa.LJJ(0, i4, this.LJLILLLLZI);
                    } else {
                        C61898ORa.LJJ(i2, i4, this.LJLILLLLZI);
                    }
                    this.LJLJJI = i4;
                    this.LJLJJL -= i;
                    return;
                }
                return;
            }
            StringBuilder LJ = C7MY.LJ("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
            LJ.append(this.LJLJJL);
            String LIZIZ = X1D.LIZIZ(LJ);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
        String LJ2 = KMP.LJ("n shouldn't be negative but it is ", i);
        LJ2.toString();
        throw new IllegalArgumentException(LJ2);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final T get(int i) {
        C61880OQi.LIZ(i, this.LJLJJL);
        return (T) this.LJLILLLLZI[(this.LJLJJI + i) % this.LJLJI];
    }

    @Override // X.OQZ, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        o.LJIIIZ(array, "array");
        if (array.length < LIZJ()) {
            array = (T[]) Arrays.copyOf(array, LIZJ());
            o.LJIIIIZZ(array, "copyOf(this, newSize)");
        }
        int LIZJ = LIZJ();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.LJLJJI; i2 < LIZJ && i3 < this.LJLJI; i3++) {
            array[i2] = this.LJLILLLLZI[i3];
            i2++;
        }
        while (i2 < LIZJ) {
            array[i2] = this.LJLILLLLZI[i];
            i2++;
            i++;
        }
        if (array.length > LIZJ()) {
            array[LIZJ()] = null;
        }
        return array;
    }

    public C61889OQr(int i, Object[] objArr) {
        this.LJLILLLLZI = objArr;
        if (i >= 0) {
            if (i <= objArr.length) {
                this.LJLJI = objArr.length;
                this.LJLJJL = i;
                return;
            } else {
                StringBuilder LJ = C7MY.LJ("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
                LJ.append(objArr.length);
                String LIZIZ = X1D.LIZIZ(LJ);
                LIZIZ.toString();
                throw new IllegalArgumentException(LIZIZ);
            }
        }
        String LJ2 = KMP.LJ("ring buffer filled size should not be negative but it is ", i);
        LJ2.toString();
        throw new IllegalArgumentException(LJ2);
    }
}
