package X;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.PUp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64539PUp extends OutputStream {
    public final /* synthetic */ C64534PUk LJLIL;

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (!this.LJLIL.LJLJJI) {
            flush();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(".outputStream()");
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        close();
    }

    public C64539PUp(C64534PUk c64534PUk) {
        this.LJLIL = c64534PUk;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C64534PUk c64534PUk = this.LJLIL;
        if (!c64534PUk.LJLJJI) {
            c64534PUk.LJLIL.LJJIII((byte) i);
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i, int i2) {
        o.LJIIIZ(data, "data");
        C64534PUk c64534PUk = this.LJLIL;
        if (!c64534PUk.LJLJJI) {
            c64534PUk.LJLIL.LJJ(i, data, i2);
            return;
        }
        throw new IOException("closed");
    }
}
