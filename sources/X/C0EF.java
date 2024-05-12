package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.0EF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0EF implements Closeable {
    public final InputStream[] LJLIL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.LJLIL) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    public C0EF(InputStream[] inputStreamArr) {
        this.LJLIL = inputStreamArr;
    }
}
