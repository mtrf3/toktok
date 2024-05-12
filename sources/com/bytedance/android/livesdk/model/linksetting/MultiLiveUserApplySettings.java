package com.bytedance.android.livesdk.model.linksetting;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.liveinteract.multilive.model.RoomHostMultiGuestPermissionInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import webcast.data.RoomMultiGuestLinkmicInfo;

/* loaded from: classes14.dex */
public final class MultiLiveUserApplySettings extends F9E {

    @InterfaceC65349Pkn("host_multi_guest_dev_mode")
    public long hostMultiGuestDevMode;

    @InterfaceC65349Pkn("linkmic_service_version")
    public Integer linkMicServiceVersion;

    @InterfaceC65349Pkn("user_settings")
    public MultiLiveUserApplyPermission multiLiveUserApplyPermission;

    @InterfaceC65349Pkn("room_audience_multi_guest_permission_info")
    public RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;

    @InterfaceC65349Pkn("room_host_multi_guest_permission_info")
    public RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo;

    @InterfaceC65349Pkn("room_multi_guest_linkmic_info")
    public RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;

    @InterfaceC65349Pkn("try_open_multi_guest_when_create_room")
    public boolean tryOpenMultiGuest;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiLiveUserApplySettings() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 127, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.multiLiveUserApplyPermission, this.linkMicServiceVersion, this.roomHostMultiGuestPermissionInfo, Boolean.valueOf(this.tryOpenMultiGuest), this.roomAudienceMultiGuestPermissionInfo, this.roomMultiGuestLinkmicInfo, Long.valueOf(this.hostMultiGuestDevMode)};
    }

    public MultiLiveUserApplySettings(MultiLiveUserApplyPermission multiLiveUserApplyPermission, Integer num, RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo, boolean z, RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo, RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo, long j) {
        this.multiLiveUserApplyPermission = multiLiveUserApplyPermission;
        this.linkMicServiceVersion = num;
        this.roomHostMultiGuestPermissionInfo = roomHostMultiGuestPermissionInfo;
        this.tryOpenMultiGuest = z;
        this.roomAudienceMultiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo;
        this.roomMultiGuestLinkmicInfo = roomMultiGuestLinkmicInfo;
        this.hostMultiGuestDevMode = j;
    }

    public /* synthetic */ MultiLiveUserApplySettings(MultiLiveUserApplyPermission multiLiveUserApplyPermission, Integer num, RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo, boolean z, RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo, RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : multiLiveUserApplyPermission, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : roomHostMultiGuestPermissionInfo, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : roomAudienceMultiGuestPermissionInfo, (i & 32) == 0 ? roomMultiGuestLinkmicInfo : null, (i & 64) != 0 ? 0L : j);
    }
}
