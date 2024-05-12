package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class SettingABTestInfo extends F9E {

    @InterfaceC65349Pkn("use_new_layout_setting")
    public Boolean useNewLayoutSetting;

    @Override // X.F9E
    public final Object[] getObjects() {
        Boolean bool = this.useNewLayoutSetting;
        return new Object[]{bool, bool};
    }
}
