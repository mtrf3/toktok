package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class RegionRequest {

    @InterfaceC65349Pkn("district_keyword")
    public final String districtWord;

    @InterfaceC65349Pkn("geoname_ids")
    public final String[] geoNameId;

    @InterfaceC65349Pkn("get_districts_type")
    public final Integer getDistrictType;

    @InterfaceC65349Pkn("order_skus")
    public final List<OrderSKUDTO> orderSKUs;

    @InterfaceC65349Pkn("without_next_level")
    public final Boolean withoutNextLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public RegionRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public RegionRequest(String[] strArr, List<OrderSKUDTO> list, Integer num, String str, Boolean bool) {
        this.geoNameId = strArr;
        this.orderSKUs = list;
        this.getDistrictType = num;
        this.districtWord = str;
        this.withoutNextLevel = bool;
    }

    public /* synthetic */ RegionRequest(String[] strArr, List list, Integer num, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : strArr, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) == 0 ? bool : null);
    }
}
