package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JI4 {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        if (list != null) {
            List LJLL = ORZ.LJLL(list);
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LJLL).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (LIZIZ((Aweme) next)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    public static boolean LIZIZ(Aweme aweme) {
        String str;
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getSearchFeedType() == null && !aweme.isLive()) {
            java.util.Map<String, String> searchExtraParams = aweme.getSearchExtraParams();
            if (searchExtraParams != null) {
                str = searchExtraParams.get("token_type");
            } else {
                str = null;
            }
            if (!o.LJ(str, "tikbot") && !aweme.getIsSubAweme()) {
                return true;
            }
        }
        return false;
    }
}
