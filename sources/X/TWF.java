package X;

import android.view.View;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedGuestABSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TWF implements InterfaceC14120gy {
    public final /* synthetic */ TWH LJLIL;

    public TWF(TWH twh) {
        this.LJLIL = twh;
    }

    @Override // X.InterfaceC14120gy
    public final void LJ(View v, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        boolean z;
        o.LJIIIZ(v, "v");
        if (MultiGuestV3AudioBeOccupiedGuestABSetting.INSTANCE.showOccupied() && !this.LJLIL.LIZIZ().LJIL) {
            if (C78886Uxe.LJJJJZ(C8E.LJ()) == 5) {
                C30868C9o.LIZJ(R.string.n0d);
                C74824TYe.LJJJIL("pm_mic_occupy_during_live_toast", "guest_connection");
                return;
            } else {
                C30868C9o.LIZJ(R.string.n0c);
                C74824TYe.LJJJIL("pm_mic_occupy_before_live_guest_toast", "guest_connection_preview_pannel");
                return;
            }
        }
        MultiGuestDataHolder LIZIZ = this.LJLIL.LIZIZ();
        if (!this.LJLIL.LIZIZ().LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ.LIZLLL = z;
        DataChannel dataChannel = this.LJLIL.LJLIL;
        if (dataChannel != null) {
            dataChannel.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(this.LJLIL.LIZIZ().LIZLLL, "business_mute_manage_panel"));
        }
        C74824TYe.LIZ.LJJ(this.LJLIL.LIZIZ().LJJIJ, this.LJLIL.LIZIZ().LJJJJI, "guest_connection_panel", true ^ this.LJLIL.LIZIZ().LIZLLL);
        DataChannel dataChannel2 = this.LJLIL.LJLIL;
        if (dataChannel2 != null) {
            dataChannel2.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(this.LJLIL.LIZIZ().LIZLLL, "business_mute_manage_panel"));
        }
        liveActionSheetDialog.dismiss();
    }
}
