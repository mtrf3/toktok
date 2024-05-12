package X;

import com.ss.android.agilelogger.ALog;

/* loaded from: classes17.dex */
public final class Z94 implements InterfaceC32445CoL {
    public boolean LIZ = true;

    @Override // X.InterfaceC32445CoL
    public final void d(String str, String str2) {
        if (!this.LIZ) {
            return;
        }
        try {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
        } catch (Throwable unused) {
            this.LIZ = false;
        }
    }

    @Override // X.InterfaceC32445CoL
    public final void e(String str, String str2) {
        if (!this.LIZ) {
            return;
        }
        try {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(str, str2);
        } catch (Throwable unused) {
            this.LIZ = false;
        }
    }

    @Override // X.InterfaceC32445CoL
    public final void i(String str, String str2) {
        if (!this.LIZ) {
            return;
        }
        try {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
        } catch (Throwable unused) {
            this.LIZ = false;
        }
    }

    @Override // X.InterfaceC32445CoL
    public final void e(String str, String str2, Throwable th) {
        if (!this.LIZ) {
            return;
        }
        try {
            ALog.e(str, str2, th);
        } catch (Throwable unused) {
            this.LIZ = false;
        }
    }
}
