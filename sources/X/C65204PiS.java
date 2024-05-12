package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.PiS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65204PiS implements X50 {
    public final RandomAccessFile LIZ;
    public final FileChannel LIZIZ;
    public final ByteBuffer LIZJ;

    @Override // X.X50
    public final void LIZ() {
    }

    @Override // X.X50
    public final void close() {
        X4Q.LJJIIJ(this.LIZIZ, this.LIZ);
    }

    @Override // X.X50
    public final void flush() {
        this.LIZIZ.force(true);
    }

    @Override // X.X50
    public final void LIZLLL() {
        flush();
    }

    public C65204PiS(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.LIZ = randomAccessFile;
            this.LIZIZ = randomAccessFile.getChannel();
            this.LIZJ = ByteBuffer.allocate(32768);
        } catch (IOException e) {
            throw new BaseException(1039, e);
        }
    }

    @Override // X.X50
    public final void LIZJ(long j) {
        this.LIZ.setLength(j);
    }

    @Override // X.X50
    public final void seek(long j) {
        this.LIZIZ.position(j);
    }

    @Override // X.X50
    public final void LIZIZ(byte[] bArr, int i) {
        this.LIZJ.clear();
        this.LIZJ.put(bArr, 0, i);
        this.LIZJ.flip();
        while (this.LIZJ.hasRemaining()) {
            this.LIZIZ.write(this.LIZJ);
        }
    }
}
