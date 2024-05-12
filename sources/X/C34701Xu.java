package X;

import Y.IDRunnableS6S0101000;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.1Xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34701Xu<T> extends AbstractC19190p9<T> {
    public final AbstractC34671Xr<T> LJLLLL;
    public final C34691Xt LJLLLLLL;

    @Override // X.AbstractC19190p9
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // X.AbstractC19190p9
    public final Object LJIILJJIL() {
        return Integer.valueOf(this.LJLJJLL);
    }

    @Override // X.AbstractC19190p9
    public final AbstractC19010or<?, T> LJIIJ() {
        return this.LJLLLL;
    }

    @Override // X.AbstractC19190p9
    public final void LJIJJLI(int i) {
        C19210pB<T> c19210pB = this.LJLJJL;
        C19180p8 c19180p8 = this.LJLJJI;
        int i2 = c19180p8.LIZIZ;
        int i3 = c19180p8.LIZ;
        int i4 = c19210pB.LJLJJLL;
        if (i3 != i4) {
            if (i3 >= i4) {
                if (c19210pB.LJLILLLLZI.size() == 1 && c19210pB.LJLJI == 0) {
                    c19210pB.LJLJJLL = i3;
                } else {
                    throw new IllegalArgumentException("Page size can change only if last page is only one present");
                }
            } else {
                throw new IllegalArgumentException("Page size cannot be reduced");
            }
        }
        int size = c19210pB.size();
        int i5 = c19210pB.LJLJJLL;
        int max = Math.max((i - i2) / i5, 0);
        int min = Math.min((i + i2) / c19210pB.LJLJJLL, (((size + i5) - 1) / i5) - 1);
        c19210pB.LIZJ(max, min);
        int i6 = c19210pB.LJLIL / c19210pB.LJLJJLL;
        while (max <= min) {
            int i7 = max - i6;
            if (ListProtector.get(c19210pB.LJLILLLLZI, i7) == null) {
                ListProtector.set(c19210pB.LJLILLLLZI, i7, C19210pB.LJLJLLL);
                LJJIII(max);
            }
            max++;
        }
    }

    public final void LJJIII(int i) {
        this.LJLILLLLZI.execute(new IDRunnableS6S0101000(i, this, 32));
    }

    @Override // X.AbstractC19190p9
    public final void LJIIIZ(AbstractC19190p9 abstractC19190p9, C34521Xc c34521Xc) {
        C19210pB<T> c19210pB = abstractC19190p9.LJLJJL;
        if (!c19210pB.isEmpty() && this.LJLJJL.size() == c19210pB.size()) {
            int i = this.LJLJJI.LIZ;
            C19210pB<T> c19210pB2 = this.LJLJJL;
            int i2 = c19210pB2.LJLIL / i;
            int size = c19210pB2.LJLILLLLZI.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + i2;
                int i5 = 0;
                while (i5 < this.LJLJJL.LJLILLLLZI.size()) {
                    int i6 = i4 + i5;
                    if (!this.LJLJJL.LJIIIIZZ(i, i6) || c19210pB.LJIIIIZZ(i, i6)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 > 0) {
                    c34521Xc.LIZ(i4 * i, i * i5);
                    i3 += i5 - 1;
                }
                i3++;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
    }

    public C34701Xu(AbstractC34671Xr<T> abstractC34671Xr, Executor executor, Executor executor2, AbstractC19140p4<T> abstractC19140p4, C19180p8 c19180p8, int i) {
        super(new C19210pB(), executor, executor2, abstractC19140p4, c19180p8);
        AbstractC19100p0<T> abstractC19100p0 = new AbstractC19100p0<T>() { // from class: X.1Xt
            @Override // X.AbstractC19100p0
            public final void LIZ(int i2, C19110p1<T> c19110p1) {
                boolean z;
                boolean z2;
                boolean z3;
                c19110p1.getClass();
                if (c19110p1 == C19110p1.LJFF) {
                    C34701Xu.this.LJII();
                    return;
                }
                if (C34701Xu.this.LJIIZILJ()) {
                    return;
                }
                if (i2 == 0 || i2 == 3) {
                    if (C34701Xu.this.LJLJJL.LJLILLLLZI.size() == 0) {
                        C34701Xu c34701Xu = C34701Xu.this;
                        C19210pB<T> c19210pB = c34701Xu.LJLJJL;
                        int i3 = c19110p1.LIZIZ;
                        List<T> list = c19110p1.LIZ;
                        int i4 = c19110p1.LIZJ;
                        int i5 = c19110p1.LIZLLL;
                        int i6 = c34701Xu.LJLJJI.LIZ;
                        c19210pB.getClass();
                        int size = ((i6 - 1) + list.size()) / i6;
                        int i7 = 0;
                        while (i7 < size) {
                            int i8 = i7 * i6;
                            int i9 = i7 + 1;
                            List<T> subList = list.subList(i8, Math.min(list.size(), i9 * i6));
                            if (i7 == 0) {
                                c19210pB.LJIIIZ(i3, (list.size() + i4) - subList.size(), i5, subList);
                            } else {
                                c19210pB.LJIIJ(i8 + i3, subList, null);
                            }
                            i7 = i9;
                        }
                        c34701Xu.LJJI(0, c19210pB.size());
                    } else {
                        C34701Xu c34701Xu2 = C34701Xu.this;
                        c34701Xu2.LJLJJL.LJIIJ(c19110p1.LIZLLL, c19110p1.LIZ, c34701Xu2);
                    }
                    C34701Xu c34701Xu3 = C34701Xu.this;
                    if (c34701Xu3.LJLJI != null) {
                        if (c34701Xu3.LJLJJL.size() == 0) {
                            z = true;
                        } else {
                            z = false;
                            if (c19110p1.LIZIZ == 0 && c19110p1.LIZLLL == 0) {
                                z2 = true;
                                int size2 = C34701Xu.this.size();
                                if (!z || (i2 != 0 ? i2 != 3 || c19110p1.LIZLLL + C34701Xu.this.LJLJJI.LIZ < size2 : c19110p1.LIZJ != 0)) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                C34701Xu.this.LJFF(z, z2, z3);
                                return;
                            }
                        }
                        z2 = false;
                        int size22 = C34701Xu.this.size();
                        if (!z) {
                        }
                        z3 = false;
                        C34701Xu.this.LJFF(z, z2, z3);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(KMP.LJ("unexpected resultType", i2));
            }
        };
        this.LJLLLLLL = abstractC19100p0;
        this.LJLLLL = abstractC34671Xr;
        int i2 = this.LJLJJI.LIZ;
        this.LJLJJLL = i;
        if (abstractC34671Xr.LJ()) {
            LJII();
            return;
        }
        Math.max(0, Math.round((i - ((Math.max(Math.round(this.LJLJJI.LIZLLL / i2), 2) * i2) / 2)) / i2) * i2);
        Executor executor3 = this.LJLIL;
        C34651Xp c34651Xp = new C34651Xp(abstractC34671Xr, i2, abstractC19100p0);
        abstractC34671Xr.LJII();
        C19000oq<T> c19000oq = c34651Xp.LIZ;
        synchronized (c19000oq.LIZLLL) {
            c19000oq.LJ = executor3;
        }
    }
}
