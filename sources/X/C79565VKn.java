package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: X.VKn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79565VKn extends FilterOutputStream {
    public long LJLIL;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterOutputStream) this).out.close();
    }

    public C79565VKn(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        this.LJLIL++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.LJLIL += i2;
    }
}
