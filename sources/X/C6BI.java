package X;

import Y.ACallableS30S1100000_2;
import Y.AgS120S0100000_2;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6BI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6BI {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String LJJJLIIL = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJLIIL(creativeInfo);
        if (!C39579Fg7.LIZIZ(LJJJLIIL)) {
            C1I0.LIZJ(LJJJLIIL);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C72545SdZ.LIZLLL(LIZ2, LJJJLIIL, "_cover_img.png", LIZ2);
    }

    public static MultiEditVideoRecordData LIZ(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData2 != null) {
            if (C77413UZt.LJIILL(multiEditVideoRecordData2.segmentDataList)) {
                return multiEditVideoRecordData;
            }
            if (C77413UZt.LJIILL(multiEditVideoRecordData.segmentDataList)) {
                return multiEditVideoRecordData;
            }
            multiEditVideoRecordData.copyData(multiEditVideoRecordData2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData2.segmentDataList) {
                Iterator<MultiEditVideoSegmentRecordData> it = multiEditVideoRecordData.segmentDataList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        MultiEditVideoSegmentRecordData next = it.next();
                        if (multiEditVideoSegmentRecordData != null && !TextUtils.isEmpty(multiEditVideoSegmentRecordData.videoPath) && o.LJ(multiEditVideoSegmentRecordData.videoPath, next.videoPath) && !linkedHashMap.containsKey(Integer.valueOf(next.videoKey))) {
                            next.copyData(multiEditVideoSegmentRecordData);
                            linkedHashMap.put(Integer.valueOf(next.videoKey), Boolean.TRUE);
                            break;
                        }
                    }
                }
            }
        }
        return multiEditVideoRecordData;
    }

    public static MultiEditVideoRecordData LIZIZ(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData == null || multiEditVideoRecordData.segmentDataList == null) {
            return new MultiEditVideoRecordData();
        }
        if (multiEditVideoRecordData2 == null) {
            MultiEditVideoRecordData cloneData = multiEditVideoRecordData.cloneData();
            o.LJIIIIZZ(cloneData, "srcData.cloneData()");
            return cloneData;
        }
        multiEditVideoRecordData2.concatVideo = multiEditVideoRecordData.concatVideo;
        multiEditVideoRecordData2.concatAudio = multiEditVideoRecordData.concatAudio;
        multiEditVideoRecordData2.useMusic = multiEditVideoRecordData.useMusic;
        multiEditVideoRecordData2.startTime = multiEditVideoRecordData.startTime;
        multiEditVideoRecordData2.endTime = multiEditVideoRecordData.endTime;
        multiEditVideoRecordData2.leftSlideX = multiEditVideoRecordData.leftSlideX;
        multiEditVideoRecordData2.rightSlideX = multiEditVideoRecordData.rightSlideX;
        multiEditVideoRecordData2.curRecordingDir = multiEditVideoRecordData.curRecordingDir;
        multiEditVideoRecordData2.segmentDataList = new ArrayList();
        Iterator<MultiEditVideoSegmentRecordData> it = multiEditVideoRecordData.segmentDataList.iterator();
        while (it.hasNext()) {
            multiEditVideoRecordData2.segmentDataList.add(it.next().cloneData());
        }
        multiEditVideoRecordData2.musicPath = multiEditVideoRecordData.musicPath;
        multiEditVideoRecordData2.originVolume = multiEditVideoRecordData.originVolume;
        multiEditVideoRecordData2.musicVolume = multiEditVideoRecordData.musicVolume;
        multiEditVideoRecordData2.hasRetake = multiEditVideoRecordData.hasRetake;
        multiEditVideoRecordData2.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
        multiEditVideoRecordData2.musicDuration = multiEditVideoRecordData.musicDuration;
        multiEditVideoRecordData2.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
        multiEditVideoRecordData2.coverPath = multiEditVideoRecordData.coverPath;
        return multiEditVideoRecordData2;
    }

    public static void LIZLLL(Bitmap bitmap, String str, InterfaceC65784Pro interfaceC65784Pro) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        C10K.LIZJ(new ACallableS30S1100000_2(bitmap, str, 5)).LJ(new AgS120S0100000_2(interfaceC65784Pro, 27), C10K.LJIIIIZZ, null);
    }
}
