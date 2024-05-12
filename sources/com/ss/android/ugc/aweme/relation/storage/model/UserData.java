package com.ss.android.ugc.aweme.relation.storage.model;

import X.InterfaceC65349Pkn;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class UserData {
    public String LIZ;

    @InterfaceC65349Pkn("avatar_168x168")
    public final m avatar168;

    @InterfaceC65349Pkn("avatar_300x300")
    public final m avatar300;

    @InterfaceC65349Pkn("follow_status")
    public final Integer followStatus;

    @InterfaceC65349Pkn("follower_status")
    public final Integer followerStatus;

    @InterfaceC65349Pkn("is_block")
    public final Boolean isBlock;

    @InterfaceC65349Pkn("is_private_account")
    public final Boolean isPrivateAccount;

    @InterfaceC65349Pkn("secret")
    public final Integer isSecret;

    @InterfaceC65349Pkn("matched_friend")
    public final MatchedFriendStruct matchedFriendStruct;

    @InterfaceC65349Pkn("nickname")
    public final String nickname;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    /* JADX WARN: Multi-variable type inference failed */
    public UserData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    public UserData(String str, String str2, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, m mVar, m mVar2, MatchedFriendStruct matchedFriendStruct) {
        this.uid = str;
        this.nickname = str2;
        this.followStatus = num;
        this.followerStatus = num2;
        this.isBlock = bool;
        this.isPrivateAccount = bool2;
        this.isSecret = num3;
        this.avatar168 = mVar;
        this.avatar300 = mVar2;
        this.matchedFriendStruct = matchedFriendStruct;
    }

    public /* synthetic */ UserData(String str, String str2, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, m mVar, m mVar2, MatchedFriendStruct matchedFriendStruct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? Boolean.FALSE : bool2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : mVar, (i & 256) != 0 ? null : mVar2, (i & 512) == 0 ? matchedFriendStruct : null);
    }
}
