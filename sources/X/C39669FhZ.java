package X;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.FhZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39669FhZ implements ReadableByteChannel {
    public final InputStream LJLIL;
    public final AtomicBoolean LJLILLLLZI = new AtomicBoolean(true);

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LJLILLLLZI.compareAndSet(true, false)) {
            this.LJLIL.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.LJLILLLLZI.get();
    }

    public C39669FhZ(InputStream inputStream) {
        this.LJLIL = inputStream;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        int read;
        if (byteBuffer.hasArray()) {
            read = this.LJLIL.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            if (read > 0) {
                byteBuffer.position(byteBuffer.position() + read);
            }
        } else {
            byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.LJLIL.available(), 4096), byteBuffer.remaining()))];
            read = this.LJLIL.read(bArr);
            if (read > 0) {
                byteBuffer.put(bArr, 0, read);
            }
        }
        return read;
    }
}
