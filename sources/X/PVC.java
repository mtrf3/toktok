package X;

import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PVC {
    public static final Charset LIZ;
    public static final Charset LIZIZ;

    static {
        Charset forName = Charset.forName("UTF-8");
        o.LJIIIIZZ(forName, "forName(\"UTF-8\")");
        LIZ = forName;
        o.LJIIIIZZ(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        o.LJIIIIZZ(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        o.LJIIIIZZ(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Charset forName2 = Charset.forName("US-ASCII");
        o.LJIIIIZZ(forName2, "forName(\"US-ASCII\")");
        LIZIZ = forName2;
        o.LJIIIIZZ(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
