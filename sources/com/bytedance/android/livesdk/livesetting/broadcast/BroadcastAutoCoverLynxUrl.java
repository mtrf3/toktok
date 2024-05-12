package com.bytedance.android.livesdk.livesetting.broadcast;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.o;

@SettingsKey("live_game_force_screenshot_schema")
/* loaded from: classes6.dex */
public final class BroadcastAutoCoverLynxUrl {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_poll%2Fpoll%2Fpages%2Fcustom-poll%2Fmain%2Ftemplate.js&type=popup&radius=8&gravity=bottom&transition_animation=bottom&use_spark=1&hide_nav_bar=1&hide_status_bar=0&keyboard_adjust=1&hide_loading=1&disable_back_press=0";
    public static final BroadcastAutoCoverLynxUrl INSTANCE = new BroadcastAutoCoverLynxUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(BroadcastAutoCoverLynxUrl.class);
    }

    public final String getMain() {
        String value = getValue();
        if (TextUtils.isEmpty(value)) {
            return "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_poll%2Fpoll%2Fpages%2Fcustom-poll%2Fmain%2Ftemplate.js&type=popup&radius=8&gravity=bottom&transition_animation=bottom&use_spark=1&hide_nav_bar=1&hide_status_bar=0&keyboard_adjust=1&hide_loading=1&disable_back_press=0";
        }
        try {
            new o();
            String LJJIFFI = o.LIZ(value).LJIIZILJ().LJJIJ("main").LJJIFFI();
            kotlin.jvm.internal.o.LJIIIIZZ(LJJIFFI, "jsonParser.parse(str).as…ject.get(\"main\").asString");
            return LJJIFFI;
        } catch (Exception unused) {
            return "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_poll%2Fpoll%2Fpages%2Fcustom-poll%2Fmain%2Ftemplate.js&type=popup&radius=8&gravity=bottom&transition_animation=bottom&use_spark=1&hide_nav_bar=1&hide_status_bar=0&keyboard_adjust=1&hide_loading=1&disable_back_press=0";
        }
    }
}
