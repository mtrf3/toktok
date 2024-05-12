package com.ss.avframework.livestreamv2.core.interact.video;

import android.view.SurfaceView;
import android.view.TextureView;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public interface VideoSink {
    String getInteractId();

    SurfaceView getSurfaceView();

    int getTextureID();

    TextureView getTextureView();

    VideoFrameRenderer getVideoFrameRender();

    boolean isValid();

    void onByteBufferVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, Config.VideoOutputFormat videoOutputFormat, int i, int i2, int i3, int i4, long j);

    void onTextureVideoFrame(int i, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, float[] fArr, int i4, long j);

    void setFitMode(boolean z);

    void setRenderAble(boolean z);
}
