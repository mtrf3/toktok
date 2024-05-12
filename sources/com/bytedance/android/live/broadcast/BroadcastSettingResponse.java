package com.bytedance.android.live.broadcast;

import X.InterfaceC65349Pkn;

/* loaded from: classes.dex */
public class BroadcastSettingResponse {

    @InterfaceC65349Pkn("shopping_ranking")
    public int ecRankSwitchStatus;

    @InterfaceC65349Pkn("game_partnership_anchor")
    public boolean gamePartnershipAnchor;

    @InterfaceC65349Pkn("show_gift_setting_switch")
    public int giftFeature;

    @InterfaceC65349Pkn("transaction_history")
    public int giftRankSwitchStatus;

    @InterfaceC65349Pkn("game_partnership_event")
    public boolean isSelectedByEvent;

    @InterfaceC65349Pkn("live_ba_link")
    public boolean liveBALink;

    @InterfaceC65349Pkn("live_ba_leads_gen")
    public boolean liveBaLeadsGen;

    @InterfaceC65349Pkn("live_commercial")
    public boolean liveCommercial;

    @InterfaceC65349Pkn("live_paid_content")
    public boolean livePaidContent;

    @InterfaceC65349Pkn("play_back")
    public int playBack;

    @InterfaceC65349Pkn("promote_dot_badge")
    public boolean promoteDotBadge;

    @InterfaceC65349Pkn("promote_dot_badge_version")
    public String promoteDotBadgeVersion;

    @InterfaceC65349Pkn("game_partnership")
    public boolean showPartnership;

    @InterfaceC65349Pkn("show_promote")
    public boolean showPromote;

    @InterfaceC65349Pkn("show_stage_reward")
    public boolean showStageReward;

    public final boolean LIZ() {
        int i = this.giftFeature;
        if (i == 3) {
            return true;
        }
        if (i != 4 && i != 5 && i != 6 && i != 8 && i != 9 && i == 1) {
            return true;
        }
        return false;
    }
}
