package X;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.IlQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47552IlQ {
    public static C47553IlR LIZ;
    public static Integer LIZIZ;

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
