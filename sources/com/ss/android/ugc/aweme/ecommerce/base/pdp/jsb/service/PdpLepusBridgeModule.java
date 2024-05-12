package com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service;

import X.C03880Dg;
import X.C39519Ff9;
import X.C61430O9a;
import X.C61431O9b;
import X.C61636OGy;
import X.C65300Pk0;
import X.InterfaceC37728ErM;
import X.InterfaceC60761Nsz;
import X.InterfaceC71003Rtn;
import X.O9V;
import X.OGE;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PdpLepusBridgeModule extends LynxModule {
    public static final C61431O9b Companion = new C61431O9b();
    public static final String NAME = "PdpBridgeLepusModule";
    public final Context context;
    public final O9V paramModel;

    private final InterfaceC71003Rtn node() {
        WeakReference<InterfaceC71003Rtn> weakReference;
        O9V o9v = this.paramModel;
        if (o9v != null && (weakReference = o9v.LJLIL) != null) {
            return weakReference.get();
        }
        return null;
    }

    private final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS view() {
        WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS> weakReference;
        O9V o9v = this.paramModel;
        if (o9v != null && (weakReference = o9v.LJLJI) != null) {
            return weakReference.get();
        }
        return null;
    }

    private final OGE viewModel() {
        WeakReference<OGE> weakReference;
        O9V o9v = this.paramModel;
        if (o9v != null && (weakReference = o9v.LJLILLLLZI) != null) {
            return weakReference.get();
        }
        return null;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpLepusBridgeModule(Context context, Object param) {
        super(context);
        O9V o9v;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        this.context = context;
        if (param instanceof O9V) {
            o9v = (O9V) param;
        } else {
            o9v = null;
        }
        this.paramModel = o9v;
    }

    @InterfaceC37728ErM
    public final WritableMap callSync(String methodName, ReadableMap params) {
        ViewParent viewParent;
        InterfaceC60761Nsz kitView;
        View LIZJ;
        ViewParent parent;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {methodName, params};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)Lcom/lynx/react/bridge/WritableMap;", "-2610802441296858183");
        C39519Ff9 LIZJ2 = c03880Dg.LIZJ(300002, "com/ss/android/ugc/aweme/ecommerce/base/pdp/jsb/service/PdpLepusBridgeModule", "callSync", this, objArr, "com.lynx.react.bridge.WritableMap", c65300Pk0);
        if (LIZJ2.LIZ) {
            c03880Dg.LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/base/pdp/jsb/service/PdpLepusBridgeModule", "callSync", null, objArr, this, c65300Pk0, false);
            return (WritableMap) LIZJ2.LIZIZ;
        }
        o.LJIIIZ(methodName, "methodName");
        o.LJIIIZ(params, "params");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("code", 1);
        switch (methodName.hashCode()) {
            case 91242765:
                if (methodName.equals("ec_page_get_distance")) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS view = view();
                    View view2 = null;
                    if (view != null && (kitView = view.getKitView()) != null && (LIZJ = kitView.LIZJ()) != null && (parent = LIZJ.getParent()) != null) {
                        viewParent = parent.getParent();
                    } else {
                        viewParent = null;
                    }
                    if (viewParent instanceof C61636OGy) {
                        view2 = (View) viewParent;
                    }
                    C61430O9a LJ = PdpCardBridgeServiceImpl.LJI().LJ(view2);
                    JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                    javaOnlyMap2.put("is_bottom", Boolean.valueOf(LJ.LJLIL));
                    javaOnlyMap2.put("distance", Integer.valueOf(LJ.LJLILLLLZI));
                    javaOnlyMap.put("data", javaOnlyMap2);
                    break;
                }
                break;
            case 266463344:
                if (methodName.equals("ec_fetch_item_data")) {
                    String LIZ = PdpCardBridgeServiceImpl.LJI().LIZ(viewModel(), params.getInt("brick_name"));
                    JavaOnlyMap javaOnlyMap3 = new JavaOnlyMap();
                    javaOnlyMap3.put("raw_data", LIZ);
                    javaOnlyMap.put("data", javaOnlyMap3);
                    break;
                }
                break;
            case 813019925:
                if (methodName.equals("ec_open_schema")) {
                    String schema = params.getString("schema");
                    HashMap<String, Object> hashMap = params.getMap("params").toHashMap();
                    IPdpCardBridgeService LJI = PdpCardBridgeServiceImpl.LJI();
                    InterfaceC71003Rtn node = node();
                    Context context = this.context;
                    o.LJIIIIZZ(schema, "schema");
                    LJI.LIZLLL(node, context, schema, hashMap);
                    break;
                }
                break;
            case 1278371700:
                if (methodName.equals("ec_refresh_page")) {
                    PdpCardBridgeServiceImpl.LJI().LIZIZ(viewModel());
                    break;
                }
                break;
            case 1564484234:
                if (methodName.equals("ec_send_page_log")) {
                    String eventName = params.getString("eventName");
                    HashMap<String, Object> hashMap2 = params.getMap("params").toHashMap();
                    IPdpCardBridgeService LJI2 = PdpCardBridgeServiceImpl.LJI();
                    InterfaceC71003Rtn node2 = node();
                    o.LJIIIIZZ(eventName, "eventName");
                    LJI2.LJFF(node2, eventName, hashMap2);
                    break;
                }
                break;
            case 1571971608:
                if (methodName.equals("ec_fetch_common_data")) {
                    HashMap<String, Object> LIZJ3 = PdpCardBridgeServiceImpl.LJI().LIZJ(node());
                    JavaOnlyMap javaOnlyMap4 = new JavaOnlyMap();
                    javaOnlyMap4.put("data", LIZJ3);
                    javaOnlyMap.put("data", javaOnlyMap4);
                    break;
                }
                break;
        }
        c03880Dg.LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/base/pdp/jsb/service/PdpLepusBridgeModule", "callSync", javaOnlyMap, objArr, this, c65300Pk0, true);
        return javaOnlyMap;
    }
}
