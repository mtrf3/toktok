package X;

import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EYY {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(char c) {
        try {
            String valueOf = String.valueOf(c);
            Charset forName = Charset.forName("UTF-8");
            o.LJIIIIZZ(forName, "forName(charsetName)");
            byte[] bytes = valueOf.getBytes(forName);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes.length > 1) {
                return true;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return false;
    }
}
