package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetSubGoalHistoryResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("history")
        public List<LiveStreamGoal> history = new ArrayList();

        @InterfaceC65349Pkn("next_offset")
        public long nextOffset;
    }
}
