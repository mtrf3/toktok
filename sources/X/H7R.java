package X;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.HDRModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import defpackage.e1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class H7R {
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.getImageAlbumData() != null && videoPublishEditModel.getImageAlbumData().getImageList() != null && videoPublishEditModel.getImageAlbumData().getImageList().size() == 1) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(DraftInfoModel draftInfoModel) {
        o.LJIIIZ(draftInfoModel, "<this>");
        if (draftInfoModel.isPublishedDraft) {
            draftInfoModel.isPublishedDraft = false;
            draftInfoModel.publishedTime = 0L;
            draftInfoModel.publishedAwemeId = "";
            draftInfoModel.isConvertToNormalDraft = true;
        }
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        int i = videoPublishEditModel.mVideoCanvasWidth;
        if (i > 0 && videoPublishEditModel.mVideoCanvasHeight > 0 && (i >= videoPublishEditModel.videoWidth() || videoPublishEditModel.mVideoCanvasHeight >= videoPublishEditModel.videoHeight())) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.isStitchMode() || videoPublishEditModel.isDuet() || C47261Igj.LJJIJIIJI("single_song", "prop_page", "mv_page", "click_internal_entrance", "prop_reuse", "mv_reuse", "ugc_template", "pugc_template", "autocut_anchor").contains(videoPublishEditModel.mShootWay)) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (LJJJJL(videoPublishEditModel)) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null) {
                return imageAlbumData.getAutoEnhanceOn();
            }
            return false;
        }
        return videoPublishEditModel.autoEnhanceOn;
    }

    public static final int LJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        C164846dU mainBusinessContext = videoPublishEditModel.getMainBusinessContext();
        EnumC164816dR[] enumC164816dRArr = {EnumC164816dR.TRACK_PAGE_RECORD};
        LinkedList linkedList = new LinkedList();
        InteractStickerTracksContext LJII = C164826dS.LJII(mainBusinessContext);
        if (LJII == null || LJII.isEmpty(enumC164816dRArr)) {
            linkedList = null;
        } else {
            linkedList.addAll(LJII.getStickerStructsByPage(enumC164816dRArr));
        }
        if (!C79004UzY.LJJIFFI(linkedList)) {
            return 54;
        }
        if (videoPublishEditModel.ttStoryUploadModel == null || C00F.LIZ(31744, 0, "tt_story_opt_create_experiment", true) == 1) {
            if (videoPublishEditModel.ttStoryUploadModel != null && LJJJJL(videoPublishEditModel)) {
                return 152;
            }
            if (LJJJJL(videoPublishEditModel)) {
                return 150;
            }
            if (LJJLIIIJJIZ(videoPublishEditModel)) {
                return 160;
            }
            if (!videoPublishEditModel.isPhotoMvMode) {
                if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isCutSameVideoType()) {
                    return 53;
                }
                if (videoPublishEditModel.isStitchMode()) {
                    return 58;
                }
                if (videoPublishEditModel.isDuet()) {
                    return 51;
                }
                if (videoPublishEditModel.isStickPointMode || videoPublishEditModel.editMusicSyncMode) {
                    return 55;
                }
                if (!C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData)) {
                    return -1;
                }
            }
            return 61;
        }
        return 40;
    }

    public static final String LJII(VideoPublishEditModel videoPublishEditModel) {
        CanvasBackground background;
        String filePath;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
        if (canvasVideoData != null && (background = canvasVideoData.getBackground()) != null && (filePath = background.getFilePath()) != null) {
            return s.LJLLJ(filePath, "/");
        }
        return "";
    }

    public static final String LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        List<MultiEditVideoSegmentRecordData> list;
        if (videoPublishEditModel == null) {
            return "";
        }
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            if (videoPublishEditModel.mOrigin != 0) {
                return "shoot";
            }
            return "upload";
        }
        if (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft()) {
            if (videoPublishEditModel.getEditorProModel().getAlbumUploadVideoSegments().size() == 0) {
                return "shoot";
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null && videoPublishEditModel.getEditorProModel().getAlbumUploadVideoSegments().size() == list.size()) {
                return "upload";
            }
            return "shoot_and_upload";
        }
        if (C79004UzY.LJJIIJ(videoPublishEditModel.canvasVideoData)) {
            return "upload";
        }
        StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
        if (storyEditEtParam != null) {
            String contentSource = storyEditEtParam.getContentSource();
            if (contentSource == null) {
                return "";
            }
            return contentSource;
        }
        if (videoPublishEditModel.getAvetParameter() != null) {
            return videoPublishEditModel.getAvetParameter().getContentSource();
        }
        if (!videoPublishEditModel.mFromCut && !videoPublishEditModel.mFromMultiCut && !videoPublishEditModel.isMvThemeVideoType()) {
            return "shoot";
        }
        return "upload";
    }

    public static final String LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return "";
        }
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            return "autocut";
        }
        StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
        if (storyEditEtParam != null) {
            String contentType = storyEditEtParam.getContentType();
            if (contentType == null) {
                return "";
            }
            return contentType;
        }
        if (LJJJJL(videoPublishEditModel)) {
            if (videoPublishEditModel.ttStoryUploadModel != null) {
                return "story_photo";
            }
            return "multi_photo";
        }
        if (LJJLIIIJJIZ(videoPublishEditModel)) {
            return "text";
        }
        if (videoPublishEditModel.isPhotoMvMode) {
            return "slideshow";
        }
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isCutSameVideoType()) {
            return "mv";
        }
        if (videoPublishEditModel.isStickPointMode || videoPublishEditModel.editMusicSyncMode) {
            return "sound_sync";
        }
        if (C79004UzY.LJJIJL(videoPublishEditModel.canvasVideoData) || C79004UzY.LJJIII(videoPublishEditModel.canvasVideoData)) {
            return "share";
        }
        if (C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData)) {
            return "photo_canvas";
        }
        if (videoPublishEditModel.getAvetParameter() != null) {
            return videoPublishEditModel.getAvetParameter().getContentType();
        }
        return "video";
    }

    public static final VideoPublishEditModel LJIIJ(Intent intent) {
        o.LJIIIZ(intent, "<this>");
        Serializable serializableExtra = intent.getSerializableExtra("args");
        o.LJII(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializableExtra;
        videoPublishEditModel.creativeModel = C78996UzQ.LJIILL(intent);
        return videoPublishEditModel;
    }

    public static final Integer LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        TimeSpeedModelExtension timeSpeedModelExtension;
        StickerInfo stickerInfo;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData == null || (arrayList = multiEditVideoStatusRecordData.originalSegments) == null) {
            return null;
        }
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                timeSpeedModelExtension = it.next();
                StickerInfo stickerInfo2 = timeSpeedModelExtension.getStickerInfo();
                if (stickerInfo2 != null && stickerInfo2.getSource() != null) {
                    break;
                }
            } else {
                timeSpeedModelExtension = null;
                break;
            }
        }
        TimeSpeedModelExtension timeSpeedModelExtension2 = timeSpeedModelExtension;
        if (timeSpeedModelExtension2 == null || (stickerInfo = timeSpeedModelExtension2.getStickerInfo()) == null) {
            return null;
        }
        return stickerInfo.getSource();
    }

    public static final boolean LJIIL(VideoPublishEditModel videoPublishEditModel) {
        Cut2EditTransferModel cut2EditTransferModel;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        boolean z = videoPublishEditModel.creativeModel.draftInfoModel.isDraft;
        if ((!z || !videoPublishEditModel.editMusicSyncMode) && (z || (cut2EditTransferModel = videoPublishEditModel.cut2EditTransferModel) == null || !cut2EditTransferModel.getMusicSyncMode())) {
            return false;
        }
        return true;
    }

    public static final String LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.isStoryEditMode) {
            return "story-filter";
        }
        return "colorfilternew";
    }

    public static final String LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData)) {
            return H7S.LIZ().highQualityVeSynthesisSettings;
        }
        if (videoPublishEditModel.isTemplateMv()) {
            return H7T.LIZ().highQualityVeSynthesisSettings;
        }
        return C44654Hfm.LIZ();
    }

    public static final List<String> LJIILL(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(imageList, 10));
            Iterator<SingleImageData> it = imageList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFilterInfo().getFilterId());
            }
            return arrayList;
        }
        return null;
    }

    public static final List<String> LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(imageList, 10));
            Iterator<SingleImageData> it = imageList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFilterInfo().getFilterLabel());
            }
            return arrayList;
        }
        return null;
    }

    public static String LJIJ(VideoPublishEditModel videoPublishEditModel) {
        return LJIIZILJ(videoPublishEditModel, C78983UzD.LJLJJI);
    }

    public static final String LJIJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (C79004UzY.LJJIII(videoPublishEditModel.canvasVideoData)) {
            return "others_share";
        }
        if (C79004UzY.LJJIJL(videoPublishEditModel.canvasVideoData)) {
            return "music_share";
        }
        if (videoPublishEditModel.creativeModel.reuseSoundAndEffectModel.isMusicFromDiscoveryPage()) {
            return "prop_panel_discovery";
        }
        String musicOriginWithCheck = videoPublishEditModel.getMusicOriginWithCheck();
        o.LJIIIIZZ(musicOriginWithCheck, "musicOriginWithCheck");
        return musicOriginWithCheck;
    }

    public static final String LJIJJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        String str = "-1";
        if (videoPublishEditModel.isStitchMode() || videoPublishEditModel.isDuet() || C47261Igj.LJJIJIIJI("single_song", "prop_page").contains(videoPublishEditModel.mShootWay)) {
            String str2 = videoPublishEditModel.fromItemId;
            if (str2 != null && str2.length() != 0) {
                str = videoPublishEditModel.fromItemId;
            }
            o.LJIIIIZZ(str, "{\n        if (fromItemId…-1\" else fromItemId\n    }");
        }
        return str;
    }

    public static final String LJIJJLI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (LJJLIIIJJIZ(videoPublishEditModel)) {
            return "2";
        }
        if (LJJJJI(videoPublishEditModel)) {
            return "3";
        }
        return "1";
    }

    public static final boolean LJIL(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isStitchMode()) {
            z = true;
        } else {
            z = false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null) {
            multiEditVideoStatusRecordData.isSupportMultiEdit = z;
        }
        if (z && multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.curMultiEditVideoRecordData != null) {
            return true;
        }
        return false;
    }

    public static final String LJJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.mShootMode == 19) {
            return "upload_tab";
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            return "mv";
        }
        int i = videoPublishEditModel.mShootMode;
        if (i == 2) {
            return "fast_shoot";
        }
        if (i != 8) {
            if (i == 20) {
                return "fast_shoot";
            }
            if (i != 10) {
                if (i != 11) {
                    switch (i) {
                        case 14:
                            return "video_180";
                        case 15:
                            return "fast_shoot";
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            return C60903NvH.LJIIJJI().LJJIII().getNowUIService().getTabName();
                        case 17:
                            return "photo";
                        case 18:
                            return "video_600";
                        default:
                            return "";
                    }
                }
                return "video_60";
            }
            return "video_15";
        }
        return "video";
    }

    public static final String LJJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData)) {
            return H7S.LIZ().veSynthesisSettings;
        }
        if (videoPublishEditModel.isTemplateMv()) {
            return H7T.LIZ().veSynthesisSettings;
        }
        return C44654Hfm.LIZIZ(LJJJJI(videoPublishEditModel));
    }

    public static final String LJJIFFI(VideoPublishEditModel videoPublishEditModel) {
        List<MultiEditVideoSegmentRecordData> list;
        if (videoPublishEditModel == null) {
            return null;
        }
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            if (videoPublishEditModel.mOrigin != 0) {
                return "shoot";
            }
            return "upload";
        }
        if (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft()) {
            if (videoPublishEditModel.getEditorProModel().getAlbumUploadVideoSegments().size() == 0) {
                return "shoot";
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null && videoPublishEditModel.getEditorProModel().getAlbumUploadVideoSegments().size() == list.size()) {
                return "upload";
            }
            return "shoot_and_upload";
        }
        if (o.LJ(LJIIIZ(videoPublishEditModel), "photo_canvas") || LJJJJL(videoPublishEditModel) || LJJJJI(videoPublishEditModel)) {
            if (videoPublishEditModel.mOrigin == 1) {
                return "shoot";
            }
            return "upload";
        }
        if (!videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.mFromCut && !videoPublishEditModel.mFromMultiCut && !videoPublishEditModel.isSoundSyncFromAnchor() && !videoPublishEditModel.creativeModel.ugcTemplateData.isUgcTemplateFromAnchor && !videoPublishEditModel.isCutSameVideoType() && !C79004UzY.LJJIIJ(videoPublishEditModel.canvasVideoData)) {
            return "shoot";
        }
        return "upload";
    }

    public static final boolean LJJII(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.captionStruct != null || videoPublishEditModel.creativeModel.inlineCaptionModel != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIII(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && !list.isEmpty()) {
            for (StickerItemModel it : list) {
                o.LJIIIIZZ(it, "it");
                if (C1535160t.LIZIZ(it)) {
                    break;
                }
            }
        }
        if (C32151Nz.LJJIIJZLJL(videoPublishEditModel.getEffectList()) && !videoPublishEditModel.isCurrentAutoCutMode() && !(!videoPublishEditModel.getEditorProModel().getMagicCombineEffectAlgoCachePaths().isEmpty())) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (C69162nY.LIZ()) {
            if (!videoPublishEditModel.creativeModel.mobileEffectsModel2.exportedEffects.isEmpty()) {
                return true;
            }
        } else if (!videoPublishEditModel.creativeModel.mobileEffectsModel.exportedEffects.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJJIIJZLJL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r6.getPreviewInfo()
            r1 = 0
            if (r0 == 0) goto L10
            java.util.List r1 = r0.getVideoList()
        L10:
            r6 = 0
            r4 = 1
            if (r1 == 0) goto L1a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1b
        L1a:
            return r6
        L1b:
            java.util.Iterator r5 = r1.iterator()
        L1f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r3 = r5.next()
            r0 = r3
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r0 = (com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r0
            java.lang.String r2 = r0.getVideoPath()
            X.5H3 r0 = X.C42552Gmy.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L66
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = X.H7R.LIZ
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L58
            com.ss.android.vesdk.VEUtils$VEVideoFileInfo r0 = com.ss.android.vesdk.VEUtils.getVEVideoFileInfo(r2)
            if (r0 == 0) goto L64
            boolean r0 = r0.bHDR
            if (r0 != r4) goto L64
            r0 = 1
        L51:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.put(r2, r0)
        L58:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
        L60:
            if (r3 == 0) goto L1a
            r6 = 1
            goto L1a
        L64:
            r0 = 0
            goto L51
        L66:
            com.ss.android.vesdk.VEUtils$VEVideoFileInfo r0 = com.ss.android.vesdk.VEUtils.getVEVideoFileInfo(r2)
            if (r0 == 0) goto L1f
            boolean r0 = r0.bHDR
            if (r0 != r4) goto L1f
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H7R.LJJIIJZLJL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):int");
    }

    public static final boolean LJJIIZ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.creativeModel.inlineCaptionModel != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZI(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData == null || (arrayList = multiEditVideoStatusRecordData.originalSegments) == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            StickerInfo stickerInfo = it.next().getStickerInfo();
            if (stickerInfo != null && stickerInfo.isMobileEffect()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIJIIJI(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData == null || (arrayList = multiEditVideoStatusRecordData.originalSegments) == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            StickerInfo stickerInfo = it.next().getStickerInfo();
            if (stickerInfo != null && stickerInfo.isStackableEffect()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIJIIJIL(VideoPublishEditModel videoPublishEditModel) {
        MvCreateVideoData mvCreateVideoData;
        ArrayList<String> arrayList;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!C60903NvH.LJIIJJI().getAccountService().isLogin() || C1DG.LJIIIIZZ() || !C43865HJl.LIZ()) {
            return false;
        }
        if (C43865HJl.LIZJ() == 1 && o.LJ(LJIIIIZZ(videoPublishEditModel), "upload")) {
            return false;
        }
        if ((!LJJLIIIIJ(videoPublishEditModel) && (!videoPublishEditModel.isPhotoMvMode || (mvCreateVideoData = videoPublishEditModel.mvCreateVideoData) == null || (arrayList = mvCreateVideoData.selectMediaList) == null || arrayList.size() != 1)) || LJJLIIIJJIZ(videoPublishEditModel) || LJJIZ(videoPublishEditModel) || C79004UzY.LJJIJL(videoPublishEditModel.canvasVideoData)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        o.LJIIIIZZ(creativeModel, "creativeModel");
        return C78996UzQ.LJJIFFI(creativeModel);
    }

    public static final boolean LJJIJL(VideoPublishEditModel videoPublishEditModel) {
        AutoCutThemeData autoCutThemeData;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!videoPublishEditModel.isCurrentAutoCutMode()) {
            return false;
        }
        Iterator<AutoCutThemeData> it = videoPublishEditModel.creativeModel.autoCutModel.templateList.iterator();
        while (true) {
            if (it.hasNext()) {
                autoCutThemeData = it.next();
                AutoCutThemeData autoCutThemeData2 = autoCutThemeData;
                if (autoCutThemeData2.LIZ() == AnonymousClass636.LJJ(videoPublishEditModel.creativeModel.autoCutModel.curSource) && autoCutThemeData2.indexFromSource == videoPublishEditModel.creativeModel.autoCutModel.curIndexFromSource) {
                    break;
                }
            } else {
                autoCutThemeData = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData3 = autoCutThemeData;
        if (autoCutThemeData3 == null || autoCutThemeData3.templateType != EnumC43998HOo.CUT_SAME.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJLIJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (LJJLI(videoPublishEditModel) && LJJJLL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.canvasVideoData != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIZ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        return videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar;
    }

    public static final boolean LJJJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!LJIL(videoPublishEditModel) || videoPublishEditModel.getSharedARModel() != null || videoPublishEditModel.isDuet()) {
            return false;
        }
        if (videoPublishEditModel.containBackgroundVideo) {
            if (!C60903NvH.LJIIJJI().LJIIJJI().LJFF(videoPublishEditModel)) {
                return false;
            }
            ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
            o.LJIIIIZZ(finalVideoList, "this.finalVideoList");
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (next.getBackgroundVideo() != null && next.getmBackgroundVideoTimeInfo() != null) {
                    z = true;
                }
            }
            if (!z || !e1.LIZ(31744, "studio_editor_pro_enable_gsv", true, false)) {
                return false;
            }
        }
        if (!videoPublishEditModel.supportRetake || videoPublishEditModel.isCutSameVideoType() || videoPublishEditModel.isPhotoMvMode) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        return videoPublishEditModel.creativeModel.draftInfoModel.isDraft;
    }

    public static final boolean LJJJIL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if ((o.LJ("editing_effect_page", videoPublishEditModel.mShootWay) || o.LJ("editing_effect_template", videoPublishEditModel.mShootWay)) && videoPublishEditModel.photoCount > 1 && videoPublishEditModel.videoCount == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.cut2EditTransferModel != null) {
            return !r0.isVideoCompressed();
        }
        return videoPublishEditModel.isFastImport;
    }

    public static final boolean LJJJJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.creativeModel.nowsShootModel != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJIZL(VideoPublishEditModel videoPublishEditModel) {
        NowsShootModel nowsShootModel;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!LJJJJI(videoPublishEditModel) || (nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel) == null || nowsShootModel.type != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJJ(HDRModel hDRModel) {
        o.LJIIIZ(hDRModel, "<this>");
        int i = hDRModel.videoCodeType;
        if (i == 67 || i == 2084) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJJL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.hasStickers() || videoPublishEditModel.getTimeEffect() != null || C32151Nz.LJJIIZI(videoPublishEditModel.getEffectList()) || videoPublishEditModel.mSelectedId != 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.creationMode == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJLI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.photoCount > 0 && videoPublishEditModel.videoCount > 0 && videoPublishEditModel.isFastImport) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJLL(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!LJJJJL(videoPublishEditModel) || (imageAlbumData = videoPublishEditModel.getImageAlbumData()) == null || (imageList = imageAlbumData.getImageList()) == null || imageList.size() <= 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJZ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        return !LJJLIIIJJIZ(videoPublishEditModel);
    }

    public static final boolean LJJJJZI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel == null || !nowsShootModel.isNormalPublish) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJLIIL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        return videoPublishEditModel.creativeModel.ugcTemplateData.isPUgcTemplateFromAnchor;
    }

    public static final boolean LJJJLL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        return C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData);
    }

    public static final boolean LJJJLZIJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.isPhotoMvMode || C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJZ(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        List<MultiEditVideoSegmentRecordData> list2;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.mOrigin != 1) {
            return false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
        if ((multiEditVideoStatusRecordData2 != null && (multiEditVideoRecordData2 = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) != null && (list2 = multiEditVideoRecordData2.segmentDataList) != null && list2.isEmpty()) || (multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData) == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null || (list = multiEditVideoRecordData.segmentDataList) == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            if (hashSet.add(Integer.valueOf(multiEditVideoSegmentRecordData.rotate))) {
                arrayList.add(multiEditVideoSegmentRecordData);
            }
        }
        if (arrayList.size() <= 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJL(VideoPublishEditModel videoPublishEditModel) {
        ShoutOutsData shoutOutsData;
        if (videoPublishEditModel == null || (shoutOutsData = videoPublishEditModel.mShoutOutsData) == null) {
            return false;
        }
        return ujb.o.LJJJJIZL(shoutOutsData.getShoutOutsMode(), ShoutOutsData.MODE_POST, false);
    }

    public static final boolean LJJLI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        o.LJIIIIZZ(creativeModel, "creativeModel");
        if (C78996UzQ.LJJIFFI(creativeModel) || !C150325vA.LIZ() || videoPublishEditModel.creationMode != 2 || !LIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIIJ(VideoPublishEditModel videoPublishEditModel) {
        List<String> sourceInfo;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
        if (canvasVideoData == null || !C79004UzY.LJJIIZI(canvasVideoData) || (sourceInfo = canvasVideoData.getSourceInfo()) == null || sourceInfo.size() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isSingleSegmentVideo: ");
        LIZ2.append(videoPublishEditModel.mIsMultiVideo);
        LIZ2.append(' ');
        LIZ2.append(videoPublishEditModel.mFromCut);
        LIZ2.append(' ');
        LIZ2.append(videoPublishEditModel.mVideoSegmentsDesc);
        H78.LIZ(X1D.LIZIZ(LIZ2));
        if (videoPublishEditModel.mIsMultiVideo) {
            return false;
        }
        if (videoPublishEditModel.mFromCut) {
            return true;
        }
        String str = videoPublishEditModel.mVideoSegmentsDesc;
        if (str == null || str.length() == 0 || CameraComponentModel.LJIIJJI(videoPublishEditModel.mVideoSegmentsDesc).size() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJILLIZJL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.ttStoryUploadModel != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (TextUtils.equals(videoPublishEditModel.mShootWay, "story") && LJJLIIIIJ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJJIZ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.creationMode == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        return videoPublishEditModel.creativeModel.ugcTemplateData.isUgcTemplateFromAnchor;
    }

    public static final boolean LJJLIIIJLJLI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        String str = videoPublishEditModel.mVideoSegmentsDesc;
        if (str != null && str.length() != 0) {
            Iterator<TimeSpeedModelExtension> it = CameraComponentModel.LJIIJJI(videoPublishEditModel.mVideoSegmentsDesc).iterator();
            while (it.hasNext()) {
                if (it.next().getCameraId() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJJLIIIJLLLLLLLZ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        String str = videoPublishEditModel.mVideoSegmentsDesc;
        boolean z = false;
        if (str != null && str.length() != 0) {
            Iterator<TimeSpeedModelExtension> it = CameraComponentModel.LJIIJJI(videoPublishEditModel.mVideoSegmentsDesc).iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (next.getCameraId() == 1) {
                    z = next.isUseMirrorMode();
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (0 == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.filter.FilterBean LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, X.InterfaceC82236WPg r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "repository"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = r3.mSelectedFilterId
            r2 = 0
            if (r0 == 0) goto L21
            X.WPX r1 = r4.LJJJJIZL()     // Catch: java.lang.NumberFormatException -> L21
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L21
            com.ss.android.ugc.aweme.filter.FilterBean r0 = X.TMC.LJIILIIL(r1, r0)     // Catch: java.lang.NumberFormatException -> L21
            if (r0 == 0) goto L21
            r0.resetCompareKey()     // Catch: java.lang.NumberFormatException -> L21
            goto L3e
        L21:
            java.lang.String r1 = r3.mSelectedFilterResId
            if (r1 == 0) goto L35
            X.WPX r0 = r4.LJJJJIZL()     // Catch: java.lang.NumberFormatException -> L33
            com.ss.android.ugc.aweme.filter.FilterBean r0 = X.TMC.LJIILLIIL(r0, r1)     // Catch: java.lang.NumberFormatException -> L33
            if (r0 == 0) goto L35
            r0.resetCompareKey()     // Catch: java.lang.NumberFormatException -> L33
            goto L4a
        L33:
            if (r2 != 0) goto L4b
        L35:
            int r0 = r3.mSelectedId
            if (r0 >= 0) goto L3f
            com.ss.android.ugc.aweme.filter.FilterBean r0 = new com.ss.android.ugc.aweme.filter.FilterBean
            r0.<init>()
        L3e:
            return r0
        L3f:
            X.WPX r1 = r4.LJJJJIZL()
            int r0 = r3.mSelectedId
            com.ss.android.ugc.aweme.filter.FilterBean r0 = X.TMC.LJIILJJIL(r1, r0)
            goto L3e
        L4a:
            r2 = r0
        L4b:
            r0 = r2
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H7R.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.WPg):com.ss.android.ugc.aweme.filter.FilterBean");
    }

    public static final String LJIIZILJ(VideoPublishEditModel videoPublishEditModel, String str) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (LJ(videoPublishEditModel) && videoPublishEditModel.creativeModel.followUpPublishTrackerModel.enterRecordFromFeed) {
            if (C78685UuP.LJJJZ(str)) {
                return str;
            }
            String str2 = videoPublishEditModel.creativeModel.followUpPublishTrackerModel.followUpItemIdGroups;
            if (str2 != null && str2.length() != 0) {
                return (String) ListProtector.get(s.LJLJJL(str2, new String[]{","}, 0, 6), 0);
            }
        }
        return "";
    }

    public static final boolean LJJIJ(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel model) {
        boolean z;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(model, "model");
        List<InteractStickerStruct> LJFF = C164826dS.LJFF(model, 14, EnumC164816dR.TRACK_PAGE_EDIT);
        if (LJFF == null || LJFF.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final void LJJLIIJ(Intent intent, VideoPublishEditModel model) {
        o.LJIIIZ(intent, "<this>");
        o.LJIIIZ(model, "model");
        intent.putExtra("args", (Serializable) model);
        CreativeModel creativeModel = model.creativeModel;
        o.LJIIIIZZ(creativeModel, "model.creativeModel");
        C78996UzQ.LJJIZ(intent, creativeModel);
    }
}
