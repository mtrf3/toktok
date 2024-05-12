package com.ss.android.ugc.aweme.forward.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class DynamicStruct implements Serializable {

    @InterfaceC65349Pkn("aweme")
    public Aweme aweme;

    @InterfaceC65349Pkn("time")
    public long blockFavoriteTime;

    @InterfaceC65349Pkn("comment_list")
    public List<Comment> comments;

    @InterfaceC65349Pkn("favorite_ids")
    public List<String> favoriteIds;

    @InterfaceC65349Pkn("favorite_list")
    public List<Aweme> favorites;

    @InterfaceC65349Pkn("type")
    public int itemType;

    @InterfaceC65349Pkn("count")
    public int likeCount;

    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public int getItemType() {
        return this.itemType;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setBlockFavoriteTime(long j) {
        this.blockFavoriteTime = j;
    }

    public void setComments(List<Comment> list) {
        this.comments = list;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    public void setItemType(int i) {
        this.itemType = i;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setRequestId(String str) {
        Aweme aweme = this.aweme;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
    }
}
