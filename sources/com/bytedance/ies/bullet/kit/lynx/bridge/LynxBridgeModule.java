package com.bytedance.ies.bullet.kit.lynx.bridge;

import X.C03880Dg;
import X.C10K;
import X.C141335gf;
import X.C221108m2;
import X.C37870Ete;
import X.C37905EuD;
import X.C38184Eyi;
import X.C38197Eyv;
import X.C38200Eyy;
import X.C39973FmT;
import X.C39976FmW;
import X.C3C5;
import X.C5H3;
import X.C60292NlQ;
import X.C65300Pk0;
import X.CallableC38194Eys;
import X.EnumC39958FmE;
import X.F21;
import X.F3T;
import X.InterfaceC37728ErM;
import X.InterfaceC38157EyH;
import X.InterfaceC38196Eyu;
import X.InterfaceC39974FmU;
import X.InterfaceC40516FvE;
import X.VNS;
import X.VNU;
import X.X1D;
import Y.ACallableS33S1100000_6;
import Y.ACallableS35S1200000_6;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.xbridge.protocol.impl.lynx.LynxBridgeDelegateModule;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LynxBridgeModule extends LynxModule implements InterfaceC39974FmU {
    public static final C38200Eyy Companion = new C38200Eyy();
    public static final String NAME = "bridge";
    public C37905EuD bdxBridge;
    public LynxBridgeDelegateModule bdxLynxModule;
    public final C5H3 loggerWrapper$delegate;
    public final F3T providerFactory;

    @Override // X.InterfaceC39974FmU
    public C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.loggerWrapper$delegate.getValue();
    }

    public final InterfaceC38196Eyu getBridgeRegistry() {
        F3T f3t = this.providerFactory;
        if (f3t != null) {
            return (InterfaceC38196Eyu) f3t.LIZJ(InterfaceC38196Eyu.class);
        }
        return null;
    }

    public final C60292NlQ getKitInstanceApi() {
        InterfaceC40516FvE interfaceC40516FvE;
        F3T f3t = this.providerFactory;
        InterfaceC40516FvE interfaceC40516FvE2 = null;
        if (f3t != null) {
            interfaceC40516FvE = (InterfaceC40516FvE) f3t.LIZJ(InterfaceC40516FvE.class);
        } else {
            interfaceC40516FvE = null;
        }
        if (interfaceC40516FvE instanceof C60292NlQ) {
            interfaceC40516FvE2 = interfaceC40516FvE;
        }
        return (C60292NlQ) interfaceC40516FvE2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxBridgeModule(Context context, Object param) {
        super(context, param);
        VNS vns;
        VNU lynxContext;
        String str;
        F21 f21;
        o.LJIIJ(context, "context");
        o.LJIIJ(param, "param");
        F3T f3t = (F3T) (param instanceof F3T ? param : null);
        this.providerFactory = f3t;
        this.loggerWrapper$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 13));
        InterfaceC38157EyH interfaceC38157EyH = C37905EuD.LJFF;
        if (interfaceC38157EyH != null) {
            interfaceC38157EyH.LJIILLIIL();
        }
        if (C37905EuD.LJII && f3t != null && (vns = (VNS) f3t.LIZJ(VNS.class)) != null && (lynxContext = vns.getLynxContext()) != null) {
            C37905EuD c37905EuD = new C37905EuD();
            this.bdxBridge = c37905EuD;
            C60292NlQ kitInstanceApi = getKitInstanceApi();
            if (kitInstanceApi != null && (f21 = kitInstanceApi.LLD) != null) {
                str = f21.LJLIL;
            } else {
                str = null;
            }
            c37905EuD.LIZIZ(vns, str, false);
            C37905EuD c37905EuD2 = this.bdxBridge;
            this.bdxLynxModule = new LynxBridgeDelegateModule(lynxContext, c37905EuD2 != null ? c37905EuD2.LIZ.LIZ : null);
            C37905EuD c37905EuD3 = this.bdxBridge;
            if (c37905EuD3 != null) {
                c37905EuD3.LIZLLL("bullet", new C37870Ete(this));
            }
            vns.addLynxViewClient(new C38197Eyv(this));
        }
    }

    private final void doMonitorLog(String str, String str2) {
        C10K.LIZJ(new ACallableS33S1100000_6(this, str, 0));
    }

    public final String composeErrorMessage(String message, int i) {
        o.LJIIJ(message, "message");
        try {
            String jSONObject = new JSONObject().putOpt("message", message).putOpt("code", Integer.valueOf(i)).toString();
            o.LJFF(jSONObject, "JSONObject()\n           …              .toString()");
            return jSONObject;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return message;
        }
    }

    public final void onReady(C38184Eyi c38184Eyi, String str) {
        C10K.LIZJ(new ACallableS35S1200000_6(this, c38184Eyi, str, 0));
    }

    public final ReadableMap optMap(ReadableMap optMap, String key) {
        ReadableMap javaOnlyMap;
        o.LJIIJ(optMap, "$this$optMap");
        o.LJIIJ(key, "key");
        try {
            if (optMap.hasKey(key)) {
                javaOnlyMap = optMap.getMap(key);
                o.LJFF(javaOnlyMap, "this.getMap(key)");
            } else {
                javaOnlyMap = new JavaOnlyMap();
            }
            return javaOnlyMap;
        } catch (Exception unused) {
            return new JavaOnlyMap();
        }
    }

    @Override // X.InterfaceC39974FmU
    public void printReject(Throwable e, String extraMsg) {
        o.LJIIJ(e, "e");
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, e, extraMsg);
    }

    @InterfaceC37728ErM
    public final void call(String func, ReadableMap params, Callback callback) {
        LynxBridgeDelegateModule lynxBridgeDelegateModule;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {func, params, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "-2355042258359040170");
        if (c03880Dg.LIZJ(300002, "com/bytedance/ies/bullet/kit/lynx/bridge/LynxBridgeModule", "call", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/bytedance/ies/bullet/kit/lynx/bridge/LynxBridgeModule", "call", null, objArr, this, c65300Pk0, false);
            return;
        }
        o.LJIIJ(func, "func");
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        InterfaceC38157EyH interfaceC38157EyH = C37905EuD.LJFF;
        if (interfaceC38157EyH != null) {
            interfaceC38157EyH.LJIILLIIL();
        }
        if (C37905EuD.LJII && this.bdxBridge != null && (lynxBridgeDelegateModule = this.bdxLynxModule) != null) {
            lynxBridgeDelegateModule.call(func, params, callback);
        } else {
            originCall(func, params, callback);
        }
        c03880Dg.LIZIZ(300002, "com/bytedance/ies/bullet/kit/lynx/bridge/LynxBridgeModule", "call", null, objArr, this, c65300Pk0, true);
    }

    public final boolean optBoolean(ReadableMap optBoolean, String key, boolean z) {
        o.LJIIJ(optBoolean, "$this$optBoolean");
        o.LJIIJ(key, "key");
        try {
            if (optBoolean.hasKey(key)) {
                return optBoolean.getBoolean(key);
            }
            return z;
        } catch (Exception unused) {
            return z;
        }
    }

    public final void originCall(String func, ReadableMap params, Callback callback) {
        ReadableMap readableMap;
        Executor executor;
        o.LJIIJ(func, "func");
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        if (TextUtils.isEmpty(func)) {
            return;
        }
        if (getBridgeRegistry() == null) {
            C39973FmT.LIZIZ(this, "Bridge Registry is Empty", null, null, 6);
            return;
        }
        InterfaceC38196Eyu bridgeRegistry = getBridgeRegistry();
        if (bridgeRegistry != null) {
            if (bridgeRegistry.i9()) {
                C39973FmT.LIZIZ(this, "Bridge Registry has released", null, null, 6);
                return;
            }
            C38184Eyi c38184Eyi = new C38184Eyi();
            long currentTimeMillis = System.currentTimeMillis();
            c38184Eyi.LIZ = currentTimeMillis;
            c38184Eyi.LIZIZ = currentTimeMillis;
            if (params.hasKey("data")) {
                readableMap = optMap(params, "data");
            } else {
                readableMap = params;
            }
            boolean optBoolean = optBoolean(readableMap, "useUIThread", true);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("call lynx jsb func: ");
            LIZ.append(func);
            LIZ.append(" on useUIThread=");
            LIZ.append(optBoolean);
            C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
            CallableC38194Eys callableC38194Eys = new CallableC38194Eys(this, c38184Eyi, func, params, callback);
            if (optBoolean) {
                executor = C10K.LJIIIIZZ;
            } else {
                executor = C10K.LJI;
            }
            C10K.LIZIZ(callableC38194Eys, executor, null);
            doMonitorLog(func, "unknown");
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.InterfaceC39974FmU
    public void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }

    public static /* synthetic */ void doMonitorLog$default(LynxBridgeModule lynxBridgeModule, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        lynxBridgeModule.doMonitorLog(str, str2);
    }
}
