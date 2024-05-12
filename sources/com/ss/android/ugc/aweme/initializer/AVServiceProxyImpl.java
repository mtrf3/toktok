package com.ss.android.ugc.aweme.initializer;

import X.C30597Bzd;
import X.C40959G5r;
import X.C42901Gsb;
import X.C43119Gw7;
import X.C44296Ha0;
import X.C45039Hlz;
import X.C47956Irw;
import X.C4LD;
import X.C51569KLt;
import X.C58096Mr6;
import X.C5UD;
import X.C69G;
import X.C77412UZs;
import X.C77413UZt;
import X.C78605Ut7;
import X.C86670Xzu;
import X.FGR;
import X.G6I;
import X.G8N;
import X.G9S;
import X.GS1;
import X.GVF;
import X.HBO;
import X.HE2;
import X.HEO;
import X.HF0;
import X.HF1;
import X.HF6;
import X.HF7;
import X.HH0;
import X.HH1;
import X.HH2;
import X.HH3;
import X.HH4;
import X.HH5;
import X.HH6;
import X.HH7;
import X.HH8;
import X.HH9;
import X.HHA;
import X.HHB;
import X.HQ7;
import X.InterfaceC147495qb;
import X.InterfaceC147965rM;
import X.InterfaceC156736Dd;
import X.InterfaceC36395EQd;
import X.InterfaceC41322GJq;
import X.InterfaceC41387GMd;
import X.InterfaceC41536GRw;
import X.InterfaceC41618GVa;
import X.InterfaceC42801Gqz;
import X.InterfaceC42807Gr5;
import X.InterfaceC43725HEb;
import X.InterfaceC43726HEc;
import X.InterfaceC43749HEz;
import X.MEX;
import X.R3X;
import X.V52;
import X.WUF;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.port.in.ISchedulerService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IToolsMentionVideoService;
import com.ss.android.ugc.aweme.services.MusicService;
import com.ss.android.ugc.aweme.services.NetworkServiceImpl;
import com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;
import com.ss.android.ugc.aweme.shortvideo.AVAweme;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public class AVServiceProxyImpl implements IAVServiceProxy {
    public IToolsMentionVideoService MentionVideoService;
    public HF1 abTestService;
    public HQ7 accountService;
    public C5UD applicationService;
    public InterfaceC41618GVa avConverter;
    public InterfaceC43749HEz bridgeService;
    public InterfaceC41322GJq businessGoodsService;
    public G9S captionMentionService;
    public InterfaceC42801Gqz challengeService;
    public HF0 commerceService;
    public IHashTagService hashTagService;
    public WUF liveService;
    public InterfaceC42807Gr5 localHashTagService;
    public HEO miniAppService;
    public InterfaceC36395EQd networkService;
    public InterfaceC41536GRw publishPreviewService;
    public GVF publishService;
    public InterfaceC43725HEb regionService;
    public ISchedulerService schedulerService;
    public InterfaceC147965rM sharePrefService;
    public G8N shareService;
    public HF6 stickerPropService;
    public InterfaceC43726HEc stickerShareService;
    public InterfaceC147495qb storyService;
    public G6I syncShareService;
    public C69G uiService;
    public HF7 unlockStickerService;
    public HH0 videoCacheService;
    public InterfaceC156736Dd wikiService;

    public static /* synthetic */ boolean lambda$superEntrancePrivacyService$2(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public IMusicService getMusicService() {
        return MusicService.createIMusicServicebyMonsterPlugin(false);
    }

    private InterfaceC42801Gqz getChallengeServiceInternal() {
        if (this.challengeService == null) {
            this.challengeService = new HBO();
        }
        return this.challengeService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public HF1 getABService() {
        if (this.abTestService == null) {
            this.abTestService = new MEX();
        }
        return this.abTestService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public IAVAppContextManager getAVAppContextManager() {
        return new HH3();
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC41618GVa getAVConverter() {
        if (this.avConverter == null) {
            this.avConverter = new HHB();
        }
        return this.avConverter;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public HQ7 getAccountService() {
        if (this.accountService == null) {
            this.accountService = new R3X();
        }
        return this.accountService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public C5UD getApplicationService() {
        if (this.applicationService == null) {
            this.applicationService = new C45039Hlz();
        }
        return this.applicationService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC43749HEz getBridgeService() {
        if (this.bridgeService == null) {
            this.bridgeService = new HE2();
        }
        return this.bridgeService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC41322GJq getBusinessGoodsService() {
        if (this.businessGoodsService == null) {
            this.businessGoodsService = new HH4();
        }
        return this.businessGoodsService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public G9S getCaptionMentionService() {
        if (this.captionMentionService == null) {
            this.captionMentionService = new HH5();
        }
        return this.captionMentionService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public HF0 getCommerceService() {
        if (this.commerceService == null) {
            this.commerceService = new HH2();
        }
        return this.commerceService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public IHashTagService getHashTagService() {
        if (this.hashTagService == null) {
            this.hashTagService = new C51569KLt();
        }
        return this.hashTagService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public HF6 getIStickerPropService() {
        if (this.stickerPropService == null) {
            this.stickerPropService = new C77412UZs();
        }
        return this.stickerPropService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public WUF getLiveService() {
        if (this.liveService == null) {
            this.liveService = new C30597Bzd();
        }
        return this.liveService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC42807Gr5 getLocalHashTagService() {
        if (this.localHashTagService == null) {
            this.localHashTagService = new HH6();
        }
        return this.localHashTagService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public HEO getMiniAppService() {
        if (this.miniAppService == null) {
            this.miniAppService = new HH7();
        }
        return this.miniAppService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC36395EQd getNetworkService() {
        if (this.networkService == null) {
            this.networkService = new NetworkServiceImpl();
        }
        return this.networkService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC41536GRw getPublishPreviewService() {
        if (this.publishPreviewService == null) {
            this.publishPreviewService = new GS1();
        }
        return this.publishPreviewService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public GVF getPublishService() {
        if (this.publishService == null) {
            this.publishService = new C78605Ut7();
        }
        return this.publishService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC43725HEb getRegionService() {
        if (this.regionService == null) {
            this.regionService = new C44296Ha0();
        }
        return this.regionService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public ISchedulerService getSchedulerService() {
        if (this.schedulerService == null) {
            this.schedulerService = new V52();
        }
        return this.schedulerService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public G8N getShareService() {
        if (this.shareService == null) {
            this.shareService = new HH8();
        }
        return this.shareService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC147965rM getSpService() {
        if (this.sharePrefService == null) {
            this.sharePrefService = new C40959G5r();
        }
        return this.sharePrefService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC43726HEc getStickerShareService() {
        if (this.stickerShareService == null) {
            this.stickerShareService = new HH9();
        }
        return this.stickerShareService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC147495qb getStoryService() {
        if (this.storyService == null) {
            this.storyService = new C43119Gw7();
        }
        return this.storyService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public G6I getSyncShareService() {
        if (this.syncShareService == null) {
            this.syncShareService = C4LD.LIZ.LJJIIJZLJL();
        }
        return this.syncShareService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public C69G getUiService() {
        if (this.uiService == null) {
            this.uiService = new HHA();
        }
        return this.uiService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public HH0 getVideoCacheService() {
        if (this.videoCacheService == null) {
            this.videoCacheService = new HH1();
        }
        return this.videoCacheService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC156736Dd getWikiService() {
        if (this.wikiService == null) {
            this.wikiService = new C42901Gsb();
        }
        return this.wikiService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public ISuperEntrancePrivacyService superEntrancePrivacyService() {
        return new C47956Irw();
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public HF7 unlockStickerService() {
        if (this.unlockStickerService == null) {
            this.unlockStickerService = new C77413UZt();
        }
        return this.unlockStickerService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC41387GMd getChallengeService() {
        return getChallengeServiceInternal();
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC42801Gqz getDmtChallengeService() {
        return getChallengeServiceInternal();
    }

    public static IAVServiceProxy createIAVServiceProxybyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IAVServiceProxy.class, z);
        if (LIZ != null) {
            return (IAVServiceProxy) LIZ;
        }
        if (C58096Mr6.x1 == null) {
            synchronized (IAVServiceProxy.class) {
                if (C58096Mr6.x1 == null) {
                    C58096Mr6.x1 = new AVServiceProxyImpl();
                }
            }
        }
        return C58096Mr6.x1;
    }

    public static /* synthetic */ AVAweme lambda$getAVConverter$1(CreateBaseAwemeResponse createBaseAwemeResponse) {
        if (createBaseAwemeResponse instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) createBaseAwemeResponse;
            if (createAwemeResponse.aweme != null) {
                AVAweme aVAweme = new AVAweme();
                aVAweme.aid = createAwemeResponse.aweme.getAid();
                aVAweme.captionStruct = C86670Xzu.LJIIL(createAwemeResponse.aweme);
                return aVAweme;
            }
            return null;
        }
        return null;
    }

    public static /* synthetic */ void lambda$getVideoCacheService$3(String str, CreateBaseAwemeResponse createBaseAwemeResponse) {
        if (createBaseAwemeResponse instanceof CreateAwemeResponse) {
            LocalVideoPlayerManager.LIZLLL().LJI(((CreateAwemeResponse) createBaseAwemeResponse).aweme, str);
        }
    }

    public static /* synthetic */ void lambda$getSchedulerService$0(Handler handler, Callable callable, int i) {
        FGR.LIZIZ().LIZ(handler, callable, i);
    }
}
