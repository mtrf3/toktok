package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class IRZ implements InterfaceC46610IRa {
    public List<Integer> LJ;
    public final List<LinkedHashMap<Long, Long>> LIZ = new ArrayList();
    public final List<LinkedHashMap<Long, Long>> LIZIZ = new ArrayList();
    public List<LinkedHashMap<Long, Long>> LIZJ = new ArrayList();
    public boolean LIZLLL = false;
    public long LJFF = 0;
    public long LJI = 0;
    public long LJII = 0;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProcTimeInStateInfo{freqTimeMapList=");
        LIZ.append(this.LIZ);
        LIZ.append(", freqDeltaTimeMapList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", totalCpuTime=");
        if (this.LJFF == 0) {
            this.LJFF = LIZ(this.LIZ);
        }
        LIZ.append(this.LJFF);
        LIZ.append(", totalDeltaCpuTime=");
        if (this.LJI == 0) {
            this.LJI = LIZ(this.LIZIZ);
        }
        LIZ.append(this.LJI);
        LIZ.append(", totalMergeCpuTime=");
        if (this.LJII == 0) {
            this.LJII = LIZ(this.LIZJ);
        }
        return C47135Ieh.LIZIZ(LIZ, this.LJII, '}', LIZ);
    }

    public final long LIZ(List<LinkedHashMap<Long, Long>> list) {
        int size;
        List<Integer> list2;
        if (!this.LIZLLL) {
            synchronized (IU6.class) {
                List<Integer> list3 = IU6.LIZJ;
                if (list3 != null) {
                    list2 = list3;
                } else {
                    List<IRY> LIZ = IU6.LIZ();
                    ArrayList arrayList = new ArrayList();
                    Iterator<IRY> it = LIZ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((ArrayList) it.next().LIZIZ).size()));
                    }
                    IU6.LIZJ = arrayList;
                    list2 = arrayList;
                }
            }
            this.LJ = list2;
            this.LIZLLL = true;
        }
        long j = 0;
        if (list != null && !list.isEmpty() && (size = list.size()) == this.LJ.size()) {
            for (int i = 0; i < size; i++) {
                Iterator it2 = ((LinkedHashMap) ListProtector.get(list, i)).entrySet().iterator();
                while (it2.hasNext()) {
                    j += ((Long) ((Map.Entry) it2.next()).getValue()).longValue();
                }
            }
        }
        return j;
    }
}
