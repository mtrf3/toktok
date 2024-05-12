package com.byted.cast.mediacommon.render;

import android.view.Surface;
import com.byted.cast.mediacommon.render.parameters.AudioParameter;
import com.byted.cast.mediacommon.render.parameters.MediaParameter;
import com.byted.cast.mediacommon.render.parameters.VideoParameter;

/* loaded from: classes29.dex */
public interface IMediaRender {
    MediaRenderState getAudioState(int i);

    Object getParameter(MediaParameter mediaParameter);

    MediaRenderState getVideoState(int i);

    void init(String str);

    void sendAVStream(byte[] bArr);

    void sendAudioPacket(int i, byte[] bArr, long j);

    void sendVideoPacket(int i, byte[] bArr, long j);

    void setAudioFrameListener(IAudioFrameListener iAudioFrameListener);

    void setAudioParameter(int i, AudioParameter audioParameter);

    void setParameter(MediaParameter mediaParameter, Object obj);

    void setSurface(int i, Surface surface);

    void setUrl(String str);

    void setVideoFrameListener(IVideoFrameListener iVideoFrameListener);

    void setVideoParameter(int i, VideoParameter videoParameter);

    boolean startAudioPlayer(int i);

    boolean startVideoPlayer(int i);

    boolean stopAudioPlayer(int i);

    boolean stopVideoPlayer(int i);
}
