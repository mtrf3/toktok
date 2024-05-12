package X;

import Y.ARunnableS1S2101000_11;
import Y.ARunnableS2S0202000_8;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGCThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchScrollFpsOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.common.utility.Logger;
import com.ss.android.agilelogger.ALog;

/* loaded from: classes6.dex */
public final class BZK implements BZL {
    @Override // X.BZL
    public final boolean LIZIZ() {
        return Logger.debug();
    }

    public static void LIZLLL(Runnable runnable) {
        if (LiveGCThreadOptSetting.disableAlogInBgThread()) {
            runnable.run();
        } else {
            C38995FSd.LIZIZ().submit(runnable);
        }
    }

    @Override // X.BZL
    public final void LIZ(String str, Throwable th) {
        LJFF(5, "JavaCalls", str, th);
    }

    @Override // X.BZL
    public final void d(String str, String str2) {
        LJ(3, str, str2);
    }

    @Override // X.BZL
    public final void e(String str, String str2) {
        LJ(6, str, str2);
    }

    @Override // X.BZL
    public final void i(String str, String str2) {
        LJ(4, str, str2);
    }

    @Override // X.BZL
    public final void v(String str, String str2) {
        LJ(2, str, str2);
    }

    @Override // X.BZL
    public final void w(String str, String str2) {
        LJ(5, str, str2);
    }

    @Override // X.BZL
    public final void LIZJ(int i, String str, StackTraceElement[] stackTraceElementArr) {
        if (LiveEnableALogSetting.INSTANCE.isEnable()) {
            LIZLLL(new ARunnableS2S0202000_8(i, str, stackTraceElementArr, 1));
        }
    }

    public final void LJ(int i, String str, String str2) {
        if (LiveEnableALogSetting.INSTANCE.isDisable() || C30757C5h.LIZ(str) || ScalableDowngradeSetting.disableAlog()) {
            return;
        }
        if (C30326BvG.LIZIZ && LiveWatchScrollFpsOptSetting.INSTANCE.enable("alog")) {
            return;
        }
        LIZLLL(new ARunnableS1S2101000_11(i, str, str2, this, 2));
    }

    @Override // X.BZL
    public final void e(String str, String str2, Throwable th) {
        LJFF(6, str, str2, th);
    }

    public final void LJFF(final int i, final String str, final String str2, final Throwable th) {
        if (LiveEnableALogSetting.INSTANCE.isDisable() || C30757C5h.LIZ(str)) {
            return;
        }
        LIZLLL(new Runnable() { // from class: X.PvT
            @Override // java.lang.Runnable
            public final void run() {
                BZK bzk = BZK.this;
                int i2 = i;
                String str3 = str;
                String str4 = str2;
                Throwable th2 = th;
                bzk.getClass();
                boolean isEmpty = TextUtils.isEmpty(str4);
                if (i2 != 5) {
                    if (i2 != 6) {
                        return;
                    }
                    if (isEmpty) {
                        if (AbstractC66014PvW.LIZ == null) {
                            return;
                        }
                        ALog.e(str3, th2);
                        return;
                    }
                    AbstractC66014PvW.LIZIZ(str3, str4, th2);
                    return;
                }
                if (isEmpty) {
                    if (AbstractC66014PvW.LIZ == null) {
                        return;
                    }
                    ALog.w(str3, th2);
                } else {
                    if (AbstractC66014PvW.LIZ == null) {
                        return;
                    }
                    ALog.w(str3, str4, th2);
                }
            }
        });
    }
}
