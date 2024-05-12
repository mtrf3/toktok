package X;

import ujb.o;

/* renamed from: X.Ph4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65118Ph4 {
    public final C0M6<String, C65111Pgx> LIZ = new C0M6<>(16);

    public static String LIZ(String str) {
        if (!o.LJJJLIIL(str, "/", false)) {
            str = QZZ.LIZIZ('/', str);
        }
        if (o.LJJJJ(str, "/", false)) {
            return str;
        }
        return C42398GkU.LIZIZ(str, '/');
    }
}
