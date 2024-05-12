package X;

import java.nio.charset.Charset;

/* loaded from: classes12.dex */
public final class PVB {
    public static final Charset LIZ;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        LIZ = Charset.forName("UTF-8");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}
