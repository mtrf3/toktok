package X;

/* renamed from: X.Qie, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67764Qie extends AbstractRunnableC64621PXt {
    public final java.util.Map<InterfaceC67836Qjo, C67765Qif> LJLJI;
    public final /* synthetic */ C67761Qib LJLJJI;

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00da, code lost:
    
        if (r1 != 0) goto L35;
     */
    @Override // X.AbstractRunnableC64621PXt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r7 = this;
            X.Qk8 r4 = new X.Qk8
            X.Qib r0 = r7.LJLJJI
            X.QaU r0 = r0.LIZLLL
            r4.<init>(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Map<X.Qjo, X.Qif> r0 = r7.LJLJI
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r2 = r0.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r1 = r2.next()
            X.Qjo r1 = (X.InterfaceC67836Qjo) r1
            boolean r0 = r1.LJIILLIIL()
            if (r0 == 0) goto L3f
            java.util.Map<X.Qjo, X.Qif> r0 = r7.LJLJI
            java.lang.Object r0 = r0.get(r1)
            X.Qif r0 = (X.C67765Qif) r0
            boolean r0 = r0.LIZJ
            if (r0 != 0) goto L3f
            r6.add(r1)
            goto L1d
        L3f:
            r5.add(r1)
            goto L1d
        L43:
            boolean r0 = r6.isEmpty()
            r1 = -1
            r3 = 0
            if (r0 == 0) goto Laf
            int r2 = r5.size()
        L4f:
            if (r3 >= r2) goto Lc7
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r3)
            X.Qjo r1 = (X.InterfaceC67836Qjo) r1
            X.Qib r0 = r7.LJLJJI
            android.content.Context r0 = r0.LIZJ
            int r1 = r4.LIZ(r0, r1)
            int r3 = r3 + 1
            if (r1 != 0) goto L4f
        L63:
            X.Qib r1 = r7.LJLJJI
            boolean r0 = r1.LJIIL
            if (r0 == 0) goto L70
            X.Qit r0 = r1.LJIIJ
            if (r0 == 0) goto L70
            r0.LIZ()
        L70:
            java.util.Map<X.Qjo, X.Qif> r0 = r7.LJLJI
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r5 = r0.iterator()
        L7a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Ldd
            java.lang.Object r1 = r5.next()
            X.Qjo r1 = (X.InterfaceC67836Qjo) r1
            java.util.Map<X.Qjo, X.Qif> r0 = r7.LJLJI
            java.lang.Object r3 = r0.get(r1)
            X.Qix r3 = (X.InterfaceC67783Qix) r3
            boolean r0 = r1.LJIILLIIL()
            if (r0 == 0) goto Lab
            X.Qib r0 = r7.LJLJJI
            android.content.Context r0 = r0.LIZJ
            int r0 = r4.LIZ(r0, r1)
            if (r0 == 0) goto Lab
            X.Qib r2 = r7.LJLJJI
            X.QiZ r1 = r2.LIZ
            X.Qir r0 = new X.Qir
            r0.<init>(r2, r3)
            r1.LJIIIIZZ(r0)
            goto L7a
        Lab:
            r1.LJIIL(r3)
            goto L7a
        Laf:
            int r2 = r6.size()
        Lb3:
            if (r3 >= r2) goto Lda
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r3)
            X.Qjo r1 = (X.InterfaceC67836Qjo) r1
            X.Qib r0 = r7.LJLJJI
            android.content.Context r0 = r0.LIZJ
            int r1 = r4.LIZ(r0, r1)
            int r3 = r3 + 1
            if (r1 == 0) goto Lb3
        Lc7:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 0
            r3.<init>(r1, r0)
            X.Qib r2 = r7.LJLJJI
            X.QiZ r1 = r2.LIZ
            X.Qis r0 = new X.Qis
            r0.<init>(r7, r2, r3)
            r1.LJIIIIZZ(r0)
            return
        Lda:
            if (r1 == 0) goto L63
            goto Lc7
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67764Qie.LIZJ():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67764Qie(C67761Qib c67761Qib, java.util.Map<InterfaceC67836Qjo, C67765Qif> map) {
        super(c67761Qib);
        this.LJLJJI = c67761Qib;
        this.LJLJI = map;
    }
}
