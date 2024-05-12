package com.bytedance.android.livesdk.model.linksetting;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.util.ArrayMap;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiLiveUserSettings extends F9E {

    @InterfaceC65349Pkn("linkmic_scene_linker")
    public ArrayMap<Integer, Long> channelMap;

    @InterfaceC65349Pkn("cohost")
    public CoHost coHost;

    @InterfaceC65349Pkn("multi_live")
    public MultiLiveUserApplySettings multiLiveUserApplySettings;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiLiveUserSettings() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.multiLiveUserApplySettings, this.channelMap, this.coHost};
    }

    public final long L() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        Long valueOf;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        if (multiLiveUserApplySettings != null && (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) != null && (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) != null && (valueOf = Long.valueOf(multiGuestPermissionInfo.errCode)) != null) {
            return valueOf.longValue();
        }
        return 0L;
    }

    public final String M() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        String str;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        if (multiLiveUserApplySettings == null || (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) == null || (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) == null || (str = multiGuestPermissionInfo.noPermissionPrompt) == null) {
            return "";
        }
        return str;
    }

    public final boolean N() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        if (multiLiveUserApplySettings == null || (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) == null || !roomAudienceMultiGuestPermissionInfo.roomPackSuccessFlag) {
            return false;
        }
        MultiGuestPermissionInfo multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo;
        if (multiGuestPermissionInfo != null && multiGuestPermissionInfo.errCode == 0) {
            return false;
        }
        return true;
    }

    public final boolean O() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        if (multiLiveUserApplySettings == null || (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) == null || !roomAudienceMultiGuestPermissionInfo.roomPackSuccessFlag || (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) == null || multiGuestPermissionInfo.errCode != 0) {
            return false;
        }
        return true;
    }

    public final boolean P() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        if (multiLiveUserApplySettings != null && (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) != null && roomAudienceMultiGuestPermissionInfo.permissionInfo != null) {
            return true;
        }
        return false;
    }

    public MultiLiveUserSettings(MultiLiveUserApplySettings multiLiveUserApplySettings, ArrayMap<Integer, Long> channelMap, CoHost coHost) {
        o.LJIIIZ(channelMap, "channelMap");
        this.multiLiveUserApplySettings = multiLiveUserApplySettings;
        this.channelMap = channelMap;
        this.coHost = coHost;
    }

    public /* synthetic */ MultiLiveUserSettings(MultiLiveUserApplySettings multiLiveUserApplySettings, ArrayMap arrayMap, CoHost coHost, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : multiLiveUserApplySettings, (i & 2) != 0 ? new ArrayMap() : arrayMap, (i & 4) != 0 ? null : coHost);
    }
}
