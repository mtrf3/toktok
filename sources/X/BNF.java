package X;

import Y.AfS36S0101000_5;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.share.LiveShareWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class BNF implements InterfaceC62096OYq {
    public final /* synthetic */ LiveShareWidget LJLIL;

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void onDismiss() {
    }

    public BNF(LiveShareWidget liveShareWidget) {
        this.LJLIL = liveShareWidget;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String str, String str2, Bundle bundle) {
        Room room;
        String str3 = "";
        if (bundle != null) {
            str3 = bundle.getString("shareIdList", "");
        }
        LiveShareWidget liveShareWidget = this.LJLIL;
        Room room2 = liveShareWidget.LJLJI;
        if (room2 != null) {
            ((IShareService) CN1.LIZ(IShareService.class)).Ib(this.LJLIL.LJLJI.getLabels(), room2.getId(), str3, (String) DataChannelGlobal.LJLJJI.mv0(C29038BaU.class)).LJJJLIIL(new AfS36S0101000_5(2, liveShareWidget, 36), BTJ.LIZ);
        }
        if (C28835BTj.LJFF(this.LJLIL.dataChannel) && (room = this.LJLIL.LJLJI) != null && room.author() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(this.LJLIL.LJLJI.author().getId()));
            hashMap.put("room_id", String.valueOf(this.LJLIL.LJLJI.getId()));
            C28835BTj.LIZ("live_ad", "live_share", null, hashMap);
        }
    }
}
