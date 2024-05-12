package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FgC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39584FgC {
    public static final OJD LIZ = new OJD("^(\\+[0-9]{1,4})?1234[0-9]{7}$");
    public static final OJD LIZIZ = new OJD("[^\\d]");
    public static String LIZJ;
    public static String LIZLLL;
    public static JSONObject LJ;

    public static String LIZ() {
        if (LIZLLL == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("\n                {\n                    \"data\": {\n                        \"description\": \"");
            LIZ2.append(LIZIZ());
            LIZ2.append("\",\n                        \"error_code\": 10000\n                    },\n                    \"message\": \"error\"\n                }\n            ");
            LIZLLL = C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ2));
        }
        String str = LIZLLL;
        o.LJI(str);
        return str;
    }

    public static String LIZIZ() {
        if (LIZJ == null) {
            LIZJ = C58725N2z.LIZ().getString(R.string.hxf);
        }
        String str = LIZJ;
        o.LJI(str);
        return str;
    }

    public static Integer LIZJ(Throwable th) {
        int statusCode;
        Integer num;
        try {
            if (th instanceof C64802Pby) {
                return Integer.valueOf(((C64802Pby) th).getStatusCode());
            }
            if (!(th instanceof C64799Pbv)) {
                return null;
            }
            String requestLog = ((C64799Pbv) th).getRequestLog();
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
            statusCode = ((C64799Pbv) th).getStatusCode();
            return Integer.valueOf(statusCode);
        } catch (Exception unused) {
            return null;
        }
    }
}
