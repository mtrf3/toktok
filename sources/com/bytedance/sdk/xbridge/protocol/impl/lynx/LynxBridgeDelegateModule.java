package com.bytedance.sdk.xbridge.protocol.impl.lynx;

import X.C03880Dg;
import X.C16880lQ;
import X.C37887Etv;
import X.C37904EuC;
import X.C37905EuD;
import X.C37910EuI;
import X.C37911EuJ;
import X.C37936Eui;
import X.C37955Ev1;
import X.C37973EvJ;
import X.C37979EvP;
import X.C37981EvR;
import X.C38010Evu;
import X.C65300Pk0;
import X.EnumC37907EuF;
import X.InterfaceC37728ErM;
import X.PZL;
import X.VNU;
import X.X1D;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import java.util.Map;
import kotlin.jvm.internal.AqS110S0300000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LynxBridgeDelegateModule extends LynxContextModule {
    public static final C37981EvR Companion = new C37981EvR();
    public static final String NAME = "bridge";
    public final String TAG;
    public final C37979EvP bridgeThreadDispatcher;
    public final VNU context;
    public final Object obj;

    public final VNU getContext() {
        return this.context;
    }

    public final Object getObj() {
        return this.obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LynxBridgeDelegateModule(VNU context) {
        this(context, null);
        o.LJIIJ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxBridgeDelegateModule(VNU context, Object obj) {
        super(context, obj);
        o.LJIIJ(context, "context");
        this.context = context;
        this.obj = obj;
        this.TAG = "LynxBridgeDelegateModule";
        C37979EvP c37979EvP = C37905EuD.LJIIIZ;
        this.bridgeThreadDispatcher = c37979EvP == null ? new C37973EvJ() : c37979EvP;
    }

    @InterfaceC37728ErM
    public final void call(String bridgeName, ReadableMap readableMap, Callback callback) {
        String string;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {bridgeName, readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "-7035460981290866340");
        if (c03880Dg.LIZJ(300002, "com/bytedance/sdk/xbridge/protocol/impl/lynx/LynxBridgeDelegateModule", "call", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/lynx/LynxBridgeDelegateModule", "call", null, objArr, this, c65300Pk0, false);
            return;
        }
        o.LJIIJ(bridgeName, "bridgeName");
        Object obj = this.obj;
        if (obj instanceof C37904EuC) {
            if (((C37904EuC) obj).LJIIIZ.LIZLLL) {
                C37887Etv.LIZ(this.TAG, "Bridge is released. bridgeName = ".concat(bridgeName));
                c03880Dg.LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/lynx/LynxBridgeDelegateModule", "call", null, objArr, this, c65300Pk0, true);
                return;
            }
            C37887Etv.LIZ(this.TAG, "Bridge is alive. bridgeName = ".concat(bridgeName));
            C37955Ev1 c37955Ev1 = new C37955Ev1((C37904EuC) this.obj);
            c37955Ev1.LIZJ = "lynx";
            c37955Ev1.LIZLLL = bridgeName;
            c37955Ev1.LJI = readableMap;
            c37955Ev1.LIZIZ(EnumC37907EuF.Lynx);
            if (readableMap != null) {
                c37955Ev1.LJIIJ = readableMap.getLong("__timestamp", System.currentTimeMillis());
                try {
                    ReadableMap map = readableMap.getMap("data");
                    if (map == null || !map.hasKey("_jsb_secure_token")) {
                        string = readableMap.getString("_jsb_secure_token", "");
                        o.LJFF(string, "params.getString(\"_jsb_secure_token\", \"\")");
                    } else {
                        string = readableMap.getMap("data").getString("_jsb_secure_token", "");
                        o.LJFF(string, "params.getMap(\"data\").ge…(\"_jsb_secure_token\", \"\")");
                    }
                    c37955Ev1.LIZ = string;
                } catch (Exception e) {
                    c37955Ev1.LIZ = "";
                    C37936Eui c37936Eui = c37955Ev1.LJIJJLI;
                    String message = e.getMessage();
                    if (message != null) {
                        c37936Eui.LJFF.put("jsb_secure_token_getter_error", message);
                    } else {
                        c37936Eui.getClass();
                    }
                }
            }
            C37904EuC c37904EuC = (C37904EuC) this.obj;
            PZL LJIIIZ = c37904EuC.LIZJ.LJIIIZ(c37904EuC, c37955Ev1);
            if (!LJIIIZ.LIZ) {
                onLynxBridgeResult(C37910EuI.LIZ(-10, "intercepted by lifeClient, and reason is :" + LJIIIZ.LIZIZ, null), c37955Ev1, (C37904EuC) this.obj, false, callback);
                c03880Dg.LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/lynx/LynxBridgeDelegateModule", "call", null, objArr, this, c65300Pk0, true);
                return;
            }
            C37904EuC c37904EuC2 = (C37904EuC) this.obj;
            c37904EuC2.LIZJ.LJ(c37904EuC2, c37955Ev1);
            this.bridgeThreadDispatcher.LIZ(c37955Ev1, new AqS110S0300000_6(this, c37955Ev1, callback, 4));
        }
        c03880Dg.LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/lynx/LynxBridgeDelegateModule", "call", null, objArr, this, c65300Pk0, true);
    }

    public final void onLynxBridgeResult(C37911EuJ c37911EuJ, C37955Ev1 c37955Ev1, C37904EuC c37904EuC, boolean z, Callback callback) {
        JavaOnlyMap map;
        Boolean bool;
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBridgeResult,result:");
        LIZ.append(c37911EuJ);
        LIZ.append(",call:");
        LIZ.append(c37955Ev1);
        C37887Etv.LIZ(str, X1D.LIZIZ(LIZ));
        if (c37955Ev1 != null) {
            c37904EuC.LIZJ.LIZIZ(c37911EuJ, c37955Ev1, c37904EuC);
        }
        try {
            Object obj = c37911EuJ.LIZ;
            if (obj instanceof JavaOnlyMap) {
                map = (JavaOnlyMap) obj;
            } else if (obj instanceof JSONObject) {
                C38010Evu.LIZ.getClass();
                map = C38010Evu.LIZIZ((JSONObject) obj);
            } else if (obj instanceof Map) {
                map = JavaOnlyMap.from((Map) obj);
            } else {
                map = new JavaOnlyMap();
            }
            o.LJFF(map, "map");
            if (c37955Ev1 != null) {
                bool = c37955Ev1.LIZIZ;
            } else {
                bool = null;
            }
            map.put("_jsb_secure_token_checked", bool);
            if (c37955Ev1 != null) {
                c37955Ev1.LJJIIJZLJL = map;
                c37955Ev1.LJJIIZ = z;
                c37904EuC.LIZJ.LIZJ(c37955Ev1, c37911EuJ);
            }
            if (callback != null) {
                callback.invoke(map);
            }
            if (c37955Ev1 != null) {
                c37904EuC.LIZJ.LIZLLL(c37904EuC, c37955Ev1);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static /* synthetic */ void call$default(LynxBridgeDelegateModule lynxBridgeDelegateModule, String str, ReadableMap readableMap, Callback callback, int i, Object obj) {
        if ((i & 2) != 0) {
            readableMap = null;
        }
        if ((i & 4) != 0) {
            callback = null;
        }
        lynxBridgeDelegateModule.call(str, readableMap, callback);
    }
}
