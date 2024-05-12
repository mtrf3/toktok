package X;

import android.content.Context;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment$onValidateCode$1$1$2", f = "OtpFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aMA, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93146aMA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OtpFragment LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ Exception LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93146aMA(OtpFragment otpFragment, C68322mC<String> c68322mC, Exception exc, InterfaceC67352kd<? super C93146aMA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = otpFragment;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = exc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93146aMA(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C141335gf.LIZJ(obj);
        this.LJLIL.onEventFillIn(this.LJLILLLLZI.element);
        C91924a2S c91924a2S = C91924a2S.LIZ;
        EnumC91923a2R enumC91923a2R = EnumC91923a2R.DO_VERIFY;
        String message = this.LJLJI.getMessage();
        if (message == null) {
            message = "exception error";
        }
        c91924a2S.LIZLLL("otp", enumC91923a2R, message, this.LJLIL.LJLJJI);
        OtpFragment otpFragment = this.LJLIL;
        Context LIZIZ = EF7.LIZIZ();
        if (this.LJLJI instanceof C64698PaI) {
            i = R.string.f3i;
        } else {
            i = R.string.f3g;
        }
        otpFragment.Al(LIZIZ.getString(i));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
