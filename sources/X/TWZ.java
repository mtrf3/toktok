package X;

import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TWZ<T> implements InterfaceC64592gB {
    public static final TWZ<T> LJLIL = new TWZ<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Long l;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo2;
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        T t = response.data;
        String str = null;
        Long l2 = null;
        str = null;
        if (t != null && ((AudienceMultiGuestPermissionResponseData) t).L()) {
            MultiGuestPermissionInfo multiGuestPermissionInfo3 = ((AudienceMultiGuestPermissionResponseData) response.data).permissionInfo;
            if (multiGuestPermissionInfo3 != null) {
                l2 = multiGuestPermissionInfo3.linkPermissionType;
            }
            C74768TWa.LJ(l2);
            return;
        }
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData = (AudienceMultiGuestPermissionResponseData) response.data;
        if (audienceMultiGuestPermissionResponseData != null && (multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData.permissionInfo) != null) {
            l = Long.valueOf(multiGuestPermissionInfo2.errCode);
        } else {
            l = null;
        }
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData2 = (AudienceMultiGuestPermissionResponseData) response.data;
        if (audienceMultiGuestPermissionResponseData2 != null && (multiGuestPermissionInfo = audienceMultiGuestPermissionResponseData2.permissionInfo) != null) {
            str = multiGuestPermissionInfo.noPermissionPrompt;
        }
        C74768TWa.LJFF(l, str);
    }
}
