package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C221108m2;
import X.C28591BJz;
import X.C5H3;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

@SettingsKey("live_star_comment_schema")
/* loaded from: classes6.dex */
public final class LiveStarCommentSchemaConfig {
    public static final LiveStarCommentSchemaConfig INSTANCE = new LiveStarCommentSchemaConfig();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config("sslocal://webcast_lynxview_popup?show_mask=0&container_bg_color=0B0B1F&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_privilege%2Fpages%2Fstar_comment_settings%2Ftemplate.js&gravity=bottom&height=900rpx&use_forest=1&bdhm_bid=tiktok_live_revenue_privilege", "sslocal://webcast_lynxview_popup?show_mask=0&container_bg_color=0B0B1F&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_privilege%2Fpages%2Fstar_comment_history%2Ftemplate.js&gravity=bottom&height=900rpx&use_forest=1&bdhm_bid=tiktok_live_revenue_privilege", "sslocal://webcast_webview?url=https%3A%2F%2Fsf16-draftcdn-sg.ibytedtos.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Ftiktok_live_revenue_star_comment_faq.html%3Ftrait_mode%3Ddark&show_amount_strategy%3D1&darkmode_color=BGSecondary&type=popup&gravity=bottom&radius=10&height=450", "sslocal://webcast_webview?url=https%3A%2F%2Fsf16-draftcdn-sg.ibytedtos.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Ftiktok_live_revenue_star_comment_faq_user.html%3Ftrait_mode%3Ddark&show_amount_strategy%3D1&darkmode_color=BGSecondary&type=popup&gravity=bottom&radius=10&height=450", "sslocal://webcast_webview?url=https%3A%2F%2Fsf19-draftcdn-sg.ibytedtos.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Fstar-comment-price-desc.html%3Ftrait_mode%3Ddark&show_amount_strategy%3D1&darkmode_color=BGSecondary&type=popup&gravity=bottom&radius=10", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_low_code%2Fpages%2Findex%2Ftemplate.js&height=580&pageId=star_comment_terms");
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C28591BJz.LJLIL);

    public final Config getSettingValue() {
        return (Config) settingValue$delegate.getValue();
    }

    /* loaded from: classes6.dex */
    public static final class Config {

        @InterfaceC65349Pkn("anchor_settings_scheme")
        public String anchor_settings_scheme;

        @InterfaceC65349Pkn("star_comment_purchase_page_bubble_faq")
        public String bubblePageFaq;

        @InterfaceC65349Pkn("star_comment_anchor_faq")
        public String starCommentAnchorFaq;

        @InterfaceC65349Pkn("star_comment_audience_faq")
        public String starCommentAudienceFaq;

        @InterfaceC65349Pkn("star_comment_history")
        public String starCommentHistory;

        @InterfaceC65349Pkn("star_comment_terms")
        public String starCommentTerms;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }

        public Config(String anchor_settings_scheme, String starCommentHistory, String starCommentAnchorFaq, String starCommentAudienceFaq, String bubblePageFaq, String starCommentTerms) {
            o.LJIIIZ(anchor_settings_scheme, "anchor_settings_scheme");
            o.LJIIIZ(starCommentHistory, "starCommentHistory");
            o.LJIIIZ(starCommentAnchorFaq, "starCommentAnchorFaq");
            o.LJIIIZ(starCommentAudienceFaq, "starCommentAudienceFaq");
            o.LJIIIZ(bubblePageFaq, "bubblePageFaq");
            o.LJIIIZ(starCommentTerms, "starCommentTerms");
            this.anchor_settings_scheme = anchor_settings_scheme;
            this.starCommentHistory = starCommentHistory;
            this.starCommentAnchorFaq = starCommentAnchorFaq;
            this.starCommentAudienceFaq = starCommentAudienceFaq;
            this.bubblePageFaq = bubblePageFaq;
            this.starCommentTerms = starCommentTerms;
        }

        public /* synthetic */ Config(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "");
        }
    }
}
