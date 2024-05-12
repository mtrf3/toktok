package com.byted.cast.mediacommon;

import android.media.projection.MediaProjection;
import android.view.Surface;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.mediacommon.MediaSetting;

/* loaded from: classes29.dex */
public interface IMediaRecorder {
    void addMediaRecorderCallback(IMediaRecorderCallback iMediaRecorderCallback);

    void addSurface(Surface surface, MediaSetting.FILL_TYPE fill_type, boolean z);

    void changeSurfaceFillType(MediaSetting.FILL_TYPE fill_type);

    void enableAudioMix(boolean z);

    void enableSetMaxFps(boolean z);

    Surface getInputSurface();

    boolean getPicture(String str);

    void insertFrame();

    void pause();

    void prepareVideoEncoder();

    void release();

    void removeMediaRecorderCallback(IMediaRecorderCallback iMediaRecorderCallback);

    void removeSurface(Surface surface);

    void requestIDR();

    void requestMediaRecord();

    void resume();

    void setAudioCert(Object obj);

    void setAudioEnable(boolean z);

    void setAudioMixScale(int i);

    void setAudioSource(int i);

    void setAudioStopCert(Object obj);

    void setBitrateKps(int i);

    void setCaptureSource(MediaSetting.VIDEO_SOURCE_TYPE video_source_type);

    void setDisplay(int i, int i2, int i3, int i4);

    void setFlashEnable(boolean z);

    void setInputSurfaceListener(ISurfaceListener iSurfaceListener);

    void setMediaProjection(MediaProjection mediaProjection);

    void setPreviewSurface(Surface surface);

    void setResizeScreen(boolean z);

    void setSeparateAudio(boolean z);

    void setVideoCodecID(MediaSetting.VCODEC_ID vcodec_id);

    void setVirtualDisplayFlag(int i);

    void setVirtualDisplayName(String str);

    void setVirtualDisplayWH(int i, int i2);

    boolean start();

    void startSaveRecorder(String str);

    void stop();

    void stopSaveRecorder();

    void switchCamera(String str);
}
