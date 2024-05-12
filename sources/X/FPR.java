package X;

import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes7.dex */
public final class FPR {
    public static HashMap<String, String> LIZ;

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLIIJLIL(C16880lQ.LLLLL(FPH.LIZ())));
        LIZ2.append("/jato_lib/");
        LIZ2.append("lib");
        LIZ2.append("cvt");
        LIZ2.append(".so");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZIZ(File file, String str) {
        InputStream inputStream;
        ZipFile zipFile;
        FileOutputStream fileOutputStream = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("lib/");
                String str2 = Build.CPU_ABI;
                LIZ2.append(str2);
                LIZ2.append("/");
                LIZ2.append(System.mapLibraryName("cvt"));
                ZipEntry entry = zipFile.getEntry(X1D.LIZIZ(LIZ2));
                if (entry == null) {
                    int indexOf = str2.indexOf(45);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("lib/");
                    if (indexOf <= 0) {
                        indexOf = str2.length();
                    }
                    LIZ3.append(str2.substring(0, indexOf));
                    LIZ3.append("/");
                    LIZ3.append(System.mapLibraryName("cvt"));
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
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        }
                        C63081OpJ.LJII(fileOutputStream2);
                        C63081OpJ.LJII(inputStream);
                        try {
                            zipFile.close();
                        } catch (IOException unused2) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
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
                            C63081OpJ.LJII(fileOutputStream);
                            C63081OpJ.LJII(inputStream);
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException unused4) {
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            zipFile = null;
        }
    }
}
