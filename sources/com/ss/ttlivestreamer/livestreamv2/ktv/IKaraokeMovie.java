package com.ss.ttlivestreamer.livestreamv2.ktv;

import android.view.View;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public interface IKaraokeMovie {

    /* loaded from: classes12.dex */
    public interface Listener {
        void onKaraokeError(int i, Exception exc);

        void onKaraokeInfo(int i, long j, String str);
    }

    void enableAGC(boolean z);

    void enableAudioMixer(boolean z);

    VideoSink getCameraVideoSink();

    long getCurrentPlaybackTimeMs();

    int getDurationMs();

    IAVPlayer.MetaData getMetadata();

    IAVPlayer getPlayer();

    VideoMixer.VideoMixerDescription getVideoMixerDescription(int i);

    VideoTrack getVideoTrack();

    boolean isEnableAGC();

    boolean isLoop();

    boolean isMirror();

    boolean isMute();

    void mute(boolean z);

    void pause();

    void prepare();

    boolean readAudioBufferByKaraoke(ByteBuffer byteBuffer, int i, int i2, int i3);

    void release();

    void seek(long j);

    void setAutoFillAspectRatioOnFit(boolean z);

    void setDataSource(String str);

    void setDisplay(View view);

    void setListener(Listener listener);

    void setLoop(boolean z);

    void setMirror(boolean z);

    void setRenderMode(boolean z);

    void setVideoMixerDescription(int i, VideoMixer.VideoMixerDescription videoMixerDescription);

    void setVolume(float f);

    void start();

    void stop();
}
