package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EcomRegionSelectSearchBarConfig {
    public static final EcomRegionSelectSearchBarConfigModel LIZ = new EcomRegionSelectSearchBarConfigModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);

    /* loaded from: classes5.dex */
    public static final class EcomRegionSelectSearchBarConfigModel {

        @InterfaceC65349Pkn("enable_search_bar")
        public final Boolean enableSearchBar;

        @InterfaceC65349Pkn("get_district_type_for_list")
        public final Integer getDistrictTypeForList;

        @InterfaceC65349Pkn("get_district_type_for_search")
        public final Integer getDistrictTypeForSearch;

        /* JADX WARN: Multi-variable type inference failed */
        public EcomRegionSelectSearchBarConfigModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcomRegionSelectSearchBarConfigModel copy$default(EcomRegionSelectSearchBarConfigModel ecomRegionSelectSearchBarConfigModel, Boolean bool, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = ecomRegionSelectSearchBarConfigModel.enableSearchBar;
            }
            if ((i & 2) != 0) {
                num = ecomRegionSelectSearchBarConfigModel.getDistrictTypeForSearch;
            }
            if ((i & 4) != 0) {
                num2 = ecomRegionSelectSearchBarConfigModel.getDistrictTypeForList;
            }
            return ecomRegionSelectSearchBarConfigModel.copy(bool, num, num2);
        }

        public final EcomRegionSelectSearchBarConfigModel copy(Boolean bool, Integer num, Integer num2) {
            return new EcomRegionSelectSearchBarConfigModel(bool, num, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomRegionSelectSearchBarConfigModel)) {
                return false;
            }
            EcomRegionSelectSearchBarConfigModel ecomRegionSelectSearchBarConfigModel = (EcomRegionSelectSearchBarConfigModel) obj;
            return o.LJ(this.enableSearchBar, ecomRegionSelectSearchBarConfigModel.enableSearchBar) && o.LJ(this.getDistrictTypeForSearch, ecomRegionSelectSearchBarConfigModel.getDistrictTypeForSearch) && o.LJ(this.getDistrictTypeForList, ecomRegionSelectSearchBarConfigModel.getDistrictTypeForList);
        }

        public int hashCode() {
            Boolean bool = this.enableSearchBar;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Integer num = this.getDistrictTypeForSearch;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.getDistrictTypeForList;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomRegionSelectSearchBarConfigModel(enableSearchBar=");
            LIZ.append(this.enableSearchBar);
            LIZ.append(", getDistrictTypeForSearch=");
            LIZ.append(this.getDistrictTypeForSearch);
            LIZ.append(", getDistrictTypeForList=");
            return s0.LIZJ(LIZ, this.getDistrictTypeForList, ')', LIZ);
        }

        public final Boolean getEnableSearchBar() {
            return this.enableSearchBar;
        }

        public final Integer getGetDistrictTypeForList() {
            return this.getDistrictTypeForList;
        }

        public final Integer getGetDistrictTypeForSearch() {
            return this.getDistrictTypeForSearch;
        }

        public EcomRegionSelectSearchBarConfigModel(Boolean bool, Integer num, Integer num2) {
            this.enableSearchBar = bool;
            this.getDistrictTypeForSearch = num;
            this.getDistrictTypeForList = num2;
        }

        public /* synthetic */ EcomRegionSelectSearchBarConfigModel(Boolean bool, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 2 : num, (i & 4) != 0 ? 0 : num2);
        }
    }

    public static final EcomRegionSelectSearchBarConfigModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcomRegionSelectSearchBarConfigModel ecomRegionSelectSearchBarConfigModel = LIZ;
        EcomRegionSelectSearchBarConfigModel ecomRegionSelectSearchBarConfigModel2 = (EcomRegionSelectSearchBarConfigModel) LIZLLL.LJIIIIZZ("ecom_region_select_search_bar_config", EcomRegionSelectSearchBarConfigModel.class, ecomRegionSelectSearchBarConfigModel);
        if (ecomRegionSelectSearchBarConfigModel2 == null) {
            return ecomRegionSelectSearchBarConfigModel;
        }
        return ecomRegionSelectSearchBarConfigModel2;
    }
}
