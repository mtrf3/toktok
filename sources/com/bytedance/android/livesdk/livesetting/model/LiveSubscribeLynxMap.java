package com.bytedance.android.livesdk.livesetting.model;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class LiveSubscribeLynxMap {
    public final String anchorIncomeAnalyticsPage;
    public final String anchorPaypalGuide;
    public final String anchorPerksList;
    public final String anchorSubOnlyLiveFaq;
    public final String anchorSubOnlyLiveFaqPopup;
    public final String anchorSubscribersPage;
    public final String anchorUserNotAvailablePage;
    public final String anchor_badge_preview_page;
    public final String anchor_badge_preview_popup;
    public final String anchor_badge_setting_page;
    public final String anchor_badge_setting_popup;
    public final String anchor_badge_setting_popup_android;
    public final String anchor_community_settings;
    public final String anchor_community_settings_popup;
    public final String anchor_describe_management_page;
    public final String anchor_emotes_setting_page;
    public final String anchor_emotes_setting_popup;
    public final String anchor_go_live_popup;
    public final String anchor_low_version_popup;
    public final String anchor_note_settings;
    public final String anchor_note_settings_popup;
    public final String anchor_subscribe_faq;
    public final String anchor_user_badge_or_emotes_subscribe;
    public final String anchor_user_guide_page;
    public final String anchor_user_guide_popup;
    public final String anchor_user_terms_page;
    public final String anchor_user_terms_popup;
    public final JSONObject jsonObject;
    public final String pinCard;
    public final String useGiftPanelPopup;
    public final String userGiftPanelPage;
    public final String user_grace_period;
    public final String user_subscribe_data;
    public final String user_subscribe_detail;
    public final String user_subscribe_entry;
    public final String user_subscribe_list;
    public final String user_subscribe_state;
    public final String user_subscribe_state_five_split;
    public final String user_subscribe_template;

    public final String getAnchorIncomeAnalyticsPage() {
        return this.anchorIncomeAnalyticsPage;
    }

    public final String getAnchorPaypalGuide() {
        return this.anchorPaypalGuide;
    }

    public final String getAnchorPerksList() {
        return this.anchorPerksList;
    }

    public final String getAnchorSubOnlyLiveFaq() {
        return this.anchorSubOnlyLiveFaq;
    }

    public final String getAnchorSubOnlyLiveFaqPopup() {
        return this.anchorSubOnlyLiveFaqPopup;
    }

    public final String getAnchorSubscribersPage() {
        return this.anchorSubscribersPage;
    }

    public final String getAnchorUserNotAvailablePage() {
        return this.anchorUserNotAvailablePage;
    }

    public final String getAnchor_badge_preview_page() {
        return this.anchor_badge_preview_page;
    }

    public final String getAnchor_badge_preview_popup() {
        return this.anchor_badge_preview_popup;
    }

    public final String getAnchor_badge_setting_page() {
        return this.anchor_badge_setting_page;
    }

    public final String getAnchor_badge_setting_popup() {
        return this.anchor_badge_setting_popup;
    }

    public final String getAnchor_badge_setting_popup_android() {
        return this.anchor_badge_setting_popup_android;
    }

    public final String getAnchor_community_settings() {
        return this.anchor_community_settings;
    }

    public final String getAnchor_community_settings_popup() {
        return this.anchor_community_settings_popup;
    }

    public final String getAnchor_describe_management_page() {
        return this.anchor_describe_management_page;
    }

    public final String getAnchor_emotes_setting_page() {
        return this.anchor_emotes_setting_page;
    }

    public final String getAnchor_emotes_setting_popup() {
        return this.anchor_emotes_setting_popup;
    }

    public final String getAnchor_go_live_popup() {
        return this.anchor_go_live_popup;
    }

    public final String getAnchor_low_version_popup() {
        return this.anchor_low_version_popup;
    }

    public final String getAnchor_note_settings() {
        return this.anchor_note_settings;
    }

    public final String getAnchor_note_settings_popup() {
        return this.anchor_note_settings_popup;
    }

    public final String getAnchor_subscribe_faq() {
        return this.anchor_subscribe_faq;
    }

    public final String getAnchor_user_badge_or_emotes_subscribe() {
        return this.anchor_user_badge_or_emotes_subscribe;
    }

    public final String getAnchor_user_guide_page() {
        return this.anchor_user_guide_page;
    }

    public final String getAnchor_user_guide_popup() {
        return this.anchor_user_guide_popup;
    }

    public final String getAnchor_user_terms_page() {
        return this.anchor_user_terms_page;
    }

    public final String getAnchor_user_terms_popup() {
        return this.anchor_user_terms_popup;
    }

    public final String getPinCard() {
        return this.pinCard;
    }

    public final String getUseGiftPanelPopup() {
        return this.useGiftPanelPopup;
    }

    public final String getUserGiftPanelPage() {
        return this.userGiftPanelPage;
    }

    public final String getUser_grace_period() {
        return this.user_grace_period;
    }

    public final String getUser_subscribe_data() {
        return this.user_subscribe_data;
    }

    public final String getUser_subscribe_detail() {
        return this.user_subscribe_detail;
    }

    public final String getUser_subscribe_entry() {
        return this.user_subscribe_entry;
    }

    public final String getUser_subscribe_list() {
        return this.user_subscribe_list;
    }

    public final String getUser_subscribe_state() {
        return this.user_subscribe_state;
    }

    public final String getUser_subscribe_state_five_split() {
        return this.user_subscribe_state_five_split;
    }

    public final String getUser_subscribe_template() {
        return this.user_subscribe_template;
    }

    public LiveSubscribeLynxMap(String settingParam) {
        JSONObject jSONObject;
        o.LJIIIZ(settingParam, "settingParam");
        if (TextUtils.isEmpty(settingParam)) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(settingParam);
        }
        this.jsonObject = jSONObject;
        String optString = jSONObject.optString("user_subscribe_entry", "");
        o.LJIIIIZZ(optString, "jsonObject\n        .optS…ser_subscribe_entry\", \"\")");
        this.user_subscribe_entry = optString;
        String optString2 = jSONObject.optString("user_subscribe_template", "");
        o.LJIIIIZZ(optString2, "jsonObject\n        .optS…_subscribe_template\", \"\")");
        this.user_subscribe_template = optString2;
        String optString3 = jSONObject.optString("user_grace_period", "");
        o.LJIIIIZZ(optString3, "jsonObject\n        .optS…(\"user_grace_period\", \"\")");
        this.user_grace_period = optString3;
        String optString4 = jSONObject.optString("user_subscribe_state", "");
        o.LJIIIIZZ(optString4, "jsonObject\n        .optS…ser_subscribe_state\", \"\")");
        this.user_subscribe_state = optString4;
        String optString5 = jSONObject.optString("user_subscribe_state_five_split", "");
        o.LJIIIIZZ(optString5, "jsonObject\n        .optS…be_state_five_split\", \"\")");
        this.user_subscribe_state_five_split = optString5;
        String optString6 = jSONObject.optString("user_subscribe_data", "");
        o.LJIIIIZZ(optString6, "jsonObject\n        .optS…user_subscribe_data\", \"\")");
        this.user_subscribe_data = optString6;
        String optString7 = jSONObject.optString("user_subscribe_list", "");
        o.LJIIIIZZ(optString7, "jsonObject\n        .optS…user_subscribe_list\", \"\")");
        this.user_subscribe_list = optString7;
        String optString8 = jSONObject.optString("user_subscribe_detail", "");
        o.LJIIIIZZ(optString8, "jsonObject\n        .optS…er_subscribe_detail\", \"\")");
        this.user_subscribe_detail = optString8;
        String optString9 = jSONObject.optString("anchor_badge_setting_popup", "");
        o.LJIIIIZZ(optString9, "jsonObject\n        .optS…badge_setting_popup\", \"\")");
        this.anchor_badge_setting_popup = optString9;
        String optString10 = jSONObject.optString("anchor_badge_setting_popup_android", "");
        o.LJIIIIZZ(optString10, "jsonObject\n        .optS…tting_popup_android\", \"\")");
        this.anchor_badge_setting_popup_android = optString10;
        String optString11 = jSONObject.optString("anchor_badge_setting_page", "");
        o.LJIIIIZZ(optString11, "jsonObject\n        .optS…_badge_setting_page\", \"\")");
        this.anchor_badge_setting_page = optString11;
        String optString12 = jSONObject.optString("anchor_badge_preview_popup", "");
        o.LJIIIIZZ(optString12, "jsonObject\n        .optS…badge_preview_popup\", \"\")");
        this.anchor_badge_preview_popup = optString12;
        String optString13 = jSONObject.optString("anchor_badge_preview_page", "");
        o.LJIIIIZZ(optString13, "jsonObject\n        .optS…_badge_preview_page\", \"\")");
        this.anchor_badge_preview_page = optString13;
        String optString14 = jSONObject.optString("anchor_emotes_setting_popup", "");
        o.LJIIIIZZ(optString14, "jsonObject\n        .optS…motes_setting_popup\", \"\")");
        this.anchor_emotes_setting_popup = optString14;
        String optString15 = jSONObject.optString("anchor_emotes_setting_page", "");
        o.LJIIIIZZ(optString15, "jsonObject\n        .optS…emotes_setting_page\", \"\")");
        this.anchor_emotes_setting_page = optString15;
        String optString16 = jSONObject.optString("anchor_note_settings_popup", "");
        o.LJIIIIZZ(optString16, "jsonObject\n        .optS…note_settings_popup\", \"\")");
        this.anchor_note_settings_popup = optString16;
        String optString17 = jSONObject.optString("anchor_note_settings", "");
        o.LJIIIIZZ(optString17, "jsonObject\n        .optS…nchor_note_settings\", \"\")");
        this.anchor_note_settings = optString17;
        String optString18 = jSONObject.optString("anchor_subscribe_faq", "");
        o.LJIIIIZZ(optString18, "jsonObject\n        .optS…nchor_subscribe_faq\", \"\")");
        this.anchor_subscribe_faq = optString18;
        String optString19 = jSONObject.optString("anchor_user_guide_popup", "");
        o.LJIIIIZZ(optString19, "jsonObject\n        .optS…or_user_guide_popup\", \"\")");
        this.anchor_user_guide_popup = optString19;
        String optString20 = jSONObject.optString("anchor_user_guide_page", "");
        o.LJIIIIZZ(optString20, "jsonObject\n        .optS…hor_user_guide_page\", \"\")");
        this.anchor_user_guide_page = optString20;
        String optString21 = jSONObject.optString("anchor_user_terms_popup", "");
        o.LJIIIIZZ(optString21, "jsonObject\n        .optS…or_user_terms_popup\", \"\")");
        this.anchor_user_terms_popup = optString21;
        String optString22 = jSONObject.optString("anchor_user_terms_page", "");
        o.LJIIIIZZ(optString22, "jsonObject\n        .optS…hor_user_terms_page\", \"\")");
        this.anchor_user_terms_page = optString22;
        String optString23 = jSONObject.optString("anchor_describe_management_page", "");
        o.LJIIIIZZ(optString23, "jsonObject\n        .optS…ibe_management_page\", \"\")");
        this.anchor_describe_management_page = optString23;
        String optString24 = jSONObject.optString("anchor_go_live_popup", "");
        o.LJIIIIZZ(optString24, "jsonObject\n        .optS…nchor_go_live_popup\", \"\")");
        this.anchor_go_live_popup = optString24;
        String optString25 = jSONObject.optString("anchor_low_version_popup", "");
        o.LJIIIIZZ(optString25, "jsonObject\n        .optS…r_low_version_popup\", \"\")");
        this.anchor_low_version_popup = optString25;
        String optString26 = jSONObject.optString("anchor_community_settings", "");
        o.LJIIIIZZ(optString26, "jsonObject\n        .optS…_community_settings\", \"\")");
        this.anchor_community_settings = optString26;
        String optString27 = jSONObject.optString("anchor_community_settings_popup", "");
        o.LJIIIIZZ(optString27, "jsonObject\n        .optS…nity_settings_popup\", \"\")");
        this.anchor_community_settings_popup = optString27;
        String optString28 = jSONObject.optString("user_gift_panel_popup", "");
        o.LJIIIIZZ(optString28, "jsonObject\n        .optS…er_gift_panel_popup\", \"\")");
        this.useGiftPanelPopup = optString28;
        String optString29 = jSONObject.optString("user_gift_panel_page", "");
        o.LJIIIIZZ(optString29, "jsonObject\n        .optS…ser_gift_panel_page\", \"\")");
        this.userGiftPanelPage = optString29;
        String optString30 = jSONObject.optString("anchor_paypal_guide", "");
        o.LJIIIIZZ(optString30, "jsonObject\n        .optS…anchor_paypal_guide\", \"\")");
        this.anchorPaypalGuide = optString30;
        String optString31 = jSONObject.optString("anchor_user_badge_or_emotes_subscribe", "");
        o.LJIIIIZZ(optString31, "jsonObject\n        .optS…or_emotes_subscribe\", \"\")");
        this.anchor_user_badge_or_emotes_subscribe = optString31;
        String optString32 = jSONObject.optString("anchor_perks_list", "");
        o.LJIIIIZZ(optString32, "jsonObject\n        .optS…(\"anchor_perks_list\", \"\")");
        this.anchorPerksList = optString32;
        String optString33 = jSONObject.optString("anchor_income_analytics_page", "");
        o.LJIIIIZZ(optString33, "jsonObject\n        .optS…come_analytics_page\", \"\")");
        this.anchorIncomeAnalyticsPage = optString33;
        String optString34 = jSONObject.optString("anchor_subscribers_page", "");
        o.LJIIIIZZ(optString34, "jsonObject\n        .optS…or_subscribers_page\", \"\")");
        this.anchorSubscribersPage = optString34;
        String optString35 = jSONObject.optString("anchor_user_notavailable_page", "");
        o.LJIIIIZZ(optString35, "jsonObject\n        .optS…r_notavailable_page\", \"\")");
        this.anchorUserNotAvailablePage = optString35;
        String optString36 = jSONObject.optString("anchor_subonlylive_faq", "");
        o.LJIIIIZZ(optString36, "jsonObject\n        .optS…hor_subonlylive_faq\", \"\")");
        this.anchorSubOnlyLiveFaq = optString36;
        String optString37 = jSONObject.optString("anchor_subonlylive_faq_popup", "");
        o.LJIIIIZZ(optString37, "jsonObject\n        .optS…bonlylive_faq_popup\", \"\")");
        this.anchorSubOnlyLiveFaqPopup = optString37;
        String optString38 = jSONObject.optString("pin_card", "");
        o.LJIIIIZZ(optString38, "jsonObject\n        .optString(\"pin_card\", \"\")");
        this.pinCard = optString38;
    }
}
