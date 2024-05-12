package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class UpdateRoomLayoutSettings extends F9E {

    @InterfaceC65349Pkn("rtc_ext_info")
    public String rtcExtInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateRoomLayoutSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.rtcExtInfo};
    }

    public UpdateRoomLayoutSettings(String str) {
        this.rtcExtInfo = str;
    }

    public /* synthetic */ UpdateRoomLayoutSettings(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
