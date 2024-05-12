package X;

import android.os.Build;
import android.os.Process;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/* renamed from: X.OAl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61467OAl {
    public static void LIZ(File file) {
        RandomAccessFile randomAccessFile;
        if (!file.exists() || !file.getName().equals("template.js")) {
            return;
        }
        if (file.length() >= 4) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                int i = 0;
                do {
                    try {
                        if (randomAccessFile.readByte() == 0) {
                            i++;
                        } else {
                            C78609UtB.LJJIIZI(randomAccessFile);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        C78609UtB.LJJIIZI(randomAccessFile);
                        throw th;
                    }
                } while (i < 4);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("file start with 4 zero: ");
                LIZ.append(file.getName());
                throw new RuntimeException(X1D.LIZIZ(LIZ));
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("file size less than 4: ");
            LIZ2.append(file.getName());
            throw new RuntimeException(X1D.LIZIZ(LIZ2));
        }
    }

    public static void LIZIZ(File file) {
        if (file.exists()) {
            if (!file.isFile()) {
            } else {
                throw new RuntimeException("create dir failed: path is a file");
            }
        } else {
            if (file.mkdirs()) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("create dir failed: ");
            LIZ.append(file.getPath());
            throw new RuntimeException(X1D.LIZIZ(LIZ));
        }
    }

    public static boolean LIZJ(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(", file:");
        LIZ.append(file.getAbsolutePath());
        OC6.LIZ("gecko-debug-tag", "delete file，pid:", Integer.valueOf(Process.myPid()), ", thread:", C16880lQ.LLLLIIIILLL().toString(), X1D.LIZIZ(LIZ));
        return LJ(file);
    }

    public static boolean LIZLLL(File file) {
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!LIZLLL(new File(file, str))) {
                    return false;
                }
            }
        }
        return C16880lQ.LLLZZIL(file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r1 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(java.io.File r6) {
        /*
            r5 = 1
            if (r6 == 0) goto L9
            boolean r0 = r6.exists()
            if (r0 != 0) goto La
        L9:
            return r5
        La:
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L2d
            java.io.File[] r4 = r6.listFiles()
            if (r4 == 0) goto L2d
            int r3 = r4.length
            r2 = 0
            r1 = 1
        L19:
            if (r2 >= r3) goto L2b
            r0 = r4[r2]
            if (r1 == 0) goto L29
            boolean r0 = LJ(r0)
            if (r0 == 0) goto L29
            r1 = 1
        L26:
            int r2 = r2 + 1
            goto L19
        L29:
            r1 = 0
            goto L26
        L2b:
            if (r1 == 0) goto L34
        L2d:
            boolean r0 = X.C16880lQ.LLLZZIL(r6)
            if (r0 == 0) goto L34
            goto L9
        L34:
            r5 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61467OAl.LJ(java.io.File):boolean");
    }

    public static long LJI(File file) {
        long j = 0;
        if (Build.VERSION.SDK_INT < 23) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += LJI(file2);
            }
        }
        return j;
    }

    public static String LJFF(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.flush();
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                }
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }
}
