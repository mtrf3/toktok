package com.ss.ttlivestreamer.livestreamv2.core;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.livestreamv2.RenderView;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;

/* loaded from: classes12.dex */
public interface ILayerControlExt extends ILayerControl {

    /* loaded from: classes12.dex */
    public interface ILayerExt extends ILayerControl.ILayer {
        int getMixerOutHeight();

        int getMixerOutWidth();

        void renderFrame(VideoFrame videoFrame);

        void renderFrame(VideoMixer.VideoMixerTexture videoMixerTexture);
    }

    ILayerExt createLayerExt(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i, int i2, int i3);

    RenderView getRenderView();

    VideoMixer getVideoMixer();

    boolean isFitMode();

    boolean isMirror(boolean z);

    void pause();

    boolean removeLayer(String str);

    void resume();

    void setFitMode(boolean z);

    void setLocalOrigin(String str);

    void setMirror(boolean z, boolean z2);
}
