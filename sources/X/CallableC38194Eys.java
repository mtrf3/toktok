package X;

import Y.AObjectS29S0000000_6;
import android.os.SystemClock;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Eys, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC38194Eys<V> implements Callable<C76800UCe> {
    public final /* synthetic */ LynxBridgeModule LJLIL;
    public final /* synthetic */ C38184Eyi LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ReadableMap LJLJJI;
    public final /* synthetic */ Callback LJLJJL;

    public CallableC38194Eys(LynxBridgeModule lynxBridgeModule, C38184Eyi c38184Eyi, String str, ReadableMap readableMap, Callback callback) {
        this.LJLIL = lynxBridgeModule;
        this.LJLILLLLZI = c38184Eyi;
        this.LJLJI = str;
        this.LJLJJI = readableMap;
        this.LJLJJL = callback;
    }

    @Override // java.util.concurrent.Callable
    public final C76800UCe call() {
        VNS vns;
        InterfaceC38217EzF ti;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        F3T f3t = this.LJLIL.providerFactory;
        C76800UCe c76800UCe = null;
        if (f3t != null) {
            vns = (VNS) f3t.LIZJ(VNS.class);
        } else {
            vns = null;
        }
        C38184Eyi c38184Eyi = this.LJLILLLLZI;
        c38184Eyi.getClass();
        c38184Eyi.LIZJ = System.currentTimeMillis();
        InterfaceC38196Eyu bridgeRegistry = this.LJLIL.getBridgeRegistry();
        if (bridgeRegistry != null) {
            bridgeRegistry.fl(new AqS172S0100000_6((CallableC38194Eys) this, 7));
        }
        AObjectS29S0000000_6 aObjectS29S0000000_6 = new AObjectS29S0000000_6(0);
        EnumC38198Eyw strategy = EnumC38198Eyw.IGNORE;
        o.LJIIJ(strategy, "strategy");
        int i = C38199Eyx.LIZ[strategy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C38195Eyt.LIZIZ.put("LYNX", aObjectS29S0000000_6);
            }
        } else {
            java.util.Map<String, InterfaceC88472Yns<Object, JSONObject>> map = C38195Eyt.LIZIZ;
            if (!map.containsKey("LYNX")) {
                map.put("LYNX", aObjectS29S0000000_6);
            }
        }
        InterfaceC38196Eyu bridgeRegistry2 = this.LJLIL.getBridgeRegistry();
        if (bridgeRegistry2 == null || (ti = bridgeRegistry2.ti(this.LJLJI)) == null || (ti instanceof InterfaceC38186Eyk)) {
            InterfaceC38196Eyu bridgeRegistry3 = this.LJLIL.getBridgeRegistry();
            if (bridgeRegistry3 == null) {
                return null;
            }
            String str = this.LJLJI;
            C38378F4k c38378F4k = C38378F4k.LIZ;
            ReadableMap readableMap = this.LJLJJI;
            c38378F4k.getClass();
            JSONObject LIZLLL = C38378F4k.LIZLLL(readableMap);
            JSONObject optJSONObject = LIZLLL.optJSONObject("data");
            if (optJSONObject != null) {
                LIZLLL = optJSONObject;
            }
            bridgeRegistry3.P(str, LIZLLL, new C38193Eyr(this, vns, elapsedRealtime), new AqS137S0200000_6(this, vns, 8));
            return C76800UCe.LIZ;
        }
        InterfaceC38202Ez0 interfaceC38202Ez0 = (InterfaceC38202Ez0) ti;
        InterfaceC88471Ynr<Object, Class<?>, Object> LIZ = C38195Eyt.LIZ(ReadableMap.class, java.util.Map.class);
        InterfaceC88471Ynr<Object, Class<?>, Object> LIZ2 = C38195Eyt.LIZ(java.util.Map.class, ReadableMap.class);
        new AqS137S0200000_6(LIZ, interfaceC38202Ez0, 9);
        interfaceC38202Ez0.l8();
        new AqS137S0200000_6(LIZ2, interfaceC38202Ez0, 10);
        interfaceC38202Ez0.a1();
        try {
            InterfaceC38196Eyu bridgeRegistry4 = this.LJLIL.getBridgeRegistry();
            if (bridgeRegistry4 == null) {
                return null;
            }
            bridgeRegistry4.P(this.LJLJI, this.LJLJJI, new C38201Eyz(), new AqS137S0200000_6(this, vns, 11));
            c76800UCe = C76800UCe.LIZ;
            return c76800UCe;
        } catch (Throwable th) {
            C38184Eyi.LIZIZ(this.LJLILLLLZI);
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putInt("code", 0);
            javaOnlyMap.putString("message", th.toString());
            this.LJLJJL.invoke(javaOnlyMap);
            C38184Eyi c38184Eyi2 = this.LJLILLLLZI;
            C38184Eyi.LIZJ(c38184Eyi2);
            c38184Eyi2.LJI = System.currentTimeMillis();
            this.LJLIL.onReady(c38184Eyi2, this.LJLJI);
            if (vns == null) {
                return c76800UCe;
            }
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
            C38164EyO c38164EyO = new C38164EyO();
            c38164EyO.LJLJJI = this.LJLJI;
            c38164EyO.LJLILLLLZI = 4;
            LynxBridgeModule lynxBridgeModule = this.LJLIL;
            String th2 = th.toString();
            if (th2 == null) {
                th2 = "";
            }
            c38164EyO.LJLJI = lynxBridgeModule.composeErrorMessage(th2, 0);
            lynxViewMonitor.reportJsbError(vns, c38164EyO);
            return C76800UCe.LIZ;
        }
    }
}
