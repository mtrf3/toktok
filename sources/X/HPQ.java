package X;

import Y.AObjectS40S0201000_7;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.appwidget.CameraWidgetProvider;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.nows.service.NowWidgetService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.AutoCutAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.DMAlbumParams;
import com.ss.android.ugc.aweme.services.external.ui.EditorProAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.LongPressOpenAlbumParams;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.SearchAlbumParams;
import com.ss.android.ugc.aweme.services.external.ui.SoundSyncAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAnchorConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.AutoCutAnchorOpenAlbumPerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.SoundSyncOpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS53S0400000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPQ extends HPU {
    public static boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void recordActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    public final void LJFF(Activity activity, InterfaceC82548WaW interfaceC82548WaW) {
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getShieldTemplateExp()) {
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(R.string.ijy);
                creativeToastBuilder.iconColor(R.attr.eb);
                creativeToastBuilder.duration(3000L);
                C78915Uy7.LJJIIZI(activity, 3053, creativeToastBuilder);
                return;
            }
            return;
        }
        I9T.LJFF(null);
        this.LIZ.LJFF();
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(creativeInfo);
        shortVideoContext.creativeInfo = creativeInfo;
        shortVideoContext.LIZLLL().setCreationId(creativeInfo.getCreationId());
        shortVideoContext.shootWay = "mv_page";
        shortVideoContext.enterFrom = "mv_page";
        AVETParameter aVETParameter = new AVETParameter();
        String LJI = shortVideoContext.LJI();
        o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
        aVETParameter.setCreationId(LJI);
        String str = shortVideoContext.shootWay;
        if (str == null) {
            str = "";
        }
        aVETParameter.setShootWay(str);
        shortVideoContext.avetParameter = aVETParameter;
        if (interfaceC82548WaW instanceof MvThemeData) {
            MvThemeData mvThemeData = (MvThemeData) interfaceC82548WaW;
            mvThemeData.isMvAnchor = 1;
            shortVideoContext.mBindMovieId = mvThemeData.LJIIJJI();
            if (activity != null) {
                HJ5.LIZ(activity, mvThemeData, shortVideoContext);
            }
        } else if (interfaceC82548WaW instanceof CutsameDataItem) {
            CutsameDataItem cutsameDataItem = (CutsameDataItem) interfaceC82548WaW;
            shortVideoContext.enterCutsameId = cutsameDataItem.templateId;
            cutsameDataItem.isMvAnchor = 1;
            if (activity != null) {
                C78934UyQ.LJLIL.LIZIZ().LJFF(activity, cutsameDataItem, shortVideoContext);
            }
        }
        LIZJ = false;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void openAlbum(Activity activity, LongPressOpenAlbumParams params) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(params, "params");
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(params.getCreativeInfo());
        shortVideoContext.creativeInfo = params.getCreativeInfo();
        shortVideoContext.LIZLLL().setCreationId(params.getCreativeInfo().getCreationId());
        shortVideoContext.shootWay = params.getShootWay();
        shortVideoContext.enterFrom = params.getEnterFrom();
        Bundle bundle = new Bundle();
        C45685HwP.LIZIZ(activity);
        bundle.putString("shoot_way", shortVideoContext.shootWay);
        bundle.putInt("key_support_flag", 6);
        bundle.putInt("key_photo_select_min_count", 1);
        C43117Gw5.LIZ.getClass();
        bundle.putInt("key_photo_select_max_count", C43117Gw5.LJII());
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", C45771Hxn.LJFF());
        bundle.putInt("key_choose_scene", 0);
        bundle.putLong("Key_min_duration", C44529Hdl.LIZIZ());
        bundle.putParcelable("key_short_video_context", shortVideoContext);
        C77412UZs.LJJIJLIJ(bundle, params.getCreativeInfo());
        bundle.putLong("invoke_uploadpage_time", params.getInvokeTime());
        HJ9.LIZLLL(activity, bundle, 1);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void openDMAlbum(Activity activity, DMAlbumParams param) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(param, "param");
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.shootWay = "chat";
        shortVideoContext.enterFrom = "chat";
        Bundle LIZ = C141415gn.LIZ("key_photo_select_min_count", 1);
        LIZ.putInt("key_photo_select_max_count", param.getMaxSelectCount());
        LIZ.putInt("key_video_select_min_count", 1);
        LIZ.putInt("key_video_select_max_count", param.getMaxSelectCount());
        LIZ.putBoolean("Key_enable_multi_video", true);
        LIZ.putParcelable("key_short_video_context", shortVideoContext);
        LIZ.putBoolean("key_support_edit_after_choose", false);
        LIZ.putString("key_mv_hint_text", activity.getString(param.getHintTextRes()));
        LIZ.putInt("key_choose_scene", 21);
        LIZ.putInt("key_support_flag", 6);
        LIZ.putInt("result_code", -1);
        LIZ.putInt("key_max_selectable_video_duration", param.getMaxSelectableVideoDuration());
        LIZ.putInt("key_choose_media_notice_text", param.getChooseMediaTnSNoticeRes());
        LIZ.putBoolean("key_choose_media_display_tns_notice", param.getShouldDisplayTnsNotice());
        LIZ.putString("key_choose_media_dm_session_id", param.getSessionId());
        LIZ.putInt("key_dm_chat_type", param.getChatType());
        HJ9.LJ(activity, LIZ, -1, 1);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void openSearchAlbum(Activity activity, SearchAlbumParams param) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(param, "param");
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(param.getCreativeInfo());
        shortVideoContext.creativeInfo = param.getCreativeInfo();
        shortVideoContext.LIZLLL().setCreationId(param.getCreativeInfo().getCreationId());
        shortVideoContext.shootWay = param.getShootWay();
        shortVideoContext.enterFrom = param.getEnterFrom();
        Bundle bundle = new Bundle();
        C45685HwP.LIZIZ(activity);
        bundle.putString("shoot_way", shortVideoContext.shootWay);
        bundle.putInt("key_support_flag", 6);
        bundle.putBoolean("from_search", true);
        bundle.putParcelable("extra_search_creation_data", param.getSearchCreationExtraData());
        bundle.putInt("key_photo_select_min_count", 1);
        C43117Gw5.LIZ.getClass();
        bundle.putInt("key_photo_select_max_count", C43117Gw5.LJII());
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", C45771Hxn.LJFF());
        bundle.putInt("key_choose_scene", 0);
        bundle.putLong("Key_min_duration", C44529Hdl.LIZIZ());
        bundle.putParcelable("key_short_video_context", shortVideoContext);
        C77412UZs.LJJIJLIJ(bundle, param.getCreativeInfo());
        bundle.putLong("invoke_uploadpage_time", param.getInvokeTime());
        HJ9.LIZLLL(activity, bundle, 1);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void starNLETemplateDebugAlbum(Context activity, String templateUrl) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(templateUrl, "templateUrl");
        C6YM.LIZ();
        C69B.LIZ();
        C172746qE c172746qE = new C172746qE();
        H89.LIZ = c172746qE;
        c172746qE.LIZJ(activity, templateUrl, new AObjectS40S0201000_7(1, templateUrl, activity, 1));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startAlbumForExtractMusic(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        bundle.putInt("key_choose_scene", 19);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", 1);
        bundle.putInt("key_support_flag", 4);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        HJ9.LJ(activity, bundle, 0, 0);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startAutoCutAnchorAlbum(Activity activity, AutoCutAnchorConfig autoCutAnchorConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(autoCutAnchorConfig, "autoCutAnchorConfig");
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AVToolsHelper#startAutoCutAnchorAlbum");
        G8G.LIZ.start(AutoCutAnchorOpenAlbumPerformanceMonitor.INSTANCE, "onClick");
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(autoCutAnchorConfig.getCreativeInfo());
        shortVideoContext.creativeInfo = autoCutAnchorConfig.getCreativeInfo();
        shortVideoContext.LIZLLL().setCreationId(autoCutAnchorConfig.getCreativeInfo().getCreationId());
        shortVideoContext.shootWay = autoCutAnchorConfig.getShootWay();
        shortVideoContext.enterFrom = autoCutAnchorConfig.getEnterFrom();
        shortVideoContext.enterMethod = autoCutAnchorConfig.getEnterMethod();
        Bundle bundle = new Bundle();
        C77412UZs.LJJIJLIJ(bundle, autoCutAnchorConfig.getCreativeInfo());
        bundle.putParcelable("key_short_video_context", shortVideoContext);
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        bundle.putInt("key_choose_scene", 29);
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator<Float> it = autoCutAnchorConfig.getDurationList().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) (it.next().floatValue() * 1000.0f)));
        }
        bundle.putIntegerArrayList("clip_arg_data_process_items", arrayList);
        bundle.putString("key_autocut_music_id", autoCutAnchorConfig.getMusicId());
        bundle.putInt("key_min_clip_num", autoCutAnchorConfig.getMinClips());
        bundle.putInt("key_max_clip_num", autoCutAnchorConfig.getMaxClips());
        bundle.putString("key_autocut_template_group_id", autoCutAnchorConfig.getTemplateGroupId());
        bundle.putSerializable("key_autocut_template_anchor", autoCutAnchorConfig.getAnchor());
        HJ9.LIZLLL(activity, bundle, 1);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startEditorProAnchorAlbum(Activity activity, EditorProAnchorConfig anchorConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(anchorConfig, "anchorConfig");
        G8G.LIZ.start(SoundSyncOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(anchorConfig.getCreativeInfo());
        shortVideoContext.creativeInfo = anchorConfig.getCreativeInfo();
        shortVideoContext.LIZLLL().setCreationId(anchorConfig.getCreativeInfo().getCreationId());
        shortVideoContext.shootWay = anchorConfig.getShootWay();
        shortVideoContext.enterFrom = anchorConfig.getEnterFrom();
        shortVideoContext.enterMethod = anchorConfig.getEnterMethod();
        Bundle bundle = new Bundle();
        C77412UZs.LJJIJLIJ(bundle, anchorConfig.getCreativeInfo());
        bundle.putParcelable("key_short_video_context", shortVideoContext);
        bundle.putInt("key_choose_scene", 22);
        bundle.putString("editor_pro_anchor_type", anchorConfig.getAnchorSubType());
        bundle.putIntegerArrayList("clip_arg_data_process_items", new ArrayList<>());
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_support_flag", 6);
        bundle.putLong("Key_min_duration", C44529Hdl.LIZIZ());
        C43117Gw5.LIZ.getClass();
        int LJII = C43117Gw5.LJII();
        bundle.putInt("key_photo_select_max_count", LJII);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", LJII);
        bundle.putInt("key_video_select_min_count", 1);
        HJ9.LIZLLL(activity, bundle, 1);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startSoundSyncAlbum(Activity activity, SoundSyncAnchorConfig soundSyncAnchorConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(soundSyncAnchorConfig, "soundSyncAnchorConfig");
        G8G.LIZ.start(SoundSyncOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(soundSyncAnchorConfig.getCreativeInfo());
        shortVideoContext.creativeInfo = soundSyncAnchorConfig.getCreativeInfo();
        shortVideoContext.LIZLLL().setCreationId(soundSyncAnchorConfig.getCreativeInfo().getCreationId());
        shortVideoContext.shootWay = soundSyncAnchorConfig.getShootWay();
        shortVideoContext.enterFrom = soundSyncAnchorConfig.getEnterFrom();
        shortVideoContext.enterMethod = soundSyncAnchorConfig.getEnterMethod();
        Bundle bundle = new Bundle();
        C77412UZs.LJJIJLIJ(bundle, soundSyncAnchorConfig.getCreativeInfo());
        bundle.putParcelable("key_short_video_context", shortVideoContext);
        bundle.putInt("key_choose_scene", 18);
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator<Float> it = soundSyncAnchorConfig.getClipDurations().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) (it.next().floatValue() * 1000.0f)));
        }
        bundle.putIntegerArrayList("clip_arg_data_process_items", arrayList);
        shortVideoContext.cameraComponentModel.mMusicStart = soundSyncAnchorConfig.getMusicStart();
        shortVideoContext.cameraComponentModel.musicEndTime = soundSyncAnchorConfig.getMusicEnd();
        MusicModel musicModel = soundSyncAnchorConfig.getMusicModel();
        if (musicModel != null) {
            musicModel.setMusicBeginTime(soundSyncAnchorConfig.getMusicStart());
            musicModel.setMusicEndTime(soundSyncAnchorConfig.getMusicEnd());
        }
        AVMusic transformMusicModel = C44172HVg.LJI.transformMusicModel(musicModel);
        if (transformMusicModel != null) {
            bundle.putSerializable("aweme_music", transformMusicModel);
            bundle.putSerializable("music_model", musicModel);
        }
        HJ9.LIZLLL(activity, bundle, 1);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startUgcTemplateAlbum(Activity activity, UgcTemplateAlbumConfig ugcTemplateAlbumConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(ugcTemplateAlbumConfig, "ugcTemplateAlbumConfig");
        C44018HPi.LJIILL(activity, ugcTemplateAlbumConfig);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startUgcTemplatePreviewActivity(Activity activity, UgcTemplateAnchorConfig ugcTemplateAnchorConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(ugcTemplateAnchorConfig, "ugcTemplateAnchorConfig");
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "aweme://template/ugc/preview");
        buildRoute.withParam("aweme_model", ugcTemplateAnchorConfig.getAweme());
        buildRoute.withParam("is_enter_preview_from_pugc", ugcTemplateAnchorConfig.isFromPUgc());
        buildRoute.withParam("creation_info", (Serializable) ugcTemplateAnchorConfig.getCreativeInfo());
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void clickMvAnchorOpenAlbumDirectly(Context context, RecordConfig config, StickerDownloadConfig stickerDownloadConfig) {
        EnumC43998HOo enumC43998HOo;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(stickerDownloadConfig, "stickerDownloadConfig");
        if (TextUtils.isEmpty(stickerDownloadConfig.getStickerId()) || LIZJ) {
            return;
        }
        LIZJ = true;
        if (stickerDownloadConfig.getSourceId() == 2) {
            String stickerId = stickerDownloadConfig.getStickerId();
            Integer type = stickerDownloadConfig.getType();
            if (type == null || type.intValue() != 4) {
                enumC43998HOo = EnumC43998HOo.MV_TEMPLATE;
            } else {
                enumC43998HOo = EnumC43998HOo.CUT_SAME;
            }
            HEU.LIZ(stickerId, enumC43998HOo.getValue(), new AqS111S0300000_7(context, this, stickerDownloadConfig, 0), new AqS173S0100000_7(stickerDownloadConfig, 1));
            return;
        }
        HPU.LIZLLL(context, stickerDownloadConfig, new HPN(context, this, stickerDownloadConfig));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void openAlbumWithMusic(Activity context, RecordConfig recordConfig, MusicModel musicModel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recordConfig, "recordConfig");
        o.LJIIIZ(musicModel, "musicModel");
        I9T.LJFF(null);
        this.LIZ.LJFF();
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startChoosePhotoActivityWithMusic(context, HPU.LIZ(recordConfig), musicModel);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecordMV(Context context, RecordConfig config, StickerDownloadConfig stickerDownloadConfig) {
        EnumC43998HOo enumC43998HOo;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(stickerDownloadConfig, "stickerDownloadConfig");
        if (!TextUtils.isEmpty(stickerDownloadConfig.getStickerId())) {
            if (stickerDownloadConfig.getSourceId() == 2) {
                String stickerId = stickerDownloadConfig.getStickerId();
                Integer type = stickerDownloadConfig.getType();
                if (type == null || type.intValue() != 4) {
                    enumC43998HOo = EnumC43998HOo.MV_TEMPLATE;
                } else {
                    enumC43998HOo = EnumC43998HOo.CUT_SAME;
                }
                HEU.LIZ(stickerId, enumC43998HOo.getValue(), new AqS53S0400000_7(context, this, config, stickerDownloadConfig, 0), new AqS173S0100000_7(stickerDownloadConfig, 0));
                return;
            }
            HPU.LIZLLL(context, stickerDownloadConfig, new HPL(context, this, config, stickerDownloadConfig));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecordSlideShowPhotoMV(Context context, RecordConfig config, PhotoMvAnchorConfig photoMvAnchorConfig) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(photoMvAnchorConfig, "photoMvAnchorConfig");
        I9T.LJFF(null);
        this.LIZ.LJFF();
        VideoRecordEntranceServiceImpl instance = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ);
        instance.startChoosePhotoActivity(LJIJJ, HPU.LIZ(config), photoMvAnchorConfig);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void showCameraWidgetGuide(ActivityC45651qj activity, String shootWay, String creationId, String enterFrom, boolean z, InterfaceC55643Lsd popupScene) {
        String str;
        AppWidgetManager appWidgetManager;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(popupScene, "popupScene");
        if (!z || e1.LIZ(31744, "studio_creation_enable_save_draft_widget_guide", true, false)) {
            if (z) {
                str = "save_drafts";
            } else {
                str = "publish";
            }
            if (activity.getPackageManager().hasSystemFeature("android.software.app_widgets") && e1.LIZ(31744, "studio_creation_enable_pin_camera_widget", true, false) && o.LJ(shootWay, "direct_shoot") && !HKC.LIZ().getBoolean("widget_installed", false) && HKC.LIZ().getInt("show_guide_cnt", 0) < 3) {
                if (System.currentTimeMillis() - Math.max(HKC.LIZ().getLong("last_show_time", 0L), NowWidgetService.LJIIIIZZ().LIZJ()) > TimeUnit.DAYS.toMillis(5L) && !C1DG.LJIIIIZZ()) {
                    if (e1.LIZ(31744, "studio_creation_enable_camera_widget_guide", true, false)) {
                        if (!C39579Fg7.LIZIZ(FUR.LIZ())) {
                            return;
                        }
                        PopupManager.LJIIL(new MCX(activity, enterFrom, shootWay, creationId, str));
                        int i = HKC.LIZ().getInt("show_guide_cnt", 0) + 1;
                        HKC.LIZ().storeInt("show_guide_cnt", i);
                        HKC.LIZ().storeLong("last_show_time", System.currentTimeMillis());
                        if (i != 3) {
                            return;
                        }
                        C39579Fg7.LJIL(FUR.LIZ());
                        return;
                    }
                    if (Build.VERSION.SDK_INT < 26 || (appWidgetManager = AppWidgetManager.getInstance(activity)) == null || !appWidgetManager.isRequestPinAppWidgetSupported() || C41877Gc5.LIZ.LIZIZ()) {
                        return;
                    }
                    ComponentName componentName = new ComponentName(activity, (Class<?>) CameraWidgetProvider.class);
                    try {
                        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(activity);
                        if (appWidgetManager2 != null) {
                            appWidgetManager2.requestPinAppWidget(componentName, null, HKC.LIZIZ(shootWay, enterFrom, creationId, str, activity));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    HKC.LIZ().storeInt("show_guide_cnt", HKC.LIZ().getInt("show_guide_cnt", 0) + 1);
                    HKC.LIZ().storeLong("last_show_time", System.currentTimeMillis());
                }
            }
        }
    }
}
