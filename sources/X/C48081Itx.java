package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/* renamed from: X.Itx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48081Itx {
    public final RandomAccessFile LIZ;

    public final void LIZ() {
        RandomAccessFile randomAccessFile = this.LIZ;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
            } catch (Throwable unused) {
            }
            try {
                randomAccessFile.close();
            } catch (Throwable unused2) {
            }
        }
    }

    public C48081Itx(File file, String str) {
        try {
            this.LIZ = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new C48085Iu1(e);
        }
    }
}
