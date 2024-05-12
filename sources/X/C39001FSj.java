package X;

import java.util.List;

/* renamed from: X.FSj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39001FSj {
    public final boolean LIZ;
    public final List<FSY> LIZIZ;
    public final List<String> LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;

    public C39001FSj(C39005FSn c39005FSn) {
        this.LIZ = c39005FSn.LIZ;
        List<FSY> list = c39005FSn.LIZIZ;
        LIZ(list);
        this.LIZIZ = list;
        List<String> list2 = c39005FSn.LIZJ;
        LIZ(list2);
        this.LIZJ = list2;
        long j = c39005FSn.LIZLLL;
        LIZIZ(j);
        this.LIZLLL = j;
        long j2 = c39005FSn.LJ;
        LIZIZ(j2);
        this.LJ = j2;
        long j3 = c39005FSn.LJFF;
        LIZIZ(j3);
        this.LJFF = j3;
    }

    public static void LIZ(Object obj) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("should not be null!");
        C16880lQ.LLLLIIL(illegalStateException);
        throw illegalStateException;
    }

    public static void LIZIZ(long j) {
        if (j != 0) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("should not be zero!");
        C16880lQ.LLLLIIL(illegalStateException);
        throw illegalStateException;
    }
}
