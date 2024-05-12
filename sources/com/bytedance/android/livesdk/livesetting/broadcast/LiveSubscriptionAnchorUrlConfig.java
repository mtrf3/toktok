package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSubscriptionAnchorUrlConfig {

    @InterfaceC65349Pkn("anchor_subscribe_entry")
    public String anchorSubscribeEntry;

    @InterfaceC65349Pkn("anchor_subscribers_popup")
    public String anchorSubscriberList;

    @InterfaceC65349Pkn("badge_management")
    public String badgeManagement;

    @InterfaceC65349Pkn("c2c_trans_guide_page")
    public String c2cTransGuidePage;

    @InterfaceC65349Pkn("custom_price_management")
    public String customPriceManagement;

    @InterfaceC65349Pkn("emote_management")
    public String emoteManagement;

    @InterfaceC65349Pkn("payout_unsupported_notice_popup")
    public String payoutUnsupportedNoticePopup;

    @InterfaceC65349Pkn("pin_management_intro")
    public String pinManagementIntro;

    @InterfaceC65349Pkn("pin_management_page")
    public String pinManagementPage;

    @InterfaceC65349Pkn("spotlight_faq")
    public String spotlightFaq;

    @InterfaceC65349Pkn("spotlight_intro")
    public String spotlightIntro;

    @InterfaceC65349Pkn("subonly_music_intro")
    public String subOnlyMusicIntro;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveSubscriptionAnchorUrlConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
    }

    public LiveSubscriptionAnchorUrlConfig(String emoteManagement, String badgeManagement, String c2cTransGuidePage, String payoutUnsupportedNoticePopup, String anchorSubscriberList, String anchorSubscribeEntry, String pinManagementPage, String pinManagementIntro, String customPriceManagement, String spotlightFaq, String spotlightIntro, String subOnlyMusicIntro) {
        o.LJIIIZ(emoteManagement, "emoteManagement");
        o.LJIIIZ(badgeManagement, "badgeManagement");
        o.LJIIIZ(c2cTransGuidePage, "c2cTransGuidePage");
        o.LJIIIZ(payoutUnsupportedNoticePopup, "payoutUnsupportedNoticePopup");
        o.LJIIIZ(anchorSubscriberList, "anchorSubscriberList");
        o.LJIIIZ(anchorSubscribeEntry, "anchorSubscribeEntry");
        o.LJIIIZ(pinManagementPage, "pinManagementPage");
        o.LJIIIZ(pinManagementIntro, "pinManagementIntro");
        o.LJIIIZ(customPriceManagement, "customPriceManagement");
        o.LJIIIZ(spotlightFaq, "spotlightFaq");
        o.LJIIIZ(spotlightIntro, "spotlightIntro");
        o.LJIIIZ(subOnlyMusicIntro, "subOnlyMusicIntro");
        this.emoteManagement = emoteManagement;
        this.badgeManagement = badgeManagement;
        this.c2cTransGuidePage = c2cTransGuidePage;
        this.payoutUnsupportedNoticePopup = payoutUnsupportedNoticePopup;
        this.anchorSubscriberList = anchorSubscriberList;
        this.anchorSubscribeEntry = anchorSubscribeEntry;
        this.pinManagementPage = pinManagementPage;
        this.pinManagementIntro = pinManagementIntro;
        this.customPriceManagement = customPriceManagement;
        this.spotlightFaq = spotlightFaq;
        this.spotlightIntro = spotlightIntro;
        this.subOnlyMusicIntro = subOnlyMusicIntro;
    }

    public /* synthetic */ LiveSubscriptionAnchorUrlConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "");
    }
}
