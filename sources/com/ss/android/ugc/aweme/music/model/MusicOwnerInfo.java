package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class MusicOwnerInfo implements Serializable {

    @InterfaceC65349Pkn("avatar")
    public UrlModel avatar;

    @InterfaceC65349Pkn("enter_type")
    public int enterType;

    @InterfaceC65349Pkn("follow_status")
    public Integer followStatus;

    @InterfaceC65349Pkn("follower_status")
    public Integer followerStatus;

    @InterfaceC65349Pkn("handle")
    public String handle;

    @InterfaceC65349Pkn("is_block")
    public boolean isBlock;

    @InterfaceC65349Pkn("is_blocked")
    public boolean isBlocked;

    @InterfaceC65349Pkn("is_private_account")
    public boolean isPrivateAccount;

    @InterfaceC65349Pkn("nick_name")
    public String nickName;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    @InterfaceC65349Pkn("is_visible")
    public boolean showArtistProfileBtn;

    @InterfaceC65349Pkn("status")
    public Integer status;

    @InterfaceC65349Pkn("uid")
    public String uid;

    @InterfaceC65349Pkn("is_verified")
    public boolean verified;

    /* loaded from: classes4.dex */
    public interface ArtistType {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* loaded from: classes4.dex */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        }
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final int getEnterType() {
        return this.enterType;
    }

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowerStatus() {
        return this.followerStatus;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final boolean getShowArtistProfileBtn() {
        return this.showArtistProfileBtn;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public final boolean isBlock() {
        return this.isBlock;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setBlock(boolean z) {
        this.isBlock = z;
    }

    public final void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public final void setEnterType(int i) {
        this.enterType = i;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setFollowerStatus(Integer num) {
        this.followerStatus = num;
    }

    public final void setHandle(String str) {
        this.handle = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setShowArtistProfileBtn(boolean z) {
        this.showArtistProfileBtn = z;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setVerified(boolean z) {
        this.verified = z;
    }
}
