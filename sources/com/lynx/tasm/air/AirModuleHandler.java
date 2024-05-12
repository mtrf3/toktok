package com.lynx.tasm.air;

import X.C40053Fnl;
import X.F54;
import X.F57;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.tasm.base.LLog;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class AirModuleHandler implements F57 {
    public LynxModuleManager LIZ;
    public long LIZIZ;

    private native void nativeInvokeAirModuleCallback(long j, int i, String str, Object obj);

    public void destroy() {
        this.LIZIZ = 0L;
        this.LIZ = null;
    }

    public AirModuleHandler(LynxModuleManager lynxModuleManager) {
        this.LIZ = lynxModuleManager;
    }

    public void setNativePtr(long j) {
        if (this.LIZ == null) {
            LLog.LIZLLL(4, "AirModuleHandler", "ModuleManager does not exist!");
        } else {
            this.LIZIZ = j;
        }
    }

    public void triggerBridgeAsync(String str, Object obj) {
        LynxModuleManager lynxModuleManager = this.LIZ;
        if (lynxModuleManager == null) {
            LLog.LIZLLL(4, "AirModuleHandler", "ModuleManager does not exist!");
        } else {
            F54.LIZJ(str, obj, this, lynxModuleManager);
        }
    }

    public ByteBuffer triggerBridgeSync(String str, Object obj) {
        LynxModuleManager lynxModuleManager = this.LIZ;
        if (lynxModuleManager == null) {
            LLog.LIZLLL(4, "AirModuleHandler", "ModuleManager does not exist!");
            return null;
        }
        C40053Fnl c40053Fnl = C40053Fnl.LIZ;
        Object LIZIZ = F54.LIZIZ(str, obj, lynxModuleManager);
        c40053Fnl.getClass();
        return C40053Fnl.LIZIZ(LIZIZ);
    }

    @Override // X.F57
    public final void LIZ(int i, String str, Object obj) {
        long j = this.LIZIZ;
        if (j == 0) {
            LLog.LIZLLL(4, "AirModuleHandler", "native module handler does not register!");
        } else {
            nativeInvokeAirModuleCallback(j, i, str, obj);
        }
    }
}
