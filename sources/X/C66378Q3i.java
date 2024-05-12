package X;

import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.o;
import m43.u;

/* renamed from: X.Q3i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66378Q3i {
    public static final C66378Q3i LIZ = new C66378Q3i();
    public static File LIZIZ;

    public static final synchronized File LIZIZ() {
        File file;
        synchronized (C66378Q3i.class) {
            if (LIZIZ == null) {
                LIZIZ = new File(C16880lQ.LLIIIL(u.LIZJ()), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = LIZIZ;
        }
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.util.Collection<X.C66379Q3j> r7) {
        /*
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.io.File r0 = X.C66378Q3i.LIZIZ
            if (r0 != 0) goto L11
            java.io.File r0 = LIZIZ()
            if (r0 != 0) goto L21
        L11:
            java.io.File r0 = LIZIZ()
            if (r0 != 0) goto L1d
        L17:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L25
        L1d:
            r0.mkdirs()
            goto L17
        L21:
            X.OR7.LLLIIL(r0)
            goto L11
        L25:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.io.IOException -> Lb2
        L29:
            boolean r0 = r7.hasNext()     // Catch: java.io.IOException -> Lb2
            if (r0 == 0) goto Lb1
            java.lang.Object r6 = r7.next()     // Catch: java.io.IOException -> Lb2
            X.Q3j r6 = (X.C66379Q3j) r6     // Catch: java.io.IOException -> Lb2
            boolean r0 = r6.LJI     // Catch: java.io.IOException -> Lb2
            if (r0 != 0) goto L3a
            goto L29
        L3a:
            java.util.UUID r1 = r6.LIZ     // Catch: java.io.IOException -> Lb2
            java.lang.String r3 = r6.LJ     // Catch: java.io.IOException -> Lb2
            java.lang.String r0 = "callId"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)     // Catch: java.io.IOException -> Lb2
            r0 = 1
            java.io.File r2 = LIZJ(r1, r0)     // Catch: java.io.IOException -> Lb2
            r5 = 0
            if (r2 != 0) goto L4c
            goto L29
        L4c:
            java.io.File r1 = new java.io.File     // Catch: java.io.UnsupportedEncodingException -> L59 java.io.IOException -> Lb2
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r3, r0)     // Catch: java.io.UnsupportedEncodingException -> L59 java.io.IOException -> Lb2
            r1.<init>(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> L59 java.io.IOException -> Lb2
            r5 = r1
            goto L5b
        L59:
            if (r5 == 0) goto L29
        L5b:
            r4.add(r5)     // Catch: java.io.IOException -> Lb2
            android.graphics.Bitmap r3 = r6.LIZIZ     // Catch: java.io.IOException -> Lb2
            if (r3 == 0) goto L77
            X.Q3i r0 = X.C66378Q3i.LIZ     // Catch: java.io.IOException -> Lb2
            r0.getClass()     // Catch: java.io.IOException -> Lb2
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lb2
            r2.<init>(r5)     // Catch: java.io.IOException -> Lb2
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> La7
            r0 = 100
            r3.compress(r1, r0, r2)     // Catch: java.lang.Throwable -> La7
            X.C66373Q3d.LIZJ(r2)     // Catch: java.io.IOException -> Lb2
            goto L29
        L77:
            android.net.Uri r3 = r6.LIZJ     // Catch: java.io.IOException -> Lb2
            if (r3 == 0) goto L29
            X.Q3i r1 = X.C66378Q3i.LIZ     // Catch: java.io.IOException -> Lb2
            boolean r0 = r6.LJFF     // Catch: java.io.IOException -> Lb2
            r1.getClass()     // Catch: java.io.IOException -> Lb2
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lb2
            r2.<init>(r5)     // Catch: java.io.IOException -> Lb2
            if (r0 != 0) goto L8a
            goto L97
        L8a:
            android.content.Context r0 = m43.u.LIZJ()     // Catch: java.lang.Throwable -> Lac
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Lac
            java.io.InputStream r1 = r0.openInputStream(r3)     // Catch: java.lang.Throwable -> Lac
            goto La0
        L97:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = r3.getPath()     // Catch: java.lang.Throwable -> Lac
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lac
        La0:
            X.C66373Q3d.LJIIIZ(r1, r2)     // Catch: java.lang.Throwable -> Lac
            X.C66373Q3d.LIZJ(r2)     // Catch: java.io.IOException -> Lb2
            goto L29
        La7:
            r0 = move-exception
            X.C66373Q3d.LIZJ(r2)     // Catch: java.io.IOException -> Lb2
            throw r0     // Catch: java.io.IOException -> Lb2
        Lac:
            r0 = move-exception
            X.C66373Q3d.LIZJ(r2)     // Catch: java.io.IOException -> Lb2
            throw r0     // Catch: java.io.IOException -> Lb2
        Lb1:
            return
        Lb2:
            r2 = move-exception
            java.util.Iterator r1 = r4.iterator()
        Lb7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            if (r0 != 0) goto Lc6
            goto Lb7
        Lc6:
            X.C16880lQ.LLLZZIL(r0)     // Catch: java.lang.Exception -> Lb7
            goto Lb7
        Lca:
            X.Q4W r0 = new X.Q4W
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66378Q3i.LIZ(java.util.Collection):void");
    }

    public static final File LIZJ(UUID callId, boolean z) {
        o.LJIIIZ(callId, "callId");
        if (LIZIZ == null) {
            return null;
        }
        File file = new File(LIZIZ, callId.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
