package com.bytedance.android.monitorV2.lynx.jsb;

import X.C03880Dg;
import X.C37692Eqm;
import X.C60538NpO;
import X.C65300Pk0;
import X.C67348Qbw;
import X.C77117UOj;
import X.C77123UOp;
import X.C77922Ui6;
import X.C79604VMa;
import X.C79605VMb;
import X.EnumC65355Pkt;
import X.InterfaceC37728ErM;
import X.VM0;
import X.VM2;
import X.VM3;
import X.VM4;
import X.VM9;
import X.VMB;
import X.VNS;
import android.content.Context;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class LynxViewMonitorModule extends LynxModule {
    public static final VM2 Companion = new VM2();
    public static final String NAME = "hybridMonitor";

    private final JSONObject convertJson(ReadableMap readableMap) {
        JSONObject jSONObject = null;
        if (readableMap == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(readableMap.toHashMap());
            return jSONObject;
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
            return jSONObject;
        }
    }

    private final int getCanSample(ReadableMap readableMap) {
        int i = readableMap.getInt("level", 2);
        int i2 = readableMap.getInt("canSample", 1);
        boolean z = readableMap.getBoolean("canSample", true);
        if (readableMap.hasKey("level")) {
            return i;
        }
        if (!readableMap.hasKey("canSample")) {
            return 2;
        }
        if (i2 != 0 && z) {
            return 2;
        }
        return 0;
    }

    private final VM0 getError(ReadableMap readableMap) {
        VM0 vm0 = new VM0();
        try {
            vm0.LJLILLLLZI = "lynx_error_custom";
            vm0.LJLJI = 201;
            vm0.LJLJJI = String.valueOf(convertJson(readableMap));
            return vm0;
        } catch (Exception e) {
            C77117UOj.LJIIZILJ(e);
            return vm0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxViewMonitorModule(Context context, Object param) {
        super(context, param);
        o.LJIIJ(context, "context");
        o.LJIIJ(param, "param");
    }

    @InterfaceC37728ErM
    public final void config(ReadableMap readableMap, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "1821383584516734855");
        if (c03880Dg.LIZJ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "config", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "config", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (this.mParam == null) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "config", null, objArr, this, c65300Pk0, true);
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("errorCode", -1);
        Object obj = this.mParam;
        if (obj instanceof C60538NpO) {
            if (obj != null) {
                VNS vns = ((C60538NpO) obj).LIZ;
                if (vns != null) {
                    JSONObject LIZ = C77922Ui6.LIZ(convertJson(readableMap));
                    VM9 vm9 = VMB.LJLLLL.LIZ(vns).LJLJJL;
                    if (vm9 != null) {
                        if (ujb.o.LJJJJJL(vm9.LJLILLLLZI)) {
                            String optString = LIZ.optString("bid");
                            o.LJFF(optString, "this");
                            vm9.LJLILLLLZI = optString;
                        }
                        JSONObject LJJIJLIJ = C77123UOp.LJJIJLIJ(vm9.LJLJJI, LIZ);
                        o.LJFF(LJJIJLIJ, "JsonUtils.merge(this.jsConf, value)");
                        vm9.LJLJJI = LJJIJLIJ;
                        if (!ujb.o.LJJJJJL(vm9.LJLILLLLZI)) {
                            C67348Qbw.LIZ(vm9.LJLLI, vm9.LJLILLLLZI);
                        }
                        javaOnlyMap.putInt("errorCode", 0);
                    }
                }
            } else {
                C37692Eqm c37692Eqm = new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.lynx.jsb.LynxViewProvider");
                c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "config", null, objArr, this, c65300Pk0, true);
                throw c37692Eqm;
            }
        }
        if (callback != null) {
            callback.invoke(javaOnlyMap);
        }
        c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "config", null, objArr, this, c65300Pk0, true);
    }

    @InterfaceC37728ErM
    public final void customReport(ReadableMap readableMap, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "1821383584516734855");
        if (c03880Dg.LIZJ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "customReport", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "customReport", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (readableMap == null || this.mParam == null) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "customReport", null, objArr, this, c65300Pk0, true);
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("errorCode", -1);
        Object obj = this.mParam;
        if (obj instanceof C60538NpO) {
            if (obj != null) {
                VNS vns = ((C60538NpO) obj).LIZ;
                if (vns != null) {
                    try {
                        String string = readableMap.getString("eventName", "");
                        ReadableMap map = readableMap.getMap("category");
                        ReadableMap map2 = readableMap.getMap("metrics");
                        ReadableMap map3 = readableMap.getMap("timing");
                        ReadableMap map4 = readableMap.getMap("extra");
                        String string2 = readableMap.getString("bid");
                        int canSample = getCanSample(readableMap);
                        C79605VMb c79605VMb = new C79605VMb(string);
                        c79605VMb.LIZIZ = string2;
                        c79605VMb.LIZ = vns.getTemplateUrl();
                        c79605VMb.LIZLLL = convertJson(map);
                        c79605VMb.LJ = convertJson(map2);
                        c79605VMb.LJFF = convertJson(map4);
                        c79605VMb.LJI = convertJson(map3);
                        c79605VMb.LIZIZ(canSample);
                        C79604VMa LIZ = c79605VMb.LIZ();
                        LynxViewMonitor.Companion.getClass();
                        LynxViewMonitor.INSTANCE.reportCustom(vns, LIZ);
                        javaOnlyMap.putInt("errorCode", 0);
                    } catch (Exception e) {
                        javaOnlyMap.putString("errorMessage", "cause: " + e.getMessage());
                        C77117UOj.LJIIZILJ(e);
                    }
                } else {
                    javaOnlyMap.putString("errorMessage", "view is empty.");
                }
            } else {
                C37692Eqm c37692Eqm = new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.lynx.jsb.LynxViewProvider");
                c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "customReport", null, objArr, this, c65300Pk0, true);
                throw c37692Eqm;
            }
        } else {
            javaOnlyMap.putString("errorMessage", "mParam is not LynxViewProvider.");
        }
        if (callback != null) {
            callback.invoke(javaOnlyMap);
        }
        c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "customReport", null, objArr, this, c65300Pk0, true);
    }

    @InterfaceC37728ErM
    public final void getInfo(ReadableMap readableMap, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "1821383584516734855");
        if (c03880Dg.LIZJ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "getInfo", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "getInfo", null, objArr, this, c65300Pk0, false);
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("sdk_version", "1.0");
        if (callback != null) {
            callback.invoke(javaOnlyMap);
        }
        c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "getInfo", null, objArr, this, c65300Pk0, true);
    }

    @InterfaceC37728ErM
    public final void reportJSError(ReadableMap readableMap, Callback callback) {
        boolean z;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "1821383584516734855");
        if (c03880Dg.LIZJ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "reportJSError", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "reportJSError", null, objArr, this, c65300Pk0, false);
            return;
        }
        VM4.LJIILL.getClass();
        VM4 LIZ = VM3.LIZ("js_exception", null);
        if (readableMap == null || this.mParam == null) {
            z = true;
        } else {
            z = false;
        }
        EnumC65355Pkt enumC65355Pkt = EnumC65355Pkt.PARAM_EXCEPTION;
        LIZ.LJFF(z, enumC65355Pkt);
        if (z) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "reportJSError", null, objArr, this, c65300Pk0, true);
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("errorCode", -1);
        Object obj = this.mParam;
        if (obj instanceof C60538NpO) {
            if (obj != null) {
                VNS vns = ((C60538NpO) obj).LIZ;
                if (vns != null) {
                    LIZ.LJIIL = getError(readableMap);
                    LynxViewMonitor.Companion.getClass();
                    LynxViewMonitor.INSTANCE.reportError(vns, getError(readableMap), LIZ);
                    javaOnlyMap.putInt("errorCode", 0);
                } else {
                    LIZ.onEventTerminated(enumC65355Pkt);
                }
            } else {
                C37692Eqm c37692Eqm = new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.lynx.jsb.LynxViewProvider");
                c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "reportJSError", null, objArr, this, c65300Pk0, true);
                throw c37692Eqm;
            }
        } else {
            LIZ.onEventTerminated(enumC65355Pkt);
        }
        if (callback != null) {
            callback.invoke(javaOnlyMap);
        }
        c03880Dg.LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "reportJSError", null, objArr, this, c65300Pk0, true);
    }
}
