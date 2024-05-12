package com.ss.android.ugc.aweme.setting.api;

import X.AbstractC73635Sv9;
import X.C10K;
import X.C64797Pbt;
import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.google.gson.j;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd;

/* loaded from: classes7.dex */
public interface SettingApi {
    @E4Q("/common")
    AbstractC73635Sv9<C64797Pbt<j>> queryABTestCommon(@InterfaceC64989Pez("aid") String str, @InterfaceC64989Pez("device_id") String str2, @InterfaceC64989Pez("client_version") long j, @InterfaceC64989Pez("new_cluster") int i, @InterfaceC64989Pez("cpu_model") String str3, @InterfaceC64989Pez("oid") int i2, @InterfaceC64989Pez("meta_version") String str4, @InterfaceC64989Pez("cdid") String str5, @InterfaceC64989Pez("ab_extra_data") String str6, @InterfaceC64989Pez("feature_update_version") String str7, @InterfaceC64989Pez("client_hash_value") String str8, @InterfaceC64989Pez("libra_function_flag") long j2, @InterfaceC64989Pez("ab_extra_vids") String str9);

    @E4Q("/aweme/v1/settings/")
    C76L<j> queryRawSetting(@InterfaceC64989Pez("cpu_model") String str, @InterfaceC64989Pez("oid") int i, @InterfaceC64989Pez("last_settings_version") String str2);

    @E4Q("/aweme/v1/settings/")
    C76L<IESSettings> querySetting(@InterfaceC64989Pez("cpu_model") String str, @InterfaceC64989Pez("oid") int i, @InterfaceC64989Pez("last_settings_version") String str2);

    @E4Q("/passport/password/has_set/")
    C10K<SettingUserHasSetPwd> queryUserHasSetPwd();

    @E4Q("/service/settings/v3/")
    AbstractC73635Sv9<C64797Pbt<j>> queryV3Setting(@InterfaceC64989Pez("cpu_model") String str, @InterfaceC64989Pez("oid") int i, @InterfaceC64989Pez("last_settings_version") String str2);
}
