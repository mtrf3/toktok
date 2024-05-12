package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TopViewGeckoExperiment {
    public static final TopViewGeckoExperiment LIZ = new TopViewGeckoExperiment();

    /* loaded from: classes2.dex */
    public static final class GeckoOptimizeSetting {

        @InterfaceC65349Pkn("did_optimize")
        public final boolean didOptimize;

        @InterfaceC65349Pkn("expire_time_for_long_time_channel")
        public final Long longTimeBuffer;

        @InterfaceC65349Pkn("long_time_channel")
        public final List<String> longTimeChannel;

        @InterfaceC65349Pkn("normal_buffer")
        public final long normalBuffer;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeckoOptimizeSetting)) {
                return false;
            }
            GeckoOptimizeSetting geckoOptimizeSetting = (GeckoOptimizeSetting) obj;
            return this.didOptimize == geckoOptimizeSetting.didOptimize && this.normalBuffer == geckoOptimizeSetting.normalBuffer && o.LJ(this.longTimeChannel, geckoOptimizeSetting.longTimeChannel) && o.LJ(this.longTimeBuffer, geckoOptimizeSetting.longTimeBuffer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public final int hashCode() {
            int hashCode;
            boolean z = this.didOptimize;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int LIZJ = JBR.LIZJ(this.normalBuffer, r0 * 31, 31);
            List<String> list = this.longTimeChannel;
            int i = 0;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            int i2 = (LIZJ + hashCode) * 31;
            Long l = this.longTimeBuffer;
            if (l != null) {
                i = l.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GeckoOptimizeSetting(didOptimize=");
            LIZ.append(this.didOptimize);
            LIZ.append(", normalBuffer=");
            LIZ.append(this.normalBuffer);
            LIZ.append(", longTimeChannel=");
            LIZ.append(this.longTimeChannel);
            LIZ.append(", longTimeBuffer=");
            return JBR.LJ(LIZ, this.longTimeBuffer, ')', LIZ);
        }

        public GeckoOptimizeSetting(boolean z, long j, List<String> list, Long l) {
            this.didOptimize = z;
            this.normalBuffer = j;
            this.longTimeChannel = list;
            this.longTimeBuffer = l;
        }
    }
}
