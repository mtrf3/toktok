package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomTraceInterceptor {
    public static final EcomTraceInterceptor LIZ = new EcomTraceInterceptor();
    public static final EcomNetworkTraceInterceptorSwitch LIZIZ = new EcomNetworkTraceInterceptorSwitch(null, 1, 0 == true ? 1 : 0);

    /* loaded from: classes2.dex */
    public static final class EcomNetworkTraceInterceptorSwitch {

        @InterfaceC65349Pkn("paths")
        public final List<String> paths;

        /* JADX WARN: Multi-variable type inference failed */
        public EcomNetworkTraceInterceptorSwitch() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EcomNetworkTraceInterceptorSwitch copy$default(EcomNetworkTraceInterceptorSwitch ecomNetworkTraceInterceptorSwitch, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ecomNetworkTraceInterceptorSwitch.paths;
            }
            return ecomNetworkTraceInterceptorSwitch.copy(list);
        }

        public final EcomNetworkTraceInterceptorSwitch copy(List<String> list) {
            return new EcomNetworkTraceInterceptorSwitch(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcomNetworkTraceInterceptorSwitch) && o.LJ(this.paths, ((EcomNetworkTraceInterceptorSwitch) obj).paths);
        }

        public int hashCode() {
            List<String> list = this.paths;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomNetworkTraceInterceptorSwitch(paths=");
            return C1NE.LIZIZ(LIZ, this.paths, ')', LIZ);
        }

        public final List<String> getPaths() {
            return this.paths;
        }

        public EcomNetworkTraceInterceptorSwitch(List<String> list) {
            this.paths = list;
        }

        public /* synthetic */ EcomNetworkTraceInterceptorSwitch(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }
}
