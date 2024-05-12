package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes12.dex */
public final class PN6 implements PN8 {
    public final FileInputStream LIZ;
    public final FileChannel LIZIZ;
    public final ByteBuffer LIZJ = ByteBuffer.allocate(FileUtils.BUFFER_SIZE);

    @Override // X.PN8
    public final void close() {
        X4Q.LJJIIJ(this.LIZIZ, this.LIZ);
    }

    @Override // X.PN8
    public final long length() {
        return this.LIZIZ.size();
    }

    public PN6(FileInputStream fileInputStream) {
        this.LIZ = fileInputStream;
        this.LIZIZ = fileInputStream.getChannel();
    }

    @Override // X.PN8
    public final void seek(long j) {
        this.LIZIZ.position(j);
    }

    @Override // X.PN8
    public final int LIZ(byte[] bArr, int i) {
        int read = this.LIZIZ.read(this.LIZJ);
        if (read != -1) {
            this.LIZJ.flip();
            this.LIZJ.get(bArr, 0, read);
            this.LIZJ.clear();
        }
        return read;
    }
}
