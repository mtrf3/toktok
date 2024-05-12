package com.bytedance.vmsdk.worker;

import X.C141335gf;
import X.C16880lQ;
import X.C36903Ee3;
import X.C37467En9;
import X.C37620Epc;
import X.C37621Epd;
import X.C37622Epe;
import X.C37625Eph;
import X.C37627Epj;
import X.C37630Epm;
import X.C3C5;
import X.C66090Pwk;
import X.C66092Pwm;
import X.C66099Pwt;
import X.C78886Uxe;
import X.EnumC37644Eq0;
import X.InterfaceC37170EiM;
import X.InterfaceC37632Epo;
import X.InterfaceC37633Epp;
import X.InterfaceC37634Epq;
import X.V0N;
import com.bytedance.pia.core.worker.network.WorkerDelegate;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.monitor.VmSdkMonitor;
import com.bytedance.vmsdk.net.Request;
import com.bytedance.vmsdk.net.Response;
import com.bytedance.vmsdk.registry.JavaScriptRegistry;
import defpackage.i0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class JsWorker {
    public static boolean isInitialised;
    public EngineType mEngineType;
    public IWorkerExceptionDelegate mExceptionDelegate;
    public InspectorClient mInspectorClient;
    public C37622Epe mInspectorClientNew;
    public JavaScriptRegistry mJavaScriptModuleRegistry;
    public JSModuleManager mModuleManager;
    public AtomicLong mNativeWorkerPtr;
    public InterfaceC37632Epo mOnErrorCallback;
    public InterfaceC37632Epo mOnMessageCallback;
    public int mSrcID;
    public InterfaceC37170EiM mWorkerDelegate;

    public JsWorker() {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        EngineType engineType = EngineType.QUICKJS;
        this.mEngineType = engineType;
        this.mSrcID = -1;
        init(null, engineType, null, false, "unknown_android", false);
    }

    public static boolean initDevtool() {
        try {
            Long l = (Long) Class.forName("com.bytedance.vmsdk.devtool.DevtoolManager").getMethod("initialize", new Class[0]).invoke(null, new Object[0]);
            if (l == null || l.longValue() == 0) {
                return false;
            }
            nativeInitInspectorFactory(l.longValue());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private native void nativeBind(long j, int i, int i2);

    public static native long nativeCreateWorker(JsWorker jsWorker, long j, JSModuleManager jSModuleManager, String str, boolean z, String str2);

    public static native void nativeEvaluateJavaScript(long j, String str, String str2, boolean z);

    public static native void nativeInitInspector(long j, InspectorClient inspectorClient);

    public static native void nativeInitInspectorFactory(long j);

    public static native void nativeInitQJSWebAssembly(long j, long j2);

    private native Object nativeInvokeJavaScriptFunction(long j, String str, JavaOnlyArray javaOnlyArray, char c);

    private native Object nativeInvokeJavaScriptModule(long j, String str, String str2, JavaOnlyArray javaOnlyArray, char c);

    private native void nativeOnCloseInspectorSession(long j);

    private native void nativeOnInspectorMessage(long j, String str);

    private native void nativeOnJSRunner(long j, Runnable runnable);

    private native void nativeOnJSRunnerAtFront(long j, Runnable runnable);

    private native void nativeOnJSRunnerDelay(long j, Runnable runnable, long j2);

    private native void nativeOnOpenInspectorSession(long j);

    private native void nativeOnPlatformRunner(long j, Runnable runnable);

    private native void nativeOnWorkerRunner(long j, Runnable runnable);

    public static native void nativePostMessage(long j, String str);

    public static native void nativeRegisterDelegateFunction(long j);

    public static native void nativeReject(long j, String str, long j2);

    public static native void nativeResolve(long j, Response response, long j2);

    private native void nativeSetExceptionDelegate(long j, IWorkerExceptionDelegate iWorkerExceptionDelegate);

    private native void nativeSetProperties(long j, JavaOnlyMap javaOnlyMap);

    public static native void nativeTerminate(long j);

    public static native void nativeV8PipeInit(long j, long[] jArr);

    public static boolean preLoadPlugin(String str) {
        return true;
    }

    public static void v8pipeInit(long[] jArr) {
    }

    public static boolean initialize() {
        String[] strArr = {"quick", "napi", "worker"};
        int i = 0;
        boolean z = false;
        do {
            try {
                C16880lQ.LLJJJIL(strArr[i]);
            } catch (Throwable unused) {
                z = true;
            }
            i++;
        } while (i < 3);
        isInitialised = !z;
        return !z;
    }

    private boolean workDelegateExists() {
        if (this.mWorkerDelegate != null) {
            return true;
        }
        return false;
    }

    public long getNativePtr() {
        return this.mNativeWorkerPtr.get();
    }

    public boolean isRunning() {
        if (this.mNativeWorkerPtr.get() != 0) {
            return true;
        }
        return false;
    }

    public void terminate() {
        InspectorClient inspectorClient = this.mInspectorClient;
        if (inspectorClient != null) {
            inspectorClient.destroy();
        }
        C37622Epe c37622Epe = this.mInspectorClientNew;
        if (c37622Epe != null) {
            C66090Pwk c66090Pwk = C37622Epe.LJII;
            C66092Pwm c66092Pwm = c66090Pwk.LIZLLL;
            synchronized (c66092Pwm.LIZIZ) {
                ((ArrayList) c66092Pwm.LIZIZ).remove(c37622Epe);
            }
            c66090Pwk.LJ.LIZJ(c37622Epe.LJ, c37622Epe.LJFF);
            this.mInspectorClientNew = null;
        }
        if (this.mNativeWorkerPtr.get() != 0) {
            isInitialised = false;
            long andSet = this.mNativeWorkerPtr.getAndSet(0L);
            if (andSet != 0) {
                nativeTerminate(andSet);
            }
        }
    }

    public void onCloseInspectorSession() {
        if (isRunning()) {
            nativeOnCloseInspectorSession(this.mNativeWorkerPtr.get());
        }
    }

    public void onOpenInspectorSession() {
        if (isRunning()) {
            nativeOnOpenInspectorSession(this.mNativeWorkerPtr.get());
        }
    }

    public static boolean isIsInitialised() {
        return isInitialised;
    }

    public EngineType EngineType() {
        return this.mEngineType;
    }

    public IWorkerExceptionDelegate getDelegate() {
        return this.mExceptionDelegate;
    }

    public C37622Epe getInspectorClient() {
        return this.mInspectorClientNew;
    }

    public JSModuleManager getModuleManager() {
        return this.mModuleManager;
    }

    public int id() {
        return this.mSrcID;
    }

    /* loaded from: classes7.dex */
    public enum EngineType {
        QUICKJS,
        V8;

        public static EngineType valueOf(String str) {
            return (EngineType) V0N.LJJJ(EngineType.class, str);
        }
    }

    public JsWorker(C37625Eph c37625Eph) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        init(c37625Eph.LJFF, c37625Eph.LIZ, c37625Eph.LIZJ, c37625Eph.LIZLLL, c37625Eph.LIZIZ, c37625Eph.LJ);
    }

    private String FetchJsWithUrlSync(String str) {
        Object LIZ;
        InterfaceC37170EiM interfaceC37170EiM = this.mWorkerDelegate;
        if (interfaceC37170EiM != null) {
            WorkerDelegate workerDelegate = (WorkerDelegate) interfaceC37170EiM;
            Object obj = null;
            if (str == null) {
                return null;
            }
            try {
                LIZ = C37467En9.LIZ(workerDelegate.LIZLLL.LIZIZ(new C37627Epj(str), EnumC37644Eq0.Auto));
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (!C3C5.m12isFailureimpl(LIZ)) {
                obj = LIZ;
            }
            return (String) obj;
        }
        return "";
    }

    private void SendInspectorResponse(String str) {
        C37622Epe c37622Epe = this.mInspectorClientNew;
        if (c37622Epe == null || c37622Epe.LIZ == null) {
            return;
        }
        C66099Pwt c66099Pwt = (C66099Pwt) c37622Epe.LIZ;
        c66099Pwt.getClass();
        try {
            byte[] bytes = str.getBytes("UTF-8");
            c66099Pwt.LIZ(C78886Uxe.LJI(bytes, bytes.length, (byte) 1));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getCacheFilePath(String str) {
        return i0.LJFF(str, "/woker_code_cache.bin");
    }

    public static boolean initializeWithPlugin(String str) {
        boolean z;
        boolean z2;
        try {
            C16880lQ.LLJJJIL("quick");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (!isInitialised) {
            if (z) {
                z2 = true;
            } else {
                z2 = false;
            }
            isInitialised = z2;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public static boolean initializeWithPlugin2(String str) {
        if (!isInitialised) {
            isInitialised = true;
        }
        return true;
    }

    private void onError(String str) {
        InterfaceC37632Epo interfaceC37632Epo = this.mOnErrorCallback;
        if (interfaceC37632Epo != null) {
            interfaceC37632Epo.LIZ(str);
        }
    }

    private void onMessage(String str) {
        InterfaceC37632Epo interfaceC37632Epo = this.mOnMessageCallback;
        if (interfaceC37632Epo != null) {
            interfaceC37632Epo.LIZ(str);
        }
    }

    public void evaluateJavaScript(String str) {
        if (isRunning()) {
            nativeEvaluateJavaScript(this.mNativeWorkerPtr.get(), str, null, false);
        }
    }

    public <T extends InterfaceC37633Epp> T getJavaScriptFunction(Class<T> cls) {
        return (T) this.mJavaScriptModuleRegistry.getJavaScriptFunction(this, cls);
    }

    public <T extends InterfaceC37634Epq> T getJavaScriptModule(Class<T> cls) {
        return (T) this.mJavaScriptModuleRegistry.getJavaScriptModule(this, cls);
    }

    public void initInspector(InspectorClient inspectorClient) {
        InspectorClient inspectorClient2 = this.mInspectorClient;
        if (inspectorClient2 != null) {
            inspectorClient2.destroy();
        }
        this.mInspectorClient = inspectorClient;
        nativeInitInspector(this.mNativeWorkerPtr.get(), inspectorClient);
    }

    public void initV8Pipe(long[] jArr) {
        if (jArr != null && jArr.length > 3) {
            nativeV8PipeInit(this.mNativeWorkerPtr.get(), jArr);
        }
    }

    public void onInspectorMessage(String str) {
        if (isRunning()) {
            nativeOnInspectorMessage(this.mNativeWorkerPtr.get(), str);
        }
    }

    public void postMessage(String str) {
        if (isRunning()) {
            nativePostMessage(this.mNativeWorkerPtr.get(), str);
        }
    }

    public void postOnJSRunner(Runnable runnable) {
        if (isRunning()) {
            nativeOnJSRunner(this.mNativeWorkerPtr.get(), runnable);
        }
    }

    public void postOnJSRunnerAtFront(Runnable runnable) {
        if (isRunning()) {
            nativeOnJSRunnerAtFront(this.mNativeWorkerPtr.get(), runnable);
        }
    }

    public void postOnPlatformRunner(Runnable runnable) {
        if (this.mNativeWorkerPtr.get() != 0) {
            nativeOnPlatformRunner(this.mNativeWorkerPtr.get(), runnable);
        }
    }

    public void postOnWorkerRunner(Runnable runnable) {
        if (isRunning()) {
            nativeOnWorkerRunner(this.mNativeWorkerPtr.get(), runnable);
        }
    }

    public void setDelegate(IWorkerExceptionDelegate iWorkerExceptionDelegate) {
        if (iWorkerExceptionDelegate != null && this.mNativeWorkerPtr.get() != 0) {
            this.mExceptionDelegate = iWorkerExceptionDelegate;
            nativeSetExceptionDelegate(this.mNativeWorkerPtr.get(), iWorkerExceptionDelegate);
        }
    }

    public void setGlobalProperties(JavaOnlyMap javaOnlyMap) {
        if (javaOnlyMap != null && javaOnlyMap.size() > 0 && isRunning()) {
            nativeSetProperties(this.mNativeWorkerPtr.get(), javaOnlyMap);
        }
    }

    public void setInspectorClient(C37622Epe c37622Epe) {
        this.mInspectorClientNew = c37622Epe;
    }

    public void setOnErrorCallback(InterfaceC37632Epo interfaceC37632Epo) {
        this.mOnErrorCallback = interfaceC37632Epo;
    }

    public void setOnMessageCallback(InterfaceC37632Epo interfaceC37632Epo) {
        this.mOnMessageCallback = interfaceC37632Epo;
    }

    public void setWorkerDelegate(InterfaceC37170EiM interfaceC37170EiM) {
        this.mWorkerDelegate = interfaceC37170EiM;
        if (interfaceC37170EiM != null) {
            nativeRegisterDelegateFunction(this.mNativeWorkerPtr.get());
        }
    }

    public JsWorker(JSModuleManager jSModuleManager) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        EngineType engineType = EngineType.QUICKJS;
        this.mEngineType = engineType;
        this.mSrcID = -1;
        init(jSModuleManager, engineType, null, false, "unknown_android", false);
    }

    public JsWorker(JSModuleManager jSModuleManager, EngineType engineType) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        init(jSModuleManager, engineType, null, false, "unknown_android", false);
    }

    public void bind(int i, int i2) {
        this.mSrcID = i;
        nativeBind(this.mNativeWorkerPtr.get(), i, i2);
    }

    public void evaluateJavaScript(String str, String str2) {
        if (isRunning()) {
            nativeEvaluateJavaScript(this.mNativeWorkerPtr.get(), str, str2, false);
        }
    }

    public void evaluateJavaScriptWithException(String str, String str2) {
        if (isRunning()) {
            nativeEvaluateJavaScript(this.mNativeWorkerPtr.get(), str, str2, true);
        }
    }

    public void initWebAssembly(long j, EngineType engineType) {
        if (!C37630Epm.LIZ.booleanValue()) {
            return;
        }
        try {
            if (engineType == EngineType.QUICKJS) {
                nativeInitQJSWebAssembly(j, this.mNativeWorkerPtr.get());
            }
        } catch (Exception unused) {
        }
    }

    public void postOnJSRunnerDelay(Runnable runnable, long j) {
        if (this.mNativeWorkerPtr.get() != 0) {
            nativeOnJSRunnerDelay(this.mNativeWorkerPtr.get(), runnable, j);
        }
    }

    public JsWorker(JSModuleManager jSModuleManager, EngineType engineType, String str) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        init(jSModuleManager, engineType, i0.LJFF(str, "/woker_code_cache.bin"), false, "unknown_android", false);
    }

    public void registerModule(String str, Class<? extends JSModule> cls, Object obj) {
        if (this.mModuleManager != null && isRunning()) {
            this.mModuleManager.LIZIZ(str, cls, obj);
        }
    }

    public JsWorker(JSModuleManager jSModuleManager, EngineType engineType, boolean z) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        init(jSModuleManager, engineType, null, z, "unknown_android", false);
    }

    public JsWorker(JSModuleManager jSModuleManager, EngineType engineType, String str, boolean z) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        init(jSModuleManager, engineType, i0.LJFF(str, "/woker_code_cache.bin"), z, "unknown_android", false);
    }

    private void Fetch(String str, String str2, byte[] bArr, long j) {
        JSONObject jSONObject;
        if (this.mWorkerDelegate != null) {
            try {
                if (str2.isEmpty()) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(str2);
                }
                ((WorkerDelegate) this.mWorkerDelegate).LIZIZ(new Request(str, jSONObject, bArr), new C37621Epd(this, j), new C37620Epc(this, j));
            } catch (JSONException unused) {
            }
        }
    }

    public Object invokeJavaScriptFunction(String str, JavaOnlyArray javaOnlyArray, char c, boolean z) {
        if (isRunning()) {
            return nativeInvokeJavaScriptFunction(this.mNativeWorkerPtr.get(), str, javaOnlyArray, c);
        }
        return null;
    }

    public Object invokeJavaScriptModule(String str, String str2, JavaOnlyArray javaOnlyArray, char c) {
        if (isRunning()) {
            return nativeInvokeJavaScriptModule(this.mNativeWorkerPtr.get(), str, str2, javaOnlyArray, c);
        }
        return null;
    }

    public JsWorker(JSModuleManager jSModuleManager, EngineType engineType, String str, boolean z, String str2) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        init(jSModuleManager, engineType, i0.LJFF(str, "/woker_code_cache.bin"), z, str2, false);
    }

    private void init(JSModuleManager jSModuleManager, EngineType engineType, String str, boolean z, String str2, boolean z2) {
        long j;
        String str3 = str;
        if (!isInitialised) {
            initialize();
        }
        if (engineType == EngineType.QUICKJS) {
            j = 0;
        } else {
            j = 1;
        }
        this.mEngineType = engineType;
        if (!C36903Ee3.LIZJ().LIZ("vmsdk_enable_codecache")) {
            str3 = null;
        }
        this.mNativeWorkerPtr.set(nativeCreateWorker(this, j, jSModuleManager, str3, z, str2));
        this.mJavaScriptModuleRegistry = new JavaScriptRegistry();
        this.mModuleManager = jSModuleManager;
        if (z2) {
            this.mInspectorClientNew = new C37622Epe(this);
        } else {
            this.mInspectorClientNew = null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("biz_name", str2);
            jSONObject.put("init_worker", true);
            jSONObject.put("vmsdk_android_version", "2.3.12-tt");
            if (VmSdkMonitor.LIZ != null) {
                VmSdkMonitor.LIZ.LJIIJ("JsWorker", jSONObject, null, null);
            }
        } catch (Throwable unused) {
        }
    }
}
