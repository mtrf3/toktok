package X;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.Vwg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81374Vwg extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            J7I.LJIIL(e);
            throw null;
        }
    }
}
