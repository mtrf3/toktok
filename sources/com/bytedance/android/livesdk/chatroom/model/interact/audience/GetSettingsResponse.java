package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class GetSettingsResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public LinkmicSettingResult data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    @Override // X.F9E
    public final Object[] getObjects() {
        LinkmicSettingResult linkmicSettingResult = this.data;
        return new Object[]{linkmicSettingResult, linkmicSettingResult};
    }
}
