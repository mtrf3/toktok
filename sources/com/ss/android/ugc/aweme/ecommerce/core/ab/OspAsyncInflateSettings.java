package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C48339Iy7;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class OspAsyncInflateSettings {
    public static final EComOSPPreviewConfig LIZ = new EComOSPPreviewConfig(0, true);

    /* loaded from: classes5.dex */
    public static final class EComOSPPreviewConfig {

        @InterfaceC65349Pkn("full_screen_loading")
        public final boolean fullScreenLoading;

        @InterfaceC65349Pkn("preview_type")
        public final int preViewType;

        /* JADX WARN: Multi-variable type inference failed */
        public EComOSPPreviewConfig() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EComOSPPreviewConfig)) {
                return false;
            }
            EComOSPPreviewConfig eComOSPPreviewConfig = (EComOSPPreviewConfig) obj;
            return this.preViewType == eComOSPPreviewConfig.preViewType && this.fullScreenLoading == eComOSPPreviewConfig.fullScreenLoading;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i = this.preViewType * 31;
            boolean z = this.fullScreenLoading;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EComOSPPreviewConfig(preViewType=");
            LIZ.append(this.preViewType);
            LIZ.append(", fullScreenLoading=");
            return C48339Iy7.LIZJ(LIZ, this.fullScreenLoading, ')', LIZ);
        }

        public EComOSPPreviewConfig(int i, boolean z) {
            this.preViewType = i;
            this.fullScreenLoading = z;
        }

        public /* synthetic */ EComOSPPreviewConfig(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? true : z);
        }
    }

    public static final boolean LIZ() {
        if (LIZJ().preViewType > LIZ.preViewType) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ() {
        return LIZJ().fullScreenLoading;
    }

    public static final EComOSPPreviewConfig LIZJ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        EComOSPPreviewConfig eComOSPPreviewConfig = LIZ;
        LJIIIZ.getClass();
        EComOSPPreviewConfig eComOSPPreviewConfig2 = (EComOSPPreviewConfig) FFL.LJIJ(true, "ec_osp_async_inflate", 31744, EComOSPPreviewConfig.class, eComOSPPreviewConfig);
        if (eComOSPPreviewConfig2 == null) {
            return eComOSPPreviewConfig;
        }
        return eComOSPPreviewConfig2;
    }
}
