package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.PMl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64327PMl implements PN8 {
    public final FileInputStream LIZ;
    public final FileChannel LIZIZ;
    public final ByteBuffer LIZJ;

    @Override // X.PN8
    public final void close() {
        C76800UCe c76800UCe;
        try {
            FileChannel fileChannel = this.LIZIZ;
            if (fileChannel != null) {
                fileChannel.close();
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        try {
            this.LIZ.close();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }

    @Override // X.PN8
    public final long length() {
        FileChannel fileChannel = this.LIZIZ;
        if (fileChannel != null) {
            return fileChannel.size();
        }
        return -1L;
    }

    public C64327PMl(FileInputStream fileInputStream) {
        Object LIZ;
        Object LIZ2;
        this.LIZ = fileInputStream;
        try {
            LIZ = fileInputStream.getChannel();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        this.LIZIZ = (FileChannel) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        try {
            LIZ2 = ByteBuffer.allocate(FileUtils.BUFFER_SIZE);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        this.LIZJ = (ByteBuffer) (C3C5.m12isFailureimpl(LIZ2) ? null : LIZ2);
    }

    @Override // X.PN8
    public final void seek(long j) {
        FileChannel fileChannel = this.LIZIZ;
        if (fileChannel != null) {
            fileChannel.position(j);
        }
    }

    @Override // X.PN8
    public final int LIZ(byte[] bArr, int i) {
        FileChannel fileChannel;
        ByteBuffer byteBuffer = this.LIZJ;
        if (byteBuffer == null || (fileChannel = this.LIZIZ) == null) {
            return -1;
        }
        int read = fileChannel.read(byteBuffer);
        if (read != -1) {
            byteBuffer.flip();
            byteBuffer.get(bArr, 0, read);
            byteBuffer.clear();
        }
        return read;
    }
}
