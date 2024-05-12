package com.ss.android.ugc.profile.platform.business.header.business.bio.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* loaded from: classes5.dex */
public final class BioRelationLabelData extends BizBaseData {

    @InterfaceC65349Pkn("matched_friend")
    public MatchedFriendStruct matchedFriend;

    public final MatchedFriendStruct getMatchedFriend() {
        return this.matchedFriend;
    }

    public final void setMatchedFriend(MatchedFriendStruct matchedFriendStruct) {
        this.matchedFriend = matchedFriendStruct;
    }
}
