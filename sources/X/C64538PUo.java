package X;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.PUo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64538PUo extends OutputStream {
    public final /* synthetic */ C64535PUl LJLIL;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        C64535PUl c64535PUl = this.LJLIL;
        if (!c64535PUl.LJLILLLLZI) {
            c64535PUl.flush();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(".outputStream()");
        return X1D.LIZIZ(LIZ);
    }

    public C64538PUo(C64535PUl c64535PUl) {
        this.LJLIL = c64535PUl;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C64535PUl c64535PUl = this.LJLIL;
        if (!c64535PUl.LJLILLLLZI) {
            c64535PUl.LJLIL.LJJIII((byte) i);
            this.LJLIL.LLIFFJFJJ();
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i, int i2) {
        o.LJIIJ(data, "data");
        C64535PUl c64535PUl = this.LJLIL;
        if (!c64535PUl.LJLILLLLZI) {
            c64535PUl.LJLIL.LJJ(i, data, i2);
            this.LJLIL.LLIFFJFJJ();
            return;
        }
        throw new IOException("closed");
    }
}
