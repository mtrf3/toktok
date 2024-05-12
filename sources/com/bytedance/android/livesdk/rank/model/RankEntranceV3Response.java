package com.bytedance.android.livesdk.rank.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class RankEntranceV3Response {

    @InterfaceC65349Pkn("data")
    public List<EntranceGroup> entranceGroups;

    /* loaded from: classes6.dex */
    public static final class EntranceGroup {

        @InterfaceC65349Pkn("animation_loop_for_off")
        public boolean animationLoopForOff;

        @InterfaceC65349Pkn("data")
        public Data data;

        @InterfaceC65349Pkn("group_type")
        public int groupType;

        @InterfaceC65349Pkn("is_animation_loop_play")
        public boolean loop;

        @InterfaceC65349Pkn("Priority")
        public long priority;

        /* loaded from: classes6.dex */
        public static final class Data {

            @InterfaceC65349Pkn("entrances")
            public List<RankEntrance> entrances;

            @InterfaceC65349Pkn("tabs")
            public List<RankTabInfo> tabs;
        }
    }
}
