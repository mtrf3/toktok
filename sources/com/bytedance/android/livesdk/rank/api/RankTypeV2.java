package com.bytedance.android.livesdk.rank.api;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RankTypeV2 {
    public static final RankTypeV2 LIZ = new RankTypeV2(0, "hourly_rank", 0, 0, 180, 5, 0);
    public static final RankTypeV2 LIZIZ = new RankTypeV2(1, "weekly_rank", 0, 0, 86400, 3, 0);
    public static final RankTypeV2 LIZJ = new RankTypeV2(5, "rookie_star_rank", 1, 0, 86400, 3, 3);
    public static final RankTypeV2 LIZLLL = new RankTypeV2(6, "sale_rank", 0, 0, -1, 0, 0);
    public static final RankTypeV2 LJ = new RankTypeV2(8, "daily_rank", 0, 0, 3600, 3, 0);
    public static final RankTypeV2 LJFF = new RankTypeV2(11, "daily_game_rank", 0, 0, -1, 0, 0);
    public static final RankTypeV2 LJI = new RankTypeV2(12, "hall_of_fame_rank", 0, 0, -1, 0, 0);
    public static final RankTypeV2 LJII = new RankTypeV2(13, "champion_tournament", 2, 0, 3600, 3, 0);
    public static final RankTypeV2 LJIIIIZZ = new RankTypeV2(13, "champion_tournament_phase_one", 2, 1, 3600, 3, 0);
    public static final RankTypeV2 LJIIIZ = new RankTypeV2(13, "champion_tournament_phase_two", 2, 2, 3600, 3, 0);
    public static final RankTypeV2 LJIIJ = new RankTypeV2(13, "champion_tournament_phase_three", 2, 3, 3600, 3, 0);
    public static final RankTypeV2 LJIIJJI = new RankTypeV2(14, "daily_rookie_star_rank", 1, 0, 3600, 3, 2);
    public static final RankTypeV2 LJIIL = new RankTypeV2(20, "pubg", 0, 0, -1, 0, 0);
    public static final RankTypeV2 LJIILIIL = new RankTypeV2(21, "mlbb", 0, 0, -1, 0, 0);
    public static final RankTypeV2 LJIILJJIL = new RankTypeV2(22, "free_fire", 0, 0, -1, 0, 0);
    public static final RankTypeV2 LJIILL = new RankTypeV2(-1, "unknown", 0, 0, -1, 0, 0);

    @InterfaceC65349Pkn("rank_name")
    public String rankName;

    @InterfaceC65349Pkn("rank_phase")
    public int rankPhase;

    @InterfaceC65349Pkn("rank_settlement_countdown")
    public int rankSettlementCountdown;

    @InterfaceC65349Pkn("rank_settlement_countdown_duration")
    public int rankSettlementCountdownDuration;

    @InterfaceC65349Pkn("show_rank_keep_up_tip")
    public int showRankKeepUpTip;

    @InterfaceC65349Pkn("rank_style")
    public int style;

    @InterfaceC65349Pkn("rank_type")
    public int type;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RankTypeV2() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r9 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.api.RankTypeV2.<init>():void");
    }

    public final int hashCode() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RankTypeV2) {
            RankTypeV2 rankTypeV2 = (RankTypeV2) obj;
            if (this.type == rankTypeV2.type && this.rankPhase == rankTypeV2.rankPhase) {
                return true;
            }
        }
        return false;
    }

    public RankTypeV2(int i, String rankName, int i2, int i3, int i4, int i5, int i6) {
        o.LJIIIZ(rankName, "rankName");
        this.type = i;
        this.rankName = rankName;
        this.style = i2;
        this.rankPhase = i3;
        this.rankSettlementCountdown = i4;
        this.rankSettlementCountdownDuration = i5;
        this.showRankKeepUpTip = i6;
    }

    public /* synthetic */ RankTypeV2(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? -1 : i, (i7 & 2) != 0 ? "unknown" : str, (i7 & 4) != 0 ? 0 : i2, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) == 0 ? i4 : -1, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0 : i6);
    }
}
