package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright.PdpUserRightHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright.PdpUserRightHolder$onClick$1", f = "PdpUserRightHolder.kt", l = {361}, m = "invokeSuspend")
/* renamed from: X.AdU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26676AdU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpUserRightHolder LJLILLLLZI;
    public final /* synthetic */ C5H3<PdpViewModel> LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26676AdU(PdpUserRightHolder pdpUserRightHolder, C5H3<? extends PdpViewModel> c5h3, String str, InterfaceC67352kd<? super C26676AdU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpUserRightHolder;
        this.LJLJI = c5h3;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26676AdU(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C70414RkI c70414RkI = this.LJLJI.getValue().LLFII;
            if (c70414RkI != null) {
                C70414RkI.LJJJIL(c70414RkI, "user_rights", null, null, C113554cx.LJJL(new OSZ("rights_cnt", new Integer(this.LJLILLLLZI.LJLILLLLZI)), new OSZ("rights_content", this.LJLILLLLZI.LJLJI.toString()), new OSZ("module_show_type", this.LJLILLLLZI.LJLJJI)), 22);
            }
            PageNodeMonitorService.LJIIIZ().LJIIIIZZ("rights_service");
            PdpViewModel value = this.LJLJI.getValue();
            C26677AdV c26677AdV = new C26677AdV(this.LJLILLLLZI, this.LJLJJI, null);
            this.LJLIL = 1;
            if (value.Nw0(this, c26677AdV, false) == enumC58928NAu) {
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
