package X;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class IZR {
    public final java.util.Map<String, List<C46836IZs>> LIZ = new ConcurrentHashMap(200);

    public final void LIZ(long j, long j2, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || j <= 0 || j2 <= 0) {
            return;
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL("put cache info : uri = ", str, ", cacheKey = ", str2, ", mediaSize = ");
        LIZLLL.append(j);
        LIZLLL.append(", cacheSize = ");
        LIZLLL.append(j2);
        X1D.LIZIZ(LIZLLL);
        C46982IcE.LIZIZ().isDebug();
        if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            List<C46836IZs> list = (List) ((ConcurrentHashMap) this.LIZ).get(str);
            if (list.size() > 0) {
                C46982IcE.LIZIZ().isDebug();
            }
            for (C46836IZs c46836IZs : list) {
                if (c46836IZs != null && str2.equals(c46836IZs.LIZ)) {
                    if (c46836IZs.LIZIZ >= j2) {
                        return;
                    }
                    c46836IZs.LIZIZ = j2;
                    return;
                }
            }
            list.add(new C46836IZs(str2, j2));
            return;
        }
        C46836IZs c46836IZs2 = new C46836IZs(str2, j2);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(c46836IZs2);
        ((ConcurrentHashMap) this.LIZ).put(str, copyOnWriteArrayList);
    }
}
