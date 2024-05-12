package com.ss.android.ugc.aweme.mix.api.response;

import X.C64668PZo;
import X.InterfaceC65349Pkn;
import X.K4J;
import X.T28;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes4.dex */
public final class MixVideosResponse extends BaseResponse implements K4J {
    public C64668PZo<?> LJLIL;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("has_more_of_load_before")
    public boolean hasMoreLadBefore;

    @InterfaceC65349Pkn("has_more_of_load_more")
    public boolean hasMoreLoadMore;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn("min_cursor")
    public long minCursor;

    @InterfaceC65349Pkn("videos")
    public List<? extends Aweme> mixVideos;

    @Override // X.K4J
    public final /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }

    @Override // X.K4J
    public final C64668PZo<?> getRequestInfo() {
        return this.LJLIL;
    }

    @Override // X.K4J
    public final void setRequestInfo(C64668PZo<?> c64668PZo) {
        if (c64668PZo != null) {
            this.LJLIL = c64668PZo;
        }
    }
}
