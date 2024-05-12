package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcImageMonitorSwitchKeySettings {
    public static final EcImageMonitorSwitchKeyModel LIZ = new EcImageMonitorSwitchKeyModel(Boolean.FALSE);

    /* loaded from: classes7.dex */
    public static final class EcImageMonitorSwitchKeyModel {

        @InterfaceC65349Pkn("isOpen")
        public final Boolean isOpen;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcImageMonitorSwitchKeyModel) && o.LJ(this.isOpen, ((EcImageMonitorSwitchKeyModel) obj).isOpen);
        }

        public final int hashCode() {
            Boolean bool = this.isOpen;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcImageMonitorSwitchKeyModel(isOpen=");
            return C78920UyC.LIZIZ(LIZ, this.isOpen, ')', LIZ);
        }

        public EcImageMonitorSwitchKeyModel(Boolean bool) {
            this.isOpen = bool;
        }
    }
}
