package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25140yk {
    public static final ConcurrentHashMap<Integer, ArrayList<Bitmap>> LIZ = new ConcurrentHashMap<>();

    public static void LIZIZ(C04740Go lottieDrawable) {
        o.LJIIJ(lottieDrawable, "lottieDrawable");
        int hashCode = lottieDrawable.hashCode();
        ConcurrentHashMap<Integer, ArrayList<Bitmap>> concurrentHashMap = LIZ;
        if (concurrentHashMap.get(Integer.valueOf(hashCode)) != null) {
            concurrentHashMap.remove(Integer.valueOf(hashCode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r2.getHeight() != r6) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap LIZ(X.C04740Go r9, android.graphics.Bitmap.Config r10, android.util.DisplayMetrics r11) {
        /*
            java.lang.String r0 = "lottieDrawable"
            kotlin.jvm.internal.o.LJIIJ(r9, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIIJ(r10, r0)
            java.lang.String r0 = "metrics"
            kotlin.jvm.internal.o.LJIIJ(r11, r0)
            int r7 = r9.LLFZ
            int r6 = r9.LLI
            r0 = 0
            if (r7 <= 0) goto L18
            if (r6 > 0) goto L19
        L18:
            return r0
        L19:
            int r8 = r9.hashCode()
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.ArrayList<android.graphics.Bitmap>> r5 = X.C25140yk.LIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r5.get(r1)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r4 = 0
            if (r3 == 0) goto L59
            monitor-enter(r3)
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L8e
            if (r1 <= 0) goto L58
            java.lang.Object r2 = r3.get(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "cacheTmp[0]"
            kotlin.jvm.internal.o.LJFF(r2, r1)     // Catch: java.lang.Throwable -> L8e
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L8e
            int r1 = r2.getWidth()     // Catch: java.lang.Throwable -> L8e
            if (r1 != r7) goto L55
            java.lang.Object r2 = r3.get(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "cacheTmp[0]"
            kotlin.jvm.internal.o.LJFF(r2, r1)     // Catch: java.lang.Throwable -> L8e
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L8e
            int r1 = r2.getHeight()     // Catch: java.lang.Throwable -> L8e
            if (r1 == r6) goto L58
        L55:
            LIZIZ(r9)     // Catch: java.lang.Throwable -> L8e
        L58:
            monitor-exit(r3)
        L59:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object r1 = r5.get(r1)
            if (r1 != 0) goto L80
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 2
            r3.<init>(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r5.put(r1, r3)
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r11, r7, r6, r10)
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r11, r7, r6, r10)
            monitor-enter(r3)
            r3.add(r2)     // Catch: java.lang.Throwable -> L91
            r3.add(r1)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r3)
        L80:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r5.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L18
            monitor-enter(r2)
            goto L94
        L8e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L91:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L94:
            int r1 = r2.size()     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L9b
            goto La1
        L9b:
            java.lang.Object r0 = r2.remove(r4)     // Catch: java.lang.Throwable -> La3
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> La3
        La1:
            monitor-exit(r2)
            return r0
        La3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25140yk.LIZ(X.0Go, android.graphics.Bitmap$Config, android.util.DisplayMetrics):android.graphics.Bitmap");
    }
}
