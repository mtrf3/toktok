package com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model;

import X.C49910JiM;
import X.C49911JiN;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class SearchLiveList extends SearchApiResult {
    public List<SearchLiveStruct> LJLIL;
    public List<SearchLiveStruct> LJLILLLLZI;

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("extra_data")
    public List<Map<?, ?>> extraDataRaw;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("data")
    public List<Map<?, ?>> liveListRaw;

    public final List<SearchLiveStruct> LJ() {
        if (this.LJLILLLLZI == null && this.extraDataRaw != null) {
            this.LJLILLLLZI = new ArrayList();
            Iterator<Map<?, ?>> it = this.extraDataRaw.iterator();
            while (it.hasNext()) {
                ((ArrayList) this.LJLILLLLZI).add(GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), it.next()), new C49911JiN().getType()));
            }
        }
        return this.LJLILLLLZI;
    }

    public final List<SearchLiveStruct> LJI() {
        if (this.LJLIL == null && this.liveListRaw != null) {
            this.LJLIL = new ArrayList();
            Iterator<Map<?, ?>> it = this.liveListRaw.iterator();
            while (it.hasNext()) {
                ((ArrayList) this.LJLIL).add(GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), it.next()), new C49910JiM().getType()));
            }
        }
        return this.LJLIL;
    }
}
