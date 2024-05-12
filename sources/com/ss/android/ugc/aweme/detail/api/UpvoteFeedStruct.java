package com.ss.android.ugc.aweme.detail.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UpvoteFeedStruct extends F9E implements Serializable {

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme;

    @InterfaceC65349Pkn("upvote_list")
    public final UpvoteList upvoteList;

    @InterfaceC65349Pkn("viewed")
    public final boolean viewed;

    /* JADX WARN: Multi-variable type inference failed */
    public UpvoteFeedStruct() {
        this(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UpvoteFeedStruct copy$default(UpvoteFeedStruct upvoteFeedStruct, Aweme aweme, UpvoteList upvoteList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme = upvoteFeedStruct.aweme;
        }
        if ((i & 2) != 0) {
            upvoteList = upvoteFeedStruct.upvoteList;
        }
        if ((i & 4) != 0) {
            z = upvoteFeedStruct.viewed;
        }
        return upvoteFeedStruct.copy(aweme, upvoteList, z);
    }

    public final UpvoteFeedStruct copy(Aweme aweme, UpvoteList upvoteList, boolean z) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(upvoteList, "upvoteList");
        return new UpvoteFeedStruct(aweme, upvoteList, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.aweme, this.upvoteList, Boolean.valueOf(this.viewed)};
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final UpvoteList getUpvoteList() {
        return this.upvoteList;
    }

    public final boolean getViewed() {
        return this.viewed;
    }

    public UpvoteFeedStruct(Aweme aweme, UpvoteList upvoteList, boolean z) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(upvoteList, "upvoteList");
        this.aweme = aweme;
        this.upvoteList = upvoteList;
        this.viewed = z;
    }

    public /* synthetic */ UpvoteFeedStruct(Aweme aweme, UpvoteList upvoteList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Aweme() : aweme, (i & 2) != 0 ? new UpvoteList(null, 0L, false, 0L, null, 31, null) : upvoteList, (i & 4) != 0 ? false : z);
    }
}
