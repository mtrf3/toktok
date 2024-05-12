package com.bytedance.android.monitor;

import X.C16880lQ;
import X.C38160EyK;
import X.C38225EzN;
import X.C73343SqR;
import X.C82519Wa3;
import X.F36;
import X.F38;
import X.F39;
import X.F3A;
import X.F3B;
import X.F3C;
import X.F3D;
import X.InterfaceC38227EzP;
import X.K1E;
import X.Q4K;
import X.X1D;
import Y.ARunnableS13S0000000_6;
import Y.ARunnableS42S0100000_6;
import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class HybridMonitor {
    public static volatile HybridMonitor instance;
    public Application application;
    public F3C exceptionHandler;
    public List<F3B> interceptorList;
    public boolean isInitialized;
    public boolean isRegisterTouchCallback;
    public InterfaceC38227EzP settingManager;
    public F39 touchTraceCallback;
    public F36 normalCustomMonitor = new F36();
    public boolean AB_TEST = false;

    public F3C getExceptionHandler() {
        return null;
    }

    public void setExceptionHandler(F3C f3c) {
    }

    public static HybridMonitor getInstance() {
        if (instance == null) {
            synchronized (HybridMonitor.class) {
                if (instance == null) {
                    instance = new HybridMonitor();
                }
            }
        }
        return instance;
    }

    private void initDebugEnvir() {
        C38160EyK.LIZIZ(new ARunnableS42S0100000_6(this, 9));
    }

    private void initFileRecord() {
        registerReportInterceptor(new F3D());
    }

    public void clearSetting() {
        InterfaceC38227EzP interfaceC38227EzP = this.settingManager;
        if (interfaceC38227EzP != null) {
            interfaceC38227EzP.getClass();
            this.settingManager = null;
        }
    }

    public K1E getCustomReportMonitor() {
        return this.normalCustomMonitor.LIZ;
    }

    public InterfaceC38227EzP getSettingManager() {
        InterfaceC38227EzP interfaceC38227EzP = this.settingManager;
        if (interfaceC38227EzP != null) {
            return interfaceC38227EzP;
        }
        if (C38225EzN.LIZIZ == null) {
            synchronized (C38225EzN.class) {
                if (C38225EzN.LIZIZ == null) {
                    C38225EzN.LIZIZ = new C38225EzN();
                }
            }
        }
        return C38225EzN.LIZIZ;
    }

    public void registerTouchCallback() {
        if (this.application != null && !this.isRegisterTouchCallback) {
            F39 f39 = new F39();
            this.touchTraceCallback = f39;
            this.application.registerActivityLifecycleCallbacks(f39);
            this.isRegisterTouchCallback = true;
        }
    }

    private void initComponent() {
        injectWebOffline();
        injectFalconX();
    }

    private void injectFalconX() {
        C38160EyK.LIZ().execute(new ARunnableS13S0000000_6(4));
    }

    private void injectWebOffline() {
        C38160EyK.LIZ().execute(new ARunnableS13S0000000_6(3));
    }

    public void DisableReportInfo() {
        ((ConcurrentHashMap) F3A.LIZ().LIZ).clear();
    }

    public static boolean isDebuggable() {
        return C73343SqR.LJLILLLLZI;
    }

    public static boolean isOutputFile() {
        return C73343SqR.LJLJI;
    }

    public Application getApplication() {
        return this.application;
    }

    public boolean isAbTestEnable() {
        return this.AB_TEST;
    }

    public static void setDebuggable(boolean z) {
        C73343SqR.LJI(z, false);
    }

    public static void setOutputFile(boolean z) {
        C73343SqR.LJII(z, false);
    }

    public void clearDisableReportInfo(String str) {
        F3A LIZ = F3A.LIZ();
        LIZ.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((ConcurrentHashMap) LIZ.LIZ).remove(str);
    }

    public void customReport(F38 f38) {
        this.normalCustomMonitor.getClass();
        F36.LIZIZ(f38);
    }

    public void init(Application application) {
        init(application, true);
    }

    public void initSetting(InterfaceC38227EzP interfaceC38227EzP) {
        if (interfaceC38227EzP != null) {
            this.settingManager = interfaceC38227EzP;
        }
    }

    public void registerReportInterceptor(F3B f3b) {
        if (f3b == null) {
            return;
        }
        if (this.interceptorList == null) {
            this.interceptorList = new CopyOnWriteArrayList();
        }
        this.interceptorList.add(f3b);
    }

    public void setAbTestEnable(boolean z) {
        this.AB_TEST = z;
    }

    public void setCustomReportMonitor(K1E k1e) {
        this.normalCustomMonitor.LIZ = k1e;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("use new Monitor: ");
        LIZ.append(k1e);
        C82519Wa3.LIZLLL("CustomMonitor", X1D.LIZIZ(LIZ));
    }

    public void unregisterReportInterceptor(F3B f3b) {
        List<F3B> list;
        if (f3b == null || (list = this.interceptorList) == null || list.size() == 0) {
            return;
        }
        this.interceptorList.remove(f3b);
    }

    public void wrapTouchTraceCallback(Activity activity) {
        F39 f39;
        if (activity != null && this.isRegisterTouchCallback && (f39 = this.touchTraceCallback) != null) {
            f39.LIZ(activity);
        }
    }

    public static void setDebuggable(boolean z, boolean z2) {
        C73343SqR.LJI(z, z2);
    }

    public static void setOutputFile(boolean z, boolean z2) {
        C73343SqR.LJII(z, z2);
    }

    public void init(Application application, boolean z) {
        String str;
        if (application == null || this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.application = application;
        if (z) {
            registerTouchCallback();
        }
        C82519Wa3.LIZLLL("HybridMonitor", "init sdkinfo: 1.2.5-rc.3, 1020553, false");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init hostinfo: ");
        int i = 0;
        try {
            str = C16880lQ.LLLLLLZ(application.getPackageManager(), application.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", ");
        try {
            i = C16880lQ.LLLLLLZ(application.getPackageManager(), application.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        LIZ.append(i);
        C82519Wa3.LIZLLL("HybridMonitor", X1D.LIZIZ(LIZ));
        initComponent();
        initFileRecord();
        initDebugEnvir();
    }

    public void registerDisableReportInfo(String str, List<String> list) {
        F3A LIZ = F3A.LIZ();
        LIZ.getClass();
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0) {
            return;
        }
        Set set = (Set) ((ConcurrentHashMap) LIZ.LIZ).get(str);
        if (set == null) {
            set = Q4K.LIZLLL();
            ((ConcurrentHashMap) LIZ.LIZ).put(str, set);
        }
        synchronized (LIZ) {
            set.addAll(list);
        }
    }

    public void notifyReportInterceptor(String str, String str2, String str3, JSONObject jSONObject) {
        List<F3B> list = this.interceptorList;
        if (list != null && list.size() > 0) {
            for (F3B f3b : this.interceptorList) {
                if (f3b != null) {
                    f3b.LIZ(str, str2, jSONObject);
                }
            }
        }
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        F36.LIZ(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z, this.normalCustomMonitor.LIZ);
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z, K1E k1e) {
        this.normalCustomMonitor.getClass();
        F36.LIZ(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z, k1e);
    }
}
