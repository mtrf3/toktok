package com.ss.android.ugc.aweme.friendstab.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NewContentResponse extends BaseResponse {

    @InterfaceC65349Pkn("ff_merge_feed_data")
    public final FollowFriendMergeFeedRedDotResponse followFriendMergeFeedResponse;

    @InterfaceC65349Pkn("friend_data")
    public final FriendsFeedRedDotResponse friendsFeedResponse;

    public static /* synthetic */ NewContentResponse copy$default(NewContentResponse newContentResponse, FriendsFeedRedDotResponse friendsFeedRedDotResponse, FollowFriendMergeFeedRedDotResponse followFriendMergeFeedRedDotResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            friendsFeedRedDotResponse = newContentResponse.friendsFeedResponse;
        }
        if ((i & 2) != 0) {
            followFriendMergeFeedRedDotResponse = newContentResponse.followFriendMergeFeedResponse;
        }
        return newContentResponse.copy(friendsFeedRedDotResponse, followFriendMergeFeedRedDotResponse);
    }

    public final NewContentResponse copy(FriendsFeedRedDotResponse friendsFeedRedDotResponse, FollowFriendMergeFeedRedDotResponse followFriendMergeFeedRedDotResponse) {
        return new NewContentResponse(friendsFeedRedDotResponse, followFriendMergeFeedRedDotResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewContentResponse)) {
            return false;
        }
        NewContentResponse newContentResponse = (NewContentResponse) obj;
        return o.LJ(this.friendsFeedResponse, newContentResponse.friendsFeedResponse) && o.LJ(this.followFriendMergeFeedResponse, newContentResponse.followFriendMergeFeedResponse);
    }

    public int hashCode() {
        FriendsFeedRedDotResponse friendsFeedRedDotResponse = this.friendsFeedResponse;
        int hashCode = (friendsFeedRedDotResponse == null ? 0 : friendsFeedRedDotResponse.hashCode()) * 31;
        FollowFriendMergeFeedRedDotResponse followFriendMergeFeedRedDotResponse = this.followFriendMergeFeedResponse;
        return hashCode + (followFriendMergeFeedRedDotResponse != null ? followFriendMergeFeedRedDotResponse.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewContentResponse(friendsFeedResponse=");
        LIZ.append(this.friendsFeedResponse);
        LIZ.append(", followFriendMergeFeedResponse=");
        LIZ.append(this.followFriendMergeFeedResponse);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int totalCount() {
        return tabCount("FRIENDS_FEED");
    }

    /* loaded from: classes10.dex */
    public static final class FollowFriendMergeFeedRedDotResponse extends SocialFeedRedDotResponse {

        @InterfaceC65349Pkn("content_metadata")
        public final ArrayList<ContentMetadata> contentMetadataList;

        @InterfaceC65349Pkn("live_tag")
        public final LiveTagStruct liveTagStruct;

        public final ArrayList<ContentMetadata> getContentMetadataList() {
            return this.contentMetadataList;
        }

        public final LiveTagStruct getLiveTagStruct() {
            return this.liveTagStruct;
        }
    }

    /* loaded from: classes10.dex */
    public static final class FriendsFeedRedDotResponse extends SocialFeedRedDotResponse {

        @InterfaceC65349Pkn("content_metadata")
        public final ArrayList<ContentMetadata> contentMetadataList;

        @InterfaceC65349Pkn("guide_btn_authors")
        public final ArrayList<UserNewContent> guideButtonAuthors;

        public final ArrayList<ContentMetadata> getContentMetadataList() {
            return this.contentMetadataList;
        }

        public final ArrayList<UserNewContent> getGuideButtonAuthors() {
            return this.guideButtonAuthors;
        }
    }

    public final FollowFriendMergeFeedRedDotResponse getFollowFriendMergeFeedResponse() {
        return this.followFriendMergeFeedResponse;
    }

    public final FriendsFeedRedDotResponse getFriendsFeedResponse() {
        return this.friendsFeedResponse;
    }

    public final int tabCount(String tag) {
        FollowFriendMergeFeedRedDotResponse followFriendMergeFeedRedDotResponse;
        o.LJIIIZ(tag, "tag");
        if (o.LJ(tag, "FRIENDS_FEED")) {
            FriendsFeedRedDotResponse friendsFeedRedDotResponse = this.friendsFeedResponse;
            if (friendsFeedRedDotResponse == null) {
                return 0;
            }
            return friendsFeedRedDotResponse.getRedDotCount();
        }
        if (!o.LJ(tag, "Following") || (followFriendMergeFeedRedDotResponse = this.followFriendMergeFeedResponse) == null) {
            return 0;
        }
        return followFriendMergeFeedRedDotResponse.getRedDotCount();
    }

    public final int totalCount(String tag) {
        o.LJIIIZ(tag, "tag");
        return totalCount() - tabCount(tag);
    }

    public NewContentResponse(FriendsFeedRedDotResponse friendsFeedRedDotResponse, FollowFriendMergeFeedRedDotResponse followFriendMergeFeedRedDotResponse) {
        this.friendsFeedResponse = friendsFeedRedDotResponse;
        this.followFriendMergeFeedResponse = followFriendMergeFeedRedDotResponse;
    }
}
