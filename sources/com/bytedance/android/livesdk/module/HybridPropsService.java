package com.bytedance.android.livesdk.module;

import X.C29262Be6;
import com.bytedance.android.live.browser.IHybridPropsService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class HybridPropsService implements IHybridPropsService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.browser.IHybridPropsService
    public final Map<String, Object> dg() {
        return C29262Be6.LIZ.LIZIZ();
    }

    @Override // com.bytedance.android.live.browser.IHybridPropsService
    public final Map<String, String> Sd0() {
        return C29262Be6.LIZ();
    }

    @Override // com.bytedance.android.live.browser.IHybridPropsService
    public final void NB(boolean z) {
        C29262Be6 c29262Be6 = C29262Be6.LIZ;
        if (z == C29262Be6.LIZIZ) {
            return;
        }
        synchronized (c29262Be6) {
            if (z) {
                C29262Be6.LIZIZ = true;
            } else {
                C29262Be6.LIZIZ = false;
                Map<String, Object> map = C29262Be6.LIZJ;
                if (map != null) {
                    ((HashMap) map).clear();
                }
                C29262Be6.LIZJ = null;
            }
        }
    }
}
