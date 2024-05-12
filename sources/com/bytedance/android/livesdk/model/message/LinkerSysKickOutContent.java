package com.bytedance.android.livesdk.model.message;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class LinkerSysKickOutContent extends F9E {

    @InterfaceC65349Pkn("linkmic_id_str")
    public String linkmicIdStr;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.userId;
        String str = this.linkmicIdStr;
        return new Object[]{l, l, str, str};
    }
}
