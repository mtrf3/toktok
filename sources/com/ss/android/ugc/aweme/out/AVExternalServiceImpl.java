package com.ss.android.ugc.aweme.out;

import X.C126524xs;
import X.C140495fJ;
import X.C150335vB;
import X.C162706a2;
import X.C16880lQ;
import X.C221108m2;
import X.C32151Nz;
import X.C36895Edv;
import X.C39686Fhq;
import X.C41393GMj;
import X.C41396GMm;
import X.C41397GMn;
import X.C41401GMr;
import X.C41406GMw;
import X.C41415GNf;
import X.C42334GjS;
import X.C42340GjY;
import X.C42697GpJ;
import X.C42698GpK;
import X.C43014GuQ;
import X.C43605H9l;
import X.C43608H9o;
import X.C43697HCz;
import X.C44144HUe;
import X.C44145HUf;
import X.C44147HUh;
import X.C44148HUi;
import X.C44149HUj;
import X.C44150HUk;
import X.C44151HUl;
import X.C44152HUm;
import X.C44153HUn;
import X.C44155HUp;
import X.C44156HUq;
import X.C44157HUr;
import X.C44158HUs;
import X.C44159HUt;
import X.C44160HUu;
import X.C44163HUx;
import X.C44172HVg;
import X.C44298Ha2;
import X.C45757HxZ;
import X.C57082Lw;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C62J;
import X.C63078OpG;
import X.C63942P7q;
import X.C63946P7u;
import X.C64348PNg;
import X.C65314PkE;
import X.C74502wA;
import X.C78404Ups;
import X.C78841Uwv;
import X.C78934UyQ;
import X.C78983UzD;
import X.C79045V0n;
import X.C83739Wtj;
import X.GJO;
import X.GJT;
import X.HD1;
import X.HE4;
import X.HLQ;
import X.HLS;
import X.HQC;
import X.HV6;
import X.HVE;
import X.HZN;
import X.InterfaceC45930I0w;
import X.KNZ;
import X.OQE;
import X.R39;
import X.TMC;
import X.X1D;
import X.XFA;
import X.XFY;
import X.XFZ;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsService;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.AVPublishServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IAVFilterService;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.ss.android.ugc.aweme.services.IEffectCardService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IPreloadVESo;
import com.ss.android.ugc.aweme.services.audio.IAudioModelService;
import com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory;
import com.ss.android.ugc.aweme.services.badge.IBadgeService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.IAVPhotoModeService;
import com.ss.android.ugc.aweme.services.external.IAVScreenAdaptService;
import com.ss.android.ugc.aweme.services.external.IAVTransformModelService;
import com.ss.android.ugc.aweme.services.external.IAVTypeFaceService;
import com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.external.ICreativeStandardPathService;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.external.IInitTaskService;
import com.ss.android.ugc.aweme.services.external.ILargeTransactionService;
import com.ss.android.ugc.aweme.services.external.IRouterService;
import com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.services.external.ability.IEffectSDKGeneralParamService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.story.IStoryService;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.IActivityNameService;
import defpackage.b1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AVExternalServiceImpl implements IExternalService {
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
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

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ISpecialPlusService specialPlusService() {
        return HQC.LIZ();
    }

    public static IExternalService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IExternalService.class, false);
        if (LIZ != null) {
            return (IExternalService) LIZ;
        }
        if (C58096Mr6.J3 == null) {
            synchronized (IExternalService.class) {
                if (C58096Mr6.J3 == null) {
                    C58096Mr6.J3 = new AVExternalServiceImpl();
                }
            }
        }
        return C58096Mr6.J3;
    }

    public final C44153HUn LIZIZ() {
        return (C44153HUn) this.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVTransformModelService aVTransformModelService() {
        return new C79045V0n();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAbilityService abilityService() {
        return (C44163HUx) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAnchorService anchorService() {
        return (C62J) this.LJIJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAudioModelService audioModelService() {
        String str;
        C140495fJ c140495fJ;
        String name = C140495fJ.class.getName();
        IAudioServiceFactory iAudioServiceFactory = (IAudioServiceFactory) ((LinkedHashMap) C126524xs.LIZ).get(name);
        StringBuilder LIZJ = b1.LIZJ(name, " , get impl audio service factory class name is ");
        if (iAudioServiceFactory != null) {
            str = C16880lQ.LJLLJ(iAudioServiceFactory.getClass());
        } else {
            str = null;
        }
        LIZJ.append(str);
        X1D.LIZIZ(LIZJ);
        if (iAudioServiceFactory == null || (c140495fJ = (C140495fJ) iAudioServiceFactory) == null) {
            return null;
        }
        c140495fJ.LIZ = new C44148HUi();
        return c140495fJ;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAvatarPublishStoryService avatarService() {
        return (C41393GMj) this.LJIIJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IActivityNameService classnameService() {
        return (C44147HUh) C44147HUh.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICommerceToolsService commerceToolsService() {
        return new CommerceToolsService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IConfigService configService() {
        return (HLQ) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICreativeStandardPathService creativeStandardPath() {
        return new C65314PkE();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IDonationService donationService() {
        return (C42697GpJ) this.LJIILJJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVDraftService draftService() {
        return (C41415GNf) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IEffectCardService effectCardService() {
        return new KNZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IExternalUploaderService externalUploaderService() {
        return new TMC();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVFilterService filterService() {
        return (HZN) this.LJIILLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVMobService getAVMobService() {
        return (C44144HUe) this.LJIILL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IBadgeService getBadgeService() {
        return (OQE) this.LJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final String getCurrentUploadFrameResult() {
        C78934UyQ.LJLIL.getMusicService().LJIL();
        String LIZJ = C43014GuQ.LIZJ();
        if (LIZJ == null) {
            return "";
        }
        return LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final NextLiveData<InterfaceC45930I0w> getCurrentUserData() {
        NextLiveData<InterfaceC45930I0w> LIZIZ = C57082Lw.LIZ.LIZIZ("#CurrentUser");
        o.LJIIIIZZ(LIZIZ, "get().with(\n            …er::class.java,\n        )");
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IEffectSDKGeneralParamService getEffectSDKGeneralParamService() {
        return new C63078OpG();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IInfoService infoService() {
        return (C43697HCz) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IInitTaskService initService() {
        return new C36895Edv();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ILargeTransactionService largeTransactionService() {
        return (C42334GjS) this.LJIJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IOpenPhotoNextService openGotoNextService() {
        return (C74502wA) this.LJIIIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IOpenTextNextService openTextNextService() {
        return (C43605H9l) this.LJIIJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICreativePerformanceMonitorService performanceMonitorService() {
        return (C64348PNg) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVPhotoModeService photoModeService() {
        return (C150335vB) this.LJIILIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IPreloadVESo preloadService() {
        return (C45757HxZ) C45757HxZ.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVPerformance provideAVPerformance() {
        C44298Ha2 avPerformance = (C44298Ha2) this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(avPerformance, "avPerformance");
        return avPerformance;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICrashReportService provideErrorReporter() {
        return (C39686Fhq) this.LJIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVPublishService publishService() {
        AVPublishServiceImpl companion = AVPublishServiceImpl.Companion.getInstance();
        o.LJI(companion);
        return companion;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IRouterService routerService() {
        return new C78841Uwv();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVScreenAdaptService screenAdaptService() {
        return (C162706a2) this.LJIIZILJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IShoutOutsService shoutOutsService() {
        return (GJO) this.LJII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IStoryService storyService() {
        return new HV6();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ISuperEntranceService superEntranceService() {
        return (HVE) HVE.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVTypeFaceService typeFaceService() {
        return new IAVTypeFaceService() { // from class: X.6D4
            @Override // com.ss.android.ugc.aweme.services.external.IAVTypeFaceService
            public final Typeface getTypefaceByFontName(String name) {
                o.LJIIIZ(name, "name");
                C1554568f LIZ = C1554568f.LIZ();
                LIZ.getClass();
                if (!TextUtils.isEmpty(name) && ((ConcurrentHashMap) LIZ.LIZ).size() != 0) {
                    Iterator it = ((ConcurrentHashMap) LIZ.LIZ).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        TextFontStyleData textFontStyleData = (TextFontStyleData) it.next();
                        if (name.equals(textFontStyleData.fontName)) {
                            String str = textFontStyleData.fileName;
                            if (!TextUtils.isEmpty(str) && ((ConcurrentHashMap) LIZ.LIZIZ).size() != 0) {
                                Typeface typeface = (Typeface) ((ConcurrentHashMap) LIZ.LIZIZ).get(str);
                                if (typeface != null || ((ConcurrentHashMap) LIZ.LIZ).get(str) == null) {
                                    return typeface;
                                }
                                Typeface LIZIZ = C1554568f.LIZIZ(((TextFontStyleData) ((ConcurrentHashMap) LIZ.LIZ).get(str)).LIZ);
                                if (LIZIZ == null) {
                                    return LIZIZ;
                                }
                                ((ConcurrentHashMap) LIZ.LIZIZ).put(str, LIZIZ);
                                return LIZIZ;
                            }
                        }
                    }
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAVTypeFaceService
            public final void prefetch(final Context context) {
                o.LJIIIZ(context, "context");
                AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel("WaterMark", new IExternalService.ServiceLoadCallback() { // from class: X.6DS
                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onDismiss() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onFailed() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onOK() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService service, long j) {
                        o.LJIIIZ(service, "service");
                        C1554568f LIZ = C1554568f.LIZ();
                        if (context == null) {
                            LIZ.getClass();
                            return;
                        }
                        if (LIZ.LIZJ == null) {
                            LIZ.LIZJ = AVServiceImpl.LIZ().effectService().createFontEffectPlatform(C60903NvH.LJ);
                        }
                        LIZ.LIZJ.LJI("textfont", false, new C6DR(LIZ, null));
                    }
                });
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVVESDKService vesdkService() {
        return new C78404Ups();
    }

    public AVExternalServiceImpl() {
        TENativeLibsLoader.setLibraryHooker(R39.LJLIL);
        this.LIZ = C221108m2.LIZIZ(C44157HUr.LJLIL);
        this.LIZIZ = C221108m2.LIZIZ(C41401GMr.LJLIL);
        this.LIZJ = C221108m2.LIZIZ(C44150HUk.LJLIL);
        this.LIZLLL = C221108m2.LIZIZ(HLS.LJLIL);
        this.LJ = C221108m2.LIZIZ(HD1.LJLIL);
        this.LJFF = C221108m2.LIZIZ(C44152HUm.LJLIL);
        this.LJI = C221108m2.LIZIZ(C44155HUp.LJLIL);
        this.LJII = C221108m2.LIZIZ(C41397GMn.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(C44149HUj.LJLIL);
        this.LJIIIZ = C221108m2.LIZIZ(C41406GMw.LJLIL);
        this.LJIIJ = C221108m2.LIZIZ(C43608H9o.LJLIL);
        this.LJIIJJI = C221108m2.LIZIZ(C41396GMm.LJLIL);
        this.LJIIL = C221108m2.LIZIZ(C44156HUq.LJLIL);
        this.LJIILIIL = C221108m2.LIZIZ(C44159HUt.LJLIL);
        this.LJIILJJIL = C221108m2.LIZIZ(C42698GpK.LJLIL);
        this.LJIILL = C221108m2.LIZIZ(C44145HUf.LJLIL);
        this.LJIILLIIL = C221108m2.LIZIZ(C44158HUs.LJLIL);
        this.LJIIZILJ = C221108m2.LIZIZ(C44160HUu.LJLIL);
        this.LJIJ = C221108m2.LIZIZ(C42340GjY.LJLIL);
        this.LJIJI = C221108m2.LIZIZ(C44151HUl.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void initASVE() {
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAbnormalExitLogService abnormalExitLogService() {
        return GJT.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IEnterFromService enterFromService() {
        return HE4.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ITTEPAbilityService ttepAbilityService() {
        return XFA.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void attachApplication(Application application) {
        o.LJIIIZ(application, "application");
        C83739Wtj.LIZIZ = application;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void setVideoIdParam(String aid) {
        o.LJIIIZ(aid, "aid");
        C78983UzD.LJLJI = aid;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void updateVESDKDeviceId(String deviceId) {
        o.LJIIIZ(deviceId, "deviceId");
        if (XFY.LJI) {
            C63946P7u c63946P7u = ((XFZ) C83739Wtj.LIZIZ()).LIZLLL;
            if (TextUtils.isEmpty(deviceId)) {
                deviceId = "";
            }
            c63946P7u.LIZJ = deviceId;
            C63942P7q.LJI(((XFZ) C83739Wtj.LIZIZ()).LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncService(String entry, IExternalService.ServiceLoadCallback callback) {
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(callback, "callback");
        callback.onLoad(LIZIZ(), 100L);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceWithOutPanel(String entry, IExternalService.ServiceLoadCallback callback) {
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(callback, "callback");
        callback.onLoad(LIZIZ(), 100L);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncService(Context context, String entry, IExternalService.ServiceLoadCallback callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(callback, "callback");
        callback.onLoad(LIZIZ(), 100L);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceForMainRecordService(Context context, String entry, IExternalService.ServiceLoadCallback callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(callback, "callback");
        callback.onLoad(LIZIZ(), 100L);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceWithActivity(Context context, String entry, IExternalService.ServiceLoadCallback callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(callback, "callback");
        callback.onLoad(LIZIZ(), 100L);
    }
}
