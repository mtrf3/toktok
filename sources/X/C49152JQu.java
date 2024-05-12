package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.CommonAladdin;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* renamed from: X.JQu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49152JQu {
    public static final List<Integer> LIZ = C47261Igj.LJJIJIIJI(65280, 1048336);
    public static final List<Integer> LIZIZ = C47261Igj.LJJIJIIJI(65280, 1048336);
    public static final java.util.Set<Integer> LIZJ = C77275UUl.LJIIIIZZ(70, 72, 62, 555, 2);

    public static final boolean LIZ(SearchMixFeed searchMixFeed) {
        String str;
        CommonAladdin commonAladdin = searchMixFeed.commonAladdin;
        if (commonAladdin != null) {
            str = commonAladdin.activityLevel;
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Integer num) {
        return ORZ.LJLJJI(num, LIZJ);
    }
}
