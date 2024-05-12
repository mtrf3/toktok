package com.ss.android.ugc.aweme.spark;

import X.AbstractC60800Ntc;
import X.C60672NrY;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdSparkContext extends SparkContext {
    public final List<AbstractC60800Ntc> loadCallbacks = new ArrayList();
    public final AbstractC60800Ntc loadCallbackDelegate = new C60672NrY(this);

    public final void LJJIL(AbstractC60800Ntc loadCallback) {
        o.LJIIIZ(loadCallback, "loadCallback");
        this.loadCallbacks.add(loadCallback);
        LJIL(this.loadCallbackDelegate);
    }
}
