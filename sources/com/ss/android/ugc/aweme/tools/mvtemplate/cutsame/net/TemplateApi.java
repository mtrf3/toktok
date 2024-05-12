package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC36228EJs;
import X.InterfaceC64986Pew;
import java.util.HashMap;

/* loaded from: classes8.dex */
public interface TemplateApi {
    @E8L("/material_cloud/api/v1/public/api/get_template_detail")
    AbstractC73672Svk<MergedTemplateListResponseWrapper> requestMergedTemplateDetail(@InterfaceC64986Pew("template_id") String str, @InterfaceC64986Pew("template_type") int i, @InterfaceC64986Pew("effect_sdk_version") String str2, @InterfaceC64986Pew("nle_sdk_version") String str3, @InterfaceC64986Pew("operating_system") String str4, @InterfaceC64986Pew("app_version") String str5, @InterfaceC64986Pew("effect_platform_sdk_version") String str6, @InterfaceC36228EJs HashMap<String, String> hashMap);

    @E8L("/material_cloud/api/v1/public/api/get_template_list")
    AbstractC73672Svk<MergedTemplateListResponseWrapper> requestMergedTemplateList(@InterfaceC64986Pew("effect_sdk_version") String str, @InterfaceC64986Pew("nle_sdk_version") String str2, @InterfaceC64986Pew("perpage") int i, @InterfaceC64986Pew("operating_system") String str3, @InterfaceC64986Pew("app_version") String str4, @InterfaceC64986Pew("effect_platform_sdk_version") String str5, @InterfaceC64986Pew("content_filter") int i2, @InterfaceC36228EJs HashMap<String, String> hashMap);

    @E8L("templates/item")
    AbstractC73672Svk<CategoryResp> requestTemplateDetail(@InterfaceC64986Pew("template_id") String str, @InterfaceC64986Pew("feature_list") String str2, @InterfaceC64986Pew("type") int i, @InterfaceC64986Pew("access_key") String str3, @InterfaceC64986Pew("aid") String str4, @InterfaceC64986Pew("app_version") String str5, @InterfaceC64986Pew("sdk_version") String str6, @InterfaceC64986Pew("os_version") String str7, @InterfaceC64986Pew("region_key") String str8, @InterfaceC64986Pew("device_id") String str9, @InterfaceC64986Pew("device_platform") String str10, @InterfaceC64986Pew("device_type") String str11, @InterfaceC36228EJs HashMap<String, String> hashMap);
}
