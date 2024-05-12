package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC56676MMe;
import X.C3ML;
import X.C53339KwZ;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightFriendPostResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxHorizontalTopListCombinePod extends AbstractC56676MMe implements Serializable {
    public transient Long LJLIL;
    public boolean LJLILLLLZI;
    public final SkylightDataResponse LJLJI;
    public final OnThisDayResponse LJLJJI;
    public final SkylightFriendPostResponse LJLJJL;

    @InterfaceC65349Pkn("cache_time")
    public final long cacheTime;

    @InterfaceC65349Pkn("live_notices")
    public final List<CombineLiveNotice> liveNotices;

    @InterfaceC65349Pkn("story_response")
    public final StoryGetFeedByPageResponse storyGetFeedByPageResponse;

    public InboxHorizontalTopListCombinePod() {
        this(null, null, null, 0L, false, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InboxHorizontalTopListCombinePod copy$default(InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod, List list, Long l, StoryGetFeedByPageResponse storyGetFeedByPageResponse, long j, boolean z, SkylightDataResponse skylightDataResponse, OnThisDayResponse onThisDayResponse, SkylightFriendPostResponse skylightFriendPostResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            list = inboxHorizontalTopListCombinePod.liveNotices;
        }
        if ((i & 2) != 0) {
            l = inboxHorizontalTopListCombinePod.LJLIL;
        }
        if ((i & 4) != 0) {
            storyGetFeedByPageResponse = inboxHorizontalTopListCombinePod.storyGetFeedByPageResponse;
        }
        if ((i & 8) != 0) {
            j = inboxHorizontalTopListCombinePod.cacheTime;
        }
        if ((i & 16) != 0) {
            z = inboxHorizontalTopListCombinePod.LJLILLLLZI;
        }
        if ((i & 32) != 0) {
            skylightDataResponse = inboxHorizontalTopListCombinePod.LJLJI;
        }
        if ((i & 64) != 0) {
            onThisDayResponse = inboxHorizontalTopListCombinePod.LJLJJI;
        }
        if ((i & 128) != 0) {
            skylightFriendPostResponse = inboxHorizontalTopListCombinePod.LJLJJL;
        }
        return inboxHorizontalTopListCombinePod.copy(list, l, storyGetFeedByPageResponse, j, z, skylightDataResponse, onThisDayResponse, skylightFriendPostResponse);
    }

    public final InboxHorizontalTopListCombinePod copy(List<CombineLiveNotice> liveNotices, Long l, StoryGetFeedByPageResponse storyGetFeedByPageResponse, long j, boolean z, SkylightDataResponse skylightDataResponse, OnThisDayResponse onThisDayResponse, SkylightFriendPostResponse skylightFriendPostResponse) {
        o.LJIIIZ(liveNotices, "liveNotices");
        return new InboxHorizontalTopListCombinePod(liveNotices, l, storyGetFeedByPageResponse, j, z, skylightDataResponse, onThisDayResponse, skylightFriendPostResponse);
    }

    @Override // X.AbstractC56676MMe
    public boolean isUnread() {
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InboxHorizontalTopListCombinePod(liveNotices=");
        LIZ.append(this.liveNotices);
        LIZ.append(", liveResponseTime=");
        LIZ.append(this.LJLIL);
        LIZ.append(", storyGetFeedByPageResponse=");
        LIZ.append(this.storyGetFeedByPageResponse);
        LIZ.append(", cacheTime=");
        LIZ.append(this.cacheTime);
        LIZ.append(", isDefault=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", skylightData=");
        LIZ.append(this.LJLJI);
        LIZ.append(", onThisDayData=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", friendsPost=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC56676MMe
    public C3ML convertToInboxEntranceWrapper$awemenotice_release() {
        return new C3ML(600, 0L, this.type, isUnread(), this);
    }

    @Override // X.AbstractC56676MMe
    public int hashCode() {
        int i;
        int hashCode = super.hashCode();
        StoryGetFeedByPageResponse storyGetFeedByPageResponse = this.storyGetFeedByPageResponse;
        if (storyGetFeedByPageResponse != null) {
            i = storyGetFeedByPageResponse.hashCode();
        } else {
            i = 0;
        }
        return this.liveNotices.hashCode() + hashCode + i;
    }

    public final long getCacheTime() {
        return this.cacheTime;
    }

    public final SkylightFriendPostResponse getFriendsPost() {
        return this.LJLJJL;
    }

    public final List<CombineLiveNotice> getLiveNotices() {
        return this.liveNotices;
    }

    public final Long getLiveResponseTime() {
        return this.LJLIL;
    }

    public final OnThisDayResponse getOnThisDayData() {
        return this.LJLJJI;
    }

    public final SkylightDataResponse getSkylightData() {
        return this.LJLJI;
    }

    public final StoryGetFeedByPageResponse getStoryGetFeedByPageResponse() {
        return this.storyGetFeedByPageResponse;
    }

    public final boolean isDefault() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC56676MMe
    public boolean equals(Object obj) {
        if (C53339KwZ.LIZJ()) {
            if (!super.equals(obj) || !(obj instanceof InboxHorizontalTopListCombinePod)) {
                return false;
            }
            InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = (InboxHorizontalTopListCombinePod) obj;
            if (!o.LJ(this.liveNotices, inboxHorizontalTopListCombinePod.liveNotices) || !o.LJ(this.storyGetFeedByPageResponse, inboxHorizontalTopListCombinePod.storyGetFeedByPageResponse) || !o.LJ(this.LJLJJL, inboxHorizontalTopListCombinePod.LJLJJL) || !o.LJ(this.LJLJJI, inboxHorizontalTopListCombinePod.LJLJJI)) {
                return false;
            }
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof InboxHorizontalTopListCombinePod)) {
            return false;
        }
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod2 = (InboxHorizontalTopListCombinePod) obj;
        if (this.liveNotices != inboxHorizontalTopListCombinePod2.liveNotices || this.storyGetFeedByPageResponse != inboxHorizontalTopListCombinePod2.storyGetFeedByPageResponse || this.LJLJI != inboxHorizontalTopListCombinePod2.LJLJI || this.LJLJJI != inboxHorizontalTopListCombinePod2.LJLJJI) {
            return false;
        }
        return true;
    }

    public final void setDefault(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setLiveResponseTime(Long l) {
        this.LJLIL = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxHorizontalTopListCombinePod(List<CombineLiveNotice> liveNotices, Long l, StoryGetFeedByPageResponse storyGetFeedByPageResponse, long j, boolean z, SkylightDataResponse skylightDataResponse, OnThisDayResponse onThisDayResponse, SkylightFriendPostResponse skylightFriendPostResponse) {
        super(9);
        o.LJIIIZ(liveNotices, "liveNotices");
        this.liveNotices = liveNotices;
        this.LJLIL = l;
        this.storyGetFeedByPageResponse = storyGetFeedByPageResponse;
        this.cacheTime = j;
        this.LJLILLLLZI = z;
        this.LJLJI = skylightDataResponse;
        this.LJLJJI = onThisDayResponse;
        this.LJLJJL = skylightFriendPostResponse;
    }

    public InboxHorizontalTopListCombinePod(List list, Long l, StoryGetFeedByPageResponse storyGetFeedByPageResponse, long j, boolean z, SkylightDataResponse skylightDataResponse, OnThisDayResponse onThisDayResponse, SkylightFriendPostResponse skylightFriendPostResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : storyGetFeedByPageResponse, (i & 8) != 0 ? System.currentTimeMillis() : j, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : skylightDataResponse, (i & 64) != 0 ? null : onThisDayResponse, (i & 128) == 0 ? skylightFriendPostResponse : null);
    }
}
