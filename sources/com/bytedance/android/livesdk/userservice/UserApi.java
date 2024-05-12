package com.bytedance.android.livesdk.userservice;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC36228EJs;
import X.InterfaceC36348EOi;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.UserAttrResponse;
import com.bytedance.android.livesdk.model.UserExtra;
import java.util.HashMap;

/* loaded from: classes6.dex */
public interface UserApi {
    @InterfaceC65131PhH(settingKey = "live_optimization_user_serialization_type", value = EnumC29608Bjg.ROOM)
    @E8L("/webcast/user/attr/")
    AbstractC73638SvC<C28467BFf<UserAttrResponse>> getUserAttr(@InterfaceC64986Pew("attr_types") String str);

    @InterfaceC65131PhH(settingKey = "live_optimization_user_serialization_type", value = EnumC29608Bjg.ROOM)
    @E8L("/webcast/user/")
    AbstractC73638SvC<C28467BFf<User>> queryUser(@InterfaceC64986Pew("target_uid") long j, @InterfaceC64986Pew("packed_level") long j2, @InterfaceC64986Pew("sec_target_uid") String str, @InterfaceC64986Pew("request_from_type") String str2);

    @InterfaceC65131PhH(settingKey = "live_optimization_user_serialization_type", value = EnumC29608Bjg.ROOM)
    @E8L("/webcast/user/")
    AbstractC73638SvC<C28467BFf<User>> queryUser(@InterfaceC64986Pew("target_uid") long j, @InterfaceC64986Pew("packed_level") long j2, @InterfaceC64986Pew("sec_target_uid") String str, @InterfaceC64986Pew("request_from_type") String str2, @InterfaceC36348EOi("live-trace-tag") String str3);

    @InterfaceC65131PhH(settingKey = "live_optimization_user_serialization_type", value = EnumC29608Bjg.ROOM)
    @E8L("/webcast/user/")
    AbstractC73638SvC<BaseResponse<User, UserExtra>> queryUser(@InterfaceC36228EJs HashMap<String, String> hashMap);

    @InterfaceC65131PhH(settingKey = "live_optimization_user_serialization_type", value = EnumC29608Bjg.ROOM)
    @E8L("/webcast/user/")
    AbstractC73638SvC<BaseResponse<User, UserExtra>> queryUser(@InterfaceC36228EJs HashMap<String, String> hashMap, @InterfaceC36348EOi("live-trace-tag") String str);

    @E8M("/webcast/user/attr/update/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> updateSwitch(@InterfaceC64985Pev("attr_type") long j, @InterfaceC64985Pev("value") long j2);
}
