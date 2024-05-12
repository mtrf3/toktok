package com.ss.android.ugc.aweme.compliance.sandbox.api.webview;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WebResponseContentTypeModifySettings {
    public static final WebResponseContentTypeModifyModel LIZ = new WebResponseContentTypeModifyModel(false, null, 3, null);

    /* loaded from: classes7.dex */
    public static final class WebResponseContentTypeModifyModel {

        @InterfaceC65349Pkn("allowList")
        public final List<String> allowList;

        @InterfaceC65349Pkn("enabled")
        public final boolean enabled;

        public WebResponseContentTypeModifyModel() {
            this(false, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebResponseContentTypeModifyModel)) {
                return false;
            }
            WebResponseContentTypeModifyModel webResponseContentTypeModifyModel = (WebResponseContentTypeModifyModel) obj;
            return this.enabled == webResponseContentTypeModifyModel.enabled && o.LJ(this.allowList, webResponseContentTypeModifyModel.allowList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public final int hashCode() {
            boolean z = this.enabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.allowList.hashCode() + (r0 * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WebResponseContentTypeModifyModel(enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", allowList=");
            return C1NE.LIZIZ(LIZ, this.allowList, ')', LIZ);
        }

        public WebResponseContentTypeModifyModel(boolean z, List<String> allowList) {
            o.LJIIIZ(allowList, "allowList");
            this.enabled = z;
            this.allowList = allowList;
        }

        public WebResponseContentTypeModifyModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
        }
    }
}
