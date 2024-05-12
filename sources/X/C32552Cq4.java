package X;

import Y.AObserverS73S0100000_5;
import Y.AfS57S0100000_5;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.ExclusiveShowRedDotEvent;
import com.bytedance.android.livesdk.GiftCPCFaqIconVisibilityChange;
import com.bytedance.android.livesdk.api.revenue.privilege.api.PrivilegeApi;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel.GiftPrivilegeCenterViewModel;
import com.bytedance.android.livesdk.livesetting.level.PrivilegeCenterEntranceCacheSetting;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Cq4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32552Cq4 implements InterfaceC32548Cq0 {
    public final /* synthetic */ C32553Cq5 LIZ;

    public C32552Cq4(C32553Cq5 c32553Cq5) {
        this.LIZ = c32553Cq5;
    }

    @Override // X.InterfaceC32548Cq0
    public final void LIZ(C32543Cpv stateManager, EnumC32542Cpu event) {
        Long l;
        Long l2;
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2;
        Room room2;
        C32580CqW c32580CqW;
        Fragment fragment;
        DataChannel dataChannel3;
        DataChannel dataChannel4;
        Fragment fragment2;
        GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModel;
        C32580CqW c32580CqW2;
        Fragment fragment3;
        o.LJIIIZ(stateManager, "stateManager");
        o.LJIIIZ(event, "event");
        int i = C32547Cpz.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C32553Cq5 c32553Cq5 = this.LIZ;
            c32553Cq5.LLD.LIZLLL();
            GiftPanelLeafViewModel LJJIFFI = c32553Cq5.LJJIFFI();
            if (LJJIFFI == null || (c32580CqW2 = c32553Cq5.LJLJJL) == null || (fragment3 = c32580CqW2.getFragment()) == null) {
                return;
            }
            LJJIFFI.LJLLLLLL.removeObservers(fragment3);
            return;
        }
        C32553Cq5 c32553Cq52 = this.LIZ;
        c32553Cq52.getClass();
        c32553Cq52.LJZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        c32553Cq52.LJJIJIIJIL();
        Room room3 = null;
        boolean z = false;
        if (PrivilegeCenterEntranceCacheSetting.INSTANCE.getValue()) {
            Boolean LIZ = InterfaceC30442Bx8.B2.LIZ();
            if (LIZ != null) {
                z = LIZ.booleanValue();
            }
            c32553Cq52.LJJIIZ(z);
            C32580CqW c32580CqW3 = c32553Cq52.LJLJJL;
            if (c32580CqW3 != null && (fragment2 = c32580CqW3.getFragment()) != null && (giftPrivilegeCenterViewModel = (GiftPrivilegeCenterViewModel) ViewModelProviders.of(fragment2).get(GiftPrivilegeCenterViewModel.class)) != null) {
                giftPrivilegeCenterViewModel.gv0(z, c32553Cq52.LL);
            }
        } else {
            PrivilegeApi privilegeApi = (PrivilegeApi) Q7L.LIZIZ(PrivilegeApi.class);
            GiftLeafRootViewModel LJJIII = c32553Cq52.LJJIII();
            if (LJJIII != null && (dataChannel2 = LJJIII.LJLIL) != null && (room2 = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                l = Long.valueOf(room2.getId());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            GiftLeafRootViewModel LJJIII2 = c32553Cq52.LJJIII();
            if (LJJIII2 != null && (dataChannel = LJJIII2.LJLIL) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            C1EW.LIZ(privilegeApi.getUserPrivilegeInfo(false, valueOf, String.valueOf(l2), EnumC29511Bi7.REQUEST_FROM_SCENE_GIFT_PANEL.getType())).LJJJLIIL(new AfS57S0100000_5(c32553Cq52, 8), new AfS57S0100000_5(c32553Cq52, 12));
        }
        GiftLeafRootViewModel LJJIII3 = c32553Cq52.LJJIII();
        if (LJJIII3 != null && (dataChannel4 = LJJIII3.LJLIL) != null) {
            room3 = (Room) dataChannel4.kv0(RoomChannel.class);
        }
        c32553Cq52.LL = room3;
        GiftLeafRootViewModel LJJIII4 = c32553Cq52.LJJIII();
        if (LJJIII4 != null && (dataChannel3 = LJJIII4.LJLIL) != null) {
            dataChannel3.mv0(ExclusiveShowRedDotEvent.class, c32553Cq52, new AqS171S0100000_5(c32553Cq52, 6));
            dataChannel3.nv0(GiftCPCFaqIconVisibilityChange.class, c32553Cq52, new AqS171S0100000_5(c32553Cq52, 7));
        }
        if (((IDebugService) CN1.LIZ(IDebugService.class)).tL()) {
            ((IDebugService) CN1.LIZ(IDebugService.class)).E3();
        }
        c32553Cq52.LLD.LIZ(C73943T0h.LIZ().LJ(C29431Bgp.class).LJJJJZI(new AfS57S0100000_5(c32553Cq52, 4)));
        GiftPanelLeafViewModel LJJIFFI2 = c32553Cq52.LJJIFFI();
        if (LJJIFFI2 == null || (c32580CqW = c32553Cq52.LJLJJL) == null || (fragment = c32580CqW.getFragment()) == null) {
            return;
        }
        LJJIFFI2.LJLLLLLL.observe(fragment, new AObserverS73S0100000_5(c32553Cq52, 3));
    }
}
