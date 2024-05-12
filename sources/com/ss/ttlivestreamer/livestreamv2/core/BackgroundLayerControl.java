package com.ss.ttlivestreamer.livestreamv2.core;

import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import com.ss.ttlivestreamer.livestreamv2.core.LayerControl;

/* loaded from: classes12.dex */
public class BackgroundLayerControl implements LayerControl.LayerChangeListener {
    public VideoMixer.VideoMixerTexture mBackgroundMixerTexture;
    public final ILayerControl mLayerControl;
    public final IPlanarRenderCheck mPlanarRenderCheck;

    /* loaded from: classes12.dex */
    public interface IPlanarRenderCheck {
        boolean isPlanarRender();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LayerControl.LayerChangeListener
    public void onLayerAdded() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LayerControl.LayerChangeListener
    public void onLayerUpdated() {
    }

    public void setBackgroundTexture(VideoMixer.VideoMixerTexture videoMixerTexture) {
        this.mBackgroundMixerTexture = videoMixerTexture;
    }

    public BackgroundLayerControl(ILayerControl iLayerControl, IPlanarRenderCheck iPlanarRenderCheck) {
        this.mLayerControl = iLayerControl;
        this.mPlanarRenderCheck = iPlanarRenderCheck;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LayerControl.LayerChangeListener
    public void onLayerRender(int i, boolean z) {
        ILayerControl.ILayer layer = this.mLayerControl.getLayer("single_view_background");
        if (this.mPlanarRenderCheck.isPlanarRender() && (layer instanceof LayerControl.Layer) && z && layer.getLayerDescription().isVisible()) {
            VideoMixer.VideoMixerDescription FILL = VideoMixer.VideoMixerDescription.FILL();
            FILL.zOrder = -1;
            VideoMixer.VideoMixerTexture videoMixerTexture = this.mBackgroundMixerTexture;
            if (videoMixerTexture != null && videoMixerTexture.getWidth() > 0 && this.mBackgroundMixerTexture.getHeight() > 0) {
                float height = (this.mBackgroundMixerTexture.getHeight() * 1.0f) / this.mBackgroundMixerTexture.getWidth();
                float canvasHeight = (this.mLayerControl.getCanvasHeight() * 1.0f) / this.mLayerControl.getCanvasWidth();
                if (height < canvasHeight) {
                    FILL.bottom = (((this.mBackgroundMixerTexture.getHeight() * 1.0f) / this.mBackgroundMixerTexture.getWidth()) * this.mLayerControl.getCanvasWidth()) / this.mLayerControl.getCanvasHeight();
                } else {
                    FILL.bottom = height / canvasHeight;
                }
            }
            layer.updateDescription(FILL);
            ((LayerControl.Layer) layer).renderFrame(this.mBackgroundMixerTexture);
        }
    }
}
