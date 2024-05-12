package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.PiR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65203PiR implements X50 {
    public final BufferedOutputStream LIZ;
    public final FileDescriptor LIZIZ;
    public final RandomAccessFile LIZJ;

    @Override // X.X50
    public final void close() {
        X4Q.LJJIIJ(this.LIZ, this.LIZJ);
    }

    @Override // X.X50
    public final void LIZ() {
        FileDescriptor fileDescriptor = this.LIZIZ;
        if (fileDescriptor != null) {
            fileDescriptor.sync();
        }
    }

    @Override // X.X50
    public final void LIZLLL() {
        BufferedOutputStream bufferedOutputStream = this.LIZ;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
        FileDescriptor fileDescriptor = this.LIZIZ;
        if (fileDescriptor != null) {
            fileDescriptor.sync();
        }
    }

    @Override // X.X50
    public final void flush() {
        BufferedOutputStream bufferedOutputStream = this.LIZ;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
    }

    @Override // X.X50
    public final void LIZJ(long j) {
        this.LIZJ.setLength(j);
    }

    @Override // X.X50
    public final void seek(long j) {
        this.LIZJ.seek(j);
    }

    public C65203PiR(File file, int i) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.LIZJ = randomAccessFile;
            this.LIZIZ = randomAccessFile.getFD();
            if (i > 0) {
                if (i < 8192) {
                    i = FileUtils.BUFFER_SIZE;
                } else if (i > 131072) {
                    i = 131072;
                }
                this.LIZ = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()), i);
                return;
            }
            this.LIZ = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
        } catch (IOException e) {
            throw new BaseException(1039, e);
        }
    }

    @Override // X.X50
    public final void LIZIZ(byte[] bArr, int i) {
        this.LIZ.write(bArr, 0, i);
    }
}
