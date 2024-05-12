package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiphyResourcesBean {

    @InterfaceC65349Pkn("data")
    public final List<GiphyDataBean> data;

    @InterfaceC65349Pkn("pagination")
    public final GiphyPaginationBean pagination;

    /* JADX WARN: Multi-variable type inference failed */
    public GiphyResourcesBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiphyResourcesBean)) {
            return false;
        }
        GiphyResourcesBean giphyResourcesBean = (GiphyResourcesBean) obj;
        return o.LJ(this.data, giphyResourcesBean.data) && o.LJ(this.pagination, giphyResourcesBean.pagination);
    }

    public final int hashCode() {
        List<GiphyDataBean> list = this.data;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        GiphyPaginationBean giphyPaginationBean = this.pagination;
        return hashCode + (giphyPaginationBean != null ? giphyPaginationBean.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiphyResourcesBean(data=");
        LIZ.append(this.data);
        LIZ.append(", pagination=");
        LIZ.append(this.pagination);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public GiphyResourcesBean(List<GiphyDataBean> list, GiphyPaginationBean giphyPaginationBean) {
        this.data = list;
        this.pagination = giphyPaginationBean;
    }

    public /* synthetic */ GiphyResourcesBean(List list, GiphyPaginationBean giphyPaginationBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : giphyPaginationBean);
    }
}
