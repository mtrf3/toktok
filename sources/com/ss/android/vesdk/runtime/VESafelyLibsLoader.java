package com.ss.android.vesdk.runtime;

import X.C16880lQ;
import X.C57964Moy;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.ss.android.vesdk.VEFileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes7.dex */
public class VESafelyLibsLoader {
    public static List<String> sLoadedLibs = new ArrayList();

    public static File getLibraryFolder(Context context) {
        if (context == null || C16880lQ.LLIIJLIL(context) == null) {
            return null;
        }
        File file = new File(C16880lQ.LLIIJLIL(context), "libso");
        if (!file.exists()) {
            VEFileUtils.mkdir(file.getAbsolutePath());
        }
        return file;
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static File getLibraryFile(Context context, String str) {
        String mapLibraryName = System.mapLibraryName(str);
        File libraryFolder = getLibraryFolder(context);
        if (libraryFolder != null) {
            return new File(libraryFolder, mapLibraryName);
        }
        return null;
    }

    public static synchronized boolean loadLibrary(String str, Context context) {
        synchronized (VESafelyLibsLoader.class) {
            if (sLoadedLibs.contains(str)) {
                return true;
            }
            try {
                try {
                    C16880lQ.LLJJJIL(str);
                    sLoadedLibs.add(str);
                } catch (Throwable th) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("loadLibrary ");
                    LIZ.append(str);
                    LIZ.append(" error,");
                    LIZ.append(Log.getStackTraceString(th));
                    C57964Moy.LIZLLL(4, X1D.LIZIZ(LIZ));
                    return false;
                }
            } catch (UnsatisfiedLinkError e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("loadLibrary ");
                LIZ2.append(str);
                LIZ2.append(" error.");
                LIZ2.append(getStackTrace(e));
                C57964Moy.LIZLLL(4, X1D.LIZIZ(LIZ2));
                File libraryFile = getLibraryFile(context, str);
                if (libraryFile == null) {
                    return false;
                }
                if (libraryFile.exists()) {
                    C16880lQ.LLLZZIL(libraryFile);
                }
                String unpackLibrary = unpackLibrary(context, str, libraryFile);
                if (unpackLibrary != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(e.getMessage());
                    LIZ3.append("[");
                    LIZ3.append(unpackLibrary);
                    LIZ3.append("]");
                    C57964Moy.LIZLLL(4, X1D.LIZIZ(LIZ3));
                    return false;
                }
                try {
                    System.load(libraryFile.getAbsolutePath());
                    sLoadedLibs.add(str);
                } catch (Throwable unused) {
                    return false;
                }
            }
            return true;
        }
    }

    public static String unpackLibrary(Context context, String str, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
        String str2;
        ZipEntry entry;
        FileOutputStream fileOutputStream = null;
        try {
            zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("lib/");
                str2 = Build.CPU_ABI;
                LIZ.append(str2);
                LIZ.append("/");
                LIZ.append(System.mapLibraryName(str));
                entry = zipFile.getEntry(X1D.LIZIZ(LIZ));
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            zipFile = null;
        }
        if (entry == null) {
            int indexOf = str2.indexOf(45);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("lib/");
            if (indexOf <= 0) {
                indexOf = str2.length();
            }
            LIZ2.append(str2.substring(0, indexOf));
            LIZ2.append("/");
            LIZ2.append(System.mapLibraryName(str));
            String LIZIZ = X1D.LIZIZ(LIZ2);
            entry = zipFile.getEntry(LIZIZ);
            if (entry == null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Library entry not found:");
                LIZ3.append(LIZIZ);
                message = X1D.LIZIZ(LIZ3);
                VEFileUtils.close((Closeable) null);
                VEFileUtils.close((Closeable) null);
                VEFileUtils.close(zipFile);
                return message;
            }
        }
        file.createNewFile();
        inputStream = zipFile.getInputStream(entry);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        VEFileUtils.setPermissions(file.getAbsolutePath(), 493);
                        VEFileUtils.close(fileOutputStream2);
                        VEFileUtils.close(inputStream);
                        VEFileUtils.close(zipFile);
                        return null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                try {
                    message = th.getMessage();
                    VEFileUtils.close(fileOutputStream);
                    VEFileUtils.close(inputStream);
                    VEFileUtils.close(zipFile);
                    return message;
                } catch (Throwable th4) {
                    VEFileUtils.close(fileOutputStream);
                    VEFileUtils.close(inputStream);
                    VEFileUtils.close(zipFile);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
