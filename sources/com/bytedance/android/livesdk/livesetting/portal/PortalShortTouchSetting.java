package com.bytedance.android.livesdk.livesetting.portal;

import X.C113554cx;
import X.C47261Igj;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;

@SettingsKey("live_portal_short_touch_view_infos")
/* loaded from: classes6.dex */
public final class PortalShortTouchSetting {
    public static final PortalShortTouchSetting INSTANCE = new PortalShortTouchSetting();

    @Group(isDefault = true, value = "default group")
    public static final List<Map<String, String>> DEFAULT = C47261Igj.LJJIJIIJI(C113554cx.LJJL(new OSZ("push_into_lottie", "liveroom_portal_entrance_pushinto"), new OSZ("view_type", "1"), new OSZ("extend_lottie_time", "2670"), new OSZ("short_touch_key", "shortTouchPortalEntrance"), new OSZ("short_touch_schema", "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch_portal%2Ftemplate.js"), new OSZ("click_target", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fportal_go%2Ftemplate.js&gravity=bottom&height=684rpx&landscape_screen_size_as_portrait=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Ftreasure_box")), C113554cx.LJJL(new OSZ("push_into_lottie", "liveroom_portal_data_pushinto"), new OSZ("view_type", "2"), new OSZ("extend_lottie_time", CardStruct.IStatusCode.DEFAULT), new OSZ("short_touch_key", "shortTouchPortalOverView"), new OSZ("short_touch_schema", "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch_people%2Ftemplate.js"), new OSZ("click_target", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fportals_detail%2Ftemplate.js&gravity=bottom&landscape_screen_size_as_portrait=1")));

    public final List<Map<String, String>> getValue() {
        List<Map<String, String>> list = (List) SettingsManager.INSTANCE.getValueSafely(PortalShortTouchSetting.class);
        if (list == null) {
            return DEFAULT;
        }
        return list;
    }

    public final List<Map<String, String>> getDEFAULT() {
        return DEFAULT;
    }
}
