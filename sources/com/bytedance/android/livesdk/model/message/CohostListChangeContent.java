package com.bytedance.android.livesdk.model.message;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import java.util.List;

/* loaded from: classes14.dex */
public final class CohostListChangeContent extends F9E {

    @InterfaceC65349Pkn("users")
    public List<CohostListUser> users;

    @Override // X.F9E
    public final Object[] getObjects() {
        List<CohostListUser> list = this.users;
        return new Object[]{list, list};
    }
}
