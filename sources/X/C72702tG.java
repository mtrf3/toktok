package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$startCountDownJob$job$1", f = "PdpViewModel.kt", l = {3877}, m = "invokeSuspend")
/* renamed from: X.2tG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72702tG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PdpViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72702tG(PdpViewModel pdpViewModel, InterfaceC67352kd<? super C72702tG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = pdpViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C72702tG c72702tG = new C72702tG(this.LJLJI, interfaceC67352kd);
        c72702tG.LJLILLLLZI = obj;
        return c72702tG;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
        }
        while (C48841JEv.LJIILLIIL(interfaceC70422pa)) {
            Iterator<InterfaceC72712tH> it = this.LJLJI.LLJILJILJ.iterator();
            while (it.hasNext()) {
                it.next().onCountDown(System.currentTimeMillis());
            }
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            if (C1JD.LIZJ(1000L, this) == enumC58928NAu) {
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
