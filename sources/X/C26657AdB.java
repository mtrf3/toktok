package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.returnpolicy.UsReturnPolicyVH;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.returnpolicy.UsReturnPolicyVH$onBind$3$1$2", f = "UsReturnPolicyVH.kt", l = {68}, m = "invokeSuspend")
/* renamed from: X.AdB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26657AdB extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UsReturnPolicyVH LJLILLLLZI;
    public final /* synthetic */ C26669AdN LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26657AdB(UsReturnPolicyVH usReturnPolicyVH, C26669AdN c26669AdN, InterfaceC67352kd<? super C26657AdB> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = usReturnPolicyVH;
        this.LJLJI = c26669AdN;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26657AdB(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            UsReturnPolicyVH usReturnPolicyVH = this.LJLILLLLZI;
            ECBaseFragment eCBaseFragment = usReturnPolicyVH.LJLIL;
            UserRight userRight = this.LJLJI.LJLIL;
            IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpViewModel) usReturnPolicyVH.LJLILLLLZI.getValue()).LJLJJLL;
            this.LJLIL = 1;
            if (C26688Adg.LIZ(eCBaseFragment, userRight, pdpEnterParam, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
