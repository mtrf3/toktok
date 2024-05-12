package com.ss.android.ugc.profile.platform.base.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class Avatar implements Serializable {

    @InterfaceC65349Pkn("avatar_larger")
    public UrlModel avatarLarger;

    @InterfaceC65349Pkn("avatar_medium")
    public UrlModel avatarMedium;

    @InterfaceC65349Pkn("avatar_meta_info")
    public AvatarMetaInfo avatarMetaInfo;

    @InterfaceC65349Pkn("avatar_thumb")
    public UrlModel avatarThumb;

    @InterfaceC65349Pkn("video_icon")
    public UrlModel avatarVideoUri;

    @InterfaceC65349Pkn("navi_id")
    public String naviId;

    public final UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public final UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public final AvatarMetaInfo getAvatarMetaInfo() {
        return this.avatarMetaInfo;
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final UrlModel getAvatarVideoUri() {
        return this.avatarVideoUri;
    }

    public final String getNaviId() {
        return this.naviId;
    }

    public final void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public final void setAvatarMedium(UrlModel urlModel) {
        this.avatarMedium = urlModel;
    }

    public final void setAvatarMetaInfo(AvatarMetaInfo avatarMetaInfo) {
        this.avatarMetaInfo = avatarMetaInfo;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setAvatarVideoUri(UrlModel urlModel) {
        this.avatarVideoUri = urlModel;
    }

    public final void setNaviId(String str) {
        this.naviId = str;
    }
}
