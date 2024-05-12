package com.ss.android.ugc.aweme.now;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UserNowPost implements Serializable {

    @InterfaceC65349Pkn("collection_type")
    public final Integer collectionType;

    @InterfaceC65349Pkn("has_more_after")
    public final Boolean hasMoreAfter;

    @InterfaceC65349Pkn("has_more_before")
    public final Boolean hasMoreBefore;

    @InterfaceC65349Pkn("next_cursor")
    public final Long nextCursor;

    @InterfaceC65349Pkn("now_posts")
    public List<Aweme> nowPosts;

    @InterfaceC65349Pkn("position")
    public final Integer position;

    @InterfaceC65349Pkn("pre_cursor")
    public final Long preCursor;

    @InterfaceC65349Pkn("total_count")
    public final Integer totalCount;

    /* JADX WARN: Multi-variable type inference failed */
    public UserNowPost() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserNowPost copy$default(UserNowPost userNowPost, List list, Integer num, Long l, Long l2, Boolean bool, Boolean bool2, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userNowPost.nowPosts;
        }
        if ((i & 2) != 0) {
            num = userNowPost.totalCount;
        }
        if ((i & 4) != 0) {
            l = userNowPost.nextCursor;
        }
        if ((i & 8) != 0) {
            l2 = userNowPost.preCursor;
        }
        if ((i & 16) != 0) {
            bool = userNowPost.hasMoreBefore;
        }
        if ((i & 32) != 0) {
            bool2 = userNowPost.hasMoreAfter;
        }
        if ((i & 64) != 0) {
            num2 = userNowPost.position;
        }
        if ((i & 128) != 0) {
            num3 = userNowPost.collectionType;
        }
        return userNowPost.copy(list, num, l, l2, bool, bool2, num2, num3);
    }

    public final UserNowPost copy(List<Aweme> list, Integer num, Long l, Long l2, Boolean bool, Boolean bool2, Integer num2, Integer num3) {
        return new UserNowPost(list, num, l, l2, bool, bool2, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserNowPost)) {
            return false;
        }
        UserNowPost userNowPost = (UserNowPost) obj;
        return o.LJ(this.nowPosts, userNowPost.nowPosts) && o.LJ(this.totalCount, userNowPost.totalCount) && o.LJ(this.nextCursor, userNowPost.nextCursor) && o.LJ(this.preCursor, userNowPost.preCursor) && o.LJ(this.hasMoreBefore, userNowPost.hasMoreBefore) && o.LJ(this.hasMoreAfter, userNowPost.hasMoreAfter) && o.LJ(this.position, userNowPost.position) && o.LJ(this.collectionType, userNowPost.collectionType);
    }

    public int hashCode() {
        List<Aweme> list = this.nowPosts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.totalCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.nextCursor;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.preCursor;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.hasMoreBefore;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasMoreAfter;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.position;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.collectionType;
        return hashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserNowPost(nowPosts=");
        LIZ.append(this.nowPosts);
        LIZ.append(", totalCount=");
        LIZ.append(this.totalCount);
        LIZ.append(", nextCursor=");
        LIZ.append(this.nextCursor);
        LIZ.append(", preCursor=");
        LIZ.append(this.preCursor);
        LIZ.append(", hasMoreBefore=");
        LIZ.append(this.hasMoreBefore);
        LIZ.append(", hasMoreAfter=");
        LIZ.append(this.hasMoreAfter);
        LIZ.append(", position=");
        LIZ.append(this.position);
        LIZ.append(", collectionType=");
        return s0.LIZJ(LIZ, this.collectionType, ')', LIZ);
    }

    public final Integer getCollectionType() {
        return this.collectionType;
    }

    public final Boolean getHasMoreAfter() {
        return this.hasMoreAfter;
    }

    public final Boolean getHasMoreBefore() {
        return this.hasMoreBefore;
    }

    public final Long getNextCursor() {
        return this.nextCursor;
    }

    public final List<Aweme> getNowPosts() {
        return this.nowPosts;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final Long getPreCursor() {
        return this.preCursor;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final void setNowPosts(List<Aweme> list) {
        this.nowPosts = list;
    }

    public UserNowPost(List<Aweme> list, Integer num, Long l, Long l2, Boolean bool, Boolean bool2, Integer num2, Integer num3) {
        this.nowPosts = list;
        this.totalCount = num;
        this.nextCursor = l;
        this.preCursor = l2;
        this.hasMoreBefore = bool;
        this.hasMoreAfter = bool2;
        this.position = num2;
        this.collectionType = num3;
    }

    public /* synthetic */ UserNowPost(List list, Integer num, Long l, Long l2, Boolean bool, Boolean bool2, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : num2, (i & 128) == 0 ? num3 : null);
    }
}
