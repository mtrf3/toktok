package com.ss.android.ugc.aweme.settings;

import X.AnonymousClass391;
import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FetchBridgeSettings {
    public static final FetchBridgeModel LIZ = new FetchBridgeModel(new ArrayList(), false, new ArrayList(), false);

    /* loaded from: classes7.dex */
    public static final class FetchBridgeModel {

        @InterfaceC65349Pkn("blockList")
        public final List<String> blockList;

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("enableChangeUa")
        public final boolean enableChangeUa;

        @InterfaceC65349Pkn("whiteList")
        public final List<String> whiteList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FetchBridgeModel)) {
                return false;
            }
            FetchBridgeModel fetchBridgeModel = (FetchBridgeModel) obj;
            return o.LJ(this.whiteList, fetchBridgeModel.whiteList) && this.enable == fetchBridgeModel.enable && o.LJ(this.blockList, fetchBridgeModel.blockList) && this.enableChangeUa == fetchBridgeModel.enableChangeUa;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = this.whiteList.hashCode() * 31;
            boolean z = this.enable;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int LIZIZ = AnonymousClass391.LIZIZ(this.blockList, (hashCode + i2) * 31, 31);
            if (!this.enableChangeUa) {
                i = 0;
            }
            return LIZIZ + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FetchBridgeModel(whiteList=");
            LIZ.append(this.whiteList);
            LIZ.append(", enable=");
            LIZ.append(this.enable);
            LIZ.append(", blockList=");
            LIZ.append(this.blockList);
            LIZ.append(", enableChangeUa=");
            return C48339Iy7.LIZJ(LIZ, this.enableChangeUa, ')', LIZ);
        }

        public FetchBridgeModel(List<String> whiteList, boolean z, List<String> blockList, boolean z2) {
            o.LJIIIZ(whiteList, "whiteList");
            o.LJIIIZ(blockList, "blockList");
            this.whiteList = whiteList;
            this.enable = z;
            this.blockList = blockList;
            this.enableChangeUa = z2;
        }
    }

    public static final FetchBridgeModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        FetchBridgeModel fetchBridgeModel = LIZ;
        FetchBridgeModel fetchBridgeModel2 = (FetchBridgeModel) LIZLLL.LJIIIIZZ("fetchBridge", FetchBridgeModel.class, fetchBridgeModel);
        if (fetchBridgeModel2 == null) {
            return fetchBridgeModel;
        }
        return fetchBridgeModel2;
    }
}
