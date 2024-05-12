package X;

import com.ss.android.ugc.effectmanager.common.logger.ILogger;

/* loaded from: classes8.dex */
public final class HMG implements ILogger {
    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public final void d(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("effect_platform::");
        LIZ.append(str);
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public final void i(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("effect_platform::");
        LIZ.append(str);
        H7B.LJ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public final void w(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("effect_platform::");
        LIZ.append(str);
        H7B.LJFF(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public final void e(String str, Throwable th) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("effect_platform::", str, ", cause::");
        LIZIZ.append(android.util.Log.getStackTraceString(th));
        H7B.LIZJ(X1D.LIZIZ(LIZIZ));
    }
}
