package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTest;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.TwP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76261TwP {
    public static boolean LIZ;

    public static boolean LIZ() {
        java.util.Map LIZIZ;
        if (LIZ || (LIZIZ = C76265TwT.LIZIZ()) == null || LIZIZ.isEmpty()) {
            return false;
        }
        int size = LIZIZ.size();
        Iterator it = LIZIZ.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            List<BattleABTest> list = ((BattleABTestList) ((Map.Entry) it.next()).getValue()).abTestList;
            if (list != null) {
                for (BattleABTest battleABTest : list) {
                    if (battleABTest.abTestType == 5 && battleABTest.group == 1) {
                        i++;
                    }
                }
            }
        }
        if (size != i) {
            return false;
        }
        return true;
    }
}
