package X;

import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.OpenLowAgeDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Cac, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31594Cac implements InterfaceViewOnClickListenerC30227Btf {
    public final DataChannel LJLIL;
    public final IGiftService LJLILLLLZI = (IGiftService) CN1.LIZ(IGiftService.class);

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
    public final /* synthetic */ void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
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
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public C31594Cac(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Room room;
        boolean z;
        DataChannel dataChannel = this.LJLIL;
        boolean z2 = false;
        if (dataChannel != null) {
            z = ((Boolean) dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
            room = (Room) this.LJLIL.kv0(RoomChannel.class);
        } else {
            room = null;
            z = false;
        }
        if (C31593Cab.LIZIZ(this.LJLIL)) {
            C31593Cab.LIZLLL(C45804HyK.LJIJJ(view.getContext()), this.LJLIL);
            return;
        }
        if (this.LJLILLLLZI.isNewsAccount(this.LJLIL)) {
            this.LJLILLLLZI.showGiftBannedPopup(view.getContext(), false);
            return;
        }
        if (room != null && room.getRoomAuthStatus() != null && room.getRoomAuthStatus().isEnableGift()) {
            z2 = true;
        }
        if (C31156CKq.LIZ(z, true, z2) == EnumC31155CKp.TOAST) {
            if (room != null && room.getRoomAuthStatus() != null && room.getRoomAuthStatus().getRoomAuthOffReasons() != null && room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
                C30868C9o.LJI(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
                DataChannel dataChannel2 = this.LJLIL;
                if (dataChannel2 != null) {
                    dataChannel2.qv0(LogGiftCloseToastShowEvent.class, Boolean.TRUE);
                    return;
                }
                return;
            }
            return;
        }
        DataChannel dataChannel3 = this.LJLIL;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.pv0(OpenLowAgeDialogEvent.class);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        View LIZ = interfaceC30237Btp.LIZ(R.id.ldn);
        if (LIZ != null) {
            LIZ.setAlpha(0.5f);
        }
        View LIZ2 = interfaceC30237Btp.LIZ(R.id.ldm);
        if (LIZ2 != null) {
            LIZ2.setAlpha(0.3f);
        }
        LiveIconView liveIconView = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ld4);
        if (liveIconView != null) {
            if (Boolean.FALSE.equals(dataChannel.kv0(BCW.class))) {
                liveIconView.setIcon(R.drawable.d2n);
            }
            if (Boolean.FALSE.equals(dataChannel.kv0(BNK.class))) {
                liveIconView.setIcon(R.drawable.d2n);
            }
        }
    }
}
