package com.ss.android.ugc.aweme.relation.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MaFUserVideoListResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("items")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    @InterfaceC65349Pkn("next_page_token")
    public final String nextPageToken;

    public MaFUserVideoListResponse() {
        this(null, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MaFUserVideoListResponse copy$default(MaFUserVideoListResponse maFUserVideoListResponse, String str, List list, boolean z, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = maFUserVideoListResponse.nextPageToken;
        }
        if ((i & 2) != 0) {
            list = maFUserVideoListResponse.awemeList;
        }
        if ((i & 4) != 0) {
            z = maFUserVideoListResponse.hasMore;
        }
        if ((i & 8) != 0) {
            logPbBean = maFUserVideoListResponse.logPb;
        }
        return maFUserVideoListResponse.copy(str, list, z, logPbBean);
    }

    public final MaFUserVideoListResponse copy(String nextPageToken, List<? extends Aweme> awemeList, boolean z, LogPbBean logPbBean) {
        o.LJIIIZ(nextPageToken, "nextPageToken");
        o.LJIIIZ(awemeList, "awemeList");
        return new MaFUserVideoListResponse(nextPageToken, awemeList, z, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaFUserVideoListResponse)) {
            return false;
        }
        MaFUserVideoListResponse maFUserVideoListResponse = (MaFUserVideoListResponse) obj;
        return o.LJ(this.nextPageToken, maFUserVideoListResponse.nextPageToken) && o.LJ(this.awemeList, maFUserVideoListResponse.awemeList) && this.hasMore == maFUserVideoListResponse.hasMore && o.LJ(this.logPb, maFUserVideoListResponse.logPb);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MaFUserVideoListResponse(nextPageToken=");
        LIZ.append(this.nextPageToken);
        LIZ.append(", awemeList=");
        LIZ.append(this.awemeList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.awemeList, this.nextPageToken.hashCode() * 31, 31);
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LIZIZ + i) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null) {
            hashCode = 0;
        } else {
            hashCode = logPbBean.hashCode();
        }
        return i2 + hashCode;
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaFUserVideoListResponse(String nextPageToken, List<? extends Aweme> awemeList, boolean z, LogPbBean logPbBean) {
        o.LJIIIZ(nextPageToken, "nextPageToken");
        o.LJIIIZ(awemeList, "awemeList");
        this.nextPageToken = nextPageToken;
        this.awemeList = awemeList;
        this.hasMore = z;
        this.logPb = logPbBean;
    }

    public MaFUserVideoListResponse(String str, List list, boolean z, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : logPbBean);
    }
}
