package X;

import android.os.Handler;
import java.io.UnsupportedEncodingException;

/* loaded from: classes12.dex */
public final class PAK {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static byte[] LIZ(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        return null;
    }
}
