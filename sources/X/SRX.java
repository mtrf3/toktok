package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.compose.MentionVideoListPageKt$MentionVideoListPage$1$1", f = "MentionVideoListPage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class SRX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC24760y8<SRI> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SRX(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC24760y8<SRI> interfaceC24760y8, InterfaceC67352kd<? super SRX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC65784Pro2;
        this.LJLJJI = interfaceC24760y8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new SRX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 != 5) goto L8;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            X.C141335gf.LIZJ(r3)
            X.0y8<X.SRI> r0 = r2.LJLJJI
            java.lang.Object r0 = r0.getValue()
            X.SRI r0 = (X.SRI) r0
            int r1 = r0.LJLJI
            r0 = 1
            if (r1 == r0) goto L23
            r0 = 2
            if (r1 == r0) goto L19
            r0 = 5
            if (r1 == r0) goto L23
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            boolean r0 = r2.LJLILLLLZI
            if (r0 == 0) goto L16
            X.Pro<X.UCe> r0 = r2.LJLJI
            r0.invoke()
            goto L16
        L23:
            X.Pro<X.UCe> r0 = r2.LJLIL
            r0.invoke()
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
