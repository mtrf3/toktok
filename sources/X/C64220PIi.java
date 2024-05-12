package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.PIi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64220PIi implements InterfaceC64095PDn {
    public static final C64220PIi LIZ = new C64220PIi();

    @Override // X.InterfaceC64095PDn
    public final void LIZ(String str, JSONObject jSONObject) {
        if (str == null || str.length() == 0 || jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        try {
            String path = new java.net.URL(str).getPath();
            if (path != null && path.length() != 0) {
                String clientType = jSONObject.optString("net_consume_type", "ttnet");
                long optLong = jSONObject.optLong("timing_totalSendBytes") + jSONObject.optLong("timing_totalReceivedBytes");
                if (optLong <= 0) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("request_log");
                    if (optJSONObject == null) {
                        String optString = jSONObject.optString("request_log");
                        if (!TextUtils.isEmpty(optString)) {
                            optJSONObject = new JSONObject(optString);
                        }
                        optLong = 0;
                    }
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("response");
                    if (optJSONObject2 != null) {
                        optLong = optJSONObject2.optLong("received_bytes") + optJSONObject2.optLong("sent_bytes");
                    }
                    optLong = 0;
                }
                o.LJIIIIZZ(clientType, "clientType");
                PN9.LIZLLL(optLong, clientType, str, false);
            }
        } catch (Throwable unused) {
        }
    }
}
