package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class HFT {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r4 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r17) {
        /*
            java.lang.String r0 = "videoPublishEditModel"
            r6 = r17
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r6.getCurMultiEditVideoRecordData()
            r11 = 0
            if (r0 == 0) goto L81
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r4 = r0.segmentDataList
        L15:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r0 = r6.multiEditVideoRecordData
            if (r0 == 0) goto L87
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> r0 = r0.editSegments
            if (r0 == 0) goto L87
            java.util.Iterator r10 = r0.iterator()
            r9 = 0
        L22:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r1 = r10.next()
            int r8 = r9 + 1
            if (r9 < 0) goto L83
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r1 = (com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension) r1
            com.ss.android.ugc.aweme.sticker.model.BackgroundVideo r0 = r1.getBackgroundVideo()
            com.ss.android.ugc.aweme.sticker.model.RecordUploadVideoTimeInfo r7 = r1.getmBackgroundVideoTimeInfo()
            if (r0 == 0) goto L75
            if (r7 == 0) goto L75
            java.lang.String r0 = r0.getVideoPath()
            if (r0 == 0) goto L75
            java.lang.String r17 = LIZIZ(r6, r0)
            if (r4 == 0) goto L77
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r9, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r0 = (com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r0
            if (r0 == 0) goto L77
            long r2 = r0.getStartTime()
        L56:
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r9, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r0 = (com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r0
            if (r0 == 0) goto L7c
            long r0 = r0.getEndTime()
        L62:
            long r0 = r0 - r2
            long r13 = r7.getStartTime()
            long r13 = r13 + r2
            long r15 = r7.getStartTime()
            long r15 = r15 + r0
            X.HFV r12 = new X.HFV
            r12.<init>(r13, r15, r17)
            r5.add(r12)
        L75:
            r9 = r8
            goto L22
        L77:
            r2 = 0
            if (r4 == 0) goto L7c
            goto L56
        L7c:
            long r0 = r7.getEndTime()
            goto L62
        L81:
            r4 = r11
            goto L15
        L83:
            X.C47261Igj.LJJJJJ()
            throw r11
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HFT.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.List");
    }

    public static int[] LIZ(long j, long j2) {
        int LIZIZ = ((int) (j2 - j)) / C54846Lfm.LIZIZ();
        int[] iArr = new int[LIZIZ];
        for (int i = 0; i < LIZIZ; i++) {
            iArr[i] = (C54846Lfm.LIZIZ() * i) + ((int) j);
        }
        if (LIZIZ == 0 && j2 > 0) {
            return new int[]{0};
        }
        return iArr;
    }

    public static String LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        String substring = str.substring(s.LJJLIIJ(str, separator, 6) + 1);
        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
        String LIZ2 = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LIZ(videoPublishEditModel, substring);
        if (C44687HgJ.LIZIZ(LIZ2)) {
            return LIZ2;
        }
        return str;
    }
}
