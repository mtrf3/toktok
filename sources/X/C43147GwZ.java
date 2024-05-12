package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.videoquality.AIGCInfo;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.GwZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43147GwZ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        HashMap LIZIZ = LIZIZ(model);
        if (LIZIZ == null) {
            LIZIZ = new LinkedHashMap();
        }
        LIZIZ.put("creation_data", HI3.LIZ(model, null));
        if (model.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType == 2) {
            LIZIZ.put("aigc_info", new AIGCInfo(2));
        }
        if (LIZIZ.isEmpty()) {
            return null;
        }
        return C78880UxY.LJLILLLLZI(LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v54, types: [int] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v61 */
    public static C35958E9i LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        int i;
        int i2;
        String sb;
        java.util.Map LJJJLIIL;
        java.util.Map LJJJLIIL2;
        boolean z;
        String str;
        Integer num;
        Integer valueOf;
        int i3;
        int i4;
        ?? r3;
        if (videoPublishEditModel.metadataMap == null) {
            videoPublishEditModel.metadataMap = C63942P7q.LIZ();
        } else {
            java.util.Map<String, Object> LIZ2 = C63942P7q.LIZ();
            if (LIZ2 != null) {
                videoPublishEditModel.metadataMap.putAll(LIZ2);
            }
        }
        java.util.Map<String, Object> map = videoPublishEditModel.metadataMap;
        if (map == null) {
            return null;
        }
        C35958E9i c35958E9i = new C35958E9i();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!s.LJJJLZIJ(entry.getKey(), "/", false) && entry.getValue() != null) {
                c35958E9i.put(entry.getKey(), entry.getValue());
            }
        }
        c35958E9i.put("uid", C44172HVg.LJIJ.getCurrentUserID());
        c35958E9i.put("did", AppLog.getServerDeviceId());
        c35958E9i.put("te_region", C44296Ha0.LIZ());
        if (!videoPublishEditModel.hasOriginalSound()) {
            i = 1;
        } else if (videoPublishEditModel.getMusicOrigin() == null) {
            i = 0;
        } else {
            i = 2;
        }
        c35958E9i.put("te_audio_type", Integer.valueOf(i));
        c35958E9i.put("te_source_type", "tt");
        int i5 = videoPublishEditModel.mOrigin;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    i2 = -1;
                } else {
                    i2 = 8;
                }
            } else {
                if (videoPublishEditModel.getVideoEditorType() != 2) {
                    if (ORY.LJJIJIIJIL(Integer.valueOf(videoPublishEditModel.getVideoEditorType()), new Integer[]{13, 15})) {
                        i2 = 7;
                    } else if (videoPublishEditModel.mShootMode == 2) {
                        i2 = 6;
                    } else if (TextUtils.isEmpty(videoPublishEditModel.mDuetFrom)) {
                        i2 = 0;
                    } else {
                        i2 = 5;
                    }
                }
                i2 = 3;
            }
        } else {
            if (videoPublishEditModel.getVideoEditorType() != 2) {
                i2 = 1;
            }
            i2 = 3;
        }
        c35958E9i.put("te_publish_type", Integer.valueOf(i2));
        c35958E9i.put("te_camera_type", videoPublishEditModel.cameraIds);
        c35958E9i.put("te_filter_id", videoPublishEditModel.getEditFilterId());
        c35958E9i.put("te_filter_name", videoPublishEditModel.getEditFilterName());
        c35958E9i.put("te_crop_video", Integer.valueOf(videoPublishEditModel.mCropVideo ? 1 : 0));
        c35958E9i.put("te_info_sticker_id", videoPublishEditModel.getEditStickerIds());
        c35958E9i.put("te_edit_sticker_id", videoPublishEditModel.getEditEffectListWithOutZeroStr());
        c35958E9i.put("te_edit_text_id", videoPublishEditModel.textEffectIds);
        c35958E9i.put("upload_HD_button", Integer.valueOf(C78685UuP.LJJJJL(videoPublishEditModel.uploadSpeedInfo.getSpeed()) ? 1 : 0));
        c35958E9i.put("upload_HD", Boolean.FALSE);
        if (videoPublishEditModel.mOrigin == 0) {
            Cut2EditTransferModel cut2EditTransferModel = videoPublishEditModel.cut2EditTransferModel;
            if (cut2EditTransferModel != null) {
                if (cut2EditTransferModel.isVideoCompressed()) {
                    r3 = 0;
                } else {
                    r3 = 1;
                }
            } else {
                r3 = H7R.LJJJJ(videoPublishEditModel);
            }
            c35958E9i.put("te_is_fast_import", Integer.valueOf((int) r3));
        }
        if (videoPublishEditModel.mOrigin == 0) {
            ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
            if (arrayList == null || arrayList.isEmpty()) {
                LJJJLIIL2 = C113554cx.LJJJLIIL();
            } else {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                Iterator<ImportVideoInfo> it = arrayList.iterator();
                while (it.hasNext()) {
                    ImportVideoInfo next = it.next();
                    String importIndex = next.getImportIndex();
                    if (importIndex == null) {
                        importIndex = "";
                    }
                    arrayList2.add(importIndex);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(next.getVideoWidth());
                    LIZ3.append('*');
                    LIZ3.append(next.getVideoHeight());
                    arrayList3.add(X1D.LIZIZ(LIZ3));
                    arrayList4.add(String.valueOf(next.getImportfileDuration()));
                    arrayList5.add(String.valueOf(next.getDuration()));
                    String originImportPath = next.getOriginImportPath();
                    if (originImportPath == null) {
                        originImportPath = next.getRealImportPath();
                    }
                    if (next.getDuration() > 0 && next.getEncodeId() <= 0 && originImportPath != null && !ujb.o.LJJJJJL(originImportPath)) {
                        VEUtils.VEVideoFileInfo LJIJJ = C62819Ol5.LJIJJ(originImportPath);
                        if (LJIJJ != null) {
                            i4 = LJIJJ.codec;
                        } else {
                            i4 = 0;
                        }
                        next.setEncodeId(i4);
                    }
                    String codecName = VEUtils.getVideoEncodeTypeByID(next.getEncodeId());
                    if (originImportPath != null && !o.LJ(codecName, "unknown")) {
                        Object obj = videoPublishEditModel.metadataMap.get(originImportPath);
                        if (obj != null) {
                            List LJLJJL = s.LJLJJL((String) obj, new String[]{" "}, 0, 6);
                            if (LJLJJL.size() >= 6) {
                                arrayList6.add(ListProtector.get(LJLJJL, 0));
                                arrayList7.add(ListProtector.get(LJLJJL, 1));
                                arrayList8.add(ListProtector.get(LJLJJL, 2));
                                Integer LJJIL = C38350F3i.LJJIL((String) ListProtector.get(LJLJJL, 3));
                                if (LJJIL != null) {
                                    i3 = LJJIL.intValue();
                                } else {
                                    i3 = -1;
                                }
                                String videoEncodeTypeByID = VEUtils.getVideoEncodeTypeByID(i3);
                                o.LJIIIIZZ(videoEncodeTypeByID, "getVideoEncodeTypeByID(\n…                        )");
                                arrayList9.add(videoEncodeTypeByID);
                                arrayList10.add(ListProtector.get(LJLJJL, 4));
                                arrayList11.add(ListProtector.get(LJLJJL, 5));
                            }
                        }
                        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(originImportPath);
                        if (videoFileInfo == null || (valueOf = Integer.valueOf(videoFileInfo.bitrate)) == null || (str = String.valueOf(((valueOf.intValue() * 1000) / 1024) / 8)) == null) {
                            str = CardStruct.IStatusCode.DEFAULT;
                        }
                        arrayList12.add(str);
                        if (videoFileInfo != null) {
                            num = Integer.valueOf(videoFileInfo.fps);
                        } else {
                            num = null;
                        }
                        arrayList13.add(String.valueOf(num));
                    } else {
                        arrayList6.add(" ");
                        arrayList7.add(" ");
                        arrayList8.add(" ");
                        o.LJIIIIZZ(codecName, "codecName");
                        arrayList9.add(codecName);
                        arrayList10.add(codecName);
                        arrayList11.add(codecName);
                        arrayList12.add(codecName);
                        arrayList13.add(codecName);
                    }
                }
                LJJJLIIL2 = C113554cx.LJJLIIIIJ(new OSZ("te_import_path", ORZ.LLD(arrayList2, ",", null, null, null, 62)), new OSZ("te_import_resolution", ORZ.LLD(arrayList3, ",", null, null, null, 62)), new OSZ("te_import_video_color_range", ORZ.LLD(arrayList10, ",", null, null, null, 62)), new OSZ("te_import_video_color_space", ORZ.LLD(arrayList11, ",", null, null, null, 62)), new OSZ("te_import_video_bit_rate", ORZ.LLD(arrayList12, ",", null, null, null, 62)), new OSZ("te_import_video_fps", ORZ.LLD(arrayList13, ",", null, null, null, 62)));
                if (!arrayList9.isEmpty()) {
                    Iterator it2 = arrayList9.iterator();
                    while (it2.hasNext()) {
                        if (!o.LJ(it2.next(), "unknown")) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    LJJJLIIL2.put("te_import_file_encode_type", ORZ.LLD(arrayList9, ",", null, null, null, 62));
                    LJJJLIIL2.put("te_import_file_duration", ORZ.LLD(arrayList4, ",", null, null, null, 62));
                    LJJJLIIL2.put("te_import_file_trim_duration", ORZ.LLD(arrayList5, ",", null, null, null, 62));
                    LJJJLIIL2.put("is_hdr", ORZ.LLD(arrayList6, ";", null, null, null, 62));
                    LJJJLIIL2.put("bit_depth", ORZ.LLD(arrayList7, ";", null, null, null, 62));
                    LJJJLIIL2.put("EOTF", ORZ.LLD(arrayList8, ";", null, null, null, 62));
                } else if (C44384HbQ.LJLLLL(videoPublishEditModel)) {
                    LJJJLIIL2.put("te_import_file_encode_type", ORZ.LLD(arrayList9, ",", null, null, null, 62));
                }
            }
            for (Map.Entry entry2 : LJJJLIIL2.entrySet()) {
                c35958E9i.put(entry2.getKey(), entry2.getValue());
            }
        } else {
            c35958E9i.put("te_video_speed", videoPublishEditModel.getSpeed());
            String str2 = videoPublishEditModel.mStickerID;
            if (str2 == null || str2.length() == 0 || o.LJ(str2, CardStruct.IStatusCode.DEFAULT)) {
                str2 = "";
            }
            if (ujb.o.LJJJJ(str2, ",", false)) {
                str2 = C58314Muc.LIZIZ(str2, 1, 0, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            c35958E9i.put("te_record_sticker_id", str2);
            if (videoPublishEditModel.mRecordFilterIds == null) {
                sb = null;
            } else {
                StringBuilder sb2 = new StringBuilder("");
                String str3 = videoPublishEditModel.mRecordFilterIds;
                o.LJIIIIZZ(str3, "model.mRecordFilterIds");
                for (String str4 : s.LJLJJL(str3, new String[]{","}, 0, 6)) {
                    if (!o.LJ(str4, "null")) {
                        sb2.append(str4);
                        sb2.append(",");
                    }
                }
                if (sb2.length() > 0) {
                    String sb3 = sb2.toString();
                    o.LJIIIIZZ(sb3, "toString()");
                    sb = sb3.substring(0, sb2.length() - 1);
                    o.LJIIIIZZ(sb, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    sb = sb2.toString();
                }
            }
            c35958E9i.put("te_record_filter_id", sb);
            c35958E9i.put("te_record_filter_name", videoPublishEditModel.mRecordFilterLabels);
            c35958E9i.put("te_face_beauty_type", Integer.valueOf(videoPublishEditModel.mFaceBeauty));
            ArrayList<BeautyMetadata> arrayList14 = videoPublishEditModel.mBeautyMetadatas;
            if (arrayList14 == null || arrayList14.isEmpty()) {
                LJJJLIIL = C113554cx.LJJJLIIL();
            } else {
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList<BeautyMetadata> arrayList20 = videoPublishEditModel.mBeautyMetadatas;
                o.LJIIIIZZ(arrayList20, "model.mBeautyMetadatas");
                Iterator<BeautyMetadata> it3 = arrayList20.iterator();
                while (it3.hasNext()) {
                    BeautyMetadata next2 = it3.next();
                    if (next2.getBeautyName().length() > 0) {
                        arrayList15.add(next2.getBeautyName());
                        arrayList16.add(next2.getBeautyStrength());
                        arrayList17.add(next2.getBeautyId());
                        arrayList18.add(next2.getBeautyRes());
                        arrayList19.add(next2.getBeautyValid());
                    }
                }
                if (arrayList15.isEmpty()) {
                    LJJJLIIL = C113554cx.LJJJLIIL();
                } else {
                    LJJJLIIL = C113554cx.LJJL(new OSZ("te_record_beauty_name", ORZ.LLD(arrayList15, ";", null, null, null, 62)), new OSZ("te_record_beauty_strength", ORZ.LLD(arrayList16, ";", null, null, null, 62)), new OSZ("te_record_beauty_id", ORZ.LLD(arrayList17, ";", null, null, null, 62)), new OSZ("te_record_beauty_res", ORZ.LLD(arrayList18, ";", null, null, null, 62)), new OSZ("te_record_beauty_res_valid", ORZ.LLD(arrayList19, ";", null, null, null, 62)));
                }
            }
            for (Map.Entry entry3 : LJJJLIIL.entrySet()) {
                c35958E9i.put(entry3.getKey(), entry3.getValue());
            }
            if (ORY.LJJIJ(i2, new int[]{0, 5, 6})) {
                c35958E9i.put("te_composition_duet_is_on", Integer.valueOf(videoPublishEditModel.isDuet() ? 1 : 0));
                c35958E9i.put("te_composition_duet_type", videoPublishEditModel.getDuetLayoutLogMode());
            }
            c35958E9i.put("te_record_video_output_size_by_bytebench", Integer.valueOf(((Number) C44989HlB.LJ.getValue()).intValue()));
        }
        c35958E9i.put("te_composition_auto_subtitle", Integer.valueOf(videoPublishEditModel.hasSubtitle() ? 1 : 0));
        return c35958E9i;
    }
}
