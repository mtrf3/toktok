package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMobModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import defpackage.g0;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.5V5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5V5 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:111:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedHashMap LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r15) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5V5.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.LinkedHashMap");
    }

    public static boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublisherMobHelper: isHighQualityVideo -> enable_photo_to_1080p = ");
        LIZ2.append(C47261Igj.LJIJI());
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
        if (videoPublishEditModel.isPhotoMvMode && C47261Igj.LJIJI()) {
            return true;
        }
        AbstractC143185je LIZIZ = C47192Ifc.LIZIZ(videoPublishEditModel);
        if (Math.min(LIZIZ.LIZ(false), LIZIZ.LJFF(false)) < 1080) {
            return false;
        }
        return true;
    }

    public static final C145995oB LJI(VideoPublishEditModel videoPublishEditModel) {
        String str;
        C145995oB c145995oB = new C145995oB();
        LIZJ(c145995oB, videoPublishEditModel);
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.creativeFlowData.getEditorProModel() != null) {
                String str2 = "1";
                if (videoPublishEditModel.getEditorProModel().isAdvancedEdit()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c145995oB.LIZLLL("is_use_editor_pro", str);
                if (!videoPublishEditModel.getEditorProModel().isPipUsed()) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c145995oB.LIZLLL("is_use_pip", str2);
                C1292755n.LIZ.getClass();
                c145995oB.LIZLLL("all_editor_pro_used_functions", C1292755n.LIZIZ(videoPublishEditModel));
            }
            c145995oB.LIZLLL("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LIZLLL("content_type", H7R.LJIIIZ(videoPublishEditModel));
            c145995oB.LIZLLL("scenes_tag", String.valueOf(H7R.LJI(videoPublishEditModel)));
            OSZ LJJIIJ = g0.LJJIIJ(videoPublishEditModel);
            int intValue = ((Number) LJJIIJ.getFirst()).intValue();
            int intValue2 = ((Number) LJJIIJ.getSecond()).intValue();
            c145995oB.LIZ(intValue2, "pic_cnt");
            c145995oB.LIZLLL("mix_type", C78977Uz7.LJJJJJ(intValue, intValue2));
            LIZLLL(c145995oB, videoPublishEditModel);
            HC6.LIZJ(videoPublishEditModel, c145995oB);
        }
        return c145995oB;
    }

    public static final void LIZIZ(C145995oB c145995oB, VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        c145995oB.LIZLLL("source_fps", String.valueOf(videoPublishEditModel.videoFpsFloat(false)));
        c145995oB.LIZLLL("source_resolution", videoPublishEditModel.getVideoResolution());
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null && (videoList = previewInfo.getVideoList()) != null && (!videoList.isEmpty()) && (editVideoSegment = (EditVideoSegment) ListProtector.get(videoList, 0)) != null) {
            c145995oB.LIZLLL("source_file_bitrate", String.valueOf(editVideoSegment.getVideoFileInfo().getBitrate()));
            File file = new File(editVideoSegment.getVideoPath());
            if (file.isFile() && file.exists()) {
                String LLLZI = C16880lQ.LLLZI(Locale.US, "%d", Arrays.copyOf(new Object[]{Long.valueOf(file.length() / 1024)}, 1));
                o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                c145995oB.LIZLLL("source_file_size", LLLZI);
            }
        }
        LIZLLL(c145995oB, videoPublishEditModel);
        LIZJ(c145995oB, videoPublishEditModel);
    }

    public static void LIZJ(C145995oB c145995oB, Object obj) {
        VideoPublishEditModel videoPublishEditModel;
        String str;
        int i;
        if ((obj instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) obj) != null) {
            if (videoPublishEditModel.isStoryEditMode) {
                str = "story_shoot_page";
            } else {
                str = "video_shoot_page";
            }
            c145995oB.LIZLLL("shoot_page", str);
            if (videoPublishEditModel.ttStoryUploadModel != null) {
                i = 1;
            } else {
                i = 0;
            }
            c145995oB.LIZ(i, "is_story");
            TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel.ttStoryUploadModel;
            if (tTStoryUploadModel != null) {
                c145995oB.LIZ(tTStoryUploadModel.getIndex(), "clip_index");
                c145995oB.LIZ(tTStoryUploadModel.getTotalCount(), "clips_cnt");
            }
        }
    }

    public static void LIZLLL(C145995oB c145995oB, Object obj) {
        VideoPublishEditModel videoPublishEditModel;
        if ((obj instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) obj) != null) {
            if (C79004UzY.LJIJJLI(videoPublishEditModel.canvasVideoData)) {
                c145995oB.LIZ(1, "stream_edit_mode");
                c145995oB.LIZ(C41848Gbc.LIZJ(videoPublishEditModel), "stream_download_progress");
            } else {
                c145995oB.LIZ(0, "stream_edit_mode");
            }
        }
    }

    public static void LJFF(VideoPublishEditModel editModel, LinkedHashMap linkedHashMap, boolean z) {
        boolean z2;
        List<StickerItemModel> list;
        List<StickerItemModel> list2;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(editModel, "editModel");
        if (C42000Ge4.LJIILIIL(editModel)) {
            StringBuilder sb = new StringBuilder();
            boolean z3 = false;
            for (TextStickerModel textStickerModel : editModel.creativeModel.stickerModel.textStickerModels) {
                TextMobModel mobModel = textStickerModel.getMobModel();
                if (!o.LJ(linkedHashMap.get("is_editorpro_adjust_text_style"), "1")) {
                    if (o.LJ(mobModel.adjustTextStyleInEditorPro, "1")) {
                        linkedHashMap.put("is_editorpro_adjust_text_style", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_adjust_text_style", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_adjust_text_paragraph"), "1")) {
                    if (o.LJ(mobModel.adjustTextParagraph, "1")) {
                        linkedHashMap.put("is_editorpro_adjust_text_paragraph", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_adjust_text_paragraph", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_adjust_text_font"), "1")) {
                    if (o.LJ(mobModel.adjustTextFontInEditorPro, "1")) {
                        linkedHashMap.put("is_editorpro_adjust_text_font", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_adjust_text_font", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_adjust_text_color"), "1")) {
                    if (o.LJ(mobModel.adjustTextColorInEditorPro, "1")) {
                        linkedHashMap.put("is_editorpro_adjust_text_color", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_adjust_text_color", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_adjust_text_position"), "1")) {
                    if (o.LJ(mobModel.adjustTextPositionInEditorPro, "1")) {
                        linkedHashMap.put("is_editorpro_adjust_text_position", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_adjust_text_position", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_trim_text_length"), "1")) {
                    if (o.LJ(mobModel.isEditorProTrimLength, "1")) {
                        linkedHashMap.put("is_editorpro_trim_text_length", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_trim_text_length", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_text"), "1")) {
                    if (textStickerModel.getSourceType() == C5V7.EDITOR_PRO) {
                        linkedHashMap.put("is_editorpro_text", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_text", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_copy_text"), "1")) {
                    if (o.LJ(mobModel.isEditorProCopyText, "1")) {
                        linkedHashMap.put("is_editorpro_copy_text", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_copy_text", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_tts"), "1")) {
                    TTSModel ttsModel = textStickerModel.getTtsModel();
                    if (ttsModel != null && ttsModel.isEditorProTTS) {
                        linkedHashMap.put("is_editorpro_tts", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_tts", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                TTSModel ttsModel2 = textStickerModel.getTtsModel();
                if (ttsModel2 != null) {
                    str = ttsModel2.editorProTTSID;
                } else {
                    str = null;
                }
                if (C78685UuP.LJJJZ(str)) {
                    if (sb.length() == 0) {
                        TTSModel ttsModel3 = textStickerModel.getTtsModel();
                        if (ttsModel3 != null) {
                            str3 = ttsModel3.editorProTTSID;
                        } else {
                            str3 = null;
                        }
                        sb.append(str3);
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(',');
                        TTSModel ttsModel4 = textStickerModel.getTtsModel();
                        if (ttsModel4 == null || (str2 = ttsModel4.editorProTTSID) == null) {
                            str2 = "";
                        }
                        LIZ2.append(str2);
                        sb.append(X1D.LIZIZ(LIZ2));
                    }
                }
                CaptionModel captionModel = textStickerModel.getCaptionModel();
                if (captionModel != null && captionModel.isEditorProCaption) {
                    z3 = true;
                }
            }
            if (editModel.creativeModel.stickerModel.textStickerModels.isEmpty() && z) {
                linkedHashMap.put("is_editorpro_adjust_text_style", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("is_editorpro_adjust_text_paragraph", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("is_editorpro_adjust_text_font", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("is_editorpro_adjust_text_color", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("is_editorpro_adjust_text_position", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("is_editorpro_trim_text_length", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("is_editorpro_text", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("is_editorpro_copy_text", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("is_editorpro_tts", CardStruct.IStatusCode.DEFAULT);
            }
            if (z3) {
                linkedHashMap.put("is_editorpro_captions", "1");
            } else if (z) {
                linkedHashMap.put("is_editorpro_captions", CardStruct.IStatusCode.DEFAULT);
            }
            if (sb.length() > 0 || z) {
                linkedHashMap.put("editorpro_tts_tone_id", sb.toString());
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        InfoStickerModel infoStickerModel = editModel.infoStickerModel;
        if (infoStickerModel != null && (list2 = infoStickerModel.stickers) != null) {
            z2 = false;
            for (StickerItemModel stickerItemModel : list2) {
                if (!o.LJ(linkedHashMap.get("is_editorpro_adjust_text_style"), "1")) {
                    if (o.LJ(stickerItemModel.adjustTextStyleInEditorPro, "1")) {
                        linkedHashMap.put("is_editorpro_adjust_text_style", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_adjust_text_style", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_adjust_text_paragraph"), "1")) {
                    if (o.LJ(stickerItemModel.adjustTextParagraph, "1")) {
                        linkedHashMap.put("is_editorpro_adjust_text_paragraph", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_adjust_text_paragraph", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_adjust_text_font"), "1")) {
                    if (o.LJ(stickerItemModel.adjustTextFontInEditorPro, "1")) {
                        linkedHashMap.put("is_editorpro_adjust_text_font", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_adjust_text_font", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_adjust_text_color"), "1")) {
                    if (o.LJ(stickerItemModel.adjustTextColorInEditorPro, "1")) {
                        linkedHashMap.put("is_editorpro_adjust_text_color", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_adjust_text_color", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_adjust_text_position"), "1")) {
                    if (o.LJ(stickerItemModel.adjustTextPositionInEditorPro, "1")) {
                        linkedHashMap.put("is_editorpro_adjust_text_position", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_adjust_text_position", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_trim_text_length"), "1")) {
                    if (o.LJ(stickerItemModel.isEditorProTrimLength, "1")) {
                        linkedHashMap.put("is_editorpro_trim_text_length", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_trim_text_length", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_text"), "1")) {
                    if (o.LJ(stickerItemModel.isEditorProText, "1")) {
                        linkedHashMap.put("is_editorpro_text", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_text", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_copy_text"), "1")) {
                    if (o.LJ(stickerItemModel.isEditorProCopyText, "1")) {
                        linkedHashMap.put("is_editorpro_copy_text", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_copy_text", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (!o.LJ(linkedHashMap.get("is_editorpro_tts"), "1")) {
                    if (o.LJ(stickerItemModel.isEditorProTTS, "1")) {
                        linkedHashMap.put("is_editorpro_tts", "1");
                    } else if (z) {
                        linkedHashMap.put("is_editorpro_tts", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                if (C78685UuP.LJJJZ(stickerItemModel.editorProTTSID)) {
                    if (sb2.length() == 0) {
                        sb2.append(stickerItemModel.editorProTTSID);
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(',');
                        LIZ3.append(stickerItemModel.editorProTTSID);
                        sb2.append(X1D.LIZIZ(LIZ3));
                    }
                }
                if (o.LJ(stickerItemModel.isEditorProCaption, "1")) {
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        InfoStickerModel infoStickerModel2 = editModel.infoStickerModel;
        if ((infoStickerModel2 == null || (list = infoStickerModel2.stickers) == null || list.isEmpty()) && z) {
            linkedHashMap.put("is_editorpro_adjust_text_style", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("is_editorpro_adjust_text_paragraph", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("is_editorpro_adjust_text_font", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("is_editorpro_adjust_text_color", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("is_editorpro_adjust_text_position", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("is_editorpro_trim_text_length", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("is_editorpro_text", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("is_editorpro_copy_text", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("is_editorpro_tts", CardStruct.IStatusCode.DEFAULT);
        }
        if (z2) {
            linkedHashMap.put("is_editorpro_captions", "1");
        } else if (z) {
            linkedHashMap.put("is_editorpro_captions", CardStruct.IStatusCode.DEFAULT);
        }
        if (sb2.length() > 0 || z) {
            linkedHashMap.put("editorpro_tts_tone_id", sb2.toString());
        }
    }
}
