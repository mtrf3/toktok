package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.material.DefaultButtonElevation$elevation$3", f = "Button.kt", l = {561}, m = "invokeSuspend")
/* renamed from: X.2Fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55502Fu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C07070Pn<C23390vv, C1JM> LJLILLLLZI;
    public final /* synthetic */ C1ZK LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ C0X8 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55502Fu(C07070Pn<C23390vv, C1JM> c07070Pn, C1ZK c1zk, float f, C0X8 c0x8, InterfaceC67352kd<? super C55502Fu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c07070Pn;
        this.LJLJI = c1zk;
        this.LJLJJI = f;
        this.LJLJJL = c0x8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55502Fu(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r0 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r0 != r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        r0 = X.C76800UCe.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r0 == r1) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLIL
            r5 = 1
            if (r0 == 0) goto Lf
            if (r0 != r5) goto Lb7
            X.C141335gf.LIZJ(r11)
        Lc:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lf:
            X.C141335gf.LIZJ(r11)
            X.0Pn<X.0vv, X.1JM> r0 = r10.LJLILLLLZI
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.LJ
            java.lang.Object r0 = r0.getValue()
            X.0vv r0 = (X.C23390vv) r0
            float r2 = r0.LJLIL
            X.1ZK r0 = r10.LJLJI
            float r0 = r0.LIZIZ
            boolean r0 = X.C23390vv.LIZJ(r2, r0)
            r4 = 0
            if (r0 == 0) goto L96
            X.1OJ r4 = new X.1OJ
            long r2 = X.C10370av.LIZIZ
            r4.<init>(r2)
        L30:
            X.0Pn<X.0vv, X.1JM> r6 = r10.LJLILLLLZI
            float r3 = r10.LJLJJI
            X.0X8 r2 = r10.LJLJJL
            r10.LJLIL = r5
            if (r2 == 0) goto L69
            boolean r0 = r2 instanceof X.C1OJ
            if (r0 == 0) goto L54
            X.1v6<X.0vv> r8 = X.C21760tI.LIZ
        L41:
            if (r8 == 0) goto L87
            X.0vv r7 = new X.0vv
            r7.<init>(r3)
            r9 = 0
            r11 = 12
            java.lang.Object r0 = X.C07070Pn.LIZIZ(r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L93
        L51:
            if (r0 != r1) goto Lc
            return r1
        L54:
            boolean r0 = r2 instanceof X.C1OB
            if (r0 == 0) goto L5b
            X.1v6<X.0vv> r8 = X.C21760tI.LIZ
            goto L41
        L5b:
            boolean r0 = r2 instanceof X.C1OF
            if (r0 == 0) goto L62
            X.1v6<X.0vv> r8 = X.C21760tI.LIZ
            goto L41
        L62:
            boolean r0 = r2 instanceof X.C1OD
            if (r0 == 0) goto L87
            X.1v6<X.0vv> r8 = X.C21760tI.LIZ
            goto L41
        L69:
            if (r4 == 0) goto L87
            boolean r0 = r4 instanceof X.C1OJ
            if (r0 == 0) goto L72
            X.1v6<X.0vv> r8 = X.C21760tI.LIZIZ
            goto L41
        L72:
            boolean r0 = r4 instanceof X.C1OB
            if (r0 == 0) goto L79
            X.1v6<X.0vv> r8 = X.C21760tI.LIZIZ
            goto L41
        L79:
            boolean r0 = r4 instanceof X.C1OF
            if (r0 == 0) goto L80
            X.1v6<X.0vv> r8 = X.C21760tI.LIZJ
            goto L41
        L80:
            boolean r0 = r4 instanceof X.C1OD
            if (r0 == 0) goto L87
            X.1v6<X.0vv> r8 = X.C21760tI.LIZIZ
            goto L41
        L87:
            X.0vv r0 = new X.0vv
            r0.<init>(r3)
            java.lang.Object r0 = r6.LIZLLL(r0, r10)
            if (r0 != r1) goto L93
            goto L51
        L93:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L51
        L96:
            X.1ZK r0 = r10.LJLJI
            float r0 = r0.LIZLLL
            boolean r0 = X.C23390vv.LIZJ(r2, r0)
            if (r0 == 0) goto La6
            X.1OF r4 = new X.1OF
            r4.<init>()
            goto L30
        La6:
            X.1ZK r0 = r10.LJLJI
            float r0 = r0.LJ
            boolean r0 = X.C23390vv.LIZJ(r2, r0)
            if (r0 == 0) goto L30
            X.1OD r4 = new X.1OD
            r4.<init>()
            goto L30
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55502Fu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
