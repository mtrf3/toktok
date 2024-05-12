package com.bytedance.pitaya.thirdcomponent.net;

import X.InterfaceC93315aOt;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public abstract class IWebSocket implements ReflectionCall {
    public final InterfaceC93315aOt stateCallback;
    public final String url;

    public abstract void close();

    public InterfaceC93315aOt getStateCallback() {
        return null;
    }

    public abstract void open();

    public abstract void sendMessage(String str);

    public String getUrl() {
        return this.url;
    }

    public IWebSocket(String url, InterfaceC93315aOt interfaceC93315aOt) {
        o.LJIIJ(url, "url");
        this.url = url;
    }
}
