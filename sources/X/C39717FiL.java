package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.FiL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39717FiL implements Closeable {
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

    public C39717FiL(InputStream[] inputStreamArr) {
        this.LJLIL = inputStreamArr;
    }
}
