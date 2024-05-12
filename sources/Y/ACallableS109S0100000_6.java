package Y;

import X.AV1;
import X.AXW;
import X.AbstractC36908Ee8;
import X.AbstractC40550Fvm;
import X.AbstractC43051Gv1;
import X.C09970aH;
import X.C141335gf;
import X.C16880lQ;
import X.C1FP;
import X.C221018lt;
import X.C34K;
import X.C35971E9v;
import X.C36244EKi;
import X.C36698Eak;
import X.C36712Eay;
import X.C36872EdY;
import X.C36922EeM;
import X.C36970Ef8;
import X.C37065Egf;
import X.C37066Egg;
import X.C37095Eh9;
import X.C37100EhE;
import X.C37101EhF;
import X.C38297F1h;
import X.C38298F1i;
import X.C38333F2r;
import X.C38891fp;
import X.C38957FQr;
import X.C39579Fg7;
import X.C39595FgN;
import X.C39687Fhr;
import X.C39689Fht;
import X.C3C5;
import X.C40533FvV;
import X.C40535FvX;
import X.C41944GdA;
import X.C43462H3y;
import X.C44191HVz;
import X.C48236IwS;
import X.C58725N2z;
import X.C60903NvH;
import X.C64797Pbt;
import X.C64920Pds;
import X.C64923Pdv;
import X.C68322mC;
import X.C68517Qun;
import X.C68986R5q;
import X.C76800UCe;
import X.C80036Vb6;
import X.C84763XOl;
import X.C87093YGb;
import X.C94603nU;
import X.EF7;
import X.EJ6;
import X.EM2;
import X.EYV;
import X.EnumC62956OnI;
import X.F9J;
import X.F9U;
import X.FCD;
import X.FLE;
import X.FMX;
import X.FSM;
import X.H7B;
import X.HG3;
import X.InterfaceC26386AXe;
import X.InterfaceC37286EkE;
import X.InterfaceC40525FvN;
import X.InterfaceC65784Pro;
import X.P8H;
import X.QJY;
import X.QXB;
import X.R41;
import X.RBX;
import X.RunnableC37185Eib;
import X.X1D;
import android.app.Activity;
import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.m;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.effect.EffectCompatJobService;
import com.ss.android.ugc.aweme.effect.EffectJobService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.PerformanceActivityAssem;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.request_combine.PortraitCombineModel;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.request_combine.model.ComplianceSettingCombineModel;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.ShareSettingApi;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes7.dex */
public class ACallableS109S0100000_6 implements Callable {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object call$23(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        return ((InterfaceC65784Pro) aCallableS109S0100000_6.l0).invoke();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            case 18:
                return call$18(this);
            case 19:
                return call$19(this);
            case 20:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            case 24:
                return call$24(this);
            case 25:
                return call$25(this);
            case 26:
                return call$26(this);
            case 27:
                return call$27(this);
            case 28:
                return call$28(this);
            case 29:
                return call$29(this);
            case 30:
                return call$30(this);
            case 31:
                return call$31(this);
            case 32:
                return call$32(this);
            case 33:
                return call$33(this);
            case 34:
                return call$34(this);
            case 35:
                return call$35(this);
            case 36:
                return call$36(this);
            case 37:
                return call$37(this);
            case 38:
                return call$38(this);
            case 39:
                return call$39(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return call$40(this);
            case 41:
                return call$41(this);
            case 42:
                return call$42(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        int optInt = C39595FgN.LIZIZ.optInt("strategy", 0);
        if (optInt > 0) {
            C39595FgN.LIZIZ.put("url", "https://api-va.tiktokv.com/");
            MemoryConfig.initJsonConfig(C39595FgN.LIZIZ.toString());
            LeakDetectorInstaller leakDetectorInstaller = LeakDetectorInstaller.INSTANCE;
            Handler handler = leakDetectorInstaller.getHandler();
            if (handler != null) {
                handler.post(new ARunnableS10S0101000_6(optInt, aCallableS109S0100000_6, 5));
            }
            leakDetectorInstaller.setTrySumTime(0L);
            return C76800UCe.LIZ;
        }
        if (optInt == 0) {
            LeakDetectorInstaller leakDetectorInstaller2 = LeakDetectorInstaller.INSTANCE;
            leakDetectorInstaller2.setTrySumTime(leakDetectorInstaller2.getTrySumTime() + 10000);
            Handler handler2 = leakDetectorInstaller2.getHandler();
            if (handler2 != null) {
                return Boolean.valueOf(handler2.sendEmptyMessageDelayed(0, 10000L));
            }
            return null;
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        String str;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Missing Compliance Encrypt param! ");
        Request request = (Request) aCallableS109S0100000_6.l0;
        if (request != null) {
            str = request.getUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        C16880lQ.LLZILL(Toast.makeText(LJIIIIZZ, X1D.LIZIZ(LIZ), 1));
        return C76800UCe.LIZ;
    }

    public static final Object call$10(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        Bundle bundle = (Bundle) aCallableS109S0100000_6.l0;
        try {
            User queryUser = R41.LIZ().queryUser(null, true);
            C68986R5q.LIZ(true, 0, "", bundle);
            int ageGatePostAction = queryUser.getAgeGatePostAction();
            EnumC62956OnI enumC62956OnI = EnumC62956OnI.PASS;
            if (ageGatePostAction == enumC62956OnI.getValue()) {
                int i = bundle.getInt("age_gate_post_action", -1);
                if (i != -1) {
                    queryUser.setAgeGatePostAction(i);
                    queryUser.setAgeGateAction(enumC62956OnI.getValue());
                    String uid = queryUser.getUid();
                    SharedPreferences.Editor edit = C40535FvX.LIZ().edit();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("ftc_age_gate_response_mode");
                    LIZ.append(uid);
                    edit.putInt(X1D.LIZIZ(LIZ), i).apply();
                    String uid2 = queryUser.getUid();
                    o.LJIIIZ(uid2, "uid");
                    C40533FvV.LIZ.put(uid2, Integer.valueOf(i));
                } else {
                    int LIZ2 = C40533FvV.LIZ(queryUser.getUid());
                    if (LIZ2 != -1) {
                        queryUser.setAgeGatePostAction(LIZ2);
                        queryUser.setAgeGateAction(enumC62956OnI.getValue());
                    }
                }
            }
            if (queryUser.getUserMode() == 0) {
                SharedPreferences LIZIZ = F9J.LIZIZ(C58725N2z.LIZ, 0, "aweme_user");
                int i2 = bundle.getInt("user_mode", -1);
                if (i2 != 2 && i2 != 1) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("ftc_user_mode_prefix_");
                    LIZ3.append(queryUser.getUid());
                    int i3 = LIZIZ.getInt(X1D.LIZIZ(LIZ3), 0);
                    if (i3 == 2 || i3 == 1) {
                        queryUser.setUserMode(i3);
                    }
                } else {
                    queryUser.setUserMode(i2);
                    SharedPreferences.Editor edit2 = LIZIZ.edit();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("ftc_user_mode_prefix_");
                    LIZ4.append(queryUser.getUid());
                    edit2.putInt(X1D.LIZIZ(LIZ4), i2).commit();
                }
            }
            C68517Qun.LIZ.LJIJJ(queryUser);
            return queryUser;
        } catch (C38333F2r e) {
            C68986R5q.LIZ(false, e.getErrorCode(), e.getErrorMsg(), bundle);
            throw e;
        }
    }

    public static final Object call$11(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        InterfaceC40525FvN interfaceC40525FvN = (InterfaceC40525FvN) ((AqS172S0100000_6) ((ACallableS83S0200000_6) aCallableS109S0100000_6.l0).l0).l0;
        if (interfaceC40525FvN != null) {
            interfaceC40525FvN.onFailed("file not found");
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$12(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        String str;
        String str2;
        ((C43462H3y) aCallableS109S0100000_6.l0).getClass();
        List<InterfaceC37286EkE> LJIIJ = P8H.LJIIJ();
        if (LJIIJ != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LJIIJ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!(next instanceof AbstractC43051Gv1)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                InterfaceC37286EkE interfaceC37286EkE = (InterfaceC37286EkE) next2;
                if (interfaceC37286EkE != null) {
                    str2 = interfaceC37286EkE.LJ();
                } else {
                    str2 = null;
                }
                if (o.LJ(str2, "CACHE")) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((InterfaceC37286EkE) it3.next()).LIZJ();
            }
        }
        List<InterfaceC37286EkE> LJIIJ2 = P8H.LJIIJ();
        if (LJIIJ2 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = ((ArrayList) LJIIJ2).iterator();
            while (it4.hasNext()) {
                Object next3 = it4.next();
                if (!(next3 instanceof AbstractC43051Gv1)) {
                    arrayList3.add(next3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Object next4 = it5.next();
                InterfaceC37286EkE interfaceC37286EkE2 = (InterfaceC37286EkE) next4;
                if (interfaceC37286EkE2 != null) {
                    str = interfaceC37286EkE2.LJ();
                } else {
                    str = null;
                }
                if (o.LJ(str, "RESOURCE")) {
                    arrayList4.add(next4);
                }
            }
            Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                ((InterfaceC37286EkE) it6.next()).LIZJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$13(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        Object LIZ;
        try {
            LIZ = Long.valueOf(Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = 0L;
        }
        long longValue = ((Number) LIZ).longValue();
        if (longValue > 0) {
            ((C36712Eay) aCallableS109S0100000_6.l0).LIZIZ = System.currentTimeMillis();
            ((C36712Eay) aCallableS109S0100000_6.l0).LIZJ = longValue;
        }
        return Long.valueOf(((C36712Eay) aCallableS109S0100000_6.l0).LIZJ);
    }

    public static final Object call$14(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        C36244EKi.LIZIZ("");
        ((QXB) aCallableS109S0100000_6.l0).getClass();
        QXB.LIZ();
        return null;
    }

    public static final Object call$15(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        AbstractC40550Fvm abstractC40550Fvm = (AbstractC40550Fvm) aCallableS109S0100000_6.l0;
        for (String moduleName : abstractC40550Fvm.LJIIIIZZ()) {
            o.LJIIIIZZ(moduleName, "moduleName");
            String LIZIZ = C36970Ef8.LIZIZ(moduleName);
            if (LIZIZ != null) {
                C37095Eh9.LIZ(new C37100EhE(LIZIZ, abstractC40550Fvm));
                ConcurrentHashMap<String, AbstractC40550Fvm> concurrentHashMap = C37101EhF.LIZIZ;
                synchronized (concurrentHashMap) {
                    concurrentHashMap.put(LIZIZ, abstractC40550Fvm);
                }
            }
        }
        Iterator<String> it = abstractC40550Fvm.LJII().iterator();
        while (it.hasNext()) {
            String LJFF = i0.LJFF("com.ss.android.ugc.aweme.dflanguage.", it.next());
            C37095Eh9.LIZ(new C37100EhE(LJFF, abstractC40550Fvm));
            C37101EhF.LIZ(LJFF, abstractC40550Fvm);
        }
        return null;
    }

    public static final Object call$16(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        Keva repoFromSp = KevaImpl.getRepoFromSp((Context) aCallableS109S0100000_6.l0, "setting_repo_sp", 0);
        if (repoFromSp != null) {
            repoFromSp.storeInt("key_has_local_cache", 1);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$17(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        IComplianceSettingsService LJIIZILJ = a.LJIIZILJ();
        ComplianceSetting complianceSetting = ((ComplianceSettingCombineModel) aCallableS109S0100000_6.l0).getComplianceSetting();
        o.LJI(complianceSetting);
        LJIIZILJ.LJ(complianceSetting);
        return C76800UCe.LIZ;
    }

    public static final Object call$18(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        String LJLLJ = C16880lQ.LJLLJ(((Activity) aCallableS109S0100000_6.l0).getClass());
        if (C09970aH.LIZ != null) {
            F9U.LIZ.LIZJ(new IDRunnableS6S1000000(LJLLJ, 2));
            return null;
        }
        C80036Vb6.LJIIIIZZ("apm_debug", "ApmAgent#stopCollectCurrent  apm do not be init");
        return null;
    }

    public static final Object call$19(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        AppLogNewUtils.onEventV3("first_feed_show_time_v3", (JSONObject) aCallableS109S0100000_6.l0);
        return null;
    }

    public static final Object call$2(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        Context context = (Context) aCallableS109S0100000_6.l0;
        if (context != null) {
            Context LLLLL = C16880lQ.LLLLL(context);
            if (CleanEffectsTask.LJLIL || LLLLL == null || CleanEffectsTask.LJLILLLLZI) {
                return null;
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
            CleanEffectsTask.LJLILLLLZI = true;
            InterfaceC26386AXe interfaceC26386AXe = (InterfaceC26386AXe) AXW.LIZ(LLLLL, InterfaceC26386AXe.class);
            long currentTimeMillis = System.currentTimeMillis();
            long LIZJ = interfaceC26386AXe.LIZJ();
            if (((Boolean) C44191HVz.LIZ.getValue()).booleanValue() || currentTimeMillis - LIZJ < 259200000 || !AVExternalServiceImpl.LIZ().configService().cacheConfig().isHasEffectCache()) {
                return null;
            }
            File file = new File(AVExternalServiceImpl.LIZ().configService().cacheConfig().autoCleanMarkDir(), "journal");
            if (!file.exists() || file.isDirectory() ? interfaceC26386AXe.LJIIIIZZ() : currentTimeMillis - file.lastModified() > 259200000) {
                CleanEffectsTask.LJLIL = true;
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        if (EffectCompatJobService.LJLIL) {
                            return null;
                        }
                        EffectCompatJobService.LJLIL = true;
                        JobInfo.Builder builder = new JobInfo.Builder(190806, new ComponentName(LLLLL, (Class<?>) EffectCompatJobService.class));
                        builder.setMinimumLatency(0L);
                        builder.setOverrideDeadline(3000L);
                        ((JobScheduler) C16880lQ.LLILL(LLLLL, "jobscheduler")).schedule(builder.build());
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
                C16880lQ.LLLL(LLLLL, new Intent(LLLLL, (Class<?>) EffectJobService.class));
                return null;
            }
            interfaceC26386AXe.LJ(currentTimeMillis);
            return null;
        }
        return null;
    }

    public static final Object call$20(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        Effect effect = (Effect) aCallableS109S0100000_6.l0;
        StickerPropApi stickerPropApi = (StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(StickerPropApi.class);
        String effectId = effect.getEffectId();
        C60903NvH.LJIIJJI().getApplicationService();
        return stickerPropApi.getStickerDetail(effectId, EF7.LIZLLL()).get();
    }

    public static final Object call$21(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        Effect effect = (Effect) aCallableS109S0100000_6.l0;
        StickerPropApi stickerPropApi = (StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(StickerPropApi.class);
        String effectId = effect.getEffectId();
        C60903NvH.LJIIJJI().getApplicationService();
        return stickerPropApi.getStickerDetail(effectId, EF7.LIZLLL()).get();
    }

    public static final Object call$22(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        C1FP.LJIJI((InterfaceC65784Pro) aCallableS109S0100000_6.l0);
        return C76800UCe.LIZ;
    }

    public static final Object call$24(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        ((RunnableC37185Eib) aCallableS109S0100000_6.l0).LJLILLLLZI.run();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$25(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (((C68322mC) aCallableS109S0100000_6.l0).element == 0) {
                jSONObject.put("is_success", 1);
            } else {
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", ((Number) ((C68322mC) aCallableS109S0100000_6.l0).element).intValue());
            }
            if (C48236IwS.LJIIL) {
                jSONObject.put("is_background", 1);
            } else {
                jSONObject.put("is_background", 0);
            }
            AppLogNewUtils.onEventV3("cache_feed_request_response", jSONObject);
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$26(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", 0);
            jSONObject.put("errorCode", C64920Pds.LIZIZ((Exception) aCallableS109S0100000_6.l0, null));
            jSONObject.put("is_background", 1);
            AppLogNewUtils.onEventV3("cache_video_request_response", jSONObject);
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$27(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        C36872EdY.LIZIZ((FeedItemList) aCallableS109S0100000_6.l0);
        C36872EdY.LIZ = false;
        return C76800UCe.LIZ;
    }

    public static final Object call$28(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        try {
            return ((ShareSettingApi) ((C36698Eak) aCallableS109S0100000_6.l0).LJLIL.getValue()).queryRawSetting().get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static final Object call$29(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        return ((C36698Eak) aCallableS109S0100000_6.l0).LIZJ();
    }

    public static final Object call$3(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        Context context = ((PerformanceActivityAssem) aCallableS109S0100000_6.l0).getContext();
        if (context != null) {
            return context.getResources().getDrawable(R.drawable.au8, context.getTheme());
        }
        return null;
    }

    public static final Object call$30(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        Object LIZ;
        String str;
        C34K c34k = new C34K();
        c34k.element = true;
        JSONObject jSONObject = new JSONObject();
        C37065Egf c37065Egf = (C37065Egf) aCallableS109S0100000_6.l0;
        try {
            jSONObject.put("monitor_version", c37065Egf.LJIJI);
            jSONObject.put("app_session_id", C37065Egf.LJJIL);
            jSONObject.put("api_scene", c37065Egf.LIZ.getValue());
            jSONObject.put("biz_scene", c37065Egf.LIZIZ.getValue());
            jSONObject.put("raw_contacts_size", c37065Egf.LJIJJ);
            jSONObject.put("pn_valid_size", c37065Egf.LJJ);
            jSONObject.put("pn_read_empty_size", c37065Egf.LJIJJLI);
            jSONObject.put("pn_normalized_empty_size", c37065Egf.LJIL);
            jSONObject.put("email_valid_size", c37065Egf.LJJII);
            jSONObject.put("email_read_empty_size", c37065Egf.LJJI);
            jSONObject.put("email_normalized_empty_size", c37065Egf.LJJIFFI);
            jSONObject.put("invalid_contacts_size", c37065Egf.LJJIIJZLJL);
            jSONObject.put("parsed_contacts_size", c37065Egf.LJIILL);
            jSONObject.put("pn_parsed_size", c37065Egf.LJJIIZ);
            jSONObject.put("pn_parsed_failed_size", c37065Egf.LJJIIZI);
            jSONObject.put("email_parsed_size", c37065Egf.LJJIJ);
            jSONObject.put("hashed_contacts_size", c37065Egf.LJJIJIIJI);
            jSONObject.put("pn_hashed_size", c37065Egf.LJJIJIIJIL);
            jSONObject.put("email_hashed_size", c37065Egf.LJJIJIL);
            jSONObject.put("raw_email_size", c37065Egf.LJJIII);
            jSONObject.put("has_email_contact_size", c37065Egf.LJJIIJ);
            C37066Egg c37066Egg = C37065Egf.LJJIZ;
            long j = c37066Egg.LJFF;
            if (j != -1) {
                jSONObject.put("hashed_phone_modify_interval", j);
            }
            long j2 = c37066Egg.LJII;
            if (j2 != -1) {
                jSONObject.put("hashed_phone_modify_same_scene_interval", j2);
            }
            long j3 = c37066Egg.LIZIZ;
            if (j3 != -1) {
                jSONObject.put("hashed_email_modify_interval", j3);
            }
            long j4 = c37066Egg.LIZLLL;
            if (j4 != -1) {
                jSONObject.put("hashed_email_modify_same_scene_interval", j4);
            }
            jSONObject.put("error_count", c37065Egf.LJIILLIIL);
            String str2 = c37065Egf.LJIIZILJ;
            if (str2 != null) {
                jSONObject.put("net_error", str2);
            }
            String str3 = c37065Egf.LJIJ;
            if (str3 != null) {
                jSONObject.put("serialize_error", str3);
            }
            Long LIZJ = C37065Egf.LIZJ(c37065Egf.LJII);
            if (LIZJ != null) {
                jSONObject.put("db_cost", LIZ$0(LIZJ.longValue(), c34k));
            }
            Long LIZJ2 = C37065Egf.LIZJ(c37065Egf.LJIIIIZZ);
            if (LIZJ2 != null) {
                jSONObject.put("normalize_cost", LIZ$0(LIZJ2.longValue(), c34k));
            }
            Long LIZJ3 = C37065Egf.LIZJ(c37065Egf.LJIIIZ);
            if (LIZJ3 != null) {
                jSONObject.put("parse_cost", LIZ$0(LIZJ3.longValue(), c34k));
            }
            Long LIZJ4 = C37065Egf.LIZJ(c37065Egf.LJIIJ);
            if (LIZJ4 != null) {
                jSONObject.put("hash_cost", LIZ$0(LIZJ4.longValue(), c34k));
            }
            Long LIZJ5 = C37065Egf.LIZJ(c37065Egf.LJIIL);
            if (LIZJ5 != null) {
                jSONObject.put("serialize_cost", LIZ$0(LIZJ5.longValue(), c34k));
            }
            Long LIZJ6 = C37065Egf.LIZJ(c37065Egf.LJIIJJI);
            if (LIZJ6 != null) {
                jSONObject.put("api_cost", LIZ$0(LIZJ6.longValue(), c34k));
            }
            Long LIZJ7 = C37065Egf.LIZJ(c37065Egf.LJIILIIL);
            if (LIZJ7 != null) {
                jSONObject.put("construct_cost", LIZ$0(LIZJ7.longValue(), c34k));
            }
            jSONObject.put("cost", LIZ$0(c37065Egf.LJIILJJIL - c37065Egf.LJI, c34k));
            if (c34k.element) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_valid", str);
            jSONObject.put("is_cached", c37065Egf.LJJIJL);
            EM2 em2 = (EM2) c37065Egf.LJJIJLIJ.getValue();
            if (em2 != null) {
                em2.LIZJ(jSONObject);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("report event relation_monitor_contact_android:\n ");
            LIZ2.append(jSONObject);
            X1D.LIZIZ(LIZ2);
            FMX.LJIILJJIL("relation_monitor_contact_android", jSONObject);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("ContactPef", "report contact monitor error", m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$31(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        String LIZJ = C41944GdA.LIZJ((CreativeInfo) aCallableS109S0100000_6.l0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZJ);
        LIZ.append(File.separator);
        LIZ.append("PixelLoopResize.bmp");
        C38891fp.LJIILJJIL(X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    public static final Object call$32(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        try {
            C39579Fg7.LJIJJ(new File(((Effect) aCallableS109S0100000_6.l0).getUnzipPath()));
            return null;
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MVRes: Invalid Res Delete Failed :");
            LIZ.append(((Effect) aCallableS109S0100000_6.l0).getUnzipPath());
            H7B.LIZ(X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static final Object call$33(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        View view = (View) aCallableS109S0100000_6.l0;
        LiveOuterService.LJJJLL().LJJIIJ();
        return C38957FQr.LIZ(view.getContext(), "pm_following_livecard_live_icon");
    }

    public static final Object call$34(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        ((FSM) aCallableS109S0100000_6.l0).LIZLLL.set(true);
        try {
            ((FSM) aCallableS109S0100000_6.l0).LIZ();
            Binder.flushPendingCommands();
            return null;
        } finally {
        }
    }

    public static final Object call$35(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        C64797Pbt<String> execute;
        String LIZJ;
        C38297F1h c38297F1h = (C38297F1h) aCallableS109S0100000_6.l0;
        c38297F1h.LJII = c38297F1h.LIZ(c38297F1h.LJII, c38297F1h.LJIIIZ);
        String str = "";
        try {
            try {
                ArrayList arrayList = new ArrayList();
                List<EJ6> list = c38297F1h.LJIIL;
                if (list != null) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        EJ6 ej6 = (EJ6) it.next();
                        arrayList.add(new EJ6(ej6.LIZ, ej6.LIZIZ));
                    }
                }
                execute = c38297F1h.LJIIJJI.doGet(c38297F1h.LJII, (Map<String, String>) null, arrayList).execute();
                LIZJ = c38297F1h.LIZJ(execute.LIZ.LIZLLL);
            } catch (C38333F2r e) {
                e = e;
            }
            try {
                String str2 = execute.LIZIZ;
                JSONObject jSONObject = new JSONObject(str2);
                Api.LIZIZ(str2, c38297F1h.LJII, jSONObject);
                jSONObject.put("_AME_Header_RequestID", LIZJ);
                jSONObject.put("_raw", jSONObject.toString());
                return jSONObject;
            } catch (C38333F2r e2) {
                e = e2;
                str = LIZJ;
                c38297F1h.LJIILJJIL = e;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("_raw", new JSONObject(e.getResponse()).put("_AME_Header_RequestID", str).toString());
                } catch (JSONException unused) {
                }
                c38297F1h.LIZLLL(jSONObject2, e.getErrorCode(), e.getErrorMsg(), e.getPrompt());
                return jSONObject2;
            }
        } catch (C64923Pdv e3) {
            c38297F1h.LJIILJJIL = e3;
            JSONObject jSONObject3 = new JSONObject();
            c38297F1h.LIZLLL(jSONObject3, e3.getStatusCode(), e3.getMessage(), "");
            return jSONObject3;
        } catch (Exception e4) {
            c38297F1h.LJIILJJIL = e4;
            JSONObject jSONObject4 = new JSONObject();
            c38297F1h.LIZLLL(jSONObject4, -408, e4.getMessage(), "");
            return jSONObject4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$36(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        String str;
        JSONObject jSONObject;
        String str2;
        C38297F1h c38297F1h = (C38297F1h) aCallableS109S0100000_6.l0;
        c38297F1h.LJII = c38297F1h.LIZ(c38297F1h.LJII, c38297F1h.LJIIIZ);
        String str3 = "";
        try {
            try {
                jSONObject = new JSONObject();
                String str4 = c38297F1h.LJIILIIL;
                try {
                    if (str4 != null) {
                        C64797Pbt LIZJ = EYV.LIZJ(c38297F1h.LJII, c38297F1h.LJIIJ, str4, c38297F1h.LJIIL);
                        str2 = (String) LIZJ.LIZIZ;
                        str3 = c38297F1h.LIZJ(LIZJ.LIZ.LIZLLL);
                    } else {
                        HashMap hashMap = new HashMap();
                        JSONObject jSONObject2 = c38297F1h.LJIIJ;
                        if (jSONObject2 != null) {
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                hashMap.put(next, c38297F1h.LJIIJ.optString(next, ""));
                            }
                        }
                        QJY.LJI(hashMap, true);
                        C64797Pbt<String> execute = c38297F1h.LJIIJJI.doPost(c38297F1h.LJII, hashMap).execute();
                        str2 = execute.LIZIZ;
                        str3 = c38297F1h.LIZJ(execute.LIZ.LIZLLL);
                        Api.LIZ(str2, c38297F1h.LJII);
                    }
                    jSONObject.put("code", 1);
                    jSONObject.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str3));
                    jSONObject.put("_raw", str2);
                } catch (Exception e) {
                    e = e;
                    str = str3;
                    str3 = str2;
                    c38297F1h.LJIILJJIL = e;
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("code", 0);
                        jSONObject.put("response", new JSONObject(str3).put("_AME_Header_RequestID", str));
                        jSONObject.put("_raw", str3);
                    } catch (JSONException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                    return jSONObject;
                }
            } catch (C64923Pdv e3) {
                c38297F1h.LJIILJJIL = e3;
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("errCode", e3.getStatusCode());
                    jSONObject3.put("message", e3.getMessage());
                    jSONObject.put("error", jSONObject3);
                } catch (JSONException e4) {
                    C16880lQ.LLLLIIL(e4);
                }
            }
        } catch (Exception e5) {
            e = e5;
            str = "";
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$37(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        String str;
        JSONObject jSONObject;
        C38297F1h c38297F1h = (C38297F1h) aCallableS109S0100000_6.l0;
        String LIZ = c38297F1h.LIZ(c38297F1h.LJII, c38297F1h.LJIIIZ);
        c38297F1h.LJII = LIZ;
        String str2 = "";
        try {
            try {
                JSONObject jSONObject2 = c38297F1h.LJIIJ;
                String str3 = c38297F1h.LJIILIIL;
                if (str3 == null) {
                    str3 = "application/x-www-form-urlencoded";
                }
                C64797Pbt LIZLLL = EYV.LIZLLL(LIZ, jSONObject2, str3, c38297F1h.LJIIL);
                str = (String) LIZLLL.LIZIZ;
                try {
                    jSONObject = new JSONObject();
                    str2 = c38297F1h.LIZJ(LIZLLL.LIZ.LIZLLL);
                    try {
                        jSONObject.put("code", 1);
                        jSONObject.put("response", new JSONObject(str).put("_AME_Header_RequestID", str2));
                        jSONObject.put("_raw", str);
                    } catch (Exception e) {
                        e = e;
                        c38297F1h.LJIILJJIL = e;
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", 0);
                            jSONObject.put("response", new JSONObject(str).put("_AME_Header_RequestID", str2));
                            jSONObject.put("_raw", str);
                        } catch (JSONException e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                        return jSONObject;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (C64923Pdv e4) {
                c38297F1h.LJIILJJIL = e4;
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("errCode", e4.getStatusCode());
                    jSONObject3.put("message", e4.getMessage());
                    jSONObject.put("error", jSONObject3);
                } catch (JSONException e5) {
                    C16880lQ.LLLLIIL(e5);
                }
            }
        } catch (Exception e6) {
            e = e6;
            str = "";
            str2 = str;
        }
        return jSONObject;
    }

    public static final Object call$38(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        C38297F1h c38297F1h = (C38297F1h) aCallableS109S0100000_6.l0;
        String LIZ = c38297F1h.LIZ(c38297F1h.LJII, c38297F1h.LJIIIZ);
        c38297F1h.LJII = LIZ;
        try {
            String LIZIZ = c38297F1h.LIZIZ(LIZ);
            JSONObject jSONObject = new JSONObject(LIZIZ);
            jSONObject.put("_raw", LIZIZ);
            return jSONObject;
        } catch (C38333F2r e) {
            c38297F1h.LJIILJJIL = e;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("_raw", e.getResponse());
            } catch (JSONException unused) {
            }
            c38297F1h.LIZLLL(jSONObject2, e.getErrorCode(), e.getErrorMsg(), e.getPrompt());
            return jSONObject2;
        } catch (C64923Pdv e2) {
            c38297F1h.LJIILJJIL = e2;
            JSONObject jSONObject3 = new JSONObject();
            c38297F1h.LIZLLL(jSONObject3, e2.getStatusCode(), e2.getMessage(), "");
            return jSONObject3;
        } catch (Exception e3) {
            c38297F1h.LJIILJJIL = e3;
            JSONObject jSONObject4 = new JSONObject();
            c38297F1h.LIZLLL(jSONObject4, -408, e3.getMessage(), "");
            return jSONObject4;
        }
    }

    public static final Object call$39(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        String str;
        C38298F1i c38298F1i = (C38298F1i) aCallableS109S0100000_6.l0;
        String LIZ = c38298F1i.LIZ(c38298F1i.LJII, c38298F1i.LJIIIZ);
        c38298F1i.LJII = LIZ;
        try {
            try {
                C64797Pbt<String> execute = c38298F1i.LJIJ.doGet(LIZ, (Map<String, String>) null, c38298F1i.LJIIJJI).execute();
                String str2 = execute.LIZIZ;
                str = c38298F1i.LIZJ(execute.LIZ.LIZLLL);
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    Api.LIZIZ(str2, c38298F1i.LJII, jSONObject);
                    jSONObject.put("_raw", str2);
                    jSONObject.put("code", 1);
                    jSONObject.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
                    return jSONObject;
                } catch (C38333F2r e) {
                    e = e;
                    c38298F1i.LJIILIIL = e;
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("_raw", new JSONObject(e.getResponse()).put("_AME_Header_RequestID", str).toString());
                    } catch (JSONException unused) {
                    }
                    c38298F1i.LIZLLL(jSONObject2, e.getErrorCode(), e.getErrorMsg(), e.getPrompt());
                    return jSONObject2;
                }
            } catch (C38333F2r e2) {
                e = e2;
                str = "";
            }
        } catch (C64923Pdv e3) {
            c38298F1i.LJIILIIL = e3;
            JSONObject jSONObject3 = new JSONObject();
            c38298F1i.LIZLLL(jSONObject3, e3.getStatusCode(), e3.getMessage(), "");
            return jSONObject3;
        } catch (Exception e4) {
            c38298F1i.LJIILIIL = e4;
            JSONObject jSONObject4 = new JSONObject();
            c38298F1i.LIZLLL(jSONObject4, -408, e4.getMessage(), "");
            return jSONObject4;
        }
    }

    public static final Object call$4(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        ((RealtimeFeedbackInterceptor) aCallableS109S0100000_6.l0).LIZ();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$40(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        String str;
        C64797Pbt LIZLLL;
        String str2;
        C38298F1i c38298F1i = (C38298F1i) aCallableS109S0100000_6.l0;
        String LIZ = c38298F1i.LIZ(c38298F1i.LJII, c38298F1i.LJIIIZ);
        c38298F1i.LJII = LIZ;
        String str3 = "";
        try {
            JSONObject jSONObject = c38298F1i.LJIIJ;
            String str4 = c38298F1i.LJIIL;
            if (str4 == null) {
                str4 = "application/x-www-form-urlencoded";
            }
            LIZLLL = EYV.LIZLLL(LIZ, jSONObject, str4, c38298F1i.LJIIJJI);
            str2 = (String) LIZLLL.LIZIZ;
        } catch (Exception e) {
            e = e;
            str = "";
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            str3 = c38298F1i.LIZJ(LIZLLL.LIZ.LIZLLL);
            jSONObject2.put("code", 1);
            jSONObject2.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str3));
            jSONObject2.put("_raw", str2);
            return jSONObject2;
        } catch (Exception e2) {
            e = e2;
            str = str3;
            str3 = str2;
            c38298F1i.LJIILIIL = e;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("code", 0);
                jSONObject3.put("response", new JSONObject(str3).put("_AME_Header_RequestID", str));
                jSONObject3.put("_raw", str3);
                return jSONObject3;
            } catch (JSONException e3) {
                C16880lQ.LLLLIIL(e3);
                return jSONObject3;
            }
        }
    }

    public static final Object call$41(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        C38298F1i c38298F1i = (C38298F1i) aCallableS109S0100000_6.l0;
        String LIZ = c38298F1i.LIZ(c38298F1i.LJII, c38298F1i.LJIIIZ);
        c38298F1i.LJII = LIZ;
        try {
            String LIZIZ = c38298F1i.LIZIZ(LIZ);
            JSONObject jSONObject = new JSONObject(LIZIZ);
            jSONObject.put("_raw", LIZIZ);
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(LIZIZ));
            return jSONObject;
        } catch (C38333F2r e) {
            c38298F1i.LJIILIIL = e;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("_raw", e.getResponse());
            } catch (JSONException unused) {
            }
            c38298F1i.LIZLLL(jSONObject2, e.getErrorCode(), e.getErrorMsg(), e.getPrompt());
            return jSONObject2;
        } catch (C64923Pdv e2) {
            c38298F1i.LJIILIIL = e2;
            JSONObject jSONObject3 = new JSONObject();
            c38298F1i.LIZLLL(jSONObject3, e2.getStatusCode(), e2.getMessage(), "");
            return jSONObject3;
        } catch (Exception e3) {
            c38298F1i.LJIILIIL = e3;
            JSONObject jSONObject4 = new JSONObject();
            c38298F1i.LIZLLL(jSONObject4, -408, e3.getMessage(), "");
            return jSONObject4;
        }
    }

    public static final Object call$42(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        C87093YGb c87093YGb = (C87093YGb) aCallableS109S0100000_6.l0;
        if (c87093YGb.LIZIZ == null) {
            c87093YGb.LIZIZ = (CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(CommonApi.class);
        }
        CommonApi commonApi = ((C87093YGb) aCallableS109S0100000_6.l0).LIZIZ;
        String str = C87093YGb.LIZJ;
        Api.LIZ(commonApi.doGet(str).execute().LIZIZ, str);
        return null;
    }

    public static final Object call$5(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        ((ServerPortraitCollections) aCallableS109S0100000_6.l0).LIZLLL();
        return null;
    }

    public static final Object call$6(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        ServerPortraitCollections serverPortraitCollections = (ServerPortraitCollections) aCallableS109S0100000_6.l0;
        serverPortraitCollections.getClass();
        if (ColdLaunchRequestCombinerImpl.LIZJ().LIZIZ()) {
            PortraitCombineModel portraitCombineModel = (PortraitCombineModel) ColdLaunchRequestCombinerImpl.LIZJ().getResponse("/tiktok/v1/efficiency_portrait/");
            if (portraitCombineModel != null) {
                if (portraitCombineModel.httpCode == 200 && portraitCombineModel.getPortraitData() != null && (portraitCombineModel.getPortraitData() instanceof m)) {
                    m mVar = (m) portraitCombineModel.getPortraitData();
                    synchronized (serverPortraitCollections) {
                        if (mVar == null) {
                            return null;
                        }
                        try {
                            serverPortraitCollections.LIZ = mVar;
                            m mVar2 = serverPortraitCollections.LIZ;
                            o.LJI(mVar2);
                            ServerPortraitCollections.LJFF(mVar2);
                        } catch (Exception e) {
                            C36922EeM.LIZ(e);
                        }
                        return null;
                    }
                }
                if (portraitCombineModel.httpCode == 509) {
                    return null;
                }
            }
            serverPortraitCollections.LJ();
            return null;
        }
        serverPortraitCollections.LJ();
        return null;
    }

    public static final Object call$7(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        C94603nU c94603nU = new C94603nU(0);
        C39689Fht LJIILIIL = C39687Fhr.LJIILIIL(((DiskManagerPage) aCallableS109S0100000_6.l0).getContext());
        long j = LJIILIIL.LJIIIIZZ + LJIILIIL.LJIIIZ + LJIILIIL.LJIIJ;
        if (j <= 0) {
            j = LJIILIIL.LJ;
        }
        c94603nU.LJLIL = j;
        c94603nU.LJLILLLLZI = LJIILIIL.LIZIZ;
        c94603nU.LJLJI = LJIILIIL.LIZ;
        return c94603nU;
    }

    public static final Object call$8(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        Bundle bundle = new Bundle();
        if (FCD.LJI((Application) aCallableS109S0100000_6.l0)) {
            bundle.putString("web_ua", FLE.LIZIZ());
        }
        if (FCD.LJI((Application) aCallableS109S0100000_6.l0)) {
            bundle.putInt("user_mode", ((RBX) HG3.LJIILL()).getCurUser().getUserMode());
            bundle.putInt("user_period", ((RBX) HG3.LJIILL()).getCurUser().getUserPeriod());
            bundle.putInt("is_kids_mode", AV1.LJIIJJI() ? 1 : 0);
            bundle.putInt("filter_warn", a.LJIILL().LJIJJLI());
            if (C35971E9v.LIZ()) {
                bundle.putInt("is_non_personalized", o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE) ? 1 : 0);
            }
        }
        AppLog.setCustomerHeader(bundle);
        return C76800UCe.LIZ;
    }

    public static final Object call$9(ACallableS109S0100000_6 aCallableS109S0100000_6) {
        try {
            C39579Fg7.LJIJJ(new File(((Effect) aCallableS109S0100000_6.l0).getUnzipPath()));
            return null;
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MVRes: Invalid Res Delete Failed :");
            LIZ.append(((Effect) aCallableS109S0100000_6.l0).getUnzipPath());
            H7B.LIZ(X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public ACallableS109S0100000_6(Context context, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                this.l0 = context;
                return;
            default:
                this.l0 = context;
                return;
        }
    }

    public static final long LIZ$0(long j, C34K c34k) {
        if (0 <= j && j < 600001) {
            return j;
        }
        c34k.element = false;
        return -1L;
    }

    public ACallableS109S0100000_6(Effect effect, int i) {
        this.$t = i;
        switch (i) {
            case 9:
            case 32:
                this.l0 = effect;
                return;
            default:
                this.l0 = effect;
                return;
        }
    }

    public ACallableS109S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
