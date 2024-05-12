package com.ss.android.vesdk;

import X.C16880lQ;
import X.C1B6;
import X.C36539EVr;
import X.X1D;
import android.os.StatFs;
import android.text.TextUtils;
import defpackage.a1;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipFile;

/* loaded from: classes7.dex */
public class VEFileUtils {
    public static boolean canWrite(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(".");
        LIZ.append(System.currentTimeMillis());
        File file2 = new File(file, X1D.LIZIZ(LIZ));
        boolean mkdir = file2.mkdir();
        if (mkdir) {
            return C16880lQ.LLLZZIL(file2);
        }
        return mkdir;
    }

    public static void clearPath(String str) {
        String LJ;
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        for (String str2 : file.list()) {
            String str3 = File.separator;
            if (str.endsWith(str3)) {
                LJ = i0.LJFF(str, str2);
            } else {
                LJ = a1.LJ(str, str3, str2);
            }
            File file2 = new File(LJ);
            if (file2.isFile()) {
                C16880lQ.LLLZZIL(file2);
            }
            if (file2.isDirectory()) {
                deletePath(LJ);
            }
        }
    }

    public static void close(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void deleteFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return;
        }
        C16880lQ.LLLZZIL(file);
    }

    public static void deletePath(String str) {
        String LJ;
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        if (file.isFile()) {
            C16880lQ.LLLZZIL(file);
            return;
        }
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str2 : list) {
            if (str2 != null) {
                String str3 = File.separator;
                if (str.endsWith(str3)) {
                    LJ = i0.LJFF(str, str2);
                } else {
                    LJ = a1.LJ(str, str3, str2);
                }
                File file2 = new File(LJ);
                if (file2.isFile()) {
                    C16880lQ.LLLZZIL(file2);
                }
                if (file2.isDirectory()) {
                    deletePath(LJ);
                }
            }
        }
        C16880lQ.LLLZZIL(file);
    }

    public static boolean exists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1B6.LIZIZ(str);
    }

    public static long getAllBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                StatFs statFs = new StatFs(str);
                return statFs.getBlockSize() * statFs.getBlockCount();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return 0L;
    }

    public static long getAvailableBytes(String str) {
        try {
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                StatFs statFs = new StatFs(str);
                return statFs.getBlockSize() * statFs.getAvailableBlocks();
            }
            return 0L;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return 0L;
        }
    }

    public static String getFileExtension(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf >= 0 && lastIndexOf < str.length() - 1) {
            return str.substring(lastIndexOf + 1).toUpperCase();
        }
        return "";
    }

    public static String getFileName(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf > 0 && lastIndexOf < str.length() - 1) {
            return str.substring(lastIndexOf + 1);
        }
        return str;
    }

    public static String getFileNameWithoutExtension(String str) {
        int lastIndexOf;
        String fileName = getFileName(str);
        if (fileName != null && fileName.length() > 0 && (lastIndexOf = fileName.lastIndexOf(46)) > 0) {
            return fileName.substring(0, lastIndexOf);
        }
        return fileName;
    }

    public static String getFilePathWithoutExtension(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0) {
            return str.substring(0, lastIndexOf);
        }
        return str;
    }

    public static long getFileSize(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    length += getFileSize(file2.getAbsolutePath());
                } catch (OutOfMemoryError e) {
                    e.printStackTrace();
                    return 0L;
                } catch (StackOverflowError e2) {
                    e2.printStackTrace();
                    return 0L;
                }
            }
        }
        return length;
    }

    public static String getParentFilePath(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            return str.substring(0, lastIndexOf);
        }
        return null;
    }

    public static boolean isAndroidUriPath(String str) {
        if (str != null && (str.startsWith("content:") || str.startsWith("file:"))) {
            return true;
        }
        return false;
    }

    public static boolean mkdir(String str) {
        return new File(str).mkdirs();
    }

    public static String readFileFirstLine(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
            return readLine;
        } catch (Exception unused2) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e3) {
                    C16880lQ.LLLLIIL(e3);
                }
            }
            throw th;
        }
    }

    public static void close(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x006a, code lost:
    
        if (r5 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean copyFile(java.io.File r7, java.io.File r8) {
        /*
            boolean r0 = r7.exists()
            r6 = 0
            if (r0 == 0) goto L95
            boolean r0 = r7.isFile()
            if (r0 == 0) goto L95
            boolean r0 = r8.isDirectory()
            if (r0 == 0) goto L14
            return r6
        L14:
            boolean r0 = r8.exists()
            if (r0 == 0) goto L1d
            X.C16880lQ.LLLZZIL(r8)
        L1d:
            r0 = 2048(0x800, float:2.87E-42)
            r5 = 0
            byte[] r4 = new byte[r0]     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7f
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7f
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7f
            r0.<init>(r7)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7f
            r3.<init>(r0)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7f
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5f
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5f
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5f
        L36:
            int r1 = r3.read(r4)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r0 = -1
            if (r1 != r0) goto L41
            r2.flush()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            goto L45
        L41:
            r2.write(r4, r6, r1)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            goto L36
        L45:
            r3.close()     // Catch: java.io.IOException -> L49
            goto L4d
        L49:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L4d:
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L55:
            r0 = 1
            return r0
        L57:
            r1 = move-exception
            goto L5d
        L59:
            r0 = move-exception
            goto L61
        L5b:
            r1 = move-exception
            r2 = r5
        L5d:
            r5 = r3
            goto L6c
        L5f:
            r0 = move-exception
            r2 = r5
        L61:
            r5 = r3
            goto L65
        L63:
            r0 = move-exception
            r2 = r5
        L65:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L69
            goto L81
        L69:
            r1 = move-exception
            if (r5 == 0) goto L74
        L6c:
            r5.close()     // Catch: java.io.IOException -> L70
            goto L74
        L70:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L74:
            if (r2 == 0) goto L80
            r2.close()     // Catch: java.io.IOException -> L7a
            goto L80
        L7a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L80
        L7f:
            r1 = move-exception
        L80:
            throw r1
        L81:
            if (r5 == 0) goto L8b
            r5.close()     // Catch: java.io.IOException -> L87
            goto L8b
        L87:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L8b:
            if (r2 == 0) goto L95
            r2.close()     // Catch: java.io.IOException -> L91
            goto L95
        L91:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L95:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEFileUtils.copyFile(java.io.File, java.io.File):boolean");
    }

    public static boolean renameFile(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists()) {
            return false;
        }
        return file.renameTo(file2);
    }

    public static void setPermissions(String str, int i) {
        try {
            C36539EVr.LIZ(Class.forName("android.os.FileUtils"), str, Integer.valueOf(i), -1, -1);
        } catch (Exception unused) {
        }
    }

    public static boolean copyFile(String str, String str2) {
        return copyFile(new File(str), new File(str2));
    }

    public static void write(String str, String str2, boolean z) {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                    file.createNewFile();
                }
                fileWriter = new FileWriter(str, z);
            } catch (Exception unused) {
                return;
            }
        } catch (IOException e) {
            e = e;
        } catch (Throwable unused2) {
            if (0 == 0) {
                return;
            }
        }
        try {
            fileWriter.write(str2);
            fileWriter.close();
        } catch (IOException e2) {
            e = e2;
            fileWriter2 = fileWriter;
            try {
                C16880lQ.LLLLIIL(e);
                if (fileWriter2 == null) {
                    return;
                }
                fileWriter2.close();
            } catch (Throwable th) {
                if (fileWriter2 != null) {
                    try {
                        fileWriter2.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable unused4) {
            fileWriter2 = fileWriter;
            fileWriter2.close();
        }
    }
}
