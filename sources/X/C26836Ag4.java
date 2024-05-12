package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpSelectViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpSelectViewHolder$onBind$1$1", f = "PdpSelectViewHolder.kt", l = {54}, m = "invokeSuspend")
/* renamed from: X.Ag4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26836Ag4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpSelectViewHolder LJLILLLLZI;
    public final /* synthetic */ InterfaceC26837Ag5 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26836Ag4(PdpSelectViewHolder pdpSelectViewHolder, InterfaceC26837Ag5 interfaceC26837Ag5, InterfaceC67352kd<? super C26836Ag4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpSelectViewHolder;
        this.LJLJI = interfaceC26837Ag5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26836Ag4(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            PdpViewModel viewModel = this.LJLILLLLZI.getViewModel();
            C26835Ag3 c26835Ag3 = new C26835Ag3(this.LJLILLLLZI, this.LJLJI, null);
            this.LJLIL = 1;
            if (viewModel.Nw0(this, c26835Ag3, false) == enumC58928NAu) {
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
