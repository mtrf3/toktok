package com.byted.cast.render;

import android.view.Surface;
import com.byted.cast.mediacommon.render.IAudioFrameListener;
import com.byted.cast.mediacommon.render.IMediaRender;
import com.byted.cast.mediacommon.render.IVideoFrameListener;
import com.byted.cast.mediacommon.render.MediaRenderState;
import com.byted.cast.mediacommon.render.parameters.AudioParameter;
import com.byted.cast.mediacommon.render.parameters.MediaParameter;
import com.byted.cast.mediacommon.render.parameters.VideoParameter;
import com.byted.cast.render.imp.MediaRenderImp;

/* loaded from: classes29.dex */
public class MediaRender implements IMediaRender {
    public MediaRenderImp imp;

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public MediaRenderState getAudioState(int i) {
        return this.imp.getAudioState(i);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public Object getParameter(MediaParameter mediaParameter) {
        return this.imp.getParameter(mediaParameter);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public MediaRenderState getVideoState(int i) {
        return this.imp.getVideoState(i);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void init(String str) {
        if (this.imp == null) {
            this.imp = new MediaRenderImp(str);
        }
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void sendAVStream(byte[] bArr) {
        this.imp.sendAVStream(bArr);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void setAudioFrameListener(IAudioFrameListener iAudioFrameListener) {
        this.imp.setAudioFrameListener(iAudioFrameListener);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void setUrl(String str) {
        this.imp.setUrl(str);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void setVideoFrameListener(IVideoFrameListener iVideoFrameListener) {
        this.imp.setVideoFrameListener(iVideoFrameListener);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public boolean startAudioPlayer(int i) {
        return this.imp.startAudioPlayer(i);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public boolean startVideoPlayer(int i) {
        return this.imp.startVideoPlayer(i);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public boolean stopAudioPlayer(int i) {
        return this.imp.stopAudioPlayer(i);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public boolean stopVideoPlayer(int i) {
        return this.imp.stopVideoPlayer(i);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void setAudioParameter(int i, AudioParameter audioParameter) {
        this.imp.setAudioParameter(i, audioParameter);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void setParameter(MediaParameter mediaParameter, Object obj) {
        this.imp.setParameter(mediaParameter, obj);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void setSurface(int i, Surface surface) {
        this.imp.setSurface(i, surface);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void setVideoParameter(int i, VideoParameter videoParameter) {
        this.imp.setVideoParameter(i, videoParameter);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void sendAudioPacket(int i, byte[] bArr, long j) {
        this.imp.sendAudioPacket(i, bArr, j);
    }

    @Override // com.byted.cast.mediacommon.render.IMediaRender
    public void sendVideoPacket(int i, byte[] bArr, long j) {
        this.imp.sendVideoPacket(i, bArr, j);
    }
}
