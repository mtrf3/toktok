package X;

import android.app.Application;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.google.gson.Gson;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.IEditMusicService;
import com.ss.android.ugc.aweme.port.internal.IActivityPageService;
import com.ss.android.ugc.aweme.port.internal.IFluencyService;
import com.ss.android.ugc.aweme.port.internal.IMediaCacheService;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HEf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43729HEf implements InterfaceC43728HEe {
    public final Application LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C5H3 LJFF;
    public final C5H3 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final C62822Ol8 LJIJI;
    public final C62822Ol8 LJIJJ;
    public final C62822Ol8 LJIJJLI;
    public final C62822Ol8 LJIL;
    public final C62822Ol8 LJJ;
    public final C62822Ol8 LJJI;
    public final C62822Ol8 LJJIFFI;
    public final C62822Ol8 LJJII;
    public final C62822Ol8 LJJIII;
    public final C62822Ol8 LJJIIJ;
    public final C62822Ol8 LJJIIJZLJL;
    public final C62822Ol8 LJJIIZ;
    public final C62822Ol8 LJJIIZI;
    public final C62822Ol8 LJJIJ;
    public final C62822Ol8 LJJIJIIJI;
    public final C62822Ol8 LJJIJIIJIL;
    public final C62822Ol8 LJJIJIL;
    public final C62822Ol8 LJJIJL;

    @Override // X.InterfaceC43728HEe
    public final String LJII() {
        String language;
        G36 g36 = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getLocaleMap().get(getAppLanguage());
        if (g36 == null || (language = g36.getLanguage()) == null) {
            return "";
        }
        return language;
    }

    @Override // X.InterfaceC43728HEe
    public final String LJIILJJIL() {
        String LIZIZ;
        G36 g36 = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getLocaleMap().get(getAppLanguage());
        if (g36 == null || (LIZIZ = g36.LIZIZ()) == null) {
            return "";
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC43728HEe
    public final String getAppLanguage() {
        String appLanguage = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage();
        o.LJIIIIZZ(appLanguage, "get().getService(IAVSett…::class.java).appLanguage");
        return appLanguage;
    }

    @Override // X.InterfaceC43728HEe
    public final long getUpdateVersionCode() {
        return AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getAVAppContextManager().getUpdateVersionCode();
    }

    @Override // X.InterfaceC43728HEe
    public final long getVersionCode() {
        return AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getAVAppContextManager().getVersionCode();
    }

    @Override // X.InterfaceC43728HEe
    public final Gson LIZ() {
        Object value = this.LJIL.getValue();
        o.LJIIIIZZ(value, "<get-customGson>(...)");
        return (Gson) value;
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC163636bX LIZIZ() {
        return (InterfaceC163636bX) this.LJJIIZ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC43114Gw2 LIZJ() {
        return (InterfaceC43114Gw2) this.LJIIZILJ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC45420Hs8 LIZLLL() {
        return (InterfaceC45420Hs8) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final HVQ LJ() {
        return (HVQ) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final C6VO LJFF() {
        return (C6VO) this.LJJII.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final HJE LJI() {
        return (HJE) this.LJJIIZI.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final IEditMusicService LJIIIIZZ() {
        return (IEditMusicService) this.LJJIIJZLJL.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC150995wF LJIIIZ() {
        return (InterfaceC150995wF) this.LJIIL.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final GV9 LJIIJ() {
        return (GV9) this.LJFF.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC168776jp LJIIJJI() {
        return (InterfaceC168776jp) this.LJ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final Gson LJIIL() {
        Object value = this.LJJ.getValue();
        o.LJIIIIZZ(value, "<get-_draftRecoverGson>(...)");
        return (Gson) value;
    }

    @Override // X.InterfaceC43728HEe
    public final IActivityPageService LJIILIIL() {
        return (IActivityPageService) this.LJJIJIIJIL.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC43316GzI LJIILL() {
        return (InterfaceC43316GzI) this.LJIJJ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC43028Gue LJIILLIIL() {
        return (InterfaceC43028Gue) this.LJJIIJ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final IMediaCacheService LJIIZILJ() {
        return (IMediaCacheService) this.LJJIJIIJI.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC170826n8 LJIJI() {
        return (InterfaceC170826n8) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC46205IBl LJIJJ() {
        return (InterfaceC46205IBl) this.LJJIFFI.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC42390GkM LJIL() {
        return (InterfaceC42390GkM) this.LJIJ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final C44839Hil LJJ() {
        return (C44839Hil) this.LJIJI.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final IFluencyService LJJI() {
        return (IFluencyService) this.LJJIJIL.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC43647HBb LJJIFFI() {
        return (InterfaceC43647HBb) this.LJIILL.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC43636HAq LJJIII() {
        return (InterfaceC43636HAq) this.LJIILJJIL.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC152975zR LJJIIJZLJL() {
        return (InterfaceC152975zR) this.LJJIJ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC120884om LJJIIZ() {
        return (InterfaceC120884om) this.LJI.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC170656mr LJJIIZI() {
        return (InterfaceC170656mr) this.LJJI.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final HNW LJJIJ() {
        return (HNW) this.LJIJJLI.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC148965sy LJJIJIIJI() {
        return (InterfaceC148965sy) this.LJJIJL.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final IVideoConfigService LJJIJIIJIL() {
        return (IVideoConfigService) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC42120Gg0 LJJIJIL() {
        return (InterfaceC42120Gg0) this.LJJIII.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC42713GpZ LJJIJL() {
        return (InterfaceC42713GpZ) this.LJIIIZ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final IVideoConfigService LJJIJLIJ() {
        return (IVideoConfigService) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final AVPreferences LJJIL() {
        return (AVPreferences) this.LJII.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final XUE LJJIZ() {
        return new XUE();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC41416GNg LJJJI() {
        return (InterfaceC41416GNg) this.LIZLLL.getValue();
    }

    public final IFoundationAVServiceProxy LJJJIL() {
        return (IFoundationAVServiceProxy) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC163006aW getPublishService() {
        return (InterfaceC163006aW) this.LJIILLIIL.getValue();
    }

    @Override // X.InterfaceC43728HEe
    public final G8N getShareService() {
        G8N SHARE_SERVICE = C44172HVg.LJIL;
        o.LJIIIIZZ(SHARE_SERVICE, "SHARE_SERVICE");
        return SHARE_SERVICE;
    }

    @Override // X.InterfaceC43728HEe
    public final void LJIJ() {
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        TEInterface.nativeSetMaxDetectFrameCount(C00F.LIZ(31744, 0, "creative_edit_hdr_v2_max_cache_size", true));
    }

    @Override // X.InterfaceC43728HEe
    public final HQ7 getAccountService() {
        HQ7 accountService = LJJJIL().getAccountService();
        o.LJIIIIZZ(accountService, "proxy.accountService");
        return accountService;
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC124244uC getApplicationService() {
        InterfaceC124244uC applicationService = LJJJIL().getApplicationService();
        o.LJIIIIZZ(applicationService, "proxy.applicationService");
        return applicationService;
    }

    @Override // X.InterfaceC43728HEe
    public final HF4 getBridgeService() {
        HF4 bridgeService = LJJJIL().getBridgeService();
        o.LJIIIIZZ(bridgeService, "proxy.bridgeService");
        return bridgeService;
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC41387GMd getChallengeService() {
        InterfaceC41387GMd challengeService = LJJJIL().getChallengeService();
        o.LJIIIIZZ(challengeService, "proxy.challengeService");
        return challengeService;
    }

    @Override // X.InterfaceC43728HEe
    public final HF5 getCommerceService() {
        HF5 commerceService = LJJJIL().getCommerceService();
        o.LJIIIIZZ(commerceService, "proxy.commerceService");
        return commerceService;
    }

    @Override // X.InterfaceC43728HEe
    public final HF6 getIStickerPropService() {
        HF6 iStickerPropService = LJJJIL().getIStickerPropService();
        o.LJIIIIZZ(iStickerPropService, "proxy.iStickerPropService");
        return iStickerPropService;
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC42807Gr5 getLocalHashTagService() {
        InterfaceC42807Gr5 localHashTagService = LJJJIL().getLocalHashTagService();
        o.LJIIIIZZ(localHashTagService, "proxy.localHashTagService");
        return localHashTagService;
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC36395EQd getNetworkService() {
        InterfaceC36395EQd networkService = LJJJIL().getNetworkService();
        o.LJIIIIZZ(networkService, "proxy.networkService");
        return networkService;
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC84963Vc getRegionService() {
        InterfaceC84963Vc regionService = LJJJIL().getRegionService();
        o.LJIIIIZZ(regionService, "proxy.regionService");
        return regionService;
    }

    @Override // X.InterfaceC43728HEe
    public final C69G getUiService() {
        C69G uiService = LJJJIL().getUiService();
        o.LJIIIIZZ(uiService, "proxy.uiService");
        return uiService;
    }

    @Override // X.InterfaceC43728HEe
    public final HF7 unlockStickerService() {
        HF7 unlockStickerService = LJJJIL().unlockStickerService();
        o.LJIIIIZZ(unlockStickerService, "proxy.unlockStickerService()");
        return unlockStickerService;
    }

    @Override // X.InterfaceC43728HEe
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC43728HEe
    public final void LJJII() {
        C44172HVg.LJI();
    }

    @Override // X.InterfaceC43728HEe
    public final void LJJIIJ() {
    }

    @Override // X.InterfaceC43728HEe
    public final void initDownloadableModel() {
        C44172HVg.LIZJ();
    }

    public C43729HEf(Application application) {
        o.LJIIIZ(application, "application");
        this.LIZ = application;
        this.LIZIZ = C221108m2.LIZIZ(C43730HEg.LJLIL);
        this.LIZJ = C221108m2.LIZIZ(C43748HEy.LJLIL);
        this.LIZLLL = C221108m2.LIZIZ(GWY.LJLIL);
        this.LJ = C221108m2.LIZIZ(C43233Gxx.LJLIL);
        EnumC221088m0 enumC221088m0 = EnumC221088m0.SYNCHRONIZED;
        this.LJFF = C221108m2.LIZ(enumC221088m0, GWW.LJLIL);
        this.LJI = C221108m2.LIZ(enumC221088m0, C6VW.LJLIL);
        this.LJII = C221108m2.LIZIZ(C41974Gde.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(C43741HEr.LJLIL);
        this.LJIIIZ = C221108m2.LIZIZ(C42714Gpa.LJLIL);
        this.LJIIJ = C221108m2.LIZIZ(C43733HEj.LJLIL);
        this.LJIIJJI = C221108m2.LIZIZ(C43745HEv.LJLIL);
        this.LJIIL = C221108m2.LIZIZ(C43738HEo.LJLIL);
        this.LJIILIIL = C221108m2.LIZIZ(C43739HEp.LJLIL);
        C221108m2.LIZIZ(C36947Eel.LJLIL);
        this.LJIILJJIL = C221108m2.LIZIZ(C43732HEi.LJLIL);
        this.LJIILL = C221108m2.LIZIZ(C43646HBa.LJLIL);
        this.LJIILLIIL = C221108m2.LIZIZ(GWX.LJLIL);
        this.LJIIZILJ = C221108m2.LIZIZ(H4K.LJLIL);
        this.LJIJ = C221108m2.LIZIZ(C42028GeW.LJLIL);
        this.LJIJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
        this.LJIJJ = C221108m2.LIZIZ(C43734HEk.LJLIL);
        C221108m2.LIZIZ(C6VY.LJLIL);
        this.LJIJJLI = C221108m2.LIZIZ(C43743HEt.LJLIL);
        this.LJIL = C221108m2.LIZIZ(EJE.LJLIL);
        this.LJJ = C221108m2.LIZIZ(EJJ.LJLIL);
        this.LJJI = C221108m2.LIZIZ(C36857EdJ.LJLIL);
        this.LJJIFFI = C221108m2.LIZIZ(C43737HEn.LJLIL);
        this.LJJII = C221108m2.LIZIZ(C6VV.LJLIL);
        this.LJJIII = C221108m2.LIZIZ(C42122Gg2.LJLIL);
        this.LJJIIJ = C221108m2.LIZIZ(C43043Gut.LJLIL);
        this.LJJIIJZLJL = C221108m2.LIZIZ(C6VX.LJLIL);
        this.LJJIIZ = C221108m2.LIZIZ(C43740HEq.LJLIL);
        this.LJJIIZI = C221108m2.LIZIZ(C43747HEx.LJLIL);
        this.LJJIJ = C221108m2.LIZIZ(C43744HEu.LJLIL);
        this.LJJIJIIJI = C221108m2.LIZIZ(EJF.LJLIL);
        this.LJJIJIIJIL = C221108m2.LIZIZ(C42686Gp8.LJLIL);
        this.LJJIJIL = C221108m2.LIZIZ(C43742HEs.LJLIL);
        this.LJJIJL = C221108m2.LIZIZ(H1I.LJLIL);
    }

    @Override // X.InterfaceC43728HEe
    public final InterfaceC43316GzI LJJJ(String str) {
        if (o.LJ(str, "ttnowfilter")) {
            return C43731HEh.LIZ.LIZIZ();
        }
        return LJIILL();
    }
}
