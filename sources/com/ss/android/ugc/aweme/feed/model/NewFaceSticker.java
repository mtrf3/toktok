package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class NewFaceSticker implements Serializable {

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("effect_id")
    public String effectId;

    @InterfaceC65349Pkn("icon_url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("owner_id")
    public String ownerId;

    @InterfaceC65349Pkn("owner_nickname")
    public String ownerNickName;

    @InterfaceC65349Pkn("user_count")
    public int userCount;

    public final String getDesc() {
        return this.desc;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerNickName() {
        return this.ownerNickName;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOwnerId(String str) {
        this.ownerId = str;
    }

    public final void setOwnerNickName(String str) {
        this.ownerNickName = str;
    }

    public final void setUserCount(int i) {
        this.userCount = i;
    }
}
