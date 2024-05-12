package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import com.ss.android.ugc.aweme.utils.StringJsonWithOriginAdapterFactory;
import java.io.Serializable;

/* loaded from: classes16.dex */
public final class PreviewProductCardInfo implements Serializable {

    @InterfaceC65349Pkn("recommend_info")
    @InterfaceC65404Plg(StringJsonWithOriginAdapterFactory.class)
    public FypRecommendInfo recommendInfo;

    public final FypRecommendInfo getRecommendInfo() {
        return this.recommendInfo;
    }

    public final void setRecommendInfo(FypRecommendInfo fypRecommendInfo) {
        this.recommendInfo = fypRecommendInfo;
    }
}
