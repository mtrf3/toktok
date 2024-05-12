package X;

/* renamed from: X.0MB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MB<E> implements Cloneable {
    public static final Object LJLJJL = new Object();
    public boolean LJLIL;
    public int[] LJLILLLLZI;
    public Object[] LJLJI;
    public int LJLJJI;

    public C0MB() {
        this(10);
    }

    public final void LIZIZ() {
        int i = this.LJLJJI;
        Object[] objArr = this.LJLJI;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.LJLJJI = 0;
        this.LJLIL = false;
    }

    public final void LIZLLL() {
        int i = this.LJLJJI;
        int[] iArr = this.LJLILLLLZI;
        Object[] objArr = this.LJLJI;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != LJLJJL) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.LJLIL = false;
        this.LJLJJI = i2;
    }

    public final int LJIIIIZZ() {
        if (this.LJLIL) {
            LIZLLL();
        }
        return this.LJLJJI;
    }

    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C0MB<E> clone() {
        try {
            C0MB<E> c0mb = (C0MB) super.clone();
            c0mb.LJLILLLLZI = (int[]) this.LJLILLLLZI.clone();
            c0mb.LJLJI = (Object[]) this.LJLJI.clone();
            return c0mb;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        if (LJIIIIZZ() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.LJLJJI * 28);
        sb.append('{');
        for (int i = 0; i < this.LJLJJI; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(LJFF(i));
            sb.append('=');
            E LJIIIZ = LJIIIZ(i);
            if (LJIIIZ != this) {
                sb.append(LJIIIZ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0MB(int i) {
        if (i == 0) {
            this.LJLILLLLZI = C60903NvH.LIZ;
            this.LJLJI = C60903NvH.LIZJ;
            return;
        }
        int i2 = i * 4;
        int i3 = 4;
        while (true) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            } else {
                i3++;
                if (i3 >= 32) {
                    break;
                }
            }
        }
        int i5 = i2 / 4;
        this.LJLILLLLZI = new int[i5];
        this.LJLJI = new Object[i5];
    }

    public final int LJFF(int i) {
        if (this.LJLIL) {
            LIZLLL();
        }
        return this.LJLILLLLZI[i];
    }

    public final void LJII(int i) {
        int LIZLLL = C60903NvH.LIZLLL(this.LJLJJI, i, this.LJLILLLLZI);
        if (LIZLLL >= 0) {
            Object[] objArr = this.LJLJI;
            Object obj = objArr[LIZLLL];
            Object obj2 = LJLJJL;
            if (obj != obj2) {
                objArr[LIZLLL] = obj2;
                this.LJLIL = true;
            }
        }
    }

    public final E LJIIIZ(int i) {
        if (this.LJLIL) {
            LIZLLL();
        }
        return (E) this.LJLJI[i];
    }

    public final void LIZ(int i, E e) {
        int i2 = this.LJLJJI;
        if (i2 != 0 && i <= this.LJLILLLLZI[i2 - 1]) {
            LJI(i, e);
            return;
        }
        if (this.LJLIL && i2 >= this.LJLILLLLZI.length) {
            LIZLLL();
        }
        int i3 = this.LJLJJI;
        if (i3 >= this.LJLILLLLZI.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                } else {
                    i5++;
                    if (i5 >= 32) {
                        break;
                    }
                }
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.LJLILLLLZI;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.LJLJI;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.LJLILLLLZI = iArr;
            this.LJLJI = objArr;
        }
        this.LJLILLLLZI[i3] = i;
        this.LJLJI[i3] = e;
        this.LJLJJI = i3 + 1;
    }

    public final E LJ(int i, E e) {
        E e2;
        int LIZLLL = C60903NvH.LIZLLL(this.LJLJJI, i, this.LJLILLLLZI);
        if (LIZLLL < 0 || (e2 = (E) this.LJLJI[LIZLLL]) == LJLJJL) {
            return e;
        }
        return e2;
    }

    public final void LJI(int i, E e) {
        int LIZLLL = C60903NvH.LIZLLL(this.LJLJJI, i, this.LJLILLLLZI);
        if (LIZLLL >= 0) {
            this.LJLJI[LIZLLL] = e;
            return;
        }
        int i2 = ~LIZLLL;
        int i3 = this.LJLJJI;
        if (i2 < i3) {
            Object[] objArr = this.LJLJI;
            if (objArr[i2] == LJLJJL) {
                this.LJLILLLLZI[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.LJLIL && i3 >= this.LJLILLLLZI.length) {
            LIZLLL();
            i2 = ~C60903NvH.LIZLLL(this.LJLJJI, i, this.LJLILLLLZI);
        }
        int i4 = this.LJLJJI;
        if (i4 >= this.LJLILLLLZI.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                } else {
                    i6++;
                    if (i6 >= 32) {
                        break;
                    }
                }
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.LJLILLLLZI;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.LJLJI;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.LJLILLLLZI = iArr;
            this.LJLJI = objArr2;
        }
        int i9 = this.LJLJJI - i2;
        if (i9 != 0) {
            int[] iArr3 = this.LJLILLLLZI;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.LJLJI;
            System.arraycopy(objArr4, i2, objArr4, i10, this.LJLJJI - i2);
        }
        this.LJLILLLLZI[i2] = i;
        this.LJLJI[i2] = e;
        this.LJLJJI++;
    }
}
