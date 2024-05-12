package net.jpountz.xxhash;

import X.C16880lQ;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public abstract class XXHash64 {
    public abstract long hash(ByteBuffer byteBuffer, int i, int i2, long j);

    public abstract long hash(byte[] bArr, int i, int i2, long j);

    public String toString() {
        return C16880lQ.LJLLJ(getClass());
    }

    public final long hash(ByteBuffer byteBuffer, long j) {
        long hash = hash(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.limit());
        return hash;
    }
}
