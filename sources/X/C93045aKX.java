package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.business.PhoneNumberKt$onCountryCodeTap$3$1$1$2$1", f = "PhoneNumber.kt", l = {168}, m = "invokeSuspend")
/* renamed from: X.aKX, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93045aKX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1ZD LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93045aKX(C1ZD c1zd, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C93045aKX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1zd;
        this.LJLJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93045aKX(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C1ZD c1zd = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (c1zd.LJIIIZ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.invoke();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}