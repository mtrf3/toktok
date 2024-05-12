package X;

import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.bnpl.network.model.ApplyRepaymentResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.ConfirmRegisterMobileResponse;
import fjb.a;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM$confirmRegisterMobile$2$1", f = "PhoneNumberVM.kt", l = {81, 84}, m = "invokeSuspend")
/* renamed from: X.aLz, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93135aLz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C64797Pbt<BaseResponse<ConfirmRegisterMobileResponse>> LJLILLLLZI;
    public final /* synthetic */ PhoneNumberVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93135aLz(C64797Pbt<BaseResponse<ConfirmRegisterMobileResponse>> c64797Pbt, PhoneNumberVM phoneNumberVM, InterfaceC67352kd<? super C93135aLz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c64797Pbt;
        this.LJLJI = phoneNumberVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93135aLz(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLILLLLZI.LIZIZ() && o.LJ(this.LJLILLLLZI.LIZIZ.resultCode, "success")) {
                if (this.LJLILLLLZI.LIZIZ.data.verifyInfo.length() > 0) {
                    this.LJLJI.setState(new IDqS418S0100000_31(this.LJLILLLLZI, (C64797Pbt<BaseResponse<ApplyRepaymentResponse>>) 98));
                } else {
                    PhoneNumberVM phoneNumberVM = this.LJLJI;
                    String str = this.LJLILLLLZI.LIZIZ.errorContent;
                    this.LJLIL = 1;
                    if (phoneNumberVM.gv0(str, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            } else {
                PhoneNumberVM phoneNumberVM2 = this.LJLJI;
                String str2 = this.LJLILLLLZI.LIZIZ.errorContent;
                this.LJLIL = 2;
                if (phoneNumberVM2.gv0(str2, this) == enumC58928NAu) {
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
