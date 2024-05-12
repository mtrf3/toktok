package com.bytedance.android.livesdk.comp.api.subscription.base.flashcomponent.setting;

import X.C221108m2;
import X.C28263B7j;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import org.json.JSONObject;

@SettingsKey("flash_component_setting")
/* loaded from: classes6.dex */
public final class FlashComponentSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final FlashComponentSetting INSTANCE = new FlashComponentSetting();
    public static final C5H3 flashComponentSetting$delegate = C221108m2.LIZIZ(C28263B7j.LJLIL);

    public final JSONObject getFlashComponentSetting() {
        return (JSONObject) flashComponentSetting$delegate.getValue();
    }
}
