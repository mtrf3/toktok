package X;

import android.content.Context;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel$requestAuthCode$1", f = "AuthCommonViewModel.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OTH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AuthCommonViewModel LJLILLLLZI;
    public final /* synthetic */ OT6 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTH(AuthCommonViewModel authCommonViewModel, OT6 ot6, InterfaceC67352kd<? super OTH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = authCommonViewModel;
        this.LJLJI = ot6;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new OTH(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            AuthCommonViewModel authCommonViewModel = this.LJLILLLLZI;
            C61957OTh c61957OTh = authCommonViewModel.LJLJJL;
            Context LLLLJI = C16880lQ.LLLLJI(authCommonViewModel.getApplication());
            o.LJIIIIZZ(LLLLJI, "getApplication<Application?>().applicationContext");
            OT6 ot6 = this.LJLJI;
            OTD otd = this.LJLILLLLZI.LJLJJI;
            this.LJLIL = 1;
            c61957OTh.getClass();
            obj = OTE.LIZ.LIZ(LLLLJI, ot6, otd, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.LJLLILLLL.postValue(obj);
        return C76800UCe.LIZ;
    }
}
