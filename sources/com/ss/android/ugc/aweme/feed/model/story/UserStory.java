package com.ss.android.ugc.aweme.feed.model.story;

import X.C08880Wm;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserStory extends BaseResponse implements Serializable {
    public long addToCacheTime;

    @InterfaceC65349Pkn("all_viewed")
    public boolean allViewed;
    public UserStoryCurrentInfo currentInfo;

    @InterfaceC65349Pkn("current_position")
    public long currentPosition;
    public boolean fakeAwemeShell;
    public boolean fakeSelfStoryCollection;
    public int firstUnViewedStoryIdx;

    @InterfaceC65349Pkn("has_more_after")
    public boolean hasMoreAfter;

    @InterfaceC65349Pkn("has_more_before")
    public boolean hasMoreBefore;

    @InterfaceC65349Pkn("is_post_style")
    public boolean isPostStyle;

    @InterfaceC65349Pkn("is_story_guide_card")
    public boolean isStoryGuideCard;

    @InterfaceC65349Pkn("last_story_created_at")
    public long lastStoryCreatedAt;

    @InterfaceC65349Pkn("max_cursor")
    public long maxCursor;
    public UserStoryCurrentInfo maxViewedInfo;

    @InterfaceC65349Pkn("story_lite_meta_data")
    public List<StoryLiteMetaData> metaDataList;

    @InterfaceC65349Pkn("min_cursor")
    public long minCursor;
    public long originTotalCount;
    public boolean shouldStartFromUnViewedStoryIdx;

    @InterfaceC65349Pkn("stories")
    public List<Aweme> stories;

    @InterfaceC65349Pkn("total_count")
    public long totalCount;

    public UserStory() {
    }

    public static /* synthetic */ UserStory copy$default(UserStory userStory, List list, long j, long j2, boolean z, long j3, long j4, boolean z2, boolean z3, long j5, boolean z4, List list2, boolean z5, long j6, UserStoryCurrentInfo userStoryCurrentInfo, boolean z6, boolean z7, UserStoryCurrentInfo userStoryCurrentInfo2, int i, boolean z8, int i2, Object obj) {
        List list3 = list;
        long j7 = j;
        long j8 = j5;
        boolean z9 = z;
        long j9 = j2;
        boolean z10 = z2;
        long j10 = j3;
        long j11 = j4;
        boolean z11 = z3;
        int i3 = i;
        UserStoryCurrentInfo userStoryCurrentInfo3 = userStoryCurrentInfo2;
        boolean z12 = z7;
        List list4 = list2;
        long j12 = j6;
        boolean z13 = z6;
        boolean z14 = z8;
        boolean z15 = z5;
        boolean z16 = z4;
        UserStoryCurrentInfo userStoryCurrentInfo4 = userStoryCurrentInfo;
        if ((i2 & 1) != 0) {
            list3 = userStory.stories;
        }
        if ((i2 & 2) != 0) {
            j7 = userStory.totalCount;
        }
        if ((i2 & 4) != 0) {
            j9 = userStory.currentPosition;
        }
        if ((i2 & 8) != 0) {
            z9 = userStory.allViewed;
        }
        if ((i2 & 16) != 0) {
            j10 = userStory.minCursor;
        }
        if ((i2 & 32) != 0) {
            j11 = userStory.maxCursor;
        }
        if ((i2 & 64) != 0) {
            z10 = userStory.hasMoreAfter;
        }
        if ((i2 & 128) != 0) {
            z11 = userStory.hasMoreBefore;
        }
        if ((i2 & 256) != 0) {
            j8 = userStory.lastStoryCreatedAt;
        }
        if ((i2 & 512) != 0) {
            z16 = userStory.isPostStyle;
        }
        if ((i2 & 1024) != 0) {
            list4 = userStory.metaDataList;
        }
        if ((i2 & 2048) != 0) {
            z15 = userStory.isStoryGuideCard;
        }
        if ((i2 & 4096) != 0) {
            j12 = userStory.originTotalCount;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            userStoryCurrentInfo4 = userStory.currentInfo;
        }
        if ((i2 & 16384) != 0) {
            z13 = userStory.fakeSelfStoryCollection;
        }
        if ((32768 & i2) != 0) {
            z12 = userStory.fakeAwemeShell;
        }
        if ((65536 & i2) != 0) {
            userStoryCurrentInfo3 = userStory.maxViewedInfo;
        }
        if ((131072 & i2) != 0) {
            i3 = userStory.firstUnViewedStoryIdx;
        }
        if ((i2 & 262144) != 0) {
            z14 = userStory.shouldStartFromUnViewedStoryIdx;
        }
        boolean z17 = z14;
        return userStory.copy(list3, j7, j9, z9, j10, j11, z10, z11, j8, z16, list4, z15, j12, userStoryCurrentInfo4, z13, z12, userStoryCurrentInfo3, i3, z17);
    }

    public final UserStory copy(List<Aweme> stories, long j, long j2, boolean z, long j3, long j4, boolean z2, boolean z3, long j5, boolean z4, List<StoryLiteMetaData> list, boolean z5, long j6, UserStoryCurrentInfo userStoryCurrentInfo, boolean z6, boolean z7, UserStoryCurrentInfo userStoryCurrentInfo2, int i, boolean z8) {
        o.LJIIIZ(stories, "stories");
        return new UserStory(stories, j, j2, z, j3, j4, z2, z3, j5, z4, list, z5, j6, userStoryCurrentInfo, z6, z7, userStoryCurrentInfo2, i, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStory)) {
            return false;
        }
        UserStory userStory = (UserStory) obj;
        return o.LJ(this.stories, userStory.stories) && this.totalCount == userStory.totalCount && this.currentPosition == userStory.currentPosition && this.allViewed == userStory.allViewed && this.minCursor == userStory.minCursor && this.maxCursor == userStory.maxCursor && this.hasMoreAfter == userStory.hasMoreAfter && this.hasMoreBefore == userStory.hasMoreBefore && this.lastStoryCreatedAt == userStory.lastStoryCreatedAt && this.isPostStyle == userStory.isPostStyle && o.LJ(this.metaDataList, userStory.metaDataList) && this.isStoryGuideCard == userStory.isStoryGuideCard && this.originTotalCount == userStory.originTotalCount && o.LJ(this.currentInfo, userStory.currentInfo) && this.fakeSelfStoryCollection == userStory.fakeSelfStoryCollection && this.fakeAwemeShell == userStory.fakeAwemeShell && o.LJ(this.maxViewedInfo, userStory.maxViewedInfo) && this.firstUnViewedStoryIdx == userStory.firstUnViewedStoryIdx && this.shouldStartFromUnViewedStoryIdx == userStory.shouldStartFromUnViewedStoryIdx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.currentPosition, JBR.LIZJ(this.totalCount, this.stories.hashCode() * 31, 31), 31);
        boolean z = this.allViewed;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LIZJ2 = JBR.LIZJ(this.maxCursor, JBR.LIZJ(this.minCursor, (LIZJ + i2) * 31, 31), 31);
        boolean z2 = this.hasMoreAfter;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (LIZJ2 + i3) * 31;
        boolean z3 = this.hasMoreBefore;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int LIZJ3 = JBR.LIZJ(this.lastStoryCreatedAt, (i4 + i5) * 31, 31);
        boolean z4 = this.isPostStyle;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (LIZJ3 + i6) * 31;
        List<StoryLiteMetaData> list = this.metaDataList;
        int i8 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        boolean z5 = this.isStoryGuideCard;
        int i10 = z5;
        if (z5 != 0) {
            i10 = 1;
        }
        int LIZJ4 = JBR.LIZJ(this.originTotalCount, (i9 + i10) * 31, 31);
        UserStoryCurrentInfo userStoryCurrentInfo = this.currentInfo;
        if (userStoryCurrentInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = userStoryCurrentInfo.hashCode();
        }
        int i11 = (LIZJ4 + hashCode2) * 31;
        boolean z6 = this.fakeSelfStoryCollection;
        int i12 = z6;
        if (z6 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z7 = this.fakeAwemeShell;
        int i14 = z7;
        if (z7 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        UserStoryCurrentInfo userStoryCurrentInfo2 = this.maxViewedInfo;
        if (userStoryCurrentInfo2 != null) {
            i8 = userStoryCurrentInfo2.hashCode();
        }
        int i16 = (((i15 + i8) * 31) + this.firstUnViewedStoryIdx) * 31;
        if (!this.shouldStartFromUnViewedStoryIdx) {
            i = 0;
        }
        return i16 + i;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sb = new StringBuilder("UserStory(stories=");
        sb.append(this.stories);
        sb.append(", totalCount=");
        sb.append(this.totalCount);
        sb.append(", currentPosition=");
        sb.append(this.currentPosition);
        sb.append(", allViewed=");
        sb.append(this.allViewed);
        sb.append(", minCursor=");
        sb.append(this.minCursor);
        sb.append(", maxCursor=");
        sb.append(this.maxCursor);
        sb.append(", hasMoreAfter=");
        sb.append(this.hasMoreAfter);
        sb.append(", hasMoreBefore=");
        sb.append(this.hasMoreBefore);
        sb.append(", lastStoryCreatedAt=");
        sb.append(this.lastStoryCreatedAt);
        sb.append(", isPostStyle=");
        sb.append(this.isPostStyle);
        sb.append(", metaDataList=");
        sb.append(this.metaDataList);
        sb.append(", isStoryGuideCard=");
        sb.append(this.isStoryGuideCard);
        sb.append(", originTotalCount=");
        sb.append(this.originTotalCount);
        sb.append(", currentInfo=");
        sb.append(this.currentInfo);
        sb.append(", fakeSelfStoryCollection=");
        sb.append(this.fakeSelfStoryCollection);
        sb.append(", fakeAwemeShell=");
        sb.append(this.fakeAwemeShell);
        sb.append(", maxViewedInfo=");
        sb.append(this.maxViewedInfo);
        sb.append(", firstUnViewedStoryIdx=");
        sb.append(this.firstUnViewedStoryIdx);
        sb.append(", shouldStartFromUnViewedStoryIdx=");
        return C08880Wm.LIZJ(sb, this.shouldStartFromUnViewedStoryIdx, ')');
    }

    public final long getAddToCacheTime() {
        return this.addToCacheTime;
    }

    public final boolean getAllViewed() {
        return this.allViewed;
    }

    public final UserStoryCurrentInfo getCurrentInfo() {
        return this.currentInfo;
    }

    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    public final boolean getFakeAwemeShell() {
        return this.fakeAwemeShell;
    }

    public final boolean getFakeSelfStoryCollection() {
        return this.fakeSelfStoryCollection;
    }

    public final int getFirstUnViewedStoryIdx() {
        return this.firstUnViewedStoryIdx;
    }

    public final boolean getHasMoreAfter() {
        return this.hasMoreAfter;
    }

    public final boolean getHasMoreBefore() {
        return this.hasMoreBefore;
    }

    public final long getLastStoryCreatedAt() {
        return this.lastStoryCreatedAt;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final UserStoryCurrentInfo getMaxViewedInfo() {
        return this.maxViewedInfo;
    }

    public final List<StoryLiteMetaData> getMetaDataList() {
        return this.metaDataList;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public final long getOriginTotalCount() {
        return this.originTotalCount;
    }

    public final boolean getShouldStartFromUnViewedStoryIdx() {
        return this.shouldStartFromUnViewedStoryIdx;
    }

    public final List<Aweme> getStories() {
        return this.stories;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }

    public final boolean isPostStyle() {
        return this.isPostStyle;
    }

    public final boolean isStoryGuideCard() {
        return this.isStoryGuideCard;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r7.allViewed == r8.allViewed) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r3 = r7.currentInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r8 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r0 = r8.currentInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, r0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r3.getDispatchCode() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$4.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r8 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r7.minCursor != r8.minCursor) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r7.maxCursor != r8.maxCursor) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r7.totalCount != r8.totalCount) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7.originTotalCount != r8.originTotalCount) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r7.hasMoreAfter != r8.hasMoreAfter) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r7.hasMoreBefore != r8.hasMoreBefore) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r7.lastStoryCreatedAt != r8.lastStoryCreatedAt) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r7.fakeSelfStoryCollection != r8.fakeSelfStoryCollection) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        r0 = r7.metaDataList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        if (r8 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        r2 = r8.metaDataList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, r2) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$13.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c6, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$12.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$11.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c3, code lost:
    
        if (r8 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$10.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
    
        if (r8 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$9.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b3, code lost:
    
        if (r8 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$8.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ab, code lost:
    
        if (r8 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$7.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
    
        if (r8 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0096, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$6.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        if (r8 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008e, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$5.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0093, code lost:
    
        if (r8 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cc, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d8, code lost:
    
        r1.add(com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$3.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d4, code lost:
    
        if (r8 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.TBW<com.ss.android.ugc.aweme.feed.model.story.UserStory, ?>> diffProperties(com.ss.android.ugc.aweme.feed.model.story.UserStory r8) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.story.UserStory.diffProperties(com.ss.android.ugc.aweme.feed.model.story.UserStory):java.util.List");
    }

    public final int getNextStoryIndex(int i) {
        int i2;
        Integer currentIndex;
        UserStoryCurrentInfo userStoryCurrentInfo = this.maxViewedInfo;
        if (userStoryCurrentInfo != null && (currentIndex = userStoryCurrentInfo.getCurrentIndex()) != null) {
            i2 = currentIndex.intValue();
        } else {
            i2 = 0;
        }
        int max = Math.max(i2, i);
        int i3 = max + 1;
        long j = i3;
        long j2 = this.totalCount;
        if (j < j2) {
            return i3;
        }
        if (max < j2) {
            return max;
        }
        return i3;
    }

    public final void setAddToCacheTime(long j) {
        if (this.addToCacheTime > 0) {
            return;
        }
        this.addToCacheTime = j;
    }

    public final void setAllViewed(boolean z) {
        this.allViewed = z;
    }

    public final void setCurrentInfo(UserStoryCurrentInfo userStoryCurrentInfo) {
        this.currentInfo = userStoryCurrentInfo;
    }

    public final void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public final void setFirstUnViewedStoryIdx(int i) {
        this.firstUnViewedStoryIdx = i;
    }

    public final void setHasMoreAfter(boolean z) {
        this.hasMoreAfter = z;
    }

    public final void setHasMoreBefore(boolean z) {
        this.hasMoreBefore = z;
    }

    public final void setLastStoryCreatedAt(long j) {
        this.lastStoryCreatedAt = j;
    }

    public final void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public final void setMaxViewedInfo(UserStoryCurrentInfo userStoryCurrentInfo) {
        this.maxViewedInfo = userStoryCurrentInfo;
    }

    public final void setMinCursor(long j) {
        this.minCursor = j;
    }

    public final void setOriginTotalCount(long j) {
        this.originTotalCount = j;
    }

    public final void setPostStyle(boolean z) {
        this.isPostStyle = z;
    }

    public final void setShouldStartFromUnViewedStoryIdx(boolean z) {
        this.shouldStartFromUnViewedStoryIdx = z;
    }

    public final void setStoryGuideCard(boolean z) {
        this.isStoryGuideCard = z;
    }

    public final void setTotalCount(long j) {
        this.totalCount = j;
    }

    public UserStory(List<Aweme> stories, long j, long j2, boolean z, long j3, long j4, boolean z2, boolean z3, long j5, boolean z4, List<StoryLiteMetaData> list, boolean z5, long j6, UserStoryCurrentInfo userStoryCurrentInfo, boolean z6, boolean z7, UserStoryCurrentInfo userStoryCurrentInfo2, int i, boolean z8) {
        o.LJIIIZ(stories, "stories");
        this.stories = stories;
        this.totalCount = j;
        this.currentPosition = j2;
        this.allViewed = z;
        this.minCursor = j3;
        this.maxCursor = j4;
        this.hasMoreAfter = z2;
        this.hasMoreBefore = z3;
        this.lastStoryCreatedAt = j5;
        this.isPostStyle = z4;
        this.metaDataList = list;
        this.isStoryGuideCard = z5;
        this.originTotalCount = j6;
        this.currentInfo = userStoryCurrentInfo;
        this.fakeSelfStoryCollection = z6;
        this.fakeAwemeShell = z7;
        this.maxViewedInfo = userStoryCurrentInfo2;
        this.firstUnViewedStoryIdx = i;
        this.shouldStartFromUnViewedStoryIdx = z8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UserStory(java.util.List r36, long r37, long r39, boolean r41, long r42, long r44, boolean r46, boolean r47, long r48, boolean r50, java.util.List r51, boolean r52, long r53, com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo r55, boolean r56, boolean r57, com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo r58, int r59, boolean r60, int r61, kotlin.jvm.internal.DefaultConstructorMarker r62) {
        /*
            r35 = this;
            r28 = r60
            r0 = r61
            r12 = r44
            r10 = r42
            r14 = r46
            r24 = r56
            r9 = r41
            r23 = r55
            r16 = r48
            r18 = r50
            r15 = r47
            r19 = r51
            r20 = r52
            r21 = r53
            r26 = r58
            r25 = r57
            r7 = r39
            r2 = r59
            r1 = r0 & 4
            if (r1 == 0) goto L2a
            r7 = 0
        L2a:
            r1 = r0 & 8
            if (r1 == 0) goto L2f
            r9 = 0
        L2f:
            r1 = r0 & 16
            if (r1 == 0) goto L35
            r10 = 0
        L35:
            r1 = r0 & 32
            if (r1 == 0) goto L3b
            r12 = 0
        L3b:
            r1 = r0 & 64
            if (r1 == 0) goto L40
            r14 = 0
        L40:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L45
            r15 = 0
        L45:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4b
            r16 = 0
        L4b:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L51
            r18 = 0
        L51:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L57
            r19 = 0
        L57:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5d
            r20 = 0
        L5d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L63
            r21 = 0
        L63:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L78
            com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo r23 = new com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo
            r30 = 0
            r32 = 0
            r33 = 7
            r29 = r23
            r31 = r30
            r34 = r30
            r29.<init>(r30, r31, r32, r33, r34)
        L78:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L7e
            r24 = 0
        L7e:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L86
            r25 = 0
        L86:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L9f
            com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo r26 = new com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo
            r1 = -1
            java.lang.Integer r30 = java.lang.Integer.valueOf(r1)
            r31 = 0
            r32 = 0
            r33 = 6
            r29 = r26
            r34 = r31
            r29.<init>(r30, r31, r32, r33, r34)
        L9f:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto La5
            int r2 = (int) r7
        La5:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto Lac
            r28 = 0
        Lac:
            r4 = r36
            r3 = r35
            r5 = r37
            r27 = r2
            r3.<init>(r4, r5, r7, r9, r10, r12, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.story.UserStory.<init>(java.util.List, long, long, boolean, long, long, boolean, boolean, long, boolean, java.util.List, boolean, long, com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo, boolean, boolean, com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
