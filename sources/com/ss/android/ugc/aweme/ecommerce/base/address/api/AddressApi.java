package com.ss.android.ugc.aweme.ecommerce.base.address.api;

import X.AbstractC73672Svk;
import X.C27096AkG;
import X.C64797Pbt;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.BuyerHasAddressResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClaimIncentiveWithAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClaimIncentiveWithAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeleteRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetPromotionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetPromotionResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetPromotionTriggerRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ModifyRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveRequest;

/* loaded from: classes5.dex */
public interface AddressApi {
    public static final C27096AkG LIZ = C27096AkG.LIZ;

    @E4T("/api/v1/shop/shipping_address/change_on_order")
    AbstractC73672Svk<C64797Pbt<Response<ChangeOrderShippingAddressResponseData>>> changeOnOrder(@InterfaceC27211Am7 ChangeOrderShippingAddressRequest changeOrderShippingAddressRequest);

    @E4T("/api/v1/shop/shipping_address/check")
    AbstractC73672Svk<C64797Pbt<Response<CheckShippingAddressData>>> checkAddress(@InterfaceC27211Am7 CheckShippingAddressRequest checkShippingAddressRequest);

    @E4T("/api/v1/shop/shipping_address/claim_incentive")
    AbstractC73672Svk<C64797Pbt<Response<ClaimIncentiveWithAddressResponseData>>> claimIncentive(@InterfaceC27211Am7 ClaimIncentiveWithAddressRequest claimIncentiveWithAddressRequest);

    @E4T("/api/v1/shop/shipping_address/delete")
    AbstractC73672Svk<Response<Object>> deleteAddress(@InterfaceC27211Am7 DeleteRequest deleteRequest);

    @E4T("/api/v1/shop/shipping_address/get")
    AbstractC73672Svk<C64797Pbt<Response<AddressListData>>> getAddressList();

    @E4T("/api/v1/shop/shipping_address/get")
    AbstractC73672Svk<C64797Pbt<Response<AddressListData>>> getAddressList(@InterfaceC27211Am7 GetShippingAddressRequest getShippingAddressRequest);

    @E4T("/api/v1/shop/buyer/has_address")
    AbstractC73672Svk<C64797Pbt<Response<BuyerHasAddressResponse>>> getBuyerHasAddress();

    @E4T("/api/v1/shop/shipping_address/get_detail_place")
    AbstractC73672Svk<C64797Pbt<Response<CandDetailPlaceResponse>>> getCandDetailPlace(@InterfaceC27211Am7 CandDetailPlaceRequest candDetailPlaceRequest);

    @E4T("/api/v1/shop/shipping_address/get_shipping_address_candidate_input")
    AbstractC73672Svk<C64797Pbt<Response<CandInputDataOptions>>> getCandInput(@InterfaceC27211Am7 CandInputRequest candInputRequest);

    @E4T("/api/v1/shop/shipping_address/input_item")
    AbstractC73672Svk<C64797Pbt<Response<InputItemData>>> getInputItems(@InterfaceC27211Am7 InputItemRequest inputItemRequest);

    @E4T("/api/v1/shop/shipping_address/promotion")
    AbstractC73672Svk<C64797Pbt<Response<GetPromotionResponseData>>> getPromotion(@InterfaceC27211Am7 GetPromotionRequest getPromotionRequest);

    @E4T("/api/v1/shop/shipping_address/promotion_trigger")
    AbstractC73672Svk<C64797Pbt<Response<Object>>> getPromotionTrigger(@InterfaceC27211Am7 GetPromotionTriggerRequest getPromotionTriggerRequest);

    @E4T("/api/v1/shop/shipping_address/modify")
    Object modifyAddress(@InterfaceC27211Am7 ModifyRequest modifyRequest, InterfaceC67352kd<? super Response<Object>> interfaceC67352kd);

    @E4T("/api/v1/shop/shipping_address/save")
    AbstractC73672Svk<C64797Pbt<Response<SaveData>>> saveAddress(@InterfaceC27211Am7 SaveRequest saveRequest);
}
