package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C10K;
import X.C16880lQ;
import X.C49932Jii;
import X.InterfaceC49941Jir;
import X.InterfaceC65243Pj5;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PatchConfig;
import com.ss.android.ugc.aweme.search.performance.core.model.PreloadImg;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class SearchMixFeedList extends SearchApiResult implements InterfaceC65243Pj5, InterfaceC49941Jir, Cloneable {
    public String LJLIL;
    public C10K<SearchMixFeedList> LJLILLLLZI;
    public boolean LJLJI;
    public transient C49932Jii LJLJJI;
    public transient boolean LJLJJL;

    @InterfaceC65349Pkn("ack")
    public int ack = -2;

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("backtrace")
    public String mBacktrace;

    @InterfaceC65349Pkn("data")
    public List<SearchMixFeed> mItems;

    @InterfaceC65349Pkn("patch_config")
    public PatchConfig patchConfig;

    @InterfaceC65349Pkn("patch_v2")
    public List<ChunkPatch> patchs;

    @InterfaceC65349Pkn("preload_img")
    public PreloadImg preloadImg;

    @InterfaceC65349Pkn("result_status")
    public int resultStatus;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC49941Jir
    public final void LIZLLL(C49932Jii c49932Jii) {
        this.LJLJJI = c49932Jii;
    }

    @Override // X.InterfaceC65243Pj5
    public final void setJsonData(String str) {
        this.LJLIL = str;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.SearchApiResult, X.InterfaceC65316PkG
    public final void setRequestId(String str) {
        super.setRequestId(str);
        List<SearchMixFeed> list = this.mItems;
        if (list != null) {
            Iterator<SearchMixFeed> it = list.iterator();
            while (it.hasNext()) {
                it.next().setRequestId(str);
            }
        }
    }
}
