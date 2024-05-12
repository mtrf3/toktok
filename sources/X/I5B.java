package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

/* loaded from: classes8.dex */
public final class I5B {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public float LIZLLL;

    public final void LIZIZ() {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0;
        this.LIZLLL = 1.0f;
    }

    public I5B(VideoSegment videoSegment) {
        this.LIZLLL = 1.0f;
        this.LIZ = videoSegment.LJIIIZ();
        this.LIZIZ = videoSegment.LJ();
        this.LIZJ = videoSegment.rotate;
        this.LIZLLL = videoSegment.LJIIIIZZ();
        if (videoSegment.LJIIJ()) {
            this.LIZ = videoSegment.stickPointVideoSegment.getVideoStart();
            this.LIZIZ = videoSegment.stickPointVideoSegment.getVideoEnd();
        }
    }

    public final void LIZ(VideoSegment videoSegment) {
        this.LIZ = videoSegment.LJIIIZ();
        this.LIZIZ = videoSegment.LJ();
        this.LIZJ = videoSegment.rotate;
        this.LIZLLL = videoSegment.LJIIIIZZ();
        if (videoSegment.LJIIJ()) {
            this.LIZ = videoSegment.stickPointVideoSegment.getVideoStart();
            this.LIZIZ = videoSegment.stickPointVideoSegment.getVideoEnd();
        }
    }
}
