package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.mota.runner.network.NetworkRunner$run$1", f = "NetworkRunner.kt", l = {47, 59}, m = "invokeSuspend")
/* renamed from: X.XGr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84561XGr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super XGX<InterfaceC57357MfB>>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public XGY LJLIL;
    public XGS LJLILLLLZI;
    public XGY LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ XGS LJLJJLL;
    public final /* synthetic */ C84563XGt LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84561XGr(XGS xgs, C84563XGt c84563XGt, InterfaceC67352kd<? super C84561XGr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = xgs;
        this.LJLJL = c84563XGt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C84561XGr c84561XGr = new C84561XGr(this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c84561XGr.LJLJJL = obj;
        return c84561XGr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84561XGr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super XGX<InterfaceC57357MfB>> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
