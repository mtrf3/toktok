package X;

import com.ss.android.agilelogger.ALog;

/* renamed from: X.Ecq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36828Ecq implements InterfaceC36830Ecs {
    @Override // X.InterfaceC36830Ecs
    public final boolean LIZ() {
        float f;
        boolean z;
        try {
            f = (float) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / Runtime.getRuntime().maxMemory());
        } catch (Exception unused) {
            f = 0.0f;
        }
        if (f > 0.7f) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" useHeapMemoryRate: ");
        LIZ.append(f);
        LIZ.append(" MEMORY_USE_RATE_THRESHOLD:");
        LIZ.append(0.7f);
        LIZ.append(" should kill app:");
        LIZ.append(z);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LowJavaHeapKillStrategy", X1D.LIZIZ(LIZ));
        return z;
    }
}
