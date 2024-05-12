package com.ss.android.ugc.aweme.im.service;

import X.A7X;
import X.AUS;
import X.AbstractC53585L1h;
import X.C100623xC;
import X.C32U;
import X.C3B2;
import X.C3GF;
import X.C4C7;
import X.C4CG;
import X.C4CJ;
import X.C4HU;
import X.C4HV;
import X.C4HW;
import X.C4HX;
import X.C4HY;
import X.C4I7;
import X.C4K8;
import X.C4R6;
import X.C8SE;
import X.InterfaceC100183wU;
import X.InterfaceC100803xU;
import X.InterfaceC101213y9;
import X.InterfaceC102253zp;
import X.InterfaceC106314Ff;
import X.InterfaceC107424Jm;
import X.InterfaceC109344Qw;
import X.InterfaceC109664Sc;
import X.InterfaceC111984aQ;
import X.InterfaceC112624bS;
import X.InterfaceC112734bd;
import X.InterfaceC116174hB;
import X.InterfaceC116514hj;
import X.InterfaceC221448ma;
import X.InterfaceC221688my;
import X.InterfaceC38673FFt;
import X.InterfaceC40381Ft3;
import X.InterfaceC45541Hu5;
import X.InterfaceC55617LsD;
import X.InterfaceC55770Lug;
import X.InterfaceC56268M6m;
import X.InterfaceC57106Mb8;
import X.InterfaceC59802Wi;
import X.InterfaceC71996SNk;
import X.InterfaceC83383Pa;
import X.InterfaceC84043Ro;
import X.InterfaceC86093Zl;
import X.InterfaceC88043cu;
import X.InterfaceC98123tA;
import X.InterfaceC98813uH;
import X.L4O;
import X.LV9;
import android.app.Application;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;

/* loaded from: classes2.dex */
public interface IIMService {
    InterfaceC100183wU getActivityStatusAccuracyAnalysis();

    InterfaceC107424Jm getActivityStatusAnalytics();

    C3B2 getActivityStatusViewModel();

    InterfaceC55770Lug getAutoMessageTooltipHelper();

    AbstractC53585L1h<L4O, AUS> getAvatarActiveAdapter();

    InterfaceC45541Hu5 getCameraService();

    InterfaceC84043Ro getFamiliarService();

    LV9 getGroupChatService();

    InterfaceC38673FFt getHeavyJobControlService();

    C4HW getIMErrorMonitor();

    InterfaceC98813uH getImChatService();

    InterfaceC116514hj getImChatSettingsService();

    C4CJ getImDrawableService();

    C4HV getImEnsureService();

    C4HX getImFilterKeywordsService();

    C4CG getImFrescoService();

    InterfaceC71996SNk getImIIMNudeFilterService();

    InterfaceC59802Wi getImImageService();

    InterfaceC40381Ft3 getImInitializeService();

    InterfaceC86093Zl getImMafService();

    C4C7 getImNaviAnalytics();

    InterfaceC55617LsD getImNotificationService();

    InterfaceC112734bd getImNudgeAnalytics();

    InterfaceC112624bS getImNudgeService();

    InterfaceC56268M6m getImParser();

    InterfaceC57106Mb8 getImSayHiService();

    InterfaceC221688my getImSayhiAnalytics();

    C4R6 getImShareAnalytics();

    InterfaceC88043cu getImStickerStoreService();

    C8SE getImTakoService();

    C3GF getImUserService();

    InterfaceC102253zp getImVideoService();

    InterfaceC100803xU getImXBridgeProviderService();

    InterfaceC109664Sc getInboxAdapterService();

    C4HU getInboxAnalytics();

    IImInboxDmService getInboxDmService();

    C4HY getInboxTabChangeManager();

    long getInitTimestamp();

    A7X getLandAutoMsgToChatHelper();

    C4K8 getMessagingGeckoUtils();

    InterfaceC116174hB getMufActivityStatusModel();

    InterfaceC106314Ff getPerformanceService();

    C4I7 getProfileViewerAnalytics();

    InterfaceC221448ma getQuickReplyAnalytics();

    InterfaceC98123tA getRelationService();

    InterfaceC111984aQ getSearchService();

    InterfaceC101213y9 getSendMessageTemplateService();

    InterfaceC109344Qw getShareService();

    C32U getStickerStoreAnalytics();

    void initActivityStatusMsgReceiveOptimization();

    void initialize(Application application, C100623xC c100623xC, InterfaceC83383Pa interfaceC83383Pa);

    void setHighlightText(TextView textView, String str, String str2);
}
