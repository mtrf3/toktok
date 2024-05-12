package com.lynx.tasm;

import X.AbstractC40526FvO;
import X.AbstractC61008Nwy;
import X.C16880lQ;
import X.C36905Ee5;
import X.C38947FQh;
import X.C39938Flu;
import X.C39942Fly;
import X.C40197Fq5;
import X.C45243HpH;
import X.C64493PSv;
import X.C78855Ux9;
import X.C79411VEp;
import X.C80036Vb6;
import X.F9J;
import X.InterfaceC38948FQi;
import X.InterfaceC39937Flt;
import X.InterfaceC39939Flv;
import X.InterfaceC39940Flw;
import X.InterfaceC39980Fma;
import X.VEZ;
import X.VNU;
import X.VNV;
import X.VNZ;
import X.VS0;
import X.X1D;
import Y.ARunnableS42S0100000_6;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.inputmethod.InputMethodManager;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.NetworkingModule;
import com.lynx.jsbridge.WebAssemblyBridge;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.utils.PropsHolderAutoRegister;
import com.lynx.tasm.fluency.FluencySample;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes7.dex */
public class LynxEnv {
    public static final HashMap<String, String> LJJIIJZLJL = new HashMap<>();
    public static final ReadWriteLock LJJIIZ = new ReentrantReadWriteLock();
    public static final InterfaceC39939Flv LJJIIZI = (InterfaceC39939Flv) VEZ.LIZIZ().LIZ(InterfaceC39939Flv.class);
    public static volatile LynxEnv LJJIJ;
    public static boolean LJJIJIIJI;
    public static final AtomicBoolean LJJIJIIJIL;
    public Application LIZ;
    public AbstractC40526FvO LIZIZ;
    public InterfaceC39980Fma LIZJ;
    public InterfaceC39937Flt LIZLLL;
    public LynxModuleManager LJIILL;
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public boolean LJI = false;
    public boolean LJII = false;
    public boolean LJIIIIZZ = false;
    public boolean LJIIIZ = true;
    public boolean LJIIJ = true;
    public boolean LJIIJJI = true;
    public boolean LJIIL = false;
    public volatile boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;
    public final List<C40197Fq5> LJIILLIIL = new ArrayList();
    public final VNV LJIIZILJ = new VNV();
    public C80036Vb6 LJIJ = null;
    public InputMethodManager LJIJI = null;
    public HashMap<String, Object> LJIJJ = null;
    public boolean LJIJJLI = true;
    public volatile boolean LJIL = false;
    public InterfaceC39940Flw LJJ = null;
    public final Map<String, AbstractC61008Nwy> LJJI = new HashMap();
    public String LJJIFFI = null;
    public boolean LJJII = false;
    public boolean LJJIII = false;
    public final Object LJJIIJ = new Object();

    public static native void nativeInitUIThread();

    public final void LIZ() {
        LLog.LIZLLL(2, "LynxEnv", "Turn on devtool");
        LLog.LJ(0);
        LJIILL("enable_devtool", true);
    }

    public final synchronized List<C40197Fq5> LIZJ() {
        ArrayList arrayList;
        synchronized (this.LJIILLIIL) {
            arrayList = new ArrayList(this.LJIILLIIL);
        }
        return arrayList;
    }

    public native boolean nativeGetEnv(String str, boolean z);

    public native void nativeSetEnv(String str, boolean z);

    public native void nativeSetEnvMask(String str, boolean z);

    public native void nativeSetGroupedEnv(String str, boolean z, String str2);

    public native void nativeSetGroupedEnvWithGroupSet(String str, Set<String> set);

    static {
        if (!C78855Ux9.LJLIL) {
            C78855Ux9.LJLIL = true;
        }
        LJJIJIIJI = false;
        LJJIJIIJIL = new AtomicBoolean(false);
    }

    public static LynxEnv LJIIIZ() {
        if (LJJIJ == null) {
            synchronized (LynxEnv.class) {
                if (LJJIJ == null) {
                    LJJIJ = new LynxEnv();
                }
            }
        }
        return LJJIJ;
    }

    public final LynxModuleManager LJFF() {
        if (this.LJIILL == null) {
            this.LJIILL = new LynxModuleManager(this.LIZ);
        }
        return this.LJIILL;
    }

    public final void LJII() {
        synchronized (this.LJIILLIIL) {
            ((ArrayList) this.LJIILLIIL).addAll(new VS0().create());
            InterfaceC39937Flt interfaceC39937Flt = this.LIZLLL;
            if (interfaceC39937Flt != null) {
                ((ArrayList) this.LJIILLIIL).addAll(interfaceC39937Flt.create());
            }
        }
    }

    public final void LJIIIIZZ() {
        try {
            Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
            cls.getMethod("init", Context.class).invoke(cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]), this.LIZ);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initDevtoolEnv failed: ");
            LIZ.append(e.toString());
            LLog.LIZLLL(4, "LynxEnv", X1D.LIZIZ(LIZ));
        }
    }

    public final boolean LJIIJ() {
        return LJ("enable_devtool", false);
    }

    public final boolean LJIIJJI() {
        if (!this.LJFF.get()) {
            this.LJFF.set(true);
            try {
                Class.forName("com.lynx.devtool.LynxDevtoolEnv");
                this.LJI = true;
            } catch (Throwable unused) {
                this.LJI = false;
            }
        }
        return this.LJI;
    }

    public final void LJIIL() {
        boolean z;
        synchronized (this.LJJIIJ) {
            if (this.LJ.get() || this.LJIL) {
                return;
            }
            InterfaceC38948FQi interfaceC38948FQi = C38947FQh.LIZ;
            if (interfaceC38948FQi == null) {
                z = false;
            } else {
                z = true;
            }
            this.LJIL = z;
            if (interfaceC38948FQi != null) {
                interfaceC38948FQi.init();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0089 -> B:26:0x00a0). Please report as a decompilation issue!!! */
    public final void LJIILJJIL() {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Object obj;
        if (this.LJIILIIL) {
            try {
                HashMap<String, Object> hashMap = this.LJIJJ;
                if (hashMap != null && (map4 = (Map) hashMap.get("lynx_common")) != null && (obj = map4.get("ANDROID_DISABLE_QUICKJS_CODE_CACHE")) != null) {
                    boolean z = this.LJIIL;
                    boolean equals = "true".equals(obj.toString());
                    this.LJIIL = equals;
                    if (z != equals) {
                        nativeSetEnv("force_disable_quickjs_cache", equals);
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("parseSettingsForDisableQuickJsCache success: ");
                LIZ.append(this.LJIIL);
                LLog.LIZLLL(2, "LynxEnv", X1D.LIZIZ(LIZ));
            } catch (Throwable th) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("parseSettingsForDisableQuickJsCache error ");
                LIZ2.append(th.toString());
                LLog.LIZLLL(3, "LynxEnv", X1D.LIZIZ(LIZ2));
            }
            boolean z2 = false;
            try {
                HashMap<String, Object> hashMap2 = this.LJIJJ;
                if (hashMap2 != null && (map3 = (Map) hashMap2.get("lynx_common")) != null) {
                    Object obj2 = map3.get("DISABLE_COLLECT_LEAK");
                    if (obj2 != null) {
                        nativeSetEnv("disable_collect_leak", "true".equals(obj2.toString()));
                    } else {
                        nativeSetEnv("disable_collect_leak", false);
                    }
                }
            } catch (Throwable th2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("parseSettingsForDisableCollectLeak error ");
                LIZ3.append(th2.toString());
                LLog.LIZLLL(3, "LynxEnv", X1D.LIZIZ(LIZ3));
            }
            try {
                HashMap<String, Object> hashMap3 = this.LJIJJ;
                if (hashMap3 != null && (map2 = (Map) hashMap3.get("lynx_common")) != null) {
                    Object obj3 = map2.get("DISABLE_LEPUSNG_OPTIMIZE");
                    if (obj3 != null) {
                        nativeSetEnv("disable_lepusng_optimize", "true".equals(obj3.toString()));
                    } else {
                        nativeSetEnv("disable_lepusng_optimize", false);
                    }
                }
            } catch (Throwable th3) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("parseSettingsForDisableLepusNGOptimize error ");
                LIZ4.append(th3.toString());
                LLog.LIZLLL(3, "LynxEnv", X1D.LIZIZ(LIZ4));
            }
            try {
                HashMap<String, Object> hashMap4 = this.LJIJJ;
                if (hashMap4 != null && (map = (Map) hashMap4.get("lynx_common")) != null) {
                    Object obj4 = map.get("ENABLE_GLOBAL_FEATURE_SWITCH_STATISTIC");
                    if (obj4 != null && "true".equals(obj4.toString())) {
                        z2 = true;
                    }
                    nativeSetEnv("enable_global_feature_switch_statistic", z2);
                }
            } catch (Throwable th4) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("parseSettingsForGlobalFeatureSwitchStatistic error ");
                LIZ5.append(th4.toString());
                LLog.LIZLLL(3, "LynxEnv", X1D.LIZIZ(LIZ5));
            }
            HashMap<String, Object> hashMap5 = this.LJIJJ;
            if (hashMap5 == null) {
                return;
            }
            Object obj5 = hashMap5.get("lynx_common");
            if (!(obj5 instanceof Map)) {
                return;
            }
            try {
                FluencySample.LIZ("true".equals(((Map) obj5).get("ENABLE_FLUENCY_TRACE")));
            } catch (Throwable th5) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("set fluency sample failed, maybe so file not load, retry after LynxEnv init:");
                LIZ6.append(th5.getMessage());
                LLog.LIZLLL(3, "LynxEnv", X1D.LIZIZ(LIZ6));
            }
        }
    }

    public static boolean LIZLLL(String str) {
        String experimentSettings = getExperimentSettings(str);
        if ("true".equals(experimentSettings) || "1".equals(experimentSettings)) {
            return true;
        }
        return false;
    }

    public static String getExperimentSettings(String str) {
        ReadWriteLock readWriteLock = LJJIIZ;
        ((ReentrantReadWriteLock) readWriteLock).readLock().lock();
        HashMap<String, String> hashMap = LJJIIJZLJL;
        String str2 = hashMap.get(str);
        ((ReentrantReadWriteLock) readWriteLock).readLock().unlock();
        if (str2 != null) {
            return str2;
        }
        ((ReentrantReadWriteLock) readWriteLock).writeLock().lock();
        String str3 = hashMap.get(str);
        if (str3 == null) {
            str3 = LJJIIZI.stringValueForExperimentKey(str);
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put(str, str3);
        }
        ((ReentrantReadWriteLock) readWriteLock).writeLock().unlock();
        return str3;
    }

    public final void LIZIZ(boolean z) {
        String str;
        if (z) {
            str = "enable lynx debug";
        } else {
            str = "disable lynx debug";
        }
        LLog.LIZLLL(2, "LynxEnv", str);
        this.LJI = z;
        if (z && this.LIZ != null) {
            LJIIIIZZ();
        }
    }

    public final void LJIILIIL(InterfaceC39940Flw interfaceC39940Flw) {
        if (!this.LJIILIIL) {
            try {
                if (interfaceC39940Flw != null) {
                    try {
                        interfaceC39940Flw.loadLibrary("quick");
                    } catch (UnsatisfiedLinkError e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("quick.so load from ");
                        LIZ.append(interfaceC39940Flw.getClass().getName());
                        LIZ.append(" with error message ");
                        LIZ.append(e.getMessage());
                        LLog.LIZLLL(3, "LynxEnv", X1D.LIZIZ(LIZ));
                    }
                    interfaceC39940Flw.loadLibrary("lynx");
                    this.LJIILIIL = true;
                    LLog.LIZLLL(2, "LynxEnv", "Native Lynx Library load success ");
                }
                try {
                    C16880lQ.LLJJJIL("quick");
                } catch (UnsatisfiedLinkError e2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("quick.so load from system with error message ");
                    LIZ2.append(e2.getMessage());
                    LLog.LIZLLL(3, "LynxEnv", X1D.LIZIZ(LIZ2));
                }
                C16880lQ.LLJJJIL("lynx");
                this.LJIILIIL = true;
                LLog.LIZLLL(2, "LynxEnv", "Native Lynx Library load success ");
            } catch (UnsatisfiedLinkError e3) {
                if (interfaceC39940Flw == null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Native Lynx Library load from system with error message ");
                    LIZ3.append(e3.getMessage());
                    LLog.LIZLLL(4, "LynxEnv", X1D.LIZIZ(LIZ3));
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Native Lynx Library load from ");
                    LIZ4.append(interfaceC39940Flw.getClass().getName());
                    LIZ4.append(" with error message ");
                    LIZ4.append(e3.getMessage());
                    LLog.LIZLLL(4, "LynxEnv", X1D.LIZIZ(LIZ4));
                }
                this.LJIILIIL = false;
            }
        }
    }

    public final void LJIILLIIL(HashMap<String, Object> hashMap) {
        synchronized (this) {
            HashMap<String, Object> hashMap2 = this.LJIJJ;
            if (hashMap2 == null || !hashMap2.equals(hashMap)) {
                this.LJIJJ = hashMap;
                LJIILJJIL();
            }
        }
    }

    public final boolean LJ(String str, boolean z) {
        LJIIL();
        if (!this.LJIILIIL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getDevtoolEnv must be called after init! key: ");
            LIZ.append(str);
            LLog.LIZLLL(4, "LynxEnv", X1D.LIZIZ(LIZ));
            return z;
        }
        C36905Ee5.LIZIZ();
        try {
            z = ((Boolean) C36905Ee5.LIZ(C36905Ee5.LIZJ, C36905Ee5.LIZIZ, new Object[]{str, Boolean.valueOf(z)})).booleanValue();
            return z;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getDevtoolEnv failed: ");
            LIZ2.append(e.toString());
            LLog.LIZLLL(4, "LynxDevtoolUtils", X1D.LIZIZ(LIZ2));
            return z;
        }
    }

    public final void LJIILL(String str, boolean z) {
        LJIIL();
        if (this.LJIILIIL) {
            C36905Ee5.LIZIZ();
            try {
                C36905Ee5.LIZ(C36905Ee5.LIZJ, C36905Ee5.LIZ, new Object[]{str, Boolean.valueOf(z)});
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setDevtoolEnv failed: ");
                LIZ.append(e.toString());
                LLog.LIZLLL(4, "LynxDevtoolUtils", X1D.LIZIZ(LIZ));
            }
        }
    }

    public static void reportPiperInvoked(String str, String str2, String str3, String str4) {
        HashMap LIZ = C45243HpH.LIZ("module-name", str, "method-name", str2);
        LIZ.put("url", str4);
        if (!str3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str3);
            LIZ.put("params", arrayList);
        }
        LJIIIZ().LJIIZILJ.LJIIZILJ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void LJI(Application application, InterfaceC39940Flw interfaceC39940Flw, AbstractC40526FvO abstractC40526FvO, InterfaceC39937Flt interfaceC39937Flt) {
        if (this.LJ.get()) {
            LLog.LIZLLL(3, "LynxEnv", "LynxEnv is already initialized");
            return;
        }
        this.LJ.set(true);
        LLog.LIZLLL(2, "LynxEnv", "LynxEnv start init");
        if (TraceEvent.LIZJ() && C39942Fly.LJ.booleanValue()) {
            try {
                try {
                    LLog.LIZLLL(1, "LynxEnv", "open systrace for app");
                    Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
                } catch (NoSuchMethodException e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                } catch (InvocationTargetException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            } catch (ClassNotFoundException e3) {
                e = e3;
                C16880lQ.LLLLIIL(e);
            } catch (IllegalAccessException e4) {
                C16880lQ.LLLLIIL(e4);
            }
        }
        if (!PropsHolderAutoRegister.LIZ) {
            PropsHolderAutoRegister.LIZ = true;
        }
        this.LIZ = application;
        LynxModuleManager LJFF = LJFF();
        LJFF.getClass();
        if (application instanceof VNU) {
            LJFF.LIZLLL = ((VNU) application).LJLLL;
        }
        LJFF.LIZJ = new WeakReference<>(application);
        SharedPreferences LIZIZ = F9J.LIZIZ(application, 0, "lynx_env_config");
        if (LIZIZ == null) {
            this.LJIIIIZZ = false;
        } else {
            this.LJIIIIZZ = LIZIZ.getBoolean("enable_debug_mode", false);
        }
        this.LIZLLL = interfaceC39937Flt;
        this.LIZIZ = abstractC40526FvO;
        LJII();
        C64493PSv.LIZ().execute(new ARunnableS42S0100000_6(LIZJ(), 23));
        if (C39942Fly.LIZJ.booleanValue()) {
            try {
                Class.forName("com.lynx.tasm.loader.RenderkitLoader").getMethod("initRenderkit", Context.class, InterfaceC39940Flw.class, InterfaceC39980Fma.class).invoke(null, this.LIZ, interfaceC39940Flw, this.LIZJ);
            } catch (Exception e5) {
                C16880lQ.LLLLIIL(e5);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Reflective call RenderkitLoader.initRenderkit failed: ");
                LIZ.append(e5);
                LLog.LIZLLL(4, "LynxEnv", X1D.LIZIZ(LIZ));
            }
        }
        LJFF().LIZJ(NetworkingModule.NAME, NetworkingModule.class, null);
        LynxSettingsManager.inst().initialize(application);
        this.LJJ = interfaceC39940Flw;
        if (LJIIJJI()) {
            LJIIIIZZ();
        }
        try {
            if (VNZ.class.isAssignableFrom(Class.forName("com.lynx.devtool.LynxInspectorOwner"))) {
                this.LJII = true;
                nativeSetEnv("devtool_component_attach", true);
            }
        } catch (ClassNotFoundException unused) {
            this.LJII = false;
        }
        LJIILIIL(this.LJJ);
        LJIILJJIL();
        WebAssemblyBridge.LIZ();
        if (!this.LJIILJJIL) {
            C79411VEp.LJ(new ARunnableS42S0100000_6(this, 24));
        }
        if (this.LJIILIIL && TraceEvent.LIZJ()) {
            TraceEvent.LIZ = true;
            try {
                TraceController traceController = C39938Flu.LIZ;
                traceController.LIZ(application);
                traceController.LIZIZ();
            } catch (Exception e6) {
                C16880lQ.LLLLIIL(e6);
                LLog.LIZLLL(4, "LynxEnv", "trace controller init failed");
            }
        }
        String experimentSettings = getExperimentSettings("disable_post_processor");
        String experimentSettings2 = getExperimentSettings("use_New_Image");
        if ("true".equals(experimentSettings)) {
            this.LJJII = true;
        }
        if ("true".equals(experimentSettings2)) {
            this.LJJIII = true;
        }
    }
}
