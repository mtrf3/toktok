package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.security.PdpSecurityHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.security.PdpSecurityHolder$eventTrackingAndOpen$1", f = "PdpSecurityHolder.kt", l = {132}, m = "invokeSuspend")
/* renamed from: X.Ada, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26682Ada extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpSecurityHolder LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26682Ada(PdpSecurityHolder pdpSecurityHolder, InterfaceC67352kd<? super C26682Ada> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpSecurityHolder;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26682Ada(this.LJLILLLLZI, interfaceC67352kd);
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
            C78946Uyc.LJJIIJ(view, OUR.LIZLLL(view, "itemView"), C26683Adb.LJLIL);
            PdpViewModel pdpViewModel = (PdpViewModel) this.LJLILLLLZI.LJLILLLLZI.getValue();
            C26684Adc c26684Adc = new C26684Adc(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            if (pdpViewModel.Nw0(this, c26684Adc, false) == enumC58928NAu) {
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
