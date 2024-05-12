package X;

import com.ss.bduploader.BDMediaDataReader;
import java.io.BufferedInputStream;
import java.io.InputStream;

/* loaded from: classes7.dex */
public final class FB1 implements BDMediaDataReader {
    public final android.net.Uri LIZ;
    public final long LIZIZ;
    public InputStream LIZJ;
    public BufferedInputStream LIZLLL;

    @Override // com.ss.bduploader.BDMediaDataReader
    public final int close(int i) {
        C76800UCe c76800UCe;
        try {
            BufferedInputStream bufferedInputStream = this.LIZLLL;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
            return 0;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return 0;
        }
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final int open(int i) {
        Object LIZ;
        try {
            LIZ = C268513p.LIZLLL(EF7.LIZIZ(), this.LIZ);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        InputStream inputStream = (InputStream) LIZ;
        this.LIZJ = inputStream;
        if (inputStream != null) {
            return 1;
        }
        return -1;
    }

    public FB1(long j, android.net.Uri uri) {
        this.LIZ = uri;
        this.LIZIZ = j;
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final long getValue(int i, int i2) {
        if (i2 == 0) {
            return this.LIZIZ;
        }
        return 0L;
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final int read(int i, long j, byte[] bArr, int i2) {
        if (this.LIZJ == null) {
            return -1;
        }
        if (j > this.LIZIZ) {
            return 0;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.LIZJ);
        this.LIZLLL = bufferedInputStream;
        return bufferedInputStream.read(bArr);
    }
}
