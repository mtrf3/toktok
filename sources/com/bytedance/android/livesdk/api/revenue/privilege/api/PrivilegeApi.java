package com.bytedance.android.livesdk.api.revenue.privilege.api;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC64986Pew;
import tikcast.api.privilege.QueryUserPrivilegesResponse;

/* loaded from: classes6.dex */
public interface PrivilegeApi {
    @E8M("/webcast/privilege/query_user_privileges/")
    AbstractC73672Svk<QueryUserPrivilegesResponse> getUserPrivilegeInfo(@InterfaceC64986Pew("need_privilege_detail") boolean z, @InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("anchor_id") String str2, @InterfaceC64986Pew("request_from") int i);
}
