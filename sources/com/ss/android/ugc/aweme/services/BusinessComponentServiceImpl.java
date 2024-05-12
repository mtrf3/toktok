package com.ss.android.ugc.aweme.services;

import X.ATU;
import X.C2K2;
import X.C54206LPe;
import X.C54297LSr;
import X.C54840Lfg;
import X.C58096Mr6;
import X.C72083SQt;
import X.C77119UOl;
import X.InterfaceC174346so;
import X.InterfaceC220958ln;
import X.InterfaceC39577Fg5;
import X.InterfaceC54844Lfk;
import X.InterfaceC54922Lh0;
import X.InterfaceC55336Lng;
import X.LPJ;
import X.M59;
import X.Z8A;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* loaded from: classes10.dex */
public class BusinessComponentServiceImpl implements IBusinessComponentService {
    public InterfaceC174346so businessBridgeService;
    public InterfaceC54844Lfk detailPageOperatorProvider;

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public InterfaceC174346so getBusinessBridgeService() {
        if (this.businessBridgeService == null) {
            this.businessBridgeService = new C77119UOl();
        }
        return this.businessBridgeService;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public InterfaceC54844Lfk getDetailPageOperatorProvider() {
        if (this.detailPageOperatorProvider == null) {
            this.detailPageOperatorProvider = new C54840Lfg();
        }
        return this.detailPageOperatorProvider;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public InterfaceC54922Lh0 getMainHelperService() {
        return new C72083SQt();
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public Class<? extends CommonPageFragment> getProfilePageClass() {
        return Z8A.LIZIZ.getProfilePageFragmentClass();
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public C2K2 getAppStateReporter() {
        return M59.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public InterfaceC39577Fg5 getLiveAllService() {
        return LiveOuterService.LJJJLL().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public InterfaceC220958ln getLiveStateManager() {
        return LiveOuterService.LJJJLL().LJJIZ().getLiveStateManager();
    }

    public static IBusinessComponentService createIBusinessComponentServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IBusinessComponentService.class, z);
        if (LIZ != null) {
            return (IBusinessComponentService) LIZ;
        }
        if (C58096Mr6.C5 == null) {
            synchronized (IBusinessComponentService.class) {
                if (C58096Mr6.C5 == null) {
                    C58096Mr6.C5 = new BusinessComponentServiceImpl();
                }
            }
        }
        return C58096Mr6.C5;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public InterfaceC55336Lng newScrollSwitchHelper(Context context, C54206LPe c54206LPe, C54297LSr c54297LSr) {
        return new LPJ(context, c54206LPe, c54297LSr);
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public Dialog newOptionsDialog(Fragment fragment, Context context, Aweme aweme, String str) {
        return ATU.LIZ(fragment, context, aweme, str);
    }
}
