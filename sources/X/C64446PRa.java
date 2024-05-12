package X;

import java.util.HashSet;

/* renamed from: X.PRa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64446PRa {
    public String LIZ;
    public String LIZIZ;
    public HashSet<String> LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public float LJI = -1.0f;
    public int LJII = 2;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProcInfo{pidName='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", pid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cpuTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", currentTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJ, '}', LIZ);
    }
}
