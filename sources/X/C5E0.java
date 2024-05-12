package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5E0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5E0 {
    public final HashMap<C5DY, C131475Dz> LIZ = new HashMap<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r4 = ""
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.LIZIZ
            java.lang.Object r1 = r0.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L1a
            boolean r0 = ujb.o.LJJJJJL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            return r1
        L1a:
            boolean r0 = X.AnonymousClass504.LIZIZ
            if (r0 != 0) goto L2c
            long r0 = X.C5DZ.LIZIZ(r10)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.LIZIZ
            r0.put(r10, r1)
            return r1
        L2c:
            android.net.Uri r5 = com.bytedance.mt.protector.impl.UriProtector.parse(r10)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r5.getScheme()     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = "content"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> La8
            r8 = 9
            r1 = 8192(0x2000, double:4.0474E-320)
            if (r0 == 0) goto L85
        L41:
            X.5qj r0 = X.C1280550v.LIZ()     // Catch: java.lang.Throwable -> La8
            android.content.Context r0 = r0.LIZ     // Catch: java.lang.Throwable -> La8
            r7 = 0
            if (r0 == 0) goto L7f
            android.content.ContentResolver r3 = r0.getContentResolver()     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto La4
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r6 = r3.openFileDescriptor(r5, r0)     // Catch: java.lang.Throwable -> La8
            if (r6 == 0) goto La4
            X.PMl r5 = new X.PMl     // Catch: java.lang.Throwable -> L77
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L77
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch: java.lang.Throwable -> L77
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L77
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = X.PN5.LIZ(r5, r8, r1)     // Catch: java.lang.Throwable -> L6b
            goto L6c
        L6b:
            r1 = r4
        L6c:
            java.lang.String r0 = "ttmd5(FileInputStreamRan…UNT, DEFAULT_SAMPLE_SIZE)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L77
            X.AnonymousClass636.LJFF(r6, r7)     // Catch: java.lang.Throwable -> Lab
            X.UCe r7 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lab
            goto La3
        L77:
            r2 = move-exception
            r1 = r4
            throw r2     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            X.AnonymousClass636.LJFF(r6, r2)     // Catch: java.lang.Throwable -> Lab
            throw r0     // Catch: java.lang.Throwable -> Lab
        L7f:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIJI(r0)     // Catch: java.lang.Throwable -> La8
            throw r7     // Catch: java.lang.Throwable -> La8
        L85:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> La8
            r3.<init>(r10)     // Catch: java.lang.Throwable -> La8
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L91
            goto L9b
        L91:
            X.PMs r0 = new X.PMs     // Catch: java.lang.Throwable -> L9b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = X.PN5.LIZ(r0, r8, r1)     // Catch: java.lang.Throwable -> L9b
            goto L9c
        L9b:
            r1 = r4
        L9c:
            java.lang.String r0 = "ttmd5(File(path), DEFAUL…UNT, DEFAULT_SAMPLE_SIZE)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> La8
            X.UCe r7 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lab
        La3:
            r4 = r1
        La4:
            X.C3C5.m7constructorimpl(r7)     // Catch: java.lang.Throwable -> La8
            goto Lb4
        La8:
            r0 = move-exception
            r1 = r4
            goto Lac
        Lab:
            r0 = move-exception
        Lac:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
            r4 = r1
        Lb4:
            boolean r0 = ujb.o.LJJJJJL(r4)
            if (r0 == 0) goto Lcc
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            r2.append(r10)
            long r0 = X.C5DZ.LIZIZ(r10)
            r2.append(r0)
            java.lang.String r4 = X.X1D.LIZIZ(r2)
        Lcc:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.LIZIZ
            r0.put(r10, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5E0.LIZ(java.lang.String):java.lang.String");
    }

    public final List<C1290754t> LIZJ(List<C5E1> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "requestInfoList");
        synchronized (this.LIZ) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C5E1 c5e1 : list) {
                for (C1290754t c1290754t : c5e1.LJLILLLLZI) {
                    C5DY LJIIIIZZ = C78688UuS.LJIIIIZZ(c1290754t, LIZ(c1290754t.LJLIL));
                    C131475Dz c131475Dz = this.LIZ.get(LJIIIIZZ);
                    if (c131475Dz == null) {
                        this.LIZ.put(LJIIIIZZ, new C131475Dz());
                    } else {
                        c131475Dz.LIZ++;
                    }
                }
                for (C1290754t c1290754t2 : c5e1.LJLIL) {
                    C5DY LJIIIIZZ2 = C78688UuS.LJIIIIZZ(c1290754t2, LIZ(c1290754t2.LJLIL));
                    C131475Dz c131475Dz2 = this.LIZ.get(LJIIIIZZ2);
                    if (c131475Dz2 != null) {
                        int i = c131475Dz2.LIZ - 1;
                        c131475Dz2.LIZ = i;
                        if (i <= 0) {
                            this.LIZ.remove(LJIIIIZZ2);
                            c131475Dz2.LIZ = 0;
                        }
                    }
                }
                for (C1290754t c1290754t3 : c5e1.LJLJI) {
                    C5DY LJIIIIZZ3 = C78688UuS.LJIIIIZZ(c1290754t3, LIZ(c1290754t3.LJLIL));
                    if (this.LIZ.get(LJIIIIZZ3) == null) {
                        this.LIZ.put(LJIIIIZZ3, new C131475Dz());
                    }
                    C1290754t c1290754t4 = (C1290754t) linkedHashMap.get(LJIIIIZZ3);
                    if (c1290754t4 == null || c1290754t4.LJLJI < c1290754t3.LJLJI) {
                        linkedHashMap.put(LJIIIIZZ3, c1290754t3);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<C5DY, C131475Dz> entry : this.LIZ.entrySet()) {
                C5DY key = entry.getKey();
                C131475Dz value = entry.getValue();
                C1290754t c1290754t5 = (C1290754t) linkedHashMap.get(key);
                if (c1290754t5 == null) {
                    arrayList.add(key);
                } else if (value.LIZIZ == null) {
                    LJ.add(c1290754t5);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.LIZ.remove((C5DY) it.next());
            }
        }
        return LJ;
    }

    public final void LIZLLL(C5DY key, Bitmap bitmap) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(bitmap, "bitmap");
        synchronized (this.LIZ) {
            C131475Dz c131475Dz = this.LIZ.get(key);
            if (c131475Dz != null) {
                c131475Dz.LIZIZ = bitmap;
            }
        }
    }

    public static String LIZIZ(int i, String path, String fileId) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fileId, "fileId");
        if (AnonymousClass504.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append('#');
            LIZ.append(fileId);
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(path);
        LIZ2.append('#');
        LIZ2.append(i);
        LIZ2.append('#');
        LIZ2.append(fileId);
        return X1D.LIZIZ(LIZ2);
    }
}
