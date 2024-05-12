package com.ss.android.ugc.aweme.social.model;

import X.C52699KmF;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

/* loaded from: classes14.dex */
public final class MAFIMUser extends IMUser {
    public int LJLIL;

    @InterfaceC65349Pkn("friend_type_str")
    public String friendTypeStr;

    @InterfaceC65349Pkn("is_private_account")
    public boolean isPrivateAccount;

    @InterfaceC65349Pkn("mutual_relation")
    public MutualStruct mMutualStruct;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    @InterfaceC65349Pkn("social_info")
    public String socialInfo;

    @Override // com.ss.android.ugc.aweme.im.service.model.IMUser
    public final int getShareStatusDefault() {
        return ((Number) C52699KmF.LIZ.getValue()).intValue();
    }

    public final String getFriendTypeStr() {
        return this.friendTypeStr;
    }

    public final MutualStruct getMMutualStruct() {
        return this.mMutualStruct;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSocialInfo() {
        return this.socialInfo;
    }

    public final int getSortIndex() {
        return this.LJLIL;
    }

    public final boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final void setFriendTypeStr(String str) {
        this.friendTypeStr = str;
    }

    public final void setMMutualStruct(MutualStruct mutualStruct) {
        this.mMutualStruct = mutualStruct;
    }

    public final void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setSocialInfo(String str) {
        this.socialInfo = str;
    }

    public final void setSortIndex(int i) {
        this.LJLIL = i;
    }
}
