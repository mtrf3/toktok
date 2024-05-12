package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class UpvotePreloadStruct extends F9E implements Serializable {

    @InterfaceC65349Pkn("need_pull_upvote_info")
    public boolean needPullUpvoteInfo;

    public UpvotePreloadStruct() {
    }

    public static /* synthetic */ UpvotePreloadStruct copy$default(UpvotePreloadStruct upvotePreloadStruct, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = upvotePreloadStruct.needPullUpvoteInfo;
        }
        return upvotePreloadStruct.copy(z);
    }

    public final UpvotePreloadStruct copy(boolean z) {
        return new UpvotePreloadStruct(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.needPullUpvoteInfo)};
    }

    public final boolean getNeedPullUpvoteInfo() {
        return this.needPullUpvoteInfo;
    }

    public UpvotePreloadStruct(boolean z) {
        this.needPullUpvoteInfo = z;
    }
}
