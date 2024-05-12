package com.ss.android.ugc.aweme.experiment;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentAnchorInAppSetting {
    public static final PaidContentAnchorInAppSetting LIZ = new PaidContentAnchorInAppSetting();
    public static final IAPKeys LIZIZ = new IAPKeys(C61878OQg.INSTANCE);

    /* loaded from: classes5.dex */
    public static final class IAPKeys {

        @InterfaceC65349Pkn("iap_id_google")
        public final List<String> iAPIDs;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IAPKeys) && o.LJ(this.iAPIDs, ((IAPKeys) obj).iAPIDs);
        }

        public final int hashCode() {
            return this.iAPIDs.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IAPKeys(iAPIDs=");
            return C1NE.LIZIZ(LIZ, this.iAPIDs, ')', LIZ);
        }

        public IAPKeys(List<String> iAPIDs) {
            o.LJIIIZ(iAPIDs, "iAPIDs");
            this.iAPIDs = iAPIDs;
        }
    }
}
