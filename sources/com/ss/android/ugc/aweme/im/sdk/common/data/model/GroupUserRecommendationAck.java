package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupUserRecommendationAck implements Serializable {

    @InterfaceC65349Pkn("blocked_user_id")
    public final List<Long> userIdList;

    public final List<Long> getUserIdList() {
        return this.userIdList;
    }

    public GroupUserRecommendationAck(List<Long> userIdList) {
        o.LJIIIZ(userIdList, "userIdList");
        this.userIdList = userIdList;
    }
}
