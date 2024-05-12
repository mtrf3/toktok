package X;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PZc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64656PZc {
    public static final HashMap<String, Object> LIZ = C113554cx.LJJJLZIJ(new OSZ("text", Boolean.TRUE), new OSZ("application", C77275UUl.LIZLLL("x-www-form-urlencoded", "json", "xml", "atom+xml", "xhtml+xml")));
    public static final Charset LIZIZ;
    public static final List<Integer> LIZJ;
    public static final List<Integer> LIZLLL;
    public static final List<Integer> LJ;

    static {
        Charset forName = Charset.forName("utf-8");
        o.LJIIIIZZ(forName, "Charset.forName(\"utf-8\")");
        LIZIZ = forName;
        LIZJ = C47261Igj.LJJIJIIJI(400001, 400101, 400203);
        LIZLLL = C47261Igj.LJJIJIIJI(400401, 400500, 400501, 400402);
        LJ = C47261Igj.LJJIJIIJI(400000, 400102, 400103, 400204, 400205, 400600);
    }
}
