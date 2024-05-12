package X;

import java.util.HashMap;

/* renamed from: X.HnZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45137HnZ {
    public static void LIZ(long j) {
        ((HashMap) C45277Hpp.LIZIZ.getValue()).remove(Long.valueOf(j));
    }

    public static long LIZIZ(Object... objArr) {
        long nanoTime = System.nanoTime();
        ((HashMap) C45277Hpp.LIZIZ.getValue()).put(Long.valueOf(nanoTime), objArr);
        return nanoTime;
    }
}
