package com.ss.android.ugc.aweme.ftc.countdown;

import X.InterfaceC61312at;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FTCCountdownState implements InterfaceC61312at {
    public final long maxDuration;
    public final String musicPath;
    public final long sdkRecordTime;
    public final long startTime;
    public final UrlModel taps;
    public final long totalTime;
    public final AVMusicWaveBean waveInfo;

    public static /* synthetic */ FTCCountdownState copy$default(FTCCountdownState fTCCountdownState, String str, UrlModel urlModel, long j, long j2, long j3, long j4, AVMusicWaveBean aVMusicWaveBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fTCCountdownState.musicPath;
        }
        if ((i & 2) != 0) {
            urlModel = fTCCountdownState.taps;
        }
        if ((i & 4) != 0) {
            j = fTCCountdownState.sdkRecordTime;
        }
        if ((i & 8) != 0) {
            j2 = fTCCountdownState.startTime;
        }
        if ((i & 16) != 0) {
            j3 = fTCCountdownState.totalTime;
        }
        if ((i & 32) != 0) {
            j4 = fTCCountdownState.maxDuration;
        }
        if ((i & 64) != 0) {
            aVMusicWaveBean = fTCCountdownState.waveInfo;
        }
        return fTCCountdownState.copy(str, urlModel, j, j2, j3, j4, aVMusicWaveBean);
    }

    public final FTCCountdownState copy(String str, UrlModel urlModel, long j, long j2, long j3, long j4, AVMusicWaveBean aVMusicWaveBean) {
        return new FTCCountdownState(str, urlModel, j, j2, j3, j4, aVMusicWaveBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCCountdownState)) {
            return false;
        }
        FTCCountdownState fTCCountdownState = (FTCCountdownState) obj;
        return o.LJ(this.musicPath, fTCCountdownState.musicPath) && o.LJ(this.taps, fTCCountdownState.taps) && this.sdkRecordTime == fTCCountdownState.sdkRecordTime && this.startTime == fTCCountdownState.startTime && this.totalTime == fTCCountdownState.totalTime && this.maxDuration == fTCCountdownState.maxDuration && o.LJ(this.waveInfo, fTCCountdownState.waveInfo);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FTCCountdownState(musicPath=");
        LIZ.append(this.musicPath);
        LIZ.append(", taps=");
        LIZ.append(this.taps);
        LIZ.append(", sdkRecordTime=");
        LIZ.append(this.sdkRecordTime);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", totalTime=");
        LIZ.append(this.totalTime);
        LIZ.append(", maxDuration=");
        LIZ.append(this.maxDuration);
        LIZ.append(", waveInfo=");
        LIZ.append(this.waveInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.musicPath;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        UrlModel urlModel = this.taps;
        if (urlModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = urlModel.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.maxDuration, JBR.LIZJ(this.totalTime, JBR.LIZJ(this.startTime, JBR.LIZJ(this.sdkRecordTime, (i2 + hashCode2) * 31, 31), 31), 31), 31);
        AVMusicWaveBean aVMusicWaveBean = this.waveInfo;
        if (aVMusicWaveBean != null) {
            i = aVMusicWaveBean.hashCode();
        }
        return LIZJ + i;
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final long getSdkRecordTime() {
        return this.sdkRecordTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final UrlModel getTaps() {
        return this.taps;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public final AVMusicWaveBean getWaveInfo() {
        return this.waveInfo;
    }

    public FTCCountdownState(String str, UrlModel urlModel, long j, long j2, long j3, long j4, AVMusicWaveBean aVMusicWaveBean) {
        this.musicPath = str;
        this.taps = urlModel;
        this.sdkRecordTime = j;
        this.startTime = j2;
        this.totalTime = j3;
        this.maxDuration = j4;
        this.waveInfo = aVMusicWaveBean;
    }
}
