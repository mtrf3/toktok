package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.hybrid.OptimizeHybridFetchReturnSetting;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QBS implements InterfaceC73463SsN<JSONObject> {
    public final /* synthetic */ C38131Exr LJLIL;
    public final /* synthetic */ QBR LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        if (!TextUtils.isEmpty(th.getMessage())) {
            this.LJLILLLLZI.LJLJJLL = th.getMessage();
        }
        if (th instanceof C0TL) {
            C0TL c0tl = (C0TL) th;
            this.LJLILLLLZI.LJLJJI = c0tl.getStatusCode();
            this.LJLILLLLZI.LJLJJL = c0tl.getCronetError();
            QBR qbr = this.LJLILLLLZI;
            if (qbr.LJLJJL == -106) {
                qbr.LJLJJLL = "network not available";
            }
        }
        if (OptimizeHybridFetchReturnSetting.INSTANCE.getValue()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 0);
                jSONObject.put("msg", this.LJLILLLLZI.LJLJJLL);
                jSONObject.put("clientCode", this.LJLILLLLZI.LJLJJL);
                jSONObject.put("httpCode", this.LJLILLLLZI.LJLJJI);
                this.LJLILLLLZI.finishWithRawResult(jSONObject);
            } catch (Exception unused) {
                this.LJLILLLLZI.finishWithFailure(th);
            }
        } else {
            this.LJLILLLLZI.finishWithFailure(th);
        }
        QBR qbr2 = this.LJLILLLLZI;
        VLR.LIZ(qbr2.LJLIL, this.LJLIL.LJ, qbr2.LJLILLLLZI, qbr2.LJLJI, qbr2.LJLJJI, qbr2.LJLJJL, qbr2.LJLJJLL, qbr2.LJLJL, qbr2.LJLJLJ, 0);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLILLLLZI.LJLL = interfaceC92693kP;
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject2.put("_AME_Header_RequestID", this.LJLILLLLZI.LJLJLLL);
            int optInt = jSONObject2.optInt("status_code", 0);
            if (optInt != 0) {
                this.LJLILLLLZI.LJLJL = optInt;
                JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("prompts");
                    if (TextUtils.isEmpty(optString)) {
                        optString = optJSONObject.optString("message");
                    }
                    this.LJLILLLLZI.LJLJLJ = optString;
                }
                QBR qbr = this.LJLILLLLZI;
                VLR.LIZ(qbr.LJLIL, this.LJLIL.LJ, qbr.LJLILLLLZI, qbr.LJLJI, qbr.LJLJJI, qbr.LJLJJL, qbr.LJLJJLL, qbr.LJLJL, qbr.LJLJLJ, 1);
            }
            jSONObject3.put("raw", jSONObject2);
            jSONObject3.put("clientCode", this.LJLILLLLZI.LJLJJL);
            jSONObject3.put("httpCode", this.LJLILLLLZI.LJLJJI);
            this.LJLILLLLZI.finishWithResult(jSONObject3);
        } catch (JSONException e) {
            this.LJLILLLLZI.finishWithFailure(e);
            QBR qbr2 = this.LJLILLLLZI;
            qbr2.LJLJJLL = "json format error";
            VLR.LIZ(qbr2.LJLIL, this.LJLIL.LJ, qbr2.LJLILLLLZI, qbr2.LJLJI, qbr2.LJLJJI, qbr2.LJLJJL, "json format error", qbr2.LJLJL, qbr2.LJLJLJ, 0);
        }
    }

    public QBS(QBR qbr, C38131Exr c38131Exr) {
        this.LJLILLLLZI = qbr;
        this.LJLIL = c38131Exr;
    }
}
