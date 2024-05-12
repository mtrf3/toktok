package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C28596BKe;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_follow_draw_show_animation")
/* loaded from: classes6.dex */
public final class LiveDrawShowAnimationSetting {
    public static final LiveDrawShowAnimationSetting INSTANCE = new LiveDrawShowAnimationSetting();

    @Group(isDefault = true, value = "default")
    public static final String[] DEFAULT = new String[0];
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(C28596BKe.LJLIL);

    public final String[] getCurrentValue() {
        return (String[]) currentValue$delegate.getValue();
    }
}
