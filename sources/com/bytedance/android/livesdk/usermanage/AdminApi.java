package com.bytedance.android.livesdk.usermanage;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EKC;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.usermanage.model.AddAdminExtra;
import com.bytedance.android.livesdk.usermanage.model.AdminListExtra;
import com.bytedance.android.livesdk.usermanage.model.AdminResponse;
import tikcast.api.anchor.AdminHostListResponse;
import tikcast.api.anchor.DelHostRelationResponse;
import tikcast.api.perception.ViolationStatusResponse;

/* loaded from: classes6.dex */
public interface AdminApi {
    @E8M("/webcast/anchor/admin/del_host_relation/")
    @InterfaceC195757mF
    AbstractC73672Svk<DelHostRelationResponse> delHostIModerator(@InterfaceC64985Pev("host_id") long j, @InterfaceC64985Pev("room_id") long j2);

    @E8L("/webcast/user/admin/list/")
    AbstractC73672Svk<BaseListResponse<AdminResponse, AdminListExtra>> fetchAdministrators(@InterfaceC64986Pew("anchor_id") long j, @InterfaceC64986Pew("sec_anchor_id") String str, @InterfaceC64986Pew("sec_user_id") String str2);

    @E8L("/webcast/anchor/admin/host_list/")
    AbstractC73672Svk<AdminHostListResponse> requestModeratorIHostList();

    @E8L("/webcast/perception/violation/status/")
    AbstractC73672Svk<ViolationStatusResponse> requestReportViolation(@InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("room_id") long j);

    @E8M("/webcast/user/admin/update/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> updateAdmin(@InterfaceC64985Pev("update_type") int i, @InterfaceC64985Pev("to_user_id") long j, @InterfaceC64985Pev("anchor_id") long j2, @InterfaceC64985Pev("current_room_id") long j3);

    @E8M("/webcast/user/admin/permission/update/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> updateAdminPermission(@InterfaceC64985Pev("permission_type") int i, @InterfaceC64985Pev("permission_value") int i2, @InterfaceC64985Pev("to_user_id") long j, @InterfaceC64985Pev("anchor_id") long j2, @InterfaceC64985Pev("room_id") long j3, @InterfaceC64985Pev("sec_anchor_id") String str, @InterfaceC64985Pev("sec_to_user_id") String str2);

    @E8M("/webcast/user/admin/update/")
    @EKC({"Content-Type: application/json"})
    AbstractC73672Svk<BaseResponse<Object, AddAdminExtra>> updateAdminWithExtra(@InterfaceC195727mC UpdateAdminParams updateAdminParams);
}
