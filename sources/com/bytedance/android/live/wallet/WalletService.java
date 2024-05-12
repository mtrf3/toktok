package com.bytedance.android.live.wallet;

import X.A6G;
import X.A8I;
import X.AbstractC37594EpC;
import X.ActivityC45651qj;
import X.C0NB;
import X.C11090c5;
import X.C29494Bhq;
import X.C31624Cb6;
import X.C31833CeT;
import X.C32355Cmt;
import X.C38049EwX;
import X.C77453UaX;
import X.C77481Uaz;
import X.C77577UcX;
import X.C77583Ucd;
import X.C77591Ucl;
import X.C77593Ucn;
import X.C77607Ud1;
import X.C77678UeA;
import X.C77700UeW;
import X.C77726Uew;
import X.C77731Uf1;
import X.C77739Uf9;
import X.InterfaceC11100c6;
import X.InterfaceC31557Ca1;
import X.InterfaceC32295Clv;
import X.InterfaceC38012Evw;
import X.InterfaceC77468Uam;
import X.InterfaceC77573UcT;
import X.InterfaceC77660Uds;
import X.InterfaceC77674Ue6;
import X.InterfaceC77682UeE;
import X.InterfaceC77701UeX;
import X.InterfaceC77746UfG;
import X.Q7L;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.wallet.common.IapViewModelImpl;
import com.bytedance.android.live.wallet.data.api.IWalletApi;
import com.bytedance.android.live.wallet.view.recharge.RechargeDialog;
import com.bytedance.android.live.walletnew.jsb.ChargeMethodNew;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEnableNewExchangeScenerio;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public class WalletService implements IWalletService {
    @Override // com.bytedance.android.live.wallet.IWalletService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C77700UeW.LIZ(this);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> provideJsbForHost() {
        List<Class<? extends AbstractC37594EpC<?, ?>>> asList = Arrays.asList(C31833CeT.class, C31624Cb6.class);
        C0NB.LIZIZ("iap_test_jsb", "provideJsbForHost");
        return asList;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC32295Clv getFirstRechargePayManager() {
        return new C77583Ucd();
    }

    static {
        if (!LiveServiceManagerOptSetting.enable()) {
            InterfaceC11100c6.LIZ.getClass();
            C11090c5.LIZ().LIZJ(InterfaceC77573UcT.class, new C77726Uew());
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC77674Ue6 getPayManagerV2() {
        return C77607Ud1.LIZIZ();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC77660Uds getRechargeService() {
        return C77607Ud1.LIZJ();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void preloadApApi() {
        if (LiveServiceManagerOptSetting.enable()) {
            InterfaceC11100c6.LIZ.getClass();
            C11090c5.LIZ().LIZJ(InterfaceC77573UcT.class, new C77726Uew());
        }
        IWalletApi iWalletApi = (IWalletApi) Q7L.LIZIZ(IWalletApi.class);
        iWalletApi.getWalletInfoNew();
        iWalletApi.getBalanceInfo(1);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC77701UeX getKYCService() {
        return C77678UeA.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC31557Ca1 getPayManager() {
        return C77731Uf1.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC77746UfG getWalletMonitorService() {
        return C77739Uf9.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final IWalletCenter walletCenter() {
        return C32355Cmt.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final IWalletException walletException() {
        return WalletException.LJLIL;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final IWalletExchange walletExchange() {
        return WalletExchange.LJLIL;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final A8I getIapViewModel(A6G a6g) {
        return new IapViewModelImpl(a6g);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final Map<String, InterfaceC38012Evw> getLiveWalletJSB(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        HashMap hashMap = new HashMap();
        hashMap.put("getPurchaseItemList", new C77577UcX(weakReference.get(), c38049EwX));
        hashMap.put("charge", new ChargeMethodNew(weakReference.get(), c38049EwX));
        hashMap.put("openGBLOCRpage", new C77593Ucn(weakReference.get(), c38049EwX));
        return hashMap;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC38012Evw getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        str.getClass();
        switch (str.hashCode()) {
            case -1361632588:
                if (!str.equals("charge")) {
                    return null;
                }
                return new ChargeMethodNew(weakReference.get(), c38049EwX);
            case -422738330:
                if (!str.equals("openGBLOCRpage")) {
                    return null;
                }
                return new C77593Ucn(weakReference.get(), c38049EwX);
            case 1261903336:
                if (!str.equals("getPurchaseItemList")) {
                    return null;
                }
                return new C77577UcX(weakReference.get(), c38049EwX);
            default:
                return null;
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final DialogFragment createRechargeDialogFragment(ActivityC45651qj activityC45651qj, InterfaceC77682UeE interfaceC77682UeE, Bundle bundle, C77591Ucl c77591Ucl) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        String str = c77591Ucl.LIZIZ.get("key_bundle_charge_source");
        if ((str != null || (str = String.valueOf(bundle2.getInt("key_bundle_charge_source"))) != null) && !str.equals(String.valueOf(5))) {
            C77481Uaz.LIZ(bundle2);
        }
        return RechargeDialog.vl(activityC45651qj, bundle2, null, interfaceC77682UeE, c77591Ucl, null);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final int doExchangeBeforeRecharge(ActivityC45651qj activityC45651qj, DialogFragment dialogFragment, Bundle bundle, InterfaceC77468Uam interfaceC77468Uam) {
        String string = bundle.getString("key_charge_reason");
        if (!LiveEnableNewExchangeScenerio.INSTANCE.getValue()) {
            return 0;
        }
        if (!string.equals("redpacket_new") && !string.equals("portal")) {
            return 0;
        }
        C77453UaX c77453UaX = new C77453UaX(Long.valueOf(bundle.getLong("key_bundle_total_coins")).intValue(), 0L, null, bundle.getString("key_charge_reason"));
        if (C77481Uaz.LIZLLL(activityC45651qj, c77453UaX, interfaceC77468Uam)) {
            return 2;
        }
        if (!C77481Uaz.LJ(activityC45651qj, c77453UaX, interfaceC77468Uam)) {
            return 0;
        }
        return 1;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final DialogFragment showRechargeDialog(ActivityC45651qj activityC45651qj, Bundle bundle, DataChannel dataChannel, DialogInterface.OnDismissListener onDismissListener, C77591Ucl c77591Ucl) {
        if (HideChargeIconForUserSetting.INSTANCE.getValue() || !CanRechargeSetting.INSTANCE.getValue()) {
            return null;
        }
        FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        int i = 1;
        if (!bundle.containsKey("key_bundle_banner_url") || TextUtils.isEmpty(bundle.getString("key_bundle_banner_url"))) {
            i = 1 ^ (TextUtils.isEmpty(null) ? 1 : 0);
            bundle.putString("key_bundle_banner_url", null);
        }
        bundle.putInt("key_bundle_charge_type", i);
        C77481Uaz.LIZ(bundle);
        RechargeDialog vl = RechargeDialog.vl(activityC45651qj, bundle, onDismissListener, null, c77591Ucl, dataChannel);
        if (fragmentManager == null || fragmentManager.LJJJIL("RechargeDialog") != null) {
            return null;
        }
        vl.show(fragmentManager, "RechargeDialog");
        return vl;
    }
}
