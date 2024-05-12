package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.StreamEditConfigure;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.g0;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H5E {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Bundle bundle, VideoPublishEditModel mModel, long j, long j2, long j3, H5F h5f) {
        String str;
        int i;
        CanvasExtra extra;
        StreamEditConfigure streamEditConfigure;
        long j4;
        AutoCutThemeData autoCutThemeData;
        Object obj;
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(mModel, "mModel");
        G8G.LIZ.end("av_video_edit", "firstFrame", j3);
        long j5 = bundle.getLong("extra_start_enter_edit_page", 0L);
        long j6 = bundle.getLong("extra_import_compile_cost_time", 0L);
        long j7 = bundle.getLong("extra_import_total_video_duration", 0L);
        long j8 = j3 - j5;
        long j9 = j - j5;
        if (j5 > 0) {
            C145995oB LIZ2 = UFE.LIZ(j8, "first_frame_duration");
            LIZ2.LJ("is_fast_import", H7R.LJJJJ(mModel));
            LIZ2.LJI("original_resolution", C44384HbQ.LJJLIIIJLJLI(mModel));
            LIZ2.LIZ(C44384HbQ.LJJLIIIJL(mModel), "source_codec_type");
            LIZ2.LIZ(C44384HbQ.LJJLIIIJJIZ(mModel), "source_file_bitrate");
            LIZ2.LJI("content_type", H7R.LJIIIZ(mModel));
            LIZ2.LJI("content_source", H7R.LJIIIIZZ(mModel));
            LIZ2.LIZ(mModel.videoCount, "video_cnt");
            String str2 = "1";
            if (C44739Hh9.LIZ()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ2.LJI("is_hardcode", str);
            LIZ2.LJI("resolution", mModel.getVideoResolution());
            LIZ2.LIZIZ(j6, "compile_time");
            LIZ2.LIZ(mModel.getPreviewInfo().getPreviewVideoLength(), "source_duration");
            LIZ2.LJI("bite_rate", String.valueOf(C44739Hh9.LJI(H7R.LJJJJI(mModel))));
            LIZ2.LIZ(C44739Hh9.LJII(), "video_quality");
            LIZ2.LIZ(mModel.recordMode, "record_mode");
            LIZ2.LJ("reshoot", mModel.isRetakeVideo());
            LIZ2.LJI("shoot_way", mModel.mShootWay);
            LIZ2.LJI("creation_id", mModel.getCreationId());
            LIZ2.LIZ(mModel.isCurrentAutoCutMode() ? 1 : 0, "is_autocut");
            LIZ2.LIZ(mModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
            if (j2 > 0) {
                LIZ2.LIZIZ(j2 - j5, "surface_first_draw_duration");
            }
            LIZ2.LIZIZ(j9, "first_ui_frame_duration");
            if (mModel.isCurrentAutoCutMode()) {
                Iterator<AutoCutThemeData> it = mModel.creativeModel.autoCutModel.templateList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        autoCutThemeData = it.next();
                        AutoCutThemeData autoCutThemeData2 = autoCutThemeData;
                        if (autoCutThemeData2.LIZ() == AnonymousClass636.LJJ(mModel.creativeModel.autoCutModel.curSource) && autoCutThemeData2.indexFromSource == mModel.creativeModel.autoCutModel.curIndexFromSource) {
                            break;
                        }
                    } else {
                        autoCutThemeData = null;
                        break;
                    }
                }
                AutoCutThemeData autoCutThemeData3 = autoCutThemeData;
                if (autoCutThemeData3 != null) {
                    obj = Integer.valueOf(autoCutThemeData3.templateType);
                } else {
                    obj = null;
                }
                LIZ2.LIZJ(obj, "autocut_template_type");
            }
            OSZ LJJIIJ = g0.LJJIIJ(mModel);
            int intValue = ((Number) LJJIIJ.getFirst()).intValue();
            int intValue2 = ((Number) LJJIIJ.getSecond()).intValue();
            if (intValue + intValue2 > 1) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ2.LIZ(i, "is_multi_content");
            LIZ2.LIZ(intValue2, "pic_cnt");
            LIZ2.LIZ(C79004UzY.LJIJJLI(mModel.canvasVideoData) ? 1 : 0, "stream_edit_mode");
            CanvasVideoData canvasVideoData = mModel.canvasVideoData;
            if (canvasVideoData != null && (extra = canvasVideoData.getExtra()) != null && (streamEditConfigure = extra.getStreamEditConfigure()) != null) {
                VideoDownloadPartialResult partialResult = streamEditConfigure.getPartialResult();
                if (partialResult != null) {
                    j4 = partialResult.getCacheSizeFromZero();
                } else {
                    j4 = 0;
                }
                LIZ2.LIZIZ(j4, "external_cache_size");
            }
            Cut2EditTransferModel cut2EditTransferModel = mModel.cut2EditTransferModel;
            if (cut2EditTransferModel != null) {
                LIZ2.LIZ(cut2EditTransferModel.isVideoCompressed() ? 1 : 0, "cut_opt_video_compressed");
                LIZ2.LIZIZ(cut2EditTransferModel.getDownloadResTime(), "cut_opt_res_download_time");
                LIZ2.LIZIZ(cut2EditTransferModel.getResizeImageTime(), "cut_opt_img_resize_time");
                LIZ2.LIZIZ(cut2EditTransferModel.getCompressVideoTime(), "cut_opt_video_compress_time");
                LIZ2.LIZ(cut2EditTransferModel.getMusicSyncMode() ? 1 : 0, "cut_opt_use_sync_mode_default");
            }
            if (h5f != null) {
                LIZ2.LIZIZ(h5f.LJLIL, "root_scene_create_view_duration");
                LIZ2.LIZIZ(h5f.LJLILLLLZI, "register_components_duration");
                LIZ2.LIZIZ(h5f.LJLJI, "init_editor_duration");
                LIZ2.LIZIZ(h5f.LJLJJI, "prepare_editor_duration");
                LIZ2.LIZIZ(h5f.LJLJJL, "init_editor_end_to_onresume_duration");
            }
            if (j7 > 0) {
                LIZ2.LIZIZ(j7, "total_import_duration");
            }
            java.util.Map<String, String> map = LIZ2.LIZ;
            o.LJIIIIZZ(map, "eventMapBuilder.builder()");
            C42318GjC.LIZIZ("tool_performance_edit_first_frame", map);
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("content_type", H7R.LJIIIZ(mModel));
            c145995oB.LJI("filter_list", mModel.mCurFilterLabels);
            c145995oB.LJI("filter_id_list", mModel.mCurFilterIds);
            c145995oB.LJI("prop_list", mModel.mStickerID);
            if (!C44739Hh9.LIZ()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c145995oB.LJI("is_hardcode", str2);
            c145995oB.LJI("bite_rate", String.valueOf(C44739Hh9.LJI(H7R.LJJJJI(mModel))));
            c145995oB.LIZ(C44739Hh9.LJII(), "video_quality");
            c145995oB.LJI("resolution", mModel.getVideoResolution());
            c145995oB.LJI("content_source", H7R.LJIIIIZZ(mModel));
            c145995oB.LIZIZ(j8, "total_time");
            c145995oB.LIZIZ(j6, "compile_time");
            c145995oB.LJ("is_fast_import", H7R.LJJJJ(mModel));
            c145995oB.LIZ(mModel.segmentCounts(), "segment_count");
            GXR.LIZ("first_frame_display_on_edit_page", c145995oB.LIZ);
            if (TextUtils.equals(H7R.LJIIIIZZ(mModel), "upload")) {
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("totaltime", Long.valueOf(j8));
                c6bk.LIZ.put("process_time", Long.valueOf(j6));
                c6bk.LIZ.put("is_fast_import", Boolean.valueOf(H7R.LJJJJ(mModel)));
                c6bk.LIZ.put("segment_count", Integer.valueOf(mModel.segmentCounts()));
                C43882HKc.LIZIZ("aweme_publish_edit_page_render_time", c6bk.LJ());
            }
            StringBuilder LIZJ = V10.LIZJ("firstFrameRender in VEVideoPublishEditActivity,compile usage:", j6, ",total usage:");
            LIZJ.append(j8);
            LIZJ.append(", lazyInit:");
            C13860gY.LIZIZ(LIZJ, true, LIZJ);
        }
    }
}
