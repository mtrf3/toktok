package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class RelationLabelUser implements Serializable {

    @InterfaceC65349Pkn("avatar")
    public UrlModel avatarLarger;

    @InterfaceC65349Pkn("avatar_thumb")
    public UrlModel avatarThumb;

    @InterfaceC65349Pkn("follow_status")
    public int followStatus;

    @InterfaceC65349Pkn("uid")
    public long uid;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid = "";

    @InterfaceC65349Pkn("nickname")
    public String nickName = "";

    @InterfaceC65349Pkn("remark_name")
    public String remarkName = "";

    public final UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final long getUid() {
        return this.uid;
    }

    public final void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setRemarkName(String str) {
        this.remarkName = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(long j) {
        this.uid = j;
    }
}
