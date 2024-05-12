package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.TtfUkPdpReturnPolicyVH;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.TtfUkPdpReturnPolicyVH$eventTrackingAndOpen$1$3", f = "TtfUkPdpReturnPolicyVH.kt", l = {103}, m = "invokeSuspend")
/* renamed from: X.Ad6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26652Ad6 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TtfUkPdpReturnPolicyVH LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26652Ad6(TtfUkPdpReturnPolicyVH ttfUkPdpReturnPolicyVH, InterfaceC67352kd<? super C26652Ad6> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = ttfUkPdpReturnPolicyVH;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26652Ad6(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            TtfUkPdpReturnPolicyVH ttfUkPdpReturnPolicyVH = this.LJLILLLLZI;
            Fragment fragment = ttfUkPdpReturnPolicyVH.LJLIL;
            UserRight userRight = ((C26670AdO) ttfUkPdpReturnPolicyVH.getItem()).LJLIL;
            IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpViewModel) this.LJLILLLLZI.LJLILLLLZI.getValue()).LJLJJLL;
            this.LJLIL = 1;
            if (C26688Adg.LIZ(fragment, userRight, pdpEnterParam, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
