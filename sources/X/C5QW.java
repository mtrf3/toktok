package X;

import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS57S1200000_2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.5QW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5QW {
    public static long LIZ = 0;
    public static long LIZIZ = 0;
    public static long LIZJ = 0;
    public static boolean LIZLLL = false;
    public static boolean LJ = false;
    public static int LJFF = 0;
    public static volatile long LJI = -1;
    public static volatile long LJII = -1;
    public static volatile long LJIIIIZZ = -1;
    public static volatile long LJIIIZ = -1;
    public static volatile long LJIIJ = -1;
    public static volatile long LJIIJJI = -1;
    public static final Object LJIIL = new Object();
    public static boolean LJIILIIL = true;

    public static final void LJJJIL() {
        LJI = -1L;
        LJII = -1L;
        LJIIIIZZ = -1L;
        LJIIJ = -1L;
        LJIIJJI = -1L;
        LJIIIZ = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0071, code lost:
    
        if (kotlin.jvm.internal.o.LJ(X.H7R.LJIIIIZZ(r7), "upload") != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C145995oB LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            java.lang.String r0 = "publishEditModel"
            X.5oB r6 = X.C279017q.LIZ(r7, r0)
            java.lang.String r1 = r7.mShootWay
            java.lang.String r0 = "shoot_way"
            r6.LJI(r0, r1)
            java.lang.String r1 = X.H7R.LJIIIIZZ(r7)
            java.lang.String r0 = "content_source"
            r6.LJI(r0, r1)
            java.lang.String r1 = X.H7R.LJIIIZ(r7)
            java.lang.String r0 = "content_type"
            r6.LJI(r0, r1)
            java.lang.String r1 = r7.getCreationId()
            java.lang.String r0 = "creation_id"
            r6.LJI(r0, r1)
            java.lang.String r1 = r7.getStickers()
            if (r1 != 0) goto L30
            java.lang.String r1 = ""
        L30:
            java.lang.String r0 = "prop_list"
            r6.LJI(r0, r1)
            boolean r1 = r7.containBackgroundVideo
            java.lang.String r0 = "is_gsv_prop"
            r6.LIZ(r1, r0)
            java.lang.String r1 = r7.enterFrom
            java.lang.String r0 = "enter_from"
            r6.LJI(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel r0 = r7.getEditorProModel()
            boolean r1 = r0.getFromPhotoCanvas()
            java.lang.String r0 = "is_from_text"
            r6.LIZ(r1, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel r0 = r7.getEditorProModel()
            boolean r1 = r0.getFromPhotoCanvas()
            java.lang.String r0 = "is_from_photo_canvas"
            r6.LIZ(r1, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel r0 = r7.getEditorProModel()
            boolean r0 = r0.getFromPhotoCanvas()
            if (r0 == 0) goto Lb6
            java.lang.String r0 = X.H7R.LJIIIIZZ(r7)
            java.lang.String r1 = "upload"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto Lb6
        L73:
            java.lang.String r0 = "shoot_tab_name"
            r6.LJI(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel r0 = r7.getEditorProModel()
            java.lang.String r0 = r0.getEditorProAnchorType()
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto Lab
            X.54j[] r5 = X.EnumC1289754j.values()
            int r4 = r5.length
            r3 = 0
        L8c:
            if (r3 >= r4) goto Laf
            r2 = r5[r3]
            java.lang.String r1 = r2.getType()
            com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel r0 = r7.getEditorProModel()
            java.lang.String r0 = r0.getEditorProAnchorType()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lac
            int r1 = r2.getValue()
        La6:
            java.lang.String r0 = "ep_anchor_type"
            r6.LIZ(r1, r0)
        Lab:
            return r6
        Lac:
            int r3 = r3 + 1
            goto L8c
        Laf:
            X.54j r0 = X.EnumC1289754j.GENERAL
            int r1 = r0.getValue()
            goto La6
        Lb6:
            java.lang.String r1 = X.H7R.LJJ(r7)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5QW.LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):X.5oB");
    }

    public static final String LJIIJ(EditorProContext editorContext) {
        EnumC123864ta LJJIJIL;
        o.LJIIIZ(editorContext, "editorContext");
        NLETrack selectedTrack = editorContext.getSelectedTrack();
        if (selectedTrack != null && (LJJIJIL = C79057V0z.LJJIJIL(selectedTrack)) != null) {
            int i = C5PK.LIZ[LJJIJIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "effect";
                        }
                    } else {
                        return "text";
                    }
                } else {
                    return "sound";
                }
            } else {
                if (selectedTrack.LJIIJ()) {
                    return "video";
                }
                return "pip";
            }
        }
        return "";
    }

    public static final void LJJJJ(String str) {
        if (!((Boolean) C134605Qa.LIZ.getValue()).booleanValue() || LIZ <= 0) {
            return;
        }
        if (o.LJ(str, "step1_perf_editor_pro_click_to_on_create_view")) {
            LJIIJ = System.currentTimeMillis() - LIZ;
        } else {
            if (!o.LJ(str, "step2_perf_editor_pro_on_create_view")) {
                return;
            }
            LJIIJJI = (System.currentTimeMillis() - LIZ) - LJIIJ;
        }
    }

    public static final void LJJJJI(JSONObject jSONObject) {
        File file = new File(C60903NvH.LJ.getExternalCacheDir(), "tools_perf.log");
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        o.LJIIIIZZ(format, "SimpleDateFormat(\"yyyy-M…tem.currentTimeMillis()))");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(format);
        LIZ2.append("  KoopaPerformanceLog ");
        LIZ2.append(jSONObject);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                C3C5.m7constructorimpl(Boolean.valueOf(file.createNewFile()));
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
            try {
                bufferedWriter.write(LIZIZ2);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                AnonymousClass636.LJFF(bufferedWriter, null);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } finally {
            }
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }

    public static final void LIZJ(NLETrackSlot nLETrackSlot, String str) {
        boolean z;
        long parseLong;
        String enterVideoSpeedTimeString = nLETrackSlot.getExtra("select_slot_time");
        if (enterVideoSpeedTimeString == null || enterVideoSpeedTimeString.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        long j = 0;
        if (z) {
            parseLong = 0;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            o.LJIIIIZZ(enterVideoSpeedTimeString, "enterVideoSpeedTimeString");
            parseLong = currentTimeMillis - CastLongProtector.parseLong(enterVideoSpeedTimeString);
        }
        String lastDurationString = nLETrackSlot.getExtra(str);
        if (lastDurationString != null && lastDurationString.length() != 0) {
            o.LJIIIIZZ(lastDurationString, "lastDurationString");
            j = CastLongProtector.parseLong(lastDurationString);
        }
        nLETrackSlot.setExtra(str, String.valueOf(j + parseLong));
    }

    public static final void LIZLLL(VideoPublishEditModel editModel, C145995oB builder) {
        String str;
        o.LJIIIZ(builder, "builder");
        o.LJIIIZ(editModel, "editModel");
        if (!editModel.getEditorProModel().isAdvancedEditDraft() || (str = editModel.nleData) == null || str.length() == 0) {
            return;
        }
        C60903NvH.LJIIJJI().LJIJ();
        C5K0.LIZIZ();
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJI(editModel.nleData);
        NLEModel LJ2 = nLEEditor.LJ();
        if (LJ2 == null) {
            return;
        }
        builder.LIZLLL("edit_video_duration", String.valueOf(LJIIIIZZ(LJ2, "edit_video_duration_total")));
        builder.LIZIZ(LJIIIIZZ(LJ2, "edit_video_duration_total"), "edit_video_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "adjust_video_speed_duration_total"), "adjust_video_speed_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "add_video_material_duration_total"), "add_video_material_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "adjust_video_volume_duration_total"), "adjust_video_volume_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "start_over_duration_total"), "start_over_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "edit_music_duration_total"), "edit_music_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "add_music_material_duration_total"), "add_music_material_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "add_sound_effect_duration_total"), "add_sound_effect_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "adjust_music_volume_duration_total"), "adjust_music_volume_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "edit_text_duration_total"), "edit_text_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "adjust_text_content_duration_total"), "adjust_text_content_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "edit_tts_duration_total"), "edit_tts_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "edit_captions_duration_total"), "edit_captions_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "add_captions_duration_total"), "add_captions_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "edit_effect_duration_total"), "edit_effect_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "add_effect_duration_total"), "add_effect_duration");
        builder.LIZIZ(LJIIIIZZ(LJ2, "editor_pro_use_duration_total"), "editor_pro_use_duration");
    }

    public static final C145995oB LJFF(VideoPublishEditModel publishEditModel, EditorProContext editorContext) {
        int value;
        o.LJIIIZ(publishEditModel, "publishEditModel");
        o.LJIIIZ(editorContext, "editorContext");
        int i = 0;
        OSZ LIZJ2 = C124934vJ.LIZJ(C79057V0z.LJJI(editorContext), false);
        int intValue = ((Number) LIZJ2.getFirst()).intValue();
        int intValue2 = ((Number) LIZJ2.getSecond()).intValue();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", publishEditModel.enterFrom);
        c145995oB.LJI("shoot_way", publishEditModel.mShootWay);
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(publishEditModel));
        c145995oB.LJI("content_type", H7R.LJIIIZ(publishEditModel));
        c145995oB.LIZIZ(editorContext.getPlayer().s5(), "creation_duration");
        c145995oB.LJI("creation_id", publishEditModel.getCreationId());
        String stickers = publishEditModel.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        c145995oB.LJI("prop_list", stickers);
        c145995oB.LIZ(publishEditModel.containBackgroundVideo ? 1 : 0, "is_gsv_prop");
        c145995oB.LJI("music_selected_from", publishEditModel.getMusicOriginWithCheck());
        int i2 = 1;
        if (intValue + intValue2 <= 1) {
            i2 = 0;
        }
        c145995oB.LIZ(i2, "is_multi_content");
        c145995oB.LIZ(intValue, "video_cnt");
        c145995oB.LIZ(intValue2, "pic_cnt");
        c145995oB.LIZ(publishEditModel.getEditorProModel().getFromPhotoCanvas() ? 1 : 0, "is_from_photo_canvas");
        if (publishEditModel.mDraftToEditFrom == 0) {
            c145995oB.LIZLLL("draft_way", "general_draft_list");
        }
        if (C78685UuP.LJJJZ(publishEditModel.getEditorProModel().getEditorProAnchorType())) {
            EnumC1289754j[] values = EnumC1289754j.values();
            int length = values.length;
            while (true) {
                if (i < length) {
                    EnumC1289754j enumC1289754j = values[i];
                    if (o.LJ(enumC1289754j.getType(), publishEditModel.getEditorProModel().getEditorProAnchorType())) {
                        value = enumC1289754j.getValue();
                        break;
                    }
                    i++;
                } else {
                    value = EnumC1289754j.GENERAL.getValue();
                    break;
                }
            }
            c145995oB.LIZ(value, "ep_anchor_type");
        }
        return c145995oB;
    }

    public static final C145995oB LJI(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", bundle.getString("shoot_way"));
        c145995oB.LJI("creation_id", bundle.getString("creation_id"));
        c145995oB.LJI("content_source", bundle.getString("content_source"));
        c145995oB.LJI("content_type", bundle.getString("content_type"));
        c145995oB.LJI("creation_duration", str);
        c145995oB.LJI("enter_from", bundle.getString("enter_from"));
        c145995oB.LJI("music_id", bundle.getString("music_id"));
        c145995oB.LIZ(1, "is_editor_pro");
        return c145995oB;
    }

    public static final long LJIIIIZZ(NLEModel nLEModel, String str) {
        String durationString = nLEModel.getExtra(str);
        if (durationString == null || durationString.length() == 0) {
            return 0L;
        }
        o.LJIIIIZZ(durationString, "durationString");
        return CastLongProtector.parseLong(durationString);
    }

    public static final long LJIIIZ(NLETrackSlot slot, String str) {
        o.LJIIIZ(slot, "slot");
        String durationString = slot.getExtra(str);
        if (durationString == null || durationString.length() == 0) {
            return 0L;
        }
        o.LJIIIIZZ(durationString, "durationString");
        return CastLongProtector.parseLong(durationString);
    }

    public static final void LJJIFFI(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LJI("track_type", LJIIJ(editorContext));
        FMX.LJIIL("delete_material_invalid_popup", LJFF2.LIZ);
    }

    public static final void LJJIJL(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LIZIZ(editorContext.getPlayer().s5(), "duration");
        FMX.LJIIL("save_editor_pro_long_video_toast", LJFF2.LIZ);
    }

    public static final void LIZ(NLEModel nLEModel, String str, String str2) {
        boolean z;
        long parseLong;
        String enterVideoSpeedTimeString = nLEModel.getExtra(str);
        if (enterVideoSpeedTimeString == null || enterVideoSpeedTimeString.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        long j = 0;
        if (z) {
            parseLong = 0;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            o.LJIIIIZZ(enterVideoSpeedTimeString, "enterVideoSpeedTimeString");
            parseLong = currentTimeMillis - CastLongProtector.parseLong(enterVideoSpeedTimeString);
        }
        String lastDurationString = nLEModel.getExtra(str2);
        if (lastDurationString != null && lastDurationString.length() != 0) {
            o.LJIIIIZZ(lastDurationString, "lastDurationString");
            j = CastLongProtector.parseLong(lastDurationString);
        }
        nLEModel.setExtra(str2, String.valueOf(j + parseLong));
    }

    public static final void LIZIZ(long j, NLEModel nLEModel, String str) {
        long j2;
        String lastDurationString = nLEModel.getExtra(str);
        if (lastDurationString == null || lastDurationString.length() == 0) {
            j2 = 0;
        } else {
            o.LJIIIIZZ(lastDurationString, "lastDurationString");
            j2 = CastLongProtector.parseLong(lastDurationString);
        }
        nLEModel.setExtra(str, String.valueOf(j + j2));
    }

    public static final C145995oB LJ(long j, NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        int i = 0;
        OSZ LIZJ2 = C124934vJ.LIZJ(nLEModel, false);
        int intValue = ((Number) LIZJ2.getFirst()).intValue();
        int intValue2 = ((Number) LIZJ2.getSecond()).intValue();
        C145995oB LJII2 = LJII(videoPublishEditModel);
        LJII2.LIZ(C44228HXk.LIZJ(), "beautify_used");
        LJII2.LJI("effect_list", videoPublishEditModel.getEditEffectListStr());
        LJII2.LJI("enter_from", videoPublishEditModel.enterFrom);
        LJII2.LJI("enter_method", "click");
        LJII2.LJI("info_sticker_list", videoPublishEditModel.getInfoStickerList());
        LJII2.LJI("infosticker_from", videoPublishEditModel.getInfoStickerFrom());
        LJII2.LIZ(videoPublishEditModel.mDuetFromDuetButton, "is_from_duet_button");
        LJII2.LJI("mix_type", H8F.LJIIJ(videoPublishEditModel));
        LJII2.LJI("music_id", videoPublishEditModel.getMusicId());
        LJII2.LJI("music_selected_from", videoPublishEditModel.getMusicOriginWithCheck());
        LJII2.LIZ(videoPublishEditModel.mOriginalStickerCount, "original_prop_count");
        LJII2.LJI("original_resolution", C44384HbQ.LJJLIIIJLJLI(videoPublishEditModel));
        String str3 = videoPublishEditModel.mDesignerIdList;
        if (str3 == null) {
            str3 = "";
        }
        LJII2.LJI("prop_author_id", str3);
        LJII2.LJI("prop_list", videoPublishEditModel.mStickerID);
        LJII2.LIZ(C60903NvH.LJIIJJI().getPublishService().LJIIL(), "publish_cnt");
        LJII2.LJI("shoot_enter_method", videoPublishEditModel.shootEnterMethod);
        LJII2.LJI("shoot_entrance", C147065pu.LIZ(videoPublishEditModel, "shoot_entrance"));
        LJII2.LJI("shoot_filter_id_list", videoPublishEditModel.mRecordFilterIds);
        if (C44739Hh9.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJII2.LJI("is_hardcode", str);
        LJII2.LIZ(intValue, "video_cnt");
        LJII2.LIZ(intValue2, "pic_cnt");
        LJII2.LIZIZ(j, "creation_duration");
        if (intValue + intValue2 > 1) {
            i = 1;
        }
        LJII2.LIZ(i, "is_multi_content");
        if (o.LJ(videoPublishEditModel.enterFrom, "super_entrance")) {
            LJII2.LIZ(1, "is_special_icon");
        }
        StickerInfo stickerInfo = videoPublishEditModel.stickerInfo;
        String str4 = null;
        if (stickerInfo != null && stickerInfo.hasImprPosition()) {
            LJII2.LIZLLL("prop_impr_position", stickerInfo.getImprPosition());
        }
        StickerInfo stickerInfo2 = videoPublishEditModel.stickerInfo;
        if (stickerInfo2 != null && stickerInfo2.hasTabOrder()) {
            LJII2.LIZLLL("prop_tab_order", stickerInfo2.getTabOrder());
        }
        StickerInfo stickerInfo3 = videoPublishEditModel.stickerInfo;
        if (stickerInfo3 != null) {
            str2 = stickerInfo3.getRecId();
        } else {
            str2 = null;
        }
        if (C78685UuP.LJJJZ(str2)) {
            StickerInfo stickerInfo4 = videoPublishEditModel.stickerInfo;
            if (stickerInfo4 != null) {
                str4 = stickerInfo4.getRecId();
            }
            LJII2.LIZLLL("prop_rec_id", str4);
        }
        return LJII2;
    }

    public static final void LJIILL(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, boolean z) {
        String str;
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        if (z) {
            str = "play";
        } else {
            str = "pause";
        }
        LJFF2.LJI("to_status", str);
        FMX.LJIIL("click_edit_play", LJFF2.LIZ);
    }

    public static final void LJIILLIIL(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str) {
        String str2;
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LJI("enter_from", videoPublishEditModel.enterFrom);
        NLETrack LJIJI = C32151Nz.LJIJI(editorContext);
        if (LJIJI == null || (str2 = LJIJI.getExtra("slot_extra_music_id")) == null) {
            str2 = "";
        }
        LJFF2.LJI("music_id", str2);
        LJFF2.LJI("click_function", str);
        LJFF2.LJI("is_editor_pro", "1");
        FMX.LJIIL("audio_editing_panel_click", LJFF2.LIZ);
    }

    public static final void LJIJ(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str) {
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LJI("enter_method", str);
        FMX.LJIIL("click_sound_tab", LJFF2.LIZ);
    }

    public static final void LJIJJ(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str) {
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LJI("enter_method", str);
        FMX.LJIIL("click_text_tab", LJFF2.LIZ);
    }

    public static final void LJIL(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, boolean z) {
        String str;
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        if (z) {
            str = "undo";
        } else {
            str = "redo";
        }
        LJFF2.LJI("type", str);
        FMX.LJIIL("click_edit_recall", LJFF2.LIZ);
    }

    public static final void LJJI(C5PL cropMode, VideoPublishEditModel videoPublishEditModel, EditorProContext editorProContext) {
        String str;
        o.LJIIIZ(cropMode, "cropMode");
        int i = C5PK.LIZJ[cropMode.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            str = "free";
                        } else {
                            str = "1:1";
                        }
                    } else {
                        str = "3:4";
                    }
                } else {
                    str = "4:3";
                }
            } else {
                str = "16:9";
            }
        } else {
            str = "9:16";
        }
        C43045Guv.LIZIZ(new AqS57S1200000_2(videoPublishEditModel, editorProContext, str, 5));
    }

    public static final void LJJIJIIJIL(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, List list) {
        NLESegment LJI2;
        String str;
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LIZLLL("music_id", videoPublishEditModel.getMusicId());
        NLEModel LJJI = C79057V0z.LJJI(editorContext);
        if (!C124574uj.LJIIIIZZ(LJJI).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            VecNLETrackSPtr tracks = LJJI.getTracks();
            ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                NLETrack nLETrack = next;
                if (nLETrack.getEnable() && C124574uj.LJJJIL(nLETrack)) {
                    LIZ2.add(next);
                }
            }
            Iterator it2 = LIZ2.iterator();
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    if (next2 != null && (LJI2 = next2.LJI()) != null && LJI2.hasExtra("nleExtraEffectKey")) {
                        NLESegment LJI3 = next2.LJI();
                        if (LJI3 == null || (str = LJI3.getExtra("nleExtraEffectKey")) == null) {
                            str = "";
                        }
                        arrayList.add(str);
                    }
                }
            }
            LJFF2.LIZLLL("effect_id", C124934vJ.LIZ(arrayList));
        }
        if (!((ArrayList) C124574uj.LJJ(LJJI)).isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = ((ArrayList) C124574uj.LJJ(LJJI)).iterator();
            while (it4.hasNext()) {
                Iterator<NLETrackSlot> it5 = ((NLETrack) it4.next()).LJIILL().iterator();
                while (it5.hasNext()) {
                    NLETrackSlot next3 = it5.next();
                    if (next3 != null && next3.hasExtra("slot_extra_music_id")) {
                        String extra = next3.getExtra("slot_extra_music_id");
                        if (extra == null) {
                            extra = "";
                        }
                        arrayList2.add(extra);
                    }
                }
            }
            LJFF2.LIZLLL("sound_effect_id", C124934vJ.LIZ(arrayList2));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<NLETrackSlot> it6 = LJJI.getMainTrack().LJIILLIIL().iterator();
        while (it6.hasNext()) {
            NLETrackSlot slot = it6.next();
            o.LJIIIIZZ(slot, "slot");
            for (String str2 : C125204vk.LJ(slot)) {
                if (!ujb.o.LJJJJJL(str2)) {
                    arrayList3.add(str2);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            LJFF2.LIZLLL("magic_id", C124934vJ.LIZ(arrayList3));
        }
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(list, 10));
        Iterator it7 = ((ArrayList) list).iterator();
        while (it7.hasNext()) {
            String rootType = (String) it7.next();
            o.LJIIIZ(rootType, "rootType");
            switch (rootType.hashCode()) {
                case -934571088:
                    if (rootType.equals("bottom_item_root_sound_sync")) {
                        rootType = "sound_sync";
                        break;
                    } else {
                        break;
                    }
                case -459287747:
                    if (rootType.equals("bottom_item_root_effects")) {
                        rootType = "effect";
                        break;
                    } else {
                        break;
                    }
                case -149662040:
                    if (rootType.equals("bottom_item_root_magic")) {
                        rootType = "magic";
                        break;
                    } else {
                        break;
                    }
                case -143690230:
                    if (rootType.equals("bottom_item_root_sound")) {
                        rootType = "sound";
                        break;
                    } else {
                        break;
                    }
                case 283352715:
                    if (rootType.equals("bottom_item_root_overlay")) {
                        rootType = "overlay";
                        break;
                    } else {
                        break;
                    }
                case 2073146799:
                    if (rootType.equals("bottom_item_root_edit")) {
                        rootType = "edit";
                        break;
                    } else {
                        break;
                    }
                case 2073595090:
                    if (rootType.equals("bottom_item_root_text")) {
                        rootType = "text";
                        break;
                    } else {
                        break;
                    }
            }
            arrayList4.add(rootType);
        }
        LJFF2.LJI("tab_name", C124934vJ.LIZ(arrayList4));
        FMX.LJIIL("editorpro_panel_show", LJFF2.LIZ);
    }

    public static final void LJJIJLIJ(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str) {
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LJI("enter_method", str);
        FMX.LJIIL("sound_panel_show", LJFF2.LIZ);
    }

    public static final void LJJIL(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str) {
        o.LJIIIZ(editorContext, "editorContext");
        if (videoPublishEditModel == null) {
            return;
        }
        C43045Guv.LIZIZ(new AqS57S1200000_2(videoPublishEditModel, editorContext, str, 6));
    }

    public static final void LJJIZ(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str) {
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LJI("enter_method", str);
        FMX.LJIIL("text_panel_show", LJFF2.LIZ);
    }

    public static final void LJJJI(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, boolean z) {
        String str;
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        if (z) {
            str = "zoom_in";
        } else {
            str = "zoom_out";
        }
        LJFF2.LJI("action_type", str);
        FMX.LJIIL("zoom_time_line", LJFF2.LIZ);
    }

    public static final void LJIIL(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String fromLocation, String str) {
        o.LJIIIZ(editorContext, "editorContext");
        o.LJIIIZ(fromLocation, "fromLocation");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LIZ(1, "is_editor_pro");
        LJFF2.LJI("from_location", fromLocation);
        LJFF2.LJI("from_group_id", C78983UzD.LJJIJL());
        LJFF2.LJI("type", str);
        FMX.LJIIL("change_music", LJFF2.LIZ);
    }

    public static final void LJIILJJIL(VideoPublishEditModel videoPublishEditModel, String str, boolean z, boolean z2) {
        String str2;
        C145995oB LJII2 = LJII(videoPublishEditModel);
        LJII2.LJI("panel_type", str);
        if (z) {
            str2 = "click_x";
        } else {
            str2 = "other";
        }
        LJII2.LJI("action_type", str2);
        LJII2.LIZ(z2 ? 1 : 0, "is_editor_pro");
        LJII2.LIZ(1, "is_multi_track");
        FMX.LJIIL("click_close_panel", LJII2.LIZ);
    }

    public static final void LJIIZILJ(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str, boolean z) {
        String str2;
        String str3;
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        if (z) {
            str2 = "music_id";
        } else {
            str2 = "sound_effect_id";
        }
        if (str == null) {
            str = "";
        }
        LJFF2.LJI(str2, str);
        if (z) {
            str3 = "common_sound";
        } else {
            str3 = "sound_effect";
        }
        LJFF2.LJI("sound_type", str3);
        FMX.LJIIL("click_sound_delete", LJFF2.LIZ);
    }

    public static final void LJIJI(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str, boolean z) {
        String str2;
        String str3;
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        if (z) {
            str2 = "music_id";
        } else {
            str2 = "sound_effect_id";
        }
        if (str == null) {
            str = "";
        }
        LJFF2.LJI(str2, str);
        if (z) {
            str3 = "common_sound";
        } else {
            str3 = "sound_effect";
        }
        LJFF2.LJI("sound_type", str3);
        FMX.LJIIL("click_sound_volume_tab", LJFF2.LIZ);
    }

    public static final void LJJ(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str, boolean z) {
        String str2;
        String str3;
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        if (z) {
            str2 = "music_id";
        } else {
            str2 = "sound_effect_id";
        }
        if (str == null) {
            str = "";
        }
        LJFF2.LJI(str2, str);
        if (z) {
            str3 = "common_sound";
        } else {
            str3 = "sound_effect";
        }
        LJFF2.LJI("sound_type", str3);
        LJFF2.LJI("music_edited_from", "editor_pro");
        LJFF2.LIZ(1, "is_editor_pro");
        FMX.LJIIL("click_editing_music_progress_bar", LJFF2.LIZ);
    }

    public static final void LJJII(VideoPublishEditModel publishEditModel, EditorProContext editorContext, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(publishEditModel, "publishEditModel");
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(publishEditModel, editorContext);
        LJFF2.LJI("enter_from", publishEditModel.enterFrom);
        NLETrack LJIJI = C32151Nz.LJIJI(editorContext);
        if (LJIJI == null || (str = LJIJI.getExtra("slot_extra_music_id")) == null) {
            str = "";
        }
        LJFF2.LJI("music_id", str);
        LJFF2.LJI("is_editor_pro", "1");
        if (z) {
            str2 = "settings";
        } else {
            str2 = "inapp";
        }
        LJFF2.LJI("grant_type", str2);
        if (z2) {
            str3 = "success";
        } else {
            str3 = "fail";
        }
        LJFF2.LJI("click_result", str3);
        FMX.LJIIL("dub_access_granted", LJFF2.LIZ);
    }

    public static final void LJJIII(long j, long j2, VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext) {
        String str;
        String valueOf;
        o.LJIIIZ(editorContext, "editorContext");
        NLETrackSlot selectedTrackSlot = editorContext.getSelectedTrackSlot();
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LJI("track_type", LJIIJ(editorContext));
        if (C79057V0z.LJJI(editorContext).getMainTrack().LJIILL().size() > 1) {
            str = "multi_single";
        } else {
            str = "single";
        }
        LJFF2.LJI("trim_type", str);
        if (C124574uj.LJJJJL(editorContext)) {
            valueOf = "pip";
        } else {
            valueOf = String.valueOf(C79057V0z.LJJI(editorContext).getMainTrack().LJIILJJIL(selectedTrackSlot));
        }
        LJFF2.LJI("order", valueOf);
        LJFF2.LIZIZ(j, "from_length");
        LJFF2.LIZIZ(j2, "to_length");
        FMX.LJIIL("edit_video_length", LJFF2.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJZLJL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r62, java.lang.String r63, boolean r64, com.bytedance.ies.nle.editor_jni.NLEModel r65) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5QW.LJJIIJZLJL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, boolean, com.bytedance.ies.nle.editor_jni.NLEModel):void");
    }

    public static final void LJJIIZ(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str, boolean z) {
        String str2;
        String str3;
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        if (z) {
            str2 = "music_id";
        } else {
            str2 = "sound_effect_id";
        }
        LJFF2.LJI(str2, str);
        if (z) {
            str3 = "common_sound";
        } else {
            str3 = "sound_effect";
        }
        LJFF2.LJI("sound_type", str3);
        FMX.LJIIL("long_press_sound", LJFF2.LIZ);
    }

    public static final void LJIIJJI(String str, String str2, String str3, VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LJI("from_location", str);
        LJFF2.LJI("track_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        LJFF2.LJI("music_id", str3);
        FMX.LJIIL("back_to_editor_pro", LJFF2.LIZ);
    }

    public static final void LJJIJ(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String str, String str2, boolean z) {
        String str3;
        String str4;
        o.LJIIIZ(editorContext, "editorContext");
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        if (z) {
            str3 = "music_id";
        } else {
            str3 = "sound_effect_id";
        }
        if (str2 == null) {
            str2 = "";
        }
        LJFF2.LJI(str3, str2);
        if (z) {
            str4 = "common_sound";
        } else {
            str4 = "sound_effect";
        }
        LJFF2.LJI("sound_type", str4);
        LJFF2.LJI("track_type", "sound");
        LJFF2.LJI("action_type", str);
        FMX.LJIIL("move_sound", LJFF2.LIZ);
    }

    public static final void LJJIJIIJI(final VideoPublishEditModel publishEditModel, final boolean z, final boolean z2, final String str, final boolean z3) {
        o.LJIIIZ(publishEditModel, "publishEditModel");
        if (LJII > 0 && LJI > 0 && LJIIIIZZ > 0 && LJIIIZ > 0) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        C10K.LIZJ(new Callable() { // from class: X.5QX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2;
                EnumC127024yg enumC127024yg;
                List<StickerItemModel> list;
                Object obj = C5QW.LJIIL;
                boolean z4 = z;
                long j = currentTimeMillis;
                boolean z5 = z3;
                VideoPublishEditModel videoPublishEditModel = publishEditModel;
                boolean z6 = z2;
                String str3 = str;
                synchronized (obj) {
                    if (z4) {
                        C5QW.LJII = j - C5QW.LIZIZ;
                        C5QW.LJI = j - C5QW.LIZ;
                    } else if (!z5) {
                        C5QW.LJIIIIZZ = j - C5QW.LIZ;
                    } else {
                        C5QW.LJIIIZ = j - C5QW.LIZ;
                    }
                    if (C5QW.LJII > 0 && C5QW.LJI > 0 && C5QW.LJIIIIZZ > 0 && C5QW.LJIIIZ > 0) {
                        C145995oB LJII2 = C5QW.LJII(videoPublishEditModel);
                        LJII2.LIZIZ(C5QW.LJII, "first_frame_duration_ve");
                        LJII2.LIZIZ(C5QW.LJI, "first_frame_duration");
                        LJII2.LIZIZ(C5QW.LJIIIZ, "first_draw_duration");
                        LJII2.LIZIZ(C5QW.LJIIIIZZ, "first_frame_duration_ui");
                        if (z6) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        LJII2.LJI("is_from_text", str2);
                        int i = 0;
                        if (str3 == null || str3.length() == 0) {
                            enumC127024yg = EnumC127024yg.EDIT_PAGE;
                        } else {
                            enumC127024yg = EnumC127024yg.EDITOR_PRO_ANCHOR;
                        }
                        LJII2.LJI("enter_editor_pro_method", enumC127024yg.getValue());
                        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
                        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                            i = list.size();
                        }
                        LJII2.LIZ(i, "text_and_captions_cnt");
                        FMX.LJIIL("tool_performance_edit_pro_first_frame", LJII2.LIZ);
                        if (((Boolean) C134605Qa.LIZ.getValue()).booleanValue()) {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("step1_perf_editor_pro_click_to_on_create_view", C5QW.LJIIJ);
                            jSONObject2.put("step2_perf_editor_pro_on_create_view", C5QW.LJIIJJI);
                            jSONObject2.put("step3_perf_editor_pro_on_create_view_to_first_frame", C5QW.LJIIIIZZ - C5QW.LJIIJJI);
                            jSONObject.put("tool_performance_edit_pro_first_frame", jSONObject2);
                            C5QW.LJJJJI(jSONObject);
                        }
                    }
                }
                return C76800UCe.LIZ;
            }
        });
    }

    public static final void LJJJ(VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, ArrayList<String> arrayList, boolean z, ArrayList<Integer> arrayList2, boolean z2) {
        String str;
        o.LJIIIZ(editorContext, "editorContext");
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            String next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                sb.append(next);
                if (i2 != arrayList.size() - 1) {
                    sb.append(",");
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<Integer> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Integer next2 = it2.next();
            int i4 = i + 1;
            if (i >= 0) {
                sb2.append(String.valueOf(next2.intValue()));
                if (i != arrayList2.size() - 1) {
                    sb2.append(",");
                }
                i = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C145995oB LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LJI("music_id", videoPublishEditModel.getMusicId());
        LJFF2.LJI("enter_from", videoPublishEditModel.enterFrom);
        LJFF2.LIZ(1, "is_editor_pro");
        LJFF2.LJI("transition_list", sb.toString());
        if (z) {
            str = "click";
        } else {
            str = "apply_to_all";
        }
        LJFF2.LJI("apply_method", str);
        LJFF2.LJI("apply_content_position", sb2.toString());
        LJFF2.LIZ(z2 ? 1 : 0, "is_split");
        FMX.LJIIL("transition_preview", LJFF2.LIZ);
    }

    public static void LJIILIIL(VideoPublishEditModel publishEditModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        List<MultiEditVideoSegmentRecordData> list;
        int size;
        Integer num;
        boolean z6;
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList<String> arrayList;
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        if ((i & 32) != 0) {
            z5 = false;
        }
        o.LJIIIZ(publishEditModel, "publishEditModel");
        if (publishEditModel.isPhotoMvMode) {
            MvCreateVideoData mvCreateVideoData = publishEditModel.mvCreateVideoData;
            if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null) {
                size = arrayList.size();
                num = Integer.valueOf(size);
            }
            num = null;
        } else {
            MultiEditVideoRecordData curMultiEditVideoRecordData = publishEditModel.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null) {
                size = list.size();
                num = Integer.valueOf(size);
            }
            num = null;
        }
        C145885o0.LIZ.getClass();
        if (C145885o0.LIZIZ(publishEditModel) && !z2 && !z3 && !z4) {
            z6 = true;
        } else {
            z6 = false;
        }
        C145995oB LJII2 = LJII(publishEditModel);
        LJII2.LIZ(H8F.LJIIL(publishEditModel), "is_multi_content");
        LJII2.LIZ(publishEditModel.getVideoLength(), "creation_duration");
        String str5 = "1";
        LJII2.LJI("is_editor_pro", "1");
        if (z6) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJII2.LJI("is_from_edit_page_bottom", str);
        LJII2.LJI("enter_dm", publishEditModel.creativeModel.initialModel.dmCameraModel.enterDM);
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJII2.LJI("is_from_text", str2);
        if (z2) {
            str3 = "text_time";
        } else if (z3) {
            str3 = "anchor";
        } else if (z4) {
            str3 = "upload_page";
        } else if (z5) {
            str3 = "video_post_page";
        } else {
            str3 = "edit_page";
        }
        LJII2.LJI("click_from", str3);
        if (!z) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        LJII2.LJI("is_warn_show", str5);
        if (num != null && num.intValue() > 1) {
            str4 = "multiple";
        } else {
            str4 = "single";
        }
        LJII2.LJI("segment_type", str4);
        LJII2.LJI("enter_type", H8F.LJIIIZ(publishEditModel));
        FMX.LJIIL("click_video_trim", LJII2.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5oB] */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public static void LJIJJLI(String str, VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext, String isBlackSlot, String trackType, boolean z, int i) {
        if ((i & 8) != 0) {
            isBlackSlot = CardStruct.IStatusCode.DEFAULT;
        }
        if ((i & 16) != 0) {
            trackType = "";
        }
        ?? r8 = z;
        if ((i & 32) != 0) {
            r8 = 0;
        }
        o.LJIIIZ(editorContext, "editorContext");
        o.LJIIIZ(isBlackSlot, "isBlackSlot");
        o.LJIIIZ(trackType, "trackType");
        String LJIIJ2 = LJIIJ(editorContext);
        if (!ujb.o.LJJJJJL(LJIIJ2)) {
            trackType = LJIIJ2;
        }
        ?? LJFF2 = LJFF(videoPublishEditModel, editorContext);
        LJFF2.LJI("is_black_screen", isBlackSlot);
        LJFF2.LJI("track_type", trackType);
        LJFF2.LJI("tab_name", str);
        LJFF2.LIZ(LJIILIIL ? 1 : 0, "is_editor_pro");
        LJFF2.LIZ(1, "is_multi_track");
        LJFF2.LIZ(r8, "is_cc");
        FMX.LJIIL("click_track_option", LJFF2.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (X.C63144OqK.LIZLLL(X.EnumC139485dg.LONG_VIDEO_NEW, r8.creativeModel.audioCopyrightDetectModel.getDetectScenes()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, int r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5QW.LJJIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, boolean, boolean, boolean, boolean, int):void");
    }

    public static final void LJJIIZI(int i, long j, Integer num, String errorMsg, String str, String str2, String gamePlayType) {
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(gamePlayType, "gamePlayType");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i, "status");
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("resource_id", str);
        c145995oB.LJI("resource_name", str2);
        c145995oB.LJI("gameplay_type", gamePlayType);
        if (i == 1) {
            if (num != null) {
                c145995oB.LIZ(num.intValue(), "error_code");
                c145995oB.LIZLLL("error_domain", errorMsg);
            }
        } else if (i == 2) {
            c145995oB.LIZLLL("error_domain", errorMsg);
        }
        FMX.LJIIL("magic_success_rate", c145995oB.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x008b, code lost:
    
        if (X.C63144OqK.LIZLLL(X.EnumC139485dg.LONG_VIDEO_NEW, r5.creativeModel.audioCopyrightDetectModel.getDetectScenes()) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, long r6, long r8, int r10, boolean r11, com.bytedance.ies.nle.editor_jni.NLEModel r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "publishEditModel"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r5.getCurMultiEditVideoRecordData()
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "click_edit_save"
            r3 = 0
            LJJIIJZLJL(r5, r0, r3, r12)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r5.getCurMultiEditVideoRecordData()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r0 = r0.segmentDataList
            int r2 = r0.size()
            com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel r0 = r5.getEditorProModel()
            java.util.List r0 = r0.getPipResourcePaths()
            int r1 = r0.size()
            int r1 = r1 + r2
            X.5oB r2 = LJII(r5)
            java.lang.String r0 = "from_video_length"
            r2.LIZIZ(r8, r0)
            java.lang.String r0 = "to_video_length"
            r2.LIZIZ(r6, r0)
            java.lang.String r0 = "from_video_segments"
            r2.LIZ(r10, r0)
            java.lang.String r0 = "to_video_segments"
            r2.LIZ(r1, r0)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel r0 = r0.audioCopyrightDetectModel
            boolean r1 = r0.getCopyrightClaimShowing()
            java.lang.String r0 = "is_copyright_claim"
            r2.LIZ(r1, r0)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel r0 = r0.audioCopyrightDetectModel
            java.util.ArrayList r4 = r0.getDetectScenes()
            X.5dg r1 = X.EnumC139485dg.SHORT_VIDEO
            java.lang.String r0 = "is_short_video"
            X.C43881HKb.LIZLLL(r1, r4, r2, r0)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel r0 = r0.audioCopyrightDetectModel
            java.util.ArrayList r4 = r0.getDetectScenes()
            X.5dg r1 = X.EnumC139485dg.ECOMMERCE
            java.lang.String r0 = "is_ecommerce_video"
            X.C43881HKb.LIZLLL(r1, r4, r2, r0)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel r0 = r0.audioCopyrightDetectModel
            java.util.ArrayList r1 = r0.getDetectScenes()
            X.5dg r0 = X.EnumC139485dg.LONG_VIDEO
            boolean r0 = X.C63144OqK.LIZLLL(r0, r1)
            r4 = 1
            if (r0 != 0) goto L8d
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel r0 = r0.audioCopyrightDetectModel
            java.util.ArrayList r1 = r0.getDetectScenes()
            X.5dg r0 = X.EnumC139485dg.LONG_VIDEO_NEW
            boolean r0 = X.C63144OqK.LIZLLL(r0, r1)
            if (r0 == 0) goto L8e
        L8d:
            r3 = 1
        L8e:
            java.lang.String r0 = "is_long_video"
            r2.LIZ(r3, r0)
            if (r11 == 0) goto Lb0
            java.lang.String r1 = "1"
        L97:
            java.lang.String r0 = "is_used_edit"
            r2.LJI(r0, r1)
            java.lang.String r0 = "is_editor_pro"
            r2.LIZ(r4, r0)
            if (r13 == 0) goto La8
            java.lang.String r0 = "content_type"
            r2.LIZLLL(r0, r13)
        La8:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "save_video_trim"
            X.FMX.LJIIL(r0, r1)
            return
        Lb0:
            java.lang.String r1 = "0"
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5QW.LJJIJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, long, long, int, boolean, com.bytedance.ies.nle.editor_jni.NLEModel, java.lang.String):void");
    }
}
