package com.ss.android.ugc.aweme.feed.count;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class UserPlayNum extends F9E {
    public FeedPlayNumModel model;
    public String uid;

    public static /* synthetic */ UserPlayNum copy$default(UserPlayNum userPlayNum, String str, FeedPlayNumModel feedPlayNumModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userPlayNum.uid;
        }
        if ((i & 2) != 0) {
            feedPlayNumModel = userPlayNum.model;
        }
        return userPlayNum.copy(str, feedPlayNumModel);
    }

    public final UserPlayNum copy(String uid, FeedPlayNumModel model) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(model, "model");
        return new UserPlayNum(uid, model);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.uid, this.model};
    }

    public final FeedPlayNumModel getModel() {
        return this.model;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setModel(FeedPlayNumModel feedPlayNumModel) {
        o.LJIIIZ(feedPlayNumModel, "<set-?>");
        this.model = feedPlayNumModel;
    }

    public final void setUid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.uid = str;
    }

    public UserPlayNum(String uid, FeedPlayNumModel model) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(model, "model");
        this.uid = uid;
        this.model = model;
    }
}
