package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: X.Fik, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39742Fik {
    public static File LIZ;

    public static long LIZIZ(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile.length() - 22;
                if (length >= 0) {
                    long j = length - 65536;
                    if (j < 0) {
                        j = 0;
                    }
                    int reverseBytes = Integer.reverseBytes(101010256);
                    do {
                        randomAccessFile.seek(length);
                        if (randomAccessFile.readInt() == reverseBytes) {
                            randomAccessFile.skipBytes(2);
                            randomAccessFile.skipBytes(2);
                            randomAccessFile.skipBytes(2);
                            randomAccessFile.skipBytes(2);
                            long reverseBytes2 = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                            CRC32 crc32 = new CRC32();
                            randomAccessFile.seek(4294967295L & Integer.reverseBytes(randomAccessFile.readInt()));
                            int min = (int) Math.min(8192L, reverseBytes2);
                            byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                            int read = randomAccessFile.read(bArr, 0, min);
                            while (read != -1) {
                                crc32.update(bArr, 0, read);
                                reverseBytes2 -= read;
                                if (reverseBytes2 == 0) {
                                    break;
                                }
                                read = randomAccessFile.read(bArr, 0, (int) Math.min(8192L, reverseBytes2));
                            }
                            long value = crc32.getValue();
                            randomAccessFile.close();
                            return value;
                        }
                        length--;
                    } while (length >= j);
                    throw new ZipException("End Of Central Directory signature not found");
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("File too short to be a zip file: ");
                LIZ2.append(randomAccessFile.length());
                throw new ZipException(X1D.LIZIZ(LIZ2));
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static File LIZJ(C38775FJr c38775FJr) {
        File file;
        File file2 = LIZ;
        if (file2 != null) {
            return file2;
        }
        ApplicationInfo applicationInfo = c38775FJr.LIZIZ.getApplicationInfo();
        String str = c38775FJr.LIZ;
        if (str != null) {
            file = new File(str);
        } else {
            file = new File(applicationInfo.dataDir, "covode");
        }
        try {
            String str2 = C16880lQ.LLLLLLZ(c38775FJr.LIZIZ.getPackageManager(), c38775FJr.LIZIZ.getPackageName(), 0).versionName;
            long LIZIZ = LIZIZ(new File(applicationInfo.sourceDir));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str2);
            LIZ2.append("-");
            LIZ2.append(LIZIZ);
            File file3 = new File(file, X1D.LIZIZ(LIZ2));
            LIZ = file3;
            file3.mkdirs();
            if (!LIZ.exists()) {
                return null;
            }
            return LIZ;
        } catch (PackageManager.NameNotFoundException | IOException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.io.File r13, java.io.File r14, X.C39744Fim r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39742Fik.LIZ(java.io.File, java.io.File, X.Fim):void");
    }
}
