package X;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.FJl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38769FJl {
    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
