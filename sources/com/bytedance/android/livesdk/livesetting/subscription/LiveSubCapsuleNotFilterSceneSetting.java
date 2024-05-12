package com.bytedance.android.livesdk.livesetting.subscription;

import X.C221108m2;
import X.C5H3;
import X.CBK;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_message_list_sub_capsule_audience_filter_allow_scenes")
/* loaded from: classes6.dex */
public final class LiveSubCapsuleNotFilterSceneSetting {
    public static final LiveSubCapsuleNotFilterSceneSetting INSTANCE = new LiveSubCapsuleNotFilterSceneSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = {"sub_gift_tiktok2user_notice"};
    public static final C5H3 value$delegate = C221108m2.LIZIZ(CBK.LJLIL);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final String[] getValue() {
        return (String[]) value$delegate.getValue();
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
