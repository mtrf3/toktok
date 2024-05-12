package com.ss.android.ugc.aweme.follow.presenter;

import X.AbstractC49325JXl;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.follow.LastViewData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class FollowFeed extends AbstractC49325JXl {

    @InterfaceC65349Pkn("aweme")
    public Aweme aweme;
    public long blockFavoriteTime;

    @InterfaceC65349Pkn("comment_list")
    public List<Comment> commentList;
    public List<String> favoriteIds;

    @InterfaceC65349Pkn("favorite_list")
    public List<Aweme> favorites;

    @InterfaceC65349Pkn("feed_type")
    public int feedType;
    public LastViewData lastViewData;

    @InterfaceC65349Pkn("count")
    public int likeCount;

    @InterfaceC65349Pkn("like_list")
    public List<User> likeList;
    public boolean mIsMomentStyle;
    public User mRecommendUser;

    @InterfaceC65349Pkn("recommend_reason")
    public String recommendReason;

    @InterfaceC65349Pkn("cell_room")
    public RoomFeedCellStruct roomStruct;

    @InterfaceC65349Pkn("user")
    public List<User> user;

    @Override // X.AbstractC49325JXl
    public boolean needUpdateComment() {
        return true;
    }

    @Override // X.AbstractC49325JXl
    public List<Comment> getCommentList() {
        Aweme aweme;
        if (this.commentList == null || (aweme = this.aweme) == null || !aweme.getAwemeControl().canShowComment()) {
            this.commentList = new ArrayList();
        }
        return this.commentList;
    }

    @Override // X.AbstractC49325JXl
    public int getFeedType() {
        int i = this.feedType;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return i;
                    }
                    return 65298;
                }
                return 65281;
            }
            return 65280;
        }
        return 65288;
    }

    public FollowFeed() {
    }

    @Override // X.AbstractC49325JXl
    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public LastViewData getLastViewData() {
        return this.lastViewData;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    @Override // X.AbstractC49325JXl
    public List<User> getLikeList() {
        return this.likeList;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public User getRecommendUser() {
        return this.mRecommendUser;
    }

    public RoomFeedCellStruct getRoomStruct() {
        return this.roomStruct;
    }

    public List<User> getUser() {
        return this.user;
    }

    public boolean isMomentStyle() {
        return this.mIsMomentStyle;
    }

    public FollowFeed(Aweme aweme) {
        this.feedType = 65280;
        this.aweme = aweme;
        this.commentList = new ArrayList();
    }

    public static FollowFeed createLastWatchHistoryItem(LastViewData lastViewData) {
        FollowFeed followFeed = new FollowFeed();
        followFeed.setFeedType(65297);
        followFeed.setLastViewData(lastViewData);
        return followFeed;
    }

    @Override // X.AbstractC49325JXl
    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setBlockFavoriteTime(long j) {
        this.blockFavoriteTime = j;
    }

    @Override // X.AbstractC49325JXl
    public void setCommentList(List<Comment> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.commentList = list;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    @Override // X.AbstractC49325JXl
    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setIsMomentStyle(boolean z) {
        this.mIsMomentStyle = z;
    }

    public void setLastViewData(LastViewData lastViewData) {
        this.lastViewData = lastViewData;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setLikeList(List<User> list) {
        this.likeList = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendUser(User user) {
        this.mRecommendUser = user;
    }

    @Override // X.AbstractC49325JXl, X.InterfaceC65316PkG
    public void setRequestId(String str) {
        super.setRequestId(str);
        Aweme aweme = this.aweme;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
    }

    public void setRoomStruct(RoomFeedCellStruct roomFeedCellStruct) {
        this.roomStruct = roomFeedCellStruct;
    }

    public void setUser(List<User> list) {
        this.user = list;
    }
}
