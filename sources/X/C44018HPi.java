package X;

import Y.ACallableS25S1300000_7;
import Y.AObjectS123S0200000_7;
import Y.AObjectS127S0200000_7;
import Y.AObjectS52S0101000_7;
import Y.AObjectS58S0000000_7;
import Y.ARunnableS10S0201000_7;
import Y.AgS124S0100000_7;
import Y.AgS41S1200000_7;
import Y.IDCListenerS50S0200000_7;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.commerce.tools.challenge.CommerceToolsChallengeService;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.util.performance.UGCOpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import v5.n;

/* renamed from: X.HPi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44018HPi {
    public static C44428Hc8 LIZ = null;
    public static String LIZIZ = "";
    public static String LIZJ = "";

    public static void LIZIZ(Intent intent) {
        if (!C77412UZs.LJIJI(intent).isValid()) {
            C77412UZs.LJJIJIL(intent, new CreativeInfo());
        }
    }

    public static boolean LJIIIIZZ(Intent intent) {
        if (C41877Gc5.LIZ.LIZIZ() && intent.getBooleanExtra("intercept_background", true)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIL(Intent intent) {
        boolean z;
        boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "shoot_way");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "mission_data");
        if (TextUtils.equals(LLJJIJIIJIL, "mission") && !TextUtils.isEmpty(LLJJIJIIJIL2)) {
            z = true;
        } else {
            z = false;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("record_preset_resource");
        if ((downloadEffectOrMusicAfterEnterCamera || intent.getBooleanExtra("need_load_later", false)) && parcelableExtra != null && !z) {
            return true;
        }
        return false;
    }

    public static void LJII(int i, boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(i, ggo, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_GONE, null);
    }

    public static void LJIIIZ(Activity activity, Intent intent) {
        int i;
        String str;
        if (intent == null || activity == null || LJIIIIZZ(intent)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("unable to start activity,isAppBackground ");
            LIZ2.append(C41877Gc5.LIZ.LIZIZ());
            H78.LJI(X1D.LIZIZ(LIZ2));
            return;
        }
        if (((Number) C44825HiX.LIZ.getValue()).intValue() == 2) {
            C44172HVg.LIZJ.getClass();
            IWF.LJJLIIIIJ().release();
        }
        C5UD c5ud = C44172HVg.LIZJ;
        c5ud.getClass();
        C37179EiV.LJFF.postAtFrontOfQueue(new IDRunnableS6S0101000(4, c5ud, 37));
        C45757HxZ c45757HxZ = (C45757HxZ) C45757HxZ.LJ.getValue();
        EnumC39801Fjh loadStatus = TENativeLibsLoader.getLibraryLoadStatus();
        o.LJIIIZ(loadStatus, "loadStatus");
        int i2 = C39802Fji.LIZ[loadStatus.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = 1;
                } else {
                    throw new C162476Zf();
                }
            } else {
                i = 0;
            }
        } else {
            i = -1;
        }
        intent.putExtra("sdk_load_ve_so_status", i);
        intent.putExtra("preload_ve_so_task_status", c45757HxZ.LIZ.toStatusCode());
        intent.putExtra("preload_ve_so_cost_time", c45757HxZ.LIZIZ);
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        c44298Ha2.recordPerformanceLog("pre_enter_record_page", new AObjectS52S0101000_7(3, c45757HxZ, 26));
        if (intent.getBooleanExtra("need_refresh_filter_data", false)) {
            C45857HzB.LIZ(new C44024HPo());
        }
        C43150Gwc.LIZLLL("camera_start");
        C44029HPt.LIZ = System.currentTimeMillis();
        if (intent.getLongExtra("extra_start_record_time", 0L) == 0) {
            intent.putExtra("extra_start_record_time", System.currentTimeMillis());
        }
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        boolean booleanExtra = intent.getBooleanExtra("extra_need_permission_activity", false);
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = (DuetAndStitchRouterConfig) intent.getParcelableExtra("duet_and_stitch_router_config");
        if (duetAndStitchRouterConfig != null) {
            str = duetAndStitchRouterConfig.enterMethod;
        } else {
            str = "";
        }
        C44108HSu.LJIIIIZZ(intent, HRG.START, new AObjectS58S0000000_7(2));
        boolean equals = "duet_and_stitch_jsb".equals(str);
        if (!C51029K0z.LJIL(intent).LIZ(activity, C16880lQ.LLJJIJI(intent)) || booleanExtra || equals) {
            intent.setClass(activity, VideoRecordPermissionActivity.class);
            C16880lQ.LIZIZ(activity, intent);
            return;
        }
        C44108HSu.LJIIIIZZ(intent, HRG.SUCCESS, null);
        C44108HSu.LJII(0, LIZJ, LIZIZ, true, intent, null);
        if (C45623HvP.LIZ() && !C37297EkP.LIZJ) {
            C37297EkP.LIZJ = true;
            H78.LJI("GlobalALSComponentMonitor start()");
            C06340Ms.LIZ = new C37293EkL();
        }
        c44298Ha2.step("av_video_record_init", "startToolPermissionActivity");
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_directly_from_system", false);
        boolean booleanExtra3 = intent.getBooleanExtra("recreate_record_activity_support", false);
        if (booleanExtra2) {
            C43150Gwc.LIZ("2");
            return;
        }
        if (VideoRecordPermissionActivity.LLFZ(intent) && C44172HVg.LJ()) {
            C43150Gwc.LIZIZ("camera_error", "2", "recording");
            return;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "shoot_way");
        if (intent.getBooleanExtra("extra_allow_multiple_entrance", false) || TextUtils.equals(C16880lQ.LLJJIJIIJIL(intent, "enter_from"), "from_duet_mode") || TextUtils.equals(LLJJIJIIJIL, "ec_photo_search") || "main".equals(C16880lQ.LLJJIJIIJIL(intent, "from")) || VideoRecordPermissionActivity.LLFZ(intent) || !C44172HVg.LJ() || booleanExtra3) {
            if (C48331Ixz.LJ()) {
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI(WM7.SCENE_SERVICE, "entering_record");
                c145995oB.LJI("shoot_way", C16880lQ.LLJJIJIIJIL(intent, "shoot_way"));
                c145995oB.LJI("creation_id", C77412UZs.LJIJI(intent).getCreationId());
                c145995oB.LJI("enter_from", C16880lQ.LLJJIJIIJIL(intent, "enter_from"));
                HTP.LJLJL.getClass();
                c145995oB.LIZIZ(0L, "dalvikPss");
                c145995oB.LIZIZ(0L, "nativePss");
                c145995oB.LIZIZ(0L, "otherPss");
                c145995oB.LIZIZ(0L, "totalPss");
                FMX.LJIIL("av_memory_log", c145995oB.LIZ);
            }
            c44298Ha2.step("av_video_record_init", "startVideoRecordActivity");
            C45857HzB.LIZ(new HRA());
            C44022HPm.LIZIZ = true;
            C5H3 c5h3 = HQ1.LIZ;
            if (((Number) c5h3.getValue()).longValue() > 0) {
                ((IOptimizerHelperService) C44022HPm.LIZ.getValue()).LIZIZ(((Number) c5h3.getValue()).longValue());
            }
            if (((Number) C44035HPz.LIZ.getValue()).longValue() > 0) {
                ((IOptimizerHelperService) C44022HPm.LIZ.getValue()).k4(((Number) c5h3.getValue()).longValue());
            }
            C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
            LIZJ(activity, intent, new AObjectS123S0200000_7(activity, intent, 2));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Recording status:");
        LIZ3.append(C44172HVg.LIZ());
        LIZ3.append(" recreatedSupport: ");
        LIZ3.append(booleanExtra3);
        H78.LIZ(X1D.LIZIZ(LIZ3));
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("event", "isRecording");
        c6bk.LIZ.put("user_info", C44172HVg.LIZ());
        C43882HKc.LIZIZ("record", c6bk.LJ());
        C5S1 c5s1 = new C5S1(C16880lQ.LLLLJ(activity));
        c5s1.LIZJ(R.string.gl9);
        c5s1.LJ();
        C43150Gwc.LIZIZ("camera_error", "2", "recording");
    }

    public static void LJIIJ(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (C1DG.LJIIIIZZ()) {
            intent.setClass(context, FTCVideoRecordNewActivity.class);
        } else if (C79000UzU.LJ(intent)) {
            intent.setClass(context, TTEPEffectPreviewActivity.class);
        } else {
            LJIIJJI(context, intent);
        }
    }

    public static void LJIIJJI(Context context, Intent intent) {
        if (C42721Gph.LIZ()) {
            intent.setClass(context, SAAActivity.class);
            if (intent.hasExtra("exterior_record_model")) {
                intent.putExtra("creative_saa_page", "ExteriorVideoRecordScene");
                return;
            } else {
                intent.putExtra("creative_saa_page", "VideoRecordNewScene");
                return;
            }
        }
        intent.setClass(context, VideoRecordNewActivity.class);
    }

    public static boolean LJIILIIL(Context context, Intent intent) {
        if (!C44172HVg.LJ() || !intent.getBooleanExtra("extra_clear_dialog_show_needed", true)) {
            return false;
        }
        C62905OmT c62905OmT = new C62905OmT(new C25600zU(context, R.style.ul));
        c62905OmT.LJ(R.string.qge);
        c62905OmT.LIZ(R.string.qgd);
        c62905OmT.LJI(R.string.cg_);
        c62905OmT.LJIIJJI(R.string.dsg, new IDCListenerS50S0200000_7(context, intent, 4), false);
        new C62906OmU(c62905OmT).LIZLLL();
        return true;
    }

    public static void LJIILJJIL(Activity activity, Intent intent) {
        long j;
        if (intent == null || activity == null || LJIIIIZZ(intent)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("unable to start activity,isAppBackground ");
            LIZ2.append(C41877Gc5.LIZ.LIZIZ());
            H78.LJI(X1D.LIZIZ(LIZ2));
            return;
        }
        C37284EkC.LIZIZ = false;
        if (C00F.LIZ(31744, 0, "creative_tool_open_storage_opt", true) == 1 || C00F.LIZ(31744, 0, "creative_tool_open_storage_opt", true) == 2) {
            FNW.LIZ.getClass();
            if (FNW.LIZ().getStorageLowerLimit() >= 0 && FNW.LIZ().getStorageAutoCleanLimit() >= 0 && !C1DG.LJIIIIZZ() && !C79000UzU.LJ(intent) && !o.LJ(C16880lQ.LLJJIJIIJIL(intent, "shoot_way"), "scan")) {
                C37284EkC.LIZIZ = true;
                AObjectS127S0200000_7 aObjectS127S0200000_7 = new AObjectS127S0200000_7(activity, intent, 3);
                if (C37284EkC.LIZ) {
                    return;
                }
                if (!C39579Fg7.LJIILL()) {
                    H78.LIZJ("record check SD not available");
                    C5S1 c5s1 = new C5S1(activity);
                    c5s1.LIZJ(R.string.qb6);
                    c5s1.LJ();
                    C37284EkC.LIZIZ(-1L, -1L, false, false);
                    return;
                }
                FNW.LIZ.getClass();
                long j2 = 1024;
                long storageLowerLimit = FNW.LIZ().getStorageLowerLimit() * j2 * j2;
                long storageAutoCleanLimit = FNW.LIZ().getStorageAutoCleanLimit() * j2 * j2;
                try {
                    j = C39579Fg7.LJIILIIL();
                } catch (Exception unused) {
                    j = 0;
                }
                if (j < storageLowerLimit) {
                    XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C36110EFe(activity, j, storageLowerLimit, storageAutoCleanLimit, aObjectS127S0200000_7, null), 2);
                    return;
                }
                if (storageLowerLimit <= j && j < storageAutoCleanLimit) {
                    C45857HzB.LIZ(new C36112EFg(activity, j, storageLowerLimit, storageAutoCleanLimit));
                    aObjectS127S0200000_7.invoke();
                    return;
                } else {
                    C37284EkC.LIZJ(EnumC36113EFh.NOT_NEED_CLEAN_STORAGE, j, storageLowerLimit, storageAutoCleanLimit, 0L, 0L, true, false);
                    aObjectS127S0200000_7.invoke();
                    return;
                }
            }
        }
        LJIIIZ(activity, intent);
    }

    public static void LJIILL(Activity activity, UgcTemplateAlbumConfig ugcTemplateAlbumConfig) {
        AutoSelectedAnchorInfos autoSelectedAnchorInfos;
        G8G.LIZ.start(UGCOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(ugcTemplateAlbumConfig.getCreativeInfo());
        shortVideoContext.creativeInfo = ugcTemplateAlbumConfig.getCreativeInfo();
        shortVideoContext.LIZLLL().setCreationId(ugcTemplateAlbumConfig.getCreativeInfo().getCreationId());
        if (ugcTemplateAlbumConfig.isFromPUgc()) {
            ugcTemplateAlbumConfig.setShootWay("pugc_template");
        }
        shortVideoContext.shootWay = ugcTemplateAlbumConfig.getShootWay();
        shortVideoContext.enterFrom = ugcTemplateAlbumConfig.getEnterFrom();
        shortVideoContext.ugcTemplateTag = ugcTemplateAlbumConfig.getUgcTemplateTag();
        String openPlatformExtra = ugcTemplateAlbumConfig.getOpenPlatformExtra();
        if (openPlatformExtra != null && (autoSelectedAnchorInfos = shortVideoContext.creativeFlowData.getAutoSelectedAnchorInfos()) != null) {
            autoSelectedAnchorInfos.setOpenPlatFormExtra(openPlatformExtra);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_template_slot_index", ugcTemplateAlbumConfig.getSlotIndex());
        bundle.putString("key_ugc_template_music_path", ugcTemplateAlbumConfig.getMusicPath());
        bundle.putSerializable("key_ugc_template_anchor", ugcTemplateAlbumConfig.getAnchor());
        bundle.putString("key_ugc_template_id", ugcTemplateAlbumConfig.getTemplateId());
        bundle.putString("key_ugc_template_url", ugcTemplateAlbumConfig.getTemplateUrl());
        bundle.putString("key_ugc_template_md5", ugcTemplateAlbumConfig.getTemplateMD5());
        bundle.putInt("key_ugc_template_music_relative_start", ugcTemplateAlbumConfig.getMusicRelativeStart());
        C77412UZs.LJJIJLIJ(bundle, ugcTemplateAlbumConfig.getCreativeInfo());
        bundle.putParcelable("key_short_video_context", shortVideoContext);
        bundle.putInt("key_choose_scene", 24);
        if (ugcTemplateAlbumConfig.isFromPUgc()) {
            bundle.putInt("key_choose_scene", 36);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator<Float> it = ugcTemplateAlbumConfig.getClipDurations().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) (it.next().floatValue() * 1000.0f)));
        }
        bundle.putIntegerArrayList("clip_arg_data_process_items", arrayList);
        bundle.putParcelableArrayList("clip_arg_data_process_origin_items", ugcTemplateAlbumConfig.getSlotList());
        bundle.putParcelable("clip_arg_data_process_music_item", ugcTemplateAlbumConfig.getMusicSlot());
        shortVideoContext.cameraComponentModel.mMusicStart = ugcTemplateAlbumConfig.getMusicStart();
        shortVideoContext.cameraComponentModel.musicEndTime = ugcTemplateAlbumConfig.getMusicEnd();
        MusicModel musicModel = ugcTemplateAlbumConfig.getMusicModel();
        if (musicModel != null) {
            musicModel.setMusicBeginTime(ugcTemplateAlbumConfig.getMusicStart());
            musicModel.setMusicEndTime(ugcTemplateAlbumConfig.getMusicEnd());
        }
        AVMusic transformMusicModel = C44172HVg.LJI.transformMusicModel(musicModel);
        if (transformMusicModel != null) {
            bundle.putSerializable("aweme_music", transformMusicModel);
            bundle.putSerializable("music_model", musicModel);
        }
        bundle.putString("ugc_template_tag", ugcTemplateAlbumConfig.getUgcTemplateTag());
        List<AnchorTransData> anchors = ugcTemplateAlbumConfig.getAnchors();
        if (anchors != null) {
            bundle.putSerializable("auto_selected_anchors", (Serializable) anchors);
        }
        List<AVChallenge> challenges = ugcTemplateAlbumConfig.getChallenges();
        if (challenges != null) {
            bundle.putSerializable("av_challenge_list", (Serializable) challenges);
        }
        if (ugcTemplateAlbumConfig.getReporterType() != null) {
            bundle.putInt("key_ugc_reporter_type", ugcTemplateAlbumConfig.getReporterType().intValue());
        }
        HJ9.LIZLLL(activity, bundle, 1);
    }

    public static C10K LIZ(Context context, boolean z, String str) {
        n nVar = new n();
        ProgressDialogC173686rk LIZJ2 = ProgressDialogC173686rk.LIZJ(context, context.getResources().getString(R.string.rjz));
        LIZJ2.setIndeterminate(true);
        LJII(1504, true);
        C44172HVg.LJI.LJJIJ(context, str, z, LIZJ2, new HNP(nVar, str, LIZJ2, context, z));
        return nVar.LIZ;
    }

    public static void LIZJ(final Activity activity, Intent intent, InterfaceC88472Yns<List<Bundle>, C76800UCe> interfaceC88472Yns) {
        boolean z;
        C10K c10k;
        AVChallenge aVChallenge;
        String str;
        boolean z2;
        C10K c10k2;
        C10K c10k3;
        LIZ = C44428Hc8.LIZ();
        G8G.LIZ.step("av_video_record_init", "fetchData");
        String str2 = null;
        C42562Gn8.LIZIZ.LIZIZ(C77412UZs.LJIJI(intent).getCreationId(), new C42097Gfd(EnumC42099Gff.BEFORE_ENTER_RECORD, intent, null), null);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "first_face_sticker");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "session");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "music_reuse_sticker_id");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, "challenge_id");
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(intent, "extra_live_source_params");
        if (!TextUtils.isEmpty(LLJJIJIIJIL5)) {
            try {
                str2 = new JSONObject(LLJJIJIIJIL5).optString("challenge_id");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = LLJJIJIIJIL4;
        }
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(intent, "music_id");
        String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(intent, "extra_bind_mv_id");
        String LLJJIJIIJIL8 = C16880lQ.LLJJIJIIJIL(intent, "direct_use_sticker_music");
        String LLJJIJIIJIL9 = C16880lQ.LLJJIJIIJIL(intent, "shoot_way");
        final String LLJJIJIIJIL10 = C16880lQ.LLJJIJIIJIL(intent, "reuse_giphy_gifs");
        String LLJJIJIIJIL11 = C16880lQ.LLJJIJIIJIL(intent, "host_uid");
        String LLJJIJIIJIL12 = C16880lQ.LLJJIJIIJIL(intent, "mission_data");
        if (TextUtils.equals(LLJJIJIIJIL9, "mission") && !TextUtils.isEmpty(LLJJIJIIJIL12)) {
            Mission mission = (Mission) GsonProtectorUtils.fromJson(new Gson(), LLJJIJIIJIL12, Mission.class);
            if (!TextUtils.isEmpty(mission.getStickerId())) {
                LLJJIJIIJIL = mission.getStickerId();
            }
            if (!TextUtils.isEmpty(mission.getMusicId())) {
                LLJJIJIIJIL6 = mission.getMusicId();
            }
        }
        ArrayList arrayList = new ArrayList();
        AgS41S1200000_7 agS41S1200000_7 = new AgS41S1200000_7(activity, intent, LLJJIJIIJIL9, 1);
        if (!TextUtils.isEmpty(LLJJIJIIJIL)) {
            if (LJIIL(intent)) {
                n nVar = new n();
                ArrayList<String> LIZIZ2 = ID0.LIZIZ(LLJJIJIIJIL);
                if (C32151Nz.LJJIIJZLJL(LIZIZ2)) {
                    nVar.LJ(new Bundle());
                    c10k3 = nVar.LIZ;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("reuse_sticker_ids", LIZIZ2);
                    bundle.putString("event_shoot_event_track", "cold_start");
                    C6QQ.LIZ(new C42535Gmh(activity, bundle, nVar, (String) ListProtector.get(LIZIZ2, 0)));
                    c10k3 = nVar.LIZ;
                }
                arrayList.add(c10k3.LJFF(agS41S1200000_7));
            } else {
                if (LLJJIJIIJIL2 != null || intent.getBooleanExtra("show_preloading_dialog", false)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int intExtra = intent.getIntExtra("msg_preloading_dialog", R.string.r74);
                if (intExtra == 0) {
                    intExtra = R.string.r74;
                }
                boolean booleanExtra = intent.getBooleanExtra("enter_form_flip_shoot_icon", false);
                n nVar2 = new n();
                ArrayList<String> LIZIZ3 = ID0.LIZIZ(LLJJIJIIJIL);
                if (C32151Nz.LJJIIJZLJL(LIZIZ3)) {
                    nVar2.LJ(new Bundle());
                    c10k2 = nVar2.LIZ;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putStringArrayList("reuse_sticker_ids", LIZIZ3);
                    bundle2.putString("event_shoot_event_track", "cold_start");
                    C6QQ.LIZ(new C44021HPl(intExtra, activity, bundle2, nVar2, (String) ListProtector.get(LIZIZ3, 0), z2, booleanExtra));
                    c10k2 = nVar2.LIZ;
                }
                C10K LJFF = c10k2.LJFF(agS41S1200000_7);
                if (e1.LIZ(31744, "studio_flip_shoot_icon_effect_opti", true, false) && booleanExtra) {
                    LJFF.LJFF(new AgS124S0100000_7(intent, 12));
                }
                arrayList.add(LJFF);
            }
        }
        if (LLJJIJIIJIL11 != null && !LLJJIJIIJIL11.isEmpty()) {
            Bundle bundle3 = new Bundle();
            try {
                str = C44172HVg.LJIJ.LJII(LLJJIJIIJIL11, null).LJ();
            } catch (Exception unused) {
                str = "";
            }
            n nVar3 = new n();
            if (!str.isEmpty()) {
                bundle3.putString("host_name", str);
            }
            nVar3.LJ(bundle3);
            arrayList.add(nVar3.LIZ);
        }
        Serializable serializableExtra = intent.getSerializableExtra("extra_open_record_challenge");
        ArrayList arrayList2 = new ArrayList();
        if (serializableExtra != null) {
            arrayList2.add(serializableExtra);
        }
        arrayList2.addAll(C41658GWo.LIZLLL().LIZ);
        if (!C79004UzY.LJJIFFI(arrayList2) && (aVChallenge = (AVChallenge) ListProtector.get(arrayList2, 0)) != null) {
            if (!TextUtils.isEmpty(aVChallenge.musicId)) {
                LLJJIJIIJIL6 = aVChallenge.musicId;
            }
            if (!TextUtils.isEmpty(aVChallenge.mvId)) {
                LLJJIJIIJIL7 = aVChallenge.mvId;
            }
        }
        if (!TextUtils.isEmpty(LLJJIJIIJIL3)) {
            n nVar4 = new n();
            ArrayList<String> LIZIZ4 = ID0.LIZIZ(LLJJIJIIJIL3);
            Bundle bundle4 = new Bundle();
            if (!C32151Nz.LJJIIJZLJL(LIZIZ4)) {
                bundle4.putStringArrayList("reuse_sticker_ids", LIZIZ4);
                bundle4.putString("event_shoot_event_track", "");
                Effect effect = (Effect) intent.getParcelableExtra("music_with_sticker_effect");
                if (effect != null) {
                    bundle4.putParcelable("first_sticker", effect);
                    if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                        String LIZIZ5 = H9H.LIZIZ((String) ListProtector.get(effect.getMusic(), 0));
                        if (!TextUtils.isEmpty(LIZIZ5)) {
                            bundle4.putString("path", LIZIZ5);
                        }
                    }
                }
            }
            nVar4.LJ(bundle4);
            arrayList.add(nVar4.LIZ.LJFF(agS41S1200000_7));
        }
        if (!TextUtils.isEmpty(LLJJIJIIJIL7)) {
            n nVar5 = new n();
            if (TextUtils.isEmpty(LLJJIJIIJIL7)) {
                nVar5.LJ(new Bundle());
                c10k = nVar5.LIZ;
            } else {
                EffectService.getInstance().createMvEffectPlatform(activity).LIZLLL(LLJJIJIIJIL7, null, new HPM(LLJJIJIIJIL7, nVar5));
                c10k = nVar5.LIZ;
            }
            arrayList.add(c10k.LJFF(agS41S1200000_7));
        }
        if (!TextUtils.isEmpty(str2)) {
            n nVar6 = new n();
            C10K.LIZJ(new ACallableS25S1300000_7(intent, activity, str2, nVar6, 0));
            arrayList.add(nVar6.LIZ.LJFF(agS41S1200000_7));
        }
        if ((!intent.getBooleanExtra("music_download_complete", false) || !((Boolean) C44033HPx.LIZ.getValue()).booleanValue()) && !TextUtils.isEmpty(LLJJIJIIJIL6) && !LJIIL(intent)) {
            arrayList.add(LIZ(activity, !TextUtils.equals(LLJJIJIIJIL9, "challenge"), LLJJIJIIJIL6).LJFF(agS41S1200000_7));
        }
        if (!TextUtils.isEmpty(LLJJIJIIJIL8)) {
            if (!TextUtils.isEmpty(C16880lQ.LLJJIJIIJIL(intent, "sticker_with_music_file_path"))) {
                Music music = (Music) intent.getSerializableExtra("sticker_music");
                String LLJJIJIIJIL13 = C16880lQ.LLJJIJIIJIL(intent, "sticker_with_music_file_path");
                n nVar7 = new n();
                Bundle bundle5 = new Bundle();
                IInternalCommerceService LJIIJ = AVCommerceServiceImpl.LJIIJ();
                if (!LJIIJ.LIZ() || !LJIIJ.LIZLLL(music)) {
                    z = true;
                } else {
                    z = false;
                }
                if (music != null && z) {
                    AVMusic transformMusicModel = C44172HVg.LJI.transformMusicModel(music.convertToMusicModel());
                    H9H.LIZ(LLJJIJIIJIL8, LLJJIJIIJIL13);
                    transformMusicModel.setMusicPriority(2);
                    I9T.LJFF(transformMusicModel);
                    bundle5.putSerializable("aweme_music", transformMusicModel);
                    bundle5.putString("path", LLJJIJIIJIL13);
                }
                nVar7.LJ(bundle5);
                arrayList.add(nVar7.LIZ.LJFF(agS41S1200000_7));
            } else if (!intent.getBooleanExtra("do_not_load_music", false) && !LJIIL(intent)) {
                arrayList.add(LIZ(activity, false, LLJJIJIIJIL8).LJFF(agS41S1200000_7));
            }
        }
        if (!TextUtils.isEmpty(LLJJIJIIJIL10)) {
            final ArrayList arrayList3 = new ArrayList();
            final n nVar8 = new n();
            final ProgressDialogC173686rk LIZJ2 = ProgressDialogC173686rk.LIZJ(activity, activity.getResources().getString(R.string.rjz));
            LIZJ2.setIndeterminate(true);
            LJII(1501, true);
            C10K.LIZJ(new Callable() { // from class: X.HPq
                public final /* synthetic */ boolean LJLJJI = false;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context = activity;
                    String str3 = LLJJIJIIJIL10;
                    ProgressDialogC173686rk progressDialogC173686rk = LIZJ2;
                    boolean z3 = this.LJLJJI;
                    n nVar9 = nVar8;
                    ArrayList arrayList4 = arrayList3;
                    o.LJIIIZ(context, "context");
                    C84488XDw.LIZ(context, null).LJJJJ(str3, new HQD(progressDialogC173686rk, z3, nVar9, arrayList4));
                    return null;
                }
            });
            arrayList.add(nVar8.LIZ.LJFF(agS41S1200000_7));
        }
        if (C79004UzY.LJJIFFI(arrayList)) {
            interfaceC88472Yns.invoke(null);
        } else {
            C10K.LJIJJLI(arrayList).LJ(new AgS124S0100000_7((InterfaceC88472Yns) interfaceC88472Yns, 13), C10K.LJIIIIZZ, null);
        }
    }

    public static void LIZLLL(ProgressDialogC43239Gy3 progressDialogC43239Gy3, ExceptionResult exceptionResult, n<Bundle> nVar) {
        if (progressDialogC43239Gy3 != null) {
            C135115Rz.LIZ(progressDialogC43239Gy3);
            LJII(1502, false);
        }
        if (exceptionResult == null || exceptionResult.getException() == null) {
            nVar.LIZLLL(new C46691IUd("unknown exception"));
        } else {
            C16880lQ.LLLLIIL(exceptionResult.getException());
            nVar.LIZLLL(exceptionResult.getException());
        }
    }

    public static void LJFF(Activity activity, Intent intent, List<Bundle> list) {
        CreativeInfo creativeInfo;
        boolean z;
        boolean z2;
        boolean z3;
        com.ss.android.ugc.effectmanager.effect.model.Effect effect;
        ArrayList<String> stringArrayList;
        boolean z4;
        if (intent.getBooleanExtra("MUSIC_ID_INVALID", false)) {
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                z4 = true;
            } else {
                z4 = false;
            }
            C44108HSu.LJII(6, LIZJ, LIZIZ, z4, intent, null);
            return;
        }
        long LIZIZ2 = LIZ.LIZIZ(TimeUnit.MILLISECONDS);
        G8G.LIZ.step("av_video_record_init", "goRecordActivity");
        Intent intent2 = new Intent();
        if (!LJIIL(intent) && intent.hasExtra("record_preset_resource")) {
            intent.removeExtra("record_preset_resource");
        }
        boolean booleanExtra = intent.getBooleanExtra("show_no_splash_ad", false);
        boolean booleanExtra2 = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra3 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "shoot_way");
        CreativeInfo LJIJI = C77412UZs.LJIJI(intent);
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "enter_dm");
        int intExtra = intent.getIntExtra("draft_to_edit_from", 0);
        int intExtra2 = intent.getIntExtra("extra_video_length", 0);
        if (booleanExtra3) {
            I9T.LJFF(null);
            C41658GWo.LIZLLL().LJFF();
        }
        if (booleanExtra) {
            C44172HVg.LIZJ.getClass();
            FR4.LIZJ = true;
        }
        CommerceToolsChallengeService.LIZJ().LIZIZ(intent, intent2);
        CommerceToolsMissionService.LJIIJ().LIZ(intent, intent2, LLJJIJIIJIL, LJIJI.getCreationId());
        intent2.putExtra("sticker_pannel_show", booleanExtra2);
        intent2.putExtra("enter_record_from_other_platform", booleanExtra3);
        intent2.putExtra("draft_to_edit_from", intExtra);
        intent2.putExtra("star_atlas_object", C16880lQ.LLJJIJIIJIL(intent, "star_atlas_object"));
        intent2.putExtra("extra_video_length", intExtra2);
        if (!TextUtils.isEmpty(LLJJIJIIJIL2)) {
            intent2.putExtra("enter_from", LLJJIJIIJIL2);
        }
        if (!TextUtils.isEmpty(LLJJIJIIJIL3)) {
            intent2.putExtra("enter_dm", LLJJIJIIJIL3);
        }
        RecordPresetResource recordPresetResource = (RecordPresetResource) intent.getParcelableExtra("record_preset_resource");
        if (list != null) {
            for (Bundle bundle : list) {
                intent2.putExtras(bundle);
                if (recordPresetResource != null) {
                    MusicModel musicModel = (MusicModel) intent.getSerializableExtra("music_model");
                    if (bundle != null) {
                        if (bundle.containsKey("reuse_sticker_ids") && (stringArrayList = bundle.getStringArrayList("reuse_sticker_ids")) != null && !stringArrayList.isEmpty()) {
                            recordPresetResource.setEffectId((String) ListProtector.get(stringArrayList, 0));
                        }
                        if (bundle.containsKey("first_sticker") && (effect = (com.ss.android.ugc.effectmanager.effect.model.Effect) bundle.getParcelable("first_sticker")) != null) {
                            recordPresetResource.setEffect(effect);
                        }
                        if (musicModel != null) {
                            recordPresetResource.setMusicId(musicModel.getMusicId());
                            recordPresetResource.setMusicModel(musicModel);
                        }
                    }
                }
            }
        }
        if (recordPresetResource != null) {
            intent2.putExtra("record_preset_resource", (Parcelable) recordPresetResource);
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            intent2.putExtras(LLJJIJI);
        }
        if (!TextUtils.isEmpty(C16880lQ.LLJJIJIIJIL(intent, "micro_app_class"))) {
            intent2.putExtra("micro_app_class", C16880lQ.LLJJIJIIJIL(intent, "micro_app_class"));
        }
        if (TextUtils.isEmpty(LLJJIJIIJIL)) {
            intent2.putExtra("shoot_way", "no_shoot_way");
        }
        if (!LJIJI.isValid()) {
            creativeInfo = new CreativeInfo(C44384HbQ.LJJJJIZL(), LJIJI.getVersion());
            C77412UZs.LJJIJIL(intent2, creativeInfo);
        } else {
            creativeInfo = LJIJI;
        }
        if (C48331Ixz.LJ() || C48331Ixz.LIZIZ()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", C16880lQ.LLJJIJIIJIL(intent2, "enter_from"));
            c145995oB.LJI("type", "click_shoot_same_2_open_record");
            c145995oB.LIZIZ(System.currentTimeMillis() - intent2.getLongExtra("extra_start_record_time", 0L), "totaltime");
            FMX.LJIIL("tool_performance_operation_cost_time", c145995oB.LIZ);
        }
        if (intent2.getLongExtra("extra_start_record_time", 0L) == 0) {
            intent2.putExtra("extra_start_record_time", System.currentTimeMillis());
        }
        C41653GWj.LIZ = new C41654GWk(LLJJIJIIJIL, creativeInfo.getCreationId(), LLJJIJIIJIL2);
        String creationId = creativeInfo.getCreationId();
        if (creationId != null) {
            C43485H4v c43485H4v = new C43485H4v(creationId, EnumC2323499y.DirectRecord);
            H53.LIZ = c43485H4v;
            c43485H4v.LIZJ = H53.LIZ();
        }
        C45857HzB.LIZ(new InterfaceC45863HzH() { // from class: X.6ra
            @Override // X.InterfaceC45863HzH
            public final /* synthetic */ boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC45863HzH
            public final void run() {
                C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI();
                H0W.LIZ();
            }

            @Override // X.InterfaceC45863HzH
            public final EnumC45752HxU LIZIZ() {
                return EnumC45752HxU.P1;
            }
        });
        intent2.putExtra("extra_start_record_download_res_time", LIZIZ2);
        if (intent.hasExtra("green_screen_kit_config")) {
            intent2.putExtra("green_screen_kit_config", intent.getSerializableExtra("green_screen_kit_config"));
            if (intent.hasExtra("green_screen_kit_preset_source")) {
                intent2.putExtra("record_preset_resource", intent.getParcelableExtra("green_screen_kit_preset_source"));
            }
        }
        if (intent.hasExtra("share_kit_panel")) {
            intent2.putExtra("share_kit_panel", intent.getSerializableExtra("share_kit_panel"));
        }
        if (intent.hasExtra("share_model")) {
            intent2.putExtra("share_model", intent.getSerializableExtra("share_model"));
        }
        if (intent.hasExtra("extra_qa_origin")) {
            intent2.putExtra("extra_qa_origin", intent.getSerializableExtra("extra_qa_origin"));
        }
        if (intent.hasExtra("enter_record_from_feed")) {
            intent2.putExtra("enter_record_from_feed", intent.getBooleanExtra("enter_record_from_feed", false));
        }
        if (intent.hasExtra("stitch_params")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("duet_and_stitch_router_config");
            StitchParams stitchParams = (StitchParams) intent.getParcelableExtra("stitch_params");
            if (!"draft_again".equals(LLJJIJIIJIL)) {
                if (parcelableExtra != null) {
                    intent2.putExtra("duet_and_stitch_router_config", parcelableExtra);
                    intent2.putExtra("stitch_params", (Parcelable) stitchParams);
                    HZV.LIZ().LJIILIIL(activity, intent2, creativeInfo);
                    return;
                } else {
                    if (intent.getIntExtra("restore", 0) == 1 && !stitchParams.getRecordVideoPathLists().isEmpty()) {
                        intent2.putExtra("stitch_params", (Parcelable) stitchParams);
                        if (!activity.isFinishing() && !activity.isDestroyed()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C44108HSu.LJII(9, LIZJ, LLJJIJIIJIL, z3, intent2, null);
                        HZV.LIZ().LJIIIIZZ(activity, intent2);
                        return;
                    }
                    HZV.LIZ().LJI(activity, stitchParams, creativeInfo);
                    return;
                }
            }
            intent2.putExtra("stitch_params", (Parcelable) stitchParams);
            if (parcelableExtra != null) {
                intent2.putExtra("duet_and_stitch_router_config", parcelableExtra);
            }
            G8G.LIZ.step("av_video_record_init", "real start activity");
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C44108HSu.LJII(10, LIZJ, LLJJIJIIJIL, z2, intent2, null);
            activity.runOnUiThread(new ARunnableS10S0201000_7(0, activity, intent2, 1));
            return;
        }
        G8G.LIZ.step("av_video_record_init", "real start activity");
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            z = true;
        } else {
            z = false;
        }
        C44108HSu.LJII(5, LIZJ, LLJJIJIIJIL, z, intent2, null);
        activity.runOnUiThread(new ARunnableS10S0201000_7(0, activity, intent2, 2));
    }

    public static void LJ(com.ss.android.ugc.effectmanager.effect.model.Effect effect, ProgressDialogC43239Gy3 progressDialogC43239Gy3, Bundle bundle, n<Bundle> nVar) {
        C135115Rz.LIZ(progressDialogC43239Gy3);
        LJII(1502, false);
        bundle.putParcelable("first_sticker", effect);
        if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
            String LIZIZ2 = H9H.LIZIZ((String) ListProtector.get(effect.getMusic(), 0));
            if (!TextUtils.isEmpty(LIZIZ2)) {
                bundle.putString("path", LIZIZ2);
            }
        }
        nVar.LJ(bundle);
    }

    public static void LJI(InterfaceC84498XEg interfaceC84498XEg, ProgressDialogC43239Gy3 progressDialogC43239Gy3, String str, Bundle bundle, n<Bundle> nVar, EffectListResponse effectListResponse) {
        C43962HNe.LIZ(interfaceC84498XEg).LIZIZ((com.ss.android.ugc.effectmanager.effect.model.Effect) ListProtector.get(effectListResponse.getData(), 0), new C44020HPk(progressDialogC43239Gy3, nVar, str, effectListResponse, bundle));
    }
}
