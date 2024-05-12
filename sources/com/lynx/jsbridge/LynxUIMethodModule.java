package com.lynx.jsbridge;

import X.C03880Dg;
import X.C39547Ffb;
import X.C39548Ffc;
import X.C65300Pk0;
import X.C79411VEp;
import X.InterfaceC37728ErM;
import X.VNU;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes7.dex */
public class LynxUIMethodModule extends LynxContextModule {
    public static final String NAME = "LynxUIMethodModule";

    public LynxUIMethodModule(VNU vnu) {
        super(vnu);
    }

    public static Callback wrapCallback(Callback callback) {
        return new C39547Ffb(callback);
    }

    @InterfaceC37728ErM
    public void invokeUIMethod(String str, ReadableArray readableArray, String str2, ReadableMap readableMap, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, readableArray, str2, readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableArray;Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "-5632286116616274101");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxUIMethodModule", "invokeUIMethod", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxUIMethodModule", "invokeUIMethod", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new C39548Ffc(this, this.mLynxContext, str, readableArray, str2, readableMap, callback));
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxUIMethodModule", "invokeUIMethod", null, objArr, this, c65300Pk0, true);
        }
    }
}
