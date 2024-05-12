package X;

import com.bytedance.ies.actionai.jni.ActionAIErrorCode;
import com.bytedance.ies.actionai.jni.ServerErrorInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.actionai.sdk.ActionAISDKAgent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsOfflineService;
import org.json.JSONObject;

/* renamed from: X.Eki, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37316Eki implements InterfaceC36334ENu {
    public final /* synthetic */ InterfaceC37320Ekm<Object> LIZ;
    public final /* synthetic */ C36648EZw LIZIZ;
    public final /* synthetic */ Class<Object> LIZJ;

    @Override // X.InterfaceC36334ENu
    public final void LIZ(byte[] bArr) {
        String str;
        String str2;
        if (bArr != null) {
            Class<Object> cls = this.LIZJ;
            InterfaceC37320Ekm<Object> interfaceC37320Ekm = this.LIZ;
            C36648EZw c36648EZw = this.LIZIZ;
            System.currentTimeMillis();
            String str3 = new String(bArr, PVC.LIZ);
            JSONObject jSONObject = new JSONObject(str3);
            int optInt = jSONObject.optInt("status", 0);
            String str4 = null;
            if (optInt == 0) {
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(ET1.LIZ, str3, cls);
                    JSONObject optJSONObject = jSONObject.optJSONObject("status_info");
                    IToolsOfflineService iToolsOfflineService = (IToolsOfflineService) ServiceManager.get().getService(IToolsOfflineService.class);
                    String str5 = ActionAISDKAgent.LJLJJLL;
                    if (str5 == null) {
                        str5 = CardStruct.IStatusCode.DEFAULT;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Search Success Log ID: ");
                    if (optJSONObject != null) {
                        str4 = optJSONObject.optString("log_id");
                    }
                    LIZ.append(str4);
                    iToolsOfflineService.LIZLLL(str5, X1D.LIZIZ(LIZ));
                    if (interfaceC37320Ekm != null) {
                        interfaceC37320Ekm.onSuccess(fromJson);
                        return;
                    }
                    return;
                } catch (s unused) {
                    if (interfaceC37320Ekm != null) {
                        interfaceC37320Ekm.LIZ(ActionAIErrorCode.SearchAbilityServerLogicError, "dataResponse format fail", new ServerErrorInfo());
                        return;
                    }
                    return;
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("status_info");
            ServerErrorInfo serverErrorInfo = new ServerErrorInfo();
            serverErrorInfo.setSearch_type(c36648EZw.LIZ.toString());
            serverErrorInfo.setStatusCode(optInt);
            if (optJSONObject2 != null) {
                str = optJSONObject2.optString("message");
            } else {
                str = null;
            }
            serverErrorInfo.setMessage(str);
            if (optJSONObject2 != null) {
                str2 = optJSONObject2.optString("detail");
            } else {
                str2 = null;
            }
            serverErrorInfo.setDetail(str2);
            if (optJSONObject2 != null) {
                str4 = optJSONObject2.optString("log_id");
            }
            serverErrorInfo.setLogId(str4);
            ActionAIErrorCode actionAIErrorCode = ActionAIErrorCode.SearchAbilityServerLogicError;
            if (optInt == 30301) {
                actionAIErrorCode = ActionAIErrorCode.SearchAbilityTextGenerateError;
            }
            if (interfaceC37320Ekm != null) {
                interfaceC37320Ekm.LIZ(actionAIErrorCode, "", serverErrorInfo);
                return;
            }
            return;
        }
        InterfaceC37320Ekm<Object> interfaceC37320Ekm2 = this.LIZ;
        C36648EZw c36648EZw2 = this.LIZIZ;
        if (interfaceC37320Ekm2 != null) {
            ActionAIErrorCode actionAIErrorCode2 = ActionAIErrorCode.SearchAbilityServerLogicError;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SearchAbility ");
            LIZ2.append(c36648EZw2.LIZ);
            LIZ2.append(" empty result");
            interfaceC37320Ekm2.LIZ(actionAIErrorCode2, X1D.LIZIZ(LIZ2), new ServerErrorInfo());
        }
    }

    @Override // X.InterfaceC36334ENu
    public final void LIZIZ(int i, Throwable th) {
        InterfaceC37320Ekm<Object> interfaceC37320Ekm = this.LIZ;
        if (interfaceC37320Ekm != null) {
            ActionAIErrorCode actionAIErrorCode = ActionAIErrorCode.SearchAbilityServerInternalError;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SearchAbility ");
            LIZ.append(this.LIZIZ.LIZ);
            LIZ.append(" bad request");
            interfaceC37320Ekm.LIZ(actionAIErrorCode, X1D.LIZIZ(LIZ), new ServerErrorInfo());
        }
    }

    public C37316Eki(InterfaceC37320Ekm<Object> interfaceC37320Ekm, C36648EZw c36648EZw, Class<Object> cls) {
        this.LIZ = interfaceC37320Ekm;
        this.LIZIZ = c36648EZw;
        this.LIZJ = cls;
    }
}
