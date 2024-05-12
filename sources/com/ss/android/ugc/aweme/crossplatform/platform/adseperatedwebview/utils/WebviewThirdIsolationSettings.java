package com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils;

import X.AnonymousClass391;
import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WebviewThirdIsolationSettings {
    public static final WebviewThirdIsolationModel LIZ;

    /* loaded from: classes7.dex */
    public static final class WebviewThirdIsolationModel {

        @InterfaceC65349Pkn("biz_whitelist")
        public final BizWhitelist bizWhitelist;

        @InterfaceC65349Pkn("creativeID_blacklist")
        public final List<String> cids;

        @InterfaceC65349Pkn("enabled")
        public final boolean enabled;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebviewThirdIsolationModel)) {
                return false;
            }
            WebviewThirdIsolationModel webviewThirdIsolationModel = (WebviewThirdIsolationModel) obj;
            return this.enabled == webviewThirdIsolationModel.enabled && o.LJ(this.cids, webviewThirdIsolationModel.cids) && o.LJ(this.bizWhitelist, webviewThirdIsolationModel.bizWhitelist);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WebviewThirdIsolationModel(enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", cids=");
            LIZ.append(this.cids);
            LIZ.append(", bizWhitelist=");
            LIZ.append(this.bizWhitelist);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public final int hashCode() {
            boolean z = this.enabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.bizWhitelist.hashCode() + AnonymousClass391.LIZIZ(this.cids, r0 * 31, 31);
        }

        public WebviewThirdIsolationModel(boolean z, List<String> cids, BizWhitelist bizWhitelist) {
            o.LJIIIZ(cids, "cids");
            o.LJIIIZ(bizWhitelist, "bizWhitelist");
            this.enabled = z;
            this.cids = cids;
            this.bizWhitelist = bizWhitelist;
        }
    }

    /* loaded from: classes7.dex */
    public static final class BizWhitelist {

        @InterfaceC65349Pkn("kind")
        public final List<String> kind;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BizWhitelist) && o.LJ(this.kind, ((BizWhitelist) obj).kind);
        }

        public final int hashCode() {
            return this.kind.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BizWhitelist(kind=");
            return C1NE.LIZIZ(LIZ, this.kind, ')', LIZ);
        }

        public BizWhitelist(List<String> kind) {
            o.LJIIIZ(kind, "kind");
            this.kind = kind;
        }
    }

    static {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        LIZ = new WebviewThirdIsolationModel(false, c61878OQg, new BizWhitelist(c61878OQg));
    }
}
