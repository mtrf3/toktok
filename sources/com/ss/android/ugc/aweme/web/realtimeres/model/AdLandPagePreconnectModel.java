package com.ss.android.ugc.aweme.web.realtimeres.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AdLandPagePreconnectModel {

    /* loaded from: classes7.dex */
    public static final class PreconnectModel {

        @InterfaceC65349Pkn("important")
        public final String important;

        @InterfaceC65349Pkn("protocol")
        public final String protocol;

        @InterfaceC65349Pkn("resourceResource")
        public final String resourceResource;

        @InterfaceC65349Pkn("url")
        public final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public PreconnectModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreconnectModel)) {
                return false;
            }
            PreconnectModel preconnectModel = (PreconnectModel) obj;
            return o.LJ(this.url, preconnectModel.url) && o.LJ(this.important, preconnectModel.important) && o.LJ(this.protocol, preconnectModel.protocol) && o.LJ(this.resourceResource, preconnectModel.resourceResource);
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.important;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.protocol;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.resourceResource;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PreconnectModel(url=");
            LIZ.append(this.url);
            LIZ.append(", important=");
            LIZ.append(this.important);
            LIZ.append(", protocol=");
            LIZ.append(this.protocol);
            LIZ.append(", resourceResource=");
            return q.LIZIZ(LIZ, this.resourceResource, ')', LIZ);
        }

        public PreconnectModel(String str, String str2, String str3, String str4) {
            this.url = str;
            this.important = str2;
            this.protocol = str3;
            this.resourceResource = str4;
        }

        public /* synthetic */ PreconnectModel(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }
}
