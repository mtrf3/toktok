package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model;

import X.C49324JXk;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchHorizontalData extends SearchApiResult {
    public transient List<? extends Aweme> LJLIL;

    @InterfaceC65349Pkn("aweme_list")
    public List<? extends Map<?, ?>> awemeListRaw;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("new_cursor")
    public final Long newCursor;

    @InterfaceC65349Pkn("raw_data_diff")
    public final String rawDataDiff = "";

    public final List<Aweme> LJ() {
        if (this.LJLIL == null) {
            if (this.awemeListRaw == null) {
                return null;
            }
            this.LJLIL = new ArrayList();
            List<? extends Map<?, ?>> list = this.awemeListRaw;
            o.LJI(list);
            Iterator<? extends Map<?, ?>> it = list.iterator();
            while (it.hasNext()) {
                Object fromJson = GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), it.next()), new C49324JXk().getType());
                List<? extends Aweme> list2 = this.LJLIL;
                o.LJII(list2, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme>");
                ((ArrayList) list2).add(fromJson);
            }
        }
        return this.LJLIL;
    }
}
