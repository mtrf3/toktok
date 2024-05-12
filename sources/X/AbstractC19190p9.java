package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0p9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19190p9<T> extends AbstractList<T> {
    public static final /* synthetic */ int LJLLL = 0;
    public final Executor LJLIL;
    public final Executor LJLILLLLZI;
    public final AbstractC19140p4<T> LJLJI;
    public final C19180p8 LJLJJI;
    public final C19210pB<T> LJLJJL;
    public int LJLJJLL;
    public T LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL = Integer.MAX_VALUE;
    public int LJLLI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final AtomicBoolean LJLLILLLL = new AtomicBoolean(false);
    public final ArrayList<WeakReference<AbstractC19160p6>> LJLLJ = new ArrayList<>();

    public abstract void LJIIIZ(AbstractC19190p9 abstractC19190p9, C34521Xc c34521Xc);

    public abstract AbstractC19010or<?, T> LJIIJ();

    public abstract Object LJIILJJIL();

    public abstract boolean LJIILLIIL();

    public abstract void LJIJJLI(int i);

    public final void LJII() {
        this.LJLLILLLL.set(true);
    }

    public boolean LJIIZILJ() {
        return this.LJLLILLLL.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJL.size();
    }

    public boolean LJIJ() {
        return LJIIZILJ();
    }

    public final void LJJIFFI(C34521Xc c34521Xc) {
        int size = this.LJLLJ.size();
        while (true) {
            size--;
            if (size >= 0) {
                Object obj = ((Reference) ListProtector.get(this.LJLLJ, size)).get();
                if (obj == null || obj == c34521Xc) {
                    ListProtector.remove(this.LJLLJ, size);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r5 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.LJLJLJ
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L28
            int r1 = r6.LJLL
            X.0p8 r0 = r6.LJLJJI
            int r0 = r0.LIZIZ
            if (r1 > r0) goto L28
            r3 = 1
        Lf:
            boolean r0 = r6.LJLJLLL
            if (r0 == 0) goto L26
            int r2 = r6.LJLLI
            int r1 = r6.size()
            int r1 = r1 - r5
            X.0p8 r0 = r6.LJLJJI
            int r0 = r0.LIZIZ
            int r1 = r1 - r0
            if (r2 < r1) goto L26
        L21:
            if (r3 != 0) goto L2a
            if (r5 != 0) goto L2e
            return
        L26:
            r5 = 0
            goto L21
        L28:
            r3 = 0
            goto Lf
        L2a:
            r6.LJLJLJ = r4
            if (r5 == 0) goto L30
        L2e:
            r6.LJLJLLL = r4
        L30:
            if (r7 == 0) goto L3d
            java.util.concurrent.Executor r1 = r6.LJLIL
            X.0p3 r0 = new X.0p3
            r0.<init>()
            r1.execute(r0)
        L3c:
            return
        L3d:
            r6.LJIIIIZZ(r3, r5)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19190p9.LJJII(boolean):void");
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        T t = this.LJLJJL.get(i);
        if (t != null) {
            this.LJLJL = t;
        }
        return t;
    }

    public final void LIZJ(AbstractC19190p9 abstractC19190p9, C34521Xc c34521Xc) {
        if (abstractC19190p9 != null && abstractC19190p9 != this) {
            if (abstractC19190p9.isEmpty()) {
                if (!this.LJLJJL.isEmpty()) {
                    c34521Xc.LIZIZ(0, this.LJLJJL.size());
                }
            } else {
                LJIIIZ(abstractC19190p9, c34521Xc);
            }
        }
        int size = this.LJLLJ.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Reference) ListProtector.get(this.LJLLJ, size)).get() == null) {
                    ListProtector.remove(this.LJLLJ, size);
                }
            } else {
                this.LJLLJ.add(new WeakReference<>(c34521Xc));
                return;
            }
        }
    }

    public final void LJIIIIZZ(boolean z, boolean z2) {
        if (z) {
            AbstractC19140p4<T> abstractC19140p4 = this.LJLJI;
            ListProtector.get((List) ListProtector.get(this.LJLJJL.LJLILLLLZI, 0), 0);
            abstractC19140p4.getClass();
        }
        if (z2) {
            AbstractC19140p4<T> abstractC19140p42 = this.LJLJI;
            ListProtector.get((List) ListProtector.get(this.LJLJJL.LJLILLLLZI, r1.size() - 1), r1.size() - 1);
            ((C32211Of) abstractC19140p42).LIZ.postValue(Boolean.FALSE);
        }
    }

    public final void LJIL(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.LJLLJ.size() - 1; size >= 0; size--) {
                AbstractC19160p6 abstractC19160p6 = (AbstractC19160p6) ((Reference) ListProtector.get(this.LJLLJ, size)).get();
                if (abstractC19160p6 != null) {
                    abstractC19160p6.LIZ(i, i2);
                }
            }
        }
    }

    public final void LJJI(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.LJLLJ.size() - 1; size >= 0; size--) {
                AbstractC19160p6 abstractC19160p6 = (AbstractC19160p6) ((Reference) ListProtector.get(this.LJLLJ, size)).get();
                if (abstractC19160p6 != null) {
                    abstractC19160p6.LIZIZ(i, i2);
                }
            }
        }
    }

    public final void LJFF(final boolean z, final boolean z2, final boolean z3) {
        if (this.LJLJI != null) {
            if (this.LJLL == Integer.MAX_VALUE) {
                this.LJLL = this.LJLJJL.size();
            }
            if (this.LJLLI == Integer.MIN_VALUE) {
                this.LJLLI = 0;
            }
            if (z || z2 || z3) {
                this.LJLIL.execute(new Runnable() { // from class: X.0p2
                    public final void LIZ() {
                        if (z) {
                            ((C32211Of) AbstractC19190p9.this.LJLJI).LIZIZ.postValue(Boolean.TRUE);
                        }
                        if (z2) {
                            AbstractC19190p9.this.LJLJLJ = true;
                        }
                        if (z3) {
                            AbstractC19190p9.this.LJLJLLL = true;
                        }
                        AbstractC19190p9.this.LJJII(false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    public AbstractC19190p9(C19210pB<T> c19210pB, Executor executor, Executor executor2, AbstractC19140p4<T> abstractC19140p4, C19180p8 c19180p8) {
        this.LJLJJL = c19210pB;
        this.LJLIL = executor;
        this.LJLILLLLZI = executor2;
        this.LJLJI = abstractC19140p4;
        this.LJLJJI = c19180p8;
    }
}
