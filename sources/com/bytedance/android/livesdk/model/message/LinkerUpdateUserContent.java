package com.bytedance.android.livesdk.model.message;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.Map;

/* loaded from: classes14.dex */
public final class LinkerUpdateUserContent extends F9E {

    @InterfaceC65349Pkn("from_user_id")
    public Long fromUserId;

    @InterfaceC65349Pkn("to_user_id")
    public Long toUserId;

    @InterfaceC65349Pkn("update_info")
    public Map<String, String> updateInfo;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.fromUserId;
        Long l2 = this.toUserId;
        Map<String, String> map = this.updateInfo;
        return new Object[]{l, l, l2, l2, map, map, map};
    }
}
