package com.ss.android.ugc.aweme.relation.storage.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class LocalListResponse extends BaseResponse {

    @InterfaceC65349Pkn("local_datas")
    public final List<LocalData> _data;

    @InterfaceC65349Pkn("has_more")
    public final Boolean _hasMore;

    @InterfaceC65349Pkn("next_page_token")
    public final String _nextPageToken;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    public final List<LocalData> getData() {
        List<LocalData> list = this._data;
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    public final boolean getHasMore() {
        Boolean bool = this._hasMore;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String getNextPageToken() {
        String str = this._nextPageToken;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalListResponse(data=");
        LIZ.append(this._data);
        LIZ.append(", _nextPageToken=");
        LIZ.append(this._nextPageToken);
        LIZ.append(", _hasMore=");
        LIZ.append(this._hasMore);
        LIZ.append(", logId: ");
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            str = logPbBean.getImprId();
        } else {
            str = null;
        }
        return q.LIZIZ(LIZ, str, ')', LIZ);
    }

    public LocalListResponse(List<LocalData> list, String str, Boolean bool, LogPbBean logPbBean) {
        this._data = list;
        this._nextPageToken = str;
        this._hasMore = bool;
        this.logPb = logPbBean;
    }

    public /* synthetic */ LocalListResponse(List list, String str, Boolean bool, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, bool, (i & 8) != 0 ? null : logPbBean);
    }
}
