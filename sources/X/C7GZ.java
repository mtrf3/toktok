package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7GZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GZ {
    public static final List<C62552ct> LIZ = new ArrayList();
    public static final java.util.Map<Long, List<Aweme>> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<Integer, C62552ct> LIZJ = new LinkedHashMap();
    public static final List<C62552ct> LIZLLL = new ArrayList();

    public static void LIZ(List data, boolean z) {
        long j;
        Long lastPushedAtSec;
        o.LJIIIZ(data, "data");
        if (z) {
            ((LinkedHashMap) LIZIZ).clear();
        }
        Iterator it = data.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null && (lastPushedAtSec = nowPostInfo.getLastPushedAtSec()) != null) {
                j = lastPushedAtSec.longValue();
            } else {
                j = 0;
            }
            Long valueOf = Long.valueOf(j);
            java.util.Map<Long, List<Aweme>> map = LIZIZ;
            if (map.containsKey(valueOf)) {
                List list = (List) ((LinkedHashMap) map).get(Long.valueOf(j));
                if (list != null) {
                    list.add(aweme);
                }
            } else {
                map.put(Long.valueOf(j), C47261Igj.LJJIJIL(aweme));
            }
        }
    }
}
