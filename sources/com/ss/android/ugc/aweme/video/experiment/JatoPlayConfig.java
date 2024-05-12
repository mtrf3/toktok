package com.ss.android.ugc.aweme.video.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class JatoPlayConfig {

    @InterfaceC65349Pkn("play")
    public final JatoBoostConfig playConfig;

    @InterfaceC65349Pkn("pre_render")
    public final JatoBoostConfig preRenderConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public JatoPlayConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JatoPlayConfig)) {
            return false;
        }
        JatoPlayConfig jatoPlayConfig = (JatoPlayConfig) obj;
        return o.LJ(this.playConfig, jatoPlayConfig.playConfig) && o.LJ(this.preRenderConfig, jatoPlayConfig.preRenderConfig);
    }

    public final int hashCode() {
        JatoBoostConfig jatoBoostConfig = this.playConfig;
        int hashCode = (jatoBoostConfig == null ? 0 : jatoBoostConfig.hashCode()) * 31;
        JatoBoostConfig jatoBoostConfig2 = this.preRenderConfig;
        return hashCode + (jatoBoostConfig2 != null ? jatoBoostConfig2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JatoPlayConfig(playConfig=");
        LIZ.append(this.playConfig);
        LIZ.append(", preRenderConfig=");
        LIZ.append(this.preRenderConfig);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public JatoPlayConfig(JatoBoostConfig jatoBoostConfig, JatoBoostConfig jatoBoostConfig2) {
        this.playConfig = jatoBoostConfig;
        this.preRenderConfig = jatoBoostConfig2;
    }

    public /* synthetic */ JatoPlayConfig(JatoBoostConfig jatoBoostConfig, JatoBoostConfig jatoBoostConfig2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jatoBoostConfig, (i & 2) != 0 ? null : jatoBoostConfig2);
    }
}
