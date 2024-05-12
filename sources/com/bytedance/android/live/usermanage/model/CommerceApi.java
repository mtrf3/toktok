package com.bytedance.android.live.usermanage.model;

import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;

/* loaded from: classes6.dex */
public interface CommerceApi {
    @E8L("/webcast/user/admin/check/e-commerce")
    Object checkAdminECommercePermission(@InterfaceC64986Pew("to_user_id") long j, @InterfaceC64986Pew("anchor_id") long j2, @InterfaceC64986Pew("sec_anchor_id") String str, @InterfaceC64986Pew("sec_to_user_id") String str2, @InterfaceC64986Pew("permission_type") Integer num, InterfaceC67352kd<? super C28467BFf<CheckAdminECommercePermissionData>> interfaceC67352kd);
}
