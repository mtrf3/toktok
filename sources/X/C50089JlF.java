package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.JlF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50089JlF {
    public static final ExecutorService LIZ = C37191Eih.LIZ(new C38027EwB(FSY.SERIAL));
    public static final Gson LIZIZ = GsonHolder.LIZJ().LIZ();
    public static final boolean LIZJ = ((Boolean) C34341Ddp.LIZ.getValue()).booleanValue();

    public static void LIZ(SearchMixFeedList originalData) {
        o.LJIIIZ(originalData, "originalData");
        if (!LIZJ) {
            return;
        }
        List list = originalData.mItems;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        int size = list.size();
        String str = originalData.LJLIL;
        if ((!list.isEmpty()) && str != null && ((SearchMixFeed) ORZ.LLFF(list)).LJLJL) {
            originalData.LJLILLLLZI = C10K.LIZIZ(new CallableC49930Jig(str, size, originalData), LIZ, null);
        }
    }
}
