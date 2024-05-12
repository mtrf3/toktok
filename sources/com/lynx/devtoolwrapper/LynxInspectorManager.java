package com.lynx.devtoolwrapper;

import com.lynx.tasm.LynxEnv;

/* loaded from: classes7.dex */
public class LynxInspectorManager {
    private native long nativeCreateInspectorManager(LynxInspectorManager lynxInspectorManager);

    private native void nativeDestroy(long j);

    private native long nativeGetFirstPerfContainer(long j);

    private native long nativeGetTemplateApiDefaultProcessor(long j);

    private native long nativeGetTemplateApiProcessorMap(long j);

    private native void nativeHotModuleReplace(long j, long j2, String str);

    private native void nativeOnTASMCreated(long j, long j2);

    private native void nativeRunJavaTaskOnJsLoop(long j, Runnable runnable, int i);

    private native void nativeSetLynxEnv(long j, String str, boolean z);

    public long createInspectorRuntimeManager() {
        if (!LynxEnv.LJIIIZ().LJIIJJI() || !LynxEnv.LJIIIZ().LJIIJ()) {
            return 0L;
        }
        throw null;
    }

    public long getJavascriptDebugger() {
        throw null;
    }

    public long getLynxDevtoolFunction() {
        throw null;
    }

    public static void onJavaTaskCalled(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public long getLepusDebugger(String str) {
        throw null;
    }

    public void call(String str, String str2) {
        throw null;
    }

    public void sendConsoleMessage(String str, int i, long j) {
        throw null;
    }
}
