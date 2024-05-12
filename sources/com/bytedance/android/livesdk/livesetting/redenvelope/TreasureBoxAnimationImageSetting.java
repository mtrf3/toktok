package com.bytedance.android.livesdk.livesetting.redenvelope;

import X.C113554cx;
import X.C47261Igj;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;
import java.util.Map;

@SettingsKey("live_treasurebox_animation_image")
/* loaded from: classes6.dex */
public final class TreasureBoxAnimationImageSetting {
    public static final TreasureBoxAnimationImageSetting INSTANCE = new TreasureBoxAnimationImageSetting();

    @Group(isDefault = true, value = "default group")
    public static final List<Map<String, String>> DEFAULT = C47261Igj.LJJIJIIJI(C113554cx.LJJL(new OSZ("business_type", "1"), new OSZ("type_name", "shortTouchTreasureBox"), new OSZ("effect_url", "tlive_treasure_box_anim_pic.png"), new OSZ("short_touch", "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch%2Ftemplate.js")), C113554cx.LJJL(new OSZ("business_type", "2"), new OSZ("type_name", "shortTouchTreasureBox"), new OSZ("effect_url", "tlive_treasure_box_anim_pic.png"), new OSZ("short_touch", "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch%2Ftemplate.js")), C113554cx.LJJL(new OSZ("business_type", "3"), new OSZ("type_name", "shortTouchActivityShell"), new OSZ("effect_url", "ttlive_gbl_treasure_box_shell_push_in_image.png"), new OSZ("short_touch", "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_treasure_box%2Fpages%2Fshort_touch%2Ftemplate.js&landscape_screen_size_as_portrait=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Ftreasure_box")));

    public final List<Map<String, String>> getValue() {
        List<Map<String, String>> list = (List) SettingsManager.INSTANCE.getValueSafely(TreasureBoxAnimationImageSetting.class);
        if (list == null) {
            return DEFAULT;
        }
        return list;
    }

    public final List<Map<String, String>> getDEFAULT() {
        return DEFAULT;
    }
}
