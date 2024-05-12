package X;

/* renamed from: X.PHm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64198PHm {
    public boolean LIZ;
    public boolean LIZIZ;
    public double LIZJ = 3.0d;
    public double LIZLLL = 6.0d;
    public double LJ = 0.05d;
    public boolean LJFF;
    public java.util.Map<String, Double> LJI;
    public java.util.Map<String, Double> LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CpuExceptionConfig{isOpen=");
        LIZ.append(this.LIZ);
        LIZ.append(", isCollectMainThread=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", maxProcessBackCpuSpeed=");
        LIZ.append(this.LIZJ);
        LIZ.append(", maxProcessForeCpuSpeed=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", maxThreadCpuRate=");
        LIZ.append(this.LJ);
        LIZ.append(", isCollectAllProcess=");
        LIZ.append(this.LJFF);
        LIZ.append(", backSceneMaxSpeedMap=");
        LIZ.append(this.LJI);
        LIZ.append(", foreSceneMaxSpeedMap=");
        return C15890jp.LIZ(LIZ, this.LJII, '}', LIZ);
    }
}
