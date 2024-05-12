package com.ss.android.ugc.aweme.journey.step.lynx;

import X.C03880Dg;
import X.C40873G2j;
import X.C40874G2k;
import X.C40875G2l;
import X.C40877G2n;
import X.C40878G2o;
import X.C40881G2r;
import X.C65300Pk0;
import X.InterfaceC37728ErM;
import X.InterfaceC40880G2q;
import Y.ARunnableS17S0300000_6;
import android.content.Context;
import android.os.Handler;
import com.bytedance.keva.Keva;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LynxExperienceBridge extends LynxModule {
    public static final C40881G2r Companion = new C40881G2r();
    public static final Keva keva = Keva.getRepo("new_user_journey_flow");
    public final Handler handler;
    public final HashMap<String, InterfaceC40880G2q> methods;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxExperienceBridge(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.handler = new Handler(context.getMainLooper());
        HashMap<String, InterfaceC40880G2q> hashMap = new HashMap<>();
        this.methods = hashMap;
        C40875G2l c40875G2l = new C40875G2l();
        register(hashMap, new C40878G2o());
        register(hashMap, new C40877G2n());
        register(hashMap, c40875G2l);
        register(hashMap, new C40873G2j(c40875G2l));
        register(hashMap, new C40874G2k(c40875G2l));
    }

    public final void register(HashMap<String, InterfaceC40880G2q> hashMap, InterfaceC40880G2q method) {
        o.LJIIIZ(hashMap, "<this>");
        o.LJIIIZ(method, "method");
        hashMap.put(method.getName(), method);
    }

    @InterfaceC37728ErM
    public final void call(String function, ReadableMap params, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {function, params, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "-3723276367793047051");
        if (c03880Dg.LIZJ(300002, "com/ss/android/ugc/aweme/journey/step/lynx/LynxExperienceBridge", "call", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/ss/android/ugc/aweme/journey/step/lynx/LynxExperienceBridge", "call", null, objArr, this, c65300Pk0, false);
            return;
        }
        o.LJIIIZ(function, "function");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        InterfaceC40880G2q interfaceC40880G2q = this.methods.get(function);
        if (interfaceC40880G2q != null) {
            this.handler.post(new ARunnableS17S0300000_6(interfaceC40880G2q, params, callback, 6));
        }
        c03880Dg.LIZIZ(300002, "com/ss/android/ugc/aweme/journey/step/lynx/LynxExperienceBridge", "call", null, objArr, this, c65300Pk0, true);
    }
}
