package X;

import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.filterparam.VEVideoEffectStreamFilterParam;

/* renamed from: X.WzO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84090WzO implements X02, X0L, ICH {
    public final C84092WzQ LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LJ;
    public int LIZLLL = -1;
    public int LJFF = -1;

    @Override // X.ICH
    public final void LIZIZ(boolean z) {
    }

    @Override // X.ICH
    public final void LIZJ(ICF icf) {
    }

    @Override // X.X02
    public final void LJ() {
    }

    @Override // X.X0E
    public final void LJFF(int i) {
    }

    @Override // X.X0E
    public final void LJI(boolean z) {
    }

    @Override // X.X02
    public final void LJII() {
    }

    public final synchronized void LJIIJ() {
        LJIIIIZZ(this.LIZJ);
        if (!this.LJ) {
            this.LIZ.alignTo(this.LIZLLL, 0, 0, 0);
            start();
        }
    }

    @Override // X.X02
    public final void onCreate() {
        this.LIZ.addRecorderStateListener(this);
        LJIIJ();
    }

    @Override // X.X02
    public final void onDestroy() {
        int i = this.LIZLLL;
        if (i >= 0) {
            this.LIZ.LJIILIIL(0, i, true);
            this.LIZLLL = -1;
        }
        int i2 = this.LJFF;
        if (i2 != -1) {
            this.LIZ.LIZ.removeTrackFilter(i2);
            this.LJFF = -1;
        }
        this.LIZ.removeRecorderStateListener(this);
    }

    @Override // X.ICH
    public final void pause() {
        this.LIZ.pausePlayTrack(this.LIZLLL, 0);
    }

    @Override // X.ICH
    public final void start() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start play track ");
        C01R.LIZJ(LIZ, this.LIZLLL, LIZ, "TEVideoGifBgProxy");
        int i = this.LIZLLL;
        if (i >= 0) {
            this.LIZ.startPlayTrack(i, 0, true);
        }
    }

    @Override // X.X02
    public final void LIZ() {
        pause();
    }

    @Override // X.X02
    public final void LIZLLL(float f) {
        if (!this.LJ) {
            this.LJ = true;
            LJIIIZ(0L);
        }
        start();
    }

    public final void LJIIIIZZ(String str) {
        C82647Wc7 c82647Wc7 = new C82647Wc7();
        c82647Wc7.LIZ(str);
        c82647Wc7.LIZIZ();
        c82647Wc7.LIZJ(0);
        c82647Wc7.LIZLLL(-1);
        VETrackParams vETrackParams = c82647Wc7.LIZ;
        vETrackParams.layer = 1;
        vETrackParams.trackPriority = EnumC82648Wc8.External;
        int LIZJ = this.LIZ.LIZJ(0, vETrackParams, true);
        this.LIZLLL = LIZJ;
        this.LIZ.seekTrack(LIZJ, 0, 0L);
        int i = this.LIZLLL;
        VEVideoEffectStreamFilterParam vEVideoEffectStreamFilterParam = new VEVideoEffectStreamFilterParam();
        vEVideoEffectStreamFilterParam.streamFlags = 6;
        vEVideoEffectStreamFilterParam.extraString = this.LIZIZ;
        int i2 = this.LJFF;
        if (i2 >= 0) {
            this.LIZ.LIZ.updateTrackFilterParam(i2, vEVideoEffectStreamFilterParam);
        } else {
            this.LJFF = this.LIZ.LIZ.addTrackFilter(0, i, vEVideoEffectStreamFilterParam, -1, -1);
        }
    }

    public final void LJIIIZ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("seek ");
        LIZ.append(j);
        P4Q.LJFF("TEVideoGifBgProxy", X1D.LIZIZ(LIZ));
        int i = this.LIZLLL;
        if (i >= 0) {
            this.LIZ.seekTrack(i, 0, j);
        }
    }

    public C84090WzO(C84092WzQ c84092WzQ, String str, String str2) {
        this.LIZ = c84092WzQ;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    @Override // X.X0L
    public final void onInfo(int i, int i2, String str) {
        if (i == VEInfo.TE_INFO_DELETE_LAST_FRAG_DONE_NOTIFY) {
            LJIIIZ(this.LIZ.getEndFrameTime());
        }
    }
}
