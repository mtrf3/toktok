package com.ss.android.ugc.aweme.shortvideo.countdown;

import X.InterfaceC61312at;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class CountdownState implements InterfaceC61312at {
    public final boolean isUgcTemplateFromAnchor;
    public final long maxDuration;
    public final String musicPath;
    public final long sdkRecordTime;
    public final long startTime;
    public final UrlModel taps;
    public final long totalTime;
    public final AVMusicWaveBean waveInfo;

    public static /* synthetic */ CountdownState copy$default(CountdownState countdownState, String str, UrlModel urlModel, long j, long j2, long j3, long j4, boolean z, AVMusicWaveBean aVMusicWaveBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countdownState.musicPath;
        }
        if ((i & 2) != 0) {
            urlModel = countdownState.taps;
        }
        if ((i & 4) != 0) {
            j = countdownState.sdkRecordTime;
        }
        if ((i & 8) != 0) {
            j2 = countdownState.startTime;
        }
        if ((i & 16) != 0) {
            j3 = countdownState.totalTime;
        }
        if ((i & 32) != 0) {
            j4 = countdownState.maxDuration;
        }
        if ((i & 64) != 0) {
            z = countdownState.isUgcTemplateFromAnchor;
        }
        if ((i & 128) != 0) {
            aVMusicWaveBean = countdownState.waveInfo;
        }
        return countdownState.copy(str, urlModel, j, j2, j3, j4, z, aVMusicWaveBean);
    }

    public final CountdownState copy(String str, UrlModel urlModel, long j, long j2, long j3, long j4, boolean z, AVMusicWaveBean aVMusicWaveBean) {
        return new CountdownState(str, urlModel, j, j2, j3, j4, z, aVMusicWaveBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownState)) {
            return false;
        }
        CountdownState countdownState = (CountdownState) obj;
        return o.LJ(this.musicPath, countdownState.musicPath) && o.LJ(this.taps, countdownState.taps) && this.sdkRecordTime == countdownState.sdkRecordTime && this.startTime == countdownState.startTime && this.totalTime == countdownState.totalTime && this.maxDuration == countdownState.maxDuration && this.isUgcTemplateFromAnchor == countdownState.isUgcTemplateFromAnchor && o.LJ(this.waveInfo, countdownState.waveInfo);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CountdownState(musicPath=");
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
        LIZ.append(", isUgcTemplateFromAnchor=");
        LIZ.append(this.isUgcTemplateFromAnchor);
        LIZ.append(", waveInfo=");
        LIZ.append(this.waveInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        boolean z = this.isUgcTemplateFromAnchor;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LIZJ + i3) * 31;
        AVMusicWaveBean aVMusicWaveBean = this.waveInfo;
        if (aVMusicWaveBean != null) {
            i = aVMusicWaveBean.hashCode();
        }
        return i4 + i;
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

    public final boolean isUgcTemplateFromAnchor() {
        return this.isUgcTemplateFromAnchor;
    }

    public CountdownState(String str, UrlModel urlModel, long j, long j2, long j3, long j4, boolean z, AVMusicWaveBean aVMusicWaveBean) {
        this.musicPath = str;
        this.taps = urlModel;
        this.sdkRecordTime = j;
        this.startTime = j2;
        this.totalTime = j3;
        this.maxDuration = j4;
        this.isUgcTemplateFromAnchor = z;
        this.waveInfo = aVMusicWaveBean;
    }
}
