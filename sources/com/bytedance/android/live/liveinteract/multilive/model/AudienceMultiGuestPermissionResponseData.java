package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class AudienceMultiGuestPermissionResponseData extends F9E {

    @InterfaceC65349Pkn("permission_info")
    public MultiGuestPermissionInfo permissionInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public AudienceMultiGuestPermissionResponseData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.permissionInfo};
    }

    public final boolean L() {
        MultiGuestPermissionInfo multiGuestPermissionInfo = this.permissionInfo;
        if (multiGuestPermissionInfo == null || multiGuestPermissionInfo.errCode != 0 || multiGuestPermissionInfo.linkPermissionType == null) {
            return false;
        }
        return true;
    }

    public AudienceMultiGuestPermissionResponseData(MultiGuestPermissionInfo multiGuestPermissionInfo) {
        this.permissionInfo = multiGuestPermissionInfo;
    }

    public /* synthetic */ AudienceMultiGuestPermissionResponseData(MultiGuestPermissionInfo multiGuestPermissionInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : multiGuestPermissionInfo);
    }
}
