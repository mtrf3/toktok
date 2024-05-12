package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkLayerListUser extends F9E {

    @InterfaceC65349Pkn("app_version")
    public String appVersion;

    @InterfaceC65349Pkn("linkmic_id")
    public String linkMicId;

    @InterfaceC65349Pkn("user")
    public Player linkUser;

    @InterfaceC65349Pkn("linked_time_nano")
    public long linkedTimeNano;

    @InterfaceC65349Pkn("pos")
    public MicPositionData positionData;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkLayerListUser() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.linkUser, this.linkMicId, this.positionData, Long.valueOf(this.linkedTimeNano), this.appVersion};
    }

    public LinkLayerListUser(Player player, String linkMicId, MicPositionData micPositionData, long j, String appVersion) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(appVersion, "appVersion");
        this.linkUser = player;
        this.linkMicId = linkMicId;
        this.positionData = micPositionData;
        this.linkedTimeNano = j;
        this.appVersion = appVersion;
    }

    public /* synthetic */ LinkLayerListUser(Player player, String str, MicPositionData micPositionData, long j, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : player, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? micPositionData : null, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? str2 : "");
    }
}
