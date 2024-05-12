package X;

/* loaded from: classes10.dex */
public final class MPD {
    public long LIZ;
    public long LIZIZ;

    public MPD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPD)) {
            return false;
        }
        MPD mpd = (MPD) obj;
        return this.LIZ == mpd.LIZ && this.LIZIZ == mpd.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TimeRange(maxTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", minTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ MPD(int i) {
        this(0L, 0L);
    }

    public MPD(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
