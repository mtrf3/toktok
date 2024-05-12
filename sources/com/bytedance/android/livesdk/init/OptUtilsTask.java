package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.C31209CMr;
import X.CN1;
import X.InterfaceC30950CCs;
import android.content.Context;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class OptUtilsTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "opt_utils_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        GlobalContext.setApplicationContext(context);
        try {
            Class.forName("com.bytedance.android.livesdk.utils.LiveAppBundleUtils");
        } catch (Exception unused) {
        }
        C31209CMr.LIZ(context);
    }
}
