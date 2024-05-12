package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import defpackage.g0;
import defpackage.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes7.dex */
public final class FPV {
    public static final List<String> LIZ = new ArrayList();

    public static File LIZ(Context context, String str) {
        String mapLibraryName = System.mapLibraryName("monitorcollector-lib");
        if (context == null || C16880lQ.LLIIJLIL(context) == null) {
            return null;
        }
        File file = new File(C16880lQ.LLIIJLIL(context), "libso");
        if (!file.exists()) {
            C1I0.LIZJ(file.getAbsolutePath());
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(context.getPackageName(), "").replace(":", "");
            if (!TextUtils.isEmpty(str)) {
                str = i0.LJFF(str, "_");
            }
        }
        return new File(file, i0.LJFF(str, mapLibraryName));
    }

    public static synchronized boolean LIZIZ(Context context, String str) {
        synchronized (FPV.class) {
            List<String> list = LIZ;
            if (((ArrayList) list).contains("monitorcollector-lib")) {
                return true;
            }
            try {
                C16880lQ.LLJJJIL("monitorcollector-lib");
                ((ArrayList) list).add("monitorcollector-lib");
            } catch (UnsatisfiedLinkError e) {
                C64028PAy.LIZJ("APM-LoadLibrary", "System loadFailed", e);
                File LIZ2 = LIZ(context, str);
                if (LIZ2 == null) {
                    return false;
                }
                if (LIZ2.exists()) {
                    C16880lQ.LLLZZIL(LIZ2);
                }
                if (LIZJ(context, LIZ2) != null) {
                    return false;
                }
                try {
                    System.load(LIZ2.getAbsolutePath());
                    ((ArrayList) LIZ).add("monitorcollector-lib");
                } catch (Throwable th) {
                    C64028PAy.LIZJ("APM-LoadLibrary", "Unpack loadFailed", th);
                    return false;
                }
            } catch (Throwable unused) {
                return false;
            }
            return true;
        }
    }

    public static String LIZJ(Context context, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        FileOutputStream fileOutputStream = null;
        try {
            zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("lib/");
                String str = Build.CPU_ABI;
                LIZ2.append(str);
                LIZ2.append("/");
                LIZ2.append(System.mapLibraryName("monitorcollector-lib"));
                ZipEntry entry = zipFile.getEntry(X1D.LIZIZ(LIZ2));
                if (entry == null) {
                    int indexOf = str.indexOf(45);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("lib/");
                    if (indexOf <= 0) {
                        indexOf = str.length();
                    }
                    LIZ3.append(str.substring(0, indexOf));
                    LIZ3.append("/");
                    LIZ3.append(System.mapLibraryName("monitorcollector-lib"));
                    String LIZIZ = X1D.LIZIZ(LIZ3);
                    entry = zipFile.getEntry(LIZIZ);
                    if (entry == null) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("Library entry not found:");
                        LIZ4.append(LIZIZ);
                        String LIZIZ2 = X1D.LIZIZ(LIZ4);
                        try {
                            zipFile.close();
                        } catch (Throwable unused) {
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
                        try {
                            C36540EVs.LIZ(Class.forName("android.os.FileUtils"), file.getAbsolutePath(), 493, -1, -1);
                        } catch (Exception unused2) {
                        }
                        g0.LJJIJL(fileOutputStream2);
                        g0.LJJIJL(inputStream);
                        try {
                            zipFile.close();
                        } catch (Throwable unused3) {
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
                                } catch (Throwable unused4) {
                                }
                            }
                            return message;
                        } finally {
                            g0.LJJIJL(fileOutputStream);
                            g0.LJJIJL(inputStream);
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (Throwable unused5) {
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
