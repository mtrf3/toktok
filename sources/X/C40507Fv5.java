package X;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.Fv5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40507Fv5 {
    public static boolean LIZ;
    public static final char[] LIZIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void LIZIZ(Throwable th) {
        InterfaceC40509Fv7 interfaceC40509Fv7 = C40508Fv6.LIZ().LIZ.LJFF;
        if (interfaceC40509Fv7 != null) {
            interfaceC40509Fv7.ensureNotReachHere(th);
        }
    }

    public static String LIZJ(String str) {
        String path;
        int lastIndexOf;
        String substring;
        int indexOf;
        if (!TextUtils.isEmpty(str)) {
            try {
                path = new java.net.URL(str).getPath();
                lastIndexOf = path.lastIndexOf(47);
            } catch (MalformedURLException e) {
                C44384HbQ.LJJ("ml#evaluator", "Utils getName error!", e);
            }
            if (lastIndexOf != -1) {
                substring = path.substring(lastIndexOf + 1);
                if (!TextUtils.isEmpty(substring) || (indexOf = substring.indexOf(".")) == -1) {
                    return "";
                }
                return substring.substring(0, indexOf);
            }
        }
        substring = "";
        if (!TextUtils.isEmpty(substring)) {
            return "";
        }
        return substring.substring(0, indexOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0049 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(java.lang.String r11, java.lang.String r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r6 = 0
            if (r0 != 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto Le
        Ld:
            return r6
        Le:
            java.io.File r10 = new java.io.File
            r10.<init>(r11)
            boolean r0 = r10.exists()
            if (r0 == 0) goto Ld
            long r3 = r10.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
            goto Ld
        L24:
            java.lang.String r0 = "?"
            int r1 = r12.indexOf(r0)
            r9 = -1
            r0 = 1
            if (r1 != r9) goto L2f
            return r0
        L2f:
            int r0 = r1 + 1
            java.lang.String r8 = r12.substring(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto Ld
            boolean r0 = r10.isFile()
            java.lang.String r5 = ""
            if (r0 != 0) goto L4b
        L43:
            boolean r0 = r8.equalsIgnoreCase(r5)
            if (r0 == 0) goto Ld
            r6 = 1
            goto Ld
        L4b:
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r7]
            r3 = 0
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb8
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb8
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb8
            r0.<init>(r10)     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb8
            r1.<init>(r0)     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb8
        L60:
            int r0 = r1.read(r4, r6, r7)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb6
            if (r0 == r9) goto L6a
            r2.update(r4, r6, r0)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb6
            goto L60
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6d
        L6d:
            byte[] r10 = r2.digest()
            if (r10 == 0) goto L43
            int r0 = r10.length
            if (r0 > 0) goto L77
            goto L43
        L77:
            r0 = 16
            char[] r9 = new char[r0]
            r9 = {x00c0: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            int r0 = r10.length
            int r0 = r0 * 2
            char[] r7 = new char[r0]
            int r5 = r10.length
            r4 = 0
            r3 = 0
        L86:
            if (r4 >= r5) goto L9f
            r2 = r10[r4]
            int r1 = r3 + 1
            int r0 = r2 >>> 4
            r0 = r0 & 15
            char r0 = r9[r0]
            r7[r3] = r0
            int r3 = r1 + 1
            r0 = r2 & 15
            char r0 = r9[r0]
            r7[r1] = r0
            int r4 = r4 + 1
            goto L86
        L9f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r7)
            goto L43
        La5:
            r2 = move-exception
            r3 = r1
            goto La9
        La8:
            r2 = move-exception
        La9:
            java.lang.String r1 = "ml#evaluator"
            java.lang.String r0 = "Utils getFileMD5 error!"
            X.C44384HbQ.LJJ(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb8
            if (r3 == 0) goto L43
            r3.close()     // Catch: java.io.IOException -> L43
            goto L43
        Lb6:
            r0 = move-exception
            goto Lbc
        Lb8:
            r0 = move-exception
            r1 = r3
            if (r3 == 0) goto Lbf
        Lbc:
            r1.close()     // Catch: java.io.IOException -> Lbf
        Lbf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40507Fv5.LIZ(java.lang.String, java.lang.String):boolean");
    }

    public static void LIZLLL(File file, File file2) {
        ZipFile zipFile;
        ZipFile zipFile2 = null;
        BufferedOutputStream bufferedOutputStream = null;
        Object[] objArr = null;
        try {
            try {
                file2.mkdirs();
                zipFile = new ZipFile(file);
            } finally {
                th = th;
                if (objArr == null) {
                }
                zipFile.close();
                throw th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[2048];
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            BufferedInputStream bufferedInputStream = null;
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (!nextElement.getName().contains("../")) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(file2.getPath());
                    LIZ2.append(File.separator);
                    LIZ2.append(nextElement.getName());
                    File file3 = new File(X1D.LIZIZ(LIZ2));
                    if (nextElement.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        File parentFile = file3.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file3.createNewFile();
                        try {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(zipFile.getInputStream(nextElement));
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file3), 2048);
                                while (true) {
                                    try {
                                        int read = bufferedInputStream2.read(bArr, 0, 2048);
                                        if (read == -1) {
                                            break;
                                        } else {
                                            bufferedOutputStream2.write(bArr, 0, read);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        bufferedInputStream = bufferedInputStream2;
                                        if (bufferedOutputStream != null) {
                                            bufferedOutputStream.close();
                                        }
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                                bufferedOutputStream2.flush();
                                bufferedOutputStream2.close();
                                bufferedInputStream2.close();
                                bufferedOutputStream = bufferedOutputStream2;
                                bufferedInputStream = bufferedInputStream2;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            }
            zipFile.close();
            file2.getPath();
        } catch (Exception e2) {
            e = e2;
            if (e instanceof IOException) {
                C16880lQ.LLLZZIL(file2);
                throw e;
            }
            C16880lQ.LLLZZIL(file2);
            throw new IOException("Error when decompressing zip file.", e);
        } catch (Throwable th4) {
            th = th4;
            zipFile.close();
            throw th;
        }
    }
}
