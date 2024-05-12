package X;

import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.usermanage.UpdateAdminParams;
import com.bytedance.android.livesdk.usermanage.model.AddAdminExtra;
import com.bytedance.android.livesdk.usermanage.model.AdminListExtra;
import com.bytedance.android.livesdk.usermanage.model.AdminResponse;
import kotlin.jvm.internal.o;
import tikcast.api.anchor.AdminHostListResponse;
import tikcast.api.anchor.DelHostRelationResponse;
import tikcast.api.perception.ViolationStatusResponse;

/* renamed from: X.BFe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28466BFe implements AdminApi {
    @Override // com.bytedance.android.livesdk.usermanage.AdminApi
    public final AbstractC73672Svk<AdminHostListResponse> requestModeratorIHostList() {
        return AbstractC73672Svk.LJJIJIL(new AdminHostListResponse());
    }

    @Override // com.bytedance.android.livesdk.usermanage.AdminApi
    public final AbstractC73672Svk<BaseResponse<Object, AddAdminExtra>> updateAdminWithExtra(UpdateAdminParams updateAdminParams) {
        return AbstractC73672Svk.LJJIJIL(new BaseResponse());
    }

    @Override // com.bytedance.android.livesdk.usermanage.AdminApi
    public final AbstractC73672Svk<DelHostRelationResponse> delHostIModerator(long j, long j2) {
        return AbstractC73672Svk.LJJIJIL(new DelHostRelationResponse());
    }

    @Override // com.bytedance.android.livesdk.usermanage.AdminApi
    public final AbstractC73672Svk<ViolationStatusResponse> requestReportViolation(int i, long j) {
        return AbstractC73672Svk.LJJIJIL(new ViolationStatusResponse());
    }

    @Override // com.bytedance.android.livesdk.usermanage.AdminApi
    public final AbstractC73672Svk<BaseListResponse<AdminResponse, AdminListExtra>> fetchAdministrators(long j, String str, String str2) {
        AbstractC73672Svk<BaseListResponse<AdminResponse, AdminListExtra>> fetchAdministrators = ((AdminApi) Q7L.LIZIZ(AdminApi.class)).fetchAdministrators(j, str, str2);
        o.LJIIIIZZ(fetchAdministrators, "get().getService(AdminAp…Id, secAnchorUid, secUid)");
        return fetchAdministrators;
    }

    @Override // com.bytedance.android.livesdk.usermanage.AdminApi
    public final AbstractC73672Svk<C28467BFf<Object>> updateAdmin(int i, long j, long j2, long j3) {
        return AbstractC73672Svk.LJJIJIL(new C28467BFf());
    }

    @Override // com.bytedance.android.livesdk.usermanage.AdminApi
    public final AbstractC73672Svk<C28467BFf<Object>> updateAdminPermission(int i, int i2, long j, long j2, long j3, String str, String str2) {
        return AbstractC73672Svk.LJJIJIL(new C28467BFf());
    }
}
