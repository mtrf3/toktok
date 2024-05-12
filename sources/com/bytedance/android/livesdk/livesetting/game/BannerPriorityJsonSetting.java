package com.bytedance.android.livesdk.livesetting.game;

import X.C09650Zl;
import X.C221108m2;
import X.C5H3;
import X.C62;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;

@SettingsKey("ttlive_game_guide_banner_priority_mapping")
/* loaded from: classes6.dex */
public final class BannerPriorityJsonSetting {

    @Group(isDefault = true, value = "default_group")
    public static final BannerPriorityConfig DEFAULT;
    public static final BannerPriorityJsonSetting INSTANCE = new BannerPriorityJsonSetting();
    public static final C5H3 bannerPriorityConfig$delegate;

    static {
        BannerPriorityConfig bannerPriorityConfig;
        try {
            bannerPriorityConfig = (BannerPriorityConfig) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, "\n    {\n        \"game_banner_list\":[\n            {\n                \"name\":\"game_gpppa_ban_banner\",\n                \"priority\":12,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"lop_banner\",\n                \"priority\":20,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"replay_banner\",\n                \"priority\":33,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"samsung_interruption_guide_banner\",\n                \"priority\":40,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"game_live_new_broadcast_education_banner\",\n                \"priority\":44,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"highlight_banner\",\n                \"priority\":55,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"live_studio_launch_banner\",\n                \"priority\":66,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"custom_banner\",\n                \"priority\":100,\n                \"compatible\":true\n            }\n        ],\n        \"obs_banner_list\":[\n            {\n                \"name\":\"game_gpppa_ban_banner\",\n                \"priority\":12,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"replay_banner\",\n                \"priority\":33,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"obs_live_new_broadcast_education_banner\",\n                \"priority\":44,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"highlight_banner\",\n                \"priority\":55,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"live_studio_launch_banner\",\n                \"priority\":66,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"custom_banner\",\n                \"priority\":100,\n                \"compatible\":true\n            }\n        ],\n        \"live_studio_banner_list\":[\n            {\n                \"name\":\"custom_banner\",\n                \"priority\":100,\n                \"compatible\":true\n            }\n        ],\n        \"live_studio_banner_count\":1,\n        \"game_banner_count\":1,\n        \"obs_banner_count\":1\n    }\n    ", BannerPriorityConfig.class);
        } catch (s unused) {
            bannerPriorityConfig = null;
        }
        DEFAULT = bannerPriorityConfig;
        bannerPriorityConfig$delegate = C221108m2.LIZIZ(C62.LJLIL);
    }

    public final BannerPriorityConfig getBannerPriorityConfig() {
        return (BannerPriorityConfig) bannerPriorityConfig$delegate.getValue();
    }

    public final BannerPriorityConfig getDEFAULT() {
        return DEFAULT;
    }
}
