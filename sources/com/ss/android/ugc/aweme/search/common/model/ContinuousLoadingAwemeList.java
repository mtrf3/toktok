package com.ss.android.ugc.aweme.search.common.model;

import X.InterfaceC49435Jah;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ContinuousLoadingAwemeList implements InterfaceC49435Jah<ContinuousLoadingAwemeList> {

    @InterfaceC65349Pkn("items")
    public List<Aweme> awemeList;

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("status_code")
    public int statusCode;

    @Override // X.InterfaceC49435Jah
    public final void LIZIZ() {
        this.hasMore = 0;
    }

    @Override // X.InterfaceC49435Jah
    public final int LIZ() {
        return this.hasMore;
    }

    @Override // X.InterfaceC49435Jah
    public final List<Aweme> LIZLLL() {
        return this.awemeList;
    }

    @Override // X.InterfaceC49435Jah
    public final void LIZJ(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        ContinuousLoadingAwemeList awemeList = continuousLoadingAwemeList;
        o.LJIIIZ(awemeList, "awemeList");
        this.hasMore &= awemeList.hasMore;
        this.cursor = awemeList.cursor;
        this.statusCode = awemeList.statusCode;
        this.extra = awemeList.extra;
        this.logPb = awemeList.logPb;
    }
}
