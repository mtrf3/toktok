package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.Fgw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39630Fgw extends AbstractC39635Fh1 {
    public final java.util.Map<String, java.util.Set<String>> LIZ;
    public final java.util.Set<String> LIZIZ;
    public final File LIZJ;

    @Override // X.AbstractC39635Fh1
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C39630Fgw.class.getName());
        LIZ.append("[root = ");
        StringBuilder sb = new StringBuilder("(");
        Iterator<String> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(", ");
        }
        sb.append(')');
        LIZ.append(sb.toString());
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public C39630Fgw(File file) {
        this.LIZ = new HashMap();
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        this.LIZIZ = LIZJ(lastIndexOf > 0 ? name.substring(0, lastIndexOf) : name);
        this.LIZJ = file;
    }

    public static java.util.Set<String> LIZJ(String str) {
        HashSet hashSet = new HashSet();
        String LIZ = SysUtil.Api14Utils.LIZ();
        if (LIZ != null) {
            for (String str2 : LIZ.split(":")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(".apk!/");
                if (str2.contains(X1D.LIZIZ(LIZ2))) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    @Override // X.AbstractC39635Fh1
    public final void LIZIZ(int i) {
        int indexOf;
        int i2;
        Iterator it = ((HashSet) this.LIZIZ).iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf(33)) >= 0 && (i2 = indexOf + 2) < str2.length()) {
                str = str2.substring(i2);
            }
            if (!TextUtils.isEmpty(str)) {
                ZipFile zipFile = new ZipFile(this.LIZJ);
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement != null && nextElement.getName().startsWith(str) && nextElement.getName().endsWith(".so") && nextElement.getMethod() == 0) {
                            String substring = nextElement.getName().substring(str.length() + 1);
                            synchronized (this) {
                                if (!((HashMap) this.LIZ).containsKey(str2)) {
                                    ((HashMap) this.LIZ).put(str2, new HashSet());
                                }
                                ((java.util.Set) ((HashMap) this.LIZ).get(str2)).add(substring);
                            }
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public C39630Fgw(Context context) {
        this.LIZ = new HashMap();
        this.LIZIZ = LIZJ("");
        this.LIZJ = new File(context.getApplicationInfo().sourceDir);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        r4 = new X.C39668FhY(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r3 = X.C39633Fgz.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r3 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        com.facebook.soloader.Api18TraceUtils.LIZ("SoLoader.getElfDependencies[", r12, "]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        r8 = X.C39637Fh3.LIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r3 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        r6 = r8.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        if (r5 >= r6) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        r3 = r8[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        monitor-enter(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        r1 = ((java.util.HashMap) r11.LIZ).values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r1.hasNext() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        if (((java.util.Set) r1.next()).contains(r3) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b6, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ad, code lost:
    
        if (r3.startsWith("/") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b0, code lost:
    
        X.C39633Fgz.LJIIIIZZ(r3, null, r13 | 1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b9, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00df, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e2, code lost:
    
        if (X.C39633Fgz.LIZ != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e4, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e7, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e8, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f1, code lost:
    
        throw r1;
     */
    @Override // X.AbstractC39635Fh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(java.lang.String r12, int r13, android.os.StrictMode.ThreadPolicy r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39630Fgw.LIZ(java.lang.String, int, android.os.StrictMode$ThreadPolicy):int");
    }
}
