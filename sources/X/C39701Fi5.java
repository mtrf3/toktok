package X;

import java.io.IOException;
import java.io.Reader;

/* renamed from: X.Fi5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39701Fi5 {
    public static String LIZ;

    public static String LIZIZ() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.board.platform", "unknown");
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static void LIZ(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
