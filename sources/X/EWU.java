package X;

import com.bytedance.apm6.cpu.ApmCpuManager;

/* loaded from: classes7.dex */
public final class EWU {
    public static final void LIZ(String str) {
        if (((Boolean) C34002DWc.LIZIZ.getValue()).booleanValue()) {
            ApmCpuManager.getInstance().startUsageDetect(str);
        }
    }

    public static final void LIZIZ(String str) {
        if (((Boolean) C34002DWc.LIZIZ.getValue()).booleanValue()) {
            ApmCpuManager.getInstance().stopUsageDetect(str, false);
        }
    }
}
