package ms.bd.o;

import X.X1D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ms.bd.o.u;

/* loaded from: classes7.dex */
public class s implements u.a {

    /* loaded from: classes7.dex */
    public static class a {
        public final ZipFile LIZ;
        public final ZipEntry LIZIZ;

        public a(ZipFile zipFile, ZipEntry zipEntry) {
            this.LIZ = zipFile;
            this.LIZIZ = zipEntry;
        }
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String[] LIZJ(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public static String[] LIZLLL(Context context, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lib");
        LIZ.append(File.separatorChar);
        LIZ.append("([^\\");
        LIZ.append(File.separatorChar);
        LIZ.append("]*)");
        LIZ.append(File.separatorChar);
        LIZ.append(str);
        Pattern compile = PatternProtector.compile(X1D.LIZIZ(LIZ));
        HashSet hashSet = new HashSet();
        ZipFile zipFile = null;
        for (String str2 : LIZJ(context)) {
            try {
                ZipFile zipFile2 = new ZipFile(new File(str2), 1);
                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
                zipFile = zipFile2;
            } catch (IOException unused) {
            }
        }
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ms.bd.o.s.a LIZ(android.content.Context r14, java.lang.String[] r15, java.lang.String r16, ms.bd.o.v r17) {
        /*
            java.lang.String[] r12 = LIZJ(r14)
            int r11 = r12.length
            r14 = 0
            r10 = 0
        L7:
            r0 = 0
            if (r10 >= r11) goto L73
            r9 = r12[r10]
            r0 = 0
        Ld:
            int r1 = r0 + 1
            r8 = 1
            r7 = 5
            if (r0 >= r7) goto L70
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L6e
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L6e
            r0.<init>(r9)     // Catch: java.io.IOException -> L6e
            r6.<init>(r0, r8)     // Catch: java.io.IOException -> L6e
            r0 = 0
        L1e:
            int r13 = r0 + 1
            if (r0 >= r7) goto L6a
            int r5 = r15.length
            r4 = 0
        L24:
            if (r4 >= r5) goto L68
            r2 = r15[r4]
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "lib"
            r1.append(r0)
            char r0 = java.io.File.separatorChar
            r1.append(r0)
            r1.append(r2)
            char r0 = java.io.File.separatorChar
            r1.append(r0)
            r0 = r16
            r1.append(r0)
            java.lang.String r3 = X.X1D.LIZIZ(r1)
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r14] = r3
            r2[r8] = r9
            r17.getClass()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = "Looking for %s in APK %s..."
            X.C16880lQ.LLLZI(r1, r0, r2)
            java.util.zip.ZipEntry r1 = r6.getEntry(r3)
            if (r1 == 0) goto L64
            ms.bd.o.s$a r0 = new ms.bd.o.s$a
            r0.<init>(r6, r1)
            return r0
        L64:
            int r4 = r4 + 1
            r14 = 0
            goto L24
        L68:
            r0 = r13
            goto L1e
        L6a:
            r6.close()     // Catch: java.io.IOException -> L70
            goto L70
        L6e:
            r0 = r1
            goto Ld
        L70:
            int r10 = r10 + 1
            goto L7
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.s.LIZ(android.content.Context, java.lang.String[], java.lang.String, ms.bd.o.v):ms.bd.o.s$a");
    }
}
