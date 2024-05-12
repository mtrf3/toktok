package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class MvModel implements Serializable {

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("icon_url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("is_collected")
    public boolean isCollected;

    @InterfaceC65349Pkn("is_mv_anchor")
    public int isMvAnchor;

    @InterfaceC65349Pkn("id")
    public String mvId;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("user_count")
    public Long userCount;

    public final String getDesc() {
        return this.desc;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getMvId() {
        return this.mvId;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    public final boolean isCollected() {
        return this.isCollected;
    }

    public final int isMvAnchor() {
        return this.isMvAnchor;
    }

    public final void setCollected(boolean z) {
        this.isCollected = z;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setMvAnchor(int i) {
        this.isMvAnchor = i;
    }

    public final void setMvId(String str) {
        this.mvId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUserCount(Long l) {
        this.userCount = l;
    }
}
