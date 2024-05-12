package X;

import java.util.HashMap;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public final class QHA {
    public int LIZ;
    public java.util.Map<Integer, QHC> LIZJ;
    public java.util.Map<String, Integer> LJ;
    public JSONArray LJFF;
    public int LIZIZ = 5;
    public int LIZLLL = -1;

    public final boolean LIZ() {
        java.util.Map<Integer, QHC> map;
        QHC qhc;
        if (this.LIZ >= 0 && this.LIZIZ > 0 && (map = this.LIZJ) != null) {
            HashMap hashMap = (HashMap) map;
            if (!hashMap.isEmpty() && hashMap.containsKey(-1) && (qhc = (QHC) hashMap.get(-1)) != null && qhc.LIZLLL > 0) {
                return true;
            }
        }
        return false;
    }
}
