package com.bytedance.pitaya.bdcomponentimpl.network;

import X.InterfaceC93315aOt;
import com.bytedance.pitaya.thirdcomponent.net.IWebSocket;
import com.bytedance.pitaya.thirdcomponent.net.WebSocketCreator;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class OKHttpSocketCreator implements WebSocketCreator {
    @Override // com.bytedance.pitaya.thirdcomponent.net.WebSocketCreator
    public IWebSocket createWebSocket(String url, InterfaceC93315aOt interfaceC93315aOt) {
        o.LJIIJ(url, "url");
        return new OKHttpWebSocketImpl(url, interfaceC93315aOt);
    }
}
