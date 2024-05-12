package X;

import java.io.InputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.PUh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64531PUh extends InputStream {
    public final /* synthetic */ C64533PUj LJLIL;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.LJLIL.LJLILLLLZI, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream
    public final int read() {
        C64533PUj c64533PUj = this.LJLIL;
        if (c64533PUj.LJLILLLLZI > 0) {
            return c64533PUj.readByte() & 255;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(".inputStream()");
        return X1D.LIZIZ(LIZ);
    }

    public C64531PUh(C64533PUj c64533PUj) {
        this.LJLIL = c64533PUj;
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i, int i2) {
        o.LJIIJ(sink, "sink");
        return this.LJLIL.read(sink, i, i2);
    }
}
