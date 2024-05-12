package X;

/* renamed from: X.23S, reason: invalid class name */
/* loaded from: classes.dex */
public final class C23S extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, InterfaceC07790Sh> {
    public final /* synthetic */ C18690oL LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C1OH LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23S(C18690oL c18690oL, C1OH c1oh, boolean z) {
        super(3);
        this.LJLIL = c18690oL;
        this.LJLILLLLZI = z;
        this.LJLJI = c1oh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88473Ynt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC07790Sh invoke(X.InterfaceC07790Sh r11, X.InterfaceC24520xk r12, java.lang.Integer r13) {
        /*
            r10 = this;
            X.0Sh r11 = (X.InterfaceC07790Sh) r11
            X.0xk r12 = (X.InterfaceC24520xk) r12
            java.lang.Number r13 = (java.lang.Number) r13
            java.lang.String r1 = "$this$composed"
            r0 = 805428266(0x3001dc2a, float:4.72428E-10)
            X.C111074Xn.LIZIZ(r13, r11, r1, r12, r0)
            X.1o7 r0 = X.AnonymousClass057.LJIIJ
            java.lang.Object r1 = r12.LJIILLIIL(r0)
            X.0w6 r0 = X.EnumC23500w6.Rtl
            if (r1 != r0) goto Lce
            r2 = 1
        L19:
            X.0oL r0 = r10.LJLIL
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.LJ
            java.lang.Object r1 = r0.getValue()
            X.0UT r0 = X.C0UT.Vertical
            if (r1 == r0) goto L27
            if (r2 != 0) goto Lcb
        L27:
            r7 = 1
        L28:
            X.0oL r2 = r10.LJLIL
            r0 = 1157296644(0x44faf204, float:2007.563)
            r12.LJJIIJ(r0)
            boolean r0 = r12.LJIJJ(r2)
            java.lang.Object r1 = r12.LJIILL()
            if (r0 != 0) goto L43
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L4d
        L43:
            kotlin.jvm.internal.IDqS416S0100000 r1 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 264(0x108, float:3.7E-43)
            r1.<init>(r2, r0)
            r12.LJJIII(r1)
        L4d:
            r12.LJJIJIIJIL()
            java.lang.String r0 = "consumeScrollDelta"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r0 = -180460798(0xfffffffff53e6302, float:-2.4134388E32)
            r12.LJJIIJ(r0)
            X.1ar r2 = X.C78966Uyw.LJJJJIZL(r1, r12)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.LJJIIJ(r0)
            java.lang.Object r3 = r12.LJIILL()
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r3 != r0) goto L81
            kotlin.jvm.internal.IDqS416S0100000 r1 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 171(0xab, float:2.4E-43)
            r1.<init>(r2, r0)
            X.1My r3 = new X.1My
            r3.<init>(r1)
            r12.LJJIII(r3)
        L81:
            r12.LJJIJIIJIL()
            X.0UK r3 = (X.C0UK) r3
            r12.LJJIJIIJIL()
            X.1M1 r2 = X.InterfaceC07790Sh.LJJJI
            X.0oL r0 = r10.LJLIL
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.LJ
            java.lang.Object r4 = r0.getValue()
            X.0UT r4 = (X.C0UT) r4
            boolean r0 = r10.LJLILLLLZI
            if (r0 == 0) goto Lac
            X.0oL r0 = r10.LJLIL
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc9
        Lac:
            r6 = 0
        Lad:
            X.1OH r9 = r10.LJLJI
            r5 = 0
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r8 = r5
            X.0Sh r0 = X.C08250Ub.LIZIZ(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.LJJIJIIJIL()
            return r0
        Lc9:
            r6 = 1
            goto Lad
        Lcb:
            r7 = 0
            goto L28
        Lce:
            r2 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23S.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
