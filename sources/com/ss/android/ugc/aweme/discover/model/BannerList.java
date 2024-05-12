package com.ss.android.ugc.aweme.discover.model;

import X.C61878OQg;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BannerList extends BaseResponse implements InterfaceC65316PkG {

    @InterfaceC65349Pkn("banner")
    public final List<Banner> items;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;
    public String requestId;

    public BannerList() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerList copy$default(BannerList bannerList, List list, LogPbBean logPbBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bannerList.items;
        }
        if ((i & 2) != 0) {
            logPbBean = bannerList.logPb;
        }
        if ((i & 4) != 0) {
            str = bannerList.requestId;
        }
        return bannerList.copy(list, logPbBean, str);
    }

    public final BannerList copy(List<? extends Banner> items, LogPbBean logPbBean, String requestId) {
        o.LJIIIZ(items, "items");
        o.LJIIIZ(requestId, "requestId");
        return new BannerList(items, logPbBean, requestId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerList)) {
            return false;
        }
        BannerList bannerList = (BannerList) obj;
        return o.LJ(this.items, bannerList.items) && o.LJ(this.logPb, bannerList.logPb) && o.LJ(this.requestId, bannerList.requestId);
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        LogPbBean logPbBean = this.logPb;
        return this.requestId.hashCode() + ((hashCode + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BannerList(items=");
        LIZ.append(this.items);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(", requestId=");
        return q.LIZIZ(LIZ, this.requestId, ')', LIZ);
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String requestId) {
        o.LJIIIZ(requestId, "requestId");
        this.requestId = requestId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerList(List<? extends Banner> items, LogPbBean logPbBean, String requestId) {
        o.LJIIIZ(items, "items");
        o.LJIIIZ(requestId, "requestId");
        this.items = items;
        this.logPb = logPbBean;
        this.requestId = requestId;
    }

    public BannerList(List list, LogPbBean logPbBean, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? null : logPbBean, (i & 4) != 0 ? "" : str);
    }
}
