package com.ss.android.ugc.aweme.services;

import X.C2K2;
import X.C54206LPe;
import X.C54297LSr;
import X.InterfaceC174346so;
import X.InterfaceC220958ln;
import X.InterfaceC39577Fg5;
import X.InterfaceC54844Lfk;
import X.InterfaceC54922Lh0;
import X.InterfaceC55336Lng;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes10.dex */
public interface IBusinessComponentService {
    C2K2 getAppStateReporter();

    InterfaceC174346so getBusinessBridgeService();

    InterfaceC54844Lfk getDetailPageOperatorProvider();

    InterfaceC39577Fg5 getLiveAllService();

    InterfaceC220958ln getLiveStateManager();

    InterfaceC54922Lh0 getMainHelperService();

    Class<? extends CommonPageFragment> getProfilePageClass();

    Dialog newOptionsDialog(Fragment fragment, Context context, Aweme aweme, String str);

    InterfaceC55336Lng newScrollSwitchHelper(Context context, C54206LPe c54206LPe, C54297LSr c54297LSr);
}
