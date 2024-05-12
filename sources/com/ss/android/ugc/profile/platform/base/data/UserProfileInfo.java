package com.ss.android.ugc.profile.platform.base.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public final class UserProfileInfo implements Serializable {

    @InterfaceC65349Pkn("avatar")
    public Avatar avatar;

    @InterfaceC65349Pkn("bold_fields")
    public List<String> boldFields;

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("register_time")
    public Long registerTime;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    @InterfaceC65349Pkn("uid")
    public String uid;

    @InterfaceC65349Pkn("username")
    public String username;

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final List<String> getBoldFields() {
        return this.boldFields;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final Long getRegisterTime() {
        return this.registerTime;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public final void setBoldFields(List<String> list) {
        this.boldFields = list;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setRegisterTime(Long l) {
        this.registerTime = l;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }
}
