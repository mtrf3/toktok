package com.ss.android.ugc.aweme.ecommerce.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class SparkSwitchConfig extends F9E {

    @InterfaceC65349Pkn("enable_spark_container")
    public boolean enableSparkContainer;

    public SparkSwitchConfig() {
        this(false, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableSparkContainer)};
    }

    public SparkSwitchConfig(boolean z) {
        this.enableSparkContainer = z;
    }

    public /* synthetic */ SparkSwitchConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
