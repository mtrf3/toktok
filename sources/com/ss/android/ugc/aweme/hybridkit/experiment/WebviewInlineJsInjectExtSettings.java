package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.AnonymousClass391;
import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WebviewInlineJsInjectExtSettings {
    public static final WebviewInlineJsInjectExtModel LIZ = new WebviewInlineJsInjectExtModel(false, null, null, 7, null);

    /* loaded from: classes7.dex */
    public static final class WebviewInlineJsInjectExtModel {

        @InterfaceC65349Pkn("denyList")
        public final List<String> denyList;

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("ttnetDenyList")
        public final List<String> ttnetDenylist;

        public WebviewInlineJsInjectExtModel() {
            this(false, null, null, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebviewInlineJsInjectExtModel)) {
                return false;
            }
            WebviewInlineJsInjectExtModel webviewInlineJsInjectExtModel = (WebviewInlineJsInjectExtModel) obj;
            return this.enable == webviewInlineJsInjectExtModel.enable && o.LJ(this.denyList, webviewInlineJsInjectExtModel.denyList) && o.LJ(this.ttnetDenylist, webviewInlineJsInjectExtModel.ttnetDenylist);
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
            return this.ttnetDenylist.hashCode() + AnonymousClass391.LIZIZ(this.denyList, r0 * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WebviewInlineJsInjectExtModel(enable=");
            LIZ.append(this.enable);
            LIZ.append(", denyList=");
            LIZ.append(this.denyList);
            LIZ.append(", ttnetDenylist=");
            return C1NE.LIZIZ(LIZ, this.ttnetDenylist, ')', LIZ);
        }

        public WebviewInlineJsInjectExtModel(boolean z, List<String> denyList, List<String> ttnetDenylist) {
            o.LJIIIZ(denyList, "denyList");
            o.LJIIIZ(ttnetDenylist, "ttnetDenylist");
            this.enable = z;
            this.denyList = denyList;
            this.ttnetDenylist = ttnetDenylist;
        }

        public WebviewInlineJsInjectExtModel(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? C61878OQg.INSTANCE : list2);
        }
    }
}
