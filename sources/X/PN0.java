package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class PN0 {
    public static void LIZ(Throwable th, JSONObject jSONObject) {
        if (th != null) {
            try {
                String message = th.getMessage();
                if (C38354F3m.LJ(message)) {
                    return;
                }
                o.LJI(message);
                int length = message.length();
                int LJJLIIIJL = s.LJJLIIIJL(message, "ErrorCode=", 0, false, 6);
                if (LJJLIIIJL != -1) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = LJJLIIIJL + 10; i < length; i++) {
                        char charAt = message.charAt(i);
                        if (!Character.isSpaceChar(charAt)) {
                            if (charAt != '-' && !Character.isDigit(charAt)) {
                                break;
                            } else {
                                sb.append(charAt);
                            }
                        }
                    }
                    if (sb.length() > 0) {
                        jSONObject.put("cronet_error_code", sb.toString());
                    }
                }
                int LJJLIIIJL2 = s.LJJLIIIJL(message, "InternalErrorCode=", 0, false, 6);
                if (LJJLIIIJL2 != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i2 = LJJLIIIJL2 + 18; i2 < length; i2++) {
                        char charAt2 = message.charAt(i2);
                        if (!Character.isSpaceChar(charAt2)) {
                            if (charAt2 != '-' && !Character.isDigit(charAt2)) {
                                break;
                            } else {
                                sb2.append(charAt2);
                            }
                        }
                    }
                    if (sb2.length() > 0) {
                        jSONObject.put("cronet_internal_error_code", sb2.toString());
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
