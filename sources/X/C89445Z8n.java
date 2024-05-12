package X;

import java.util.regex.PatternSyntaxException;

/* renamed from: X.Z8n, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89445Z8n {
    public static final C62822Ol8 LIZ;
    public static final C62822Ol8 LIZIZ;

    static {
        C221108m2.LIZIZ(C89448Z8q.LJLIL);
        C221108m2.LIZIZ(C89449Z8r.LJLIL);
        C221108m2.LIZIZ(C89447Z8p.LJLIL);
        LIZ = C221108m2.LIZIZ(C89446Z8o.LJLIL);
        LIZIZ = C221108m2.LIZIZ(C89450Z8s.LJLIL);
    }

    public static final OJD LIZ(String str) {
        try {
            return new OJD(str);
        } catch (PatternSyntaxException unused) {
            return null;
        }
    }
}
