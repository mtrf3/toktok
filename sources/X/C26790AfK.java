package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.policy.PdpPolicyHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.policy.PdpPolicyHolder$onBind$2$1", f = "PdpPolicyHolder.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.AfK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26790AfK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ java.util.Map<String, Object> LJLILLLLZI;
    public final /* synthetic */ C5H3<PdpViewModel> LJLJI;
    public final /* synthetic */ PdpPolicyHolder LJLJJI;
    public final /* synthetic */ C26792AfM LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26790AfK(java.util.Map<String, Object> map, C5H3<? extends PdpViewModel> c5h3, PdpPolicyHolder pdpPolicyHolder, C26792AfM c26792AfM, InterfaceC67352kd<? super C26790AfK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = map;
        this.LJLJI = c5h3;
        this.LJLJJI = pdpPolicyHolder;
        this.LJLJJL = c26792AfM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26790AfK(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
                C70414RkI.LJJJIL(c70414RkI, "retailer_policies", null, null, this.LJLILLLLZI, 22);
            }
            PdpViewModel value = this.LJLJI.getValue();
            C26791AfL c26791AfL = new C26791AfL(this.LJLJJI, this.LJLJJL, this.LJLJI, null);
            this.LJLIL = 1;
            if (value.Nw0(this, c26791AfL, false) == enumC58928NAu) {
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
