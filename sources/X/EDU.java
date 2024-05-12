package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService$init$cacheJob$1", f = "RomaCheckService.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EDU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ RomaCheckService LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDU(RomaCheckService romaCheckService, InterfaceC67352kd<? super EDU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = romaCheckService;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EDU(this.LJLILLLLZI, interfaceC67352kd);
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
            if (!EDY.LIZ().getSkipCache()) {
                RomaCheckService romaCheckService = this.LJLILLLLZI;
                this.LJLIL = 1;
                if (romaCheckService.LJFF(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return Boolean.TRUE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
