package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wfg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82868Wfg {
    public float LIZ;
    public long LIZIZ;
    public final float LIZJ;
    public long LIZLLL;

    public C82868Wfg(float f) {
        this.LIZJ = f;
    }

    public final void LIZJ(long j) {
        long min = Math.min(this.LIZIZ, j);
        this.LIZIZ = min;
        this.LIZ = ((float) min) / this.LIZJ;
    }

    public static final long LIZ(List<? extends VideoSegment> videoSegmentList, float f) {
        o.LJIIIZ(videoSegmentList, "videoSegmentList");
        if (C32151Nz.LJJIIJZLJL(videoSegmentList)) {
            return 0L;
        }
        float f2 = 0.0f;
        for (VideoSegment videoSegment : videoSegmentList) {
            if (!videoSegment.isDeleted) {
                f2 += ((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / (videoSegment.LJIIIIZZ() * f);
            }
        }
        return f2;
    }

    public final void LIZLLL(float f, long j) {
        long min = Math.min(Math.min(this.LIZIZ, ((float) j) / f), this.LIZLLL);
        this.LIZIZ = min;
        this.LIZ = ((float) min) / this.LIZJ;
    }

    public static final OSZ<Integer, Float> LIZIZ(long j, float f, int i, List<? extends VideoSegment> videoList) {
        o.LJIIIZ(videoList, "videoList");
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        for (VideoSegment videoSegment : videoList) {
            if (!videoSegment.isDeleted) {
                float f4 = (float) j;
                if (f4 < f2) {
                    break;
                }
                float LJ = f2 + (((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / videoSegment.LJIIIIZZ());
                if (f4 >= LJ) {
                    i2 = O6R.LJJIIZ((float) Math.ceil(r1 / f)) + i2;
                } else {
                    float f5 = f4 - f2;
                    int i3 = (int) (f5 / f);
                    i2 += i3;
                    f3 = ((f5 - (i3 * f)) / f) * i;
                }
                f2 = LJ;
            }
        }
        return new OSZ<>(Integer.valueOf(i2), Float.valueOf(f3));
    }
}
