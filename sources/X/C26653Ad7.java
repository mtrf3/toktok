package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.TtfUkPdpReturnPolicyVH;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.TtfUkPdpReturnPolicyVH$eventTrackingAndOpen$1", f = "TtfUkPdpReturnPolicyVH.kt", l = {102}, m = "invokeSuspend")
/* renamed from: X.Ad7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26653Ad7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TtfUkPdpReturnPolicyVH LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26653Ad7(TtfUkPdpReturnPolicyVH ttfUkPdpReturnPolicyVH, InterfaceC67352kd<? super C26653Ad7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ttfUkPdpReturnPolicyVH;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26653Ad7(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            C78946Uyc.LJJIIJ(view, OUR.LIZLLL(view, "itemView"), C26654Ad8.LJLIL);
            ExposeUserRightPanel exposeUserRightPanel = ((C26670AdO) this.LJLILLLLZI.getItem()).LJLIL.exposeUserRightPanel;
            if (exposeUserRightPanel != null && (str = exposeUserRightPanel.schema) != null) {
                Context context = this.LJLILLLLZI.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                C26867AgZ.LIZIZ(context, str, C113554cx.LJJJLIIL(), false).open();
            } else {
                PdpViewModel pdpViewModel = (PdpViewModel) this.LJLILLLLZI.LJLILLLLZI.getValue();
                C26652Ad6 c26652Ad6 = new C26652Ad6(this.LJLILLLLZI, null);
                this.LJLIL = 1;
                if (pdpViewModel.Nw0(this, c26652Ad6, false) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
