package X;

import java.io.Serializable;

/* renamed from: X.5UB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UB implements Serializable {
    public long LJLIL;
    public float LJLILLLLZI = 1.0f;
    public int LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;

    public final C5UB clone() {
        return new C5UB(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
    }

    public final float getSpeed() {
        return this.LJLILLLLZI;
    }

    public final long getVideoDuration() {
        return this.LJLJJLL;
    }

    public final long getVideoEnd() {
        return this.LJLIL;
    }

    public final int getVideoIndex() {
        return this.LJLJI;
    }

    public final long getVideoRange() {
        return this.LJLJJL;
    }

    public final long getVideoStart() {
        return this.LJLJJI;
    }

    public final void setSpeed(float f) {
        this.LJLILLLLZI = f;
    }

    public final void setVideoDuration(long j) {
        this.LJLJJLL = j;
    }

    public final void setVideoEnd(long j) {
        this.LJLIL = j;
    }

    public final void setVideoIndex(int i) {
        this.LJLJI = i;
    }

    public final void setVideoRange(long j) {
        this.LJLJJL = j;
    }

    public final void setVideoStart(long j) {
        this.LJLJJI = j;
    }

    public final void updateVideoStartTime(long j) {
        if (j > 0 && this.LJLJJL > 0) {
            this.LJLJJL = j;
            long j2 = 2;
            long j3 = (this.LJLIL / j2) - (j / j2);
            if (j3 > 0) {
                this.LJLJJI = j3;
            } else {
                this.LJLJJI = 0L;
            }
            this.LJLIL = this.LJLJJI + j;
        }
    }

    public final void resetVideoStartTime(long j, long j2) {
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLIL = j + j2;
    }

    public C5UB(int i, long j, long j2, long j3) {
        this.LJLJI = i;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = j3;
        this.LJLIL = j + j2;
    }
}
