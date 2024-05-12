package com.ss.android.ugc.profile.platform.business.navbar.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* loaded from: classes5.dex */
public final class ViewerEntranceData extends BizBaseData {

    @InterfaceC65349Pkn("latest_viewer_avatar_thumb_list")
    public List<UrlModel> latestViewerAvatarThumbList;

    @InterfaceC65349Pkn("sub_describe")
    public String subTitle;

    @InterfaceC65349Pkn("unread_count")
    public Integer unReadCount;

    public final List<UrlModel> getLatestViewerAvatarThumbList() {
        return this.latestViewerAvatarThumbList;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final Integer getUnReadCount() {
        return this.unReadCount;
    }

    public final void setLatestViewerAvatarThumbList(List<UrlModel> list) {
        this.latestViewerAvatarThumbList = list;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setUnReadCount(Integer num) {
        this.unReadCount = num;
    }
}
