package X;

import com.bytedance.pipo.kyc.singpass.PipoMiddleActivity;
import com.bytedance.pipo.kyc.singpass.network.model.PersonInfo;
import com.bytedance.pipo.kyc.singpass.network.model.request.VendorReq;
import com.bytedance.pipo.kyc.singpass.network.model.response.VendorResp;
import com.google.gson.Gson;
import fjb.a;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.bytedance.pipo.kyc.singpass.PipoMiddleActivity$getPersonInfo$1", f = "PipoMiddleActivity.kt", l = {146}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class QA9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PipoMiddleActivity LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QA9(PipoMiddleActivity pipoMiddleActivity, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pipoMiddleActivity;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new QA9(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        QAB qab;
        OSZ osz;
        String str2;
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
            if (QA8.LIZLLL != null && QA8.LJ != null && (str = QA8.LJFF) != null && (qab = QA8.LJI) != null) {
                String str3 = QA8.LIZLLL;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = QA8.LJ;
                if (str5 != null) {
                    str4 = str5;
                }
                String authCode = this.LJLJI;
                o.LJIIIZ(authCode, "authCode");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("redirect_url", str4);
                jSONObject.put("auth_code", authCode);
                jSONObject.put("session_id", str);
                try {
                    VendorReq vendorReq = new VendorReq(202, str3, "singpass_v4", jSONObject.toString());
                    InterfaceC65054Pg2 interfaceC65054Pg2 = qab.LJLJI;
                    if (qab.LJLIL) {
                        str2 = o.LJIILLIIL("/risk/request_vendor", qab.LJLILLLLZI);
                    } else {
                        str2 = "https://f-p-va.isnssdk.com/risk/request_vendor";
                    }
                    Gson gson = QAS.LIZ;
                    String LJIILL = gson.LJIILL(vendorReq);
                    o.LJIIIIZZ(LJIILL, "gson.toJson(request)");
                    VendorResp vendorResp = (VendorResp) gson.LJI(interfaceC65054Pg2.LIZ(str2, LJIILL, null), VendorResp.class);
                    int i2 = vendorResp.baseResp.statusCode;
                    if (i2 != 0) {
                        osz = new OSZ(null, new QAJ(Integer.valueOf(i2), vendorResp.baseResp.statusMessage));
                    } else {
                        int i3 = vendorResp.status;
                        if (i3 != 7) {
                            osz = new OSZ(null, new QAJ(Integer.valueOf(i3), "status is not STATUS_SUCCESS"));
                        } else {
                            osz = new OSZ(gson.LJI(vendorResp.response, PersonInfo.class), null);
                        }
                    }
                } catch (Exception e) {
                    osz = new OSZ(null, new QAJ(null, e.getMessage()));
                }
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                QA6 qa6 = new QA6(osz, null, str, this);
                this.LJLIL = 1;
                if (XKX.LJI(abstractC78621UtN, qa6, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
