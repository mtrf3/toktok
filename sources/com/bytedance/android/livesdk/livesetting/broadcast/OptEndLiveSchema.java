package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("end_live_schema")
/* loaded from: classes6.dex */
public final class OptEndLiveSchema {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://lynxview?hide_loading=1&__live_platform__=webcast&target_handler=webcast&fallback_url=https://webcast.tiktokv.com/falcon/webcast_mt/page/end_live/index.html?live_enter_from=&anchor_avatar=https://p16-sign-va.tiktokcdn.com/musically-maliva-obj/1594805258216454~c5_1080x1080.webp?x-expires=1665738000&x-signature=EXBFnw2X81hPjkJCbO9LlTk6Irk%3D&user_id=7112264435875873794&room_id=7153552010204252930&aid=1233&live_type=video_live&url=https://lf21-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/tiktok_live_fundamental_end_live/end-live/pages/main/template.js?live_enter_from=&anchor_avatar=https://p16-sign-va.tiktokcdn.com/musically-maliva-obj/1594805258216454~c5_1080x1080.webp?x-expires=1665738000&x-signature=EXBFnw2X81hPjkJCbO9LlTk6Irk%3D&user_id=7112264435875873794&room_id=7153552010204252930&aid=1233&live_type=video_live";
    public static final OptEndLiveSchema INSTANCE = new OptEndLiveSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(OptEndLiveSchema.class);
    }
}
