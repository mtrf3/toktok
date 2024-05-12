package com.lynx.net;

import X.C03880Dg;
import X.C64493PSv;
import X.C65300Pk0;
import X.F9O;
import X.InterfaceC37728ErM;
import android.content.Context;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.network.HttpRequest;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;

/* loaded from: classes7.dex */
public class NetworkModule extends LynxModule {
    public static final String NAME = "__LynxNetwork";

    public NetworkModule(Context context) {
        super(context);
    }

    @InterfaceC37728ErM
    public void call(HttpRequest httpRequest, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {httpRequest, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/jsbridge/network/HttpRequest;Lcom/lynx/react/bridge/Callback;)V", "-8627917330938392194");
        if (c03880Dg.LIZJ(300002, "com/lynx/net/NetworkModule", "call", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/net/NetworkModule", "call", null, objArr, this, c65300Pk0, false);
            return;
        }
        LLog.LIZLLL(2, "NetworkModule", "call http request with url: " + httpRequest.LIZIZ);
        TraceEvent.LIZIZ("NetworkModule.call");
        C64493PSv.LIZJ().execute(new F9O(httpRequest, callback));
        TraceEvent.LJ("NetworkModule.call");
        c03880Dg.LIZIZ(300002, "com/lynx/net/NetworkModule", "call", null, objArr, this, c65300Pk0, true);
    }
}
