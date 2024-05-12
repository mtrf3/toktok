package com.bytedance.ies.security.settings;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LynxSecSettings {
    public static final LynxSecConfig LIZ;

    /* loaded from: classes7.dex */
    public static final class LynxSecConfig {

        @InterfaceC65349Pkn("enabled")
        public final boolean enable;

        @InterfaceC65349Pkn("force_https")
        public final boolean forceHttps;

        @InterfaceC65349Pkn("domains_intercept")
        public final boolean intercept;

        @InterfaceC65349Pkn("domains")
        public final List<String> whiteList;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LynxSecConfig() {
            /*
                r7 = this;
                r1 = 0
                r4 = 0
                r5 = 15
                r0 = r7
                r2 = r1
                r3 = r1
                r6 = r4
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.security.settings.LynxSecSettings.LynxSecConfig.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LynxSecConfig)) {
                return false;
            }
            LynxSecConfig lynxSecConfig = (LynxSecConfig) obj;
            return this.enable == lynxSecConfig.enable && this.forceHttps == lynxSecConfig.forceHttps && this.intercept == lynxSecConfig.intercept && o.LJ(this.whiteList, lynxSecConfig.whiteList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v9 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.forceHttps;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            return this.whiteList.hashCode() + ((((i + i2) * 31) + (this.intercept ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LynxSecConfig(enable=");
            LIZ.append(this.enable);
            LIZ.append(", forceHttps=");
            LIZ.append(this.forceHttps);
            LIZ.append(", intercept=");
            LIZ.append(this.intercept);
            LIZ.append(", whiteList=");
            return C1NE.LIZIZ(LIZ, this.whiteList, ')', LIZ);
        }

        public LynxSecConfig(boolean z, boolean z2, boolean z3, List<String> whiteList) {
            o.LJIIIZ(whiteList, "whiteList");
            this.enable = z;
            this.forceHttps = z2;
            this.intercept = z3;
            this.whiteList = whiteList;
        }

        public /* synthetic */ LynxSecConfig(boolean z, boolean z2, boolean z3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? new ArrayList() : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        LIZ = new LynxSecConfig(z, z, z, null, 15, 0 == true ? 1 : 0);
    }

    public static LynxSecConfig LIZ() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            LynxSecConfig lynxSecConfig = LIZ;
            LynxSecConfig lynxSecConfig2 = (LynxSecConfig) LIZLLL.LJIIIIZZ("lynx_sec_loadurl", LynxSecConfig.class, lynxSecConfig);
            if (lynxSecConfig2 != null) {
                return lynxSecConfig2;
            }
            return lynxSecConfig;
        } catch (Throwable unused) {
            return LIZ;
        }
    }
}
