package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Ost, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63303Ost {
    public final java.util.Set<C63120Opw> LIZ = new LinkedHashSet();
    public final java.util.Set<String> LIZIZ = new LinkedHashSet();
    public final java.util.Map<String, Integer> LIZJ = new HashMap();
    public final java.util.Map<String, List<C109544Rq>> LIZLLL = new LinkedHashMap();
    public final List<C109544Rq> LJ = new ArrayList();
    public long LJFF = -1;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProcessResult{has:");
        LIZ.append(this.LIZ.size());
        LIZ.append(", waiting:");
        LIZ.append(this.LIZIZ.size());
        LIZ.append(", nextPullVersion:");
        LIZ.append(this.LJFF);
        LIZ.append(", msgListMap:");
        LIZ.append(this.LIZLLL.size());
        LIZ.append(", pushMsgList:");
        LIZ.append(((ArrayList) this.LJ).size());
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }
}
