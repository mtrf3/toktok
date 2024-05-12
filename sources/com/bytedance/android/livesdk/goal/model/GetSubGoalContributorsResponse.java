package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalContributor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class GetSubGoalContributorsResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("contributors")
        public List<LiveStreamGoalContributor> contributors = new ArrayList();

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("next_offset")
        public long nextOffset;

        @InterfaceC65349Pkn("total")
        public long total;
    }
}
