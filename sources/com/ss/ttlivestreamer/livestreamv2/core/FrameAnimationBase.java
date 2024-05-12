package com.ss.ttlivestreamer.livestreamv2.core;

import android.graphics.RectF;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.core.LayerControl;

/* loaded from: classes12.dex */
public class FrameAnimationBase {
    public long mAnimationTimeMs;
    public boolean mContinue;
    public int mCurrentAnimationFrameIndex;
    public VideoMixer.VideoMixerDescription mCurrentDescription;
    public RectF mCurrentRect;
    public int mFps;
    public LayerControl.Layer mLayer;
    public RectF mTargetRect;
    public int mTotalFrames;
    public int mType;

    public void calculation() {
        this.mTotalFrames = (int) ((((float) this.mAnimationTimeMs) / 1000.0f) * this.mFps);
    }

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

    public int getType() {
        return this.mType;
    }

    public boolean valid() {
        return this.mContinue;
    }

    public void update(VideoFrame videoFrame) {
        int i = this.mCurrentAnimationFrameIndex + 1;
        this.mCurrentAnimationFrameIndex = i;
        if (i >= this.mTotalFrames) {
            this.mContinue = false;
        }
    }

    public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        videoMixerDescription.setMode(2);
        videoMixerDescription.setzOrder(2147483646);
        AVLog.w("FrameAnimationBase", this.mCurrentRect.toShortString());
        this.mLayer.updateDescription(videoMixerDescription);
    }

    public void update(VideoMixer.VideoMixerTexture videoMixerTexture) {
        update((VideoFrame) null);
    }

    public FrameAnimationBase(int i, LayerControl.Layer layer, long j, RectF rectF, int i2) {
        this.mType = i;
        this.mLayer = layer;
        this.mAnimationTimeMs = j;
        this.mFps = i2;
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        this.mCurrentDescription = videoMixerDescription;
        videoMixerDescription.copy(this.mLayer.getLayerDescription());
        this.mTargetRect = rectF;
        VideoMixer.VideoMixerDescription videoMixerDescription2 = this.mCurrentDescription;
        this.mCurrentRect = new RectF(videoMixerDescription2.left, videoMixerDescription2.top, videoMixerDescription2.right, videoMixerDescription2.bottom);
        calculation();
    }
}
