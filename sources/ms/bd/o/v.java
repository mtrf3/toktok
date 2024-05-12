package ms.bd.o;

import X.C16880lQ;
import X.C39223FaN;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipFile;
import ms.bd.o.s;
import ms.bd.o.u;

/* loaded from: classes7.dex */
public class v {
    public final Set<String> LIZ = new HashSet();
    public final u.b LIZIZ;
    public final u.a LIZJ;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable th) {
                if (C39223FaN.LIZ(th)) {
                } else {
                    throw th;
                }
            }
        }
    }

    public v(u.b bVar, s sVar) {
        this.LIZIZ = bVar;
        this.LIZJ = sVar;
    }

    public final File LIZ(Context context, String str, String str2) {
        boolean z;
        this.LIZIZ.getClass();
        String LIZ = x.LIZ(str);
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new File(context.getDir("lib", 0), LIZ);
        }
        return new File(context.getDir("lib", 0), LIZ + "." + str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void LIZIZ(Context context, String str, String str2) {
        String[] strArr;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        long j;
        int i = 1;
        i = 1;
        int i2 = 1;
        ?? r8 = 0;
        r8 = 0;
        if (((HashSet) this.LIZ).contains(str)) {
            C16880lQ.LLLZI(Locale.US, "%s already loaded previously!", new Object[]{str});
            return;
        }
        try {
            this.LIZIZ.getClass();
            C16880lQ.LLJJJIL(str);
            ((HashSet) this.LIZ).add(str);
            C16880lQ.LLLZI(Locale.US, "%s (%s) was loaded normally!", new Object[]{str, str2});
        } catch (UnsatisfiedLinkError e) {
            Object[] objArr = {Log.getStackTraceString(e)};
            Locale locale = Locale.US;
            C16880lQ.LLLZI(locale, "Loading the library normally failed: %s", objArr);
            C16880lQ.LLLZI(locale, "%s (%s) was not loaded normally, re-linking...", new Object[]{str, str2});
            ?? LIZ = LIZ(context, str, str2);
            if (!LIZ.exists()) {
                File dir = context.getDir("lib", 0);
                File LIZ2 = LIZ(context, str, str2);
                this.LIZIZ.getClass();
                File[] listFiles = dir.listFiles(new w(x.LIZ(str)));
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (!file.getAbsolutePath().equals(LIZ2.getAbsolutePath())) {
                            C16880lQ.LLLZZIL(file);
                        }
                    }
                }
                u.a aVar = this.LIZJ;
                this.LIZIZ.getClass();
                String[] strArr2 = Build.SUPPORTED_ABIS;
                if (strArr2.length <= 0) {
                    String str3 = Build.CPU_ABI2;
                    if (str3 == null || str3.length() == 0) {
                        strArr2 = new String[]{Build.CPU_ABI};
                    } else {
                        strArr2 = new String[]{Build.CPU_ABI, str3};
                    }
                }
                this.LIZIZ.getClass();
                String LIZ3 = x.LIZ(str);
                aVar.getClass();
                try {
                    s.a LIZ4 = s.LIZ(context, strArr2, LIZ3, this);
                    try {
                        if (LIZ4 != null) {
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                try {
                                    if (i3 < 5) {
                                        Object[] objArr2 = new Object[i];
                                        objArr2[r8 == true ? 1 : 0] = LIZ3;
                                        C16880lQ.LLLZI(Locale.US, "Found %s! Extracting...", objArr2);
                                        try {
                                            if (LIZ.exists() || LIZ.createNewFile()) {
                                                try {
                                                    inputStream = LIZ4.LIZ.getInputStream(LIZ4.LIZIZ);
                                                } catch (FileNotFoundException | IOException unused) {
                                                    inputStream = null;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    inputStream = null;
                                                }
                                                try {
                                                    fileOutputStream = new FileOutputStream((File) LIZ);
                                                    try {
                                                        byte[] bArr = new byte[4096];
                                                        j = 0;
                                                        i = i;
                                                        r8 = r8;
                                                        while (true) {
                                                            int read = inputStream.read(bArr);
                                                            if (read == -1) {
                                                                break;
                                                            }
                                                            fileOutputStream.write(bArr, r8 == true ? 1 : 0, read);
                                                            j += read;
                                                            i = 1;
                                                            r8 = 0;
                                                        }
                                                        fileOutputStream.flush();
                                                        fileOutputStream.getFD().sync();
                                                    } catch (FileNotFoundException | IOException unused2) {
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        s.LIZIZ(inputStream);
                                                        s.LIZIZ(fileOutputStream);
                                                        throw th;
                                                    }
                                                } catch (FileNotFoundException | IOException unused3) {
                                                    fileOutputStream = null;
                                                    s.LIZIZ(inputStream);
                                                    s.LIZIZ(fileOutputStream);
                                                    i3 = i4;
                                                    i = i;
                                                    r8 = r8;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    fileOutputStream = null;
                                                    s.LIZIZ(inputStream);
                                                    s.LIZIZ(fileOutputStream);
                                                    throw th;
                                                }
                                                if (j != LIZ.length()) {
                                                    s.LIZIZ(inputStream);
                                                    s.LIZIZ(fileOutputStream);
                                                } else {
                                                    s.LIZIZ(inputStream);
                                                    s.LIZIZ(fileOutputStream);
                                                    LIZ.setReadable(i, r8);
                                                    LIZ.setExecutable(i, r8);
                                                    LIZ.setWritable(i);
                                                    ZipFile zipFile = LIZ4.LIZ;
                                                    i = i;
                                                    r8 = r8;
                                                    if (zipFile != null) {
                                                        zipFile.close();
                                                        i = i;
                                                        r8 = r8;
                                                    }
                                                }
                                            }
                                        } catch (IOException unused4) {
                                        }
                                        i3 = i4;
                                        i = i;
                                        r8 = r8;
                                    } else {
                                        ZipFile zipFile2 = LIZ4.LIZ;
                                        i = i;
                                        r8 = r8;
                                        if (zipFile2 != null) {
                                            zipFile2.close();
                                            i = i;
                                            r8 = r8;
                                        }
                                    }
                                } catch (IOException unused5) {
                                }
                            }
                        } else {
                            try {
                                i2 = s.LIZLLL(context, LIZ3);
                                strArr = i2;
                            } catch (Exception e2) {
                                String[] strArr3 = new String[i2];
                                strArr3[0] = e2.toString();
                                strArr = strArr3;
                            }
                            throw new t(LIZ3, strArr2, strArr);
                        }
                    } catch (Throwable th4) {
                        if (LIZ4 != null) {
                            try {
                                ZipFile zipFile3 = LIZ4.LIZ;
                                if (zipFile3 != null) {
                                    zipFile3.close();
                                    throw th4;
                                }
                                throw th4;
                            } catch (IOException unused6) {
                                throw th4;
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            u.b bVar = this.LIZIZ;
            String absolutePath = LIZ.getAbsolutePath();
            bVar.getClass();
            System.load(absolutePath);
            ((HashSet) this.LIZ).add(str);
            Object[] objArr3 = new Object[2];
            objArr3[r8] = str;
            objArr3[i] = str2;
            C16880lQ.LLLZI(Locale.US, "%s (%s) was re-linked!", objArr3);
        }
    }
}
