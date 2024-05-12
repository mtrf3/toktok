package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.CheckoutContainerKt$HandleNavigation$1$1", f = "CheckoutContainer.kt", l = {196}, m = "invokeSuspend")
/* renamed from: X.aLP, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93099aLP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C92145a61 LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<CheckoutNavBarState, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93099aLP(C92145a61 c92145a61, InterfaceC88472Yns<? super CheckoutNavBarState, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C93099aLP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c92145a61;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93099aLP(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C92210a74 c92210a74 = new C92210a74(this.LJLJI);
            this.LJLIL = 1;
            if (c79883Bo.collect(c92210a74, this) == enumC58928NAu) {
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
