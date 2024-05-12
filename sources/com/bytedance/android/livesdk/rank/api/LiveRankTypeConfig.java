package com.bytedance.android.livesdk.rank.api;

import X.C47261Igj;
import X.C5H3;
import X.C78996UzQ;
import X.CEZ;
import X.InterfaceC65349Pkn;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

@SettingsKey("live_rank_type_config")
/* loaded from: classes6.dex */
public final class LiveRankTypeConfig {
    public static final LiveRankTypeConfig INSTANCE = new LiveRankTypeConfig();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config(C47261Igj.LJJIJIIJI(RankTypeV2.LIZ, RankTypeV2.LIZIZ, RankTypeV2.LIZJ, RankTypeV2.LIZLLL, RankTypeV2.LJ, RankTypeV2.LJFF, RankTypeV2.LJI, RankTypeV2.LJIIL, RankTypeV2.LJIILIIL, RankTypeV2.LJIILJJIL, RankTypeV2.LJII, RankTypeV2.LJIIIIZZ, RankTypeV2.LJIIIZ, RankTypeV2.LJIIJ));
    public static final C5H3 configValue$delegate = C78996UzQ.LJJIJIIJI(CEZ.LJLIL);

    private final HashMap<OSZ<Integer, Integer>, RankTypeV2> getConfigValue() {
        return (HashMap) configValue$delegate.getValue();
    }

    public final HashMap<OSZ<Integer, Integer>, RankTypeV2> getValue() {
        return getConfigValue();
    }

    /* loaded from: classes6.dex */
    public static final class Config {

        @InterfaceC65349Pkn("rank_types")
        public List<RankTypeV2> rankTypeList;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Config(List<RankTypeV2> rankTypeList) {
            o.LJIIIZ(rankTypeList, "rankTypeList");
            this.rankTypeList = rankTypeList;
        }

        public /* synthetic */ Config(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }
    }
}
