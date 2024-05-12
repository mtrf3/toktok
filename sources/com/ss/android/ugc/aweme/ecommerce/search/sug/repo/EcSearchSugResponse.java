package com.ss.android.ugc.aweme.ecommerce.search.sug.repo;

import X.C64668PZo;
import X.InterfaceC65349Pkn;
import X.K4J;
import X.KBZ;
import X.T28;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;

/* loaded from: classes9.dex */
public class EcSearchSugResponse extends BaseResponse implements K4J {
    public transient String LJLILLLLZI;
    public transient String LJLJI;
    public transient KBZ LJLJJI;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("words_query_record")
    public RecommendWordMob recommendWordMob;

    @InterfaceC65349Pkn("sug_list")
    public List<SearchSugEntity> sugList;

    @InterfaceC65349Pkn("rid")
    public String requestId = "";

    @InterfaceC65349Pkn("request_order")
    public Long requestOrder = 0L;

    @InterfaceC65349Pkn("sug_virtual_enable")
    public String sugVirtualEnable = "";
    public C64668PZo LJLIL = null;

    @Override // X.K4J
    public final /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }

    @Override // X.K4J
    public final C64668PZo getRequestInfo() {
        return this.LJLIL;
    }

    @Override // X.K4J
    public final void setRequestInfo(C64668PZo c64668PZo) {
        this.LJLIL = c64668PZo;
    }
}
