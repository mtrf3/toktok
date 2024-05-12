package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.common.util.NetworkUtils;
import java.io.InputStream;

/* loaded from: classes12.dex */
public final class PYM {
    public static String LIZ(C36910EeA c36910EeA) {
        String str;
        String response2String;
        TypedInput typedInput = c36910EeA.LJ;
        if (typedInput != null) {
            InputStream in = typedInput.in();
            EJ6 LIZ = c36910EeA.LIZ("Content-Type");
            try {
                C39745Fin LIZJ = C39745Fin.LIZJ(typedInput.mimeType());
                String str2 = null;
                if (LIZJ != null) {
                    str = LIZJ.LIZ;
                } else if (LIZ == null) {
                    str = null;
                } else {
                    str = LIZ.LIZIZ;
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                if (typedInput.length() > 2147483647L) {
                    return null;
                }
                if (LIZJ != null && LIZJ.LIZ(null) != null) {
                    str2 = LIZJ.LIZ(null).name();
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                System.currentTimeMillis();
                if (((Boolean) C34656Diu.LIZ.getValue()).booleanValue()) {
                    response2String = NetworkUtils.response2StringOpt(false, testIsSSBinary, 0, in, str2);
                } else {
                    response2String = NetworkUtils.response2String(false, testIsSSBinary, 0, in, str2);
                }
                return response2String;
            } finally {
                in.reset();
            }
        }
        throw new IllegalArgumentException("HTTP body may not be null");
    }
}
