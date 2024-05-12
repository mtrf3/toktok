package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.TVu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74762TVu implements InterfaceViewOnClickListenerC30227Btf {
    public DataChannel LJLIL;

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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j;
        boolean z;
        Boolean bool;
        Room room;
        User owner;
        FollowInfo followInfo;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            j = followInfo.getFollowStatus();
        } else {
            j = 0;
        }
        DataChannel dataChannel2 = this.LJLIL;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(BCW.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        TWL.LJIJ(j, true, z, "plus_button");
        C2A6 c2a6 = new C2A6(((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity());
        ArrayList arrayList = new ArrayList();
        C41021jG c41021jG = new C41021jG();
        c41021jG.LIZ = C15380j0.LJIILJJIL(R.string.now);
        c41021jG.LIZJ = new C74763TVv(this);
        arrayList.add(new C41031jH(c41021jG));
        c2a6.LIZIZ(arrayList);
        C30101Gc c30101Gc = new C30101Gc();
        c30101Gc.LIZ = C15380j0.LJIILJJIL(R.string.snx);
        c30101Gc.LIZJ = C87277YNd.LJLILLLLZI;
        c2a6.LIZLLL = new C30111Gd(c30101Gc);
        LiveActionSheetDialog LIZ = c2a6.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/view/sheet/action/LiveActionSheetDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "2949993048755790477")).LIZ) {
            return;
        }
        LIZ.show();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }
}
