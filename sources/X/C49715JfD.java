package X;

import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JfD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49715JfD {
    public static void LIZ(InterfaceC49926Jic interfaceC49926Jic, GlobalDoodleConfig globalDoodleConfig) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("jumpHashtagDetailForPsaAndBanSearch: ");
        LIZ.append(C16880lQ.LJLLJ(interfaceC49926Jic.getClass()));
        LIZ.append('@');
        LIZ.append(interfaceC49926Jic.hashCode());
        LIZ.append(", forbidSearchType = ");
        if (globalDoodleConfig != null) {
            num = Integer.valueOf(globalDoodleConfig.getForbidSearchType());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
    }

    public static void LIZIZ(InterfaceC49926Jic interfaceC49926Jic, SearchMixFeedList data) {
        Integer num;
        o.LJIIIZ(data, "data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadMoreSuccess: ");
        LIZ.append(C16880lQ.LJLLJ(interfaceC49926Jic.getClass()));
        LIZ.append('@');
        LIZ.append(interfaceC49926Jic.hashCode());
        LIZ.append(", items: ");
        List<SearchMixFeed> list = data.mItems;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
    }

    public static void LIZJ(InterfaceC49926Jic interfaceC49926Jic, SearchMixFeedList data) {
        Integer num;
        o.LJIIIZ(data, "data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRefreshSuccess: ");
        LIZ.append(C16880lQ.LJLLJ(interfaceC49926Jic.getClass()));
        LIZ.append('@');
        LIZ.append(interfaceC49926Jic.hashCode());
        LIZ.append(", items: ");
        List<SearchMixFeed> list = data.mItems;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
    }
}
