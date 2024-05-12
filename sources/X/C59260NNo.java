package X;

/* renamed from: X.NNo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59260NNo extends AbstractC65781Prl implements InterfaceC88472Yns<C59261NNp, Boolean> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59260NNo(long j, long j2, long j3) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r4 <= r7.LJLJI) goto L7;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(X.C59261NNp r8) {
        /*
            r7 = this;
            X.NNp r8 = (X.C59261NNp) r8
            java.lang.String r0 = r8.offset
            r6 = 1
            if (r0 == 0) goto Ld
            int r0 = r0.length()
            if (r0 != 0) goto L13
        Ld:
            r6 = 0
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L13:
            java.lang.String r1 = r8.name
            java.lang.String r0 = "progress"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L1e
            goto Ld
        L1e:
            long r2 = r7.LJLIL
            java.lang.String r1 = r8.offset
            java.lang.String r0 = "it.offset"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            long r4 = X.C59252NNg.LJIIJJI(r2, r1)
            long r2 = r7.LJLILLLLZI
            r0 = 1
            long r2 = r2 + r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto Ld
            long r1 = r7.LJLJI
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto Ld
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59260NNo.invoke(java.lang.Object):java.lang.Object");
    }
}
