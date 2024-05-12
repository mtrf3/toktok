package X;

/* renamed from: X.PHo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64200PHo {
    public boolean LIZ;
    public boolean LIZIZ;
    public long LIZJ = 120;
    public long LIZLLL = 600;
    public long LJ = 1200;
    public long LJFF = 120;
    public long LJI = 600;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CpuConfig{mEnableUpload=");
        LIZ.append(this.LIZ);
        LIZ.append(", mCollectAllProcess=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mFrontCollectInterval=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mBackCollectInterval=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mMonitorInterval=");
        LIZ.append(this.LJ);
        LIZ.append(", mFrontThreadCollectInterval=");
        LIZ.append(this.LJFF);
        LIZ.append(", mBackThreadCollectInterval=");
        return C47135Ieh.LIZIZ(LIZ, this.LJI, '}', LIZ);
    }
}
