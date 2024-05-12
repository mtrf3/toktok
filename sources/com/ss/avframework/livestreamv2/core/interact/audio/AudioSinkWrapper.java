package com.ss.avframework.livestreamv2.core.interact.audio;

import X.C16880lQ;
import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper;
import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TTLSThreadConfigHelper;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class AudioSinkWrapper {
    public boolean bBufferCleared;
    public boolean inited;
    public AudioSink mAudioSink;
    public AudioSinkFactory mAudioSinkFactory;
    public byte[] mBuffer;
    public int mChannelCount;
    public long mFetchCount;
    public int mIntervalMs;
    public RTCEngineWrapper mRTCEngineWrapper;
    public int mSampleRate;
    public long mStartTimeMs;
    public boolean started;
    public Thread thread;

    public void release() {
        AudioSink audioSink;
        AVLog.debugTrace(new Object[0]);
        this.inited = false;
        this.started = false;
        Thread thread = this.thread;
        if (thread != null) {
            try {
                thread.join(300L);
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
            this.thread = null;
        }
        AudioSinkFactory audioSinkFactory = this.mAudioSinkFactory;
        if (audioSinkFactory != null && (audioSink = this.mAudioSink) != null) {
            audioSinkFactory.destroy(audioSink);
            this.mAudioSink = null;
        }
    }

    public void start() {
        AVLog.debugTrace(new Object[0]);
        if (this.inited && !this.started) {
            this.started = true;
            final String str = "ByteRtcAudioSinkThread";
            PthreadThread pthreadThread = new PthreadThread(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_audio_AudioSinkWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_audio_AudioSinkWrapper$1__run$___twin___() {
                    Process.setThreadPriority(TTLSThreadConfigHelper.getPriority(str, 0));
                    while (true) {
                        AudioSinkWrapper audioSinkWrapper = AudioSinkWrapper.this;
                        if (audioSinkWrapper.inited && audioSinkWrapper.started) {
                            long currentTimeMs = TimeUtils.currentTimeMs();
                            AudioSinkWrapper audioSinkWrapper2 = AudioSinkWrapper.this;
                            long j = (audioSinkWrapper2.mFetchCount * audioSinkWrapper2.mIntervalMs) + audioSinkWrapper2.mStartTimeMs;
                            if (Math.abs(currentTimeMs - j) > 500) {
                                AudioSinkWrapper audioSinkWrapper3 = AudioSinkWrapper.this;
                                audioSinkWrapper3.mStartTimeMs = currentTimeMs;
                                audioSinkWrapper3.mFetchCount = 0L;
                            } else {
                                currentTimeMs = j;
                            }
                            AudioSinkWrapper.this.FetchAudioFrame(currentTimeMs);
                            AudioSinkWrapper audioSinkWrapper4 = AudioSinkWrapper.this;
                            long j2 = audioSinkWrapper4.mFetchCount + 1;
                            audioSinkWrapper4.mFetchCount = j2;
                            long currentTimeMs2 = ((j2 * audioSinkWrapper4.mIntervalMs) + audioSinkWrapper4.mStartTimeMs) - TimeUtils.currentTimeMs();
                            if (currentTimeMs2 > 0) {
                                try {
                                    Thread.sleep(currentTimeMs2);
                                } catch (InterruptedException e) {
                                    C16880lQ.LLLLIIL(e);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_audio_AudioSinkWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_avframework_livestreamv2_core_interact_audio_AudioSinkWrapper$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, "AudioSinkWrapper");
            this.thread = pthreadThread;
            pthreadThread.setName("ByteRtcAudioSinkThread");
            this.thread.start();
        }
    }

    public void stop() {
        AVLog.debugTrace(new Object[0]);
        if (this.inited && this.started) {
            this.started = false;
            try {
                this.thread.join(300L);
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
            this.thread = null;
        }
    }

    public void FetchAudioFrame(long j) {
        AudioSampleRate audioSampleRate;
        AudioChannel audioChannel;
        int i = this.mSampleRate;
        int i2 = (this.mIntervalMs * i) / 1000;
        int i3 = this.mChannelCount;
        int i4 = i2 * i3 * 2;
        byte[] bArr = this.mBuffer;
        if (bArr == null || bArr.length < i4) {
            this.mBuffer = new byte[i4];
            this.bBufferCleared = true;
        }
        if (i != 8000) {
            if (i != 16000) {
                if (i != 32000) {
                    if (i != 44100) {
                        if (i != 48000) {
                            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_16000;
                        } else {
                            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_48000;
                        }
                    } else {
                        audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_44100;
                    }
                } else {
                    audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_32000;
                }
            } else {
                audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_16000;
            }
        } else {
            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_8000;
        }
        if (i3 != -1) {
            if (i3 != 2) {
                audioChannel = AudioChannel.AUDIO_CHANNEL_MONO;
            } else {
                audioChannel = AudioChannel.AUDIO_CHANNEL_STEREO;
            }
        } else {
            audioChannel = AudioChannel.AUDIO_CHANNEL_AUTO;
        }
        AudioFrame audioFrame = new AudioFrame();
        audioFrame.buffer = this.mBuffer;
        audioFrame.samples = i2;
        audioFrame.sampleRate = audioSampleRate;
        audioFrame.channel = audioChannel;
        if (this.mRTCEngineWrapper.getRtcEngine() != null) {
            this.mRTCEngineWrapper.getRtcEngine().pullExternalAudioFrame(audioFrame);
        }
        this.bBufferCleared = false;
        AudioSink audioSink = this.mAudioSink;
        if (audioSink != null) {
            audioSink.onPlaybackAudioFrame(ByteBuffer.wrap(audioFrame.buffer), audioFrame.samples, this.mSampleRate, this.mChannelCount, j);
        }
    }

    public void setRenderAble(boolean z) {
        AudioSink audioSink = this.mAudioSink;
        if (audioSink != null) {
            audioSink.setRenderAble(z);
        }
    }

    public AudioSinkWrapper(AudioSinkFactory audioSinkFactory, RTCEngineWrapper rTCEngineWrapper) {
        this.mSampleRate = 16000;
        this.mChannelCount = 1;
        this.mIntervalMs = 10;
        AVLog.debugTrace(new Object[0]);
        this.mAudioSinkFactory = audioSinkFactory;
        if (audioSinkFactory != null) {
            this.mSampleRate = audioSinkFactory.getSampleRate();
            this.mChannelCount = this.mAudioSinkFactory.getChannelCount();
            this.mIntervalMs = this.mAudioSinkFactory.getIntervalMs();
            this.mAudioSink = this.mAudioSinkFactory.create(null);
        }
        this.mRTCEngineWrapper = rTCEngineWrapper;
        this.inited = true;
    }
}
