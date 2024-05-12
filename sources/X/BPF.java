package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BPF {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(Throwable throwable) {
        int statusCode;
        Integer num;
        o.LJIIIZ(throwable, "throwable");
        try {
            if (throwable instanceof C64802Pby) {
                return Integer.valueOf(((C64802Pby) throwable).getStatusCode());
            }
            if (!(throwable instanceof C64799Pbv)) {
                return null;
            }
            String requestLog = ((C64799Pbv) throwable).getRequestLog();
            if (requestLog != null) {
                JSONObject optJSONObject = new JSONObject(requestLog).optJSONObject("base");
                if (optJSONObject != null) {
                    num = Integer.valueOf(optJSONObject.optInt("net_error"));
                } else {
                    num = null;
                }
                if (num != null) {
                    statusCode = num.intValue();
                    return Integer.valueOf(statusCode);
                }
            }
            statusCode = ((C64799Pbv) throwable).getStatusCode();
            return Integer.valueOf(statusCode);
        } catch (Exception unused) {
            return null;
        }
    }
}
