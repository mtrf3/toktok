package com.lynx.jsbridge;

import X.X1D;
import com.lynx.tasm.base.LLog;

/* loaded from: classes7.dex */
public class WebAssemblyBridge {
    public static native void nativeInitWasm(long j);

    public static void LIZ() {
        try {
            long longValue = ((Long) Class.forName("com.bytedance.vmsdk.wasm.RegisterWebAssembly").getMethod("registerWebAssembly", new Class[0]).invoke(null, new Object[0])).longValue();
            if (longValue != 0) {
                nativeInitWasm(longValue);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("No webassembly found in the host [ ");
            LIZ.append(e.getMessage());
            LIZ.append(", ");
            LIZ.append(e.getCause());
            LIZ.append(" ]");
            LLog.LIZLLL(4, "lynx", X1D.LIZIZ(LIZ));
        }
    }
}
