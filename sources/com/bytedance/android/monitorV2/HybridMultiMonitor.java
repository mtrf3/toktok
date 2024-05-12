package com.bytedance.android.monitorV2;

import X.C09970aH;
import X.C16880lQ;
import X.C35894E6w;
import X.C38192Eyq;
import X.C40063Fnv;
import X.C40064Fnw;
import X.C40065Fnx;
import X.C40067Fnz;
import X.C40076Fo8;
import X.C77117UOj;
import X.C77123UOp;
import X.C77318UWc;
import X.C78866UxK;
import X.C79604VMa;
import X.C79605VMb;
import X.F3E;
import X.F3F;
import X.F3G;
import X.InterfaceC40066Fny;
import X.InterfaceC40069Fo1;
import X.InterfaceC66027Pvj;
import X.InterfaceC66028Pvk;
import X.InterfaceC79582VLe;
import X.OFI;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC40070Fo2;
import X.VM5;
import X.VM8;
import X.VMW;
import X.VN4;
import X.X1D;
import X.X1K;
import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class HybridMultiMonitor {
    public static volatile HybridMultiMonitor instance;
    public volatile Application application;
    public SharedPreferencesOnSharedPreferenceChangeListenerC40070Fo2 debugSpListener;
    public InterfaceC40066Fny exceptionHandler;
    public InterfaceC40069Fo1 hybridSettingManager;
    public List<F3F> interceptorList;
    public boolean isInitialized;
    public boolean isRegisterTouchCallback;
    public F3G touchTraceCallback;
    public C40065Fnx normalCustomMonitor = new C40065Fnx();
    public List<InterfaceC66028Pvk> eventListenerList = C40064Fnw.LIZ;
    public List<InterfaceC66027Pvj> businessListenerList = C40064Fnw.LIZIZ;

    public static /* synthetic */ void LIZ(HybridMultiMonitor hybridMultiMonitor) {
        hybridMultiMonitor.lambda$initComponent$0();
    }

    public InterfaceC40066Fny getExceptionHandler() {
        return null;
    }

    public void setExceptionHandler(InterfaceC40066Fny interfaceC40066Fny) {
    }

    public static HybridMultiMonitor getInstance() {
        if (instance == null) {
            synchronized (HybridMultiMonitor.class) {
                if (instance == null) {
                    instance = new HybridMultiMonitor();
                }
            }
        }
        return instance;
    }

    private void initDebugEnvir() {
        C38192Eyq.LIZJ(new ARunnableS42S0100000_6(this, 12));
    }

    private void initFileRecord() {
        registerReportInterceptor(new F3E());
    }

    private void injectFalconX() {
        try {
            Class<?> cls = Class.forName("com.bytedance.webx.monitor.falconx.NewFalconXMonitor");
            C78866UxK.LJJJJL(cls, "beginMonitor", C78866UxK.LJJJJL(cls, "getInstance", new Object[0]));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            C77117UOj.LJIILLIIL("startup_handle", th);
        }
    }

    private void injectForest() {
        try {
            Class<?> cls = Class.forName("com.bytedance.android.monitorV2.forest.ForestMonitorHelper");
            Object obj = null;
            try {
                Field declaredField = cls.getDeclaredField("INSTANCE");
                declaredField.setAccessible(true);
                obj = declaredField.get(null);
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            } catch (NoSuchFieldException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            C78866UxK.LJJJJL(cls, "startMonitor", obj);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            C77117UOj.LJIILLIIL("startup_handle", th);
        }
    }

    private void injectWebOffline() {
        try {
            Class<?> cls = Class.forName("com.bytedance.webx.monitor.weboffline.NewWebOfflineMonitor");
            C78866UxK.LJJJJL(cls, "beginMonitor", C78866UxK.LJJJJL(cls, "getInstance", new Object[0]));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            C77117UOj.LJIILLIIL("startup_handle", th);
        }
    }

    public InterfaceC79582VLe getCustomReportMonitor() {
        return this.normalCustomMonitor.LIZ;
    }

    public InterfaceC40069Fo1 getHybridSettingManager() {
        InterfaceC40069Fo1 interfaceC40069Fo1 = this.hybridSettingManager;
        if (interfaceC40069Fo1 != null) {
            return interfaceC40069Fo1;
        }
        if (C40067Fnz.LJ == null) {
            synchronized (C40067Fnz.class) {
                if (C40067Fnz.LJ == null) {
                    C40067Fnz.LJ = new C40067Fnz();
                }
            }
        }
        return C40067Fnz.LJ;
    }

    public void registerTouchCallback() {
        if (this.application != null && !this.isRegisterTouchCallback) {
            this.touchTraceCallback = new F3G();
            this.application.registerActivityLifecycleCallbacks(this.touchTraceCallback);
            this.application.registerActivityLifecycleCallbacks(X1K.LJLJI);
            this.isRegisterTouchCallback = true;
        }
    }

    public void updateSampleConfigsFromNet() {
        InterfaceC40069Fo1 interfaceC40069Fo1 = this.hybridSettingManager;
        if (interfaceC40069Fo1 != null) {
            interfaceC40069Fo1.LIZLLL();
        }
    }

    private void initComponent() {
        C38192Eyq.LIZ().execute(new IDRunnableS6S0101000(1, this, 13));
    }

    public /* synthetic */ void lambda$initComponent$0() {
        injectWebOffline();
        injectFalconX();
        injectForest();
    }

    public static boolean isDebuggable() {
        return C77318UWc.LJLJI;
    }

    public static boolean isOutputFile() {
        return C77318UWc.LJLJJI;
    }

    public Application getApplication() {
        return this.application;
    }

    private void initEventConsumer(HybridSettingInitConfig hybridSettingInitConfig) {
        try {
            C38192Eyq.LIZJ(new ARunnableS25S0200000_6(this, hybridSettingInitConfig, 4));
        } catch (Throwable th) {
            C77117UOj.LJIILLIIL("startup_handle", th);
        }
    }

    public static void setDebuggable(boolean z) {
        C77318UWc.LJFF(z, false);
    }

    public static void setOutputFile(boolean z) {
        C77318UWc.LJI(z, false);
    }

    public void customReport(C79604VMa c79604VMa) {
        VM5 LIZ = VM8.LIZ(c79604VMa);
        String str = c79604VMa.LJIIIIZZ;
        if (str != null) {
            LIZ.LJI = new C35894E6w((Map<String, ? extends Object>) OFI.LIZIZ(str));
        }
        VMW.LIZLLL(LIZ);
    }

    public void customReportInner(VM5 vm5) {
        VMW.LIZLLL(vm5);
    }

    public void init(Application application) {
        init(application, true);
    }

    public void registerBusinessEventListener(InterfaceC66027Pvj interfaceC66027Pvj) {
        if (interfaceC66027Pvj == null) {
            return;
        }
        synchronized (interfaceC66027Pvj) {
            this.businessListenerList.add(interfaceC66027Pvj);
        }
    }

    public void registerHybridEventListener(InterfaceC66028Pvk interfaceC66028Pvk) {
        if (interfaceC66028Pvk == null) {
            return;
        }
        synchronized (interfaceC66028Pvk) {
            this.eventListenerList.add(interfaceC66028Pvk);
        }
    }

    public void registerReportInterceptor(F3F f3f) {
        if (f3f == null) {
            return;
        }
        if (this.interceptorList == null) {
            this.interceptorList = new CopyOnWriteArrayList();
        }
        this.interceptorList.add(f3f);
    }

    public void setConfig(HybridSettingInitConfig hybridSettingInitConfig) {
        setConfig(hybridSettingInitConfig, false);
    }

    public void setCustomReportMonitor(InterfaceC79582VLe interfaceC79582VLe) {
        this.normalCustomMonitor.LIZ = interfaceC79582VLe;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Deprecated method: use new Monitor: ");
        LIZ.append(interfaceC79582VLe);
        X1D.LIZIZ(LIZ);
    }

    public void unregisterBusinessEventListener(InterfaceC66027Pvj interfaceC66027Pvj) {
        List<InterfaceC66027Pvj> list;
        if (interfaceC66027Pvj == null || (list = this.businessListenerList) == null || list.size() == 0) {
            return;
        }
        synchronized (interfaceC66027Pvj) {
            this.businessListenerList.remove(interfaceC66027Pvj);
        }
    }

    public void unregisterHybridEventListener(InterfaceC66028Pvk interfaceC66028Pvk) {
        List<InterfaceC66028Pvk> list;
        if (interfaceC66028Pvk == null || (list = this.eventListenerList) == null || list.size() == 0) {
            return;
        }
        synchronized (interfaceC66028Pvk) {
            this.eventListenerList.remove(interfaceC66028Pvk);
        }
    }

    public void unregisterReportInterceptor(F3F f3f) {
        List<F3F> list;
        if (f3f == null || (list = this.interceptorList) == null || list.size() == 0) {
            return;
        }
        this.interceptorList.remove(f3f);
    }

    public void wrapTouchTraceCallback(Activity activity) {
        F3G f3g;
        if (activity != null && this.isRegisterTouchCallback && (f3g = this.touchTraceCallback) != null) {
            f3g.LIZ(activity);
        }
    }

    private void initHybridSetting(InterfaceC40069Fo1 interfaceC40069Fo1, boolean z) {
        if (interfaceC40069Fo1 != null) {
            this.hybridSettingManager = interfaceC40069Fo1;
            try {
                interfaceC40069Fo1.B3(this.application, z);
            } catch (Throwable th) {
                C77117UOj.LJIILLIIL("startup_handle", th);
            }
        }
    }

    private void initInternalMonitor(Context context, HybridSettingInitConfig hybridSettingInitConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", hybridSettingInitConfig.LJ);
            jSONObject.put("host_aid", hybridSettingInitConfig.LIZ);
            jSONObject.put("sdk_version", "1.5.14-rc.16-oversea");
            jSONObject.put("channel", hybridSettingInitConfig.LJFF);
            jSONObject.put("app_version", hybridSettingInitConfig.LJI);
            jSONObject.put("update_version_code", hybridSettingInitConfig.LJII);
        } catch (JSONException e) {
            C77117UOj.LJIILLIIL("startup_handle", e);
        }
        if (hybridSettingInitConfig.LIZ() != null) {
            SDKMonitorUtils.LIZLLL("8560", hybridSettingInitConfig.LIZ());
        }
        if (hybridSettingInitConfig.LIZIZ() != null) {
            SDKMonitorUtils.LJ("8560", hybridSettingInitConfig.LIZIZ());
        }
        SDKMonitorUtils.LIZJ(C16880lQ.LLLLL(context), "8560", jSONObject, new C40063Fnv());
    }

    public static void setDebuggable(boolean z, boolean z2) {
        C77318UWc.LJFF(z, z2);
    }

    public static void setOutputFile(boolean z, boolean z2) {
        C77318UWc.LJI(z, z2);
    }

    public void init(Application application, boolean z) {
        String str;
        int i;
        if (application == null || this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.application = application;
        if (z) {
            try {
                registerTouchCallback();
            } catch (Throwable th) {
                C77117UOj.LJIILLIIL("startup_handle", th);
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init hostinfo: ");
        try {
            str = C77123UOp.LJJJJLI("version_name", C09970aH.LJFF);
        } catch (Throwable th2) {
            C77117UOj.LJIIZILJ(th2);
            str = "";
        }
        LIZ.append(str);
        LIZ.append(", ");
        try {
            i = C77123UOp.LJJJJI("version_code", C09970aH.LJFF);
        } catch (Throwable th3) {
            C77117UOj.LJIIZILJ(th3);
            i = 0;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        initComponent();
        initFileRecord();
        initDebugEnvir();
        C40076Fo8.LIZLLL.getClass();
        getInstance().registerHybridEventListener((InterfaceC66028Pvk) C40076Fo8.LIZJ.getValue());
    }

    public void setConfig(HybridSettingInitConfig hybridSettingInitConfig, boolean z) {
        initHybridSetting(new VN4(hybridSettingInitConfig), z);
        initEventConsumer(hybridSettingInitConfig);
        initInternalMonitor(this.application, hybridSettingInitConfig);
    }

    public void notifyReportInterceptor(String str, String str2, String str3, JSONObject jSONObject) {
        List<F3F> list = this.interceptorList;
        if (list != null && list.size() > 0) {
            for (F3F f3f : this.interceptorList) {
                if (f3f != null) {
                    try {
                        f3f.LIZ(str, str2, jSONObject);
                    } catch (Throwable th) {
                        C77117UOj.LJIIZILJ(th);
                    }
                }
            }
        }
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        customReport(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, i, null);
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, InterfaceC79582VLe interfaceC79582VLe) {
        new JSONObject();
        C79605VMb c79605VMb = new C79605VMb(str3);
        c79605VMb.LIZ = str;
        c79605VMb.LIZIZ = str2;
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LJ = jSONObject2;
        c79605VMb.LJFF = jSONObject3;
        c79605VMb.LJII = jSONObject4;
        c79605VMb.LIZIZ(i);
        customReport(c79605VMb.LIZ());
    }
}
