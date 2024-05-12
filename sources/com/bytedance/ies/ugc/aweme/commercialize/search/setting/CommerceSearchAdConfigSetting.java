package com.bytedance.ies.ugc.aweme.commercialize.search.setting;

import X.C221108m2;
import X.C46363IHn;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CommerceSearchAdConfigSetting {
    public static final CommerceSearchAdConfig LIZIZ;
    public static final CommerceSearchAdConfigSetting LIZ = new CommerceSearchAdConfigSetting();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C46363IHn.LJLIL);

    /* loaded from: classes9.dex */
    public static final class CommerceSearchAdConfig {

        @InterfaceC65349Pkn("card_show_buffer_millseconds")
        public final Integer cardShowBufferMillSeconds;

        @InterfaceC65349Pkn("disable_perf_for_search_ad")
        public final boolean disableFpsMonitorForSearchAd;

        @InterfaceC65349Pkn("enable_dedup_show_and_omsdk")
        public final boolean enableDedupShowAndOmsdk;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public CommerceSearchAdConfig() {
            /*
                r6 = this;
                r1 = 0
                r3 = 0
                r4 = 7
                r0 = r6
                r2 = r1
                r5 = r3
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting.CommerceSearchAdConfig.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommerceSearchAdConfig)) {
                return false;
            }
            CommerceSearchAdConfig commerceSearchAdConfig = (CommerceSearchAdConfig) obj;
            return this.enableDedupShowAndOmsdk == commerceSearchAdConfig.enableDedupShowAndOmsdk && this.disableFpsMonitorForSearchAd == commerceSearchAdConfig.disableFpsMonitorForSearchAd && o.LJ(this.cardShowBufferMillSeconds, commerceSearchAdConfig.cardShowBufferMillSeconds);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public final int hashCode() {
            boolean z = this.enableDedupShowAndOmsdk;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = ((r0 * 31) + (this.disableFpsMonitorForSearchAd ? 1 : 0)) * 31;
            Integer num = this.cardShowBufferMillSeconds;
            return i + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CommerceSearchAdConfig(enableDedupShowAndOmsdk=");
            LIZ.append(this.enableDedupShowAndOmsdk);
            LIZ.append(", disableFpsMonitorForSearchAd=");
            LIZ.append(this.disableFpsMonitorForSearchAd);
            LIZ.append(", cardShowBufferMillSeconds=");
            return s0.LIZJ(LIZ, this.cardShowBufferMillSeconds, ')', LIZ);
        }

        public CommerceSearchAdConfig(boolean z, boolean z2, Integer num) {
            this.enableDedupShowAndOmsdk = z;
            this.disableFpsMonitorForSearchAd = z2;
            this.cardShowBufferMillSeconds = num;
        }

        public /* synthetic */ CommerceSearchAdConfig(boolean z, boolean z2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 300 : num);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        LIZIZ = new CommerceSearchAdConfig(z, z, null, 7, 0 == true ? 1 : 0);
    }

    public static final CommerceSearchAdConfig LIZ() {
        return (CommerceSearchAdConfig) LIZJ.getValue();
    }
}
