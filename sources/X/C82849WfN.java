package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.WfN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82849WfN {
    public final HashMap<String, Float> LIZ = new HashMap<>();
    public final HashMap<String, Float> LIZIZ = new HashMap<>();
    public long LIZJ;
    public long LIZLLL;
    public float LJ;
    public long LJFF;
    public float LJI;
    public long LJII;
    public long LJIIIIZZ;
    public final float LJIIIZ;
    public boolean LJIIJ;

    public C82849WfN(List<VideoSegment> list, float f) {
        this.LJIIIZ = f;
        for (VideoSegment videoSegment : list) {
            this.LIZ.put(videoSegment.LJII(true), Float.valueOf(videoSegment.LJIIIIZZ()));
        }
    }

    public final void LIZIZ(List<VideoSegment> list, float f) {
        long j;
        int size;
        if (C78886Uxe.LJJIJ(list)) {
            C82891Wg3.LIZLLL().w("videoSegmentList is empty");
            j = 0;
        } else {
            float f2 = 0.0f;
            for (VideoSegment videoSegment : list) {
                if (!videoSegment.isDeleted) {
                    f2 += ((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / (videoSegment.LJIIIIZZ() * f);
                }
            }
            j = f2;
        }
        this.LIZJ = j;
        this.LJFF = C82848WfM.LIZJ(j);
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("videoMultiDur: ");
        LIZ.append(this.LIZJ);
        LIZ.append(" maxCutDuration is ");
        LIZ.append(this.LJFF);
        LIZ.append(" videoSize is ");
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        LIZ.append(size);
        LIZLLL.w(X1D.LIZIZ(LIZ));
        long j2 = this.LJII;
        if (j2 > 0) {
            if (this.LJIIJ) {
                this.LJFF = j2;
            } else {
                this.LJFF = Math.min(this.LIZJ, j2);
            }
        }
        float f3 = ((float) this.LJFF) / this.LJIIIZ;
        this.LJ = f3;
        this.LJI = (((float) C82852WfQ.LIZ().LJI) * 1.0f) / f3;
        long j3 = this.LJIIIIZZ;
        if (j3 > 0) {
            this.LJI = ((float) j3) / this.LJ;
        }
        for (Map.Entry<String, Float> entry : this.LIZ.entrySet()) {
            this.LIZIZ.put(entry.getKey(), Float.valueOf(entry.getValue().floatValue() * this.LJ * f));
        }
    }

    public static long LIZ(List list, float f, float f2) {
        float LJIIIZ;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((VideoSegment) ListProtector.get(list, i2)).isDeleted) {
                arrayList.add(ListProtector.get(list, i2));
            }
        }
        long j = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                break;
            }
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(arrayList, i3);
            long LJ = ((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / (videoSegment.LJIIIIZZ() * f2);
            float f3 = (float) LJ;
            if (f <= f3) {
                i = i3;
                break;
            }
            j += LJ;
            f -= f3;
            i3++;
        }
        if (i3 == arrayList.size()) {
            return j;
        }
        if (i == 0 && ((VideoSegment) ListProtector.get(arrayList, i)).LJIIIIZZ() != 0.0f) {
            LJIIIZ = (float) j;
        } else {
            LJIIIZ = (float) (((VideoSegment) ListProtector.get(arrayList, i)).LJIIIZ() + j);
        }
        return LJIIIZ + f;
    }

    public final void LIZJ(int i, String str, float f, long j) {
        long j2 = ((float) j) / f;
        this.LIZLLL = j2;
        this.LJFF = C82848WfM.LIZJ(j2);
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZIZ = C25620zW.LIZIZ("path: ", str, " maxCutDuration is ");
        LIZIZ.append(this.LJFF);
        LIZLLL.w(X1D.LIZIZ(LIZIZ));
        long j3 = this.LJII;
        if (j3 > 0) {
            if (this.LJIIJ) {
                this.LJFF = j3;
            } else {
                this.LJFF = Math.min(this.LIZLLL, j3);
            }
        }
        float f2 = ((float) this.LJFF) / this.LJIIIZ;
        this.LJ = f2;
        if (i == 0) {
            this.LJI = (((float) C82852WfQ.LIZ().LJI) * 1.0f) / f2;
        } else {
            this.LJI = 500.0f / f2;
        }
        long j4 = this.LJIIIIZZ;
        if (j4 > 0) {
            this.LJI = ((float) j4) / this.LJ;
        }
        this.LIZIZ.put(str, Float.valueOf(this.LJ * f));
    }
}
