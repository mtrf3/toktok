package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes8.dex */
public class RoomBuilding extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("activity_h5_url")
    public String activityH5Url;

    @InterfaceC65349Pkn("activity_icon_url")
    public UrlModel activityIconUrl;

    @InterfaceC65349Pkn("begin_time")
    public long beginTime;

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("show_h5")
    public boolean showH5;

    @InterfaceC65349Pkn("show_h5_url")
    public String showH5Url;
}
