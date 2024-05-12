package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.AnonymousClass391;
import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SecLinkTokenConfigSettings {
    public static final SecLinkTokenConfig LIZ = new SecLinkTokenConfig(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);

    /* loaded from: classes2.dex */
    public static final class SecLinkTokenConfig {

        @InterfaceC65349Pkn("scenes")
        public final List<String> allowScenes;

        @InterfaceC65349Pkn("tokens")
        public final List<String> allowTokens;

        @InterfaceC65349Pkn("enabled")
        public final boolean enable;

        /* JADX WARN: Multi-variable type inference failed */
        public SecLinkTokenConfig() {
            this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecLinkTokenConfig)) {
                return false;
            }
            SecLinkTokenConfig secLinkTokenConfig = (SecLinkTokenConfig) obj;
            return this.enable == secLinkTokenConfig.enable && o.LJ(this.allowScenes, secLinkTokenConfig.allowScenes) && o.LJ(this.allowTokens, secLinkTokenConfig.allowTokens);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.allowTokens.hashCode() + AnonymousClass391.LIZIZ(this.allowScenes, r0 * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SecLinkTokenConfig(enable=");
            LIZ.append(this.enable);
            LIZ.append(", allowScenes=");
            LIZ.append(this.allowScenes);
            LIZ.append(", allowTokens=");
            return C1NE.LIZIZ(LIZ, this.allowTokens, ')', LIZ);
        }

        public SecLinkTokenConfig(boolean z, List<String> allowScenes, List<String> allowTokens) {
            o.LJIIIZ(allowScenes, "allowScenes");
            o.LJIIIZ(allowTokens, "allowTokens");
            this.enable = z;
            this.allowScenes = allowScenes;
            this.allowTokens = allowTokens;
        }

        public /* synthetic */ SecLinkTokenConfig(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2);
        }
    }
}
