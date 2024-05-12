package com.ss.android.ugc.aweme.poi.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class PoiDetailPagePreloadGeckoExperiment {
    public static final PoiDetailPagePreloadGeckoExperiment LIZ = new PoiDetailPagePreloadGeckoExperiment();
    public static final PoiDetailPreLoadGeckoConfig LIZIZ = new PoiDetailPreLoadGeckoConfig(0, 1, null);

    /* loaded from: classes10.dex */
    public static final class PoiDetailPreLoadGeckoConfig {

        @InterfaceC65349Pkn("strategy")
        public final int strategy;

        public PoiDetailPreLoadGeckoConfig() {
            this(0, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiDetailPreLoadGeckoConfig) && this.strategy == ((PoiDetailPreLoadGeckoConfig) obj).strategy;
        }

        public final int hashCode() {
            return this.strategy;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiDetailPreLoadGeckoConfig(strategy=");
            return b0.LIZJ(LIZ, this.strategy, ')', LIZ);
        }

        public PoiDetailPreLoadGeckoConfig(int i) {
            this.strategy = i;
        }

        public /* synthetic */ PoiDetailPreLoadGeckoConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }
}
