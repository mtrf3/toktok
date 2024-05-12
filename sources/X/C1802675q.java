package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.75q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1802675q {
    public static final /* synthetic */ int LIZ = 0;

    static {
        Keva repo = Keva.getRepo("interaction_like_count");
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_LIKE_COUNT)");
        LIZ(repo);
        Keva repo2 = Keva.getRepo("interaction_comment_count");
        o.LJIIIIZZ(repo2, "getRepo(KEVA_REPO_COMMENT_COUNT)");
        LIZ(repo2);
    }

    public static void LIZ(Keva keva) {
        ArrayList arrayList = new ArrayList();
        java.util.Map<String, ?> all = keva.getAll();
        o.LJIIIIZZ(all, "all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof C78Y) && System.currentTimeMillis() - ((C78Y) value).getTimeStamp() >= 600000) {
                arrayList.add(key);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            keva.erase((String) it.next());
        }
    }
}
