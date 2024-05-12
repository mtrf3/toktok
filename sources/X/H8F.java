package X;

import Y.IDhS100S0100000_7;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUtils;
import defpackage.e1;
import defpackage.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8F {
    public static Long LIZ;

    public static final String LJ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (H7R.LJJJJL(model)) {
            return "photo_mode";
        }
        return "video";
    }

    public static final String LJI(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        return H7R.LJIIIIZZ(model);
    }

    public static final String LJII(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        return H7R.LJIIIZ(model);
    }

    public static final String LJIIIIZZ(Bundle bundle) {
        String string;
        EditEffectAnchorManager data;
        if (bundle != null && (string = bundle.getString("extra_edit_effect_uid")) != null && (data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string)) != null) {
            return ORZ.LLD(data.getData(), ",", null, null, C140405fA.LJLIL, 30);
        }
        return "";
    }

    public static final String LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        InitialMobParams initialMobParams = videoPublishEditModel.creativeModel.initialModel.mobParams;
        if (initialMobParams == null || (str = initialMobParams.enterType) == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final String LJIIJ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        OSZ LJJIIJ = g0.LJJIIJ(model);
        return C78977Uz7.LJJJJJ(((Number) LJJIIJ.getFirst()).intValue(), ((Number) LJJIIJ.getSecond()).intValue());
    }

    public static final int LJIIL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return 0;
        }
        StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
        if (storyEditEtParam != null) {
            if (!storyEditEtParam.isMultiContent()) {
                return 0;
            }
            return 1;
        }
        if ((!videoPublishEditModel.mFromCut && !videoPublishEditModel.mFromMultiCut) || videoPublishEditModel.videoCount + videoPublishEditModel.photoCount <= 1) {
            return 0;
        }
        return 1;
    }

    public static final long LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        List<EditVideoSegment> videoList2;
        long j;
        long j2;
        long j3 = 0;
        if (videoPublishEditModel.isFastImport) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo == null || (videoList2 = previewInfo.getVideoList()) == null) {
                return 0L;
            }
            long j4 = 0;
            for (EditVideoSegment editVideoSegment : videoList2) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo != null) {
                    j = videoCutInfo.getEnd();
                } else {
                    j = 0;
                }
                VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo2 != null) {
                    j2 = videoCutInfo2.getStart();
                } else {
                    j2 = 0;
                }
                j4 += Math.max(0L, j - j2);
            }
            return j4;
        }
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        if (previewInfo2 == null || (videoList = previewInfo2.getVideoList()) == null) {
            return 0L;
        }
        Iterator<EditVideoSegment> it = videoList.iterator();
        while (it.hasNext()) {
            j3 += it.next().getVideoFileInfo().getDuration();
        }
        return j3;
    }

    public static /* synthetic */ C145995oB LJIILL(VideoPublishEditModel videoPublishEditModel) {
        return LJIILJJIL(0, videoPublishEditModel, "");
    }

    public static final void LJIIZILJ(VideoPublishEditModel videoPublishEditModel) {
        C145995oB LIZ2 = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ2.LJI("enter_from", "video_edit_page");
        LIZ2.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ2.LJI("prop_list", videoPublishEditModel.getStickers());
        LIZ2.LJI("from_prop_id", videoPublishEditModel.fromPropId);
        int i = videoPublishEditModel.draftId;
        if (i != 0) {
            LIZ2.LIZ(i, "draft_id");
        }
        String str = videoPublishEditModel.newDraftId;
        if (str != null && !ujb.o.LJJJJJL(str)) {
            LIZ2.LIZLLL("new_draft_id", videoPublishEditModel.newDraftId);
        }
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            LIZ2.LIZLLL("draft_way", "general_draft_list");
        }
        FMX.LJIIL("click_draft_edit_cancel", LIZ2.LIZ);
    }

    public static final void LJIJJ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        C145995oB LJJJLIIL = LJJJLIIL(model);
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        LJJJLIIL.LJI("shoot_way", model.mShootWay);
        LJJJLIIL.LJI("content_source", C147065pu.LIZ(model, "content_source"));
        LJJJLIIL.LJI("shoot_entrance", C147065pu.LIZ(model, "shoot_entrance"));
        LJJJLIIL.LJI("content_type", C147065pu.LIZ(model, "content_type"));
        LJJJLIIL.LIZIZ(System.currentTimeMillis(), "local_time_ms");
        LJJJLIIL.LIZ(LJIIL(model), "is_multi_content");
        LJJJLIIL.LJI("enter_type", LJIIIZ(model));
        FMX.LJIIL("click_voice_modify", LJJJLIIL.LIZ);
    }

    public static final void LJIJJLI(VideoPublishEditModel videoPublishEditModel) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
        c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
        c145995oB.LJI("content_source", videoPublishEditModel.getAvetParameter().getContentSource());
        c145995oB.LJI("content_type", videoPublishEditModel.getAvetParameter().getContentType());
        c145995oB.LIZ(H7R.LJFF(videoPublishEditModel) ? 1 : 0, "status");
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LIZ(LJIIL(videoPublishEditModel), "is_multi_content");
        c145995oB.LJI("enter_type", LJIIIZ(videoPublishEditModel));
        FMX.LJIIL("click_quality_improve", c145995oB.LIZ);
    }

    public static final void LJIL(VideoPublishEditModel model) {
        String str;
        o.LJIIIZ(model, "model");
        C145995oB LJJJLIIL = LJJJLIIL(model);
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        LJJJLIIL.LJI("shoot_way", model.mShootWay);
        if (model.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str = "promote";
        } else {
            str = "video_edit_page";
        }
        LJJJLIIL.LJI("enter_from", str);
        LJJJLIIL.LJFF(new H96().LJFF("is_promote_pa"));
        LJJJLIIL.LIZ(model.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(model));
        LJJJLIIL.LJI("from_group_id", C78983UzD.LJJIJL());
        int i = model.draftId;
        if (i != 0) {
            LJJJLIIL.LIZ(i, "draft_id");
        }
        String str2 = model.newDraftId;
        o.LJIIIIZZ(str2, "model.newDraftId");
        if (str2.length() > 0) {
            LJJJLIIL.LIZLLL("new_draft_id", model.newDraftId);
        }
        FMX.LJIIL("change_music", LJJJLIIL.LIZ);
    }

    public static final void LJJ(VideoPublishEditModel videoPublishEditModel) {
        C145995oB LIZ2 = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ2.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ2.LJI("shoot_way", videoPublishEditModel.mShootWay);
        LIZ2.LJI("content_source", videoPublishEditModel.getAvetParameter().getContentSource());
        LIZ2.LJI("content_type", videoPublishEditModel.getAvetParameter().getContentType());
        LIZ2.LJI("enter_from", "video_edit_page");
        LIZ2.LIZ(1, "is_multi_content");
        LIZ2.LJI("mix_type", "photo");
        FMX.LJIIL("click_crop_icon", LIZ2.LIZ);
    }

    public static final void LJJIFFI(VideoPublishEditModel videoPublishEditModel) {
        C145995oB LJJJLIIL = LJJJLIIL(videoPublishEditModel);
        LJJJLIIL.LJI("creation_id", videoPublishEditModel.getCreationId());
        LJJJLIIL.LJI("shoot_way", videoPublishEditModel.mShootWay);
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        LJJJLIIL.LJI("scene_id", "1004");
        LJJJLIIL.LIZ(LJIIL(videoPublishEditModel), "is_multi_content");
        LJJJLIIL.LJI("enter_dm", videoPublishEditModel.creativeModel.initialModel.dmCameraModel.enterDM);
        LJJJLIIL.LJI("enter_type", LJIIIZ(videoPublishEditModel));
        FMX.LJIIL("click_modify_entrance", LJJJLIIL.LIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void LJJIIJ(VideoPublishEditModel model) {
        int i;
        OSZ osz;
        List<SingleImageData> imageList;
        String str;
        NowsExtra nowsExtra;
        o.LJIIIZ(model, "model");
        if (H7R.LJJJJI(model)) {
            NowsShootModel nowsShootModel = model.creativeModel.nowsShootModel;
            if (nowsShootModel != null && (nowsExtra = nowsShootModel.nowsExtra) != null) {
                str = nowsExtra.dualType;
            } else {
                str = null;
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -2142067260:
                        if (str.equals("single_video")) {
                            osz = new OSZ(0, 1);
                            break;
                        }
                        break;
                    case -1526927308:
                        if (str.equals("single_upload_image")) {
                            osz = new OSZ(1, 0);
                            break;
                        }
                        break;
                    case -612455675:
                        if (str.equals("combined")) {
                            osz = new OSZ(1, 1);
                            break;
                        }
                        break;
                    case 97613812:
                        if (str.equals("both_photo")) {
                            osz = new OSZ(2, 0);
                            break;
                        }
                        break;
                    case 2147340155:
                        if (str.equals("single_photo")) {
                            osz = new OSZ(1, 0);
                            break;
                        }
                        break;
                }
            }
            osz = new OSZ(0, 0);
        } else {
            ImageAlbumData imageAlbumData = model.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                i = imageList.size();
            } else {
                i = model.photoCount;
            }
            osz = new OSZ(Integer.valueOf(i), Integer.valueOf(model.videoCount));
        }
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        C188727au c188727au = new C188727au();
        c188727au.LJI("creation_id", model.getCreationId());
        c188727au.LJI("shoot_way", model.mShootWay);
        c188727au.LJI("content_type", H7R.LJIIIZ(model));
        c188727au.LJI("content_source", H7R.LJIIIIZZ(model));
        c188727au.LIZLLL(H7R.LJJJJL(model) ? 1 : 0, "is_image_album");
        c188727au.LIZLLL(model.hasText() ? 1 : 0, "has_text");
        c188727au.LIZLLL(model.hasMusic() ? 1 : 0, "has_music");
        c188727au.LIZLLL(model.hasInfoStickers() ? 1 : 0, "has_infosticker");
        c188727au.LIZLLL(model.hasEditEffect() ? 1 : 0, "has_effect");
        c188727au.LJI("effect_id_list", model.getEditEffectListStr());
        c188727au.LJI("prop_list", model.getStickers());
        c188727au.LIZLLL(intValue2, "video_cnt");
        c188727au.LIZLLL(intValue, "pic_cnt");
        c188727au.LIZLLL(!C44384HbQ.LJLJLLL(model) ? 1 : 0, "has_filter");
        c188727au.LIZLLL(model.getEditorProModel().isAdvancedEdit() ? 1 : 0, "is_editor_pro");
        c188727au.LIZLLL(model.isCurrentAutoCutMode() ? 1 : 0, "is_autocut");
        c188727au.LJI("shoot_tab_name", H7R.LJJ(model));
        c188727au.LJI("from_group_id", C78983UzD.LJJIJL());
        c188727au.LJI("music_selected_from", model.getMusicOriginWithCheck());
        c188727au.LIZLLL(model.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType, "aigc_theme_status");
        FMX.LJIIL("click_save_local_on_edit_page", c188727au.LIZ);
    }

    public static final void LJJIJ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        C145995oB LJJJLIIL = LJJJLIIL(videoPublishEditModel);
        LJJJLIIL.LJI("creation_id", videoPublishEditModel.getCreationId());
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        LJJJLIIL.LJI("shoot_way", videoPublishEditModel.mShootWay);
        if (videoPublishEditModel.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str = "promote";
        } else {
            str = "video_edit_page";
        }
        LJJJLIIL.LJI("enter_from", str);
        FMX.LJIIL("edit_volumn", LJJJLIIL.LIZ);
    }

    public static final void LJJJJL(VideoPublishEditModel videoPublishEditModel) {
        C145995oB LIZ2 = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ2.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ2.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        FMX.LJIIL("long_video_edit_text_guide_show", LIZ2.LIZ);
    }

    public static final C145995oB LJJJLIIL(VideoPublishEditModel videoPublishEditModel) {
        String str;
        String LJJ;
        C145995oB LIZ2 = C279017q.LIZ(videoPublishEditModel, "<this>");
        StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
        if (storyEditEtParam == null || (str = storyEditEtParam.getShootPage()) == null) {
            str = "video_shoot_page";
        }
        LIZ2.LJI("shoot_page", str);
        StoryEditEtParam storyEditEtParam2 = videoPublishEditModel.storyEditEtParam;
        if ((storyEditEtParam2 == null || (LJJ = storyEditEtParam2.getShootTabName()) == null) && (LJJ = H7R.LJJ(videoPublishEditModel)) == null) {
            LJJ = "";
        }
        LIZ2.LJI("shoot_tab_name", LJJ);
        StoryEditEtParam storyEditEtParam3 = videoPublishEditModel.storyEditEtParam;
        if (storyEditEtParam3 != null) {
            LIZ2.LIZ(storyEditEtParam3.getClipCount(), "clips_cnt");
        }
        return LIZ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJJLL(java.lang.String r5) {
        /*
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r4 = 45
            boolean r0 = ujb.s.LJJJZ(r5, r4)
            if (r0 == 0) goto L2a
            int r3 = r5.length()
            r2 = 0
            r1 = 0
        L13:
            if (r1 >= r3) goto L1d
            char r0 = r5.charAt(r1)
            if (r0 != r4) goto L1e
            if (r1 >= 0) goto L21
        L1d:
            return r5
        L1e:
            int r1 = r1 + 1
            goto L13
        L21:
            java.lang.String r5 = r5.substring(r2, r1)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
        L2a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8F.LJJJLL(java.lang.String):java.lang.String");
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C145995oB c145995oB) {
        CanvasVideoData canvasVideoData;
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (C79004UzY.LJJIII(videoPublishEditModel.canvasVideoData) && (canvasVideoData = videoPublishEditModel.canvasVideoData) != null && (extra = canvasVideoData.getExtra()) != null && (forwardCanvasExtra = extra.getForwardCanvasExtra()) != null) {
            c145995oB.LIZ(forwardCanvasExtra.getForwardAwemeType(), "repost_aweme_type");
            c145995oB.LIZ(forwardCanvasExtra.isOwnVideo() ? 1 : 0, "is_own_video");
        }
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, C145995oB c145995oB) {
        if (C78685UuP.LJJJZ(videoPublishEditModel.getMusicOriginWithCheck())) {
            c145995oB.LIZLLL("music_selected_from", videoPublishEditModel.getMusicOriginWithCheck());
        }
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, C145995oB c145995oB) {
        C43722HDy LIZJ = C43723HDz.LIZJ(videoPublishEditModel);
        if (LIZJ != null) {
            c145995oB.LIZLLL("channel", LIZJ.mClientKey);
            c145995oB.LIZLLL("sdk_name", LIZJ.getSdkNameForServer());
            c145995oB.LIZLLL("sdk_version", LIZJ.mSdkVersion);
        }
    }

    public static final void LJIJ(VideoPublishEditModel model, boolean z) {
        String str;
        String str2;
        o.LJIIIZ(model, "model");
        C145995oB LJJJLIIL = LJJJLIIL(model);
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(model));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJJJLIIL.LJI("is_editor_pro", str);
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(model));
        LJJJLIIL.LJI("shoot_way", model.mShootWay);
        LJJJLIIL.LJI("from_group_id", C78983UzD.LJJIJL());
        if (model.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str2 = "promote";
        } else {
            str2 = "video_edit_page";
        }
        LJJJLIIL.LJI("enter_from", str2);
        LJJJLIIL.LJFF(new H96().LJFF("is_promote_pa"));
        LJJJLIIL.LIZ(model.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        LJJJLIIL.LJFF(new H96().LJFF("is_commercial"));
        LIZJ(model, LJJJLIIL);
        FMX.LJIIL("change_music", LJJJLIIL.LIZ);
    }

    public static final void LJIJI(VideoPublishEditModel mModel, String str) {
        String str2;
        o.LJIIIZ(mModel, "mModel");
        if (mModel.mDraftToEditFrom == 0) {
            str2 = "general_draft_list";
        } else {
            str2 = "shoot_page";
        }
        C145995oB c145995oB = new C145995oB();
        Q8U.LIZJ(c145995oB, "enter_from", "video_edit_page", mModel, "creation_id");
        c145995oB.LIZ(mModel.draftId, "draft_id");
        c145995oB.LJI("new_draft_id", mModel.newDraftId);
        c145995oB.LJI("shoot_way", mModel.mShootWay);
        c145995oB.LJI("draft_way", str2);
        c145995oB.LJI("click_choice", str);
        c145995oB.LIZ(mModel.isDefaultProp ? 1 : 0, "is_default_prop");
        c145995oB.LJI("prop_list", mModel.getStickers());
        c145995oB.LJI("from_prop_id", mModel.fromPropId);
        FMX.LJIIL("click_draft_edit_answer_sheet", c145995oB.LIZ);
    }

    public static final void LJJJJ(VideoPublishEditModel model, String str) {
        o.LJIIIZ(model, "model");
        int intValue = ((Number) g0.LJJIIJ(model).getSecond()).intValue();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("content_type", "multi_photo");
        c145995oB.LJI("hint_type", str);
        c145995oB.LIZ(intValue, "pic_cnt");
        Q8U.LIZJ(c145995oB, "user_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID(), model, "creation_id");
        FMX.LJIIL("photo_mode_swipe_hint_show_creation", c145995oB.LIZ);
    }

    public static final void LJJJJI(long j, boolean z) {
        String str;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(System.currentTimeMillis() - j, "duration");
        if (z) {
            str = "image";
        } else {
            str = "video";
        }
        c145995oB.LJI("to_page", str);
        FMX.LJIIL("tool_performance_switch_image_video_first_frame", c145995oB.LIZ);
    }

    public static final void LJJJJJL(VideoPublishEditModel model, InterfaceC153045zY interfaceC153045zY) {
        NLEModel nLEModel;
        int i;
        C133765Mu c133765Mu;
        o.LJIIIZ(model, "model");
        if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
            nLEModel = c133765Mu.LJFF();
        } else {
            nLEModel = new NLEModel();
        }
        int i2 = 0;
        if (interfaceC153045zY != null) {
            i = interfaceC153045zY.getDuration();
        } else {
            i = 0;
        }
        OSZ LIZJ = C124934vJ.LIZJ(nLEModel, true);
        int intValue = ((Number) LIZJ.getFirst()).intValue();
        int intValue2 = ((Number) LIZJ.getSecond()).intValue();
        C145995oB LJFF = LJFF(model, false, false, 6);
        LJFF.LIZ(0, "is_editor_pro");
        LJFF.LIZ(i, "creation_duration");
        LJFF.LIZ(intValue, "video_cnt");
        LJFF.LIZ(intValue2, "pic_cnt");
        if (intValue + intValue2 > 1) {
            i2 = 1;
        }
        LJFF.LIZ(i2, "is_multi_content");
        FMX.LJIIL("text_duration_adjust", LJFF.LIZ);
    }

    public static final void LJJJJLI(VideoPublishEditModel model, StickerModel stickerModel) {
        String str;
        TextStickerModel textStickerModel;
        o.LJIIIZ(model, "model");
        C145995oB LJFF = LJFF(model, false, false, 6);
        boolean z = stickerModel instanceof TextStickerModel;
        if (z) {
            TextStickerModel textStickerModel2 = (TextStickerModel) stickerModel;
            if (textStickerModel2 != null && u.LJIJ(textStickerModel2)) {
                str = "caption";
            } else if (z && (textStickerModel = (TextStickerModel) stickerModel) != null && u.LJIILLIIL(textStickerModel)) {
                str = "ai_text";
            }
            LJFF.LJI("text_type", str);
            FMX.LJIIL("text_adjust", LJFF.LIZ);
        }
        str = "text";
        LJFF.LJI("text_type", str);
        FMX.LJIIL("text_adjust", LJFF.LIZ);
    }

    public static final void LJJJJZ(int i, VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        C145995oB LJFF = LJFF(model, false, false, 6);
        LJFF.LIZ(i, "is_editor_pro");
        FMX.LJIIL("text_time_set", LJFF.LIZ);
    }

    public static final C145995oB LJIILJJIL(int i, VideoPublishEditModel model, String selectedLanguageCode) {
        String LJJJLL;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(selectedLanguageCode, "selectedLanguageCode");
        C145995oB LJJJLIIL = LJJJLIIL(model);
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        Q8U.LIZJ(LJJJLIIL, "shoot_way", model.mShootWay, model, "creation_id");
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(model));
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(model));
        LJJJLIIL.LIZ(i, "is_editor_pro");
        LJJJLIIL.LJI("app_language", C60903NvH.LJIIJJI().LJII());
        if (selectedLanguageCode.length() == 0) {
            LJJJLL = C60903NvH.LJIIJJI().LJII();
        } else {
            LJJJLL = LJJJLL(selectedLanguageCode);
        }
        LJJJLIIL.LJI("asr_model_lang", LJJJLL);
        return LJJJLIIL;
    }

    public static final void LJJI(VideoPublishEditModel model, boolean z, boolean z2) {
        String str;
        o.LJIIIZ(model, "model");
        C145995oB LJJJLIIL = LJJJLIIL(model);
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        LJJJLIIL.LJI("shoot_way", model.mShootWay);
        LJJJLIIL.LIZ(LJIIL(model), "is_multi_content");
        LJJJLIIL.LJI("from_group_id", C78983UzD.LJJIJL());
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        int i = model.draftId;
        if (i != 0) {
            LJJJLIIL.LIZ(i, "draft_id");
        }
        String str2 = model.newDraftId;
        o.LJIIIIZZ(str2, "model.newDraftId");
        if (str2.length() > 0) {
            LJJJLIIL.LIZLLL("new_draft_id", model.newDraftId);
        }
        if (z) {
            LJJJLIIL.LIZLLL("is_red_dot", "1");
        } else {
            LJJJLIIL.LIZLLL("is_red_dot", CardStruct.IStatusCode.DEFAULT);
        }
        LJJJLIIL.LIZ(0, "is_editor_pro");
        LJJJLIIL.LIZ(z2 ? 1 : 0, "is_multi_track");
        InitialMobParams initialMobParams = model.creativeModel.initialModel.mobParams;
        if (initialMobParams != null && (str = initialMobParams.enterType) != null && str.length() != 0) {
            LJJJLIIL.LIZLLL("enter_type", str);
        }
        String str3 = model.creativeModel.initialModel.dmCameraModel.enterDM;
        if (str3 != null && str3.length() != 0 && str3 != null) {
            LJJJLIIL.LIZLLL("enter_dm", str3);
        }
        FMX.LJIIL("click_effect_entrance", LJJJLIIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8F.LJJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, boolean):void");
    }

    public static /* synthetic */ void LJJIII(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        if ((i & 4) != 0) {
            str = "other";
        }
        LJJII(videoPublishEditModel, str, false);
    }

    public static final void LJJJJZI(VideoPublishEditModel videoPublishEditModel, float f, String str) {
        C145995oB LIZ2 = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ2.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ2.LJI("shoot_way", videoPublishEditModel.mShootWay);
        LIZ2.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        LIZ2.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        LIZ2.LIZJ(Float.valueOf(f), "volume_cnt");
        LIZ2.LJI("volume_track", str);
        FMX.LJIIL("music_volume_control", LIZ2.LIZ);
    }

    public static final void LIZ(int i, String str, String str2, C145995oB c145995oB) {
        if (i == 1) {
            c145995oB.LIZLLL("enter_method", str);
            c145995oB.LIZLLL("item_id", str2);
        }
        c145995oB.LIZ(i, "is_l8_import");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5oB] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static C145995oB LJFF(VideoPublishEditModel model, boolean z, boolean z2, int i) {
        ?? r4 = z;
        if ((i & 2) != 0) {
            r4 = 0;
        }
        ?? r5 = z2;
        if ((i & 4) != 0) {
            r5 = 0;
        }
        o.LJIIIZ(model, "model");
        ?? LJJJLIIL = LJJJLIIL(model);
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        LJJJLIIL.LJI("shoot_way", model.mShootWay);
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(model));
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(model));
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        LJJJLIIL.LIZ(r4, "is_diy_prop");
        LJJJLIIL.LIZ(r5, "is_text_reading");
        return LJJJLIIL;
    }

    public static final void LJJIIJZLJL(int i, VideoPublishEditModel model, String str, String str2) {
        String LJJJLL;
        o.LJIIIZ(model, "model");
        C145995oB LJJJLIIL = LJJJLIIL(model);
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        Q8U.LIZJ(LJJJLIIL, "shoot_way", model.mShootWay, model, "creation_id");
        LJJJLIIL.LJI("enter_method", str);
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(model));
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(model));
        LJJJLIIL.LIZ(LJIIL(model), "is_multi_content");
        LJJJLIIL.LIZ(i, "is_editor_pro");
        LJJJLIIL.LJI("app_language", C60903NvH.LJIIJJI().LJII());
        if (str2 == null) {
            LJJJLL = C60903NvH.LJIIJJI().LJII();
        } else {
            LJJJLL = LJJJLL(str2);
        }
        LJJJLIIL.LJI("asr_model_lang", LJJJLL);
        LJJJLIIL.LJI("enter_type", LJIIIZ(model));
        FMX.LJIIL("click_auto_subtitle", LJJJLIIL.LIZ);
    }

    public static final void LJJIJIIJI(final VideoPublishEditModel model, final InterfaceC143655kP editPreviewApi, final float f, final String str) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        final C143405k0 value = editPreviewApi.Mq().getValue();
        AbstractC73672Svk.LJJIJIL(model).LJJJ(T16.LIZ()).LJJIJL(new IDhS100S0100000_7(model, 0)).LJJJJZI(new InterfaceC64592gB() { // from class: X.5kZ
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                boolean z;
                Object obj2;
                String str2;
                int i;
                int i2;
                int i3;
                Object obj3;
                int i4;
                Object obj4;
                VideoPublishEditModel videoPublishEditModel = VideoPublishEditModel.this;
                InterfaceC143655kP interfaceC143655kP = editPreviewApi;
                float f2 = f;
                String str3 = str;
                VEUtils.VEVideoFileInfo vEVideoFileInfo = (VEUtils.VEVideoFileInfo) ((AbstractC65743Pr9) obj).orNull();
                C143405k0 c143405k0 = value;
                InterfaceC133095Kf Ax = interfaceC143655kP.Ax();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(Ax.getPreviewWidth());
                LIZ2.append('*');
                LIZ2.append(Ax.getPreviewHeight());
                String LIZIZ = X1D.LIZIZ(LIZ2);
                ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
                o.LJIIIIZZ(effectList, "model.effectList");
                int i5 = 1;
                if (!effectList.isEmpty()) {
                    Iterator<EffectPointModel> it = effectList.iterator();
                    while (it.hasNext()) {
                        Boolean isNewEngineEffect = it.next().getIsNewEngineEffect();
                        o.LJIIIIZZ(isNewEngineEffect, "it.isNewEngineEffect");
                        if (isNewEngineEffect.booleanValue()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                ICreativePerformanceMonitorService performanceMonitorService = AVExternalServiceImpl.LIZ().performanceMonitorService();
                C145995oB LJJJLIIL = H8F.LJJJLIIL(videoPublishEditModel);
                if (vEVideoFileInfo != null) {
                    obj2 = Float.valueOf(vEVideoFileInfo.floatFPS);
                } else {
                    obj2 = 0;
                }
                LJJJLIIL.LIZJ(obj2, "file_fps");
                LJJJLIIL.LJI("creation_id", videoPublishEditModel.getCreationId());
                LJJJLIIL.LJI("shoot_way", videoPublishEditModel.mShootWay);
                LJJJLIIL.LIZJ(Float.valueOf(f2), "play_fps");
                LJJJLIIL.LJI("next_action", str3);
                LJJJLIIL.LIZ(C44228HXk.LIZJ(), "beautify_used");
                LJJJLIIL.LJI("beautify_info", C44228HXk.LJII(C44228HXk.LIZJ));
                LJJJLIIL.LIZ(C44228HXk.LJIIIIZZ(C44228HXk.LIZJ), "is_composer");
                LJJJLIIL.LJI("preview_resolution", LIZIZ);
                LJJJLIIL.LJI("duration", String.valueOf(H8F.LJIILIIL(videoPublishEditModel)));
                LJJJLIIL.LJI("creation_duration", String.valueOf(H8F.LJIILIIL(videoPublishEditModel)));
                LJJJLIIL.LJI("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.mCurFilterIds));
                String str4 = "1";
                if (C44739Hh9.LIZ()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                LJJJLIIL.LJI("is_hardcode", str2);
                LJJJLIIL.LIZ(C44739Hh9.LJII(), "video_quality");
                LJJJLIIL.LIZJ(Float.valueOf(C44739Hh9.LJI(H7R.LJJJJI(videoPublishEditModel))), "bitrate");
                if (vEVideoFileInfo != null) {
                    i = vEVideoFileInfo.bitrate;
                } else {
                    i = 0;
                }
                LJJJLIIL.LIZ(i, "file_bitrate");
                LJJJLIIL.LJI("resolution", videoPublishEditModel.getVideoResolution());
                LJJJLIIL.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
                LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
                LJJJLIIL.LJI("prop_list", videoPublishEditModel.mStickerID);
                LJJJLIIL.LIZ(videoPublishEditModel.getEffectList().size(), "edit_effect_num");
                if (!z) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                LJJJLIIL.LJI("is_use_CC_effect", str4);
                LJJJLIIL.LJI("cpu_rate", performanceMonitorService.getCpuUsedRate());
                LJJJLIIL.LJI("memory_rate", performanceMonitorService.getMemoryUsedRate());
                LJJJLIIL.LJI("prop_selected_from", videoPublishEditModel.getPropSource());
                LJJJLIIL.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "source_duration");
                StringBuilder sb = new StringBuilder();
                if (vEVideoFileInfo != null) {
                    i2 = vEVideoFileInfo.width;
                } else {
                    i2 = 0;
                }
                sb.append(i2);
                sb.append('*');
                if (vEVideoFileInfo != null) {
                    i3 = vEVideoFileInfo.height;
                } else {
                    i3 = 0;
                }
                sb.append(i3);
                LJJJLIIL.LJI("original_resolution", sb.toString());
                int i6 = -1;
                if (c143405k0 != null) {
                    obj3 = Float.valueOf(c143405k0.LJLIL);
                } else {
                    obj3 = -1;
                }
                LJJJLIIL.LIZJ(obj3, "fps");
                if (c143405k0 != null) {
                    i4 = c143405k0.LJLILLLLZI;
                } else {
                    i4 = -1;
                }
                LJJJLIIL.LIZ(i4, "lag_count");
                if (c143405k0 != null) {
                    obj4 = Float.valueOf(c143405k0.LJLJJI);
                } else {
                    obj4 = -1;
                }
                LJJJLIIL.LIZJ(obj4, "lag_total_duration");
                if (c143405k0 != null) {
                    i6 = c143405k0.LJLJI;
                }
                LJJJLIIL.LIZ(i6, "serious_lag_count");
                OSZ LJJIIJ = g0.LJJIIJ(videoPublishEditModel);
                if (((Number) LJJIIJ.getSecond()).intValue() + ((Number) LJJIIJ.getFirst()).intValue() <= 1) {
                    i5 = 0;
                }
                LJJJLIIL.LIZ(i5, "is_multi_content");
                java.util.Map<String, String> map = LJJJLIIL.LIZ;
                o.LJIIIIZZ(map, "eventMapBuilder.builder()");
                C42318GjC.LIZIZ("tool_performance_edit_preview", map);
            }
        });
    }

    public static final void LJJIJIIJIL(VideoPublishEditModel model, TextStickerData data, float f, float f2) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(data, "data");
        C145995oB LJJJLIIL = LJJJLIIL(model);
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        Q8U.LIZJ(LJJJLIIL, "shoot_way", model.mShootWay, model, "creation_id");
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(model));
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(model));
        LJJJLIIL.LIZ(0, "is_editor_pro");
        LJJJLIIL.LJI("app_language", C60903NvH.LJIIJJI().LJII());
        if (o.LJ(data.getType(), "type_inline_caption")) {
            str = "caption";
        } else {
            str = "text";
        }
        LJJJLIIL.LJI("text_type", str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(f);
        LIZ2.append(", ");
        LIZ2.append(f2);
        LJJJLIIL.LJI("to_location", X1D.LIZIZ(LIZ2));
        LJJJLIIL.LIZJ(Float.valueOf(data.getScale()), "to_rate");
        LJJJLIIL.LIZJ(Float.valueOf(data.getRotation()), "to_angle");
        if (data.getScale() <= 1.0f) {
            str2 = "zoom_out";
        } else {
            str2 = "zoom_in";
        }
        LJJJLIIL.LJI("action_type", str2);
        if (o.LJ(data.getType(), "type_inline_caption")) {
            InlineCaptionModel inlineCaptionModel = model.creativeModel.inlineCaptionModel;
            if (inlineCaptionModel == null || (str3 = inlineCaptionModel.selectLanguageCode) == null) {
                str3 = "";
            }
            LJJJLIIL.LIZLLL("asr_model_lang", LJJJLL(str3));
        }
        FMX.LJIIL("edit_text", LJJJLIIL.LIZ);
    }

    public static final void LJJIJIL(int i, VideoPublishEditModel model, String str, String str2) {
        o.LJIIIZ(model, "model");
        C145995oB LJIILJJIL = LJIILJJIL(i, model, str2);
        LJIILJJIL.LJI("enter_method", str);
        FMX.LJIIL("enter_edit_subtitle", LJIILJJIL.LIZ);
    }

    public static void LJJIL(int i, VideoPublishEditModel model, String str, int i2) {
        VEUtils.VEVideoFileInfo vEVideoFileInfo;
        String enterMethod;
        if ((i2 & 8) != 0) {
            vEVideoFileInfo = VEUtils.getVideoFileInfo(model.videoPath());
        } else {
            vEVideoFileInfo = null;
        }
        if ((i2 & 16) != 0) {
            enterMethod = "click_back_button";
        } else {
            enterMethod = null;
        }
        if ((i2 & 32) != 0) {
            str = null;
        }
        o.LJIIIZ(model, "model");
        o.LJIIIZ(enterMethod, "enterMethod");
        C145995oB LJIIJJI = LJIIJJI(i, model, null, vEVideoFileInfo, "click_back_button", Boolean.FALSE, "");
        if (C78685UuP.LJJJZ(str)) {
            LJIIJJI.LIZLLL("close_method", str);
            FMX.LJIIL("editor_pro_intro_closeup", LJIIJJI.LIZ);
        } else {
            FMX.LJIIL("editor_pro_intro_popup", LJIIJJI.LIZ);
        }
    }

    public static final void LJJIZ(int i, VideoPublishEditModel videoPublishEditModel, String enterMethod, String selectedLanguageCode) {
        String LJJJLL;
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(selectedLanguageCode, "selectedLanguageCode");
        if (videoPublishEditModel != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", "video_edit_page");
            Q8U.LIZJ(c145995oB, "shoot_way", videoPublishEditModel.mShootWay, videoPublishEditModel, "creation_id");
            c145995oB.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
            c145995oB.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
            c145995oB.LJI("enter_method", enterMethod);
            c145995oB.LIZ(i, "is_editor_pro");
            c145995oB.LJI("app_language", C60903NvH.LJIIJJI().LJII());
            if (selectedLanguageCode.length() == 0) {
                LJJJLL = C60903NvH.LJIIJJI().LJII();
            } else {
                LJJJLL = LJJJLL(selectedLanguageCode);
            }
            c145995oB.LJI("asr_model_lang", LJJJLL);
            FMX.LJIIL("preview_subtitle", c145995oB.LIZ);
        }
    }

    public static final void LJJJ(int i, VideoPublishEditModel model, String selectedLanguageCode, boolean z) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(selectedLanguageCode, "selectedLanguageCode");
        C145995oB LJIILJJIL = LJIILJJIL(i, model, selectedLanguageCode);
        LJIILJJIL.LIZ(z ? 1 : 0, "is_changed");
        FMX.LJIIL("save_edit_subtitle", LJIILJJIL.LIZ);
    }

    public static final void LJIILLIIL(VideoPublishEditModel model, long j, String str, int i, String selectedLanguageCode) {
        String LJJJLL;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(selectedLanguageCode, "selectedLanguageCode");
        C145995oB LJIILJJIL = LJIILJJIL(0, model, "");
        LJIILJJIL.LIZ(model.getVideoLength(), "video_duration");
        LJIILJJIL.LIZIZ(SystemClock.elapsedRealtime() - j, "load_time");
        LJIILJJIL.LJI("load_status", str);
        LJIILJJIL.LIZ(i, "is_editor_pro");
        LJIILJJIL.LJI("app_language", C60903NvH.LJIIJJI().LJII());
        if (selectedLanguageCode.length() == 0) {
            LJJJLL = C60903NvH.LJIIJJI().LJII();
        } else {
            LJJJLL = LJJJLL(selectedLanguageCode);
        }
        LJIILJJIL.LJI("asr_model_lang", LJJJLL);
        FMX.LJIIL("auto_subtitle_end", LJIILJJIL.LIZ);
    }

    public static /* synthetic */ void LJJIIZI(VideoPublishEditModel videoPublishEditModel, String str, int i, C67P c67p, int i2) {
        Boolean bool;
        Boolean bool2;
        C67P c67p2 = c67p;
        Boolean bool3 = null;
        if ((i2 & 8) != 0) {
            c67p2 = null;
        }
        if ((i2 & 16) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        if ((i2 & 32) != 0) {
            bool2 = Boolean.FALSE;
        } else {
            bool2 = null;
        }
        if ((i2 & 64) != 0) {
            bool3 = Boolean.FALSE;
        }
        LJJIIZ(videoPublishEditModel, str, i, c67p2, bool, bool2, bool3);
    }

    public static final void LJJIJLIJ(final int i, final Bundle bundle, final VideoPublishEditModel model, final Boolean bool, final String str) {
        o.LJIIIZ(model, "model");
        AbstractC73672Svk.LJJIJIL(model).LJJJ(T16.LIZ()).LJJIJL(new IDhS100S0100000_7(model, 1)).LJJJJZI(new InterfaceC64592gB() { // from class: X.5nf
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String str2;
                MultiEditVideoRecordData multiEditVideoRecordData;
                List<MultiEditVideoSegmentRecordData> list;
                AbstractC65743Pr9 abstractC65743Pr9 = (AbstractC65743Pr9) obj;
                Bundle bundle2 = bundle;
                if (bundle2 == null || (str2 = bundle2.getString("enter_edit_page_method")) == null) {
                    str2 = "click_next_button";
                }
                if (e1.LIZ(31744, "creative_tools_enable_mob_loudness_and_bitrate", true, true)) {
                    VideoPublishEditModel videoPublishEditModel = model;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (videoPublishEditModel.isUploadVideo()) {
                        ArrayList<ImportVideoInfo> arrayList4 = videoPublishEditModel.importInfoList;
                        if (arrayList4 != null) {
                            Iterator<ImportVideoInfo> it = arrayList4.iterator();
                            while (it.hasNext()) {
                                ImportVideoInfo next = it.next();
                                String realImportPath = next.getRealImportPath();
                                if (realImportPath != null) {
                                    arrayList.add(realImportPath);
                                    arrayList2.add(0);
                                    arrayList3.add(Integer.valueOf((int) next.getDuration()));
                                }
                            }
                        }
                    } else {
                        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.originMultiEditRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                                String str3 = multiEditVideoSegmentRecordData.audioPath;
                                if (str3 != null) {
                                    arrayList.add(str3);
                                    arrayList2.add(0);
                                    arrayList3.add(Integer.valueOf((int) (multiEditVideoSegmentRecordData.audioLength / 1000)));
                                }
                            }
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    LoudnessDetectResult[] LJIILJJIL = VEEditor.LJIILJJIL((String[]) arrayList.toArray(new String[0]), ORZ.LLJ(arrayList2), ORZ.LLJ(arrayList3));
                    if (LJIILJJIL != null) {
                        for (LoudnessDetectResult loudnessDetectResult : LJIILJJIL) {
                            arrayList5.add(Integer.valueOf((int) loudnessDetectResult.avgLoudness));
                        }
                    }
                    videoPublishEditModel.segmentLoudness = arrayList5;
                }
                H8F.LJJIJL(i, model, bundle, (VEUtils.VEVideoFileInfo) abstractC65743Pr9.orNull(), str2, bool, str);
            }
        });
    }

    public static final void LJJJI(VideoPublishEditModel model, String str, String str2, int i, float f) {
        o.LJIIIZ(model, "model");
        C145995oB LJJJLIIL = LJJJLIIL(model);
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        LJJJLIIL.LJI("shoot_way", model.mShootWay);
        LJJJLIIL.LJI("enter_method", str);
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        LJJJLIIL.LJI("filter_name", str2);
        LJJJLIIL.LIZ(i, "filter_id");
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(model));
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(model));
        LJJJLIIL.LIZJ(Float.valueOf(f), "filter_value");
        LJJJLIIL.LIZ(!o.LJ(str, "slide") ? 1 : 0, "is_selected_from_entrance");
        int i2 = model.draftId;
        if (i2 != 0) {
            LJJJLIIL.LIZ(i2, "draft_id");
        }
        String str3 = model.newDraftId;
        o.LJIIIIZZ(str3, "model.newDraftId");
        if (str3.length() > 0) {
            LJJJLIIL.LIZLLL("new_draft_id", model.newDraftId);
        }
        C38836FMa.LIZLLL("select_filter", LJJJLIIL.LIZ);
    }

    public static void LJJJJLL(VideoPublishEditModel model, String str, int i, String str2, String textType, int i2) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            textType = "";
        }
        o.LJIIIZ(model, "model");
        o.LJIIIZ(textType, "textType");
        C145995oB LJFF = LJFF(model, false, false, 6);
        LJFF.LIZ(i, "is_editor_pro");
        LJFF.LJI("text_add_type", str);
        if (str2 != null) {
            LJFF.LIZLLL("click_from", str2);
        }
        LJFF.LJI("text_type", textType);
        FMX.LJIIL("text_more_click", LJFF.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0894 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0c31  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0b52  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0bda  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0c52  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0c58  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C145995oB LJIIJJI(int r16, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r17, android.os.Bundle r18, com.ss.android.vesdk.VEUtils.VEVideoFileInfo r19, java.lang.String r20, java.lang.Boolean r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 3186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8F.LJIIJJI(int, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.os.Bundle, com.ss.android.vesdk.VEUtils$VEVideoFileInfo, java.lang.String, java.lang.Boolean, java.lang.String):X.5oB");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5oB] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4, java.lang.String r5, int r6, X.C67P r7, java.lang.Boolean r8, java.lang.Boolean r9, java.lang.Boolean r10) {
        /*
            java.lang.String r0 = "enterMethod"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            if (r4 != 0) goto L8
            return
        L8:
            X.5oB r2 = LJJJLIIL(r4)
            java.lang.String r1 = r4.getCreationId()
            java.lang.String r0 = "creation_id"
            r2.LJI(r0, r1)
            java.lang.String r0 = "enter_method"
            r2.LJI(r0, r5)
            java.lang.String r1 = r4.mShootWay
            java.lang.String r0 = "shoot_way"
            r2.LJI(r0, r1)
            java.lang.String r1 = X.H7R.LJIIIZ(r4)
            java.lang.String r0 = "content_type"
            r2.LJI(r0, r1)
            java.lang.String r1 = X.H7R.LJIIIIZZ(r4)
            java.lang.String r0 = "content_source"
            r2.LJI(r0, r1)
            java.lang.String r1 = "is_multi_content"
            int r0 = LJIIL(r4)
            r2.LIZ(r0, r1)
            java.lang.String r0 = "is_editor_pro"
            r2.LIZ(r6, r0)
            java.lang.String r1 = r4.getStickers()
            if (r1 != 0) goto L49
            java.lang.String r1 = ""
        L49:
            java.lang.String r0 = "prop_list"
            r2.LJI(r0, r1)
            boolean r1 = r4.containBackgroundVideo
            java.lang.String r0 = "is_gsv_prop"
            r2.LIZ(r1, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "video_edit_page"
            r2.LJI(r1, r0)
            r3 = 0
            if (r7 == 0) goto L69
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r7.getData()
            if (r0 == 0) goto L69
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel r3 = r0.getTtsVoiceModel()
        L69:
            java.lang.String r1 = "text_add_type"
            if (r3 != 0) goto L75
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r0)
            if (r0 == 0) goto Lc7
        L75:
            java.lang.String r0 = "auto"
            r2.LIZLLL(r1, r0)
        L7a:
            r3 = 0
            r1 = 1
            if (r7 == 0) goto Lb3
            boolean r0 = r7.LJLLL
            if (r0 != r1) goto Lb3
        L82:
            boolean r1 = r7.getGuideFirstEdit()
        L86:
            java.lang.String r0 = "is_ecom_auto_text"
            r2.LIZ(r1, r0)
            if (r7 != 0) goto Laf
        L8d:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.CreativeInitialModel r0 = r0.initialModel
            com.ss.android.ugc.aweme.creative.model.InitialMobParams r0 = r0.mobParams
            if (r0 == 0) goto L9f
            java.lang.String r1 = r0.enterType
            if (r1 == 0) goto L9f
            int r0 = r1.length()
            if (r0 != 0) goto La7
        L9f:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "click_text_entrance"
            X.GXR.LIZ(r0, r1)
            return
        La7:
            if (r1 == 0) goto L9f
            java.lang.String r0 = "enter_type"
            r2.LIZLLL(r0, r1)
            goto L9f
        Laf:
            r7.setGuideFirstEdit(r3)
            goto L8d
        Lb3:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r9, r0)
            if (r0 == 0) goto L8d
            if (r7 == 0) goto Lbe
            goto L82
        Lbe:
            if (r10 == 0) goto Lc5
            boolean r1 = r10.booleanValue()
            goto L86
        Lc5:
            r1 = 0
            goto L86
        Lc7:
            java.lang.String r0 = "user_click"
            r2.LIZLLL(r1, r0)
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8F.LJJIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, int, X.67P, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void");
    }

    public static final void LJJIJL(int i, VideoPublishEditModel model, Bundle bundle, VEUtils.VEVideoFileInfo vEVideoFileInfo, String str, Boolean bool, String str2) {
        String tabOrder;
        StickerInfo stickerInfo;
        String propTabId;
        o.LJIIIZ(model, "model");
        C145995oB LJIIJJI = LJIIJJI(i, model, bundle, vEVideoFileInfo, str, bool, str2);
        H8W.LIZ("enter_video_edit_page");
        LJIIJJI.LIZ(C78841Uwv.LJ(C47636Imm.LIZ()), "earphone_state");
        StickerInfo stickerInfo2 = model.stickerInfo;
        int i2 = 0;
        if (stickerInfo2 != null && (tabOrder = stickerInfo2.getTabOrder()) != null && tabOrder.equals("1") && ((stickerInfo = model.stickerInfo) == null || (propTabId = stickerInfo.getPropTabId()) == null || !propTabId.equals("-1"))) {
            i2 = 1;
        }
        LJIIJJI.LIZ(i2, "prop_selected_from_trending");
        CreativeModel creativeModel = model.creativeModel;
        o.LJIIIIZZ(creativeModel, "model.creativeModel");
        C161226Uk.LIZIZ(creativeModel, new AddYoursStickerModel(null, null, null, null, null, null, false, false, false, null, null, null, 4095, null), LJIIJJI);
        Z9N z9n = Z9N.LIZIZ;
        if (z9n.LJFF() != null) {
            if (z9n.LJFF().LJIILL()) {
                LJIIJJI.LIZLLL("is_friend_tag", "1");
            } else {
                LJIIJJI.LIZLLL("is_friend_tag", CardStruct.IStatusCode.DEFAULT);
            }
            if (z9n.LJFF().LJIILLIIL()) {
                LJIIJJI.LIZLLL("is_following_tag ", "1");
            } else {
                LJIIJJI.LIZLLL("is_following_tag ", CardStruct.IStatusCode.DEFAULT);
            }
        }
        LJIIJJI.LJFF(new H96().LJFF("is_promote_pa"));
        GXR.LIZ("enter_video_edit_page", LJIIJJI.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJJJIZL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4, java.lang.String r5, int r6, int r7, java.lang.String r8, java.lang.String r9, int r10, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r11) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            X.5oB r2 = LJJJLIIL(r4)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "video_edit_page"
            r2.LJI(r1, r0)
            java.lang.String r3 = r4.mShootWay
            java.lang.String r1 = "shoot_way"
            java.lang.String r0 = "creation_id"
            X.Q8U.LIZJ(r2, r1, r3, r4, r0)
            java.lang.String r0 = "is_subtitle"
            r2.LIZ(r6, r0)
            java.lang.String r0 = "is_editor_pro"
            r2.LIZ(r10, r0)
            java.lang.String r0 = "enter_method"
            r2.LJI(r0, r5)
            java.lang.String r1 = X.H7R.LJIIIIZZ(r4)
            java.lang.String r0 = "content_source"
            r2.LJI(r0, r1)
            java.lang.String r1 = X.H7R.LJIIIZ(r4)
            java.lang.String r0 = "content_type"
            r2.LJI(r0, r1)
            java.lang.String r0 = "is_guidance_text"
            r2.LIZ(r7, r0)
            java.lang.String r0 = "delete_method"
            r2.LJI(r0, r8)
            boolean r3 = r11 instanceof com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel
            if (r3 == 0) goto L77
            r0 = r11
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r0
            r1 = 1
            if (r0 == 0) goto L68
            boolean r0 = com.google.android.play.core.appupdate.u.LJIJ(r0)
            if (r0 != r1) goto L68
            java.lang.String r1 = "caption"
        L54:
            java.lang.String r0 = "text_type"
            r2.LJI(r0, r1)
            if (r9 == 0) goto L60
            java.lang.String r0 = "text_add_type"
            r2.LIZLLL(r0, r9)
        L60:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "text_delete"
            X.FMX.LJIIL(r0, r1)
            return
        L68:
            if (r3 == 0) goto L77
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r11 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r11
            if (r11 == 0) goto L77
            boolean r0 = com.google.android.play.core.appupdate.u.LJIILLIIL(r11)
            if (r0 != r1) goto L77
            java.lang.String r1 = "ai_text"
            goto L54
        L77:
            java.lang.String r1 = "text"
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8F.LJJJJIZL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, int, int, java.lang.String, java.lang.String, int, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel):void");
    }
}
