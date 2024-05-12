package X;

import com.bytedance.scalpel.protos.BinderInfo;
import com.bytedance.scalpel.protos.GCRecord;
import com.bytedance.scalpel.protos.IoInfo;
import com.bytedance.scalpel.protos.LockInfo;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class FY7 {
    public ArrayList<long[]> LIZ = new ArrayList<>();
    public final ArrayList<BinderInfo> LIZIZ = new ArrayList<>();
    public final ArrayList<GCRecord> LIZJ = new ArrayList<>();
    public final ArrayList<LockInfo> LIZLLL = new ArrayList<>();
    public final ArrayList<IoInfo> LJ = new ArrayList<>();
    public long LJFF = 0;
    public long LJI = 0;
    public String LJII = "";
    public String LJIIIIZZ = "";

    public final void LIZ() {
        if (this.LIZ.size() > 50) {
            this.LIZ = new ArrayList<>();
        } else {
            this.LIZ.clear();
        }
        this.LIZIZ.clear();
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.LJ.clear();
        this.LJII = "";
        this.LJIIIIZZ = "";
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BigJankInfo{stacks=");
        LIZ.append(this.LIZ.size());
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
