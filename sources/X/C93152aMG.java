package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.forgot.PinForgotViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinForgotConsultResult;
import com.ss.android.ugc.aweme.bnpl.network.VerifyApi;
import com.ss.android.ugc.aweme.bnpl.network.model.ApplyRepaymentResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import fjb.a;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS8S1000000_31;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.forgot.PinForgotViewModel$pinForgotConsult$1", f = "PinForgotViewModel.kt", l = {35}, m = "invokeSuspend")
/* renamed from: X.aMG, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93152aMG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PinForgotViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93152aMG(PinForgotViewModel pinForgotViewModel, InterfaceC67352kd<? super C93152aMG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pinForgotViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93152aMG(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        PinForgotViewModel pinForgotViewModel;
        IDqS418S0100000_31 iDqS418S0100000_31;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C141335gf.LIZJ(obj);
                } else {
                    C141335gf.LIZJ(obj);
                    this.LJLILLLLZI.LJLIL = System.currentTimeMillis();
                    this.LJLILLLLZI.setState(C93002aJq.LJLIL);
                    C91820a0m c91820a0m = VerifyApi.LIZ;
                    this.LJLIL = 1;
                    c91820a0m.getClass();
                    obj = C91820a0m.LIZIZ.consultForgotPin(this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                C64797Pbt c64797Pbt = (C64797Pbt) obj;
                if (c64797Pbt.LIZIZ()) {
                    if (((BaseResponse) c64797Pbt.LIZIZ).LIZ()) {
                        this.LJLILLLLZI.setState(new IDqS8S1000000_31(new JSONObject(((PinForgotConsultResult) ((BaseResponse) c64797Pbt.LIZIZ).data).verifyInfo).optString("verify_detail"), 5));
                    } else if (o.LJ(((BaseResponse) c64797Pbt.LIZIZ).errorCode, "PIN_FROZEN")) {
                        this.LJLILLLLZI.setState(new IDqS418S0100000_31(c64797Pbt, (C64797Pbt<BaseResponse<ApplyRepaymentResponse>>) 112));
                    } else {
                        this.LJLILLLLZI.setState(new IDqS418S0100000_31(c64797Pbt, (C64797Pbt<BaseResponse<ApplyRepaymentResponse>>) 113));
                    }
                } else {
                    this.LJLILLLLZI.setState(new IDqS418S0100000_31(c64797Pbt, (C64797Pbt<BaseResponse<ApplyRepaymentResponse>>) 114));
                }
                pinForgotViewModel = this.LJLILLLLZI;
                iDqS418S0100000_31 = new IDqS418S0100000_31(pinForgotViewModel, 116);
            } catch (Exception e) {
                this.LJLILLLLZI.setState(new IDqS418S0100000_31(e, 115));
                pinForgotViewModel = this.LJLILLLLZI;
                iDqS418S0100000_31 = new IDqS418S0100000_31(pinForgotViewModel, 116);
            }
            pinForgotViewModel.setState(iDqS418S0100000_31);
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            PinForgotViewModel pinForgotViewModel2 = this.LJLILLLLZI;
            pinForgotViewModel2.setState(new IDqS418S0100000_31(pinForgotViewModel2, 116));
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
