package X;

import java.io.OutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.PUq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64540PUq extends OutputStream {
    public final /* synthetic */ C64533PUj LJLIL;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(".outputStream()");
        return X1D.LIZIZ(LIZ);
    }

    public C64540PUq(C64533PUj c64533PUj) {
        this.LJLIL = c64533PUj;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.LJLIL.LJJIII(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i, int i2) {
        o.LJIIJ(data, "data");
        this.LJLIL.LJJ(i, data, i2);
    }
}
