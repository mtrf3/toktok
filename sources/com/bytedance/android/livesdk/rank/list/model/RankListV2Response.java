package com.bytedance.android.livesdk.rank.list.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import java.util.List;
import webcast.api.ranklist.LynxRankView;
import webcast.api.ranklist.RankExtraInfo;

/* loaded from: classes14.dex */
public final class RankListV2Response extends F9E {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes14.dex */
    public static final class BriefDescription {

        @InterfaceC65349Pkn("icon")
        public ImageModel icon;

        @InterfaceC65349Pkn("rule")
        public Text rule;

        @InterfaceC65349Pkn("title")
        public Text title;
    }

    /* loaded from: classes14.dex */
    public static final class Bulletin extends F9E {

        @InterfaceC65349Pkn("content")
        public Text content;

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("icon")
        public ImageModel icon;

        @InterfaceC65349Pkn("notice_type")
        public String noticeType;

        @Override // X.F9E
        public final Object[] getObjects() {
            Text text = this.content;
            ImageModel imageModel = this.icon;
            String str = this.noticeType;
            return new Object[]{text, text, Boolean.valueOf(this.enable), imageModel, imageModel, str, str};
        }
    }

    /* loaded from: classes14.dex */
    public static final class BulletinLoop {

        @InterfaceC65349Pkn("bulletins")
        public List<Bulletin> bulletins;
    }

    /* loaded from: classes14.dex */
    public static final class CutOffLine {

        @InterfaceC65349Pkn("content")
        public Text content;

        @InterfaceC65349Pkn("cut_off_index")
        public long cutOffIndex;
    }

    /* loaded from: classes14.dex */
    public static final class DailyAndRookieExtra {

        @InterfaceC65349Pkn("path_to_league")
        public PathToOtherList pathToLeague;
    }

    /* loaded from: classes14.dex */
    public static final class Data extends F9E {

        @InterfaceC65349Pkn("lynx_rank_view")
        public LynxRankView lynxRankView;

        @InterfaceC65349Pkn("rank_view")
        public RankView rankView;

        @Override // X.F9E
        public final Object[] getObjects() {
            RankView rankView = this.rankView;
            return new Object[]{rankView, rankView};
        }
    }

    /* loaded from: classes14.dex */
    public static final class Gap extends F9E {

        @InterfaceC65349Pkn("ban_Info")
        public int banInfo;

        @InterfaceC65349Pkn("display_type")
        public int displayType;

        @InterfaceC65349Pkn("gap_description")
        public Text gapDescription;

        @InterfaceC65349Pkn("gap_score")
        public long gapScore;

        @Override // X.F9E
        public final Object[] getObjects() {
            Text text = this.gapDescription;
            return new Object[]{text, text, Long.valueOf(this.gapScore)};
        }
    }

    /* loaded from: classes14.dex */
    public static final class HistoryEntrance {

        @InterfaceC65349Pkn("entrance_text")
        public Text entranceText;

        @InterfaceC65349Pkn("if_has_history")
        public boolean ifHasHistory;

        @InterfaceC65349Pkn("last_period_rank")
        public long lastPeriodRank;

        @InterfaceC65349Pkn("ranks")
        public List<RankInfo> ranks;

        @InterfaceC65349Pkn("title_text")
        public Text titleText;
    }

    /* loaded from: classes14.dex */
    public static final class LeagueTabInfo {

        @InterfaceC65349Pkn("standard_tab")
        public List<RankLeagueTab> standardTab;

        @InterfaceC65349Pkn("super_tab")
        public RankLeagueTab superTab;
    }

    /* loaded from: classes14.dex */
    public static final class LynxRankData {

        @InterfaceC65349Pkn("lynx_rank_view")
        public RankView lynxRankView;
    }

    /* loaded from: classes14.dex */
    public static final class PathToOtherList {

        @InterfaceC65349Pkn("description")
        public Text description;

        @InterfaceC65349Pkn("exist_flow_path")
        public boolean existFlowPath;

        @InterfaceC65349Pkn("schema")
        public String schema = "";
    }

    /* loaded from: classes14.dex */
    public static final class RankInfo extends F9E {

        @InterfaceC65349Pkn("gap")
        public Gap gap;

        @InterfaceC65349Pkn("rank")
        public long rank;

        @InterfaceC65349Pkn("rank_str")
        public String rankStr;

        @InterfaceC65349Pkn("rank_user")
        public User rankUser;

        @InterfaceC65349Pkn("room_id")
        public long roomId;

        @InterfaceC65349Pkn("score")
        public long score;

        @InterfaceC65349Pkn("score_description")
        public String scoreDescription;

        @InterfaceC65349Pkn("user")
        public User user;

        @InterfaceC65349Pkn("weekly_rank_extra")
        public WeeklyRankExtra weeklyRankExtra;

        @InterfaceC65349Pkn("weekly_rookie_rank_extra")
        public WeeklyRookieRankExtra weeklyRookieRankExtra;

        @Override // X.F9E
        public final Object[] getObjects() {
            User user = this.user;
            String str = this.rankStr;
            String str2 = this.scoreDescription;
            Gap gap = this.gap;
            WeeklyRankExtra weeklyRankExtra = this.weeklyRankExtra;
            WeeklyRookieRankExtra weeklyRookieRankExtra = this.weeklyRookieRankExtra;
            return new Object[]{user, user, Long.valueOf(this.rank), str, str, Long.valueOf(this.score), str2, str2, Long.valueOf(this.roomId), gap, gap, weeklyRankExtra, weeklyRankExtra, weeklyRookieRankExtra, weeklyRookieRankExtra};
        }
    }

    /* loaded from: classes14.dex */
    public static final class RankLeagueBase {

        @InterfaceC65349Pkn("if_show_promotion_effect")
        public boolean ifShowPromotionEffect;

        @InterfaceC65349Pkn("league_period")
        public long leaguePeriod;

        @InterfaceC65349Pkn("rank_type")
        public int rankType;

        @InterfaceC65349Pkn("show_league_phase")
        public int showLeaguePhase;

        @InterfaceC65349Pkn("show_league_phase_indicator")
        public int showLeaguePhaseIndicator;

        @InterfaceC65349Pkn("show_league_phase_status")
        public int showLeaguePhaseStatus;
    }

    /* loaded from: classes14.dex */
    public static final class RankLeagueExtra {

        @InterfaceC65349Pkn("brief_description")
        public BriefDescription briefDescription;

        @InterfaceC65349Pkn("path_to_daily")
        public PathToOtherList pathToDaily;

        @InterfaceC65349Pkn("rank_league_base")
        public RankLeagueBase rankLeagueBase;

        @InterfaceC65349Pkn("rank_league_header")
        public RankLeagueHeader rankLeagueHeader;

        @InterfaceC65349Pkn("rank_league_history_entrance")
        public HistoryEntrance rankLeagueHistoryEntrance;
    }

    /* loaded from: classes14.dex */
    public static final class RankLeagueHeader {

        @InterfaceC65349Pkn("league_tab_info")
        public LeagueTabInfo leagueTabInfo;
    }

    /* loaded from: classes14.dex */
    public static final class RankLeagueTab {

        @InterfaceC65349Pkn("brief_description")
        public Text briefDescription;

        @InterfaceC65349Pkn("league_phase")
        public int leaguePhase;

        @InterfaceC65349Pkn("rank_type")
        public int rankType;

        @InterfaceC65349Pkn("title_text")
        public Text titleText;
    }

    /* loaded from: classes14.dex */
    public static final class RankView extends F9E {
        public long LJLIL;
        public boolean LJLILLLLZI;

        @InterfaceC65349Pkn("bulletin")
        public Bulletin bulletin;

        @InterfaceC65349Pkn("bulletin_loop")
        public BulletinLoop bulletinLoop;

        @InterfaceC65349Pkn("countdown")
        public long countdown;

        @InterfaceC65349Pkn("cut_off_line")
        public List<CutOffLine> cutOffLine;

        @InterfaceC65349Pkn("has_last_rank")
        public boolean history;

        @InterfaceC65349Pkn("is_position_safe")
        public boolean isPositionSafe = true;

        @InterfaceC65349Pkn("owner_rank")
        public RankInfo ownerRank;

        @InterfaceC65349Pkn("rank_extra_info")
        public RankExtraInfo rankExtraInfo;

        @InterfaceC65349Pkn("rank_type")
        public int rankType;

        @InterfaceC65349Pkn("ranks")
        public List<RankInfo> ranks;

        @InterfaceC65349Pkn("rule_url")
        public String ruleUrl;

        @InterfaceC65349Pkn("sub_tabs")
        public List<SubRankTabInfo> subTabs;

        @InterfaceC65349Pkn("title")
        public String title;

        @InterfaceC65349Pkn("weekly_region_info")
        public WeeklyRankRegionInfo weeklyRegionInfo;

        @Override // X.F9E
        public final Object[] getObjects() {
            String str = this.title;
            String str2 = this.ruleUrl;
            List<RankInfo> list = this.ranks;
            RankInfo rankInfo = this.ownerRank;
            Bulletin bulletin = this.bulletin;
            return new Object[]{str, str, str2, str2, list, list, list, rankInfo, rankInfo, Long.valueOf(this.countdown), Integer.valueOf(this.rankType), bulletin, bulletin};
        }
    }

    /* loaded from: classes14.dex */
    public static final class WeeklyRankExtra extends F9E {

        @InterfaceC65349Pkn("curr_week_rank")
        public long currWeekRank;

        @InterfaceC65349Pkn("last_week_rank")
        public long lastWeekRank;

        @Override // X.F9E
        public final Object[] getObjects() {
            return new Object[]{Long.valueOf(this.currWeekRank), Long.valueOf(this.lastWeekRank)};
        }
    }

    /* loaded from: classes14.dex */
    public static final class WeeklyRookieRankExtra extends F9E {

        @InterfaceC65349Pkn("LastRankAnchorBeyondThresholdValue")
        public long LastRankAnchorBeyondThresholdValue;

        @InterfaceC65349Pkn("LastRankAnchorBeyondThreshold")
        public boolean lastrankanchorbeyondthreshold;

        @Override // X.F9E
        public final Object[] getObjects() {
            return new Object[]{Boolean.valueOf(this.lastrankanchorbeyondthreshold)};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        Data data = this.data;
        return new Object[]{data, data};
    }
}
