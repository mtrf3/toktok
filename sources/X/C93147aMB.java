package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.ss.android.ugc.aweme.bnpl.network.VerifyApi;
import com.ss.android.ugc.aweme.bnpl.network.model.DoVerifyRequest;
import fjb.a;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment$onValidateCode$1$1", f = "OtpFragment.kt", l = {420, 429, 473}, m = "invokeSuspend")
/* renamed from: X.aMB, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93147aMB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ OtpFragment LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93147aMB(OtpFragment otpFragment, String str, InterfaceC67352kd<? super C93147aMB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = otpFragment;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93147aMB(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x008d: INVOKE 
      (r1v0 ?? I:X.aMA)
      (r0v1 ?? I:com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment)
      (r4 I:X.2mC)
      (r3 I:java.lang.Exception)
      (r6 I:X.2kd)
     DIRECT call: X.aMA.<init>(com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment, X.2mC, java.lang.Exception, X.2kd):void A[MD:(com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment, X.2mC<java.lang.String>, java.lang.Exception, X.2kd<? super X.aMA>):void (m)] (LINE:16777357), block:B:33:0x0087 */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2mC] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ?? c93146aMA;
        C68322mC c68322mC;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
        } catch (Exception e) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C93146aMA c93146aMA2 = new C93146aMA(this.LJLJI, c93146aMA, e, null);
            this.LJLIL = null;
            this.LJLILLLLZI = 3;
            if (XKX.LJI(abstractC78621UtN, c93146aMA2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C141335gf.LIZJ(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C68322mC c68322mC2 = this.LJLIL;
                    C141335gf.LIZJ(obj2);
                }
                return C76800UCe.LIZ;
            }
            c68322mC = this.LJLIL;
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            c68322mC = new C68322mC();
            c68322mC.element = "PENDING";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.LJLJJI);
            C91820a0m c91820a0m = VerifyApi.LIZ;
            OtpFragment otpFragment = this.LJLJI;
            String str = otpFragment.LJLJL;
            if (str == null) {
                str = C91826a0s.LIZ;
            }
            String str2 = C91824a0q.LIZ.LIZIZ;
            String str3 = otpFragment.LJLJJI;
            if (str3 == null) {
                str3 = "";
            }
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "verifyContent.toString()");
            DoVerifyRequest doVerifyRequest = new DoVerifyRequest(str2, str3, "OTP", jSONObject2);
            this.LJLIL = c68322mC;
            this.LJLILLLLZI = 1;
            c91820a0m.getClass();
            obj2 = C91820a0m.LIZ(str, doVerifyRequest, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
        C93145aM9 c93145aM9 = new C93145aM9((C64797Pbt) obj2, this.LJLJI, c68322mC, null);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = 2;
        if (XKX.LJI(abstractC78621UtN2, c93145aM9, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
