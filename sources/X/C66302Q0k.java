package X;

/* renamed from: X.Q0k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66302Q0k {
    public long LIZ;
    public long LIZIZ;

    public final long LIZ() {
        long j = this.LIZIZ - this.LIZ;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TimeAnchorBean(startTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", endTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(",costTime=");
        LIZ.append(LIZ());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }
}
