package X;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.ss.android.ugc.aweme.bnpl.network.model.AlertMsg;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.DoVerifyResponse;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.IDqS16S1100000_31;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment$onValidateCode$1$1$1", f = "OtpFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aM9, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93145aM9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C64797Pbt<BaseResponse<DoVerifyResponse>> LJLIL;
    public final /* synthetic */ OtpFragment LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93145aM9(C64797Pbt<BaseResponse<DoVerifyResponse>> c64797Pbt, OtpFragment otpFragment, C68322mC<String> c68322mC, InterfaceC67352kd<? super C93145aM9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c64797Pbt;
        this.LJLILLLLZI = otpFragment;
        this.LJLJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93145aM9(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LIZIZ()) {
            if (this.LJLIL.LIZIZ.LIZ()) {
                String str3 = this.LJLIL.LIZIZ.data.verifyResult;
                int hashCode = str3.hashCode();
                String str4 = "";
                if (hashCode != -1881380961) {
                    if (hashCode != 2448401) {
                        if (hashCode == 35394935 && str3.equals("PENDING")) {
                            OtpFragment otpFragment = this.LJLILLLLZI;
                            ((C252949wI) otpFragment._$_findCachedViewById(R.id.f3)).LIZIZ(this.LJLIL.LIZIZ.data.statusReason.reasonMsg);
                            otpFragment._$_findCachedViewById(R.id.f3).setVisibility(0);
                            ((C92604aDQ) otpFragment._$_findCachedViewById(R.id.f5)).LJIIIZ();
                            ((TextView) otpFragment._$_findCachedViewById(R.id.f5)).setText("");
                            EditText bnpl_otp_input = (EditText) otpFragment._$_findCachedViewById(R.id.f5);
                            o.LJIIIIZZ(bnpl_otp_input, "bnpl_otp_input");
                            C91928a2W.LIZ(bnpl_otp_input);
                        }
                    } else if (str3.equals("PASS")) {
                        OtpFragment otpFragment2 = this.LJLILLLLZI;
                        String str5 = this.LJLIL.LIZIZ.data.nextVerifyInfo;
                        ActivityC45651qj mo49getActivity = otpFragment2.mo49getActivity();
                        if (mo49getActivity != null) {
                            C26048AKe c26048AKe = new C26048AKe(mo49getActivity);
                            c26048AKe.LJFF(R.string.jrs);
                            c26048AKe.LIZJ(R.raw.icon_tick_fill);
                            c26048AKe.LIZLLL(-1);
                            c26048AKe.LIZIZ(1000L);
                            c26048AKe.LJII();
                        }
                        otpFragment2.wl("PASS", str5);
                    }
                } else if (str3.equals("REJECT")) {
                    OtpFragment otpFragment3 = this.LJLILLLLZI;
                    DoVerifyResponse doVerifyResponse = this.LJLIL.LIZIZ.data;
                    AlertMsg alertMsg = doVerifyResponse.alertMsg;
                    if (alertMsg == null || (str = alertMsg.title) == null) {
                        str = "";
                    }
                    AlertMsg alertMsg2 = doVerifyResponse.alertMsg;
                    if (alertMsg2 != null && (str2 = alertMsg2.content) != null) {
                        str4 = str2;
                    }
                    String str6 = doVerifyResponse.nextVerifyInfo;
                    otpFragment3.getClass();
                    Context requireContext = otpFragment3.requireContext();
                    o.LJIIIIZZ(requireContext, "requireContext()");
                    C26227ARb c26227ARb = new C26227ARb(requireContext);
                    c26227ARb.LJFF(str);
                    c26227ARb.LIZIZ(str4);
                    C77123UOp.LJIILL(c26227ARb, new IDqS16S1100000_31(otpFragment3, str6, 10));
                    c26227ARb.LJI().LIZLLL();
                }
            } else {
                this.LJLILLLLZI.Al(this.LJLIL.LIZIZ.errorContent);
                C91924a2S.LIZ.LIZLLL("otp", EnumC91923a2R.DO_VERIFY, this.LJLIL.LIZIZ.errorMsg, this.LJLILLLLZI.LJLJJI);
            }
            if (C78685UuP.LJJJZ(this.LJLIL.LIZIZ.data.verifyResult)) {
                this.LJLJI.element = this.LJLIL.LIZIZ.data.verifyResult;
            }
            this.LJLILLLLZI.onEventFillIn(this.LJLJI.element);
            return C76800UCe.LIZ;
        }
        OtpFragment otpFragment4 = this.LJLILLLLZI;
        this.LJLIL.LIZJ();
        otpFragment4.Al(null);
        this.LJLIL.LIZJ();
        o.LJIIIIZZ(null, "resp.message()");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
