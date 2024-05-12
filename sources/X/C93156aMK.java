package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewModel$getPublicKey$1", f = "PinVerifyViewModel.kt", l = {39}, m = "invokeSuspend")
/* renamed from: X.aMK, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93156aMK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ PinVerifyViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93156aMK(PinVerifyViewModel pinVerifyViewModel, InterfaceC67352kd<? super C93156aMK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = pinVerifyViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93156aMK(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        PinVerifyViewModel pinVerifyViewModel;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                pinVerifyViewModel = (PinVerifyViewModel) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            pinVerifyViewModel = this.LJLJI;
            C92059a4d c92059a4d = C92059a4d.LIZ;
            this.LJLIL = pinVerifyViewModel;
            this.LJLILLLLZI = 1;
            obj = c92059a4d.LIZJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        pinVerifyViewModel.LJLIL = (String) obj;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
