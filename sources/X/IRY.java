package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class IRY {
    public final String LIZ;
    public List<Integer> LIZIZ = new ArrayList();
    public List<Long> LIZJ = new ArrayList();

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CpuClusterInfo{name='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", affectedCpuList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", freqList=");
        return C1NE.LIZIZ(LIZ, this.LIZJ, '}', LIZ);
    }

    public IRY(String str) {
        this.LIZ = str;
    }
}
