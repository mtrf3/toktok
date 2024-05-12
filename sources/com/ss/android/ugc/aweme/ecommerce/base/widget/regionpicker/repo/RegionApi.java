package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.repo;

import X.AbstractC73672Svk;
import X.C27386Aow;
import X.E4T;
import X.InterfaceC27211Am7;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.LocateDistrictData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.LocateDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.RegionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;

/* loaded from: classes5.dex */
public interface RegionApi {
    public static final C27386Aow LIZ = C27386Aow.LIZ;

    @E4T("/api/v1/logistics/district/list?tlb_swimlane=address_api")
    AbstractC73672Svk<Response<DistrictData>> getDistricts(@InterfaceC27211Am7 RegionRequest regionRequest);

    @E4T("/api/v1/shop/district/locate")
    AbstractC73672Svk<Response<LocateDistrictData>> getLocateDistrict(@InterfaceC27211Am7 LocateDistrictRequest locateDistrictRequest);

    @E4T("/api/v1/logistics/district/search")
    AbstractC73672Svk<Response<SearchDistrictsData>> getSearchDistricts(@InterfaceC27211Am7 SearchDistrictRequest searchDistrictRequest);
}
