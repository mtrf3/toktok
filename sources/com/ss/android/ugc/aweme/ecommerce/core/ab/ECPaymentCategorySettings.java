package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C113554cx;
import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ECPaymentCategorySettings {
    public static final EcPaymentCategoryModel LIZ = new EcPaymentCategoryModel(null, 1, 0 == true ? 1 : 0);

    /* loaded from: classes2.dex */
    public static final class EcPaymentCategoryModel {

        @InterfaceC65349Pkn("pay_category_mapping")
        public final Map<String, List<String>> payCategoryMapping;

        /* JADX WARN: Multi-variable type inference failed */
        public EcPaymentCategoryModel() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcPaymentCategoryModel) && o.LJ(this.payCategoryMapping, ((EcPaymentCategoryModel) obj).payCategoryMapping);
        }

        public final int hashCode() {
            Map<String, List<String>> map = this.payCategoryMapping;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcPaymentCategoryModel(payCategoryMapping=");
            return C15890jp.LIZ(LIZ, this.payCategoryMapping, ')', LIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EcPaymentCategoryModel(Map<String, ? extends List<String>> map) {
            this.payCategoryMapping = map;
        }

        public /* synthetic */ EcPaymentCategoryModel(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C113554cx.LJJJLIIL() : map);
        }
    }
}
