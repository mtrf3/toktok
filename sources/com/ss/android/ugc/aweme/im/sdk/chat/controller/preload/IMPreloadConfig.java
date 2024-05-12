package com.ss.android.ugc.aweme.im.sdk.chat.controller.preload;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class IMPreloadConfig extends F9E {

    @InterfaceC65349Pkn("preload_chat_scroll_count")
    public final int chatScrollCount;

    @InterfaceC65349Pkn("preload_max_count_per_conversation")
    public final int maxCountPerConversation;

    @InterfaceC65349Pkn("preload_image_monitor_switch_on")
    public final boolean preloadImageMonitorSwitchOn;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.chatScrollCount), Integer.valueOf(this.maxCountPerConversation), Boolean.valueOf(this.preloadImageMonitorSwitchOn)};
    }

    public IMPreloadConfig(int i, int i2, boolean z) {
        this.chatScrollCount = i;
        this.maxCountPerConversation = i2;
        this.preloadImageMonitorSwitchOn = z;
    }
}
