package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C30733C4j;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.model.LiveBeautyParam;

@SettingsKey("live_beauty_param")
/* loaded from: classes6.dex */
public final class LiveBeautyParamSetting {
    public static final LiveBeautyParamSetting INSTANCE = new LiveBeautyParamSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveBeautyParam DEFAULT = new LiveBeautyParam();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C30733C4j.LJLIL);

    private final LiveBeautyParam getSettingValue() {
        return (LiveBeautyParam) settingValue$delegate.getValue();
    }

    public final float getBeautyParam() {
        return getSettingValue().beauty.scale * getSettingValue().beauty.def;
    }

    public final float getBigEyesParam() {
        return getSettingValue().bigEyes.scale * getSettingValue().bigEyes.def;
    }

    public final float getBrighteningParam() {
        return getSettingValue().brightening.scale * getSettingValue().brightening.def;
    }

    public final float getLiftParam() {
        return getSettingValue().lift.scale * getSettingValue().lift.def;
    }

    public final float getSharpParam() {
        return getSettingValue().sharp.scale * getSettingValue().sharp.def;
    }

    public final LiveBeautyParam getValue() {
        return getSettingValue();
    }
}
