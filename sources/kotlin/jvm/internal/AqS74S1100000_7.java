package kotlin.jvm.internal;

import X.AbstractC36569EWv;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C00F;
import X.C03660Ck;
import X.C145995oB;
import X.C16880lQ;
import X.C172056p7;
import X.C188727au;
import X.C41359GLb;
import X.C41571GTf;
import X.C41604GUm;
import X.C41620GVc;
import X.C41627GVj;
import X.C42041Gej;
import X.C43615H9v;
import X.C43750HFa;
import X.C43751HFb;
import X.C44172HVg;
import X.C44322HaQ;
import X.C44330HaY;
import X.C44336Hae;
import X.C44694HgQ;
import X.C45059HmJ;
import X.C45254HpS;
import X.C45261HpZ;
import X.C45290Hq2;
import X.C46065I6b;
import X.C5L7;
import X.C60903NvH;
import X.C65314PkE;
import X.C76800UCe;
import X.C78915Uy7;
import X.C78934UyQ;
import X.C81995WFz;
import X.C82634Wbu;
import X.DialogC73377Sqz;
import X.EnumC45262Hpa;
import X.FMX;
import X.G8A;
import X.GUH;
import X.GUQ;
import X.GVC;
import X.H6X;
import X.H78;
import X.H7R;
import X.HG2;
import X.InterfaceC65784Pro;
import X.J9F;
import X.J9I;
import X.PKW;
import X.PL4;
import X.W5F;
import X.W5U;
import X.X1D;
import X.XPS;
import Y.ARunnableS26S0200000_7;
import Y.IDDListenerS146S0100000_7;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.vesdk.VEDownloaderConfig;
import com.ss.android.vesdk.VEFileDownloader;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public class AqS74S1100000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.s0);
        LJIIIIZZ.LJJIIJZLJL = (SmartImageView) this.l1;
        C16880lQ.LLJJJ(LJIIIIZZ);
    }

    public final void invoke$1() {
        C65314PkE LIZ = C78934UyQ.LJLIL.LIZ();
        C44336Hae c44336Hae = (C44336Hae) this.l1;
        DialogC73377Sqz LJIIIIZZ = LIZ.LJIIIIZZ((ActivityC45651qj) c44336Hae.LJLJJI.LIZ(c44336Hae, C44336Hae.LJLJL[0]), new AqS60S1100000_7((C44336Hae) this.l1, this.s0, 11));
        LJIIIIZZ.setOnDismissListener(new IDDListenerS146S0100000_7((C44336Hae) this.l1, 12));
        C16880lQ.LIZ(LJIIIIZZ);
    }

    public static final Object invoke$0(AqS74S1100000_7 aqS74S1100000_7) {
        ((C45290Hq2) aqS74S1100000_7.l1).Ky(C44694HgQ.LJIIIIZZ(aqS74S1100000_7.s0), null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS74S1100000_7 aqS74S1100000_7) {
        ((C45290Hq2) aqS74S1100000_7.l1).Ky(null, C44694HgQ.LJIIIIZZ(aqS74S1100000_7.s0));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AqS74S1100000_7 aqS74S1100000_7) {
        aqS74S1100000_7.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS74S1100000_7 aqS74S1100000_7) {
        ((C45254HpS) aqS74S1100000_7.l1).LIZLLL.setMediaCover(C44694HgQ.LJIIIIZZ(aqS74S1100000_7.s0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS74S1100000_7 aqS74S1100000_7) {
        C45059HmJ c45059HmJ = (C45059HmJ) aqS74S1100000_7.l1;
        c45059HmJ.LJ.LJFF = aqS74S1100000_7.s0;
        c45059HmJ.LIZJ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS74S1100000_7 aqS74S1100000_7) {
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModel videoPublishEditModel;
        C41620GVc.LIZJ();
        C42041Gej c42041Gej = C41620GVc.LIZLLL;
        if (c42041Gej != null) {
            C41627GVj LIZ = GVC.LIZ(c42041Gej, aqS74S1100000_7.s0, (PublishModel) aqS74S1100000_7.l1);
            if (LIZ.LJLJJI) {
                GUH.LIZ(aqS74S1100000_7.s0, new C41604GUm(LIZ));
                C42041Gej c42041Gej2 = C41620GVc.LIZLLL;
                if (c42041Gej2 != null && (baseShortVideoContext = c42041Gej2.LJLLI) != null && (baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("creation_id", videoPublishEditModel.getCreationId());
                    c188727au.LJIIIZ("enter_from", videoPublishEditModel.enterFrom);
                    c188727au.LJIIIZ("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
                    c188727au.LIZLLL(GUH.LJIILJJIL(), "publish_cnt");
                    FMX.LJIIL("publishing_toast_show", c188727au.LIZ);
                }
            }
            return C76800UCe.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$14(AqS74S1100000_7 aqS74S1100000_7) {
        CutsameDataItem cutsameDataItem = (CutsameDataItem) aqS74S1100000_7.l1;
        String effectHost = aqS74S1100000_7.s0;
        C45261HpZ c45261HpZ = new C45261HpZ();
        c45261HpZ.LIZ = "3006";
        c45261HpZ.LIZIZ = "7.7.0";
        c45261HpZ.LIZJ = "ab2d1a104e6311eaa93831049d485a70";
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            serverDeviceId = "";
        }
        c45261HpZ.LIZLLL = serverDeviceId;
        String str = cutsameDataItem.region;
        o.LJIIIZ(str, "<set-?>");
        c45261HpZ.LJ = str;
        String appLanguage = C60903NvH.LJIIJJI().getAppLanguage();
        o.LJIIIZ(appLanguage, "<set-?>");
        c45261HpZ.LJFF = appLanguage;
        String LIZ = C172056p7.LIZ(C5L7.LIZ(), EnumC45262Hpa.TEMPLATE_CACHE);
        o.LJIIIZ(LIZ, "<set-?>");
        c45261HpZ.LJI = LIZ;
        String LIZ2 = C172056p7.LIZ(C5L7.LIZ(), EnumC45262Hpa.MEDIA_CACHE);
        o.LJIIIZ(LIZ2, "<set-?>");
        c45261HpZ.LJII = LIZ2;
        String effectSDKVersion = C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion();
        o.LJIIIZ(effectSDKVersion, "<set-?>");
        c45261HpZ.LJIIIIZZ = effectSDKVersion;
        o.LJIIIIZZ(effectHost, "effectHost");
        c45261HpZ.LJIIIZ = effectHost;
        String LIZ3 = C172056p7.LIZ(C5L7.LIZ(), EnumC45262Hpa.EFFECT_MANAGER);
        o.LJIIIZ(LIZ3, "<set-?>");
        c45261HpZ.LJIIJ = LIZ3;
        String LIZ4 = C172056p7.LIZ(C5L7.LIZ(), EnumC45262Hpa.EFFECT_MANAGER_MODEL);
        o.LJIIIZ(LIZ4, "<set-?>");
        c45261HpZ.LJIIJJI = LIZ4;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(effectHost);
        LIZ5.append("/material_cloud/download/v1/download");
        String LIZIZ = X1D.LIZIZ(LIZ5);
        o.LJIIIZ(LIZIZ, "<set-?>");
        c45261HpZ.LJIIL = LIZIZ;
        String LIZ6 = C172056p7.LIZ(C5L7.LIZ(), EnumC45262Hpa.IMUSE_CACHE);
        o.LJIIIZ(LIZ6, "<set-?>");
        c45261HpZ.LJIILIIL = LIZ6;
        return c45261HpZ.LIZ();
    }

    public static final Object invoke$15(AqS74S1100000_7 aqS74S1100000_7) {
        C44322HaQ c44322HaQ = (C44322HaQ) aqS74S1100000_7.l1;
        Activity activity = (Activity) c44322HaQ.LJLJJI.LIZ(c44322HaQ, C44322HaQ.LJLJJLL[0]);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(aqS74S1100000_7.s0);
        C78915Uy7.LJJIIZI(activity, 3065, creativeToastBuilder);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AqS74S1100000_7 aqS74S1100000_7) {
        aqS74S1100000_7.invoke$1();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS74S1100000_7 aqS74S1100000_7) {
        ActivityC45651qj LIZLLL = ((C44330HaY) aqS74S1100000_7.l1).LIZLLL();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(aqS74S1100000_7.s0);
        C78915Uy7.LJJIIZI(LIZLLL, 0, creativeToastBuilder);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS74S1100000_7 aqS74S1100000_7) {
        C43751HFb c43751HFb = ((C43750HFa) aqS74S1100000_7.l1).LJIILIIL;
        Map<String, String> map = HG2.LIZ;
        c43751HFb.LIZJ = (String) ((LinkedHashMap) map).get(aqS74S1100000_7.s0);
        C43751HFb c43751HFb2 = ((C43750HFa) aqS74S1100000_7.l1).LJIILJJIL;
        Map<String, StringBuilder> map2 = HG2.LIZIZ;
        c43751HFb2.LIZJ = String.valueOf(((LinkedHashMap) map2).get(aqS74S1100000_7.s0));
        C43751HFb c43751HFb3 = ((C43750HFa) aqS74S1100000_7.l1).LJIILL;
        Map<String, Integer> map3 = HG2.LIZJ;
        c43751HFb3.LIZJ = String.valueOf(((LinkedHashMap) map3).get(aqS74S1100000_7.s0));
        C43750HFa param = (C43750HFa) aqS74S1100000_7.l1;
        o.LJIIIZ(param, "param");
        String LIZJ = PKW.LIZJ(new Throwable(""));
        o.LJIIIIZZ(LIZJ, "getExceptionStack(Throwable(\"\"))");
        PL4.LIZ(param, LIZJ, "AuditMonitorStage", "creative_tools_audit_monitor_stage");
        map.remove(aqS74S1100000_7.s0);
        map2.remove(aqS74S1100000_7.s0);
        map3.remove(aqS74S1100000_7.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS74S1100000_7 aqS74S1100000_7) {
        String LIZ;
        if (aqS74S1100000_7.s0.length() > 0) {
            LIZ = aqS74S1100000_7.s0;
        } else {
            LIZ = C03660Ck.LIZ(((C43615H9v) aqS74S1100000_7.l1).LIZ, R.string.qh, "{\n                      …se)\n                    }");
        }
        ActivityC45651qj activityC45651qj = ((C43615H9v) aqS74S1100000_7.l1).LIZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(LIZ);
        C78915Uy7.LJJIIZI(activityC45651qj, 3002, creativeToastBuilder);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS74S1100000_7 aqS74S1100000_7) {
        C45290Hq2 c45290Hq2 = (C45290Hq2) aqS74S1100000_7.l1;
        String str = aqS74S1100000_7.s0;
        c45290Hq2.LJLZ = str;
        c45290Hq2.xr0(C44694HgQ.LJIIIIZZ(str));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS74S1100000_7 aqS74S1100000_7) {
        if (((VideoPublishEditModel) aqS74S1100000_7.l1) == null) {
            C41571GTf.LJFF("cancelEditPagePrePublish null editModel");
        } else {
            if (C41571GTf.LIZLLL != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cancelEditPagePrePublish ");
                LIZ.append(aqS74S1100000_7.s0);
                C41359GLb c41359GLb = new C41359GLb(X1D.LIZIZ(LIZ), false, null, 6);
                GUQ guq = GUH.LJI;
                GUH.LJI = null;
                GUH.LIZLLL.execute(new ARunnableS26S0200000_7(c41359GLb, guq, 18));
            }
            C41571GTf.LJIIJ(null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS74S1100000_7 aqS74S1100000_7) {
        IAVInfoService.IGetInfoCallback iGetInfoCallback = (IAVInfoService.IGetInfoCallback) aqS74S1100000_7.l1;
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(Integer.valueOf(TEVideoUtils.nativeCheckMp3File(aqS74S1100000_7.s0)));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS74S1100000_7 aqS74S1100000_7) {
        MusicWaveBean LJIIIZ;
        if (TextUtils.isEmpty(aqS74S1100000_7.s0)) {
            LJIIIZ = null;
        } else {
            LJIIIZ = C44172HVg.LJJI.getMusicService().LJIIIZ(C81995WFz.LIZLLL(aqS74S1100000_7.s0));
        }
        ((IAVTransformService.ITransformCallback) aqS74S1100000_7.l1).finish(LJIIIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS74S1100000_7 aqS74S1100000_7) {
        ((C82634Wbu) aqS74S1100000_7.l1).LJLLL = aqS74S1100000_7.s0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS74S1100000_7 aqS74S1100000_7) {
        ((C46065I6b) aqS74S1100000_7.l1).LJJLL(aqS74S1100000_7.s0);
        ((C46065I6b) aqS74S1100000_7.l1).LJJLIIIJJIZ().closeRecording();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS74S1100000_7 aqS74S1100000_7) {
        C44172HVg.LJIIJJI.getClass();
        TEMonitorInvoker.nativeMonitorPerf(0);
        ((C46065I6b) aqS74S1100000_7.l1).LJJLL(aqS74S1100000_7.s0);
        ((C46065I6b) aqS74S1100000_7.l1).LJJLIIIJJIZ().LJ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS74S1100000_7 aqS74S1100000_7) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", ((C46065I6b) aqS74S1100000_7.l1).LJLLILLLL.LJI());
        c145995oB.LJI("shoot_way", ((C46065I6b) aqS74S1100000_7.l1).LJLLILLLL.shootWay);
        int i = ((C46065I6b) aqS74S1100000_7.l1).LJLLILLLL.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        String str = ((C46065I6b) aqS74S1100000_7.l1).LJLLILLLL.newDraftId;
        o.LJIIIIZZ(str, "shortVideoContext.newDraftId");
        if (str.length() > 0) {
            c145995oB.LIZLLL("new_draft_id", ((C46065I6b) aqS74S1100000_7.l1).LJLLILLLL.newDraftId);
        }
        FMX.LJIIL("reshoot", c145995oB.LIZ);
        ((C46065I6b) aqS74S1100000_7.l1).LJJLL(aqS74S1100000_7.s0);
        ((C46065I6b) aqS74S1100000_7.l1).LJJLIIIJJIZ().closeRecording();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS74S1100000_7 aqS74S1100000_7) {
        C44172HVg.LJIIJJI.getClass();
        TEMonitorInvoker.nativeMonitorPerf(0);
        ((C46065I6b) aqS74S1100000_7.l1).LJJLL(aqS74S1100000_7.s0);
        ((C46065I6b) aqS74S1100000_7.l1).LJJLIIIJJIZ().LJ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS74S1100000_7 aqS74S1100000_7) {
        if (((C46065I6b) aqS74S1100000_7.l1).LJLLILLLL.LJJIIJZLJL()) {
            ((C46065I6b) aqS74S1100000_7.l1).LJLJJLL();
        } else {
            C46065I6b c46065I6b = (C46065I6b) aqS74S1100000_7.l1;
            if (c46065I6b.LJLLILLLL.isDuetMode) {
                c46065I6b.LJJLIIJ();
            } else {
                G8A g8a = G8A.LIZIZ;
                if (g8a.LIZIZ() >= 3) {
                    g8a.LIZ();
                }
                C44172HVg.LJIIJJI.getClass();
                TEMonitorInvoker.nativeMonitorPerf(0);
                ((C46065I6b) aqS74S1100000_7.l1).LJJLL(aqS74S1100000_7.s0);
                ((C46065I6b) aqS74S1100000_7.l1).LJJLIIIJJIZ().closeRecording();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS74S1100000_7 aqS74S1100000_7) {
        Map<String, VEFileDownloader> veFileDownloaderMap;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPreDownload url=");
        LIZ.append(aqS74S1100000_7.s0);
        LIZ.append(" downloaderMap=");
        LIZ.append(H6X.LIZ.size());
        H78.LIZIZ("EditMusicStream", X1D.LIZIZ(LIZ));
        H6X.LIZIZ = UUID.randomUUID().toString();
        while (true) {
            veFileDownloaderMap = H6X.LIZ;
            o.LJIIIIZZ(veFileDownloaderMap, "veFileDownloaderMap");
            if (!(!veFileDownloaderMap.isEmpty()) || veFileDownloaderMap.size() < C00F.LIZ(31744, 3, "edit_page_stream_playback_max_download_count", true)) {
                break;
            }
            String key = veFileDownloaderMap.entrySet().iterator().next().getKey();
            if (o.LJ(key, aqS74S1100000_7.s0)) {
                break;
            }
            o.LJIIIIZZ(key, "key");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stopPreDownload url=");
            LIZ2.append(key);
            H78.LIZIZ("EditMusicStream", X1D.LIZIZ(LIZ2));
            VEFileDownloader vEFileDownloader = veFileDownloaderMap.get(key);
            if (vEFileDownloader != null) {
                vEFileDownloader.destroyFileDownload();
            }
            veFileDownloaderMap.remove(key);
        }
        J9F j9f = new J9F((AbstractC36569EWv) aqS74S1100000_7.l1, System.currentTimeMillis());
        VEFileDownloader vEFileDownloader2 = new VEFileDownloader();
        HashMap<String, String> LIZJ = C03660Ck.LIZJ("Accept-Encoding", "gzip");
        String str = aqS74S1100000_7.s0;
        String LIZ3 = XPS.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ3, "getInstance().downloadDir");
        VEDownloaderConfig vEDownloaderConfig = new VEDownloaderConfig(str, LIZ3);
        vEDownloaderConfig.maxDownloadCount = C00F.LIZ(31744, 3, "edit_page_stream_playback_max_download_count", true);
        vEDownloaderConfig.maxCacheFileCount = C00F.LIZ(31744, 50, "edit_page_stream_playback_max_cache_count", true);
        vEDownloaderConfig.needSaveFile = true;
        vEDownloaderConfig.maxNetworkTimeout = C00F.LIZ(31744, 3000, "edit_page_stream_playback_audio_underrun_timeout", true);
        vEDownloaderConfig.headerParams = LIZJ;
        vEFileDownloader2.createFileDownload(vEDownloaderConfig, j9f);
        veFileDownloaderMap.put(aqS74S1100000_7.s0, vEFileDownloader2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(C43750HFa c43750HFa, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c43750HFa;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(C44322HaQ c44322HaQ, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c44322HaQ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(C44330HaY c44330HaY, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c44330HaY;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(C44336Hae c44336Hae, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c44336Hae;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(C45059HmJ c45059HmJ, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c45059HmJ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(C45254HpS c45254HpS, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c45254HpS;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(C45290Hq2 c45290Hq2, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c45290Hq2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(C46065I6b c46065I6b, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c46065I6b;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(J9I j9i, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = j9i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(C82634Wbu c82634Wbu, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c82634Wbu;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(SmartImageView smartImageView, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = smartImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(CutsameDataItem cutsameDataItem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = cutsameDataItem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(VideoPublishEditModel videoPublishEditModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = videoPublishEditModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(PublishModel publishModel, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = publishModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(String str, C43615H9v c43615H9v, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c43615H9v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S1100000_7(String str, IAVInfoService.IGetInfoCallback iGetInfoCallback, int i) {
        super(0);
        this.$t = i;
        this.l1 = iGetInfoCallback;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS74S1100000_7(String str, String str2, IAVTransformService.ITransformCallback<MusicWaveBean> iTransformCallback) {
        super(0);
        this.$t = iTransformCallback;
        this.s0 = str;
        this.l1 = str2;
    }
}
