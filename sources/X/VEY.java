package X;

import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public final class VEY {
    public volatile InterfaceC79401VEf LIZ;

    public final void LIZ(String str, String str2) {
        if (str2 != null) {
            try {
                if (this.LIZ == null) {
                    synchronized (this) {
                        if (this.LIZ == null) {
                            this.LIZ = (InterfaceC79401VEf) VEZ.LIZIZ().LIZ(InterfaceC79401VEf.class);
                        }
                    }
                }
                if (this.LIZ == null) {
                    LLog.LIZLLL(4, "LynxInfoReportHelper", "LynxMonitorService is null");
                } else {
                    this.LIZ.reportCrashGlobalContextTag(str, str2);
                }
            } catch (ClassCastException | NullPointerException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Report Lynx Crash Context tag failed for LynxServiceCenter ");
                LIZ.append(e.getMessage());
                LLog.LIZLLL(3, "LynxInfoReportHelper", X1D.LIZIZ(LIZ));
            }
        }
    }
}
