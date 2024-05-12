package net.jpountz.xxhash;

import X.C16880lQ;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public abstract class XXHash32 {
    public abstract int hash(ByteBuffer byteBuffer, int i, int i2, int i3);

    public abstract int hash(byte[] bArr, int i, int i2, int i3);

    public String toString() {
        return C16880lQ.LJLLJ(getClass());
    }

    public final int hash(ByteBuffer byteBuffer, int i) {
        int hash = hash(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), i);
        byteBuffer.position(byteBuffer.limit());
        return hash;
    }
}
