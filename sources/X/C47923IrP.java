package X;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.IrP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47923IrP {
    public String LIZ;
    public String LIZIZ;
    public HashSet<String> LIZJ;
    public HashMap<String, Object> LIZLLL;
    public long LJFF;
    public long LJI;
    public long LJ = -1;
    public float LJII = -1.0f;
    public int LJIIIIZZ = 1;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProcInfo{pidName='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", pid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cpuTime=");
        LIZ.append(this.LJ);
        LIZ.append(", currentTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJFF, '}', LIZ);
    }
}
