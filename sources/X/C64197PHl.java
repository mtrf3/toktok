package X;

import defpackage.b0;

/* renamed from: X.PHl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64197PHl {
    public final EnumC64201PHp LIZ;
    public double LIZIZ;
    public double LIZJ;
    public double LIZLLL;
    public double LJ;
    public String LJFF;
    public final long LJI;
    public int LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CpuCacheItem{type=");
        LIZ.append(this.LIZ);
        LIZ.append(", metricRate=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", metricMaxRate=");
        LIZ.append(this.LIZJ);
        LIZ.append(", metricCpuStats=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", metricMaxCpuStats=");
        LIZ.append(this.LJ);
        LIZ.append(", sceneString='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", firstTs=");
        LIZ.append(this.LJI);
        LIZ.append(", times=");
        return b0.LIZJ(LIZ, this.LJII, '}', LIZ);
    }

    public C64197PHl(EnumC64201PHp enumC64201PHp, long j) {
        this.LIZ = enumC64201PHp;
        this.LJI = j;
    }
}
