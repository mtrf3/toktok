package com.bytedance.android.livesdk.usermanage;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OHQ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class UpdateAdminParams extends F9E {

    @InterfaceC65349Pkn("update_type")
    public int adminType;

    @InterfaceC65349Pkn("anchor_id")
    public long anchorId;

    @InterfaceC65349Pkn(OHQ.LIZIZ)
    public Map<Integer, Integer> permissions;

    @InterfaceC65349Pkn("current_room_id")
    public long roomId;

    @InterfaceC65349Pkn("to_user_id")
    public long userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.adminType), Long.valueOf(this.userId), Long.valueOf(this.anchorId), Long.valueOf(this.roomId), this.permissions};
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public UpdateAdminParams(int i, long j, long j2, long j3, Map<Integer, Integer> map) {
        o.LJIIIZ(map, OHQ.LIZIZ);
        this.adminType = i;
        this.userId = j;
        this.anchorId = j2;
        this.roomId = j3;
        this.permissions = map;
    }
}
