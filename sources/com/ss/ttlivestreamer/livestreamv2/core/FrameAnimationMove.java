package com.ss.ttlivestreamer.livestreamv2.core;

import X.X1D;
import android.graphics.RectF;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.core.LayerControl;

/* loaded from: classes12.dex */
public class FrameAnimationMove extends FrameAnimationBase {
    public float mDeltaXPerFrame;
    public float mDeltaYPerFrame;

    public void updateRect(RectF rectF) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.FrameAnimationBase
    public void calculation() {
        int i;
        float centerX = this.mTargetRect.centerX() - this.mCurrentRect.centerX();
        float centerY = this.mTargetRect.centerY() - this.mCurrentRect.centerY();
        if ((centerX != 0.0f || centerY != 0.0f) && (i = this.mTotalFrames) != 0) {
            this.mDeltaXPerFrame = centerX / i;
            this.mDeltaYPerFrame = centerY / i;
            this.mContinue = true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mDeltaXPerFrame ");
        LIZ.append(this.mDeltaXPerFrame);
        LIZ.append(" mDeltaYPerFrame ");
        LIZ.append(this.mDeltaYPerFrame);
        LIZ.append(" deltaX ");
        LIZ.append(centerX);
        LIZ.append(" deltaY ");
        LIZ.append(centerY);
        LIZ.append(" fps ");
        LIZ.append(this.mFps);
        LIZ.append(" totalFrames ");
        LIZ.append(this.mTotalFrames);
        LIZ.append(" continue ");
        LIZ.append(this.mContinue);
        AVLog.ioi("FrameAnimationMove", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.FrameAnimationBase
    public void restore() {
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        videoMixerDescription.copy(this.mCurrentDescription);
        RectF rectF = this.mTargetRect;
        videoMixerDescription.left = rectF.left;
        videoMixerDescription.top = rectF.top;
        videoMixerDescription.right = rectF.right;
        videoMixerDescription.bottom = rectF.bottom;
        updateDescription(videoMixerDescription);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.FrameAnimationBase
    public void update(VideoFrame videoFrame) {
        this.mCurrentAnimationFrameIndex++;
        if (valid()) {
            this.mCurrentRect.offset(this.mDeltaXPerFrame, this.mDeltaYPerFrame);
            VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
            updateRect(this.mCurrentRect);
            videoMixerDescription.copy(this.mCurrentDescription);
            RectF rectF = this.mCurrentRect;
            videoMixerDescription.left = rectF.left;
            videoMixerDescription.top = rectF.top;
            videoMixerDescription.right = rectF.right;
            videoMixerDescription.bottom = rectF.bottom;
            updateDescription(videoMixerDescription);
        }
        if (this.mCurrentAnimationFrameIndex >= this.mTotalFrames) {
            this.mContinue = false;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.FrameAnimationBase
    public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        videoMixerDescription.setMode(2);
        AVLog.w("FrameAnimationMove", this.mCurrentRect.toShortString());
        this.mLayer.updateDescription(videoMixerDescription);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.FrameAnimationBase
    public void update(VideoMixer.VideoMixerTexture videoMixerTexture) {
        update((VideoFrame) null);
    }

    public FrameAnimationMove(int i, LayerControl.Layer layer, long j, RectF rectF, int i2) {
        super(i, layer, j, rectF, i2);
    }
}
