package X;

import defpackage.e1;
import defpackage.i0;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2iC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65842iC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str, C188727au c188727au, JSONObject jSONObject, int i) {
        Iterator<String> keys;
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                o.LJII(next, "null cannot be cast to non-null type kotlin.String");
                String str2 = next;
                Object obj = jSONObject.get(str2);
                if (obj instanceof String) {
                    c188727au.LJI(i0.LJFF(str, str2), (String) obj);
                } else if (obj instanceof Long) {
                    c188727au.LJ(((Number) obj).longValue(), i0.LJFF(str, str2));
                } else if (obj instanceof Integer) {
                    c188727au.LIZLLL(((Number) obj).intValue(), i0.LJFF(str, str2));
                } else if (obj instanceof Double) {
                    c188727au.LIZJ(i0.LJFF(str, str2), ((Number) obj).doubleValue());
                } else if (obj instanceof Float) {
                    c188727au.LIZIZ(((Number) obj).floatValue(), i0.LJFF(str, str2));
                } else if (obj instanceof Boolean) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(str2);
                    c188727au.LJFF(obj, X1D.LIZIZ(LIZ2));
                } else if ((obj instanceof JSONObject) && i > 0) {
                    LIZJ(str, c188727au, (JSONObject) obj, i - 1);
                }
            }
        }
    }

    public static void LIZ(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2, String str2, boolean z) {
        if (str == null || str.length() == 0) {
            return;
        }
        C188727au c188727au = new C188727au();
        if (jSONObject2 != null) {
            LIZJ("", c188727au, jSONObject2, 5);
        }
        if (jSONObject != null) {
            LIZJ("duration_", c188727au, jSONObject, 5);
        }
        if (num != null) {
            c188727au.LIZLLL(num.intValue(), "status");
        }
        if (str2 != null) {
            c188727au.LJI("log_type", str2);
        }
        if (z) {
            str = i0.LJFF("monitor_", str);
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LIZIZ(final String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2, String str2, int i) {
        final boolean z;
        final JSONObject jSONObject3 = jSONObject2;
        final Integer num2 = num;
        final JSONObject jSONObject4 = jSONObject;
        final String str3 = null;
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            jSONObject4 = null;
        }
        if ((i & 8) != 0) {
            jSONObject3 = null;
        }
        if ((i & 16) == 0) {
            str3 = str2;
        }
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!e1.LIZ(31744, "studio_monitor_service_auto_report_to_tea_android", true, true)) {
            return;
        }
        C10K.LIZJ(new Callable() { // from class: X.2iD
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    C65842iC.LIZ(str, num2, jSONObject4, jSONObject3, str3, z);
                } catch (Exception e) {
                    C188727au c188727au = new C188727au();
                    String str4 = str;
                    if (str4 != null) {
                        c188727au.LJI("service_name", str4);
                    }
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    c188727au.LJI("error_msg", message);
                    FMX.LJIIL("report_to_tea_util_error", c188727au.LIZ);
                }
                return C76800UCe.LIZ;
            }
        });
    }
}
