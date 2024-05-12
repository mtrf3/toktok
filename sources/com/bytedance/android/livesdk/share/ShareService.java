package com.bytedance.android.livesdk.share;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.B9M;
import X.BNI;
import X.C1EW;
import X.C29338BfK;
import X.C29867Bnr;
import X.C29930Bos;
import X.C30093BrV;
import X.C39685Fhp;
import X.CN1;
import X.InterfaceC62096OYq;
import X.Q7L;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.share.ShareApi;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSharePanelSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class ShareService implements IShareService {
    public C29338BfK LJLIL;

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final LiveShareWidget lB() {
        return new LiveShareWidget();
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final BNI un0() {
        if (this.LJLIL == null) {
            this.LJLIL = new C29338BfK((IHostShare) CN1.LIZ(IHostShare.class));
        }
        return this.LJLIL;
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final C30093BrV wp0() {
        return new C30093BrV();
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final boolean Qn0(Room room) {
        if (room == null || room.getOwner() == null || (room.getOwner().getSecret() == 1 && LiveSharePanelSetting.INSTANCE.getValue() == 0)) {
            return false;
        }
        if (room.getRoomAuthStatus() != null && !room.getRoomAuthStatus().isEnableShare()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final boolean vo0(Room room) {
        if (room == null || room.getOwner() == null || room.getOwner().getSecret() == 1) {
            return false;
        }
        if (room.getRoomAuthStatus() != null && !room.getRoomAuthStatus().isEnableShare()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final LiveShareDialog RQ(C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq) {
        return LiveShareDialog.vl(c29930Bos, interfaceC62096OYq);
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final List Zp0(LiveMode liveMode, Room room, DataChannel dataChannel) {
        return B9M.LIZ(liveMode, room, dataChannel, true);
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final AbstractC73672Svk Ib(String str, long j, String str2, String str3) {
        if (str2 == null) {
            str2 = "";
        }
        C39685Fhp c39685Fhp = new C39685Fhp();
        c39685Fhp.LIZJ("target_id", String.valueOf(-1));
        c39685Fhp.LIZJ("share_type", String.valueOf(1));
        c39685Fhp.LIZJ("common_label_list", String.valueOf(str));
        c39685Fhp.LIZJ("to_user_ids", str2.replaceAll(" ", ""));
        c39685Fhp.LIZJ("enter_from", str3);
        return C1EW.LIZ(((ShareApi) Q7L.LIZIZ(ShareApi.class)).sendShare(j, (HashMap) c39685Fhp.LJLILLLLZI));
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final C29867Bnr bW(ActivityC45651qj activityC45651qj, Context context, LiveMode liveMode, LifecycleOwner lifecycleOwner) {
        return new C29867Bnr(activityC45651qj, context, liveMode, lifecycleOwner);
    }
}
