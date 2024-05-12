package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IRc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46612IRc implements InterfaceC46610IRa {
    public final List<List<Long>> LIZ = new ArrayList();
    public final List<List<Long>> LIZIZ = new ArrayList();
    public long LIZJ = 0;
    public long LIZLLL = 0;
    public long LJ = 0;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CpuIdleTimeStatInfo{stateTimeLists=");
        LIZ.append(this.LIZ);
        LIZ.append(", stateDeltaTimeLists=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", totalCpuIdleTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", deltaCpuIdleTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mergedDeltaCpuIdleTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJ, '}', LIZ);
    }
}
