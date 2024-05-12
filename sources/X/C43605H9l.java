package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.property.CanvasDurationConfig;
import com.ss.android.ugc.aweme.services.external.IRecordEnv;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H9l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43605H9l implements IOpenTextNextService {
    @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService
    public final void loadTextModeRes() {
        if (OI2.LJIIIZ()) {
            OI2.LJIIJ();
        } else {
            OI2.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService
    public final void textCanvasGoNext(ActivityC45651qj activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        String string = bundle.getString("creation_id");
        if (string == null) {
            string = C44384HbQ.LJJJJIZL();
        }
        CreativeInfo creativeInfo = new CreativeInfo(string, 0, null, 6, null);
        C77412UZs.LJJIJLIJ(bundle, creativeInfo);
        bundle.putParcelable("workspace", HU5.LIZ(creativeInfo));
        ShortVideoContext LIZIZ = HB3.LIZIZ(bundle);
        if (C43723HDz.LJI(LIZIZ.shootWay)) {
            C41658GWo.LIZLLL().LJ = Boolean.FALSE;
        }
        LIZ(activity, LIZIZ, null, 0, null);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService
    public final void openTextModeCanvas(IRecordEnv recordEnv, int i, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        FaceStickerBean faceStickerBean;
        o.LJIIIZ(recordEnv, "recordEnv");
        C45850Hz4 c45850Hz4 = (C45850Hz4) recordEnv;
        ActivityC45651qj LIZ = c45850Hz4.LIZ();
        ShortVideoContext LIZLLL = c45850Hz4.LIZLLL();
        I0N value = c45850Hz4.LJ().getValue();
        if (value != null) {
            faceStickerBean = value.Z5();
        } else {
            faceStickerBean = null;
        }
        LIZ(LIZ, LIZLLL, faceStickerBean, i, interfaceC88472Yns);
    }

    public static void LIZ(ActivityC45651qj activityC45651qj, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, int i, InterfaceC88472Yns interfaceC88472Yns) {
        String LJ;
        String path;
        AVETParameter LIZLLL;
        int i2;
        String str;
        Serializable serializable;
        if (OI2.LJIIIZ()) {
            CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
            path = OI2.LJFF(creativeInfo, null).LIZIZ;
            String LIZJ = O3U.LIZJ(C38943FQd.LIZ(), OI2.LIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZJ);
            LJ = JBR.LJFF(LIZ, File.separator, "main.png", LIZ);
        } else {
            CreativeInfo creativeInfo2 = shortVideoContext.creativeInfo;
            o.LJIIIIZZ(creativeInfo2, "shortVideoContext.creativeInfo");
            LJ = OI2.LJ(activityC45651qj, creativeInfo2);
            CreativeInfo creativeInfo3 = shortVideoContext.creativeInfo;
            o.LJIIIIZZ(creativeInfo3, "shortVideoContext.creativeInfo");
            File LJIILL = C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIILL(creativeInfo3, EnumC43649HBd.PHOTO, "textmode_bg.png", true);
            InputStream open = activityC45651qj.getResources().getAssets().open("textmode_bg.png");
            o.LJIIIIZZ(open, "context.resources.assets…ILD_IN_IMPORT_BACKGROUND)");
            C78966Uyw.LJJJJZ(LJIILL);
            C38485F8n.LLLI(LJIILL, C62848OlY.LJFF(open));
            open.close();
            path = LJIILL.getAbsolutePath();
            o.LJIIIIZZ(path, "genPublicPath.absolutePath");
        }
        C43606H9m c43606H9m = new C43606H9m(activityC45651qj, shortVideoContext, faceStickerBean, System.currentTimeMillis());
        CanvasBackground.Companion.getClass();
        o.LJIIIZ(path, "path");
        CanvasBackground canvasBackground = new CanvasBackground(3);
        canvasBackground.setFilePath(path);
        C43604H9k c43604H9k = new C43604H9k(c43606H9m, LJ, new CanvasVideoData(C47261Igj.LJJIJIL(LJ), C47261Igj.LJJIJIL(LJ), canvasBackground, null, 0, null, 0, LiveTryModeCountDownThresholdSetting.DEFAULT, null), i, interfaceC88472Yns);
        CreativeInfo creativeInfo4 = shortVideoContext.creativeInfo;
        o.LJIIIIZZ(creativeInfo4, "shortVideoContext.creativeInfo");
        C43607H9n c43607H9n = new C43607H9n(c43604H9k, creativeInfo4);
        ShortVideoContext shortVideoContext2 = c43607H9n.LIZJ.LIZIZ;
        if (shortVideoContext2 != null && (LIZLLL = shortVideoContext2.LIZLLL()) != null) {
            LIZLLL.setShootMode(shortVideoContext2.shootMode);
            LIZLLL.setContentSource("upload");
            LIZLLL.setContentType("photo_canvas");
        }
        c43607H9n.LIZIZ = C77123UOp.LJIIZILJ(null, c43604H9k.LIZIZ);
        C43606H9m c43606H9m2 = c43604H9k.LIZ;
        c43606H9m2.getClass();
        MusicModel LJIIIIZZ = C60903NvH.LJIIJJI().LJJIJ().LJIIIIZZ(MusicBeanUtilKt.extractAVMusic(c43606H9m2.LIZIZ.creativeModel.musicBuzModel));
        String str2 = "";
        if (LJIIIIZZ != null && C44687HgJ.LIZIZ(c43606H9m2.LIZIZ.getMusicPath())) {
            String musicPath = c43606H9m2.LIZIZ.getMusicPath();
            if (musicPath == null) {
                musicPath = "";
            }
            ShortVideoContext shortVideoContext3 = c43606H9m2.LIZIZ;
            if (shortVideoContext3.cameraComponentModel.mWorkspace == null) {
                CreativeInfo creativeInfo5 = shortVideoContext3.creativeInfo;
                o.LJIIIIZZ(creativeInfo5, "shortVideoContext.creativeInfo");
                shortVideoContext3.cameraComponentModel.mWorkspace = HU5.LIZ(creativeInfo5);
            }
            c43606H9m2.LIZIZ.cameraComponentModel.mWorkspace.LLILLL(musicPath);
            ShortVideoContext shortVideoContext4 = c43606H9m2.LIZIZ;
            shortVideoContext4.cameraComponentModel.mMusicPath = musicPath;
            shortVideoContext4.mIsPhotoMvModeMusic = false;
            int duration = LJIIIIZZ.getDuration();
            if (duration > 0) {
                c43606H9m2.LIZIZ.LJJIJLIJ(duration);
            }
            c43606H9m2.LJ = LJIIIIZZ;
            c43606H9m2.LJFF = musicPath;
            c43606H9m2.LJI = true;
        }
        c43604H9k.LIZ.LJII = C47261Igj.LJJIJ(c43604H9k.LIZIZ);
        C43606H9m param = c43604H9k.LIZ;
        o.LJIIIZ(param, "param");
        ShortVideoContext shortVideoContext5 = param.LIZIZ;
        C43832HIe.LIZLLL(param.LIZ, shortVideoContext5);
        Intent intent = new Intent();
        Serializable serializable2 = shortVideoContext5.shareContext;
        if (serializable2 != null) {
            intent.putExtra("extra_share_context", serializable2);
        }
        intent.putExtra("av_et_parameter", shortVideoContext5.LIZLLL());
        List list = C41658GWo.LIZLLL().LIZ;
        if (list == null) {
            list = new ArrayList();
        }
        List<AVChallenge> list2 = param.LIZLLL;
        if (list2 != null && !((ArrayList) list2).isEmpty()) {
            list.addAll(param.LIZLLL);
        }
        intent.putExtra("challenge", (Serializable) list);
        if (TextUtils.equals(shortVideoContext5.enterFrom, "open_platform_share") && (serializable = shortVideoContext5.shareContext) != null) {
            intent.putExtra("extra_share_context", serializable);
            if (shortVideoContext5.shareContext.mHashTags != null && (!r2.isEmpty())) {
                Iterator<String> it = shortVideoContext5.shareContext.mHashTags.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    AVChallenge aVChallenge = new AVChallenge();
                    aVChallenge.challengeName = next;
                    list.add(aVChallenge);
                }
            }
        }
        intent.putExtra("voice_volume", 0.0f);
        intent.putExtra("extract_model", shortVideoContext5.cameraComponentModel.extractFramesModel);
        intent.putExtra("shoot_way", shortVideoContext5.shootWay);
        CreativeInfo creativeInfo6 = shortVideoContext5.creativeInfo;
        o.LJIIIIZZ(creativeInfo6, "shortVideoContext.creativeInfo");
        C77412UZs.LJJIJIL(intent, creativeInfo6);
        CreativeModel creativeModel = shortVideoContext5.creativeModel;
        o.LJIIIIZZ(creativeModel, "shortVideoContext.creativeModel");
        C78996UzQ.LJJIZ(intent, creativeModel);
        intent.putExtra("shoot_mode", shortVideoContext5.shootMode);
        intent.putExtra("draft_id", shortVideoContext5.draftId);
        intent.putExtra("new_draft_id", shortVideoContext5.newDraftId);
        intent.putExtra("origin", 0);
        intent.putExtra("content_type", "slideshow");
        intent.putExtra("content_source", "upload");
        intent.putExtra("shout_out_data", shortVideoContext5.mShoutOutsData);
        if (shortVideoContext5.LIZIZ().size() > 0) {
            intent.putExtra("extra_av_camera_ids", RecordScene.getCameraIdsStringByModel(shortVideoContext5.LIZIZ()));
        }
        if (shortVideoContext5.LJJIJIL() && C145595nX.LIZ()) {
            intent.putExtra("music_start", shortVideoContext5.cameraComponentModel.mMusicStart);
            intent.putExtra("extra_music_end", shortVideoContext5.cameraComponentModel.musicEndTime);
        }
        intent.putExtra("share_id", shortVideoContext5.mShareId);
        intent.putExtra("channel", shortVideoContext5.clientId);
        intent.putExtra("comment_video_model", shortVideoContext5.commentVideoModel);
        intent.putExtra("question_answer_video_model", shortVideoContext5.qaStruct);
        Parcelable parcelable = shortVideoContext5.qaStickerModel;
        if (!(parcelable instanceof Parcelable)) {
            parcelable = null;
        }
        intent.putExtra("question_answer_video_model_new", parcelable);
        intent.putExtra("extra_tts_voice_model", shortVideoContext5.ttsVoiceModel);
        intent.putExtra("extra_start_enter_edit_page", param.LIZJ);
        intent.putExtra("use_music_before_edit", true);
        String str3 = param.LJFF;
        MusicModel musicModel = param.LJ;
        if (str3 != null && musicModel != null) {
            intent.putExtra("path", str3);
            intent.putExtra("music_model", param.LJ);
            if (param.LJI) {
                str = shortVideoContext5.LJIIL();
            } else {
                str = "slideshow_rec";
            }
            intent.putExtra("music_origin", str);
            intent.putExtra("first_sticker_music_ids", GsonProtectorUtils.toJson(new Gson(), C47261Igj.LJJIJ(musicModel.getMusicId())));
            intent.putExtra("id", musicModel.getMusicId());
            intent.putExtra("is_photo_mv_music", shortVideoContext5.mIsPhotoMvModeMusic);
            intent.putExtra("preset_music_source", !param.LJI ? 1 : 0);
            intent.putExtra("need_clean_music_when_back", !param.LJI);
        }
        intent.putExtra("workspace", shortVideoContext5.cameraComponentModel.mWorkspace);
        if (shortVideoContext5.microAppModel != null || CommentUtils.isDataValid(shortVideoContext5.commentVideoModel)) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            C43836HIi.LIZ(shortVideoContext5.microAppModel, sb, arrayList);
            intent.putExtra("struct_list", arrayList);
            String sb2 = sb.toString();
            shortVideoContext5.title = sb2;
            intent.putExtra("video_title", sb2);
            intent.putExtra("video_title_chain", shortVideoContext5.title);
            intent.putExtra("disable_delete_title_chain", true);
        }
        intent.putExtra("commerce_data_in_tools_line", shortVideoContext5.extraSession.commerceData);
        intent.putExtra("extra_request_code", 12346);
        intent.putExtra("enter_from", shortVideoContext5.enterFrom);
        intent.putExtra("is_rivate", shortVideoContext5.isPrivate);
        intent.putExtra("micro_app_info", shortVideoContext5.microAppModel);
        intent.putExtra("enter_method", shortVideoContext5.enterMethod);
        intent.putExtra("shoot_from", shortVideoContext5.mShootFrom);
        String str4 = shortVideoContext5.uploadMethod;
        if (str4 == null) {
            str4 = "";
        }
        intent.putExtra("upload_method", str4);
        List<String> list3 = shortVideoContext5.uploadTabNameList;
        if (list3 != null) {
            intent.putStringArrayListExtra("upload_tab_name", new ArrayList<>(list3));
        }
        intent.putExtra("upload_next_method", shortVideoContext5.albumPreviewNextMethod);
        intent.putExtra("creative_flow_data", shortVideoContext5.creativeFlowData);
        intent.putExtra("sticker_info", shortVideoContext5.creativeModel.recordEffectModel.stickerInfo);
        CreativeInfo creativeInfo7 = shortVideoContext5.creativeInfo;
        o.LJIIIIZZ(creativeInfo7, "shortVideoContext.creativeInfo");
        C77412UZs.LJJIJIL(intent, creativeInfo7);
        intent.putExtra("origin", 0);
        CanvasDurationConfig LIZ2 = C149525ts.LIZ();
        if (c43604H9k.LIZ.LIZIZ.getMusicId() != null) {
            i2 = Math.max(Math.min(c43604H9k.LIZ.LIZIZ.LJIIJJI(), LIZ2.maxDuration), LIZ2.minDuration);
        } else {
            MusicModel musicModel2 = c43604H9k.LIZ.LJ;
            if (musicModel2 != null) {
                i2 = Math.max(Math.min(musicModel2.getDuration(), LIZ2.maxDuration), LIZ2.minDuration);
            } else {
                i2 = LIZ2.defaultDuration;
            }
        }
        VideoFileInfo videoFileInfo = new VideoFileInfo(c43607H9n.LIZIZ.getWidth(), c43607H9n.LIZIZ.getHeight(), i2, 30, 0, 0, 0, 0, 0.0f, 496, null);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(HJC.LIZ(c43607H9n.LIZ));
        LIZ3.append(HJC.LIZJ(".mp4"));
        String LIZIZ = X1D.LIZIZ(LIZ3);
        C78966Uyw.LJJJJZ(new File(LIZIZ));
        intent.putExtra("extra_edit_preview_info", new C149505tq(c43607H9n.LIZIZ.getWidth(), c43607H9n.LIZIZ.getHeight(), 12).LIZ(new EditVideoSegment(LIZIZ, null, videoFileInfo)));
        intent.putExtra("photo_canvas_data", c43604H9k.LIZLLL);
        intent.putExtra("creation_mode", 3);
        int i3 = c43604H9k.LJ;
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                str2 = "slide";
            }
        } else {
            str2 = "click";
        }
        intent.putExtra("extra_text_mode_enter_method", str2);
        final ActivityC45651qj activityC45651qj2 = c43604H9k.LIZ.LIZ;
        final AqS154S0200000_7 aqS154S0200000_7 = new AqS154S0200000_7(activityC45651qj2, intent, 119);
        if (activityC45651qj2 instanceof LifecycleOwner) {
            if (activityC45651qj2.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                aqS154S0200000_7.invoke();
            } else {
                activityC45651qj2.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.text.TextCanvasEnterEditNextImpl$startActivitySafely$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_RESUME) {
                            onActivityStart();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                    public final void onActivityStart() {
                        ((LifecycleOwner) activityC45651qj2).getLifecycle().removeObserver(this);
                        aqS154S0200000_7.invoke();
                    }
                });
            }
        } else {
            aqS154S0200000_7.invoke();
        }
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = c43604H9k.LJFF;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(Boolean.TRUE);
        }
    }
}
