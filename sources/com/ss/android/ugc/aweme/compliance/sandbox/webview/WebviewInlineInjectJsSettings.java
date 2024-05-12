package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.AnonymousClass391;
import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WebviewInlineInjectJsSettings {
    public static final WebviewInlineInjectJsModel LIZ = new WebviewInlineInjectJsModel(false, false, null, null, 15, null);

    /* loaded from: classes7.dex */
    public static final class WebviewInlineInjectJsModel {

        @InterfaceC65349Pkn("allowList")
        public final List<String> allowList;

        @InterfaceC65349Pkn("denyList")
        public final List<String> denyList;

        @InterfaceC65349Pkn("enabled")
        public final boolean enabled;

        @InterfaceC65349Pkn("legacyEnable")
        public final boolean legacyEnable;

        public WebviewInlineInjectJsModel() {
            this(false, false, null, null, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebviewInlineInjectJsModel)) {
                return false;
            }
            WebviewInlineInjectJsModel webviewInlineInjectJsModel = (WebviewInlineInjectJsModel) obj;
            return this.enabled == webviewInlineInjectJsModel.enabled && this.legacyEnable == webviewInlineInjectJsModel.legacyEnable && o.LJ(this.allowList, webviewInlineInjectJsModel.allowList) && o.LJ(this.denyList, webviewInlineInjectJsModel.denyList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public final int hashCode() {
            boolean z = this.enabled;
            int i = 1;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i2 = r0 * 31;
            if (!this.legacyEnable) {
                i = 0;
            }
            return this.denyList.hashCode() + AnonymousClass391.LIZIZ(this.allowList, (i2 + i) * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WebviewInlineInjectJsModel(enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", legacyEnable=");
            LIZ.append(this.legacyEnable);
            LIZ.append(", allowList=");
            LIZ.append(this.allowList);
            LIZ.append(", denyList=");
            return C1NE.LIZIZ(LIZ, this.denyList, ')', LIZ);
        }

        public WebviewInlineInjectJsModel(boolean z, boolean z2, List<String> allowList, List<String> denyList) {
            o.LJIIIZ(allowList, "allowList");
            o.LJIIIZ(denyList, "denyList");
            this.enabled = z;
            this.legacyEnable = z2;
            this.allowList = allowList;
            this.denyList = denyList;
        }

        public WebviewInlineInjectJsModel(boolean z, boolean z2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? C61878OQg.INSTANCE : list2);
        }
    }
}
