package com.ss.android.ugc.aweme.poi.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class PoiReviewBannerPreloadGeckoExperiment {
    public static final PoiReviewBannerPreloadGeckoExperiment LIZ = new PoiReviewBannerPreloadGeckoExperiment();
    public static final PoiReviewBannerPreLoadGeckoConfig LIZIZ = new PoiReviewBannerPreLoadGeckoConfig(0, 1, null);

    /* loaded from: classes10.dex */
    public static final class PoiReviewBannerPreLoadGeckoConfig {

        @InterfaceC65349Pkn("strategy")
        public final int strategy;

        public PoiReviewBannerPreLoadGeckoConfig() {
            this(0, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiReviewBannerPreLoadGeckoConfig) && this.strategy == ((PoiReviewBannerPreLoadGeckoConfig) obj).strategy;
        }

        public final int hashCode() {
            return this.strategy;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReviewBannerPreLoadGeckoConfig(strategy=");
            return b0.LIZJ(LIZ, this.strategy, ')', LIZ);
        }

        public PoiReviewBannerPreLoadGeckoConfig(int i) {
            this.strategy = i;
        }

        public /* synthetic */ PoiReviewBannerPreLoadGeckoConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }
}
