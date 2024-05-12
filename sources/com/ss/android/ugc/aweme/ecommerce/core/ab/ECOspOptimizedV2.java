package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C78920UyC;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ECOspOptimizedV2 {
    public static final EComOSPEnterConfig LIZ = new EComOSPEnterConfig(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);

    /* loaded from: classes5.dex */
    public static final class EComOSPEnterConfig {

        @InterfaceC65349Pkn("ecom_osp_full_chunk")
        public final Boolean enableChunk;

        @InterfaceC65349Pkn("ecom_osp_enter_unify")
        public final Boolean enterUnify;

        @InterfaceC65349Pkn("ecom_optimize_coroutine")
        public final Boolean optimizeCoroutine;

        /* JADX WARN: Multi-variable type inference failed */
        public EComOSPEnterConfig() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EComOSPEnterConfig)) {
                return false;
            }
            EComOSPEnterConfig eComOSPEnterConfig = (EComOSPEnterConfig) obj;
            return o.LJ(this.optimizeCoroutine, eComOSPEnterConfig.optimizeCoroutine) && o.LJ(this.enterUnify, eComOSPEnterConfig.enterUnify) && o.LJ(this.enableChunk, eComOSPEnterConfig.enableChunk);
        }

        public final int hashCode() {
            Boolean bool = this.optimizeCoroutine;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.enterUnify;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.enableChunk;
            return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EComOSPEnterConfig(optimizeCoroutine=");
            LIZ.append(this.optimizeCoroutine);
            LIZ.append(", enterUnify=");
            LIZ.append(this.enterUnify);
            LIZ.append(", enableChunk=");
            return C78920UyC.LIZIZ(LIZ, this.enableChunk, ')', LIZ);
        }

        public EComOSPEnterConfig(Boolean bool, Boolean bool2, Boolean bool3) {
            this.optimizeCoroutine = bool;
            this.enterUnify = bool2;
            this.enableChunk = bool3;
        }

        public /* synthetic */ EComOSPEnterConfig(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? Boolean.FALSE : bool3);
        }
    }

    public static final EComOSPEnterConfig LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        EComOSPEnterConfig eComOSPEnterConfig = LIZ;
        LJIIIZ.getClass();
        EComOSPEnterConfig eComOSPEnterConfig2 = (EComOSPEnterConfig) FFL.LJIJ(true, "ecom_osp_second_on_v2", 31744, EComOSPEnterConfig.class, eComOSPEnterConfig);
        if (eComOSPEnterConfig2 == null) {
            return eComOSPEnterConfig;
        }
        return eComOSPEnterConfig2;
    }
}
