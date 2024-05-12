package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewModel;
import com.ss.android.ugc.aweme.bnpl.network.VerifyApi;
import com.ss.android.ugc.aweme.bnpl.network.model.ApplyRepaymentResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import fjb.a;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewModel$consultChangePin$1", f = "PinChangeViewModel.kt", l = {145}, m = "invokeSuspend")
/* renamed from: X.aMD, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93149aMD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PinChangeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93149aMD(PinChangeViewModel pinChangeViewModel, InterfaceC67352kd<? super C93149aMD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pinChangeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93149aMD(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        PinChangeViewModel pinChangeViewModel;
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
                    this.LJLILLLLZI.LJLILLLLZI = System.currentTimeMillis();
                    this.LJLILLLLZI.setState(C92997aJl.LJLIL);
                    C91820a0m c91820a0m = VerifyApi.LIZ;
                    this.LJLIL = 1;
                    c91820a0m.getClass();
                    obj = C91820a0m.LIZIZ.consultChangePin(this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                C64797Pbt c64797Pbt = (C64797Pbt) obj;
                if (c64797Pbt.LIZIZ()) {
                    if (((BaseResponse) c64797Pbt.LIZIZ).LIZ()) {
                        this.LJLILLLLZI.setState(new IDqS418S0100000_31(c64797Pbt, (C64797Pbt<BaseResponse<ApplyRepaymentResponse>>) 104));
                    } else {
                        String str = ((BaseResponse) c64797Pbt.LIZIZ).errorCode;
                        if (o.LJ(str, "PIN_FROZEN")) {
                            this.LJLILLLLZI.setState(new IDqS418S0100000_31(c64797Pbt, (C64797Pbt<BaseResponse<ApplyRepaymentResponse>>) 105));
                        } else if (o.LJ(str, "PIN_INVALID")) {
                            this.LJLILLLLZI.setState(new IDqS418S0100000_31(c64797Pbt, (C64797Pbt<BaseResponse<ApplyRepaymentResponse>>) 106));
                        } else {
                            this.LJLILLLLZI.setState(new IDqS418S0100000_31(c64797Pbt, (C64797Pbt<BaseResponse<ApplyRepaymentResponse>>) 107));
                        }
                    }
                } else {
                    this.LJLILLLLZI.setState(C92998aJm.LJLIL);
                }
                pinChangeViewModel = this.LJLILLLLZI;
                iDqS418S0100000_31 = new IDqS418S0100000_31(pinChangeViewModel, 109);
            } catch (Exception e) {
                this.LJLILLLLZI.setState(new IDqS418S0100000_31(e, 108));
                pinChangeViewModel = this.LJLILLLLZI;
                iDqS418S0100000_31 = new IDqS418S0100000_31(pinChangeViewModel, 109);
            }
            pinChangeViewModel.setState(iDqS418S0100000_31);
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            PinChangeViewModel pinChangeViewModel2 = this.LJLILLLLZI;
            pinChangeViewModel2.setState(new IDqS418S0100000_31(pinChangeViewModel2, 109));
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
