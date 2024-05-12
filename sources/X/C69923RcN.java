package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PdpAddToShowcaseRequest;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$addToShowcase$1", f = "PdpViewModel.kt", l = {5066, 5067}, m = "invokeSuspend")
/* renamed from: X.RcN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69923RcN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public C68322mC LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ PdpViewModel LJLJJI;
    public final /* synthetic */ View LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69923RcN(View view, PdpViewModel pdpViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = pdpViewModel;
        this.LJLJJL = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69923RcN(this.LJLJJL, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C68322mC c68322mC;
        C68322mC c68322mC2;
        T t;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c68322mC = this.LJLILLLLZI;
            c68322mC2 = this.LJLIL;
            C141335gf.LIZJ(obj2);
            t = obj2;
        } else {
            C141335gf.LIZJ(obj2);
            this.LJLJJI.setState(RWV.LJLIL);
            PdpAddToShowcaseRequest pdpAddToShowcaseRequest = new PdpAddToShowcaseRequest(this.LJLJJI.jw0(), new Integer(2), new Integer(5), null, null, 24, null);
            c68322mC = new C68322mC();
            C70091Rf5 c70091Rf5 = PdpApi.LIZ;
            this.LJLIL = c68322mC;
            this.LJLILLLLZI = c68322mC;
            this.LJLJI = 1;
            Object LIZ = c70091Rf5.LIZ(pdpAddToShowcaseRequest, this);
            if (LIZ == enumC58928NAu) {
                return enumC58928NAu;
            }
            c68322mC2 = c68322mC;
            t = LIZ;
        }
        c68322mC.element = t;
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C69956Rcu c69956Rcu = new C69956Rcu(this.LJLJJI, c68322mC2, this.LJLJJL, null);
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = 2;
        if (XKX.LJI(abstractC78621UtN, c69956Rcu, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
