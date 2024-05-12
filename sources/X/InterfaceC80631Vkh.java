package X;

import java.nio.ByteBuffer;

/* renamed from: X.Vkh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC80631Vkh {
    void close();

    void copy(int i, InterfaceC80631Vkh interfaceC80631Vkh, int i2, int i3);

    ByteBuffer getByteBuffer();

    long getNativePtr();

    int getSize();

    long getUniqueId();

    boolean isClosed();

    byte read(int i);

    int read(int i, byte[] bArr, int i2, int i3);

    int write(int i, byte[] bArr, int i2, int i3);
}
