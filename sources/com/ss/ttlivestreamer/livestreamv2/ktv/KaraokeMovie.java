package com.ss.ttlivestreamer.livestreamv2.ktv;

import X.C16880lQ;
import com.ss.ttlivestreamer.core.player.AVPlayerBase;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttlivestreamer.core.player.TTPlayerHelper;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class KaraokeMovie extends MoviePlayer {
    public static final String TAG = C16880lQ.LJLLJ(KaraokeMovie.class);
    public IAudioFilterManager mAudioFilterMgr;
    public boolean mMute;
    public TTPlayerHelper.NativeAudioSink mNativeAudioSink;
    public boolean mReportFirstVideoFrame;
    public boolean mStop;

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void enableAGC(boolean z) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public boolean isEnableAGC() {
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void prepare() {
        this.mReportFirstVideoFrame = true;
        super.prepare();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public synchronized void release() {
        super.release();
        TTPlayerHelper.NativeAudioSink nativeAudioSink = this.mNativeAudioSink;
        if (nativeAudioSink != null) {
            nativeAudioSink.setAudioSink(null);
            this.mNativeAudioSink = null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void stop() {
        this.mStop = true;
        TTPlayerHelper.NativeAudioSink nativeAudioSink = this.mNativeAudioSink;
        if (nativeAudioSink != null) {
            nativeAudioSink.closeAudio(true);
        }
        super.stop();
        IAudioFilterManager iAudioFilterManager = this.mAudioFilterMgr;
        if (iAudioFilterManager != null && (iAudioFilterManager instanceof LiveCoreKaraokFilter)) {
            ((LiveCoreKaraokFilter) iAudioFilterManager).setKaraokeMovieMode(null);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void start() {
        TTPlayerHelper.NativeAudioSink nativeAudioSink = this.mNativeAudioSink;
        if (nativeAudioSink != null) {
            nativeAudioSink.closeAudio(false);
        }
        super.start();
        IAudioFilterManager iAudioFilterManager = this.mAudioFilterMgr;
        if (iAudioFilterManager != null && (iAudioFilterManager instanceof LiveCoreKaraokFilter)) {
            ((LiveCoreKaraokFilter) iAudioFilterManager).setKaraokeMovieMode(this);
        }
        this.mStop = false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public boolean isMute() {
        return this.mMute;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void enableAudioMixer(boolean z) {
        IAudioFilterManager iAudioFilterManager = this.mAudioFilterMgr;
        if (iAudioFilterManager != null) {
            iAudioFilterManager.setMixerEnable(z);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void mute(boolean z) {
        this.mMute = z;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void setDataSource(String str) {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null) {
            iAVPlayer.setDataSource(this.mBuilder.getContext(), str);
            if (iAVPlayer instanceof AVPlayerBase) {
                AVPlayerBase aVPlayerBase = (AVPlayerBase) iAVPlayer;
                if (this.mNativeAudioSink == null) {
                    TTPlayerHelper.NativeAudioSink createAudioPlayer = TTPlayerHelper.createAudioPlayer(this.mBuilder.getAudioSampleHZ(), this.mBuilder.getAudioChannel());
                    if (!aVPlayerBase.setExternalNativeAudioRender(createAudioPlayer.getNativeObject())) {
                        createAudioPlayer.release();
                    } else {
                        this.mNativeAudioSink = createAudioPlayer;
                    }
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void setVolume(float f) {
        IAudioFilterManager iAudioFilterManager = this.mAudioFilterMgr;
        if (iAudioFilterManager != null) {
            iAudioFilterManager.setBGMVolume(f);
        }
    }

    public KaraokeMovie(LiveCore liveCore, IAVPlayer iAVPlayer) {
        super(liveCore, iAVPlayer);
        this.mReportFirstVideoFrame = true;
        this.mAudioFilterMgr = liveCore.getAudioFilterMgr();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer
    public void reportFirstVideoFrame(int i, float[] fArr, long j) {
        if (this.mReportFirstVideoFrame) {
            this.mReportFirstVideoFrame = false;
            onInfo(7, 0L, (String) null);
            super.reportFirstVideoFrame(i, fArr, j);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer, com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public boolean readAudioBufferByKaraoke(ByteBuffer byteBuffer, int i, int i2, int i3) {
        TTPlayerHelper.NativeAudioSink nativeAudioSink = this.mNativeAudioSink;
        if (nativeAudioSink == null || nativeAudioSink.readAudioBuffer(byteBuffer, i, i2, i3) != i3 || this.mMute) {
            return false;
        }
        return true;
    }
}
