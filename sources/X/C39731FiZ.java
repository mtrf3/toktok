package X;

import com.bytedance.zoin.model.ZoinBuildFileInfo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.CRC32;

/* renamed from: X.FiZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39731FiZ {
    public static long LIZ(File file) {
        CRC32 crc32 = new CRC32();
        if (file.length() <= FileUtils.BUFFER_SIZE) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[32768];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        C78685UuP.LJII(byteArrayOutputStream);
                        C78685UuP.LJII(fileInputStream);
                        crc32.update(byteArray);
                        return crc32.getValue();
                    }
                }
            } catch (Throwable th) {
                C78685UuP.LJII(byteArrayOutputStream);
                C78685UuP.LJII(fileInputStream);
                throw th;
            }
        } else {
            byte[] bArr2 = new byte[4096];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.read(bArr2);
            crc32.update(bArr2);
            randomAccessFile.seek(file.length() - 4096);
            randomAccessFile.read(bArr2);
            crc32.update(bArr2);
            C78685UuP.LJII(randomAccessFile);
            return crc32.getValue();
        }
    }

    public static long LIZIZ(File file) {
        if (!file.exists()) {
            C39734Fic LIZJ = C39734Fic.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("File is not exist: ");
            LIZ.append(file.getPath());
            X1D.LIZIZ(LIZ);
            LIZJ.getClass();
            return 0L;
        }
        try {
            long LIZ2 = LIZ(file);
            long length = file.length();
            C39734Fic LIZJ2 = C39734Fic.LIZJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Gen check num: ");
            LIZ3.append(LIZ2);
            LIZ3.append(" + ");
            LIZ3.append(length);
            X1D.LIZIZ(LIZ3);
            LIZJ2.getClass();
            return LIZ2 + length;
        } catch (Exception unused) {
            C39734Fic.LIZJ().getClass();
            return 0L;
        }
    }

    public static boolean LIZJ(File file, List<ZoinBuildFileInfo> list) {
        for (ZoinBuildFileInfo zoinBuildFileInfo : list) {
            long LIZIZ = LIZIZ(new File(file, zoinBuildFileInfo.name));
            C39734Fic LIZJ = C39734Fic.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Verify files check number, file info:");
            LIZ.append(zoinBuildFileInfo);
            LIZ.append(", generated:");
            LIZ.append(LIZIZ);
            X1D.LIZIZ(LIZ);
            LIZJ.getClass();
            if (LIZIZ != zoinBuildFileInfo.checkNumber) {
                return false;
            }
        }
        return true;
    }
}
