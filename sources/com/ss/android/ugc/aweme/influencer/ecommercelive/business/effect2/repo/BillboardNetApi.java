package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.repo;

import X.C64797Pbt;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.BillboardSettingsData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DeleteImageResponseData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DisplayResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageListData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SaveTemplateRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SaveTemplateResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateListData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.UploadConfigData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.UploadImageRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.UploadImageResponseData;

/* loaded from: classes13.dex */
public interface BillboardNetApi {
    @E8M("/api/live_creator/v1/billboard/cancel_display")
    @InterfaceC195757mF
    Object cancelDisplay(@InterfaceC64985Pev("author_id") String str, @InterfaceC64985Pev("billboard_id") String str2, @InterfaceC64985Pev("billboard_type") int i, InterfaceC67352kd<? super C64797Pbt<Response<Object>>> interfaceC67352kd);

    @E8M("/api/live_creator/v1/billboard/upload_image")
    Object createImageTemplate(@InterfaceC195727mC UploadImageRequestBody uploadImageRequestBody, InterfaceC67352kd<? super C64797Pbt<Response<UploadImageResponseData>>> interfaceC67352kd);

    @E8M("/api/live_creator/v1/billboard/delete")
    @InterfaceC195757mF
    Object deleteImage(@InterfaceC64985Pev("author_id") String str, @InterfaceC64985Pev("image_id") String str2, InterfaceC67352kd<? super C64797Pbt<Response<DeleteImageResponseData>>> interfaceC67352kd);

    @E8M("/api/live_creator/v1/billboard/display")
    @InterfaceC195757mF
    Object display(@InterfaceC64985Pev("author_id") String str, @InterfaceC64985Pev("billboard_id") String str2, @InterfaceC64985Pev("is_changed") boolean z, @InterfaceC64985Pev("billboard_type") int i, @InterfaceC64985Pev("template_type") int i2, InterfaceC67352kd<? super C64797Pbt<Response<DisplayResponse>>> interfaceC67352kd);

    @E8L("/api/live_creator/v1/billboard/images_list")
    Object getBillboardImages(@InterfaceC64986Pew("author_id") String str, @InterfaceC64986Pew("page_size") int i, @InterfaceC64986Pew("offset") int i2, InterfaceC67352kd<? super C64797Pbt<Response<ImageListData>>> interfaceC67352kd);

    @E8L("/api/live_creator/v1/billboard/billboard_setting")
    Object getBillboardSettings(@InterfaceC64986Pew("author_id") String str, InterfaceC67352kd<? super C64797Pbt<Response<BillboardSettingsData>>> interfaceC67352kd);

    @E8L("/api/live_creator/v1/billboard/templates_list")
    Object getBillboardTemplates(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("author_id") String str2, @InterfaceC64986Pew("template_entry_type") int i, InterfaceC67352kd<? super C64797Pbt<Response<TemplateListData>>> interfaceC67352kd);

    @E8L("/api/live_creator/v1/billboard/imagex_signature")
    Object getUploadConfig(InterfaceC67352kd<? super C64797Pbt<Response<UploadConfigData>>> interfaceC67352kd);

    @E8M("/api/live_creator/v1/billboard/save")
    Object saveTemplate(@InterfaceC195727mC SaveTemplateRequestBody saveTemplateRequestBody, InterfaceC67352kd<? super C64797Pbt<Response<SaveTemplateResponse>>> interfaceC67352kd);

    @E8M("/api/live_creator/v1/billboard/update_billboard_setting")
    @InterfaceC195757mF
    Object updateBillboardSettings(@InterfaceC64985Pev("author_id") String str, @InterfaceC64985Pev("open_setting") boolean z, InterfaceC67352kd<? super C64797Pbt<Response<Object>>> interfaceC67352kd);
}
