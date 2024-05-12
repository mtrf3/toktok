package com.ss.android.ugc.aweme.explore.data;

import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExploreAwemeList extends BaseResponse implements InterfaceC65316PkG {

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("awemes")
    public List<Aweme> items;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    @Override // X.InterfaceC65316PkG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getRequestId() {
        /*
            r1 = this;
            java.lang.String r0 = r1.requestId
            if (r0 == 0) goto Ld
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L15
        Ld:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r1.logPb
            if (r0 != 0) goto L1b
            java.lang.String r0 = ""
        L13:
            r1.requestId = r0
        L15:
            java.lang.String r0 = r1.requestId
            kotlin.jvm.internal.o.LJI(r0)
            return r0
        L1b:
            kotlin.jvm.internal.o.LJI(r0)
            java.lang.String r0 = r0.getImprId()
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.data.ExploreAwemeList.getRequestId():java.lang.String");
    }

    @Override // X.InterfaceC65316PkG
    public final void setRequestId(String requestId) {
        o.LJIIIZ(requestId, "requestId");
        this.requestId = requestId;
    }
}
