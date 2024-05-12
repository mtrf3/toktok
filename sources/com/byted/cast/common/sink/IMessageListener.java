package com.byted.cast.common.sink;

/* loaded from: classes29.dex */
public interface IMessageListener {
    void onMessage(ServiceInfo serviceInfo, String str);

    String onMessageSync(String str);
}
