package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.07r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C024307r<C, T, A> implements Cloneable {
    public List<C> LJLIL = new ArrayList();
    public long LJLILLLLZI = 0;
    public long[] LJLJI;
    public int LJLJJI;
    public final AbstractC024207q<C, T, A> LJLJJL;

    public final Object clone() {
        C024307r c024307r;
        synchronized (this) {
            try {
                c024307r = (C024307r) super.clone();
            } catch (CloneNotSupportedException e) {
                e = e;
                c024307r = null;
            }
            try {
                c024307r.LJLILLLLZI = 0L;
                c024307r.LJLJI = null;
                c024307r.LJLJJI = 0;
                c024307r.LJLIL = new ArrayList();
                int size = ((ArrayList) this.LJLIL).size();
                for (int i = 0; i < size; i++) {
                    if (!LIZIZ(i)) {
                        ((ArrayList) c024307r.LJLIL).add(ListProtector.get(this.LJLIL, i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                C16880lQ.LLLLIIL(e);
                return c024307r;
            }
        }
        return c024307r;
    }

    public C024307r(AbstractC024207q<C, T, A> abstractC024207q) {
        this.LJLJJL = abstractC024207q;
    }

    public final synchronized void LIZ(C c) {
        if (c != null) {
            int lastIndexOf = ((ArrayList) this.LJLIL).lastIndexOf(c);
            if (lastIndexOf < 0 || LIZIZ(lastIndexOf)) {
                ((ArrayList) this.LJLIL).add(c);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    public final boolean LIZIZ(int i) {
        int i2;
        if (i < 64) {
            if (((1 << i) & this.LJLILLLLZI) != 0) {
                return true;
            }
            return false;
        }
        long[] jArr = this.LJLJI;
        if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length) {
            return false;
        }
        if (((1 << (i % 64)) & jArr[i2]) != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void LJFF(C c) {
        if (this.LJLJJI == 0) {
            ((ArrayList) this.LJLIL).remove(c);
        } else {
            int lastIndexOf = ((ArrayList) this.LJLIL).lastIndexOf(c);
            if (lastIndexOf >= 0) {
                LJI(lastIndexOf);
            }
        }
    }

    public final void LJI(int i) {
        if (i < 64) {
            this.LJLILLLLZI = (1 << i) | this.LJLILLLLZI;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.LJLJI;
        if (jArr == null) {
            this.LJLJI = new long[this.LJLIL.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.LJLIL.size() / 64];
            long[] jArr3 = this.LJLJI;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.LJLJI = jArr2;
        }
        long[] jArr4 = this.LJLJI;
        jArr4[i2] = (1 << (i % 64)) | jArr4[i2];
    }

    public final synchronized void LIZJ(int i, Object obj) {
        this.LJLJJI++;
        int size = ((ArrayList) this.LJLIL).size();
        long[] jArr = this.LJLJI;
        int length = jArr == null ? -1 : jArr.length - 1;
        LJ(i, length, obj);
        LIZLLL(0L, obj, i, (length + 2) * 64, size);
        int i2 = this.LJLJJI - 1;
        this.LJLJJI = i2;
        if (i2 == 0) {
            long[] jArr2 = this.LJLJI;
            long j = Long.MIN_VALUE;
            if (jArr2 != null) {
                for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                    long j2 = this.LJLJI[length2];
                    if (j2 != 0) {
                        int i3 = (length2 + 1) * 64;
                        long j3 = Long.MIN_VALUE;
                        for (int i4 = (i3 + 64) - 1; i4 >= i3; i4--) {
                            if ((j2 & j3) != 0) {
                                ListProtector.remove(this.LJLIL, i4);
                            }
                            j3 >>>= 1;
                        }
                        this.LJLJI[length2] = 0;
                    }
                }
            }
            long j4 = this.LJLILLLLZI;
            if (j4 != 0) {
                int i5 = 63;
                do {
                    if ((j4 & j) != 0) {
                        ListProtector.remove(this.LJLIL, i5);
                    }
                    j >>>= 1;
                    i5--;
                } while (i5 >= 0);
                this.LJLILLLLZI = 0L;
            }
        }
    }

    public final void LJ(int i, int i2, Object obj) {
        if (i2 < 0) {
            LIZLLL(this.LJLILLLLZI, obj, i, 0, Math.min(64, ((ArrayList) this.LJLIL).size()));
            return;
        }
        long j = this.LJLJI[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(((ArrayList) this.LJLIL).size(), i3 + 64);
        LJ(i, i2 - 1, obj);
        LIZLLL(j, obj, i, i3, min);
    }

    public final void LIZLLL(long j, Object obj, int i, int i2, int i3) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.LJLJJL.LIZ(i, ListProtector.get(this.LJLIL, i2), obj);
            }
            j2 <<= 1;
            i2++;
        }
    }
}
