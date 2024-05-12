package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0KX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0KX {
    public final C0KV LIZ;
    public final C0CM LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C0KW LJ;
    public AbstractC029409q<?> LJFF;
    public boolean LJI;

    public final void LIZ() {
        if (!this.LJI) {
            AbstractC029409q<?> adapter = this.LIZIZ.getAdapter();
            this.LJFF = adapter;
            if (adapter != null) {
                this.LJI = true;
                final C0KV c0kv = this.LIZ;
                this.LIZIZ.LIZIZ(new C0CJ(c0kv) { // from class: X.1Go
                    public final WeakReference<C0KV> LJLIL;
                    public int LJLJI = 0;
                    public int LJLILLLLZI = 0;

                    {
                        this.LJLIL = new WeakReference<>(c0kv);
                    }

                    @Override // X.C0CJ
                    public final void LIZ(int i) {
                        this.LJLILLLLZI = this.LJLJI;
                        this.LJLJI = i;
                    }

                    @Override // X.C0CJ
                    public final void LIZJ(int i) {
                        boolean z;
                        C0KV c0kv2 = this.LJLIL.get();
                        if (c0kv2 != null && c0kv2.getSelectedTabPosition() != i && i < c0kv2.getTabCount()) {
                            int i2 = this.LJLJI;
                            if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c0kv2.LJIILJJIL(c0kv2.LJIIJ(i), z);
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
                    
                        r3 = true;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
                    
                        r5.LJIILLIIL(r7, r8, r1, r3);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
                    
                        return;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
                    
                        if (r4 == 2) goto L10;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
                    
                        if (r6.LJLILLLLZI != 0) goto L12;
                     */
                    @Override // X.C0CJ
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(int r7, float r8, int r9) {
                        /*
                            r6 = this;
                            java.lang.ref.WeakReference<X.0KV> r0 = r6.LJLIL
                            java.lang.Object r5 = r0.get()
                            X.0KV r5 = (X.C0KV) r5
                            if (r5 == 0) goto L20
                            int r4 = r6.LJLJI
                            r3 = 0
                            r1 = 1
                            r2 = 2
                            if (r4 != r2) goto L15
                            int r0 = r6.LJLILLLLZI
                            if (r0 != r1) goto L21
                        L15:
                            r1 = 1
                            if (r4 != r2) goto L1c
                        L18:
                            int r0 = r6.LJLILLLLZI
                            if (r0 == 0) goto L1d
                        L1c:
                            r3 = 1
                        L1d:
                            r5.LJIILLIIL(r7, r8, r1, r3)
                        L20:
                            return
                        L21:
                            r1 = 0
                            goto L18
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C30221Go.LIZIZ(int, float, int):void");
                    }
                });
                final C0CM c0cm = this.LIZIZ;
                final boolean z = this.LIZLLL;
                this.LIZ.LIZ(new C0KN(c0cm, z) { // from class: X.1Gp
                    public final C0CM LIZ;
                    public final boolean LIZIZ;

                    @Override // X.C0KN
                    public final void LIZ() {
                    }

                    @Override // X.C0KN
                    public final void LIZJ(C0KT c0kt) {
                    }

                    @Override // X.C0KN
                    public final void LIZIZ(C0KT c0kt) {
                        this.LIZ.LIZLLL(c0kt.LJFF, this.LIZIZ);
                    }

                    {
                        this.LIZ = c0cm;
                        this.LIZIZ = z;
                    }
                });
                if (this.LIZJ) {
                    this.LJFF.registerAdapterDataObserver(new AbstractC029609s() { // from class: X.1Gn
                        @Override // X.AbstractC029609s
                        public final void LIZJ() {
                            C0KX.this.LIZIZ();
                        }

                        @Override // X.AbstractC029609s
                        public final void LIZLLL(int i, int i2) {
                            C0KX.this.LIZIZ();
                        }

                        @Override // X.AbstractC029609s
                        public final void LJFF(int i, int i2) {
                            C0KX.this.LIZIZ();
                        }

                        @Override // X.AbstractC029609s
                        public final void LJI(int i, int i2) {
                            C0KX.this.LIZIZ();
                        }

                        @Override // X.AbstractC029609s
                        public final void LJII(int i, int i2) {
                            C0KX.this.LIZIZ();
                        }

                        @Override // X.AbstractC029609s
                        public final void LJ(int i, int i2, Object obj) {
                            C0KX.this.LIZIZ();
                        }
                    });
                }
                LIZIZ();
                this.LIZ.LJIILLIIL(this.LIZIZ.getCurrentItem(), 0.0f, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public final void LIZIZ() {
        this.LIZ.LJIILIIL();
        AbstractC029409q<?> abstractC029409q = this.LJFF;
        if (abstractC029409q != null) {
            int itemCount = abstractC029409q.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C0KT LJIIJJI = this.LIZ.LJIIJJI();
                this.LJ.LIZ(LJIIJJI, i);
                C0KV c0kv = this.LIZ;
                c0kv.LIZIZ(c0kv.LJLIL.size(), LJIIJJI, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.LIZIZ.getCurrentItem(), this.LIZ.getTabCount() - 1);
                if (min != this.LIZ.getSelectedTabPosition()) {
                    C0KV c0kv2 = this.LIZ;
                    c0kv2.LJIILJJIL(c0kv2.LJIIJ(min), true);
                }
            }
        }
    }

    public C0KX(C0KV c0kv, C0CM c0cm, boolean z, C0KW c0kw) {
        this(c0kv, c0cm, z, true, c0kw);
    }

    public C0KX(C0KV c0kv, C0CM c0cm, boolean z, boolean z2, C0KW c0kw) {
        this.LIZ = c0kv;
        this.LIZIZ = c0cm;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = c0kw;
    }
}
