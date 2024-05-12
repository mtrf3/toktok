package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Eri, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37750Eri {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new C37751Erj();
    }

    public static void LIZ(String message) {
        o.LJIIJ(message, "message");
    }

    public static void LIZIZ(String message, Throwable th, int i) {
        String tag;
        if ((i & 4) != 0) {
            tag = "hybrid_prefetch";
        } else {
            tag = null;
        }
        o.LJIIJ(message, "message");
        o.LJIIJ(tag, "tag");
    }
}
