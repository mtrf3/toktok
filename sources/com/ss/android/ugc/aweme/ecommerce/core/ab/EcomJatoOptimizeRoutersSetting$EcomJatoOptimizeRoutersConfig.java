package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig {

    @InterfaceC65349Pkn("channels")
    public final String channels;

    @InterfaceC65349Pkn("delay")
    public final long delay;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig() {
        this(null, false, 0L, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig copy$default(EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig ecomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig, String str, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig.channels;
        }
        if ((i & 2) != 0) {
            z = ecomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig.enable;
        }
        if ((i & 4) != 0) {
            j = ecomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig.delay;
        }
        return ecomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig.copy(str, z, j);
    }

    public final EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig copy(String str, boolean z, long j) {
        return new EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig(str, z, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig)) {
            return false;
        }
        EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig ecomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig = (EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig) obj;
        return o.LJ(this.channels, ecomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig.channels) && this.enable == ecomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig.enable && this.delay == ecomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig.delay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.channels;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.enable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return C16880lQ.LLJIJIL(this.delay) + ((hashCode + i) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomJatoOptimizeRoutersConfig(channels=");
        LIZ.append(this.channels);
        LIZ.append(", enable=");
        LIZ.append(this.enable);
        LIZ.append(", delay=");
        return C47135Ieh.LIZIZ(LIZ, this.delay, ')', LIZ);
    }

    public final String getChannels() {
        return this.channels;
    }

    public final long getDelay() {
        return this.delay;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig(String str, boolean z, long j) {
        this.channels = str;
        this.enable = z;
        this.delay = j;
    }

    public /* synthetic */ EcomJatoOptimizeRoutersSetting$EcomJatoOptimizeRoutersConfig(String str, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 2000L : j);
    }
}
