package com.ss.android.ugc.aweme.net.ui;

import X.C73305Spp;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC84463Te;
import X.MG5;
import android.app.Activity;

/* loaded from: classes10.dex */
public interface INetworkStandardUIService {
    InterfaceC84463Te getNetworkStateForSharePanel();

    boolean isStandardUIEnable();

    void registerForNetworkChangeToasts();

    void removeLazyToast(MG5 mg5);

    void resetTipsBarrier(C73305Spp c73305Spp);

    void setStatusView(C73305Spp c73305Spp, MG5 mg5, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Exception exc);

    void setStatusView(C73305Spp c73305Spp, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Exception exc);

    void showNetworkToast(Activity activity, InterfaceC84463Te interfaceC84463Te, String str);

    void startLazyToast(MG5 mg5, Activity activity);

    void triggerNetworkTips(Activity activity, MG5 mg5, Exception exc, C73305Spp c73305Spp);

    void triggerNetworkTips(Activity activity, String str, Exception exc, C73305Spp c73305Spp);
}
