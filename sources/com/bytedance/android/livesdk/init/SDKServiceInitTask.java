package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.C0NB;
import X.C173216qz;
import X.C30036Bqa;
import X.C30922CBq;
import X.C73548Stk;
import X.C78886Uxe;
import X.CN1;
import X.X1D;
import Y.AfS17S0001000_5;
import com.bytedance.android.livesdk.livesetting.other.LiveFakeRegionChannelSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveConstraintLayoutOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.widgets.ConstraintOptimizer;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class SDKServiceInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "sdk_service_init_task";
    }

    public static boolean isDebug() {
        if (CN1.LIZ(IHostAppContext.class) == null || !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        C173216qz.LJLJJI = System.currentTimeMillis();
        boolean isDebug = isDebug();
        if (C73548Stk.LIZ == null && !isDebug) {
            C73548Stk.LIZ = new AfS17S0001000_5(2, 18);
        }
        if (Arrays.asList(LiveFakeRegionChannelSettings.INSTANCE.getValue()).contains(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel())) {
            C30922CBq.LIZ = true;
        } else {
            C30922CBq.LIZ = false;
        }
        C78886Uxe.LJLL = new C30036Bqa();
        ConstraintOptimizer.setEnableOpt(LiveConstraintLayoutOptSetting.enableDoubleSolve(), isDebug);
    }

    public static /* synthetic */ void lambda$run$0(Throwable th) {
        if (th == null) {
            th = new UnknownError("unknown error");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("message = ");
        LIZ.append(th.getMessage());
        C0NB.LJ("RxJava", X1D.LIZIZ(LIZ));
        if (th.getStackTrace() != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("\t\t");
                LIZ2.append(stackTraceElement.toString());
                C0NB.LJ("RxJava", X1D.LIZIZ(LIZ2));
            }
        }
    }
}
