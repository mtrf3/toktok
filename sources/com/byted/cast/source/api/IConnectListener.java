package com.byted.cast.source.api;

import com.byted.cast.source.browser.api.ByteLinkServiceInfo;

/* loaded from: classes29.dex */
public interface IConnectListener {
    void onConnect(ByteLinkServiceInfo byteLinkServiceInfo, int i);

    void onDisconnect(ByteLinkServiceInfo byteLinkServiceInfo, int i, int i2, String str);

    void onReadyToSwitch(ByteLinkServiceInfo byteLinkServiceInfo);
}
