package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4qw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122224qw {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public C122224qw() {
        this(0L, 0L, 0L, 0L, "");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraAuditVideoInfo(path='");
        LIZ.append(this.LIZ);
        LIZ.append("', startTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", timeClipStart=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", timeClipEnd=");
        return C47135Ieh.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C122224qw(long j, long j2, long j3, long j4, String path) {
        o.LJIIIZ(path, "path");
        this.LIZ = path;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
    }
}
