package X;

import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.recharge.LiveVipRechargeSchemesSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Uca, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77580Uca implements InterfaceC77671Ue3 {
    public final /* synthetic */ RechargeDialogNew LIZ;

    @Override // X.InterfaceC77671Ue3
    public final void LIZLLL() {
        java.util.Map<String, String> map;
        Long l;
        String str;
        RechargeViewModel vl = this.LIZ.vl();
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        vl.getClass();
        DataChannel dataChannel = vl.LJLLLLLL;
        C77591Ucl c77591Ucl = vl.LJLLLL;
        if (c77591Ucl != null) {
            map = c77591Ucl.LIZIZ;
        } else {
            map = null;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        BZI LIZ = C28787BRn.LIZ("livesdk_recharge_vip_channel_entrance_click");
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "user_id");
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(String.valueOf(l), "anchor_id");
        if (room != null) {
            str = room.getIdStr();
        } else {
            str = null;
        }
        LIZ.LJIJJ(String.valueOf(str), "room_id");
        LIZ.LJIJJ(vl.tv0(), "charge_reason");
        LIZ.LJIJJ(vl.yv0(), "request_page");
        LIZ.LJJIFFI(map);
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LIZLLL(C28835BTj.LIZIZ(null, dataChannel, "user_live_duration"));
        LIZ.LJJIIJZLJL();
        C32364Cn2 c32364Cn2 = new C32364Cn2(LiveVipRechargeSchemesSetting.INSTANCE.getLiveRoomUrl());
        c32364Cn2.LIZJ("request_page", vl.yv0());
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(mo49getActivity, UriProtector.parse(c32364Cn2.LIZLLL()));
    }

    public C77580Uca(RechargeDialogNew rechargeDialogNew) {
        this.LIZ = rechargeDialogNew;
    }

    @Override // X.InterfaceC77671Ue3
    public final void LIZIZ(Diamond diamond) {
        String str;
        o.LJIIIZ(diamond, "diamond");
        RechargeViewModel vl = this.LIZ.vl();
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        vl.getClass();
        if (vl.iv0() != null) {
            vl.Bv0(mo49getActivity);
            if (C79146V4k.LJJJIL(diamond)) {
                str = "custom";
            } else {
                str = "app_package_guide";
            }
            C77541Ubx.LJIJ(vl.LJLLLL, diamond.count, vl.LLIIIILZ, vl.LJLLLLLL, vl.LLIIL, false, vl.LJLJL, str, vl.LLIIIZ, vl.rv0(), 1024);
        }
    }

    @Override // X.InterfaceC77671Ue3
    public final void LJ(Diamond diamond) {
        o.LJIIIZ(diamond, "diamond");
        RechargeViewModel vl = this.LIZ.vl();
        vl.getClass();
        vl.LJZ.setValue(diamond);
        vl.LLIILII = diamond;
        vl.Jv0(diamond);
    }

    @Override // X.InterfaceC77671Ue3
    public final void LIZ(int i, int i2) {
        RechargeViewModel vl = this.LIZ.vl();
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        View view = this.LIZ.getView();
        if (view != null) {
            view.getMeasuredHeight();
        }
        vl.Fv0(mo49getActivity, i, i2);
    }

    @Override // X.InterfaceC77671Ue3
    public final void LIZJ(boolean z, int i, Diamond diamond) {
        java.util.Map<String, String> map;
        int i2;
        int i3;
        Object obj;
        Object obj2;
        Integer num;
        String str;
        RechargeViewModel vl = this.LIZ.vl();
        vl.getClass();
        if (z) {
            int i4 = diamond.count;
            C77591Ucl rechargeDialogConfig = vl.LJLLLL;
            DataChannel dataChannel = vl.LJLLLLLL;
            if (rechargeDialogConfig != null) {
                map = rechargeDialogConfig.LIZIZ;
            } else {
                map = null;
            }
            Diamond diamond2 = vl.LLIIL;
            DiamondPackageExtra diamondPackageExtra = vl.LJLJL;
            o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
            if (i < 0) {
                i2 = i;
            } else {
                i2 = (i / 3) + 1;
            }
            if (diamond2 != null && i4 == diamond2.count) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            OSZ[] oszArr = new OSZ[17];
            oszArr[0] = new OSZ("request_page", vl.yv0());
            oszArr[1] = new OSZ("charge_reason", vl.tv0());
            oszArr[2] = new OSZ("gift_enter_from", vl.LLFF.getValue());
            oszArr[3] = new OSZ("has_gift_sent_before", vl.LLII.getValue());
            oszArr[4] = new OSZ("charge_style", "window");
            oszArr[5] = new OSZ("pay_method", C77608Ud2.LIZ());
            String str2 = "1";
            if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[6] = new OSZ("is_first_recharge", obj);
            oszArr[7] = new OSZ("recharge_package", String.valueOf(i4));
            if (dataChannel != null && o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[8] = new OSZ("is_anchor", obj2);
            oszArr[9] = new OSZ("line", String.valueOf(i2));
            oszArr[10] = new OSZ("position", String.valueOf(i));
            oszArr[11] = new OSZ("portal_id", String.valueOf(BJM.LJIIL()));
            if (!o.LJ(BJM.LJIIIIZZ(), "portal")) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[12] = new OSZ("is_portal_user", str2);
            oszArr[13] = new OSZ("panel_type", C77541Ubx.LJI(rechargeDialogConfig, false));
            if (diamond2 != null) {
                num = Integer.valueOf(diamond2.count);
            } else {
                num = null;
            }
            oszArr[14] = new OSZ("call_package", String.valueOf(num));
            if (diamond2 != null) {
                str = diamond2.LJLILLLLZI;
            } else {
                str = null;
            }
            oszArr[15] = new OSZ("currency", String.valueOf(str));
            oszArr[16] = new OSZ("if_default_package", String.valueOf(i3));
            java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
            java.util.Map LIZJ = C77541Ubx.LIZJ(rechargeDialogConfig, i4);
            java.util.Map LJ = C77541Ubx.LJ();
            java.util.Map LIZLLL = C77541Ubx.LIZLLL(rechargeDialogConfig, diamondPackageExtra);
            BZI LIZ = C28787BRn.LIZ("livesdk_recharge_package_show");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJJIFFI(LJJLIIIIJ);
            LIZ.LJJIFFI(LIZJ);
            LIZ.LJJIFFI(LJ);
            LIZ.LJJIFFI(LIZLLL);
            LIZ.LJJIFFI(map);
            LIZ.LJJIIJZLJL();
        }
    }
}
