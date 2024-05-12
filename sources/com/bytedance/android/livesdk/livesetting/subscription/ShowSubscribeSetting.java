package com.bytedance.android.livesdk.livesetting.subscription;

import X.C221108m2;
import X.C58480MxI;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlive_show_subscribe")
/* loaded from: classes11.dex */
public final class ShowSubscribeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final ShowSubscribeSetting INSTANCE = new ShowSubscribeSetting();
    public static final C5H3 show$delegate = C221108m2.LIZIZ(C58480MxI.LJLIL);

    public final boolean getShow() {
        return ((Boolean) show$delegate.getValue()).booleanValue();
    }
}
