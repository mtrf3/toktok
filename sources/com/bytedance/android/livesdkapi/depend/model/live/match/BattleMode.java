package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class BattleMode extends F9E {

    @InterfaceC65349Pkn("mode")
    public Integer mode;

    @InterfaceC65349Pkn("steal_tower_data")
    public StealTowerData stealTowerData;

    /* loaded from: classes17.dex */
    public static final class StealTowerData extends F9E {

        @InterfaceC65349Pkn("attacker_id")
        public Long attackerId;

        @InterfaceC65349Pkn("count")
        public Long count;

        @InterfaceC65349Pkn("duration")
        public Long duration;

        @InterfaceC65349Pkn("finish")
        public Boolean finish;

        @InterfaceC65349Pkn("finish_time")
        public Long finishTime;

        @InterfaceC65349Pkn("open_score")
        public Long openScore;

        @InterfaceC65349Pkn("start_time")
        public Long startTime;

        @InterfaceC65349Pkn("target_score")
        public Long targetScore;

        @InterfaceC65349Pkn("trigger_time")
        public Long triggerTime;

        @InterfaceC65349Pkn("win")
        public Long win;

        @Override // X.F9E
        public final Object[] getObjects() {
            Long l = this.triggerTime;
            Long l2 = this.duration;
            Long l3 = this.targetScore;
            Long l4 = this.startTime;
            Long l5 = this.attackerId;
            Long l6 = this.finishTime;
            Long l7 = this.win;
            Long l8 = this.count;
            Long l9 = this.openScore;
            Boolean bool = this.finish;
            return new Object[]{l, l, l2, l2, l3, l3, l4, l4, l5, l5, l6, l6, l7, l7, l8, l8, l9, l9, bool, bool};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        Integer num = this.mode;
        StealTowerData stealTowerData = this.stealTowerData;
        return new Object[]{num, num, stealTowerData, stealTowerData};
    }
}
