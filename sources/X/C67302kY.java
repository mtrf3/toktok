package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM$suspendCancellableCoroutineWithTimeoutOrNull$2", f = "CustomDotVM.kt", l = {1396}, m = "invokeSuspend")
/* renamed from: X.2kY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67302kY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<Object>, Object> {
    public InterfaceC88472Yns LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<XJL<Object>, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C67302kY(InterfaceC88472Yns<? super XJL<Object>, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C67302kY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67302kY(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC88472Yns<XJL<Object>, C76800UCe> interfaceC88472Yns = this.LJLJI;
            this.LJLIL = interfaceC88472Yns;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            interfaceC88472Yns.invoke(xks);
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<Object> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
