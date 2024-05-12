package com.ss.android.ugc.aweme.poi_api.experiment;

import X.C221108m2;
import X.C62822Ol8;
import X.EBI;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;

/* loaded from: classes7.dex */
public final class PoiReTagUIExperiment {
    public static final PoiReTagConfig LIZ = new PoiReTagConfig(2);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(EBI.LJLIL);

    /* loaded from: classes7.dex */
    public static final class PoiReTagConfig {

        @InterfaceC65349Pkn("poi_retag_close_max_times")
        public final int closeMaxTimes;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiReTagConfig) && this.closeMaxTimes == ((PoiReTagConfig) obj).closeMaxTimes;
        }

        public final int hashCode() {
            return this.closeMaxTimes;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReTagConfig(closeMaxTimes=");
            return b0.LIZJ(LIZ, this.closeMaxTimes, ')', LIZ);
        }

        public PoiReTagConfig(int i) {
            this.closeMaxTimes = i;
        }
    }
}
