package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: X.PCu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64076PCu implements InterfaceC47557IlV {
    public final ByteBuffer LIZ;

    public C64076PCu(ByteBuffer byteBuffer) {
        this.LIZ = byteBuffer.slice();
    }

    @Override // X.InterfaceC47557IlV
    public final void LIZ(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.LIZ) {
            int i2 = (int) j;
            this.LIZ.position(i2);
            this.LIZ.limit(i2 + i);
            slice = this.LIZ.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // X.InterfaceC47557IlV
    public final long a() {
        return this.LIZ.capacity();
    }
}
