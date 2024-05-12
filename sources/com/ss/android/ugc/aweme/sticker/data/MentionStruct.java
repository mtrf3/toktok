package com.ss.android.ugc.aweme.sticker.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class MentionStruct implements Serializable {

    @InterfaceC65349Pkn("user_avatar_url")
    public UrlModel avatarUrl;

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    @InterfaceC65349Pkn("user_name")
    public String username;

    public MentionStruct() {
        this.userId = "";
        this.secUid = "";
        this.username = "";
        this.nickname = "";
    }

    public UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public MentionStruct(String str, String str2, String str3, String str4, UrlModel urlModel) {
        this.userId = str;
        this.secUid = str2;
        this.username = str3;
        this.nickname = str4;
        this.avatarUrl = urlModel;
    }
}
