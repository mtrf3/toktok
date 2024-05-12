package X;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EZP {
    public static String LIZ(String str, String str2) {
        try {
            if (str2 == null) {
                String encode = URLEncoder.encode(str, "ISO_8859_1");
                o.LJFF(encode, "URLEncoder.encode(content, \"ISO_8859_1\")");
                return encode;
            }
            if (!o.LJ(str2, "null_encoding")) {
                str = URLEncoder.encode(str, str2);
            }
            o.LJFF(str, "if (encoding == \"null_en…ng)\n                    }");
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
