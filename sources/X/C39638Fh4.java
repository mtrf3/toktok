package X;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.Fh4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39638Fh4 implements InterfaceC40057Fnp {
    public final File LJLIL;
    public FileInputStream LJLILLLLZI;
    public FileChannel LJLJI;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLILLLLZI.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.LJLJI.isOpen();
    }

    public C39638Fh4(File file) {
        this.LJLIL = file;
        FileInputStream fileInputStream = new FileInputStream(file);
        this.LJLILLLLZI = fileInputStream;
        this.LJLJI = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.LJLJI.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.LJLJI.write(byteBuffer);
    }

    @Override // X.InterfaceC40057Fnp
    public final int LJJJJLL(ByteBuffer byteBuffer, long j) {
        return this.LJLJI.read(byteBuffer, j);
    }
}
