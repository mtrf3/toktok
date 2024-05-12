package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.BindPaymentMethodNavKt$NavigationHandler$1$1", f = "BindPaymentMethodNav.kt", l = {354}, m = "invokeSuspend")
/* renamed from: X.aLa, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93110aLa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C92145a61 LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93110aLa(C92145a61 c92145a61, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, InterfaceC67352kd<? super C93110aLa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c92145a61;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = interfaceC88472Yns2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93110aLa(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C79883Bo c79883Bo = this.LJLILLLLZI.LJJIIJ;
            C92211a75 c92211a75 = new C92211a75(this.LJLJI, this.LJLJJI);
            this.LJLIL = 1;
            if (c79883Bo.collect(c92211a75, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
