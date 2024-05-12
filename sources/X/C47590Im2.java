package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Im2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47590Im2 implements InterfaceC47420IjI {
    public final /* synthetic */ C47589Im1 LIZ;

    public C47590Im2(C47589Im1 c47589Im1) {
        this.LIZ = c47589Im1;
    }

    @Override // X.InterfaceC47420IjI
    public final void LIZIZ(JSONObject jSONObject, C47789IpF c47789IpF) {
        if (c47789IpF != null) {
            this.LIZ.getClass();
        }
        if (jSONObject != null || c47789IpF == null) {
            C47589Im1 c47589Im1 = this.LIZ;
            synchronized (c47589Im1) {
                if (jSONObject != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("sub jsonObject:");
                    LIZ.append(jSONObject.toString());
                    TTVideoEngineLog.d("SubInfoFetcher", X1D.LIZIZ(LIZ));
                    int optInt = jSONObject.optInt("code");
                    String optString = jSONObject.optString("message");
                    String optString2 = jSONObject.optString("trace_id");
                    if (optInt != 200) {
                        C47789IpF c47789IpF2 = new C47789IpF("kTTVideoErrorDomainSubFetchingInfo", -9932, optInt, optString);
                        ((HashMap) c47789IpF2.LJ).put("log_id", optString2);
                        c47589Im1.LIZ(c47789IpF2);
                    } else {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        if (optJSONObject == null) {
                            c47589Im1.LIZ(new C47789IpF("kTTVideoErrorDomainSubFetchingInfo", -9931, 0, "sub fetched info Result is empty"));
                        } else {
                            c47589Im1.LIZ.sendMessage(c47589Im1.LIZ.obtainMessage(2, optJSONObject.toString()));
                        }
                    }
                }
            }
            return;
        }
        this.LIZ.LIZ(c47789IpF);
    }
}
