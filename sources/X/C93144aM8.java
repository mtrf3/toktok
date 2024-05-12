package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.ss.android.ugc.aweme.bnpl.network.VerifyApi;
import com.ss.android.ugc.aweme.bnpl.network.model.SendVerifyCodeRequest;
import com.ss.android.ugc.aweme.bnpl.network.model.VerifyCodeDetail;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment$onCountDownStart$1", f = "OtpFragment.kt", l = {376}, m = "invokeSuspend")
/* renamed from: X.aM8, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93144aM8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OtpFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93144aM8(OtpFragment otpFragment, InterfaceC67352kd<? super C93144aM8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = otpFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93144aM8(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                C91820a0m c91820a0m = VerifyApi.LIZ;
                OtpFragment otpFragment = this.LJLILLLLZI;
                String str = otpFragment.LJLJL;
                if (str == null) {
                    str = C91826a0s.LIZ;
                }
                String str2 = otpFragment.LJLJJI;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = otpFragment.LJLJJL;
                if (str3 == null) {
                    str3 = "OTP";
                }
                String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), new VerifyCodeDetail(String.valueOf(this.LJLILLLLZI.LJLJJLL), String.valueOf(EF7.LJIIIZ)));
                o.LJIIIIZZ(json, "get().gson.toJson(this)");
                SendVerifyCodeRequest sendVerifyCodeRequest = new SendVerifyCodeRequest(str2, str3, "SMS", json);
                this.LJLIL = 1;
                c91820a0m.getClass();
                if (C91820a0m.LIZIZ(str, sendVerifyCodeRequest, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
