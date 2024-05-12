package com.ss.android.ugc.aweme.compliance.sandbox.webview.pumbaa;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PumbaaInjectHostPrefixSettings {
    public static final PumbaaInjectHostPrefixModel LIZ = new PumbaaInjectHostPrefixModel(false, null, 3, 0 == true ? 1 : 0);

    /* loaded from: classes7.dex */
    public static final class PumbaaInjectUrl {

        @InterfaceC65349Pkn("excludes")
        public final List<String> excludes;

        @InterfaceC65349Pkn("includes")
        public final List<String> includes;

        public PumbaaInjectUrl() {
            this(null, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PumbaaInjectUrl)) {
                return false;
            }
            PumbaaInjectUrl pumbaaInjectUrl = (PumbaaInjectUrl) obj;
            return o.LJ(this.excludes, pumbaaInjectUrl.excludes) && o.LJ(this.includes, pumbaaInjectUrl.includes);
        }

        public final int hashCode() {
            return this.includes.hashCode() + (this.excludes.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PumbaaInjectUrl(excludes=");
            LIZ.append(this.excludes);
            LIZ.append(", includes=");
            return C1NE.LIZIZ(LIZ, this.includes, ')', LIZ);
        }

        public PumbaaInjectUrl(List<String> excludes, List<String> includes) {
            o.LJIIIZ(excludes, "excludes");
            o.LJIIIZ(includes, "includes");
            this.excludes = excludes;
            this.includes = includes;
        }

        public PumbaaInjectUrl(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
        }
    }

    /* loaded from: classes7.dex */
    public static final class PumbaaInjectHostPrefixModel {

        @InterfaceC65349Pkn("enabled")
        public final boolean enabled;

        @InterfaceC65349Pkn("url")
        public final PumbaaInjectUrl injectUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public PumbaaInjectHostPrefixModel() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PumbaaInjectHostPrefixModel)) {
                return false;
            }
            PumbaaInjectHostPrefixModel pumbaaInjectHostPrefixModel = (PumbaaInjectHostPrefixModel) obj;
            return this.enabled == pumbaaInjectHostPrefixModel.enabled && o.LJ(this.injectUrl, pumbaaInjectHostPrefixModel.injectUrl);
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
            return this.injectUrl.hashCode() + (r0 * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PumbaaInjectHostPrefixModel(enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", injectUrl=");
            LIZ.append(this.injectUrl);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public PumbaaInjectHostPrefixModel(boolean z, PumbaaInjectUrl injectUrl) {
            o.LJIIIZ(injectUrl, "injectUrl");
            this.enabled = z;
            this.injectUrl = injectUrl;
        }

        public /* synthetic */ PumbaaInjectHostPrefixModel(boolean z, PumbaaInjectUrl pumbaaInjectUrl, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? new PumbaaInjectUrl(null, null, 3, null) : pumbaaInjectUrl);
        }
    }
}
