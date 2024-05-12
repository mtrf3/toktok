package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcomNetworkInterceptorSwitch {
    public static final EcomNetworkInterceptorSwitchModel LIZ;

    /* loaded from: classes7.dex */
    public static final class EcomNetworkInterceptorSwitchModel {

        @InterfaceC65349Pkn("hosts")
        public String hosts;

        @InterfaceC65349Pkn("image_host")
        public final String imageHost;

        @InterfaceC65349Pkn("paths")
        public String paths;

        /* renamed from: switch, reason: not valid java name */
        @InterfaceC65349Pkn("switch")
        public boolean f21switch;

        /* JADX WARN: Multi-variable type inference failed */
        public EcomNetworkInterceptorSwitchModel() {
            this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcomNetworkInterceptorSwitchModel copy$default(EcomNetworkInterceptorSwitchModel ecomNetworkInterceptorSwitchModel, boolean z, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = ecomNetworkInterceptorSwitchModel.f21switch;
            }
            if ((i & 2) != 0) {
                str = ecomNetworkInterceptorSwitchModel.hosts;
            }
            if ((i & 4) != 0) {
                str2 = ecomNetworkInterceptorSwitchModel.paths;
            }
            if ((i & 8) != 0) {
                str3 = ecomNetworkInterceptorSwitchModel.imageHost;
            }
            return ecomNetworkInterceptorSwitchModel.copy(z, str, str2, str3);
        }

        public final EcomNetworkInterceptorSwitchModel copy(boolean z, String hosts, String paths, String imageHost) {
            o.LJIIIZ(hosts, "hosts");
            o.LJIIIZ(paths, "paths");
            o.LJIIIZ(imageHost, "imageHost");
            return new EcomNetworkInterceptorSwitchModel(z, hosts, paths, imageHost);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomNetworkInterceptorSwitchModel)) {
                return false;
            }
            EcomNetworkInterceptorSwitchModel ecomNetworkInterceptorSwitchModel = (EcomNetworkInterceptorSwitchModel) obj;
            return this.f21switch == ecomNetworkInterceptorSwitchModel.f21switch && o.LJ(this.hosts, ecomNetworkInterceptorSwitchModel.hosts) && o.LJ(this.paths, ecomNetworkInterceptorSwitchModel.paths) && o.LJ(this.imageHost, ecomNetworkInterceptorSwitchModel.imageHost);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public int hashCode() {
            boolean z = this.f21switch;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.imageHost.hashCode() + C79062V1e.LJ(this.paths, C79062V1e.LJ(this.hosts, r0 * 31, 31), 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomNetworkInterceptorSwitchModel(switch=");
            LIZ.append(this.f21switch);
            LIZ.append(", hosts=");
            LIZ.append(this.hosts);
            LIZ.append(", paths=");
            LIZ.append(this.paths);
            LIZ.append(", imageHost=");
            return q.LIZIZ(LIZ, this.imageHost, ')', LIZ);
        }

        public final String getHosts() {
            return this.hosts;
        }

        public final String getImageHost() {
            return this.imageHost;
        }

        public final String getPaths() {
            return this.paths;
        }

        public final boolean getSwitch() {
            return this.f21switch;
        }

        public final void setHosts(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.hosts = str;
        }

        public final void setPaths(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.paths = str;
        }

        public final void setSwitch(boolean z) {
            this.f21switch = z;
        }

        public EcomNetworkInterceptorSwitchModel(boolean z, String str, String str2, String str3) {
            HH1.LIZ(str, "hosts", str2, "paths", str3, "imageHost");
            this.f21switch = z;
            this.hosts = str;
            this.paths = str2;
            this.imageHost = str3;
        }

        public /* synthetic */ EcomNetworkInterceptorSwitchModel(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new EcomNetworkInterceptorSwitch();
        EcomNetworkInterceptorSwitchModel ecomNetworkInterceptorSwitchModel = new EcomNetworkInterceptorSwitchModel(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        EcomNetworkInterceptorSwitchModel ecomNetworkInterceptorSwitchModel2 = (EcomNetworkInterceptorSwitchModel) SettingsManager.LIZLLL().LJIIIIZZ("ecom_net_interceptor_switch", EcomNetworkInterceptorSwitchModel.class, ecomNetworkInterceptorSwitchModel);
        if (ecomNetworkInterceptorSwitchModel2 != null) {
            ecomNetworkInterceptorSwitchModel = ecomNetworkInterceptorSwitchModel2;
        }
        LIZ = ecomNetworkInterceptorSwitchModel;
    }
}
