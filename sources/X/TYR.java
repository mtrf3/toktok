package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class TYR {
    public final java.util.Map<Long, String> LIZ = new HashMap();
    public final java.util.Map<Integer, String> LIZIZ = new HashMap();
    public final List<String> LIZJ = new ArrayList();
    public final java.util.Map<Long, Long> LIZLLL = new HashMap();

    public final void LIZJ() {
        StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
        for (int i = 2; i < 6; i++) {
            if (i < stackTrace.length) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("logPositionMap trace");
                LIZ.append(i);
                LIZ.append(stackTrace[i].getClassName());
                LIZ.append(" ");
                LIZ.append(stackTrace[i].getMethodName());
                C0NB.LIZIZ("InteractALog_UserInteractIdDataHolder", X1D.LIZIZ(LIZ));
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fixPositionToInteractIdMap: ");
        LIZ2.append(this.LIZIZ);
        C0NB.LIZIZ("InteractALog_UserInteractIdDataHolder", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("nonFixPositionToInteractIdList: ");
        LIZ3.append(this.LIZJ);
        C0NB.LIZIZ("InteractALog_UserInteractIdDataHolder", X1D.LIZIZ(LIZ3));
    }

    public final String LIZ(long j) {
        return (String) ((HashMap) this.LIZ).get(Long.valueOf(j));
    }

    public final long LIZIZ(String str) {
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        Iterator it = ((HashMap) this.LIZ).keySet().iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (TextUtils.equals(str, (String) ((HashMap) this.LIZ).get(Long.valueOf(longValue)))) {
                return longValue;
            }
        }
        return 0L;
    }

    public final void LIZLLL(String str) {
        C279017q.LJ("reset source = ", str, "InteractALog_UserInteractIdDataHolder");
        ((HashMap) this.LIZ).clear();
        ((HashMap) this.LIZIZ).clear();
        ((ArrayList) this.LIZJ).clear();
        ((HashMap) this.LIZLLL).clear();
    }

    public final void LJ(long j, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("saveInteractId -> interactIdStr = ");
        LIZ.append(str);
        C0NB.LIZIZ("InteractALog_UserInteractIdDataHolder", X1D.LIZIZ(LIZ));
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.LIZ).put(Long.valueOf(j), str);
        }
    }

    public final void LJFF(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("saveMicPostion ");
        LIZ.append(i);
        LIZ.append(" ");
        LIZ.append(str);
        C0NB.LIZIZ("InteractALog_UserInteractIdDataHolder", X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i2 = 1;
        if (i == 0) {
            i = 1;
        }
        if (((HashMap) this.LIZIZ).containsKey(Integer.valueOf(i))) {
            C0NB.LIZIZ("InteractALog_UserInteractIdDataHolder", "saveMicPosition contains key");
            while (true) {
                if (!((HashMap) this.LIZIZ).containsKey(Integer.valueOf(i2))) {
                    C012403c.LJ("saveMicPosition contains key update to ", i2, "InteractALog_UserInteractIdDataHolder");
                    ((HashMap) this.LIZIZ).put(Integer.valueOf(i2), str);
                    break;
                }
                i2++;
                if (i2 > 3) {
                    break;
                }
            }
        } else {
            ((HashMap) this.LIZIZ).put(Integer.valueOf(i), str);
        }
        ((ArrayList) this.LIZJ).add(str);
        LIZJ();
    }
}
