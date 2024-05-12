package com.ss.android.ugc.aweme.ecommercelive.common.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class LiveSparkSwitchConfig extends F9E {

    @InterfaceC65349Pkn("enable_spark_intercept")
    public boolean enableSparkInterceptor;

    public LiveSparkSwitchConfig() {
        this(false, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableSparkInterceptor)};
    }

    public LiveSparkSwitchConfig(boolean z) {
        this.enableSparkInterceptor = z;
    }

    public /* synthetic */ LiveSparkSwitchConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
