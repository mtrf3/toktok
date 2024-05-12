package com.lynx.jsbridge;

import X.C03880Dg;
import X.C16880lQ;
import X.C65300Pk0;
import X.HandlerC39977FmX;
import X.InterfaceC37728ErM;
import X.InterfaceC39978FmY;
import Y.ARunnableS25S0200000_6;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class NetworkingModule extends LynxModule implements InterfaceC39978FmY {
    public static final String NAME = "NetworkingModule";
    public WeakReference<Handler> mHandler;

    @Override // X.InterfaceC39978FmY
    public void handleMsg(Message message) {
    }

    public NetworkingModule(Context context) {
        super(context);
        this.mHandler = new WeakReference<>(new HandlerC39977FmX(C16880lQ.LLJJJJ(), this));
    }

    @InterfaceC37728ErM
    public void request(ReadableMap readableMap, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "5451974078741760851");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/NetworkingModule", "request", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/NetworkingModule", "request", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (this.mHandler.get() != null) {
            this.mHandler.get().post(new ARunnableS25S0200000_6(callback, readableMap, 6));
        }
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/NetworkingModule", "request", null, objArr, this, c65300Pk0, true);
    }
}
