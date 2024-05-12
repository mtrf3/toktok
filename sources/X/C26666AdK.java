package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.GlobalReturnPolicyVH;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.GlobalReturnPolicyVH$onClick$1", f = "GlobalReturnPolicyVH.kt", l = {88}, m = "invokeSuspend")
/* renamed from: X.AdK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26666AdK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GlobalReturnPolicyVH LJLILLLLZI;
    public final /* synthetic */ C26669AdN LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26666AdK(GlobalReturnPolicyVH globalReturnPolicyVH, C26669AdN c26669AdN, InterfaceC67352kd<? super C26666AdK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = globalReturnPolicyVH;
        this.LJLJI = c26669AdN;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26666AdK(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            View view = this.LJLILLLLZI.itemView;
            C78946Uyc.LJJIIJ(view, OUR.LIZLLL(view, "itemView"), C26667AdL.LJLIL);
            PageNodeMonitorService.LJIIIZ().LJIIIIZZ("return_policy");
            PdpViewModel vm = this.LJLILLLLZI.getVm();
            C26665AdJ c26665AdJ = new C26665AdJ(this.LJLILLLLZI, this.LJLJI, null);
            this.LJLIL = 1;
            if (vm.Nw0(this, c26665AdJ, false) == enumC58928NAu) {
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
