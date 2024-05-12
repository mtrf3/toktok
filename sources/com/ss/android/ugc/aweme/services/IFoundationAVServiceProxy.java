package com.ss.android.ugc.aweme.services;

import X.C69G;
import X.HF3;
import X.HF4;
import X.HF5;
import X.HF6;
import X.HF7;
import X.HQ7;
import X.InterfaceC124244uC;
import X.InterfaceC36395EQd;
import X.InterfaceC41387GMd;
import X.InterfaceC42807Gr5;
import X.InterfaceC84963Vc;
import com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager;

/* loaded from: classes8.dex */
public interface IFoundationAVServiceProxy {
    HF3 getABService();

    IAVAppContextManager getAVAppContextManager();

    HQ7 getAccountService();

    InterfaceC124244uC getApplicationService();

    HF4 getBridgeService();

    InterfaceC41387GMd getChallengeService();

    HF5 getCommerceService();

    HF6 getIStickerPropService();

    InterfaceC42807Gr5 getLocalHashTagService();

    InterfaceC36395EQd getNetworkService();

    InterfaceC84963Vc getRegionService();

    C69G getUiService();

    HF7 unlockStickerService();
}
