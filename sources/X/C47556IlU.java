package X;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: X.IlU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47556IlU implements InterfaceC47557IlV {
    public final FileChannel LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public C47556IlU(FileChannel fileChannel, long j, long j2) {
        this.LIZ = fileChannel;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }

    @Override // X.InterfaceC47557IlV
    public final void LIZ(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.LIZ.map(FileChannel.MapMode.READ_ONLY, this.LIZIZ + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // X.InterfaceC47557IlV
    public final long a() {
        return this.LIZJ;
    }
}
