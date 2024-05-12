package X;

import com.bytedance.im.core.proto.Response;

/* renamed from: X.Oxe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63598Oxe {
    public static C63599Oxf LIZ(Response response) {
        int intValue;
        Integer num = response.status_code;
        int i = -9999;
        if (num == null) {
            intValue = -9999;
        } else {
            intValue = num.intValue();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("status_code ");
        Integer num2 = response.status_code;
        if (num2 != null) {
            i = num2.intValue();
        }
        LIZ.append(i);
        LIZ.append(" log_id: ");
        String str = response.log_id;
        if (str == null) {
            str = "null_log_id";
        }
        LIZ.append(str);
        LIZ.append("  error: ");
        String str2 = response.error_desc;
        if (str2 == null) {
            str2 = "unknown_error";
        }
        LIZ.append(str2);
        return new C63599Oxf(intValue, X1D.LIZIZ(LIZ), response);
    }
}
