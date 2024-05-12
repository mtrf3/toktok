package X;

import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes7.dex */
public final class FPW {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new ArrayList();
    }

    public static String LIZ(File file, String str, String str2) {
        InputStream inputStream;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("lib/");
                String str3 = Build.CPU_ABI;
                LIZ2.append(str3);
                LIZ2.append("/");
                LIZ2.append(System.mapLibraryName(str2));
                ZipEntry entry = zipFile.getEntry(X1D.LIZIZ(LIZ2));
                if (entry == null) {
                    int indexOf = str3.indexOf(45);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("lib/");
                    if (indexOf <= 0) {
                        indexOf = str3.length();
                    }
                    LIZ3.append(str3.substring(0, indexOf));
                    LIZ3.append("/");
                    LIZ3.append(System.mapLibraryName(str2));
                    String LIZIZ = X1D.LIZIZ(LIZ3);
                    entry = zipFile.getEntry(LIZIZ);
                    if (entry == null) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("Library entry not found:");
                        LIZ4.append(LIZIZ);
                        String LIZIZ2 = X1D.LIZIZ(LIZ4);
                        try {
                            zipFile.close();
                        } catch (IOException unused) {
                        }
                        return LIZIZ2;
                    }
                }
                file.createNewFile();
                inputStream = zipFile.getInputStream(entry);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            zipFile = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            FPX.LIZLLL(file.getAbsolutePath());
            FPX.LIZIZ(fileOutputStream);
            FPX.LIZIZ(inputStream);
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream2 = fileOutputStream;
            try {
                String message = th.getMessage();
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused3) {
                    }
                }
                return message;
            } finally {
                FPX.LIZIZ(fileOutputStream2);
                FPX.LIZIZ(inputStream);
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        }
    }
}
