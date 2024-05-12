package com.ss.android.ugc.tiktok.security.jsguard;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class JsInjectionBlackListSettings {
    public static final JsInjectionBlackListConfig LIZ = new JsInjectionBlackListConfig(false, null, 3, 0 == true ? 1 : 0);

    /* loaded from: classes6.dex */
    public static final class JsInjectionBlackListConfig {

        @InterfaceC65349Pkn("black_list")
        public final List<String> blackList;

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        /* JADX WARN: Multi-variable type inference failed */
        public JsInjectionBlackListConfig() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JsInjectionBlackListConfig)) {
                return false;
            }
            JsInjectionBlackListConfig jsInjectionBlackListConfig = (JsInjectionBlackListConfig) obj;
            return this.enable == jsInjectionBlackListConfig.enable && o.LJ(this.blackList, jsInjectionBlackListConfig.blackList);
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
            return this.blackList.hashCode() + (r0 * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("JsInjectionBlackListConfig(enable=");
            LIZ.append(this.enable);
            LIZ.append(", blackList=");
            return C1NE.LIZIZ(LIZ, this.blackList, ')', LIZ);
        }

        public JsInjectionBlackListConfig(boolean z, List<String> blackList) {
            o.LJIIIZ(blackList, "blackList");
            this.enable = z;
            this.blackList = blackList;
        }

        public /* synthetic */ JsInjectionBlackListConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : list);
        }
    }
}
