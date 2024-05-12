package com.bytedance.android.livesdk.model.linksetting;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class RoomAudienceMultiGuestPermissionInfo extends F9E {

    @InterfaceC65349Pkn("permission_info")
    public MultiGuestPermissionInfo permissionInfo;

    @InterfaceC65349Pkn("room_pack_succ_flag")
    public boolean roomPackSuccessFlag;

    /* JADX WARN: Multi-variable type inference failed */
    public RoomAudienceMultiGuestPermissionInfo() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.roomPackSuccessFlag), this.permissionInfo};
    }

    public RoomAudienceMultiGuestPermissionInfo(boolean z, MultiGuestPermissionInfo multiGuestPermissionInfo) {
        this.roomPackSuccessFlag = z;
        this.permissionInfo = multiGuestPermissionInfo;
    }

    public /* synthetic */ RoomAudienceMultiGuestPermissionInfo(boolean z, MultiGuestPermissionInfo multiGuestPermissionInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : multiGuestPermissionInfo);
    }
}
