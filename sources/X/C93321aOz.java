package X;

import com.bytedance.pitaya.log.PitayaLogger;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.aOz, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93321aOz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String zipFilePath, String unzipFileFolderPath) {
        ZipInputStream zipInputStream;
        String canonicalDirPath;
        o.LJIIJ(zipFilePath, "zipFilePath");
        o.LJIIJ(unzipFileFolderPath, "unzipFileFolderPath");
        File file = new File(unzipFileFolderPath);
        ZipInputStream zipInputStream2 = null;
        try {
            try {
                canonicalDirPath = file.getCanonicalPath();
                zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(zipFilePath)));
            } catch (IOException e) {
                e = e;
            }
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                while (nextEntry != null) {
                    File file2 = new File(file, nextEntry.getName());
                    String canonicalDestPath = file2.getCanonicalPath();
                    o.LJFF(canonicalDestPath, "canonicalDestPath");
                    o.LJFF(canonicalDirPath, "canonicalDirPath");
                    if (ujb.o.LJJJLIIL(canonicalDestPath, canonicalDirPath, false)) {
                        if (nextEntry.isDirectory()) {
                            boolean mkdirs = file2.mkdirs();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("mkdir res:");
                            LIZ2.append(mkdirs);
                            PitayaLogger.LIZ("Unzip", X1D.LIZIZ(LIZ2));
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            File parentFile = file2.getParentFile();
                            if (parentFile != null && !parentFile.exists()) {
                                parentFile.mkdirs();
                            } else if (file2.exists()) {
                                C16880lQ.LLLZZIL(file2);
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                            new C76732zl();
                            byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(bArr, 0, read);
                                }
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        }
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Entry is outside of the target dir: ");
                        LIZ3.append(nextEntry.getName());
                        throw new IOException(X1D.LIZIZ(LIZ3));
                    }
                }
                try {
                    zipInputStream.close();
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            } catch (IOException e3) {
                e = e3;
                zipInputStream2 = zipInputStream;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                throw new IOException(message);
            }
        } finally {
            th = th;
            if (zipInputStream2 == null) {
            }
            try {
                zipInputStream.close();
            } catch (Exception e4) {
                C16880lQ.LLLLIIL(e4);
                throw th;
            }
        }
    }
}
