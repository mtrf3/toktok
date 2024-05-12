package com.ss.android.ugc.aweme.compliance.common.hydrogen;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HydrogenSettings {
    public static final HydrogenSettingModel LIZ = new HydrogenSettingModel(false, new HashMap());

    /* loaded from: classes5.dex */
    public static final class HydrogenSettingModel {

        @InterfaceC65349Pkn("action_map")
        public final HashMap<String, String> actionMap;

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HydrogenSettingModel)) {
                return false;
            }
            HydrogenSettingModel hydrogenSettingModel = (HydrogenSettingModel) obj;
            return this.enable == hydrogenSettingModel.enable && o.LJ(this.actionMap, hydrogenSettingModel.actionMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.actionMap.hashCode() + (r0 * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HydrogenSettingModel(enable=");
            LIZ.append(this.enable);
            LIZ.append(", actionMap=");
            LIZ.append(this.actionMap);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public HydrogenSettingModel(boolean z, HashMap<String, String> actionMap) {
            o.LJIIIZ(actionMap, "actionMap");
            this.enable = z;
            this.actionMap = actionMap;
        }
    }
}
