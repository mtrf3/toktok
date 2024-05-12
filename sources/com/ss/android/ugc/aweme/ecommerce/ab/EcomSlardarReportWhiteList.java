package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C1NE;
import X.C221108m2;
import X.C48659J7v;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcomSlardarReportWhiteList {
    public static final EcomSlardarReportWhiteList LIZ = new EcomSlardarReportWhiteList();
    public static final EcomSlardarReportWhiteItem[] LIZIZ = new EcomSlardarReportWhiteItem[0];
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C48659J7v.LJLIL);

    /* loaded from: classes9.dex */
    public static final class EcomSlardarReportWhiteItem {

        @InterfaceC65349Pkn("category")
        public final List<String> category;

        @InterfaceC65349Pkn("metric")
        public final List<String> metric;

        @InterfaceC65349Pkn("name")
        public final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EcomSlardarReportWhiteItem copy$default(EcomSlardarReportWhiteItem ecomSlardarReportWhiteItem, String str, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecomSlardarReportWhiteItem.name;
            }
            if ((i & 2) != 0) {
                list = ecomSlardarReportWhiteItem.metric;
            }
            if ((i & 4) != 0) {
                list2 = ecomSlardarReportWhiteItem.category;
            }
            return ecomSlardarReportWhiteItem.copy(str, list, list2);
        }

        public final EcomSlardarReportWhiteItem copy(String str, List<String> list, List<String> list2) {
            return new EcomSlardarReportWhiteItem(str, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomSlardarReportWhiteItem)) {
                return false;
            }
            EcomSlardarReportWhiteItem ecomSlardarReportWhiteItem = (EcomSlardarReportWhiteItem) obj;
            return o.LJ(this.name, ecomSlardarReportWhiteItem.name) && o.LJ(this.metric, ecomSlardarReportWhiteItem.metric) && o.LJ(this.category, ecomSlardarReportWhiteItem.category);
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.metric;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.category;
            return hashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomSlardarReportWhiteItem(name=");
            LIZ.append(this.name);
            LIZ.append(", metric=");
            LIZ.append(this.metric);
            LIZ.append(", category=");
            return C1NE.LIZIZ(LIZ, this.category, ')', LIZ);
        }

        public final List<String> getCategory() {
            return this.category;
        }

        public final List<String> getMetric() {
            return this.metric;
        }

        public final String getName() {
            return this.name;
        }

        public EcomSlardarReportWhiteItem(String str, List<String> list, List<String> list2) {
            this.name = str;
            this.metric = list;
            this.category = list2;
        }
    }
}
