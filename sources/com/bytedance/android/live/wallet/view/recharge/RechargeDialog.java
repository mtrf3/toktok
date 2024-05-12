package com.bytedance.android.live.wallet.view.recharge;

import X.ActivityC45651qj;
import X.BHA;
import X.BZI;
import X.C11090c5;
import X.C15380j0;
import X.C15430j5;
import X.C1B3;
import X.C221108m2;
import X.C28507BGt;
import X.C28787BRn;
import X.C2S8;
import X.C30725C4b;
import X.C5H3;
import X.C62822Ol8;
import X.C67702lC;
import X.C77591Ucl;
import X.C77608Ud2;
import X.C77626UdK;
import X.C77629UdN;
import X.C77649Udh;
import X.C77702UeY;
import X.C77703UeZ;
import X.C77704Uea;
import X.C77705Ueb;
import X.C77706Uec;
import X.C77707Ued;
import X.C77739Uf9;
import X.C77744UfE;
import X.C78996UzQ;
import X.CBO;
import X.CCJ;
import X.CN1;
import X.EnumC77742UfC;
import X.InterfaceC11080c4;
import X.InterfaceC11100c6;
import X.InterfaceC28236B6i;
import X.InterfaceC77611Ud5;
import X.InterfaceC77660Uds;
import X.InterfaceC77675Ue7;
import X.InterfaceC77682UeE;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.ReChargeDialogOnShow;
import com.bytedance.android.live.wallet.view.recharge.singlerecharge.SingleRechargeFragment;
import com.bytedance.android.live.wallet.viewmodel.recharge.RechargeDialogVM;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWalletRechargeRebuildOpt;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RechargeDialog extends LiveDialogFragment implements InterfaceC77611Ud5, InterfaceC28236B6i {
    public InterfaceC77682UeE LJLIL;
    public DataChannel LJLJI;
    public RechargeDialogNew LJLJJI;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public C77591Ucl LJLILLLLZI = new C77591Ucl();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(CBO.LJLIL);
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 181));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC77611Ud5
    public final LifecycleOwner getLifeCycleOwner() {
        return this;
    }

    @Override // X.InterfaceC77611Ud5
    public final void Ch() {
        SingleRechargeFragment singleRechargeFragment = new SingleRechargeFragment();
        singleRechargeFragment.LJLILLLLZI = this;
        C77591Ucl q4 = q4();
        o.LJIIIZ(q4, "<set-?>");
        singleRechargeFragment.LJLJI = q4;
        wl(singleRechargeFragment);
    }

    @Override // X.InterfaceC28236B6i
    public final DataChannel provideDataChannel() {
        return BHA.LIZ(new ViewModelProvider(this), this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        boolean z;
        int i;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        boolean z2 = this.LJLILLLLZI.LJIIIIZZ;
        int i2 = 0;
        if (mo49getActivity == null || mo49getActivity.getResources().getConfiguration().orientation == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = true ^ z;
        C28507BGt c28507BGt = new C28507BGt(R.layout.d0a);
        c28507BGt.LIZLLL = !z3;
        if (z2) {
            c28507BGt.LJII = 17;
            c28507BGt.LJIIIZ = C15380j0.LIZ(540.0f);
            if (mo49getActivity != null) {
                c28507BGt.LJIIJ = C15380j0.LJIIIZ(mo49getActivity);
            }
        } else if (z3) {
            c28507BGt.LIZJ = R.style.aal;
            if (CCJ.LIZ(mo49getActivity)) {
                i = 8388611;
            } else {
                i = 8388613;
            }
            c28507BGt.LJII = i;
            int LIZ = C15380j0.LIZ(375.0f);
            Resources resources = mo49getActivity.getResources();
            int identifier = resources.getIdentifier("config_navBarInteractionMode", "integer", "android");
            if (identifier <= 0 || resources.getInteger(identifier) != 2) {
                i2 = C15430j5.LIZ(mo49getActivity);
            }
            c28507BGt.LJIIIZ = LIZ + i2;
            c28507BGt.LJIIJ = C15380j0.LJIIIZ(mo49getActivity);
        } else {
            c28507BGt.LJII = 80;
            c28507BGt.LJIIIZ = -1;
            c28507BGt.LJIIJ = -2;
        }
        return c28507BGt;
    }

    @Override // X.InterfaceC77611Ud5
    public final void d7() {
        mo49getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            InterfaceC77682UeE interfaceC77682UeE = this.LJLIL;
            C77591Ucl rechargeDialogConfig = this.LJLILLLLZI;
            DataChannel dataChannel = this.LJLJI;
            o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
            RechargeDialogNew rechargeDialogNew = new RechargeDialogNew();
            rechargeDialogNew.setArguments(arguments);
            rechargeDialogNew.LJLJI = interfaceC77682UeE;
            rechargeDialogNew.LJLJJI = rechargeDialogConfig;
            rechargeDialogNew.LJLJJL = dataChannel;
            rechargeDialogNew.LJLJJLL = this;
            wl(rechargeDialogNew);
            this.LJLJJI = rechargeDialogNew;
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DataChannel dataChannel;
        super.onDestroyView();
        if (((Number) this.LJLJJL.getValue()).intValue() > 0 && (dataChannel = this.LJLJI) != null) {
            dataChannel.rv0(ReChargeDialogOnShow.class, Boolean.FALSE);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC77611Ud5
    public final InterfaceC77682UeE Fk() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC77611Ud5
    public final DataChannel Tk() {
        return this.dataChannel;
    }

    @Override // X.InterfaceC77611Ud5
    public final DataChannel Zj() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC77611Ud5
    public final C77591Ucl q4() {
        return this.LJLILLLLZI;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        DataChannel dataChannel;
        if (LiveWalletRechargeRebuildOpt.INSTANCE.getValue() && bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        if (((Number) this.LJLJJL.getValue()).intValue() > 0 && (dataChannel = this.LJLJI) != null) {
            dataChannel.rv0(ReChargeDialogOnShow.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        RechargeDialogNew rechargeDialogNew = this.LJLJJI;
        if (rechargeDialogNew != null) {
            rechargeDialogNew.Al(true);
        }
        this.LJLJJI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final void wl(BaseRechargeFragment baseRechargeFragment) {
        C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_wallet_recharge_panel_pop_up", null, 60);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJIIJ(baseRechargeFragment, null, R.id.dm7);
        c1b3.LJII();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        InterfaceC11080c4 c77702UeY;
        DiamondPackageExtra diamondPackageExtra;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RechargeDialogVM rechargeDialogVM = (RechargeDialogVM) this.LJLJJLL.getValue();
        InterfaceC77660Uds interfaceC77660Uds = rechargeDialogVM.LJLJJI;
        int LIZ = C67702lC.LIZ(rechargeDialogVM.LJLIL.LIZLLL);
        ((Number) rechargeDialogVM.LJLJJL.getValue()).longValue();
        ((Number) rechargeDialogVM.LJLJJLL.getValue()).longValue();
        C77626UdK LIZ2 = interfaceC77660Uds.LIZ(LIZ);
        if (LIZ2 != null && (diamondPackageExtra = LIZ2.LJLILLLLZI) != null) {
            str = diamondPackageExtra.getInsufficientBalanceAbGroupId();
        } else {
            str = null;
        }
        C77591Ucl rechargeDialogConfig = rechargeDialogVM.LJLIL;
        o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
        if (rechargeDialogConfig.LIZLLL != 0 || !rechargeDialogConfig.LJIIIZ || o.LJ(rechargeDialogConfig.LIZJ, "first_recharge")) {
            c77702UeY = new C77702UeY();
        } else {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1012222381:
                        if (str.equals(LiveWalletRechargeExchangeStrengthen.DEFAULT)) {
                            c77702UeY = new C77702UeY();
                            break;
                        }
                        break;
                    case 252122678:
                        if (str.equals("no_replace")) {
                            c77702UeY = new C77703UeZ();
                            break;
                        }
                        break;
                    case 727321838:
                        if (str.equals("icon_replace")) {
                            c77702UeY = new C77706Uec();
                            break;
                        }
                        break;
                    case 963349164:
                        if (str.equals("no_icon_replace")) {
                            c77702UeY = new C77707Ued();
                            break;
                        }
                        break;
                    case 1112120077:
                        if (str.equals("replace_ascending")) {
                            c77702UeY = new C77704Uea();
                            break;
                        }
                        break;
                    case 1396445541:
                        if (str.equals("replace_first")) {
                            c77702UeY = new C77705Ueb();
                            break;
                        }
                        break;
                }
            }
            c77702UeY = new C77702UeY();
        }
        InterfaceC11100c6.LIZ.getClass();
        C11090c5.LIZ().LIZJ(InterfaceC77675Ue7.class, c77702UeY);
        if (C77649Udh.LIZ().LIZJ()) {
            InterfaceC77611Ud5 interfaceC77611Ud5 = rechargeDialogVM.LJLILLLLZI;
            if (interfaceC77611Ud5 != null) {
                interfaceC77611Ud5.Ch();
                return;
            }
            return;
        }
        InterfaceC77611Ud5 interfaceC77611Ud52 = rechargeDialogVM.LJLILLLLZI;
        if (interfaceC77611Ud52 == null) {
            return;
        }
        interfaceC77611Ud52.d7();
    }

    public static final RechargeDialog vl(Activity activity, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, InterfaceC77682UeE interfaceC77682UeE, C77591Ucl rechargeDialogConfig, DataChannel dataChannel) {
        boolean z;
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
        RechargeDialog rechargeDialog = new RechargeDialog();
        rechargeDialog.setArguments(bundle);
        rechargeDialog.setOnDismissListener(onDismissListener);
        rechargeDialog.LJLIL = interfaceC77682UeE;
        rechargeDialogConfig.LJ = bundle.getLong("key_bundle_gift_id");
        String string = bundle.getString("key_charge_reason");
        String str2 = "";
        if (string == null) {
            string = "";
        }
        rechargeDialogConfig.LIZJ = string;
        bundle.getString("key_bundle_notification_type");
        rechargeDialogConfig.LIZLLL = bundle.getInt("key_bundle_charge_source");
        String roomStatus = ((IGiftService) CN1.LIZ(IGiftService.class)).getRoomStatus();
        if (roomStatus == null) {
            roomStatus = "";
        }
        rechargeDialogConfig.LJI = roomStatus;
        long j = bundle.getLong("key_bundle_total_coins");
        rechargeDialogConfig.LJII = j;
        long j2 = bundle.getLong("key_bundle_need_coins");
        long LIZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        if (j2 == 0 && j > 0) {
            j2 = j - LIZ;
        }
        rechargeDialogConfig.LJFF = j2;
        rechargeDialogConfig.LJIIIIZZ = bundle.getBoolean("key_bundle_is_central_mode");
        if (rechargeDialogConfig.LJFF > 0) {
            z = true;
        } else {
            z = false;
        }
        rechargeDialogConfig.LJIIIZ = z;
        rechargeDialogConfig.LJIIJ = bundle.getBoolean("key_bundle_is_from_gift_panel");
        int i = rechargeDialogConfig.LIZLLL;
        String string2 = bundle.getString("request_page");
        if (string2 == null) {
            string2 = (String) ((LinkedHashMap) C2S8.LIZ).get(Integer.valueOf(i));
            if (string2 == null) {
                string2 = "live_detail";
            }
        }
        rechargeDialogConfig.LJIIJJI = string2;
        String string3 = bundle.getString("key_bundle_previous_page");
        if (string3 == null) {
            string3 = "normal";
        }
        rechargeDialogConfig.LJIIL = string3;
        String string4 = bundle.getString("key_bundle_gift_from", "");
        if (string4 == null) {
            string4 = "";
        }
        rechargeDialogConfig.LJIILIIL = string4;
        String string5 = bundle.getString("key_bundle_request_id", "");
        if (string5 == null) {
            string5 = "";
        }
        rechargeDialogConfig.LJIILJJIL = string5;
        String string6 = bundle.getString("key_bundle_gift_send_type", "");
        if (string6 != null) {
            str2 = string6;
        }
        rechargeDialogConfig.LJIILL = str2;
        rechargeDialogConfig.LJIILLIIL = bundle.getInt("key_bundle_show_balance");
        rechargeDialogConfig.LJIIZILJ = bundle.getInt("key_bundle_can_exchange");
        if (bundle.getBoolean("key_bundle_gift_has_sent_before")) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        rechargeDialogConfig.LJIJ = str;
        rechargeDialog.LJLJI = dataChannel;
        rechargeDialog.LJLILLLLZI = rechargeDialogConfig;
        C77629UdN.LIZ();
        C77629UdN.LIZ = true;
        C77629UdN.LIZIZ = C30725C4b.LIZ();
        String str3 = rechargeDialogConfig.LIZJ;
        o.LJIIIZ(str3, "<set-?>");
        C77629UdN.LJI = str3;
        String str4 = rechargeDialogConfig.LJIIJJI;
        o.LJIIIZ(str4, "<set-?>");
        C77629UdN.LJIIIIZZ = str4;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_panel_start_loading");
        LIZ2.LJIJJ(C77608Ud2.LIZ(), "pay_method");
        LIZ2.LJIJJ(C77629UdN.LJIIIIZZ, "request_page");
        LIZ2.LJJIIJZLJL();
        return rechargeDialog;
    }
}
