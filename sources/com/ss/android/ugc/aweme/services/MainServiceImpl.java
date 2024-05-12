package com.ss.android.ugc.aweme.services;

import X.C00F;
import X.C03880Dg;
import X.C05040Hs;
import X.C0RN;
import X.C10K;
import X.C116694i1;
import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C227768wm;
import X.C2U8;
import X.C35154Dqw;
import X.C36093EEn;
import X.C37019Efv;
import X.C38457F7l;
import X.C38943FQd;
import X.C38990FRy;
import X.C38995FSd;
import X.C39424Fdc;
import X.C39606FgY;
import X.C39610Fgc;
import X.C39613Fgf;
import X.C39615Fgh;
import X.C39789FjV;
import X.C39790FjW;
import X.C39798Fje;
import X.C39799Fjf;
import X.C40328FsC;
import X.C40359Fsh;
import X.C40384Ft6;
import X.C41668GWy;
import X.C42460GlU;
import X.C42937GtB;
import X.C44141HUb;
import X.C44142HUc;
import X.C44143HUd;
import X.C44207HWp;
import X.C45457Hsj;
import X.C47698Inm;
import X.C51029K0z;
import X.C54153LNd;
import X.C55734Lu6;
import X.C55840Lvo;
import X.C55842Lvq;
import X.C55843Lvr;
import X.C55846Lvu;
import X.C55851Lvz;
import X.C55852Lw0;
import X.C55854Lw2;
import X.C55855Lw3;
import X.C55857Lw5;
import X.C55858Lw6;
import X.C55859Lw7;
import X.C55861Lw9;
import X.C55862LwA;
import X.C55863LwB;
import X.C55864LwC;
import X.C55865LwD;
import X.C55866LwE;
import X.C55867LwF;
import X.C55868LwG;
import X.C55869LwH;
import X.C55873LwL;
import X.C55874LwM;
import X.C55875LwN;
import X.C55889Lwb;
import X.C55892Lwe;
import X.C55894Lwg;
import X.C56190M3m;
import X.C56208M4e;
import X.C56210M4g;
import X.C56212M4i;
import X.C56214M4k;
import X.C56215M4l;
import X.C56219M4p;
import X.C56226M4w;
import X.C56227M4x;
import X.C56228M4y;
import X.C57127MbT;
import X.C57415Mg7;
import X.C57422MgE;
import X.C58096Mr6;
import X.C61017Nx7;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C67128QWe;
import X.C67143QWt;
import X.C76800UCe;
import X.C78966Uyw;
import X.C82555Wad;
import X.C84763XOl;
import X.C88546Yp4;
import X.C9WK;
import X.CallableC39420FdY;
import X.CallableC39421FdZ;
import X.DialogInterfaceOnDismissListenerC56213M4j;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EFM;
import X.EI0;
import X.EU2;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F6L;
import X.F6M;
import X.F96;
import X.F97;
import X.F98;
import X.F99;
import X.F9A;
import X.FCD;
import X.FJU;
import X.FMX;
import X.FRA;
import X.FRB;
import X.HCL;
import X.HG3;
import X.HP3;
import X.HPZ;
import X.HQ3;
import X.HT7;
import X.HT8;
import X.HT9;
import X.HTJ;
import X.HWZ;
import X.I9R;
import X.IAX;
import X.InterfaceC36571c5;
import X.InterfaceC39611Fgd;
import X.InterfaceC42037Gef;
import X.InterfaceC55378LoM;
import X.InterfaceC56220M4q;
import X.InterfaceC74183T9n;
import X.InterfaceC74184T9o;
import X.InterfaceC88472Yns;
import X.KL2;
import X.L8W;
import X.M50;
import X.M52;
import X.M53;
import X.M54;
import X.M55;
import X.M56;
import X.M60;
import X.MBR;
import X.N2X;
import X.NO5;
import X.NOE;
import X.NP8;
import X.O3U;
import X.OZ1;
import X.QWY;
import X.RBX;
import X.X1D;
import X.Z8A;
import Y.ACallableS109S0100000_6;
import Y.IDdS378S0100000_6;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$FileApi;
import com.bytedance.tiktok.homepage.mainactivity.PreloadActicityTask;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.account.task.CookieMonitorTask;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootPreloadInstanceTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadResourcesTask;
import com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.promote.PromoteGdprManager;
import com.ss.android.ugc.aweme.promote.PromoteProgramDialog;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchUnifiedSettingRequest;
import com.ss.android.ugc.aweme.requesttask.idle.AnchorListRequest;
import com.ss.android.ugc.aweme.requesttask.idle.FetchImUnder16RequestTask;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.ug.amplify.AmplifyManager;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes10.dex */
public class MainServiceImpl implements IMainService {
    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isUseJediAwemelistFragment() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void startupTestColdBootEnd() {
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public EFM getAnchorListRequest() {
        return new AnchorListRequest();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public EE1 getCleanEffectsTask() {
        return new CleanEffectsTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public EE1 getCookieMonitorTask() {
        return new CookieMonitorTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public List<M56> getDeeplinkCommands() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C55852Lw0());
        arrayList2.add(new HT8());
        arrayList2.add(new C55855Lw3());
        arrayList2.add(new C55892Lwe());
        arrayList2.add(new C55863LwB());
        arrayList2.add(new C55864LwC());
        arrayList2.add(new FRA());
        arrayList2.add(new C55866LwE());
        arrayList2.add(new HTJ());
        arrayList2.add(new C55857Lw5());
        arrayList2.add(new C55869LwH());
        arrayList2.add(new HT9());
        arrayList2.add(new C39789FjV());
        arrayList2.add(new C44142HUc());
        arrayList2.add(new FRB());
        arrayList2.add(new C56208M4e());
        arrayList2.add(new HWZ());
        arrayList2.add(new C44141HUb());
        arrayList2.add(new C56210M4g());
        arrayList2.add(new C44143HUd());
        arrayList2.add(new C55859Lw7());
        arrayList2.add(new C55858Lw6());
        arrayList2.add(new C38990FRy());
        arrayList2.add(new C55874LwM());
        arrayList2.add(new C55865LwD());
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new M55());
        arrayList3.add(new C55854Lw2());
        arrayList3.add(new C55851Lvz());
        arrayList3.add(new C55862LwA());
        arrayList3.add(new F97());
        arrayList3.add(new C55843Lvr());
        arrayList3.add(new C55868LwG());
        arrayList3.add(new C55846Lvu());
        arrayList3.add(new C55873LwL());
        arrayList3.add(new C55840Lvo());
        arrayList3.add(new C55875LwN());
        arrayList3.add(new F98());
        arrayList3.add(new C55867LwF());
        arrayList3.add(new HT7());
        arrayList3.add(new C44207HWp());
        arrayList3.add(new C56212M4i());
        arrayList3.add(new F96());
        arrayList3.add(new C39790FjW());
        arrayList3.add(new C55861Lw9());
        arrayList3.add(new HQ3());
        arrayList3.add(new C55842Lvq());
        arrayList3.add(new C45457Hsj());
        arrayList3.add(new C56227M4x());
        arrayList3.add(new F6M());
        arrayList3.add(new F6L());
        arrayList3.add(new C56190M3m());
        arrayList3.add(new C55894Lwg());
        arrayList3.add(new C56214M4k());
        arrayList3.add(new HPZ());
        arrayList3.add(new C42460GlU());
        arrayList3.add(new HP3());
        arrayList3.add(new C56226M4w());
        arrayList3.add(new M56() { // from class: X.8wt
            @Override // X.M56
            public final String LIZJ(android.net.Uri uri) {
                o.LJIIIZ(uri, "uri");
                return "live";
            }

            @Override // X.M56
            public final boolean LJFF(String host, String path) {
                o.LJIIIZ(host, "host");
                o.LJIIIZ(path, "path");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(host);
                LIZ.append(path);
                return ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ), "hotlive/feed", false);
            }

            @Override // X.M56
            public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(uri, "uri");
                if (LiveOuterService.LJJJLL().LJIILL() != null) {
                    C78461Uqn.LIZIZ(activity, new EnterRoomConfig(), "HotLiveCommand");
                }
            }
        });
        arrayList3.add(new C42937GtB());
        arrayList3.add(new HCL());
        arrayList3.add(new C39798Fje());
        arrayList3.add(new C39799Fjf());
        arrayList3.add(new F99());
        arrayList3.add(new M52());
        arrayList3.add(new F9A());
        arrayList3.add(new C55889Lwb());
        arrayList3.add(new M54());
        arrayList3.add(new M56() { // from class: X.8wa
            @Override // X.M56
            public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(uri, "uri");
                SmartRouter.buildRoute(activity, "//baautomessaging").open();
            }

            @Override // X.M56
            public final boolean LJ(android.net.Uri uri, String scheme, String host, String path) {
                o.LJIIIZ(uri, "uri");
                o.LJIIIZ(scheme, "scheme");
                o.LJIIIZ(host, "host");
                o.LJIIIZ(path, "path");
                return o.LJ(host, "baautomessaging");
            }
        });
        arrayList3.add(new M56() { // from class: X.8lS
            @Override // X.M56
            public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(uri, "uri");
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null || lastPathSegment.length() == 0) {
                    return;
                }
                if (QnaService.LIZ().enablePublicQna()) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//qna/detail");
                    buildRoute.withParam("enter_from", UriProtector.getQueryParameter(uri, "enter_from"));
                    buildRoute.withParam("enter_method", UriProtector.getQueryParameter(uri, "enter_method"));
                    buildRoute.withParam("id", lastPathSegment);
                    buildRoute.open();
                    return;
                }
                if (C234869Jq.LIZ()) {
                    C55480Lq0.LIZIZ.LIZIZ(1);
                    HG3.LJIIL();
                    String curUserId = HG3.LJLJL.LJFF().getCurUserId();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("//add_yours/hub/");
                    LIZ.append(curUserId);
                    SmartRoute buildRoute2 = SmartRouter.buildRoute(activity, X1D.LIZIZ(LIZ));
                    buildRoute2.withParam("is_from_qa", true);
                    buildRoute2.withParam("show_topic_detail", 1);
                    buildRoute2.withParam("topic_id", lastPathSegment);
                    buildRoute2.withParam("enter_from", UriProtector.getQueryParameter(uri, "enter_from"));
                    buildRoute2.withParam("enter_method", "qa_share");
                    buildRoute2.open();
                    return;
                }
                AnonymousClass114.LIZ(activity, R.string.pqk);
            }

            @Override // X.M56
            public final boolean LJ(android.net.Uri uri, String scheme, String host, String path) {
                o.LJIIIZ(uri, "uri");
                o.LJIIIZ(scheme, "scheme");
                o.LJIIIZ(host, "host");
                o.LJIIIZ(path, "path");
                return o.LJ(host, "qna");
            }
        });
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public EE1 getFetchImUnder16RequestTask() {
        return new FetchImUnder16RequestTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public EFM getFetchUnifiedSettingRequest() {
        return new FetchUnifiedSettingRequest(1);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment getFollowFragmentCache() {
        C36093EEn c36093EEn = C36093EEn.LIZ;
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask = ColdBootPreloadInstanceTask.LJLJJI;
        c36093EEn.getClass();
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask2 = (ColdBootPreloadInstanceTask) C36093EEn.LJFF(coldBootPreloadInstanceTask);
        Fragment fragment = coldBootPreloadInstanceTask2.LJLILLLLZI;
        if (fragment == null) {
            return null;
        }
        coldBootPreloadInstanceTask2.LJLILLLLZI = null;
        return fragment;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean getLeakUploadEnableExperimentValue() {
        return C19N.LJ("leak_hprof_upload", false);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public EE1 getLikoInitTask() {
        return new EE1() { // from class: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask
            @Override // X.EEY
            public final String key() {
                return "PerformanceActivityObserver$LikoInitTask";
            }

            @Override // X.EEY
            public final /* synthetic */ boolean meetTrigger() {
                return true;
            }

            @Override // X.EEY
            public final /* synthetic */ String prefix() {
                return "task_";
            }

            @Override // X.EE1
            public final /* synthetic */ boolean serialExecute() {
                return false;
            }

            @Override // X.EEY
            public final /* synthetic */ int targetProcess() {
                return C0RN.LIZ();
            }

            @Override // X.EEY
            public final /* synthetic */ List triggerOtherLegoComponents() {
                return null;
            }

            @Override // X.EEY
            public final /* synthetic */ EnumC36103EEx triggerType() {
                return C0RN.LIZIZ(this);
            }

            @Override // X.EEY
            public final EnumC36092EEm scenesType() {
                return EnumC36092EEm.DEFAULT;
            }

            @Override // X.EE1
            public final EFK type() {
                return EFK.BACKGROUND;
            }

            @Override // X.EEY
            public final void run(Context context) {
                try {
                    InterfaceC39611Fgd interfaceC39611Fgd = new InterfaceC39611Fgd() { // from class: X.FgX
                        @Override // X.InterfaceC39611Fgd
                        public final void LIZ(List list, C39602FgU c39602FgU) {
                            getClass();
                            ((PerformanceActivityObserver$FileApi) RetrofitFactory.LIZLLL().create("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/").create(PerformanceActivityObserver$FileApi.class)).upload("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/", list).enqueue(new IDdS378S0100000_6(c39602FgU, 4));
                        }
                    };
                    InterfaceC39611Fgd.LIZ.getClass();
                    C39613Fgf.LIZ = interfaceC39611Fgd;
                    LeakDetectorInstaller.INSTANCE.tryInstall(context);
                    C39606FgY.LIZ();
                    C39615Fgh.LIZ = new C39610Fgc();
                } catch (Throwable unused) {
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public EE1 getPreloadActicityTask() {
        return new PreloadActicityTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public IEvent getPublishConcatMessage() {
        return new C40359Fsh(null, -1);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment getRecommendFragmentCache() {
        C36093EEn c36093EEn = C36093EEn.LIZ;
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask = ColdBootPreloadInstanceTask.LJLJJI;
        c36093EEn.getClass();
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask2 = (ColdBootPreloadInstanceTask) C36093EEn.LJFF(coldBootPreloadInstanceTask);
        FeedRecommendFragment feedRecommendFragment = coldBootPreloadInstanceTask2.LJLIL;
        if (feedRecommendFragment == null) {
            return null;
        }
        coldBootPreloadInstanceTask2.LJLIL = null;
        return feedRecommendFragment;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public EE1 getRegisterStorageTask() {
        return C88546Yp4.LIZIZ.getRegisterStorageTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void hideUploadRecover() {
        C2U8.LIZ(new C41668GWy());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isContainsKeyWithLruEntries() {
        return C38457F7l.LIZIZ.isContainsKeyWithLruEntries();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isLimitAdTrackingEnabled() {
        if (((Boolean) C39424Fdc.LIZJ.getValue()).booleanValue()) {
            return true;
        }
        if (!C39424Fdc.LIZIZ) {
            C39424Fdc.LIZIZ = true;
            if (EU2.LIZIZ()) {
                C10K.LIZIZ(CallableC39420FdY.LJLIL, C38995FSd.LIZLLL(), null);
            } else {
                C10K.LIZJ(CallableC39421FdZ.LJLIL);
            }
        }
        return C39424Fdc.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isReplaceAwemeCache() {
        return C38457F7l.LIZIZ.isReplaceAwemeCache();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public InterfaceC56220M4q routerDepend() {
        return new C56219M4p();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void unRegisterModerationResultPush() {
        C56228M4y c56228M4y = C56228M4y.LJLIL;
        if (C35154Dqw.LIZ()) {
            C67128QWe c67128QWe = C67128QWe.LIZIZ;
            c67128QWe.LJIIJJI(c56228M4y);
            c67128QWe.LIZIZ();
            C56228M4y.LJLJJI = false;
            return;
        }
        C67143QWt c67143QWt = QWY.LJIIIZ;
        QWY LIZ = c67143QWt.LIZ();
        M50 psm = C56228M4y.LIZJ();
        o.LJIIIZ(psm, "psm");
        LIZ.LJIIIIZZ.remove(psm);
        QWY LIZ2 = c67143QWt.LIZ();
        M50 psm2 = C56228M4y.LIZIZ();
        o.LJIIIZ(psm2, "psm");
        LIZ2.LJIIIIZZ.remove(psm2);
        C56228M4y.LJLJJI = false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getAccessKey() {
        return C38943FQd.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public int getAppVersionCode() {
        return (int) EF7.LJI();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public int getLauncherIconRes() {
        AppWidgetServiceImpl.LJIJI().getLauncherIconRes();
        return R.drawable.b8a;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isAppHot() {
        return C61017Nx7.LIZ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isAwemeAppDataEmpty() {
        if (FJU.LIZIZ() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isLastPublishFailed() {
        if (SharePrefCache.inst().getLastPublishFailed() != null && SharePrefCache.inst().getLastPublishFailed().LIZ().booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment obtainMainPageFragment() {
        if (MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
            Bundle bundle = new Bundle();
            MainPageFragment mainPageFragment = new MainPageFragment();
            mainPageFragment.setArguments(bundle);
            return mainPageFragment;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment obtainSecondTabFragment() {
        if (!MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("i18n_tab_mode", Boolean.TRUE);
        Fragment LJJJLL = C55734Lu6.LIZIZ.LJJJLL();
        LJJJLL.setArguments(bundle);
        return LJJJLL;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getApiUrlPrefix() {
        return Api.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getMainActivityClass() {
        return MainActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public EE1 getPreloadInstanceTask() {
        return ColdBootPreloadInstanceTask.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public EE1 getPreloadResourcesTask() {
        return PreloadResourcesTask.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getSplashActivityClass() {
        return SplashActivity.class;
    }

    public static IMainService createIMainServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IMainService.class, z);
        if (LIZ != null) {
            return (IMainService) LIZ;
        }
        return new MainServiceImpl();
    }

    private JSONArray jsonArrayToJSONArray(g gVar) {
        return new JSONArray(gVar.toString());
    }

    private JSONObject jsonObjectToJSONObject(m mVar) {
        return new JSONObject(mVar.toString());
    }

    private List<String> mergeKeys(List<String> list) {
        HashSet hashSet = new HashSet();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String[] split = it.next().split("\\.");
            if (split.length > 0) {
                hashSet.add(split[0]);
            }
        }
        return new ArrayList(hashSet);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public AVMusic avMusicApply(MusicModel musicModel) {
        new I9R();
        return I9R.LIZ(musicModel);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getAnywhereChannelPath(String str) {
        return O3U.LIZJ(C38943FQd.LIZ(), str);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getAppLinkHandlerActivityClass(boolean z) {
        if (z) {
            return DeepLinkServiceImpl.LIZ().LJIIL();
        }
        return DeepLinkServiceImpl.LIZ().LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getDeepLinkHandlerActivityClass(boolean z) {
        IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();
        if (z) {
            return LIZ.LJIIZILJ();
        }
        return LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Long getFeedCount(Integer num) {
        if (num == null || num.intValue() != 0) {
            return null;
        }
        return Long.valueOf(C47698Inm.LIZ.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Intent getMainActivityIntent(Context context) {
        return C51029K0z.LJIJI(context);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getSecurityUrl(String str) {
        return M60.LIZ(str, OZ1.LIZIZ.LJFF());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Map<String, Object> getSettings(List<String> list) {
        try {
            Map<String, Object> settings = C37019Efv.LIZIZ.getSettings(mergeKeys(list));
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : settings.entrySet()) {
                if (entry.getValue() != null) {
                    if (entry.getValue() instanceof m) {
                        hashMap.put(entry.getKey(), jsonObjectToJSONObject((m) entry.getValue()));
                    } else if (entry.getValue() instanceof g) {
                        hashMap.put(entry.getKey(), jsonArrayToJSONArray((g) entry.getValue()));
                    } else {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str : list) {
                Object retrieveSettingValue = retrieveSettingValue(str, hashMap);
                if (retrieveSettingValue != null) {
                    hashMap2.put(str, retrieveSettingValue);
                }
            }
            return hashMap2;
        } catch (Exception unused) {
            return new HashMap();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isDeepLinkHandlerActivity(Context context) {
        IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();
        if (LIZ.isDeepLinkHandlerActivity(context) || LIZ.LIZLLL(context)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isMainPage(Context context) {
        return context instanceof MainActivity;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isOnFollowPage(Activity activity) {
        if (activity != null && (activity instanceof MainActivity)) {
            MainActivity mainActivity = (MainActivity) activity;
            if (C54153LNd.LIZIZ(mainActivity) && (mainActivity.getCurFragment() instanceof MainFragment)) {
                MainFragment mainFragment = (MainFragment) mainActivity.getCurFragment();
                if (mainFragment.getUserVisibleHint() && mainFragment.lj()) {
                    return true;
                }
            }
            String nv0 = C116694i1.LIZ(mainActivity).nv0();
            if (C54153LNd.LIZJ(activity) && TextUtils.equals(nv0, "Following")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void pendingDeepLinkLog(final InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        Objects.requireNonNull(interfaceC88472Yns);
        NO5.LJIJI(new N2X() { // from class: X.M4n
            @Override // X.N2X
            public final void LIZ(boolean z) {
                InterfaceC88472Yns.this.invoke(Boolean.valueOf(z));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void registerModerationResultPush(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        C56228M4y c56228M4y = C56228M4y.LJLIL;
        C82555Wad c82555Wad = new C82555Wad(3, interfaceC88472Yns);
        if (C56228M4y.LJLJJI) {
            return;
        }
        C56228M4y.LJLJJL = c82555Wad;
        if (C35154Dqw.LIZ()) {
            C67128QWe c67128QWe = C67128QWe.LIZIZ;
            c67128QWe.LJIIIIZZ(c56228M4y);
            c67128QWe.LIZJ(C56228M4y.LIZIZ().LJLIL, C56228M4y.LIZIZ().LJLILLLLZI, c56228M4y);
            c67128QWe.LIZJ(C56228M4y.LIZJ().LJLIL, C56228M4y.LIZJ().LJLILLLLZI, c56228M4y);
        } else {
            C67143QWt c67143QWt = QWY.LJIIIZ;
            c67143QWt.LIZ().LIZJ(c56228M4y);
            c67143QWt.LIZ().LIZLLL(C56228M4y.LIZJ(), c56228M4y);
            c67143QWt.LIZ().LIZLLL(C56228M4y.LIZIZ(), c56228M4y);
        }
        C56228M4y.LJLJJI = true;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void releaseWindowBackgroundTask(Activity activity) {
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new ReleaseWindowBackgroundTask(activity), true);
        LIZJ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void restartApp(Bundle bundle) {
        C40384Ft6.LIZIZ(bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void setLastPublishFailed(boolean z) {
        SharePrefCache.inst().getLastPublishFailed().LIZLLL(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void setOptSmartAvatarBorderView(boolean z) {
        C57127MbT.setOpt(z);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void setSwitchAccountRestartPending(boolean z) {
        C40384Ft6.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void startCleanEffect(Context context) {
        if (context == null || CleanEffectsTask.LJLIL || C84763XOl.LJIIIIZZ() != null) {
            return;
        }
        C10K.LIZIZ(new ACallableS109S0100000_6(context, 2), C38995FSd.LIZIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void tryToShowPromoteProgram(Activity activity) {
        if (activity == null || activity.isFinishing() || !((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        PromoteProgramDialog promoteProgramDialog = C56215M4l.LIZ;
        if (promoteProgramDialog != null) {
            promoteProgramDialog.dismiss();
            C56215M4l.LIZ = null;
        }
        Boolean LIZ = SharePrefCache.inst().getPromoteDialogShouldShow().LIZ();
        if (LIZ == null || !LIZ.booleanValue()) {
            return;
        }
        String string = C56215M4l.LIZ().getString("uid", "");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (TextUtils.isEmpty(string)) {
            SharedPreferences.Editor edit = C56215M4l.LIZ().edit();
            edit.putString("uid", curUserId);
            edit.apply();
            string = curUserId;
        }
        if (!string.equals(curUserId)) {
            SharedPreferences.Editor edit2 = C56215M4l.LIZ().edit();
            edit2.putBoolean("joined", false);
            edit2.putString("uid", curUserId);
            edit2.putInt("popup_times", 0);
            edit2.putLong("popup_last_time", 0L);
            edit2.apply();
        }
        if (C56215M4l.LIZ().getBoolean("joined", false)) {
            return;
        }
        int i = C56215M4l.LIZ().getInt("popup_times", 0);
        long j = C56215M4l.LIZ().getLong("popup_last_time", 0L);
        Integer LIZ2 = SharePrefCache.inst().getPromoteDialogPopupPopupInterval().LIZ();
        if (i >= SharePrefCache.inst().getPromoteDialogPopupTimesLimit().LIZ().intValue() || System.currentTimeMillis() - j <= LIZ2.intValue() * 1000 * 3600 * 24) {
            return;
        }
        SharedPreferences.Editor edit3 = C56215M4l.LIZ().edit();
        edit3.putInt("popup_times", i + 1);
        edit3.putLong("popup_last_time", System.currentTimeMillis());
        edit3.apply();
        PromoteProgramDialog promoteProgramDialog2 = new PromoteProgramDialog(activity, "", (int) KL2.LIZJ(EF7.LIZIZ(), 52.0f));
        C56215M4l.LIZ = promoteProgramDialog2;
        promoteProgramDialog2.setOnDismissListener(new DialogInterfaceOnDismissListenerC56213M4j());
        FMX.LJIIL("creative_permission_show", new C188727au().LIZ);
        PromoteProgramDialog promoteProgramDialog3 = C56215M4l.LIZ;
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/promote/PromoteProgramDialog", "show", promoteProgramDialog3, new Object[0], "void", new C65300Pk0(false, "()V", "4136303025244994472")).LIZ) {
            return;
        }
        promoteProgramDialog3.show();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void updateIMUserFollowStatus(User user) {
        IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIJJLI(C78966Uyw.LJIIZILJ(user));
    }

    public static /* synthetic */ C76800UCe lambda$registerModerationResultPush$2(InterfaceC88472Yns interfaceC88472Yns, String str) {
        interfaceC88472Yns.invoke(str);
        return null;
    }

    private Object retrieveSettingValue(String str, Map<String, Object> map) {
        Object opt;
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return null;
        }
        int i = 0;
        Object obj = map;
        while (obj != null && i < split.length) {
            String str2 = split[i];
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(str2)) {
                    opt = map2.get(str2);
                    i++;
                    obj = opt;
                }
            }
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.opt(str2) != null) {
                    opt = jSONObject.opt(str2);
                    i++;
                    obj = opt;
                }
            }
            return null;
        }
        return obj;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void changeStatusBarMainTab(Activity activity, String str) {
        IAX.LIZ(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void checkAmplify(Activity activity, int i) {
        if (activity != null) {
            AmplifyManager.INSTANCE.checkAmplify(activity, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getFeedOrder(Aweme aweme, Integer num) {
        if (num == null || num.intValue() != 0) {
            return null;
        }
        return C227768wm.LJIIL(num.intValue(), aweme);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean handleLiveSchema(String str, Context context) {
        return LiveOuterService.LJJJLL().LJJIIJ().LIZIZ(context, str).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openGpByPackageName(Context context, String str) {
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            C16880lQ.LLLLLLZ(context.getPackageManager(), "com.google.market", 0);
            z = NP8.LIZ(context);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (!z) {
            return M53.LIZ(context, str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("market://details?id=");
        LIZ.append(str);
        Uri.Builder buildUpon = UriProtector.parse(X1D.LIZIZ(LIZ)).buildUpon();
        if (!TextUtils.isEmpty(null)) {
            buildUpon.appendQueryParameter("referrer", null);
        }
        Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
        return NO5.LJIL(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openSystemBrowser(Context context, String str) {
        return NO5.LJIJ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void preloadStageTask(int i, Context context) {
        if (context == null || !FCD.LJI(context)) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Iterator it = ((Set) L8W.LIZ.getValue()).iterator();
            while (it.hasNext()) {
                ((InterfaceC55378LoM) it.next()).LIZIZ();
            }
            return;
        }
        Iterator it2 = ((Set) L8W.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC55378LoM) it2.next()).LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean shouldShowCommerceTagOnFeed(Aweme aweme, Integer num) {
        num.intValue();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void trackAppsFlyerEvent(String str, String str2) {
        IAX.LIZJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void tryToShowPromoteNotification(Activity activity, int i) {
        PromoteGdprManager.inst().tryToShowPromoteNotification(activity, i);
    }

    public static void lambda$downloadStickerHelper$0(String str, String str2, Effect effect) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", str2);
        c188727au.LJIIIZ("shoot_way", "scan");
        c188727au.LJIIIZ("prop_id", str);
        FMX.LJIIL("shoot", c188727au.LIZ);
    }

    public static /* synthetic */ void lambda$downloadStickerHelper$1(IMainService.DownLoadFinishListener downLoadFinishListener, int i, Effect effect) {
        boolean z;
        if (i == 2006) {
            z = true;
        } else {
            z = false;
        }
        downLoadFinishListener.doAfterDownLoad(i, Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean checkIsMinAppVersionNotSatisfied(Activity activity, String str, String str2) {
        return DeepLinkServiceImpl.LIZ().LJ(activity, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openAdOpenUrl(Context context, String str, boolean z) {
        return NO5.LJI(context, str, z);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openAdTestUrl(Context context, String str, int i) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openAdWebUrl(Context context, String str, String str2) {
        return NO5.LJII(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Boolean openAppLinkHandlerV2ActivityClass(Context context, String str, String str2) {
        if (!str.isEmpty() && (str.toLowerCase(Locale.getDefault()).startsWith("https://") || str.toLowerCase(Locale.getDefault()).startsWith("http://"))) {
            Intent intent = new Intent(context, DeepLinkServiceImpl.LIZ().LJIIL());
            intent.setData(UriProtector.parse(str));
            intent.addFlags(268435456);
            intent.putExtra("is_from_self", true);
            intent.putExtra("in_app_enter_from", str2);
            C16880lQ.LIZJ(context, intent);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void openDeepLinkActivity(Context context, String str, String str2) {
        Intent intent = new Intent(context, DeepLinkServiceImpl.LIZ().LJIIZILJ());
        intent.setData(UriProtector.parse(str));
        intent.addFlags(268435456);
        intent.putExtra("is_from_self", true);
        intent.putExtra("in_app_enter_from", str2);
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean searchAdTransformOpen(Context context, Aweme aweme, int i) {
        if (context != null && aweme != null && C63081OpJ.LJJLIIIJJI(aweme) && aweme.getAwemeRawAd() != null) {
            String type = aweme.getAwemeRawAd().getType();
            if (!TextUtils.isEmpty(type)) {
                type.getClass();
                if (!type.equals("app")) {
                    if (!type.equals("web")) {
                        return true;
                    }
                    return NO5.LIZJ(context, aweme, i);
                }
                NOE.LJJIFFI(context, aweme, i);
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public IAVPublishService.PublishProgressFragment showPublishDialogFragmentForParallelPublish(Object obj, FragmentManager fragmentManager, InterfaceC42037Gef interfaceC42037Gef) {
        InterfaceC36571c5 LJJJIL = fragmentManager.LJJJIL("publish");
        if (LJJJIL instanceof IAVPublishService.PublishProgressFragment) {
            IAVPublishService.PublishProgressFragment publishProgressFragment = (IAVPublishService.PublishProgressFragment) LJJJIL;
            if (AVExternalServiceImpl.LIZ().publishService().isPublishDialogFragment(publishProgressFragment)) {
                publishProgressFragment.dismissAllowingStateLossNow();
            }
        }
        IAVPublishService.PublishProgressFragment publishProgressFragment2 = (IAVPublishService.PublishProgressFragment) fragmentManager.LJJJIL("publish");
        if (publishProgressFragment2 == null) {
            IAVPublishService.PublishProgressFragment publishProgressFragment3 = AVExternalServiceImpl.LIZ().publishService().getPublishProgressFragment(true);
            publishProgressFragment3.show(fragmentManager, "publish");
            return publishProgressFragment3;
        }
        publishProgressFragment2.show(true);
        return publishProgressFragment2;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean startAdsAppActivity(Context context, String str, String str2) {
        return C57422MgE.LIZIZ(context, str, str2, false);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean tryShowIllegalUsernameDialog(final String enterFrom, Runnable runnable, final Runnable runnable2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        final long currentTimeMillis = System.currentTimeMillis();
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (!a.LJ().LJ(4) && !Z8A.LIZIZ.userNameLegitimate() && LJIIIIZZ != null && ((RBX) HG3.LJIILL()).isLogin()) {
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            String userId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(userId, "userId");
            Keva keva = C9WK.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("last_illegal_dialog_show_");
            LIZ.append(userId);
            long j = currentTimeMillis - keva.getLong(X1D.LIZIZ(LIZ), -1L);
            int LIZ2 = C00F.LIZ(31744, 0, "username_modify_tip_interval_2", true);
            if (LIZ2 == 1 ? !(j <= 172800000 || (!o.LJ(enterFrom, "comment") && !o.LJ(enterFrom, "profile"))) : !(LIZ2 == 2 ? j <= 172800000 || (!o.LJ(enterFrom, "comment") && !o.LJ(enterFrom, "publish")) : LIZ2 == 3 ? j <= 172800000 || (!o.LJ(enterFrom, "comment") && !o.LJ(enterFrom, "publish") && !o.LJ(enterFrom, "profile")) : LIZ2 != 4 || j <= 604800000 || (!o.LJ(enterFrom, "comment") && !o.LJ(enterFrom, "publish") && !o.LJ(enterFrom, "profile")))) {
                final Dialog changeIllegalUsernameDialog = AccountHelperService.createIAccountHelperServicebyMonsterPlugin(false).getChangeIllegalUsernameDialog(LJIIIIZZ, curUser);
                C9WK.LIZ = currentTimeMillis;
                C9WK.LIZIZ = enterFrom;
                changeIllegalUsernameDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.9WJ
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        String str;
                        C9WH c9wh;
                        Runnable runnable3 = runnable2;
                        if (runnable3 != null) {
                            runnable3.run();
                        }
                        KeyEvent.Callback callback = changeIllegalUsernameDialog;
                        if (!(callback instanceof C9WH) || (c9wh = (C9WH) callback) == null || (str = c9wh.LIZ()) == null) {
                            str = "background";
                        }
                        C9WK.LIZ(System.currentTimeMillis() - currentTimeMillis, enterFrom, str);
                        C9WK.LIZ = -1L;
                    }
                });
                if (runnable != null) {
                    runnable.run();
                }
                C16880lQ.LIZ(changeIllegalUsernameDialog);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", enterFrom);
                FMX.LJIIL("notify_username", c188727au.LIZ);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("last_illegal_dialog_show_");
                LIZ3.append(userId);
                keva.storeLong(X1D.LIZIZ(LIZ3), currentTimeMillis);
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Intent getAwemeWebIntent(Context context, Uri uri, Boolean bool, Boolean bool2) {
        return C57422MgE.LIZ(context, uri, bool.booleanValue(), bool2.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri, Boolean bool, Boolean bool2) {
        return C57422MgE.LIZ(context, uri, bool.booleanValue(), bool2.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void startBulletActivity(Context context, String str, String str2, Bundle bundle) {
        C57415Mg7.LIZIZ(context, str, str2, bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void downloadStickerHelper(final String str, String str2, Activity activity, boolean z, final IMainService.DownLoadFinishListener downLoadFinishListener) {
        MBR mbr = new MBR();
        mbr.LIZIZ = "scan";
        mbr.LJIIJ = false;
        mbr.LJIIL = new InterfaceC74183T9n() { // from class: X.M4o
            @Override // X.InterfaceC74183T9n
            public final void LIZ(Effect effect, String str3) {
                MainServiceImpl.lambda$downloadStickerHelper$0(str, str3, effect);
            }
        };
        mbr.LJIILIIL = new InterfaceC74184T9o() { // from class: X.M4m
            @Override // X.InterfaceC74184T9o
            public final void LIZ(int i, Effect effect) {
                MainServiceImpl.lambda$downloadStickerHelper$1(IMainService.DownLoadFinishListener.this, i, effect);
            }
        };
        mbr.LJIIIIZZ = "qrcode";
        PropReuseServiceImpl.LJIIJ().LJFF(activity, C05040Hs.LIZIZ(str), mbr.LIZ(), z);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void startVideoPlayActivity(Context context, String playAddrString, String coverImageString, boolean z, String videoId, String md5, String str, String str2, float f) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(playAddrString, "playAddrString");
        o.LJIIIZ(coverImageString, "coverImageString");
        o.LJIIIZ(videoId, "videoId");
        o.LJIIIZ(md5, "md5");
        Intent intent = new Intent(context, (Class<?>) VideoPlayActivity.class);
        intent.putExtra("play_addr_string", playAddrString);
        intent.putExtra("cover_image_string", coverImageString);
        intent.putExtra("loop", z);
        intent.putExtra("video_id", videoId);
        intent.putExtra("video_md5", md5);
        intent.putExtra("enter_from", str);
        intent.putExtra("video_type", str2);
        intent.putExtra("progress", f);
        intent.putExtra("tag_line", "");
        C16880lQ.LIZJ(context, intent);
    }
}
