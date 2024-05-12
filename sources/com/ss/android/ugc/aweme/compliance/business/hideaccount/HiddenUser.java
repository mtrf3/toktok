package com.ss.android.ugc.aweme.compliance.business.hideaccount;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HiddenUser extends F9E implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("avatar")
    public final String avatar;

    @InterfaceC65349Pkn("bio_content")
    public final String bioContent;

    @InterfaceC65349Pkn("follower_cnt")
    public final int followerCount;

    @InterfaceC65349Pkn("nick_name")
    public final String nickname;

    @InterfaceC65349Pkn("user_id")
    public final String userId;

    @InterfaceC65349Pkn("video_cnt")
    public final int videoCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HiddenUser() {
        /*
            r9 = this;
            r1 = 0
            r4 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.hideaccount.HiddenUser.<init>():void");
    }

    public static /* synthetic */ HiddenUser copy$default(HiddenUser hiddenUser, String str, String str2, String str3, int i, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hiddenUser.userId;
        }
        if ((i3 & 2) != 0) {
            str2 = hiddenUser.nickname;
        }
        if ((i3 & 4) != 0) {
            str3 = hiddenUser.avatar;
        }
        if ((i3 & 8) != 0) {
            i = hiddenUser.videoCount;
        }
        if ((i3 & 16) != 0) {
            i2 = hiddenUser.followerCount;
        }
        if ((i3 & 32) != 0) {
            str4 = hiddenUser.bioContent;
        }
        return hiddenUser.copy(str, str2, str3, i, i2, str4);
    }

    public final HiddenUser copy(String userId, String nickname, String avatar, int i, int i2, String bioContent) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(nickname, "nickname");
        o.LJIIIZ(avatar, "avatar");
        o.LJIIIZ(bioContent, "bioContent");
        return new HiddenUser(userId, nickname, avatar, i, i2, bioContent);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.userId, this.nickname, this.avatar, Integer.valueOf(this.videoCount), Integer.valueOf(this.followerCount), this.bioContent};
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getBioContent() {
        return this.bioContent;
    }

    public final int getFollowerCount() {
        return this.followerCount;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getVideoCount() {
        return this.videoCount;
    }

    public HiddenUser(String str, String str2, String str3, int i, int i2, String str4) {
        C43588H8u.LIZLLL(str, "userId", str2, "nickname", str3, "avatar", str4, "bioContent");
        this.userId = str;
        this.nickname = str2;
        this.avatar = str3;
        this.videoCount = i;
        this.followerCount = i2;
        this.bioContent = str4;
    }

    public /* synthetic */ HiddenUser(String str, String str2, String str3, int i, int i2, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) == 0 ? str4 : "");
    }
}
