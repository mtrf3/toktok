package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.6jb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168636jb {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    public static List LIZ(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData;
        C68322mC c68322mC = new C68322mC();
        ArrayList arrayList = new ArrayList();
        for (EditVideoSegment editVideoSegment : videoPublishEditModel.getPreviewInfo().getVideoList()) {
            if (videoPublishEditModel.realHasOriginalSound()) {
                c68322mC.element = editVideoSegment.getAudioPath();
            } else if (videoPublishEditModel.isCutSameVideoType()) {
                c68322mC.element = editVideoSegment.getVideoPath();
            } else if (videoPublishEditModel.isFastImport) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                T t = 0;
                t = 0;
                t = 0;
                t = 0;
                if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                    Iterator<MultiEditVideoSegmentRecordData> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            multiEditVideoSegmentRecordData = it.next();
                            if (o.LJ(editVideoSegment.getVideoPath(), multiEditVideoSegmentRecordData.videoPath)) {
                                break;
                            }
                        } else {
                            multiEditVideoSegmentRecordData = null;
                            break;
                        }
                    }
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoSegmentRecordData;
                    if (multiEditVideoSegmentRecordData2 != null) {
                        t = multiEditVideoSegmentRecordData2.fastImportOriginVideoPath;
                    }
                }
                c68322mC.element = t;
            }
            String str = (String) c68322mC.element;
            if (str != null && str.length() != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (EditVideoSegment editVideoSegment : videoPublishEditModel.getPreviewInfo().getVideoList()) {
            if (videoPublishEditModel.realHasOriginalSound()) {
                str3 = editVideoSegment.getAudioPath();
            } else if (videoPublishEditModel.isCutSameVideoType()) {
                str3 = editVideoSegment.getVideoPath();
            }
            str4 = editVideoSegment.getVideoPath();
            str5 = editVideoSegment.getAudioPath();
        }
        if (str3 == null && videoPublishEditModel.isFastImport && (multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData) != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
            Iterator<MultiEditVideoSegmentRecordData> it = list.iterator();
            str = null;
            while (it.hasNext()) {
                str = it.next().fastImportOriginVideoPath;
                str3 = str;
            }
        } else {
            str = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("editModel = ");
        LIZ2.append(videoPublishEditModel);
        LIZ2.append(" \ndub audioUrl = ");
        AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            str2 = audioRecorderParam.getAudioUrl();
        }
        YE1.LIZLLL(LIZ2, str2, " \nfinal filePath = ", str3, " \nvideoPath = ");
        YE1.LIZLLL(LIZ2, str4, " \naudioPath = ", str5, " \nrealHasOriginalSound = ");
        LIZ2.append(videoPublishEditModel.hasOriginalSound());
        LIZ2.append(" \nisFastImport = ");
        LIZ2.append(videoPublishEditModel.isFastImport);
        LIZ2.append(" \nfastImportVideoPath = ");
        LIZ2.append(str);
        LIZ2.append(" \nisCutSameVideoType = ");
        LIZ2.append(videoPublishEditModel.isCutSameVideoType());
        LIZ2.append(" \npublished outputFile = ");
        LIZ2.append(videoPublishEditModel.mOutputFile);
        C169636lD.LIZ(X1D.LIZIZ(LIZ2));
    }

    public static void LJ(java.util.Map map, java.util.Map map2) {
        HashMap hashMap;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getValue() instanceof HashMap) {
                    Object value = entry.getValue();
                    if (value instanceof HashMap) {
                        hashMap = (HashMap) value;
                    } else {
                        hashMap = null;
                    }
                    LJ(map, hashMap);
                } else {
                    ((HashMap) map).put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static void LIZJ(int i, long j, VideoPublishEditModel editModel, String result) {
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(result, "result");
        LIZLLL(i, j, editModel, result, "", C47636Imm.LJII(2), C47636Imm.LIZJ());
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x016e, code lost:
    
        if (r0 == null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(int r7, long r8, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, java.lang.String r11, java.lang.String r12, double r13, int r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168636jb.LIZLLL(int, long, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, java.lang.String, double, int):void");
    }
}
