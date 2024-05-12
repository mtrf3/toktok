package X;

import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.google.gson.n;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BPE {
    public static final void LIZ(Object e, Long l, String str, String str2, String isEcom) {
        int i;
        int statusCode;
        JSONObject optJSONObject;
        Integer valueOf;
        String str3;
        Throwable th;
        o.LJIIIZ(e, "e");
        o.LJIIIZ(isEcom, "isEcom");
        if (l == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("room_id", l.toString());
        if (str != null) {
            linkedHashMap.put("action_type", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_from_merge", str2);
        }
        linkedHashMap.put("is_ecom", isEcom);
        if (e instanceof n) {
            i = 1001;
        } else {
            i = 1002;
        }
        if (e instanceof C29401Dk) {
            statusCode = ((C276516r) e).getErrorCode();
            str3 = ((C29401Dk) e).getErrorMsg();
        } else {
            if (e instanceof C64802Pby) {
                statusCode = ((C64802Pby) e).getStatusCode();
            } else if (e instanceof C64799Pbv) {
                try {
                    String requestLog = ((C64799Pbv) e).getRequestLog();
                    if (requestLog != null && (optJSONObject = new JSONObject(requestLog).optJSONObject("base")) != null && (valueOf = Integer.valueOf(optJSONObject.optInt("net_error"))) != null) {
                        statusCode = valueOf.intValue();
                    } else {
                        statusCode = ((C64799Pbv) e).getStatusCode();
                    }
                } catch (Exception unused) {
                    statusCode = ((C64799Pbv) e).getStatusCode();
                }
            } else {
                statusCode = 0;
            }
            if (!(e instanceof Exception) || (th = (Throwable) e) == null || (str3 = th.getMessage()) == null) {
                str3 = "";
            }
        }
        linkedHashMap.put("sub_error_code", Integer.valueOf(statusCode));
        ((IHostCommerce) CN1.LIZ(IHostCommerce.class)).ca(Integer.valueOf(i), str3, linkedHashMap);
    }
}
