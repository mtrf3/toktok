package com.bytedance.pitaya.api;

import X.C16880lQ;
import X.C38436F6q;
import X.C38439F6t;
import X.RunnableC38438F6s;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import com.bytedance.pitaya.api.bean.PTYProxySetting;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class PitayaProxy implements ReflectionCall {
    public static volatile PitayaApplogProxy applogProxy;
    public static volatile boolean hasProxySoLoadFailed;
    public static volatile boolean initOnce;
    public static volatile boolean isProxySoLoaded;
    public static volatile PTYProxySetting mSetting;
    public static final PitayaProxy INSTANCE = new PitayaProxy();
    public static final String TAG = TAG;
    public static final String TAG = TAG;

    public static final int applogCacheSize() {
        PitayaApplogProxy pitayaApplogProxy = applogProxy;
        if (pitayaApplogProxy != null) {
            return pitayaApplogProxy.cacheSize();
        }
        return 0;
    }

    public static final boolean isFeatureStoreProxyEnabled() {
        PTYProxySetting pTYProxySetting;
        if (!initOnce || (pTYProxySetting = mSetting) == null || !pTYProxySetting.getFeatureStoreProxyEnabled() || !loadProxySo()) {
            return false;
        }
        return true;
    }

    public static final boolean loadProxySo() {
        if (isProxySoLoaded) {
            return true;
        }
        if (hasProxySoLoadFailed) {
            return false;
        }
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            new PthreadThread(RunnableC38438F6s.LJLIL, "i/PitayaProxy").start();
            return false;
        }
        return loadProxySoImpl();
    }

    public static final boolean loadProxySoImpl() {
        synchronized (INSTANCE) {
            try {
                if (!isProxySoLoaded) {
                    C16880lQ.LLJJJIL("AndroidPitayaProxy");
                    isProxySoLoaded = true;
                }
            } catch (Throwable unused) {
                hasProxySoLoadFailed = true;
                return false;
            }
        }
        return true;
    }

    public final String getTAG() {
        return TAG;
    }

    public static final void processApplogCache(PTYApplogImplCallback callback) {
        o.LJIIJ(callback, "callback");
        PitayaApplogProxy pitayaApplogProxy = applogProxy;
        if (pitayaApplogProxy != null) {
            pitayaApplogProxy.storeCache(callback);
        }
        applogProxy = null;
    }

    public static final boolean init(Context context, PTYProxySetting setting) {
        WeakReference<Context> weakReference;
        Boolean bool;
        o.LJIIJ(context, "context");
        o.LJIIJ(setting, "setting");
        synchronized (INSTANCE) {
            if (initOnce) {
                return false;
            }
            initOnce = true;
            if (context instanceof Application) {
                weakReference = new WeakReference<>(((ContextWrapper) context).getBaseContext());
            } else {
                weakReference = new WeakReference<>(context);
            }
            C38439F6t.LIZ = weakReference;
            mSetting = setting;
            if (setting.getApplogProxyEnabled()) {
                applogProxy = new PitayaApplogProxy();
                PitayaApplogProxy pitayaApplogProxy = applogProxy;
                if (pitayaApplogProxy != null) {
                    bool = Boolean.valueOf(pitayaApplogProxy.init(setting));
                } else {
                    bool = null;
                }
                if (o.LJ(bool, Boolean.FALSE)) {
                    applogProxy = null;
                } else if (!setting.getProvideAppLog()) {
                    AppLog.registerGlobalEventCallback(C38436F6q.LIZ);
                }
            }
            return true;
        }
    }

    public static final void onAppLogEvent(String eventName, String str) {
        o.LJIIJ(eventName, "eventName");
        PitayaApplogProxy pitayaApplogProxy = applogProxy;
        if (pitayaApplogProxy != null) {
            pitayaApplogProxy.onEvent(eventName, str);
        }
    }

    public static final void onAppLogEvent(String eventName, JSONObject jSONObject) {
        o.LJIIJ(eventName, "eventName");
        PitayaApplogProxy pitayaApplogProxy = applogProxy;
        if (pitayaApplogProxy != null) {
            pitayaApplogProxy.onEvent(eventName, jSONObject);
        }
    }
}
