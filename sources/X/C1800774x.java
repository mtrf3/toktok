package X;

import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.74x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1800774x {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        if (str == null) {
            return;
        }
        int i = 0;
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("aweme_id", str));
        if (str2 != null) {
            LJJLIIIIJ.put("insert_ids", str2);
        }
        PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v2/comment/list/", LJJLIIIIJ);
        java.util.Map snapshot = C1800874y.LIZIZ().snapshot();
        o.LJIIIIZZ(snapshot, "commentCache.snapshot()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : snapshot.entrySet()) {
            if (str2 == null) {
                if (o.LJ(((C176556wN) entry.getKey()).LJLIL, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if (o.LJ(((C176556wN) entry.getKey()).LJLIL, str) && o.LJ(((C176556wN) entry.getKey()).LJLJJI, str2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            C1800874y.LIZIZ().remove(((Map.Entry) it.next()).getKey());
            i++;
        }
        C71Y.LIZLLL("InboxCommentPreload", "remove cache by aid " + str + " cid " + str2 + ", remove count: " + i);
    }
}
