package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class HybridJsbBtmParserInterceptorSettings {
    public static final HybridJsbBtmParserInterceptorModel LIZ = new HybridJsbBtmParserInterceptorModel(false);

    /* loaded from: classes7.dex */
    public static final class HybridJsbBtmParserInterceptorModel {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        public HybridJsbBtmParserInterceptorModel() {
            this(false, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HybridJsbBtmParserInterceptorModel) && this.enable == ((HybridJsbBtmParserInterceptorModel) obj).enable;
        }

        public final int hashCode() {
            boolean z = this.enable;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HybridJsbBtmParserInterceptorModel(enable=");
            return C48339Iy7.LIZJ(LIZ, this.enable, ')', LIZ);
        }

        public HybridJsbBtmParserInterceptorModel(boolean z) {
            this.enable = z;
        }

        public /* synthetic */ HybridJsbBtmParserInterceptorModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
