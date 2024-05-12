package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.FRl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38977FRl {
    public static final String LIZ = File.separator;

    public static boolean LIZIZ(String str) {
        if (str == null) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists() && !file.isDirectory()) {
                return false;
            }
            if (!file.exists()) {
                return file.mkdirs();
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean LIZJ(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return C16880lQ.LLLZZIL(file);
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return C16880lQ.LLLZZIL(file);
        }
        for (File file2 : listFiles) {
            if (!LIZJ(file2)) {
                return false;
            }
        }
        return C16880lQ.LLLZZIL(file);
    }

    public static boolean LIZ(String str, String str2) {
        if (str2 != null) {
            try {
                File file = new File(str);
                if (file.exists() && file.isFile()) {
                    File file2 = new File(str2);
                    if (file2.exists()) {
                        return true;
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            byte[] bArr = new byte[1024];
                            for (int read = fileInputStream.read(bArr, 0, 1024); read > 0; read = fileInputStream.read(bArr, 0, 1024)) {
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            fileInputStream.close();
                            return true;
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean LJ(String str, String str2) {
        boolean z;
        if (str2 == null) {
            return false;
        }
        try {
            File file = new File(str2);
            if (!file.exists()) {
                return false;
            }
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
            try {
                if (file.isFile()) {
                    z = LJFF(file, "", zipOutputStream);
                } else {
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        zipOutputStream.close();
                        return false;
                    }
                    z = false;
                    for (File file2 : listFiles) {
                        z = LJFF(file2, "", zipOutputStream);
                        if (!z) {
                            break;
                        }
                    }
                }
                zipOutputStream.flush();
                zipOutputStream.close();
                if (!z) {
                    File file3 = new File(str);
                    if (file3.exists()) {
                        LIZJ(file3);
                    }
                    return false;
                }
                return true;
            } finally {
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean LIZLLL(Bitmap bitmap, Bitmap.CompressFormat compressFormat, String str) {
        if (bitmap == null || bitmap.isRecycled() || str == null) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                return true;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean LJFF(File file, String str, ZipOutputStream zipOutputStream) {
        try {
            if (file.isFile()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(file.getName());
                zipOutputStream.putNextEntry(new ZipEntry(X1D.LIZIZ(LIZ2)));
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    for (int read = fileInputStream.read(bArr, 0, 1024); read > 0; read = fileInputStream.read(bArr, 0, 1024)) {
                        zipOutputStream.write(bArr, 0, read);
                    }
                    fileInputStream.close();
                    return true;
                } finally {
                }
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return false;
                }
                for (File file2 : listFiles) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str);
                    LIZ3.append(file.getName());
                    LIZ3.append(LIZ);
                    LJFF(file2, X1D.LIZIZ(LIZ3), zipOutputStream);
                }
                return true;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
