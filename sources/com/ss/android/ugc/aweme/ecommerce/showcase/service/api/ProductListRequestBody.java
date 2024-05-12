package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C61878OQg;
import X.EnumC35468Dw0;
import X.InterfaceC65349Pkn;
import X.N7Y;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ProductListRequestBody {

    @InterfaceC65349Pkn("click_product_id_list")
    public final List<String> clickProductIdList;

    @InterfaceC65349Pkn("enter_from")
    public final String enterFrom;

    @InterfaceC65349Pkn("enter_method")
    public final String enterMethod;

    @InterfaceC65349Pkn("exposed_product_id_list")
    public final List<String> exposedProductIds;

    @InterfaceC65349Pkn("page_name")
    public final String pageName;

    @InterfaceC65349Pkn("page_size")
    public final int pageSize;

    @InterfaceC65349Pkn("page_source_info")
    public final String pageSourceInfo;

    @InterfaceC65349Pkn("expo_product_id_list")
    public final List<String> pdpExpoProductIds;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("recommend_context")
    public final String recommendContext;

    @InterfaceC65349Pkn("related_product_id_list")
    public final List<String> relatedProductIdList;

    @InterfaceC65349Pkn("scroll_param")
    public final String scrollParam;

    @InterfaceC65349Pkn("search_card_live_product_id_list")
    public final List<String> searchCardLiveProductIds;

    @InterfaceC65349Pkn("search_card_no_live_product_id_list")
    public final List<String> searchCardNoLiveProductIds;

    @InterfaceC65349Pkn("search_query")
    public final List<String> searchQuery;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("session_id")
    public final String sessionId;

    @InterfaceC65349Pkn("sort_field")
    public final int sortField;

    @InterfaceC65349Pkn("sort_order")
    public final int sortOrder;

    @InterfaceC65349Pkn("source_previous_page")
    public final String sourcePreviousPage;

    @InterfaceC65349Pkn("traffic_source_list")
    public final int[] trafficSourceList;

    @InterfaceC65349Pkn("ug_top_product_id")
    public final String ug_top_product_id;

    @InterfaceC65349Pkn("voucher_type_ids")
    public final List<String> voucherTypeIds;

    public ProductListRequestBody(String sellerId, String productId, int i, int i2, int i3, String sessionId, String enterFrom, String sourcePreviousPage, String enterMethod, String pageName, List<String> exposedProductIds, List<String> pdpExpoProductIds, List<String> clickProductIdList, List<String> relatedProductIdList, List<String> searchCardLiveProductIds, List<String> searchCardNoLiveProductIds, List<String> searchQuery, String scrollParam, int[] trafficSourceList, List<String> voucherTypeIds, String ug_top_product_id, String str, String str2) {
        o.LJIIIZ(sellerId, "sellerId");
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(sourcePreviousPage, "sourcePreviousPage");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(exposedProductIds, "exposedProductIds");
        o.LJIIIZ(pdpExpoProductIds, "pdpExpoProductIds");
        o.LJIIIZ(clickProductIdList, "clickProductIdList");
        o.LJIIIZ(relatedProductIdList, "relatedProductIdList");
        o.LJIIIZ(searchCardLiveProductIds, "searchCardLiveProductIds");
        o.LJIIIZ(searchCardNoLiveProductIds, "searchCardNoLiveProductIds");
        o.LJIIIZ(searchQuery, "searchQuery");
        o.LJIIIZ(scrollParam, "scrollParam");
        o.LJIIIZ(trafficSourceList, "trafficSourceList");
        o.LJIIIZ(voucherTypeIds, "voucherTypeIds");
        o.LJIIIZ(ug_top_product_id, "ug_top_product_id");
        this.sellerId = sellerId;
        this.productId = productId;
        this.sortField = i;
        this.sortOrder = i2;
        this.pageSize = i3;
        this.sessionId = sessionId;
        this.enterFrom = enterFrom;
        this.sourcePreviousPage = sourcePreviousPage;
        this.enterMethod = enterMethod;
        this.pageName = pageName;
        this.exposedProductIds = exposedProductIds;
        this.pdpExpoProductIds = pdpExpoProductIds;
        this.clickProductIdList = clickProductIdList;
        this.relatedProductIdList = relatedProductIdList;
        this.searchCardLiveProductIds = searchCardLiveProductIds;
        this.searchCardNoLiveProductIds = searchCardNoLiveProductIds;
        this.searchQuery = searchQuery;
        this.scrollParam = scrollParam;
        this.trafficSourceList = trafficSourceList;
        this.voucherTypeIds = voucherTypeIds;
        this.ug_top_product_id = ug_top_product_id;
        this.recommendContext = str;
        this.pageSourceInfo = str2;
    }

    public ProductListRequestBody(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, List list5, List list6, List list7, String str8, int[] iArr, List list8, String str9, String str10, String str11, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? EnumC35468Dw0.SORT_FIELD_POPULAR.getValue() : i, (i4 & 8) != 0 ? N7Y.UNEXPECTED.getValue() : i2, (i4 & 16) != 0 ? 20 : i3, str3, str4, (i4 & 128) != 0 ? "" : str5, (i4 & 256) != 0 ? "" : str6, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) != 0 ? C61878OQg.INSTANCE : list, (i4 & 2048) != 0 ? C61878OQg.INSTANCE : list2, (i4 & 4096) != 0 ? C61878OQg.INSTANCE : list3, (i4 & FileUtils.BUFFER_SIZE) != 0 ? C61878OQg.INSTANCE : list4, (i4 & 16384) != 0 ? C61878OQg.INSTANCE : list5, (32768 & i4) != 0 ? C61878OQg.INSTANCE : list6, (65536 & i4) != 0 ? C61878OQg.INSTANCE : list7, (131072 & i4) != 0 ? "" : str8, iArr, (524288 & i4) != 0 ? C61878OQg.INSTANCE : list8, (1048576 & i4) == 0 ? str9 : "", (2097152 & i4) != 0 ? null : str10, (i4 & 4194304) == 0 ? str11 : null);
    }
}
