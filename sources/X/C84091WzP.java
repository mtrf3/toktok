package X;

import Y.IDHandlerS24S0100000_14;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.vesdk.VEDuetSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.ArrayList;

/* renamed from: X.WzP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C84091WzP implements X02, X0L {
    public Runnable LIZ;
    public C84092WzQ LIZIZ;
    public final VEDuetSettings LIZJ;
    public VESize LIZLLL;
    public VESize LJ = new VESize(0, 0);
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public final IDHandlerS24S0100000_14 LJIIJJI = new IDHandlerS24S0100000_14(this, C16880lQ.LLJJJJ(), 6);

    @Override // X.X02
    public final void LIZ() {
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

    public int[] LJIIJ() {
        return new int[]{0, 1, 2};
    }

    public void LJIIL() {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.filterName = "canvas blend";
        vEVideoTransformFilterParam.scaleFactor = 1.0f;
        vEVideoTransformFilterParam.transX = -0.25f;
        vEVideoTransformFilterParam.alpha = 1.0f;
        this.LJIIIZ = this.LIZIZ.LIZ.addTrackFilter(0, 0, vEVideoTransformFilterParam, -1, -1);
    }

    public void LJIILLIIL(EnumC62342cY enumC62342cY) {
    }

    @Override // X.X02
    public final void LJ() {
        long endFrameTime = this.LIZIZ.getEndFrameTime();
        this.LIZIZ.alignTo(this.LJI, 1, -1, 0);
        this.LIZIZ.seekTrack(this.LJI, 1, endFrameTime);
        this.LIZIZ.alignTo(this.LJI, 1, 1, 0);
    }

    public final void LJIILJJIL() {
        int alignTo = this.LIZIZ.alignTo(this.LJI, 1, 1, 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aTrack(");
        LIZ.append(this.LJI);
        LIZ.append(") alignTo camera track ret=");
        LIZ.append(alignTo);
        P4Q.LJFF("TEDuetProxy", X1D.LIZIZ(LIZ));
        if (alignTo < 0) {
            int alignTo2 = this.LIZIZ.alignTo(this.LJII, 0, 1, 0);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("vTrack(");
            LIZ2.append(this.LJII);
            LIZ2.append(") alignTo camera track ret=");
            LIZ2.append(alignTo2);
            P4Q.LJFF("TEDuetProxy", X1D.LIZIZ(LIZ2));
            return;
        }
        int alignTo3 = this.LIZIZ.alignTo(this.LJII, 0, this.LJI, 1);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("vTrack(");
        LIZ3.append(this.LJII);
        LIZ3.append(") alignTo aTrack(");
        LIZ3.append(this.LJI);
        LIZ3.append(") ret=");
        LIZ3.append(alignTo3);
        P4Q.LJFF("TEDuetProxy", X1D.LIZIZ(LIZ3));
    }

    public final void LJIILL() {
        C82647Wc7 c82647Wc7 = new C82647Wc7();
        c82647Wc7.LIZ("camera_path");
        c82647Wc7.LIZIZ();
        c82647Wc7.LIZJ(0);
        c82647Wc7.LIZLLL(Integer.MAX_VALUE);
        VETrackParams vETrackParams = c82647Wc7.LIZ;
        if (vETrackParams.seqIns == null) {
            vETrackParams.seqIns = new ArrayList();
        }
        c82647Wc7.LIZ.seqIns.add(0);
        VETrackParams vETrackParams2 = c82647Wc7.LIZ;
        if (vETrackParams2.seqOuts == null) {
            vETrackParams2.seqOuts = new ArrayList();
        }
        c82647Wc7.LIZ.seqOuts.add(Integer.MAX_VALUE);
        int i = LJIIJ()[2];
        VETrackParams vETrackParams3 = c82647Wc7.LIZ;
        vETrackParams3.layer = i;
        vETrackParams3.trackPriority = EnumC82648Wc8.External;
        this.LIZIZ.LJIIZILJ(0, 0, vETrackParams3, true);
        P4Q.LJFF("TEDuetProxy", "update camera Track");
        LJIIL();
    }

    @Override // X.X02
    public void onCreate() {
        this.LIZIZ.addRecorderStateListener(this);
        VESize vESize = this.LIZLLL;
        int i = vESize.width;
        int i2 = vESize.height / 2;
        VESize vESize2 = this.LJ;
        int sqrt = (((int) (Math.sqrt((r0 * i) / ((i * i2) * 1.0d)) * i)) >> 4) << 4;
        int i3 = (i2 * sqrt) / i;
        int i4 = ((i3 >> 4) + ((i3 & 15) >> 3)) << 4;
        vESize2.width = sqrt;
        vESize2.height = i4;
        if (i4 > 1088) {
            vESize2.width = (((sqrt * 1088) / i4) >> 4) << 4;
            vESize2.height = 1088;
        }
        C84092WzQ c84092WzQ = this.LIZIZ;
        VESize vESize3 = this.LJ;
        c84092WzQ.changeVideoOutputSize(vESize3.width, vESize3.height);
        LIZIZ(this.LIZJ.getDuetAudioPath());
        LIZJ(this.LIZJ.getDuetVideoPath());
        LJIILJJIL();
        long endFrameTime = this.LIZIZ.getEndFrameTime();
        this.LIZIZ.seekTrack(this.LJI, 1, endFrameTime);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("add aTrack: ");
        V10.LJFF(LIZ, this.LJI, ", seek time=", endFrameTime);
        P4Q.LJFF("TEDuetProxy", X1D.LIZIZ(LIZ));
        LJIILL();
        LJIILLIIL(this.LIZJ.getDuetLayout());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Track bg=");
        C15890jp.LIZIZ(LIZ2, this.LJFF, ", left=", 0, ", right=");
        LIZ2.append(this.LJII);
        LIZ2.append(", src size=");
        LIZ2.append(this.LIZLLL.width);
        LIZ2.append("x");
        LIZ2.append(this.LIZLLL.height);
        LIZ2.append(", dst size=");
        LIZ2.append(this.LJ.width);
        LIZ2.append("x");
        C01R.LIZJ(LIZ2, this.LJ.height, LIZ2, "TEDuetProxy");
    }

    @Override // X.X02
    public void onDestroy() {
        int i = this.LJIIIZ;
        if (i >= 0) {
            this.LIZIZ.LIZ.removeTrackFilter(i);
            this.LJIIIZ = -1;
        }
        int i2 = this.LJIIIIZZ;
        if (i2 >= 0) {
            this.LIZIZ.LIZ.removeTrackFilter(i2);
            this.LJIIIIZZ = -1;
        }
        this.LIZIZ.LJIILIIL(1, this.LJI, true);
        this.LIZIZ.LJIILIIL(0, this.LJII, true);
        int i3 = this.LJFF;
        if (i3 >= 0) {
            this.LIZIZ.LJIILIIL(0, i3, true);
            this.LJFF = -1;
        }
        this.LIZIZ.removeRecorderStateListener(this);
        C84092WzQ c84092WzQ = this.LIZIZ;
        VESize vESize = this.LIZLLL;
        c84092WzQ.changeVideoOutputSize(vESize.width, vESize.height);
        this.LIZIZ = null;
        synchronized (this) {
            this.LIZ = null;
        }
        P4Q.LJFF("TEDuetProxy", "onDestroy");
    }

    public C84091WzP() {
    }

    public final void LIZIZ(String str) {
        C82647Wc7 c82647Wc7 = new C82647Wc7();
        c82647Wc7.LIZ(str);
        c82647Wc7.LIZIZ();
        c82647Wc7.LIZJ(0);
        c82647Wc7.LIZLLL(-1);
        EnumC82648Wc8 enumC82648Wc8 = EnumC82648Wc8.External;
        VETrackParams vETrackParams = c82647Wc7.LIZ;
        vETrackParams.trackPriority = enumC82648Wc8;
        this.LJI = this.LIZIZ.LIZJ(1, vETrackParams, true);
    }

    public final void LIZJ(String str) {
        C82647Wc7 c82647Wc7 = new C82647Wc7();
        c82647Wc7.LIZ(str);
        c82647Wc7.LIZIZ();
        c82647Wc7.LIZJ(0);
        c82647Wc7.LIZLLL(-1);
        int i = LJIIJ()[1];
        VETrackParams vETrackParams = c82647Wc7.LIZ;
        vETrackParams.layer = i;
        vETrackParams.trackPriority = EnumC82648Wc8.External;
        this.LJII = this.LIZIZ.LIZJ(0, vETrackParams, true);
        long endFrameTime = this.LIZIZ.getEndFrameTime();
        this.LIZIZ.seekTrack(this.LJII, 0, endFrameTime);
        LJIILIIL(this.LJII);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("add vTrack: ");
        V10.LJFF(LIZ, this.LJII, ", seek time=", endFrameTime);
        P4Q.LJFF("TEDuetProxy", X1D.LIZIZ(LIZ));
    }

    @Override // X.X02
    public final void LIZLLL(float f) {
        float f2 = 1.0f / f;
        this.LIZIZ.setTrackSpeed(this.LJI, 1, f2);
        this.LIZIZ.setTrackSpeed(this.LJII, 0, f2);
    }

    public void LJIIIZ(Message message) {
        int i = message.what;
        int i2 = message.arg2;
        if (i == VEInfo.TE_INFO_MULTIPLE_TRACK_EOF && Integer.MIN_VALUE == (i2 & LiveLayoutPreloadThreadPriority.DEFAULT)) {
            int i3 = i2 & Integer.MAX_VALUE;
            if (1 != 0) {
                synchronized (this) {
                    Runnable runnable = this.LIZ;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("timeInMS=");
                LIZ.append(i3);
                LIZ.append(", eof=");
                LIZ.append(true);
                P4Q.LJFF("TEDuetProxy", X1D.LIZIZ(LIZ));
            }
        }
    }

    public final void LJIIJJI(Runnable runnable) {
        synchronized (this) {
            this.LIZ = runnable;
        }
    }

    public void LJIILIIL(int i) {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.filterName = "canvas blend";
        vEVideoTransformFilterParam.scaleFactor = 1.0f;
        vEVideoTransformFilterParam.transX = 0.25f;
        vEVideoTransformFilterParam.alpha = 1.0f;
        int i2 = this.LJIIJ;
        if (i2 >= 0) {
            this.LIZIZ.LIZ.updateTrackFilterParam(i2, vEVideoTransformFilterParam);
        } else {
            this.LJIIJ = this.LIZIZ.LIZ.addTrackFilter(0, i, vEVideoTransformFilterParam, -1, -1);
        }
    }

    public void LJIIIIZZ(String str, String str2) {
        this.LIZIZ.LJIILIIL(1, this.LJI, true);
        this.LIZIZ.LJIILIIL(0, this.LJII, true);
        LIZIZ(str2);
        LIZJ(str);
        LJIILJJIL();
    }

    public C84091WzP(C84092WzQ c84092WzQ, VEDuetSettings vEDuetSettings, VESize vESize) {
        this.LIZIZ = c84092WzQ;
        this.LIZJ = vEDuetSettings;
        this.LIZLLL = new VESize(vESize.width, vESize.height);
    }

    @Override // X.X0L
    public final void onInfo(int i, int i2, String str) {
        IDHandlerS24S0100000_14 iDHandlerS24S0100000_14 = this.LJIIJJI;
        iDHandlerS24S0100000_14.sendMessageAtFrontOfQueue(iDHandlerS24S0100000_14.obtainMessage(i, i, i2, str));
    }
}
