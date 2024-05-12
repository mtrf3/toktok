package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class HomePageBottomToast implements Serializable {

    @InterfaceC65349Pkn("group_id")
    public Integer groupId;

    @InterfaceC65349Pkn("icon_url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("interval")
    public Long interval;

    @InterfaceC65349Pkn("jump_url")
    public String jumpUrl;

    @InterfaceC65349Pkn("jump_url_title")
    public String jumpUrlTitle;

    @InterfaceC65349Pkn("limit")
    public Integer limit;

    @InterfaceC65349Pkn("toast")
    public String toast;

    @InterfaceC65349Pkn("toast_type")
    public Integer toastType;

    @InterfaceC65349Pkn("type_limit")
    public Integer typeLimit;

    public final Integer getGroupId() {
        return this.groupId;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final Long getInterval() {
        return this.interval;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getJumpUrlTitle() {
        return this.jumpUrlTitle;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getToast() {
        return this.toast;
    }

    public final Integer getToastType() {
        return this.toastType;
    }

    public final Integer getTypeLimit() {
        return this.typeLimit;
    }

    public final void setGroupId(Integer num) {
        this.groupId = num;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setInterval(Long l) {
        this.interval = l;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public final void setJumpUrlTitle(String str) {
        this.jumpUrlTitle = str;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setToast(String str) {
        this.toast = str;
    }

    public final void setToastType(Integer num) {
        this.toastType = num;
    }

    public final void setTypeLimit(Integer num) {
        this.typeLimit = num;
    }
}
