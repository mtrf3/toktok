package com.ss.ttlivestreamer.livestreamv2.core;

import android.graphics.RectF;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.livestreamv2.core.LayerControl;

/* loaded from: classes12.dex */
public class FrameAnimationGradualRect extends FrameAnimationBase {
    public RectF mScaleRatio;

    @Override // com.ss.ttlivestreamer.livestreamv2.core.FrameAnimationBase
    public void calculation() {
        super.calculation();
        RectF rectF = this.mTargetRect;
        float f = rectF.left;
        RectF rectF2 = this.mCurrentRect;
        float f2 = f - rectF2.left;
        int i = this.mTotalFrames;
        this.mScaleRatio = new RectF(f2 / i, (rectF.top - rectF2.top) / i, (rectF.right - rectF2.right) / i, (rectF.bottom - rectF2.bottom) / i);
        this.mContinue = true;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.FrameAnimationBase
    public void update(VideoFrame videoFrame) {
        super.update(videoFrame);
        if (valid()) {
            RectF rectF = this.mCurrentRect;
            float f = rectF.left;
            RectF rectF2 = this.mScaleRatio;
            float f2 = f + rectF2.left;
            rectF.left = f2;
            float f3 = rectF.top + rectF2.top;
            rectF.top = f3;
            float f4 = rectF.right + rectF2.right;
            rectF.right = f4;
            float f5 = rectF.bottom + rectF2.bottom;
            rectF.bottom = f5;
            if (f2 < 0.0f) {
                rectF.left = 0.0f;
            }
            if (f4 > 1.0f) {
                rectF.right = 1.0f;
            }
            if (f3 < 0.0f) {
                rectF.top = 0.0f;
            }
            if (f5 > 1.0f) {
                rectF.bottom = 1.0f;
            }
            VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
            videoMixerDescription.copy(this.mCurrentDescription);
            RectF rectF3 = this.mCurrentRect;
            videoMixerDescription.left = rectF3.left;
            videoMixerDescription.top = rectF3.top;
            videoMixerDescription.right = rectF3.right;
            videoMixerDescription.bottom = rectF3.bottom;
            updateDescription(videoMixerDescription);
        }
    }

    public FrameAnimationGradualRect(int i, LayerControl.Layer layer, long j, RectF rectF, int i2) {
        super(i, layer, j, rectF, i2);
    }
}
