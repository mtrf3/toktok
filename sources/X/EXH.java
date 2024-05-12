package X;

import com.ss.android.ugc.aweme.childhook.MajorComponentsAllowList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class EXH implements EXF {
    @Override // X.EXF
    public final boolean LIZIZ(String str) {
        return true;
    }

    @Override // X.EXF
    public final boolean LIZ(String str) {
        List list;
        MajorComponentsAllowList majorComponentsAllowList = C36945Eej.LIZ;
        if (majorComponentsAllowList == null || (list = majorComponentsAllowList.broadcastReceivers) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C38354F3m.LIZJ((String) it.next(), str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
