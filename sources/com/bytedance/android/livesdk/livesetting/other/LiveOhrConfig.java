package com.bytedance.android.livesdk.livesetting.other;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveOhrConfig {

    @InterfaceC65349Pkn("ohr_predict_enable")
    public boolean ohrPredictEnable;

    public LiveOhrConfig() {
        this(false, 1, null);
    }

    public LiveOhrConfig(boolean z) {
        this.ohrPredictEnable = z;
    }

    public /* synthetic */ LiveOhrConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
