package X;

import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.TWe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74772TWe<T> implements InterfaceC64592gB {
    public static final C74772TWe<T> LJLIL = new C74772TWe<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Long l;
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        T t = response.data;
        if (t != null && ((AudienceMultiGuestPermissionResponseData) t).L()) {
            MultiGuestPermissionInfo multiGuestPermissionInfo = ((AudienceMultiGuestPermissionResponseData) response.data).permissionInfo;
            if (multiGuestPermissionInfo != null) {
                l = multiGuestPermissionInfo.linkPermissionType;
            } else {
                l = null;
            }
            C74769TWb.LJII(l);
            return;
        }
        T t2 = response.data;
        o.LJIIIIZZ(t2, "response.data");
        C74769TWb.LJIIIIZZ((AudienceMultiGuestPermissionResponseData) t2);
    }
}
