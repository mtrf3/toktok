package X;

import Y.IDCListenerS159S0100000_5;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveChargePanelPositionSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CLB {
    public static final /* synthetic */ int LJFF = 0;
    public Context LIZ;
    public DataChannel LIZIZ;
    public final CLK LIZJ = new CLK(TimeUnit.SECONDS.toMillis(1));
    public final AqS171S0100000_5 LIZLLL = new AqS171S0100000_5(this, 567);
    public final C29561Biv LJ = new C29561Biv();

    public static void LIZ(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "5161870970576042215")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public static void LIZIZ(int i) {
        HashMap hashMap = new HashMap();
        if (i != 0) {
            if (i != 1) {
                BZI LIZ = C28787BRn.LIZ("livesdk_gift_age_popup_show");
                LIZ.LJIIZILJ();
                LIZ.LJIIL("show");
                LIZ.LJIIIZ("live");
                LIZ.LJIIJJI("gift_dialog");
                LIZ.LJJIIJZLJL();
                return;
            }
            hashMap.put("click_icon", "cancel");
            BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_age_popup_click");
            LIZ2.LJJIFFI(hashMap);
            LIZ2.LJIIZILJ();
            LIZ2.LJIIL("click");
            LIZ2.LJIIIZ("live");
            LIZ2.LJIIJJI("gift_dialog");
            LIZ2.LJJIIJZLJL();
            return;
        }
        hashMap.put("click_icon", "continue");
        BZI LIZ3 = C28787BRn.LIZ("livesdk_gift_age_popup_click");
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LJIIZILJ();
        LIZ3.LJIIL("click");
        LIZ3.LJIIIZ("live");
        LIZ3.LJIIJJI("gift_dialog");
        LIZ3.LJJIIJZLJL();
    }

    public final void LIZLLL(C15960jw c15960jw) {
        if (this.LIZ == null) {
            return;
        }
        long id = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId();
        long[] jArr = {id};
        C29216BdM c29216BdM = new C29216BdM();
        boolean LIZ = C29216BdM.LIZ(this.LIZ, id, "saved_uid_recharge");
        if (LiveLowAgeCountrySetting.INSTANCE.getValue() && !UserWithAgeSetting.INSTANCE.getValue() && !LIZ) {
            C77437UaH c77437UaH = new C77437UaH(this.LIZ);
            c77437UaH.LIZJ = C15380j0.LJIILL(R.string.mea, Integer.valueOf(LiveRechargeAgeThresholdSetting.INSTANCE.getValue()));
            c77437UaH.LJI = C15380j0.LJIILJJIL(R.string.me8);
            c77437UaH.LJFF(new CLF(c29216BdM, this, jArr, c15960jw), C15380j0.LJIILJJIL(R.string.me9), false);
            c77437UaH.LIZLLL(new IDCListenerS159S0100000_5(this, 9), C15380j0.LJIILJJIL(R.string.me7), false);
            c77437UaH.LJJII = false;
            DialogC77438UaI LIZ2 = c77437UaH.LIZ();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "5161870970576042215")).LIZ) {
                LIZ2.show();
            }
            LIZIZ(-1);
            return;
        }
        LJ(c15960jw);
    }

    public final void LJ(C15960jw c15960jw) {
        boolean z;
        HashMap hashMap;
        String str;
        int i;
        boolean z2;
        String str2;
        String str3 = null;
        Boolean bool = null;
        if (!CanRechargeSetting.INSTANCE.getValue()) {
            if (c15960jw != null) {
                bool = Boolean.valueOf(c15960jw.LJFF);
            }
            boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
            if (c15960jw == null || (str2 = c15960jw.LIZLLL) == null) {
                str2 = "";
            }
            LJFF(str2, !LJJIFFI);
            return;
        }
        if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            Context context = this.LIZ;
            C29356Bfc c29356Bfc = new C29356Bfc();
            c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.syl);
            c29356Bfc.LIZJ = 1002;
            c29356Bfc.LJ = "live_detail";
            c29356Bfc.LJFF = "gift_send";
            c29356Bfc.LIZLLL = "enableGift";
            ((C29374Bfu) LIZIZ).LIZLLL(context, new C29377Bfx(c29356Bfc)).LIZ(this.LJ);
            return;
        }
        if (((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ(EnumC31098CIk.RECHARGE)) {
            return;
        }
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        if (c32313CmD.LJIIL()) {
            if (c15960jw != null) {
                str = c15960jw.LIZJ;
            } else {
                str = null;
            }
            if (!o.LJ("other_recharge", str)) {
                if (LiveChargePanelPositionSetting.INSTANCE.getValue()) {
                    if (c15960jw != null) {
                        i = (int) c15960jw.LIZIZ;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                Context context2 = this.LIZ;
                if (c15960jw != null) {
                    str3 = c15960jw.LIZ;
                }
                if (c15960jw != null) {
                    z2 = c15960jw.LJIIL;
                } else {
                    z2 = false;
                }
                c32313CmD.LJIILJJIL(context2, str3, z2, i, null, null);
                return;
            }
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || !(this.LIZ instanceof ActivityC45651qj) || c15960jw == null) {
            return;
        }
        Boolean bool2 = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        Context context3 = this.LIZ;
        o.LJII(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) context3;
        Bundle LIZ = C01R.LIZ("key_bundle_is_anchor", z);
        LIZ.putString("key_charge_reason", c15960jw.LIZ);
        LIZ.putLong("key_bundle_need_coins", c15960jw.LIZIZ);
        LIZ.putString("key_bundle_gift_from", c15960jw.LIZLLL);
        LIZ.putString("key_bundle_notification_type", c15960jw.LJ);
        LIZ.putString("key_bundle_previous_page", c15960jw.LIZJ);
        LIZ.putString("key_bundle_request_id", C32650Cre.LIZIZ);
        LIZ.putInt("key_bundle_charge_source", 0);
        LIZ.putString("key_bundle_gift_send_type", c15960jw.LJII);
        LIZ.putLong("key_bundle_gift_id", c15960jw.LJIIIIZZ);
        LIZ.putLong("key_bundle_total_coins", c15960jw.LJIIIZ);
        LIZ.putBoolean("key_bundle_gift_has_sent_before", c15960jw.LJIIJ);
        LIZ.putBoolean("key_bundle_is_from_gift_panel", c15960jw.LJI);
        java.util.Map<String, String> map = C32129CjF.LIZ.LJIILJJIL;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = new HashMap();
        }
        String str4 = c15960jw.LJ;
        if (str4 != null) {
            hashMap.put("notification_type", str4);
        }
        String str5 = c15960jw.LJIIJJI;
        if (str5 != null) {
            hashMap.put("trigger_keyword", str5);
        }
        C77610Ud4 c77610Ud4 = new C77610Ud4();
        ((HashMap) c77610Ud4.LIZIZ).putAll(hashMap);
        C77591Ucl LIZ2 = c77610Ud4.LIZ();
        CLH clh = new CLH(this, dataChannel, c15960jw);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("showRechargeDialog, from: ");
        LIZ3.append(c15960jw.LIZLLL);
        LIZ3.append(", trigger_keyword: ");
        LIZ3.append(c15960jw.LJIIJJI);
        LIZ3.append(", notification_type: ");
        LIZ3.append(c15960jw.LJ);
        C0NB.LIZIZ("HotWordGift", X1D.LIZIZ(LIZ3));
        ((IWalletService) CN1.LIZ(IWalletService.class)).showRechargeDialog(activityC45651qj, LIZ, dataChannel, clh, LIZ2);
    }

    public final void LJI(boolean z) {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lwq);
        C47071t1 c47071t1 = new C47071t1(this.LIZ);
        c47071t1.LJIILL = true;
        c47071t1.LJII(LJIILJJIL);
        c47071t1.LJIILLIIL(R.string.lx9);
        c47071t1.LJIIL(R.string.lxd, new CLC(z, this));
        c47071t1.LJIIIZ(R.string.lwo, CLI.LJLIL);
        LIZ(c47071t1.LIZ());
        CLG.LIZIZ("live_gift");
    }

    public final void LIZJ(int i, String str) {
        Context context = this.LIZ;
        if (context == null) {
            return;
        }
        C47071t1 c47071t1 = new C47071t1(context);
        C39471gl c39471gl = new C39471gl();
        c39471gl.LIZ = C15380j0.LJIILJJIL(R.string.noy);
        c39471gl.LIZJ = new CHB(context, str);
        C39481gm c39481gm = new C39481gm(c39471gl);
        C39491gn c39491gn = new C39491gn();
        c39491gn.LIZ = C15380j0.LJIILJJIL(R.string.nox);
        c39491gn.LIZJ = new CHC(str);
        C39501go c39501go = new C39501go(c39491gn);
        AnonymousClass175 anonymousClass175 = new AnonymousClass175();
        anonymousClass175.LIZ(c39481gm);
        anonymousClass175.LIZ(c39501go);
        anonymousClass175.LIZIZ = 1;
        AnonymousClass176 anonymousClass176 = new AnonymousClass176(anonymousClass175);
        c47071t1.LJIILLIIL(R.string.noz);
        String str2 = "frequency";
        if (o.LJ(str, "reject")) {
            c47071t1.LJFF(R.string.np0);
        } else if (o.LJ(str, "frequency")) {
            c47071t1.LJFF(R.string.np1);
        }
        c47071t1.LIZJ(anonymousClass176);
        LIZ(c47071t1.LIZ());
        HashMap LIZJ = C03660Ck.LIZJ("type", "gifting");
        if (o.LJ(str, "reject")) {
            str2 = "dark_pattern_group";
        }
        LIZJ.put("risk_control_scenario", str2);
        BZI LIZ = C28787BRn.LIZ("livesdk_hit_risk_control_popup_show");
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(LIZJ);
        LIZ.LJJIIJZLJL();
        CLG.LIZLLL(i, "gifting", null);
    }

    public final void LJFF(String str, boolean z) {
        String str2;
        String LJJJJZ;
        int i;
        String LJIILJJIL;
        int i2;
        String str3;
        if (this.LIZ == null) {
            return;
        }
        if (z) {
            str2 = "wallet_appeal";
        } else {
            str2 = "gift_appeal";
        }
        if (z) {
            String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.k6f);
            o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_ageGate_recharge_modal_desc)");
            LJJJJZ = ujb.o.LJJJJZ(LJIILJJIL2, "{0}", LowAgeAnchorLimitSetting.INSTANCE.getValue(), false);
        } else {
            String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.k5h);
            o.LJIIIIZZ(LJIILJJIL3, "getString(R.string.pm_ageGate_gift_modal_desc)");
            LJJJJZ = ujb.o.LJJJJZ(LJIILJJIL3, "{0}", LowAgeAnchorLimitSetting.INSTANCE.getValue(), false);
        }
        C47071t1 c47071t1 = new C47071t1(this.LIZ);
        if (z) {
            i = R.string.k6g;
        } else {
            i = R.string.k5i;
        }
        c47071t1.LJIILLIIL(i);
        c47071t1.LJIILL = true;
        c47071t1.LJII(LJJJJZ);
        c47071t1.LJIJ = new DialogInterfaceOnCancelListenerC28550BIk(z, str);
        if (z) {
            LJIILJJIL = C15380j0.LJIILJJIL(R.string.k6d);
        } else {
            LJIILJJIL = C15380j0.LJIILJJIL(R.string.k5f);
        }
        c47071t1.LJIILIIL(LJIILJJIL, new C28547BIh(this, str2, z, str));
        if (z) {
            i2 = R.string.k6e;
        } else {
            i2 = R.string.k5g;
        }
        c47071t1.LJIIIZ(i2, new C28549BIj(z, str));
        LIZ(c47071t1.LIZ());
        if (z) {
            str3 = "recharge";
        } else {
            str3 = "send_gift";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_wallet_limit_popup_show");
        KNV.LJ(4005189, LIZ, "error_code", str3, "entry_type");
        if (z) {
            LIZ.LJIJJ("room_recharge", "hit_entry");
        } else {
            LIZ.LJIJJ(C76828UDg.LIZ(str), "gift_enter_from");
        }
        LIZ.LJJIIJZLJL();
    }
}
