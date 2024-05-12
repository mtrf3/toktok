package com.ss.android.ugc.aweme.friends.model;

import X.HH1;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class MutualUser implements Serializable {

    @InterfaceC65349Pkn("avatar_medium")
    public UrlModel avatarMedium;

    @InterfaceC65349Pkn("avatar_thumb")
    public UrlModel avatarThumb;

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    @InterfaceC65349Pkn("user_id")
    public String uid;

    public MutualUser() {
    }

    public int hashCode() {
        return Objects.hash(this.secUid, this.nickname);
    }

    public final UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MutualUser)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Objects.equals(this.secUid, this.nickname);
    }

    public MutualUser(String str, String str2, UrlModel urlModel, UrlModel urlModel2, String str3) {
        HH1.LIZ(str, "secUid", str2, "nickname", str3, "uid");
        this.secUid = str;
        this.nickname = str2;
        this.avatarMedium = urlModel;
        this.avatarThumb = urlModel2;
        this.uid = str3;
    }

    public /* synthetic */ MutualUser(String str, String str2, UrlModel urlModel, UrlModel urlModel2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, urlModel, (i & 8) != 0 ? null : urlModel2, (i & 16) != 0 ? "" : str3);
    }
}
