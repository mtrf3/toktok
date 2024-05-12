package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BRN implements InterfaceViewOnClickListenerC30227Btf {
    public final DataChannel LJLIL;
    public InterfaceC30237Btp LJLILLLLZI;
    public boolean LJLJI;
    public Room LJLJJI;
    public int LJLJJL;

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

    public final void LIZ() {
        int i;
        int i2;
        Context context;
        Integer LJI;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        Room room = (Room) this.LJLIL.kv0(RoomChannel.class);
        if (room != null) {
            i = room.cppVersion;
        } else {
            i = 0;
        }
        Room room2 = (Room) this.LJLIL.kv0(RoomChannel.class);
        if (room2 != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
            i2 = anchorLevelPermission.treasureBox;
        } else {
            i2 = 1;
        }
        InterfaceC30237Btp interfaceC30237Btp = this.LJLILLLLZI;
        if (interfaceC30237Btp != null) {
            LiveIconView liveIconView = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ld4);
            TextView textView = (TextView) interfaceC30237Btp.LIZ(R.id.ldn);
            ImageView imageView = (ImageView) interfaceC30237Btp.LIZ(R.id.ld0);
            if (this.LJLJJL == 1) {
                if (liveIconView != null) {
                    liveIconView.setIcon(R.drawable.d0s);
                }
                if (textView != null) {
                    textView.setTextColor(C15380j0.LIZIZ(R.color.cn));
                    return;
                }
                return;
            }
            if (i == 2 && i2 == 0) {
                InterfaceC30237Btp interfaceC30237Btp2 = this.LJLILLLLZI;
                if (interfaceC30237Btp2 != null && (context = interfaceC30237Btp2.getContext()) != null && (LJI = C79045V0n.LJI(R.attr.go, context)) != null) {
                    int intValue = LJI.intValue();
                    if (liveIconView != null) {
                        liveIconView.setIcon(R.drawable.d0s);
                    }
                    if (textView != null) {
                        textView.setTextColor(intValue);
                    }
                }
                if (imageView == null) {
                    return;
                }
                imageView.setVisibility(0);
                C15490jB.LJFF(imageView, "tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v3.png", ImageView.ScaleType.CENTER_CROP, null);
                return;
            }
            if (liveIconView != null) {
                liveIconView.setIcon(R.drawable.d0s);
            }
            if (textView == null) {
                return;
            }
            textView.setTextColor(C15380j0.LIZIZ(R.color.ck));
        }
    }

    public BRN(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r5.intValue() > 0) goto L29;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BRN.onClick(android.view.View):void");
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        String str;
        Room room;
        Boolean bool;
        this.LJLILLLLZI = interfaceC30237Btp;
        LIZ();
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_redpacket_entrance_show");
        LIZ.LJIILLIIL(this.LJLIL);
        boolean z = false;
        if (C44384HbQ.LJJIJ()) {
            InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.LJLIL);
            if (pk != null && pk.LJFF(EnumC30204BtI.INTERACTION_FEATURES)) {
                str = "more_interaction";
            } else {
                str = "interaction";
            }
        } else {
            str = "more";
        }
        LIZ.LJIJJ(str, "entrance");
        LIZ.LJJIIJZLJL();
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        }
        this.LJLJI = z;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJI = room;
    }
}
