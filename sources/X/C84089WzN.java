package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.filterparam.VEVideoEffectStreamFilterParam;
import com.ss.android.vesdk.model.VEPrePlayParams;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: X.WzN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84089WzN implements X02, X0L, ICH {
    public final C84092WzQ LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public long LJIIIIZZ;
    public ICQ LJIIJ;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public final Stack<Long> LJIIIZ = new Stack<>();
    public boolean LJII = false;

    @Override // X.X02
    public final synchronized void LIZ() {
        pause();
        if (this.LJIIIZ.isEmpty()) {
            this.LJIIIZ.push(0L);
        }
        this.LJIIIZ.push(Long.valueOf(this.LIZ.getEndFrameTime() - this.LJIIIIZZ));
    }

    @Override // X.X02
    public final synchronized void LJ() {
        P4Q.LJFF("TEVideoBGProxy", "tryRestore");
        this.LJII = false;
        if (this.LJ >= 0) {
            VEVolumeParam vEVolumeParam = new VEVolumeParam();
            vEVolumeParam.trackIndex = this.LJ;
            vEVolumeParam.bgmPlayVolume = 1.0f;
            this.LIZ.setVolume(vEVolumeParam);
        }
        start();
    }

    @Override // X.X0E
    public final void LJFF(int i) {
    }

    @Override // X.X0E
    public final void LJI(boolean z) {
    }

    @Override // X.X02
    public final synchronized void LJII() {
        long j;
        Long peek;
        try {
            this.LJIIIZ.pop();
            peek = this.LJIIIZ.peek();
        } catch (Exception unused) {
            P4Q.LJFF("TEVideoBGProxy", "Seek to 0");
        }
        if (peek != null) {
            j = peek.longValue();
            LJIILIIL(j);
        }
        j = 0;
        LJIILIIL(j);
    }

    public final synchronized void LJIILL() {
        LJIIIIZZ(this.LIZLLL);
        LJIIIZ(this.LIZJ);
        LJIILLIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setup v(");
        LIZ.append(this.LJFF);
        LIZ.append("), a(");
        LIZ.append(this.LJ);
        LIZ.append(")");
        P4Q.LJFF("TEVideoBGProxy", X1D.LIZIZ(LIZ));
        int alignTo = this.LIZ.alignTo(this.LJFF, 0, this.LJ, 1);
        start();
        int[] iArr = new int[12];
        if (VEConfigCenter.getInstance().getValue("ve_enable_titan_video_decode_opt", false).booleanValue() && TEVideoUtils.nativeGetFileInfo(this.LIZJ, iArr) != null) {
            this.LIZ.startPrePlay(new VEPrePlayParams(iArr[3], true));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("alignTo ret: ");
        LIZ2.append(alignTo);
        LIZ2.append(", duration: ");
        LIZ2.append(iArr[3]);
        P4Q.LJFF("TEVideoBGProxy", X1D.LIZIZ(LIZ2));
    }

    @Override // X.X02
    public final synchronized void onDestroy() {
        if (VEConfigCenter.getInstance().getValue("ve_enable_titan_video_decode_opt", false).booleanValue()) {
            this.LIZ.stopPrePlay(null);
        }
        LJIIJJI();
        this.LIZ.removeRecorderStateListener(this);
    }

    @Override // X.ICH
    public final synchronized void pause() {
        P4Q.LJFF("TEVideoBGProxy", "pause");
        if (VEConfigCenter.getInstance().getValue("ve_enable_titan_video_decode_opt", false).booleanValue()) {
            this.LIZ.stopPrePlay(null);
        }
        int i = this.LJ;
        if (i >= 0) {
            this.LIZ.pausePlayTrack(i, 1);
        } else {
            int i2 = this.LJFF;
            if (i2 >= 0) {
                this.LIZ.pausePlayTrack(i2, 0);
            }
        }
    }

    @Override // X.ICH
    public final synchronized void start() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start, aTrack=");
        LIZ.append(this.LJ);
        LIZ.append(", vTrack=");
        LIZ.append(this.LJFF);
        P4Q.LJFF("TEVideoBGProxy", X1D.LIZIZ(LIZ));
        int i = this.LJ;
        if (i >= 0) {
            this.LIZ.startPlayTrack(i, 1);
        } else {
            int i2 = this.LJFF;
            if (i2 >= 0) {
                this.LIZ.startPlayTrack(i2, 0);
            }
        }
    }

    public final void LJIIJJI() {
        int i = this.LJ;
        if (i >= 0) {
            this.LIZ.pausePlayTrack(i, 1);
            this.LIZ.LJIILIIL(1, this.LJ, true);
            this.LJ = -1;
        }
        int i2 = this.LJFF;
        if (i2 >= 0) {
            this.LIZ.pausePlayTrack(i2, 0);
            this.LIZ.LJIILIIL(0, this.LJFF, true);
            this.LJFF = -1;
            this.LJI = -1;
        }
    }

    public final void LJIILLIIL() {
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
        VETrackParams vETrackParams3 = c82647Wc7.LIZ;
        vETrackParams3.layer = 0;
        vETrackParams3.trackPriority = EnumC82648Wc8.HOST;
        this.LIZ.LJIIZILJ(0, 0, vETrackParams3, true);
    }

    @Override // X.X02
    public final void onCreate() {
        this.LIZ.addRecorderStateListener(this);
        LJIILL();
    }

    @Override // X.ICH
    public final synchronized void LIZIZ(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setEnableEffCtrl ");
        LIZ.append(z);
        P4Q.LJFF("TEVideoBGProxy", X1D.LIZIZ(LIZ));
    }

    @Override // X.ICH
    public final synchronized void LIZJ(ICF icf) {
        this.LJIIJ = icf;
        P4Q.LJFF("TEVideoBGProxy", "setVEOnVideoEOFListener");
    }

    @Override // X.X02
    public final synchronized void LIZLLL(float f) {
        if (!this.LJII) {
            this.LJII = true;
            LJIILIIL(0L);
        }
        start();
        this.LJIIIIZZ = this.LIZ.getEndFrameTime();
    }

    public final void LJIIIIZZ(String str) {
        C82647Wc7 c82647Wc7 = new C82647Wc7();
        c82647Wc7.LIZ(str);
        c82647Wc7.LIZIZ();
        c82647Wc7.LIZJ(0);
        c82647Wc7.LIZLLL(-1);
        EnumC82648Wc8 enumC82648Wc8 = EnumC82648Wc8.External;
        VETrackParams vETrackParams = c82647Wc7.LIZ;
        vETrackParams.trackPriority = enumC82648Wc8;
        int LIZJ = this.LIZ.LIZJ(1, vETrackParams, true);
        this.LJ = LIZJ;
        this.LIZ.seekTrack(LIZJ, 1, 0L);
    }

    public final void LJIIIZ(String str) {
        C82647Wc7 c82647Wc7 = new C82647Wc7();
        c82647Wc7.LIZ(str);
        c82647Wc7.LIZIZ();
        c82647Wc7.LIZJ(0);
        c82647Wc7.LIZLLL(-1);
        VETrackParams vETrackParams = c82647Wc7.LIZ;
        vETrackParams.layer = 1;
        vETrackParams.trackPriority = EnumC82648Wc8.External;
        int LIZJ = this.LIZ.LIZJ(0, vETrackParams, true);
        this.LJFF = LIZJ;
        this.LIZ.seekTrack(LIZJ, 0, 0L);
        int i = this.LJFF;
        VEVideoEffectStreamFilterParam vEVideoEffectStreamFilterParam = new VEVideoEffectStreamFilterParam();
        vEVideoEffectStreamFilterParam.streamFlags = 6;
        vEVideoEffectStreamFilterParam.extraString = this.LIZIZ;
        int i2 = this.LJI;
        if (i2 >= 0) {
            this.LIZ.LIZ.updateTrackFilterParam(i2, vEVideoEffectStreamFilterParam);
        } else {
            this.LJI = this.LIZ.LIZ.addTrackFilter(0, i, vEVideoEffectStreamFilterParam, -1, -1);
        }
    }

    public final synchronized void LJIIL(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeRecordBGM ");
        LIZ.append(i);
        P4Q.LJFF("TEVideoBGProxy", X1D.LIZIZ(LIZ));
    }

    public final synchronized void LJIILIIL(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("seek ");
        LIZ.append(j);
        P4Q.LJFF("TEVideoBGProxy", X1D.LIZIZ(LIZ));
        int i = this.LJ;
        if (i >= 0) {
            this.LIZ.seekTrack(i, 1, j);
        } else {
            int i2 = this.LJFF;
            if (i2 >= 0) {
                this.LIZ.seekTrack(i2, 0, j);
            }
        }
    }

    public final synchronized void LJIIZILJ(float f) {
        int i = this.LJ;
        if (i >= 0) {
            this.LIZ.setTrackSpeed(i, 1, 1.0f / f);
        }
        int i2 = this.LJFF;
        if (i2 >= 0) {
            this.LIZ.setTrackSpeed(i2, 0, 1.0f / f);
        }
    }

    public final synchronized void LJIILJJIL(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setRecordBGM , trackIndex=");
        LIZ.append(i);
        LIZ.append(",");
        LIZ.append(0);
        LIZ.append(", bgmPath=");
        LIZ.append(str);
        P4Q.LJFF("TEVideoBGProxy", X1D.LIZIZ(LIZ));
        if (VEConfigCenter.getInstance().getValue("ve_enable_titan_video_decode_opt", false).booleanValue()) {
            this.LIZ.stopPrePlay(null);
        }
        if (i < 0) {
            if (this.LJ < 0) {
                LJIIIIZZ(this.LIZLLL);
                this.LIZ.alignTo(this.LJFF, 0, this.LJ, 1);
            }
        } else {
            int i2 = this.LJ;
            if (i2 >= 0) {
                this.LIZ.pausePlayTrack(i2, 1);
                this.LIZ.LJIILIIL(1, this.LJ, true);
                this.LJ = -1;
                if (VEConfigCenter.getInstance().getValue("ve_enable_titan_multitrack_decode", false).booleanValue()) {
                    C84092WzQ c84092WzQ = this.LIZ;
                    c84092WzQ.LIZIZ.LJJIJIIJIL("SeparateVideoTrack", this.LJFF);
                } else {
                    this.LIZ.alignTo(this.LJFF, 0, 1, 0);
                }
            }
        }
    }

    public final synchronized void LJIIJ(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6 = this.LIZIZ;
        if ((str6 == str || (str6 != null && str6.equals(str))) && (((str4 = this.LIZJ) == str2 || (str4 != null && str4.equals(str2))) && ((str5 = this.LIZLLL) == str3 || (str5 != null && str5.equals(str3))))) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeVideo ");
        LIZ.append(str);
        LIZ.append(", vPath=");
        LIZ.append(str2);
        LIZ.append(", aPath=");
        LIZ.append(str3);
        P4Q.LJFF("TEVideoBGProxy", X1D.LIZIZ(LIZ));
        this.LJIIIZ.clear();
        this.LJII = false;
        LJIIJJI();
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        if (str2 != null && str3 != null) {
            LJIILL();
        }
    }

    @Override // X.X0L
    public final void onInfo(int i, int i2, String str) {
        boolean z;
        int i3;
        if (i == VEInfo.TE_INFO_MULTIPLE_TRACK_EOF) {
            if (Integer.MIN_VALUE == (i2 & LiveLayoutPreloadThreadPriority.DEFAULT)) {
                z = true;
            } else {
                z = false;
            }
            int i4 = i2 & Integer.MAX_VALUE;
            try {
                i3 = CastIntegerProtector.parseInt(str);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                i3 = -1;
            }
            synchronized (this) {
                if (i3 >= 0) {
                    if (this.LJFF == i3 && z) {
                        ICQ icq = this.LJIIJ;
                        if (icq != null) {
                            icq.LIZ();
                        }
                        LJIILIIL(0L);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("timeInMS=");
                        LIZ.append(i4);
                        LIZ.append(", eof=");
                        LIZ.append(z);
                        LIZ.append(", videoIndex=");
                        LIZ.append(i3);
                        P4Q.LJFF("TEVideoBGProxy", X1D.LIZIZ(LIZ));
                    }
                }
            }
        }
    }

    public C84089WzN(C84092WzQ c84092WzQ, String str, String str2, String str3) {
        this.LIZ = c84092WzQ;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        VEConfigCenter.getInstance().updateValue("ve_titan_hw_dec_res_min_side", -1);
    }
}
