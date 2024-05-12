package X;

import com.bytedance.pipo.kyc.singpass.network.model.CodeChallengeParams;
import com.bytedance.pipo.kyc.singpass.network.model.request.VendorReq;
import com.bytedance.pipo.kyc.singpass.network.model.response.VendorResp;
import com.google.gson.Gson;
import fjb.a;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.bytedance.pipo.kyc.singpass.PIPOKYCSingPassCompat$startVerify$1", f = "PIPOKYCSingPassCompat.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class QAA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ QA7 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ AnonymousClass005 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QAA(QA7 qa7, String str, String str2, AnonymousClass005 anonymousClass005, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = qa7;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = anonymousClass005;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new QAA(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        OSZ osz;
        String str;
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
            String requestId = this.LJLJI;
            String redirectUrl = this.LJLJJI;
            QAB extraVerifyParams = this.LJLILLLLZI.LIZIZ;
            o.LJIIIZ(requestId, "requestId");
            o.LJIIIZ(redirectUrl, "redirectUrl");
            o.LJIIIZ(extraVerifyParams, "extraVerifyParams");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("redirect_url", redirectUrl);
            jSONObject.put("request_id", requestId);
            try {
                VendorReq vendorReq = new VendorReq(201, "", "singpass_v4", jSONObject.toString());
                InterfaceC65054Pg2 interfaceC65054Pg2 = extraVerifyParams.LJLJI;
                if (extraVerifyParams.LJLIL) {
                    str = o.LJIILLIIL("/risk/request_vendor", extraVerifyParams.LJLILLLLZI);
                } else {
                    str = "https://f-p-va.isnssdk.com/risk/request_vendor";
                }
                Gson gson = QAS.LIZ;
                String LJIILL = gson.LJIILL(vendorReq);
                o.LJIIIIZZ(LJIILL, "gson.toJson(request)");
                VendorResp vendorResp = (VendorResp) gson.LJI(interfaceC65054Pg2.LIZ(str, LJIILL, null), VendorResp.class);
                int i2 = vendorResp.baseResp.statusCode;
                if (i2 != 0) {
                    osz = new OSZ(null, new QAJ(Integer.valueOf(i2), vendorResp.baseResp.statusMessage));
                } else {
                    int i3 = vendorResp.status;
                    if (i3 != 7) {
                        osz = new OSZ(null, new QAJ(Integer.valueOf(i3), "status is not STATUS_SUCCESS"));
                    } else {
                        osz = new OSZ(gson.LJI(vendorResp.response, CodeChallengeParams.class), null);
                    }
                }
            } catch (Exception e) {
                osz = new OSZ(null, new QAJ(null, e.getMessage()));
            }
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            QA5 qa5 = new QA5(this, osz, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, qa5, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
