package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import X.C221108m2;
import X.C58520Mxw;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("audience_widget_lazy_load")
/* loaded from: classes11.dex */
public final class AudienceWidgetLazyLoadSetting {

    @Group(isDefault = true, value = "disable")
    public static final boolean DEFAULT = false;
    public static final AudienceWidgetLazyLoadSetting INSTANCE = new AudienceWidgetLazyLoadSetting();

    @Group("enable")
    public static final boolean ENABLE = true;
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C58520Mxw.LJLIL);

    public final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
