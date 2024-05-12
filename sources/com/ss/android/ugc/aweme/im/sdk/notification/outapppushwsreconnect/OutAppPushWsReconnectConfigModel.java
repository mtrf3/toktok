package com.ss.android.ugc.aweme.im.sdk.notification.outapppushwsreconnect;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class OutAppPushWsReconnectConfigModel extends F9E {

    @InterfaceC65349Pkn("cache_size")
    public final int cache_size;

    @InterfaceC65349Pkn("mix_chain_fix_delay")
    public final int mix_chain_fix_delay;

    @InterfaceC65349Pkn("upload_event")
    public final boolean upload_event;

    @InterfaceC65349Pkn("ws_background_expire_time")
    public final int ws_background_expire_time;

    @InterfaceC65349Pkn("ws_foreground_expire_time")
    public final int ws_foreground_expire_time;

    @InterfaceC65349Pkn("ws_reconnect_delay")
    public final int ws_reconnect_delay;

    /* JADX WARN: Multi-variable type inference failed */
    public OutAppPushWsReconnectConfigModel() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.cache_size), Integer.valueOf(this.mix_chain_fix_delay), Boolean.valueOf(this.upload_event), Integer.valueOf(this.ws_reconnect_delay), Integer.valueOf(this.ws_foreground_expire_time), Integer.valueOf(this.ws_background_expire_time)};
    }

    public OutAppPushWsReconnectConfigModel(int i, int i2, boolean z, int i3, int i4, int i5) {
        this.cache_size = i;
        this.mix_chain_fix_delay = i2;
        this.upload_event = z;
        this.ws_reconnect_delay = i3;
        this.ws_foreground_expire_time = i4;
        this.ws_background_expire_time = i5;
    }

    public /* synthetic */ OutAppPushWsReconnectConfigModel(int i, int i2, boolean z, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 1000 : i, (i6 & 2) != 0 ? 1000 : i2, (i6 & 4) != 0 ? false : z, (i6 & 8) == 0 ? i3 : 1000, (i6 & 16) != 0 ? 800000 : i4, (i6 & 32) != 0 ? 1750000 : i5);
    }
}
