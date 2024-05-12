package com.ss.ttlivestreamer.livestreamv2;

import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.utils.AdaptResolutionUtils;

/* loaded from: classes12.dex */
public class LiveStreamGpuTurboWrapper {
    public static final TEFrameSizei upSamplingSize = new TEFrameSizei(720, 1280);
    public boolean isGpuTurboEnabled;
    public boolean lastGpuTurboEnabled;
    public boolean isEnable = true;
    public final TEFrameSizei downSamplingSize = new TEFrameSizei(480, 854);
    public final TEFrameSizei adaptedSize = new TEFrameSizei();
    public final TEFrameSizei captureSize = new TEFrameSizei();

    private boolean meedSampling() {
        TEFrameSizei tEFrameSizei = this.adaptedSize;
        if (is720P(tEFrameSizei.width, tEFrameSizei.height)) {
            TEFrameSizei tEFrameSizei2 = this.captureSize;
            if (is720P(tEFrameSizei2.width, tEFrameSizei2.height) && this.adaptedSize.width == this.captureSize.width) {
                return true;
            }
        }
        return false;
    }

    public int getDownSamplingHeight() {
        return this.downSamplingSize.height;
    }

    public int getDownSamplingWidth() {
        return this.downSamplingSize.width;
    }

    public int getSRResolutionHeight() {
        return upSamplingSize.height;
    }

    public int getSRResolutionWidth() {
        return upSamplingSize.width;
    }

    public boolean isGpuTurboEnabled() {
        if (this.isEnable && this.isGpuTurboEnabled) {
            return true;
        }
        return false;
    }

    private boolean isGpuTurboEnabled(IFilterManager iFilterManager) {
        IVideoEffectProcessor videoEffectProcessor;
        boolean z = false;
        if (iFilterManager == null || (videoEffectProcessor = iFilterManager.getVideoEffectProcessor()) == null) {
            return false;
        }
        if (iFilterManager.isEnable() && iFilterManager.isValid() && videoEffectProcessor.isEffectGpuTurboEnable()) {
            z = true;
        }
        DebugLogUtils.isEnableDebugLog();
        return z;
    }

    public void setEnabled(boolean z) {
        this.isEnable = z;
    }

    public static boolean is720P(int i, int i2) {
        TEFrameSizei tEFrameSizei = upSamplingSize;
        if (i == tEFrameSizei.width && i2 == tEFrameSizei.height) {
            return true;
        }
        return false;
    }

    public void initAdaptSize(int i, int i2) {
        TEFrameSizei tEFrameSizei = this.adaptedSize;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
    }

    public void initCaptureSize(int i, int i2) {
        TEFrameSizei tEFrameSizei = this.captureSize;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
    }

    public synchronized void refreshEffectSRStatus(IFilterManager iFilterManager, AdaptResolutionUtils adaptResolutionUtils, boolean z) {
        boolean z2 = false;
        if (z) {
            this.isGpuTurboEnabled = false;
            this.lastGpuTurboEnabled = false;
            adaptResolutionUtils.reset();
            TEFrameSizei tEFrameSizei = this.adaptedSize;
            int i = tEFrameSizei.width;
            int i2 = tEFrameSizei.height;
            TEFrameSizei tEFrameSizei2 = this.captureSize;
            adaptResolutionUtils.refreshAdaptFormat(i, i2, tEFrameSizei2.width, tEFrameSizei2.height, this, true);
        } else if (this.isEnable) {
            if (isGpuTurboEnabled(iFilterManager) && meedSampling()) {
                z2 = true;
            }
            this.isGpuTurboEnabled = z2;
            if (z2 != this.lastGpuTurboEnabled) {
                TEFrameSizei tEFrameSizei3 = this.adaptedSize;
                int i3 = tEFrameSizei3.width;
                int i4 = tEFrameSizei3.height;
                TEFrameSizei tEFrameSizei4 = this.captureSize;
                adaptResolutionUtils.refreshAdaptFormat(i3, i4, tEFrameSizei4.width, tEFrameSizei4.height, this, false);
            }
            this.lastGpuTurboEnabled = this.isGpuTurboEnabled;
        }
    }
}
