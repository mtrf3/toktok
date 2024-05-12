package X;

/* renamed from: X.aBC, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92466aBC extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C91741ZzV LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<C91741ZzV, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92466aBC(C91741ZzV c91741ZzV, String str, InterfaceC88472Yns<? super C91741ZzV, C76800UCe> interfaceC88472Yns, int i, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, int i2, String str2, boolean z, boolean z2) {
        super(3);
        this.LJLIL = c91741ZzV;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC88472Yns2;
        this.LJLJJLL = i2;
        this.LJLJL = str2;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r11 == X.C24500xi.LIZIZ) goto L19;
     */
    @Override // X.InterfaceC88473Ynt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(X.InterfaceC07790Sh r33, X.InterfaceC24520xk r34, java.lang.Integer r35) {
        /*
            r32 = this;
            r0 = r35
            r10 = r33
            r3 = r34
            X.0Sh r10 = (X.InterfaceC07790Sh) r10
            X.0xk r3 = (X.InterfaceC24520xk) r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r0 = r8 & 14
            if (r0 != 0) goto L21
            boolean r0 = r3.LJIJJ(r10)
            if (r0 == 0) goto Lc4
            r0 = 4
        L20:
            r8 = r8 | r0
        L21:
            r0 = r8 & 91
            r0 = r0 ^ 18
            if (r0 != 0) goto L2d
            boolean r0 = r3.LIZ()
            if (r0 != 0) goto Lc0
        L2d:
            r0 = r32
            X.ZzV r1 = r0.LJLIL
            java.lang.String r9 = r1.toString()
            java.lang.String r2 = r0.LJLILLLLZI
            if (r2 != 0) goto L3b
            java.lang.String r2 = "MM/YY"
        L3b:
            X.0oe r14 = new X.0oe
            r5 = 0
            r1 = 11
            r4 = 3
            r14.<init>(r4, r5, r1)
            X.a67 r16 = new X.a67
            r16.<init>()
            X.Yns<X.ZzV, X.UCe> r5 = r0.LJLJI
            r1 = 1157296644(0x44faf204, float:2007.563)
            r3.LJJIIJ(r1)
            boolean r1 = r3.LJIJJ(r5)
            java.lang.Object r11 = r3.LJIILL()
            if (r1 != 0) goto L64
            X.0xi r1 = X.InterfaceC24520xk.LIZ
            r1.getClass()
            X.0xh r1 = X.C24500xi.LIZIZ
            if (r11 != r1) goto L6d
        L64:
            kotlin.jvm.internal.IDqS418S0100000_31 r11 = new kotlin.jvm.internal.IDqS418S0100000_31
            r1 = 6
            r11.<init>(r5, r1)
            r3.LJJIII(r11)
        L6d:
            r3.LJJIJIIJIL()
            X.Yns r11 = (X.InterfaceC88472Yns) r11
            X.Yns<java.lang.Boolean, X.UCe> r12 = r0.LJLJJL
            int r13 = r0.LJLJJLL
            java.lang.String r7 = r0.LJLJL
            boolean r6 = r0.LJLJLJ
            boolean r1 = r0.LJLJLLL
            r15 = 0
            r21 = 0
            int r8 = r8 << r4
            r29 = r8 & 112(0x70, float:1.57E-43)
            int r4 = r0.LJLJJI
            int r5 = r4 >> 3
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            r29 = r29 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r0
            r29 = r29 | r5
            int r5 = r4 << 18
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r0
            r29 = r29 | r5
            int r0 = r4 >> 21
            r30 = r0 & 14
            int r0 = r4 >> 24
            r0 = r0 & 112(0x70, float:1.57E-43)
            r30 = r30 | r0
            r31 = 520256(0x7f040, float:7.29034E-40)
            r22 = r15
            r23 = r15
            r24 = r15
            r25 = r21
            r26 = r21
            r27 = r15
            r28 = r3
            r19 = r6
            r20 = r1
            r18 = r2
            r17 = r7
            X.C92026a46.LIZ(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        Lbd:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lc0:
            r3.LIZLLL()
            goto Lbd
        Lc4:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92466aBC.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
