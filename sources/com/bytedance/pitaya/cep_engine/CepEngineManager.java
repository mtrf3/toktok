package com.bytedance.pitaya.cep_engine;

import X.C16880lQ;
import com.bytedance.pitaya.cep_engine.dispatcher.Dispatcher;
import com.bytedance.pitaya.cep_engine.helper.DictProxyHelper;
import com.bytedance.pitaya.cep_engine.helper.JsonHelper;
import com.bytedance.pitaya.cep_engine.monitor.Monitor;
import com.bytedance.pitaya.cep_engine.port.CepAsyncListener;
import com.bytedance.pitaya.cep_engine.port.CepBizFunc;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import com.bytedance.pitaya.cep_engine.timer.Timer;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CepEngineManager implements CepKeeper {
    public static final CepEngineManager INSTANCE;
    public static final Object initLock;
    public static volatile boolean isInit;

    private final void loadTTM() {
        try {
            Method declaredMethod = CepSubModule.class.getDeclaredMethod("load", new Class[0]);
            if (declaredMethod != null) {
                try {
                    Object invoke = declaredMethod.invoke(Class.forName("com.bytedance.pitaya.cep_ttm.CepTTMLoader").newInstance(), new Object[0]);
                    if (invoke != null) {
                        ((Boolean) invoke).booleanValue();
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private final native void nativeAsyncProcessEvent(String str, String str2, DictProxyHelper dictProxyHelper, long j);

    private final native boolean nativeCleanBizRule(String str, String str2);

    private final native boolean nativeConfigRules(String str, String str2);

    private final native void nativeInit(Timer timer, Dispatcher dispatcher, JsonHelper jsonHelper, Monitor monitor);

    private final native CepEngineResult nativeProcessEventInCurrentThread(String str, String str2, DictProxyHelper dictProxyHelper, long j);

    private final native boolean nativeRegisterBizFunction(String str, String str2, CepBizFunc cepBizFunc);

    private final native boolean nativeRegisterBizListener(String str, CepAsyncListener cepAsyncListener);

    private final native void nativeRegisterHostInfo(CepHostInfo cepHostInfo);

    private final native boolean nativeRegisterRuleListener(String str, String str2, CepAsyncListener cepAsyncListener);

    private final native CepEngineResult nativeSyncProcessEvent(String str, String str2, DictProxyHelper dictProxyHelper, long j);

    private final native boolean nativeUnregisterBizListener(String str);

    private final native boolean nativeUnregisterRuleListener(String str, String str2);

    static {
        CepEngineManager cepEngineManager = new CepEngineManager();
        INSTANCE = cepEngineManager;
        initLock = new Object();
        cepEngineManager.init();
    }

    public final void init() {
        if (!isInit) {
            synchronized (initLock) {
                if (!isInit) {
                    try {
                        C16880lQ.LLJJJIL("CepEngine");
                        try {
                            INSTANCE.nativeInit(Timer.INSTANCE, Dispatcher.INSTANCE, JsonHelper.INSTANCE, Monitor.INSTANCE);
                        } catch (Throwable unused) {
                        }
                        INSTANCE.loadTTM();
                        isInit = true;
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public final void registerHostInfo(CepHostInfo cepHostInfo) {
        o.LJIIIZ(cepHostInfo, "cepHostInfo");
        try {
            INSTANCE.nativeRegisterHostInfo(cepHostInfo);
        } catch (Throwable unused) {
        }
    }

    public final Boolean unregisterBizListener(String bizName) {
        o.LJIIIZ(bizName, "bizName");
        if (!isInit) {
            return Boolean.FALSE;
        }
        try {
            return Boolean.valueOf(INSTANCE.nativeUnregisterBizListener(bizName));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean cleanRule(String bizName, String ruleName) {
        o.LJIIIZ(bizName, "bizName");
        o.LJIIIZ(ruleName, "ruleName");
        if (!isInit) {
            return Boolean.FALSE;
        }
        try {
            return Boolean.valueOf(INSTANCE.nativeCleanBizRule(bizName, ruleName));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean configRules(String bizName, JSONObject rules) {
        o.LJIIIZ(bizName, "bizName");
        o.LJIIIZ(rules, "rules");
        if (!isInit) {
            return Boolean.FALSE;
        }
        try {
            CepEngineManager cepEngineManager = INSTANCE;
            String jSONObject = rules.toString();
            o.LJIIIIZZ(jSONObject, "rules.toString()");
            return Boolean.valueOf(cepEngineManager.nativeConfigRules(bizName, jSONObject));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean registerBizListener(String bizName, CepAsyncListener listener) {
        o.LJIIIZ(bizName, "bizName");
        o.LJIIIZ(listener, "listener");
        if (!isInit) {
            return Boolean.FALSE;
        }
        try {
            return Boolean.valueOf(INSTANCE.nativeRegisterBizListener(bizName, listener));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean unregisterRuleListener(String bizName, String ruleName) {
        o.LJIIIZ(bizName, "bizName");
        o.LJIIIZ(ruleName, "ruleName");
        if (!isInit) {
            return Boolean.FALSE;
        }
        try {
            return Boolean.valueOf(INSTANCE.nativeUnregisterRuleListener(bizName, ruleName));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean registerBizFunc(String bizName, String functionName, CepBizFunc function) {
        o.LJIIIZ(bizName, "bizName");
        o.LJIIIZ(functionName, "functionName");
        o.LJIIIZ(function, "function");
        if (!isInit) {
            return Boolean.FALSE;
        }
        try {
            return Boolean.valueOf(INSTANCE.nativeRegisterBizFunction(bizName, functionName, function));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean registerRuleListener(String bizName, String ruleName, CepAsyncListener listener) {
        o.LJIIIZ(bizName, "bizName");
        o.LJIIIZ(ruleName, "ruleName");
        o.LJIIIZ(listener, "listener");
        if (!isInit) {
            return Boolean.FALSE;
        }
        try {
            return Boolean.valueOf(INSTANCE.nativeRegisterRuleListener(bizName, ruleName, listener));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void asyncProcessEvent(String bizName, String ruleName, JSONObject event, long j) {
        o.LJIIIZ(bizName, "bizName");
        o.LJIIIZ(ruleName, "ruleName");
        o.LJIIIZ(event, "event");
        if (!isInit) {
            return;
        }
        try {
            INSTANCE.nativeAsyncProcessEvent(bizName, ruleName, new DictProxyHelper(event), j);
        } catch (Throwable unused) {
        }
    }

    public final CepEngineResult processEventInCurrentThread(String bizName, String ruleName, JSONObject event, long j) {
        o.LJIIIZ(bizName, "bizName");
        o.LJIIIZ(ruleName, "ruleName");
        o.LJIIIZ(event, "event");
        if (!isInit) {
            return null;
        }
        try {
            return INSTANCE.nativeProcessEventInCurrentThread(bizName, ruleName, new DictProxyHelper(event), j);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final CepEngineResult syncProcessEvent(String bizName, String ruleName, JSONObject event, long j) {
        o.LJIIIZ(bizName, "bizName");
        o.LJIIIZ(ruleName, "ruleName");
        o.LJIIIZ(event, "event");
        if (!isInit) {
            return null;
        }
        try {
            return INSTANCE.nativeSyncProcessEvent(bizName, ruleName, new DictProxyHelper(event), j);
        } catch (Throwable unused) {
            return null;
        }
    }
}
