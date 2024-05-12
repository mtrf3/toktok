package com.bytedance.android.live.wallet;

import X.A6G;
import X.A8I;
import X.AbstractC37594EpC;
import X.ActivityC45651qj;
import X.C38049EwX;
import X.C77591Ucl;
import X.InterfaceC06390Mx;
import X.InterfaceC31557Ca1;
import X.InterfaceC32295Clv;
import X.InterfaceC38012Evw;
import X.InterfaceC77468Uam;
import X.InterfaceC77660Uds;
import X.InterfaceC77674Ue6;
import X.InterfaceC77682UeE;
import X.InterfaceC77701UeX;
import X.InterfaceC77746UfG;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public interface IWalletService extends InterfaceC06390Mx {
    DialogFragment createRechargeDialogFragment(ActivityC45651qj activityC45651qj, InterfaceC77682UeE interfaceC77682UeE, Bundle bundle, C77591Ucl c77591Ucl);

    int doExchangeBeforeRecharge(ActivityC45651qj activityC45651qj, DialogFragment dialogFragment, Bundle bundle, InterfaceC77468Uam interfaceC77468Uam);

    InterfaceC32295Clv getFirstRechargePayManager();

    A8I getIapViewModel(A6G a6g);

    InterfaceC77701UeX getKYCService();

    Map<String, InterfaceC38012Evw> getLiveWalletJSB(WeakReference<Context> weakReference, C38049EwX c38049EwX);

    InterfaceC38012Evw getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, C38049EwX c38049EwX);

    InterfaceC31557Ca1 getPayManager();

    InterfaceC77674Ue6 getPayManagerV2();

    InterfaceC77660Uds getRechargeService();

    InterfaceC77746UfG getWalletMonitorService();

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void preloadApApi();

    List<Class<? extends AbstractC37594EpC<?, ?>>> provideJsbForHost();

    DialogFragment showRechargeDialog(ActivityC45651qj activityC45651qj, Bundle bundle, DataChannel dataChannel, DialogInterface.OnDismissListener onDismissListener, C77591Ucl c77591Ucl);

    IWalletCenter walletCenter();

    IWalletException walletException();

    IWalletExchange walletExchange();
}
