package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.event.TreasureBoxStatusEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BRK implements InterfaceC28903BVz {
    public final LifecycleOwner LJLIL;
    public DataChannel LJLILLLLZI;
    public View LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC28903BVz
    public final void LIZJ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC28903BVz
    public final int LIZLLL() {
        return R.string.oqh;
    }

    @Override // X.InterfaceC28903BVz
    public final void onHide() {
    }

    public final void LIZ() {
        int i;
        int i2;
        Context context;
        Integer LJI;
        Room room;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        Room room2;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            i = room2.cppVersion;
        } else {
            i = 0;
        }
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
            i2 = anchorLevelPermission.treasureBox;
        } else {
            i2 = 1;
        }
        View view = this.LJLJI;
        if (view != null) {
            View findViewById = view.findViewById(R.id.e_q);
            TextView textView = (TextView) view.findViewById(R.id.title);
            ImageView imageView = (ImageView) view.findViewById(R.id.ld0);
            if (this.LJLJJI == 1) {
                if (findViewById != null) {
                    findViewById.setAlpha(0.34f);
                }
                if (textView != null) {
                    textView.setTextColor(C15380j0.LIZIZ(R.color.cn));
                    return;
                }
                return;
            }
            if (i == 2 && i2 == 0) {
                View view2 = this.LJLJI;
                if (view2 != null && (context = view2.getContext()) != null && (LJI = C79045V0n.LJI(R.attr.go, context)) != null) {
                    int intValue = LJI.intValue();
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
            if (findViewById != null) {
                findViewById.setAlpha(1.0f);
            }
            if (textView == null) {
                return;
            }
            textView.setTextColor(C15380j0.LIZIZ(R.color.ck));
        }
    }

    @Override // X.InterfaceC28903BVz
    public final int LJ() {
        if (LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine()) {
            return R.attr.avs;
        }
        return R.attr.at6;
    }

    @Override // X.InterfaceC28903BVz
    public final void onShow() {
        String str;
        if (this.LJLJJL) {
            return;
        }
        this.LJLJJL = true;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_redpacket_entrance_show");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        if (C44384HbQ.LJJIJ()) {
            InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.LJLILLLLZI);
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
    }

    public BRK(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (r5.intValue() > 0) goto L29;
     */
    @Override // X.InterfaceC28903BVz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BRK.onClick(android.view.View):void");
    }

    @Override // X.InterfaceC28903BVz
    public final void LIZIZ(View view, DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        this.LJLILLLLZI = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJJLL = z;
        this.LJLJI = view;
        LIZ();
        if (dataChannel != null) {
            dataChannel.lv0(this.LJLIL, TreasureBoxStatusEvent.class, new AqS171S0100000_5(this, 760));
        }
    }
}
