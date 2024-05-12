package com.bytedance.ies.xbridge.platform.lynx;

import X.C03880Dg;
import X.C31889CfN;
import X.C65300Pk0;
import X.F19;
import X.InterfaceC37728ErM;
import Y.ARunnableS4S1300000_6;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LynxBridgeModule extends LynxModule {
    public static final F19 Companion = new F19();
    public static final String NAME = "LynxBridge";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxBridgeModule(Context context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @InterfaceC37728ErM
    public final void call(String func, ReadableMap params, Callback callback, C31889CfN xBridgeRegister) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {func, params, callback, xBridgeRegister};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;Lcom/bytedance/ies/xbridge/XBridgeRegister;)V", "2136893671888849984");
        if (c03880Dg.LIZJ(300002, "com/bytedance/ies/xbridge/platform/lynx/LynxBridgeModule", "call", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/bytedance/ies/xbridge/platform/lynx/LynxBridgeModule", "call", null, objArr, this, c65300Pk0, false);
            return;
        }
        o.LJIIJ(func, "func");
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        o.LJIIJ(xBridgeRegister, "xBridgeRegister");
        if (TextUtils.isEmpty(func)) {
            c03880Dg.LIZIZ(300002, "com/bytedance/ies/xbridge/platform/lynx/LynxBridgeModule", "call", null, objArr, this, c65300Pk0, true);
        } else {
            new Handler().post(new ARunnableS4S1300000_6(params, xBridgeRegister, callback, func, 0));
            c03880Dg.LIZIZ(300002, "com/bytedance/ies/xbridge/platform/lynx/LynxBridgeModule", "call", null, objArr, this, c65300Pk0, true);
        }
    }
}
