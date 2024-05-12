package X;

import Y.IDRunnableS0S0201000;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.1Xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34551Xf<K, V> extends AbstractC19190p9<V> {
    public final AbstractC34531Xd<K, V> LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public int LJZI;
    public final C34541Xe LJZL;

    @Override // X.AbstractC19190p9
    public final boolean LJIILLIIL() {
        return true;
    }

    @Override // X.AbstractC19190p9
    public final Object LJIILJJIL() {
        return this.LJLLLL.LJIIIZ(this.LJLJJLL, this.LJLJL);
    }

    public final void LJJIIZ() {
        if (this.LJLZ) {
            return;
        }
        this.LJLZ = true;
        C19210pB<T> c19210pB = this.LJLJJL;
        int i = ((c19210pB.LJLIL + c19210pB.LJLJJL) - 1) + c19210pB.LJLJJI;
        List list = (List) ListProtector.get(c19210pB.LJLILLLLZI, r1.size() - 1);
        this.LJLILLLLZI.execute(new IDRunnableS0S0201000(i, C64504PTg.LIZIZ(list, -1, list), this, 14));
    }

    public final void LJJIIZI() {
        if (this.LJLLLLLL) {
            return;
        }
        this.LJLLLLLL = true;
        C19210pB<T> c19210pB = this.LJLJJL;
        this.LJLILLLLZI.execute(new IDRunnableS0S0201000(c19210pB.LJLIL + c19210pB.LJLJJI, ListProtector.get((List) ListProtector.get(c19210pB.LJLILLLLZI, 0), 0), this, 13));
    }

    @Override // X.AbstractC19190p9
    public final AbstractC19010or<?, V> LJIIJ() {
        return this.LJLLLL;
    }

    @Override // X.AbstractC19190p9
    public final void LJIJJLI(int i) {
        int i2 = this.LJLJJI.LIZIZ;
        C19210pB<T> c19210pB = this.LJLJJL;
        int i3 = c19210pB.LJLIL;
        int i4 = i2 - (i - i3);
        int i5 = (i + i2) - (i3 + c19210pB.LJLJJL);
        int max = Math.max(i4, this.LJZ);
        this.LJZ = max;
        if (max > 0) {
            LJJIIZI();
        }
        int max2 = Math.max(i5, this.LJZI);
        this.LJZI = max2;
        if (max2 > 0) {
            LJJIIZ();
        }
    }

    @Override // X.AbstractC19190p9
    public final void LJIIIZ(AbstractC19190p9 abstractC19190p9, C34521Xc c34521Xc) {
        C19210pB<T> c19210pB = abstractC19190p9.LJLJJL;
        C19210pB<T> c19210pB2 = this.LJLJJL;
        int i = c19210pB2.LJLJLJ - c19210pB.LJLJLJ;
        int i2 = c19210pB2.LJLJL - c19210pB.LJLJL;
        int i3 = c19210pB.LJLJI;
        int i4 = c19210pB.LJLIL;
        if (!c19210pB.isEmpty() && i >= 0 && i2 >= 0 && this.LJLJJL.LJLJI == Math.max(i3 - i, 0) && this.LJLJJL.LJLIL == Math.max(i4 - i2, 0) && this.LJLJJL.LJLJJL == c19210pB.LJLJJL + i + i2) {
            if (i != 0) {
                int min = Math.min(i3, i);
                int i5 = i - min;
                int i6 = c19210pB.LJLIL + c19210pB.LJLJJL;
                if (min != 0) {
                    c34521Xc.LIZ(i6, min);
                }
                if (i5 != 0) {
                    c34521Xc.LIZIZ(i6 + min, i5);
                }
            }
            if (i2 != 0) {
                int min2 = Math.min(i4, i2);
                int i7 = i2 - min2;
                if (min2 != 0) {
                    c34521Xc.LIZ(i4, min2);
                }
                if (i7 != 0) {
                    c34521Xc.LIZIZ(0, i7);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
    }

    public final void LJJIII(int i, int i2, int i3) {
        int i4 = (this.LJZI - i2) - i3;
        this.LJZI = i4;
        this.LJLZ = false;
        if (i4 > 0) {
            LJJIIZ();
        }
        LJIL(i, i2);
        LJJI(i + i2, i3);
    }

    public final void LJJIIJ(int i, int i2, int i3) {
        int i4 = (this.LJZ - i2) - i3;
        this.LJZ = i4;
        this.LJLLLLLL = false;
        if (i4 > 0) {
            LJJIIZI();
        }
        LJIL(i, i2);
        LJJI(0, i3);
        this.LJLJJLL += i3;
        this.LJLL += i3;
        this.LJLLI += i3;
    }

    public C34551Xf(AbstractC34531Xd<K, V> abstractC34531Xd, Executor executor, Executor executor2, AbstractC19140p4<V> abstractC19140p4, C19180p8 c19180p8, K k, int i) {
        super(new C19210pB(), executor, executor2, abstractC19140p4, c19180p8);
        this.LJLLLLLL = false;
        this.LJLZ = false;
        this.LJZ = 0;
        this.LJZI = 0;
        AbstractC19100p0<V> abstractC19100p0 = new AbstractC19100p0<V>() { // from class: X.1Xe
            /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
            
                if (r12.LIZ.size() == 0) goto L24;
             */
            @Override // X.AbstractC19100p0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r11, X.C19110p1<V> r12) {
                /*
                    Method dump skipped, instructions count: 298
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C34541Xe.LIZ(int, X.0p1):void");
            }
        };
        this.LJZL = abstractC19100p0;
        this.LJLLLL = abstractC34531Xd;
        this.LJLJJLL = i;
        if (abstractC34531Xd.LJ()) {
            LJII();
        } else {
            C19180p8 c19180p82 = this.LJLJJI;
            abstractC34531Xd.LJIIIIZZ(k, c19180p82.LIZLLL, c19180p82.LIZ, c19180p82.LIZJ, this.LJLIL, abstractC19100p0);
        }
    }
}
