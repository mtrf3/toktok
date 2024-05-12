package X;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.Vwk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC81378Vwk extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ByteBuffer getByteBuffer();

    long getNativePtr();

    boolean isClosed();

    byte read(int i);

    int read(int i, byte[] bArr, int i2, int i3);

    int size();
}
