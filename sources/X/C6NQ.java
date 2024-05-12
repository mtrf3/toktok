package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6NQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NQ {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final String[] LJFF;
    public final String[] LJI;

    public final EditPreviewInfo LIZ(MultiEditVideoRecordData data) {
        o.LJIIIZ(data, "data");
        C6NR c6nr = new C6NR(this.LIZJ, this.LIZLLL, this.LIZ, this.LIZIZ, "");
        List<MultiEditVideoSegmentRecordData> list = data.segmentDataList;
        ArrayList LIZIZ = s1.LIZIZ(list, "data.segmentDataList");
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            if (multiEditVideoSegmentRecordData.enable) {
                LIZIZ.add(multiEditVideoSegmentRecordData);
            }
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZIZ, 10));
        Iterator it = LIZIZ.iterator();
        while (it.hasNext()) {
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) it.next();
            String videoPath = multiEditVideoSegmentRecordData2.videoPath;
            String str = multiEditVideoSegmentRecordData2.audioPath;
            o.LJIIIIZZ(videoPath, "videoPath");
            EditVideoSegment editVideoSegment = new EditVideoSegment(videoPath, str, new VideoFileInfo(multiEditVideoSegmentRecordData2.width, multiEditVideoSegmentRecordData2.height, multiEditVideoSegmentRecordData2.videoLength / 1000, -100, 0, 0, 0, 0, 0.0f, 496, null));
            if (this.LJ) {
                editVideoSegment.setVideoCutInfo(new VideoCutInfo(multiEditVideoSegmentRecordData2.getStartTime(), multiEditVideoSegmentRecordData2.getEndTime(), multiEditVideoSegmentRecordData2.getVideoSpeed(), multiEditVideoSegmentRecordData2.rotate));
            }
            arrayList.add(editVideoSegment);
        }
        EditPreviewInfo LIZ = c6nr.LIZ(ORZ.LLJILJILJ(arrayList));
        LIZ.setPreviewVideoLength((int) data.endTime);
        LIZ.setReverseAudioArray(this.LJFF);
        LIZ.setReverseVideoArray(this.LJI);
        return LIZ;
    }

    public C6NQ(int i, int i2, boolean z, String[] strArr, String[] strArr2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        z = (i3 & 16) != 0 ? false : z;
        strArr = (i3 & 32) != 0 ? null : strArr;
        strArr2 = (i3 & 64) != 0 ? null : strArr2;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = z;
        this.LJFF = strArr;
        this.LJI = strArr2;
    }
}
