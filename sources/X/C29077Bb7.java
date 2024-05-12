package X;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bb7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29077Bb7 implements InterfaceC62096OYq {
    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void onDismiss() {
    }

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
        C0NB.LIZIZ("MultiLiveAnchorUserInfoPresenter", "share failed!");
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String platform, String shareType, Bundle bundle) {
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(shareType, "shareType");
        C0NB.LIZIZ("MultiLiveAnchorUserInfoPresenter", "share success!");
        HashMap LIZ = C45243HpH.LIZ("user_type", "anchor", "event_page", "guest_connection_panel");
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        LIZ.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        LIZ.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        LIZ.putAll(BJB.LIZ());
        C74824TYe.LJLL("livesdk_share", LIZ);
    }
}
