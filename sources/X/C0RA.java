package X;

import java.util.List;

/* renamed from: X.0RA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RA {
    public final int LIZ;
    public final String LIZIZ;
    public final java.util.Map<String, List<String>> LIZJ;
    public final long LIZLLL = System.currentTimeMillis();
    public final C0R9 LJ;
    public final Throwable LJFF;

    public static C0RA LIZ(Throwable th, C0R9 c0r9) {
        return new C0RA(-1, th.getMessage(), null, c0r9, th);
    }

    public C0RA(int i, String str, java.util.Map<String, List<String>> map, C0R9 c0r9, Throwable th) {
        this.LIZ = -1;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LJ = c0r9;
        this.LJFF = th;
    }
}
