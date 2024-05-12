package com.bytedance.android.livesdk.livesetting.rank;

import X.C221108m2;
import X.C31001CEr;
import X.C5H3;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_rank_entrance_loop_interval")
/* loaded from: classes6.dex */
public final class RankEntranceLoopInterval {
    public static final RankEntranceLoopInterval INSTANCE = new RankEntranceLoopInterval();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config(5000, 5000);
    public static final C5H3 configValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C31001CEr.LJLIL);

    private final Config getConfigValue() {
        return (Config) configValue$delegate.getValue();
    }

    public final Config getValue() {
        return getConfigValue();
    }

    /* loaded from: classes6.dex */
    public static final class Config {

        @InterfaceC65349Pkn("off_rank_loop_interval")
        public long offRankLoopInterval;

        @InterfaceC65349Pkn("on_rank_loop_interval")
        public long onRankLoopInterval;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Config() {
            /*
                r7 = this;
                r1 = 0
                r5 = 3
                r6 = 0
                r0 = r7
                r3 = r1
                r0.<init>(r1, r3, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.rank.RankEntranceLoopInterval.Config.<init>():void");
        }

        public Config(long j, long j2) {
            this.onRankLoopInterval = j;
            this.offRankLoopInterval = j2;
        }

        public /* synthetic */ Config(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 5000L : j, (i & 2) != 0 ? 5000L : j2);
        }
    }
}
