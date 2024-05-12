package com.ss.android.ugc.aweme.encouragepublish.manager;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyEncouragePublishGuideVideoModel {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("card_bg_url")
    public final UrlModel cardBgUrl;

    @InterfaceC65349Pkn("video_list")
    public final List<NearbyVideoCardModel> videoList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyEncouragePublishGuideVideoModel)) {
            return false;
        }
        NearbyEncouragePublishGuideVideoModel nearbyEncouragePublishGuideVideoModel = (NearbyEncouragePublishGuideVideoModel) obj;
        return o.LJ(this.videoList, nearbyEncouragePublishGuideVideoModel.videoList) && o.LJ(this.cardBgUrl, nearbyEncouragePublishGuideVideoModel.cardBgUrl);
    }

    public final int hashCode() {
        List<NearbyVideoCardModel> list = this.videoList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        UrlModel urlModel = this.cardBgUrl;
        return hashCode + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("NearbyEncouragePublishGuideVideoModel(videoList=");
        LIZ2.append(this.videoList);
        LIZ2.append(", cardBgUrl=");
        return C31461Li.LIZLLL(LIZ2, this.cardBgUrl, ')', LIZ2);
    }

    public NearbyEncouragePublishGuideVideoModel(List<NearbyVideoCardModel> list, UrlModel urlModel) {
        this.videoList = list;
        this.cardBgUrl = urlModel;
    }
}
