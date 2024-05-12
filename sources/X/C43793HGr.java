package X;

import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.sparrow.DmtSparrowServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.HGr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43793HGr implements InterfaceC43724HEa {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C43795HGt.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C43796HGu.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C43797HGv.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C43799HGx.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C43798HGw.LJLIL);

    @Override // X.InterfaceC43724HEa
    public final C65314PkE LIZ() {
        return new C65314PkE();
    }

    @Override // X.InterfaceC43724HEa
    public final InterfaceC163636bX LIZIZ() {
        return (InterfaceC163636bX) this.LJ.getValue();
    }

    @Override // X.InterfaceC43724HEa
    public final C41388GMe LIZJ() {
        return new C41388GMe();
    }

    @Override // X.InterfaceC43724HEa
    public final HPG LJ() {
        return (HPG) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC43724HEa
    public final DmtSparrowServiceImpl LJFF() {
        return new DmtSparrowServiceImpl();
    }

    @Override // X.InterfaceC43724HEa
    public final InterfaceC146895pd LJI() {
        return (InterfaceC146895pd) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC43724HEa
    public final G5C LJIIIIZZ() {
        return new G5C();
    }

    @Override // X.InterfaceC43724HEa
    public final HG3 LJIIIZ() {
        return new HG3();
    }

    public final IAVServiceProxy LJIIJ() {
        return (IAVServiceProxy) this.LIZ.getValue();
    }

    @Override // X.InterfaceC43724HEa
    public final IAnotherMusicService getMusicService() {
        return (IAnotherMusicService) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC43724HEa
    public final HF1 LIZLLL() {
        HF1 aBService = LJIIJ().getABService();
        o.LJIIIIZZ(aBService, "proxy.abService");
        return aBService;
    }

    @Override // X.InterfaceC43724HEa
    public final InterfaceC41618GVa LJII() {
        InterfaceC41618GVa aVConverter = LJIIJ().getAVConverter();
        o.LJIIIIZZ(aVConverter, "proxy.avConverter");
        return aVConverter;
    }

    @Override // X.InterfaceC43724HEa
    public final C5UD getApplicationService() {
        C5UD applicationService = LJIIJ().getApplicationService();
        o.LJIIIIZZ(applicationService, "proxy.applicationService");
        return applicationService;
    }

    @Override // X.InterfaceC43724HEa
    public final InterfaceC43749HEz getBridgeService() {
        InterfaceC43749HEz bridgeService = LJIIJ().getBridgeService();
        o.LJIIIIZZ(bridgeService, "proxy.bridgeService");
        return bridgeService;
    }

    @Override // X.InterfaceC43724HEa
    public final InterfaceC41322GJq getBusinessGoodsService() {
        InterfaceC41322GJq businessGoodsService = LJIIJ().getBusinessGoodsService();
        o.LJIIIIZZ(businessGoodsService, "proxy.businessGoodsService");
        return businessGoodsService;
    }

    @Override // X.InterfaceC43724HEa
    public final G9S getCaptionMentionService() {
        G9S captionMentionService = LJIIJ().getCaptionMentionService();
        o.LJIIIIZZ(captionMentionService, "proxy.captionMentionService");
        return captionMentionService;
    }

    @Override // X.InterfaceC43724HEa
    public final InterfaceC42801Gqz getChallengeService() {
        return LJIIJ().getDmtChallengeService();
    }

    @Override // X.InterfaceC43724HEa
    public final HF0 getCommerceService() {
        HF0 commerceService = LJIIJ().getCommerceService();
        o.LJIIIIZZ(commerceService, "proxy.commerceService");
        return commerceService;
    }

    @Override // X.InterfaceC43724HEa
    public final IHashTagService getHashTagService() {
        IHashTagService hashTagService = LJIIJ().getHashTagService();
        o.LJIIIIZZ(hashTagService, "proxy.hashTagService");
        return hashTagService;
    }

    @Override // X.InterfaceC43724HEa
    public final WUF getLiveService() {
        return LJIIJ().getLiveService();
    }

    @Override // X.InterfaceC43724HEa
    public final GVF getPublishService() {
        GVF publishService = LJIIJ().getPublishService();
        o.LJIIIIZZ(publishService, "proxy.publishService");
        return publishService;
    }

    @Override // X.InterfaceC43724HEa
    public final InterfaceC43725HEb getRegionService() {
        InterfaceC43725HEb regionService = LJIIJ().getRegionService();
        o.LJIIIIZZ(regionService, "proxy.regionService");
        return regionService;
    }

    @Override // X.InterfaceC43724HEa
    public final G8N getShareService() {
        G8N shareService = LJIIJ().getShareService();
        o.LJIIIIZZ(shareService, "proxy.shareService");
        return shareService;
    }

    @Override // X.InterfaceC43724HEa
    public final InterfaceC147965rM getSpService() {
        InterfaceC147965rM spService = LJIIJ().getSpService();
        o.LJII(spService, "null cannot be cast to non-null type com.ss.android.ugc.aweme.port.in.ISharePrefService");
        return spService;
    }

    @Override // X.InterfaceC43724HEa
    public final InterfaceC43726HEc getStickerShareService() {
        InterfaceC43726HEc stickerShareService = LJIIJ().getStickerShareService();
        o.LJIIIIZZ(stickerShareService, "proxy.stickerShareService");
        return stickerShareService;
    }

    @Override // X.InterfaceC43724HEa
    public final G6I getSyncShareService() {
        G6I syncShareService = LJIIJ().getSyncShareService();
        o.LJIIIIZZ(syncShareService, "proxy.syncShareService");
        return syncShareService;
    }

    @Override // X.InterfaceC43724HEa
    public final InterfaceC156736Dd getWikiService() {
        InterfaceC156736Dd wikiService = LJIIJ().getWikiService();
        o.LJIIIIZZ(wikiService, "proxy.wikiService");
        return wikiService;
    }
}
