package com.ss.android.ugc.profile.platform.base.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class UserStaticsInfo implements Serializable {

    @InterfaceC65349Pkn("aweme_count")
    public Integer awemeCount;

    @InterfaceC65349Pkn("visible_videos_count")
    public Integer visibleVideosCount;

    public final Integer getAwemeCount() {
        return this.awemeCount;
    }

    public final Integer getVisibleVideosCount() {
        return this.visibleVideosCount;
    }

    public final void setAwemeCount(Integer num) {
        this.awemeCount = num;
    }

    public final void setVisibleVideosCount(Integer num) {
        this.visibleVideosCount = num;
    }
}
