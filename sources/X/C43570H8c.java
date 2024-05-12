package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H8c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43570H8c {
    public static String LIZ = "";
    public static long LIZIZ;
    public static long LIZJ;

    public static final long LIZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !o.LJ(str, LIZ)) {
            return -1L;
        }
        long j = LIZJ;
        LIZ = "";
        LIZJ = 0L;
        return j;
    }
}
