package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PayAuthHelper$startLoopInner$1", f = "PayAuthHelper.kt", l = {64}, m = "invokeSuspend")
/* renamed from: X.EGt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36151EGt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36151EGt(String str, InterfaceC67352kd<? super C36151EGt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36151EGt(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0022 -> B:5:0x000c). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLIL
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L2c
            X.C141335gf.LIZJ(r5)
        Lc:
            java.lang.String r0 = r4.LJLILLLLZI
            X.EO3.LIZLLL(r0)
        L11:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.Integer> r0 = X.EO3.LIZJ
            int r0 = r0.size()
            if (r0 <= 0) goto L29
            r4.LJLIL = r2
            r0 = 300000(0x493e0, double:1.482197E-318)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r4)
            if (r0 != r3) goto Lc
            return r3
        L25:
            X.C141335gf.LIZJ(r5)
            goto L11
        L29:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36151EGt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
