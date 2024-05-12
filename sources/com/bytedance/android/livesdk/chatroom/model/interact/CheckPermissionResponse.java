package com.bytedance.android.livesdk.chatroom.model.interact;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CheckPermissionResponse extends F9E {

    @InterfaceC65349Pkn("anchor_onboard_permit")
    public boolean anchorOnboardPermit;

    @InterfaceC65349Pkn("mutli_host_permission")
    public boolean multiHostPermission;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CheckPermissionResponse() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.multiHostPermission), Boolean.valueOf(this.anchorOnboardPermit)};
    }

    public CheckPermissionResponse(boolean z, boolean z2) {
        this.multiHostPermission = z;
        this.anchorOnboardPermit = z2;
    }

    public /* synthetic */ CheckPermissionResponse(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
