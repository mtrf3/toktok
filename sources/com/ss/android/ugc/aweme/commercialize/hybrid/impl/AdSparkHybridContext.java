package com.ss.android.ugc.aweme.commercialize.hybrid.impl;

import X.AbstractC60800Ntc;
import X.C60670NrW;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class AdSparkHybridContext extends SparkContext {
    public final List<AbstractC60800Ntc> loadCallbacks = new ArrayList();
    public final AbstractC60800Ntc loadCallbackDelegate = new C60670NrW(this);

    public final void LJJIL(AbstractC60800Ntc abstractC60800Ntc) {
        if (abstractC60800Ntc != null) {
            this.loadCallbacks.add(abstractC60800Ntc);
            LJIL(this.loadCallbackDelegate);
        }
    }
}
