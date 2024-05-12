package com.ss.android.ugc.aweme.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotRequest;
import defpackage.b0;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MultiRedDotRequest {

    @InterfaceC65349Pkn("multi_feeds")
    public final ArrayList<Integer> feeds;

    @InterfaceC65349Pkn("ff_merge_feed_new_content_request")
    public SocialFeedRedDotRequest followFriendMergeFeedRequest;

    @InterfaceC65349Pkn("friend_feed_new_content_request")
    public SocialFeedRedDotRequest friendFeedRedDotRequest;

    @InterfaceC65349Pkn("source")
    public final int source;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiRedDotRequest copy$default(MultiRedDotRequest multiRedDotRequest, SocialFeedRedDotRequest socialFeedRedDotRequest, SocialFeedRedDotRequest socialFeedRedDotRequest2, ArrayList arrayList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            socialFeedRedDotRequest = multiRedDotRequest.friendFeedRedDotRequest;
        }
        if ((i2 & 2) != 0) {
            socialFeedRedDotRequest2 = multiRedDotRequest.followFriendMergeFeedRequest;
        }
        if ((i2 & 4) != 0) {
            arrayList = multiRedDotRequest.feeds;
        }
        if ((i2 & 8) != 0) {
            i = multiRedDotRequest.source;
        }
        return multiRedDotRequest.copy(socialFeedRedDotRequest, socialFeedRedDotRequest2, arrayList, i);
    }

    public final MultiRedDotRequest copy(SocialFeedRedDotRequest socialFeedRedDotRequest, SocialFeedRedDotRequest socialFeedRedDotRequest2, ArrayList<Integer> arrayList, int i) {
        return new MultiRedDotRequest(socialFeedRedDotRequest, socialFeedRedDotRequest2, arrayList, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiRedDotRequest)) {
            return false;
        }
        MultiRedDotRequest multiRedDotRequest = (MultiRedDotRequest) obj;
        return o.LJ(this.friendFeedRedDotRequest, multiRedDotRequest.friendFeedRedDotRequest) && o.LJ(this.followFriendMergeFeedRequest, multiRedDotRequest.followFriendMergeFeedRequest) && o.LJ(this.feeds, multiRedDotRequest.feeds) && this.source == multiRedDotRequest.source;
    }

    public int hashCode() {
        SocialFeedRedDotRequest socialFeedRedDotRequest = this.friendFeedRedDotRequest;
        int hashCode = (socialFeedRedDotRequest == null ? 0 : socialFeedRedDotRequest.hashCode()) * 31;
        SocialFeedRedDotRequest socialFeedRedDotRequest2 = this.followFriendMergeFeedRequest;
        int hashCode2 = (hashCode + (socialFeedRedDotRequest2 == null ? 0 : socialFeedRedDotRequest2.hashCode())) * 31;
        ArrayList<Integer> arrayList = this.feeds;
        return ((hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31) + this.source;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiRedDotRequest(friendFeedRedDotRequest=");
        LIZ.append(this.friendFeedRedDotRequest);
        LIZ.append(", followFriendMergeFeedRequest=");
        LIZ.append(this.followFriendMergeFeedRequest);
        LIZ.append(", feeds=");
        LIZ.append(this.feeds);
        LIZ.append(", source=");
        return b0.LIZJ(LIZ, this.source, ')', LIZ);
    }

    public final ArrayList<Integer> getFeeds() {
        return this.feeds;
    }

    public final SocialFeedRedDotRequest getFollowFriendMergeFeedRequest() {
        return this.followFriendMergeFeedRequest;
    }

    public final SocialFeedRedDotRequest getFriendFeedRedDotRequest() {
        return this.friendFeedRedDotRequest;
    }

    public final int getSource() {
        return this.source;
    }

    public final void setFollowFriendMergeFeedRequest(SocialFeedRedDotRequest socialFeedRedDotRequest) {
        this.followFriendMergeFeedRequest = socialFeedRedDotRequest;
    }

    public final void setFriendFeedRedDotRequest(SocialFeedRedDotRequest socialFeedRedDotRequest) {
        this.friendFeedRedDotRequest = socialFeedRedDotRequest;
    }

    public MultiRedDotRequest(SocialFeedRedDotRequest socialFeedRedDotRequest, SocialFeedRedDotRequest socialFeedRedDotRequest2, ArrayList<Integer> arrayList, int i) {
        this.friendFeedRedDotRequest = socialFeedRedDotRequest;
        this.followFriendMergeFeedRequest = socialFeedRedDotRequest2;
        this.feeds = arrayList;
        this.source = i;
    }

    public /* synthetic */ MultiRedDotRequest(SocialFeedRedDotRequest socialFeedRedDotRequest, SocialFeedRedDotRequest socialFeedRedDotRequest2, ArrayList arrayList, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : socialFeedRedDotRequest, (i2 & 2) != 0 ? null : socialFeedRedDotRequest2, arrayList, i);
    }
}
