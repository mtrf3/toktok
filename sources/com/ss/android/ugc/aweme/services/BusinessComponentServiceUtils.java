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
public class BusinessComponentServiceUtils {
    public static volatile IBusinessComponentService sBusinessComponentService;

    public static IBusinessComponentService getBusinessComponentService() {
        if (sBusinessComponentService == null) {
            sBusinessComponentService = BusinessComponentServiceImpl.createIBusinessComponentServicebyMonsterPlugin(false);
        }
        return sBusinessComponentService;
    }

    public static C2K2 getAppStateReporter() {
        return getBusinessComponentService().getAppStateReporter();
    }

    public static InterfaceC174346so getBusinessBridgeService() {
        return getBusinessComponentService().getBusinessBridgeService();
    }

    public static InterfaceC54844Lfk getDetailPageOperatorProvider() {
        return getBusinessComponentService().getDetailPageOperatorProvider();
    }

    public static InterfaceC39577Fg5 getLiveAllService() {
        return getBusinessComponentService().getLiveAllService();
    }

    public static InterfaceC220958ln getLiveStateManager() {
        return getBusinessComponentService().getLiveStateManager();
    }

    public static InterfaceC54922Lh0 getMainHelperService() {
        return getBusinessComponentService().getMainHelperService();
    }

    public static Class<? extends CommonPageFragment> getProfilePageClass() {
        return getBusinessComponentService().getProfilePageClass();
    }

    public static InterfaceC55336Lng newScrollSwitchHelper(Context context, C54206LPe c54206LPe, C54297LSr c54297LSr) {
        return getBusinessComponentService().newScrollSwitchHelper(context, c54206LPe, c54297LSr);
    }

    public static Dialog newOptionsDialog(Fragment fragment, Context context, Aweme aweme, String str) {
        return getBusinessComponentService().newOptionsDialog(fragment, context, aweme, str);
    }
}
