package X;

/* renamed from: X.0M5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0M5<E> implements Cloneable {
    public static final Object LJLJJL = new Object();
    public boolean LJLIL;
    public long[] LJLILLLLZI;
    public Object[] LJLJI;
    public int LJLJJI;

    public C0M5() {
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
        long[] jArr = this.LJLILLLLZI;
        Object[] objArr = this.LJLJI;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != LJLJJL) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
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
    public final C0M5<E> clone() {
        try {
            C0M5<E> c0m5 = (C0M5) super.clone();
            c0m5.LJLILLLLZI = (long[]) this.LJLILLLLZI.clone();
            c0m5.LJLJI = (Object[]) this.LJLJI.clone();
            return c0m5;
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

    public C0M5(int i) {
        if (i == 0) {
            this.LJLILLLLZI = C60903NvH.LIZIZ;
            this.LJLJI = C60903NvH.LIZJ;
            return;
        }
        int i2 = i * 8;
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
        int i5 = i2 / 8;
        this.LJLILLLLZI = new long[i5];
        this.LJLJI = new Object[i5];
    }

    public final long LJFF(int i) {
        if (this.LJLIL) {
            LIZLLL();
        }
        return this.LJLILLLLZI[i];
    }

    public final void LJII(long j) {
        int LJ = C60903NvH.LJ(j, this.LJLJJI, this.LJLILLLLZI);
        if (LJ >= 0) {
            Object[] objArr = this.LJLJI;
            Object obj = objArr[LJ];
            Object obj2 = LJLJJL;
            if (obj != obj2) {
                objArr[LJ] = obj2;
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

    public final void LIZ(long j, E e) {
        int i = this.LJLJJI;
        if (i != 0 && j <= this.LJLILLLLZI[i - 1]) {
            LJI(j, e);
            return;
        }
        if (this.LJLIL && i >= this.LJLILLLLZI.length) {
            LIZLLL();
        }
        int i2 = this.LJLJJI;
        if (i2 >= this.LJLILLLLZI.length) {
            int i3 = (i2 + 1) * 8;
            int i4 = 4;
            while (true) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                } else {
                    i4++;
                    if (i4 >= 32) {
                        break;
                    }
                }
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.LJLILLLLZI;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.LJLJI;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.LJLILLLLZI = jArr;
            this.LJLJI = objArr;
        }
        this.LJLILLLLZI[i2] = j;
        this.LJLJI[i2] = e;
        this.LJLJJI = i2 + 1;
    }

    public final E LJ(long j, E e) {
        E e2;
        int LJ = C60903NvH.LJ(j, this.LJLJJI, this.LJLILLLLZI);
        if (LJ < 0 || (e2 = (E) this.LJLJI[LJ]) == LJLJJL) {
            return e;
        }
        return e2;
    }

    public final void LJI(long j, E e) {
        int LJ = C60903NvH.LJ(j, this.LJLJJI, this.LJLILLLLZI);
        if (LJ >= 0) {
            this.LJLJI[LJ] = e;
            return;
        }
        int i = ~LJ;
        int i2 = this.LJLJJI;
        if (i < i2) {
            Object[] objArr = this.LJLJI;
            if (objArr[i] == LJLJJL) {
                this.LJLILLLLZI[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.LJLIL && i2 >= this.LJLILLLLZI.length) {
            LIZLLL();
            i = ~C60903NvH.LJ(j, this.LJLJJI, this.LJLILLLLZI);
        }
        int i3 = this.LJLJJI;
        if (i3 >= this.LJLILLLLZI.length) {
            int i4 = (i3 + 1) * 8;
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
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.LJLILLLLZI;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.LJLJI;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.LJLILLLLZI = jArr;
            this.LJLJI = objArr2;
        }
        int i8 = this.LJLJJI - i;
        if (i8 != 0) {
            long[] jArr3 = this.LJLILLLLZI;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.LJLJI;
            System.arraycopy(objArr4, i, objArr4, i9, this.LJLJJI - i);
        }
        this.LJLILLLLZI[i] = j;
        this.LJLJI[i] = e;
        this.LJLJJI++;
    }
}
