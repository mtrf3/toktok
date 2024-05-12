package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BH6 implements InterfaceViewOnClickListenerC30227Btf {
    public long LJLIL = -1;
    public DataChannel LJLILLLLZI;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final boolean ud() {
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        if (C12840eu.LIZ.LIZ(this.LJLIL)) {
            return;
        }
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        } else {
            fragmentManager = null;
        }
        this.LJLIL = C32044Chs.LJIIIZ(fragmentManager, ((IAdminSettingService) CN1.LIZ(IAdminSettingService.class)).mo(), "live_commercial_content_toggle", null, null);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        Long l;
        Room room;
        this.LJLILLLLZI = dataChannel;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_commercial_icon_show");
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "anchor_id");
        LIZ.LJIIJJI("live_take_detail");
        LIZ.LJJIIJZLJL();
    }
}
