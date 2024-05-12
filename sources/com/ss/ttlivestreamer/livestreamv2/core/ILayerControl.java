package com.ss.ttlivestreamer.livestreamv2.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.livestreamv2.core.LayerControl;

/* loaded from: classes12.dex */
public interface ILayerControl {

    /* loaded from: classes12.dex */
    public interface CatchViewPic {
        void onError(Exception exc);

        void onSucceed(Bitmap bitmap);
    }

    /* loaded from: classes12.dex */
    public interface ILayer {
        void dispose();

        int getHeight();

        VideoMixer.VideoMixerDescription getLayerDescription();

        float getRealRatePerSeconds();

        int getWidth();

        boolean isEnable();

        Canvas lockCanvas();

        String name();

        void pause();

        void resume();

        void setAnimationMode(int i, long j, RectF rectF);

        void setEnable(boolean z);

        void setVisibility(int i);

        void unlockCanvasAndPost(Canvas canvas, long j);

        void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription);
    }

    void catchImage(float f, float f2, float f3, float f4, CatchViewPic catchViewPic);

    ILayer createLayer(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i, int i2);

    int getCanvasHeight();

    int getCanvasWidth();

    ILayer getLayer(String str);

    ILayer[] getLayers();

    ILayer getLocalOriginLayer();

    float getRealRenderFps();

    int layerSize();

    void reportLayerControlLayersInfo();

    void setEventListener(LayerControl.LayerEventListener layerEventListener);

    void setOriginTriggering(String str);

    void setPreViewFps(int i);
}
