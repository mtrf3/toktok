package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public final class ViewerEntranceInfo implements Serializable {

    @InterfaceC65349Pkn("can_show_entrance")
    public boolean canShowEntrance;

    @InterfaceC65349Pkn("latest_viewer_avatar_thumb_list")
    public List<UrlModel> latestViewerAvatarThumbList;

    @InterfaceC65349Pkn("unread_viewer_count")
    public int unReadViewerCount;

    public final boolean getCanShowEntrance() {
        return this.canShowEntrance;
    }

    public final List<UrlModel> getLatestViewerAvatarThumbList() {
        return this.latestViewerAvatarThumbList;
    }

    public final int getUnReadViewerCount() {
        return this.unReadViewerCount;
    }

    public final void setCanShowEntrance(boolean z) {
        this.canShowEntrance = z;
    }

    public final void setLatestViewerAvatarThumbList(List<UrlModel> list) {
        this.latestViewerAvatarThumbList = list;
    }

    public final void setUnReadViewerCount(int i) {
        this.unReadViewerCount = i;
    }
}
