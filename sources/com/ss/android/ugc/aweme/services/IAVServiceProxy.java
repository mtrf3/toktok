package com.ss.android.ugc.aweme.services;

import X.C5UD;
import X.G6I;
import X.G8N;
import X.G9S;
import X.GVF;
import X.HEO;
import X.HF0;
import X.HF1;
import X.HF3;
import X.HF4;
import X.HF5;
import X.HH0;
import X.InterfaceC124244uC;
import X.InterfaceC147495qb;
import X.InterfaceC147965rM;
import X.InterfaceC156736Dd;
import X.InterfaceC41322GJq;
import X.InterfaceC41536GRw;
import X.InterfaceC41618GVa;
import X.InterfaceC42801Gqz;
import X.InterfaceC43725HEb;
import X.InterfaceC43726HEc;
import X.InterfaceC43749HEz;
import X.InterfaceC84963Vc;
import X.WUF;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.port.in.ISchedulerService;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;

/* loaded from: classes8.dex */
public interface IAVServiceProxy extends IFoundationAVServiceProxy {
    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    HF1 getABService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    /* bridge */ /* synthetic */ HF3 getABService();

    InterfaceC41618GVa getAVConverter();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    /* bridge */ /* synthetic */ InterfaceC124244uC getApplicationService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    C5UD getApplicationService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    InterfaceC43749HEz getBridgeService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    /* bridge */ /* synthetic */ HF4 getBridgeService();

    InterfaceC41322GJq getBusinessGoodsService();

    G9S getCaptionMentionService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    HF0 getCommerceService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    /* bridge */ /* synthetic */ HF5 getCommerceService();

    InterfaceC42801Gqz getDmtChallengeService();

    IHashTagService getHashTagService();

    WUF getLiveService();

    HEO getMiniAppService();

    IMusicService getMusicService();

    InterfaceC41536GRw getPublishPreviewService();

    GVF getPublishService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    /* bridge */ /* synthetic */ InterfaceC84963Vc getRegionService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    InterfaceC43725HEb getRegionService();

    ISchedulerService getSchedulerService();

    G8N getShareService();

    InterfaceC147965rM getSpService();

    InterfaceC43726HEc getStickerShareService();

    InterfaceC147495qb getStoryService();

    G6I getSyncShareService();

    HH0 getVideoCacheService();

    InterfaceC156736Dd getWikiService();

    ISuperEntrancePrivacyService superEntrancePrivacyService();
}
