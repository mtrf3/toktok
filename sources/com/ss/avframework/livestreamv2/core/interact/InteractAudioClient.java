package com.ss.avframework.livestreamv2.core.interact;

import X.X1D;
import android.util.AndroidRuntimeException;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioCallback;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioClient;
import com.ss.avframework.livestreamv2.core.interact.statistic.Statistics;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public class InteractAudioClient implements AudioClient, ILiveStream.IAudioFrameAvailableListener {
    public AudioCallback mAudioCallback;
    public int mChannel;
    public long mLastLogTime;
    public int mSampleHz;
    public boolean mStart;
    public Statistics mStatics = new Statistics(1000);

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void release() {
        this.mAudioCallback = null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void stop() {
        this.mStart = false;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void start() {
        AudioCallback audioCallback = this.mAudioCallback;
        if (audioCallback != null) {
            audioCallback.onAudioWarning("");
        }
        this.mStart = true;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public Statistics getStatistics() {
        return this.mStatics;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void prepare(AudioCallback audioCallback) {
        this.mAudioCallback = audioCallback;
    }

    public InteractAudioClient(int i, int i2) {
        this.mChannel = i;
        this.mSampleHz = i2;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        long j2;
        Statistics statistics = this.mStatics;
        if (statistics != null) {
            j2 = System.currentTimeMillis();
        } else {
            j2 = 0;
        }
        AudioCallback audioCallback = this.mAudioCallback;
        if (this.mStart) {
            if (audioCallback != null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.mLastLogTime > 10000) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Input interact audio frame: sample_rate ");
                    LIZ.append(i2);
                    LIZ.append(", channel ");
                    LIZ.append(i3);
                    AVLog.ioi("InteractAudioClient", X1D.LIZIZ(LIZ));
                    this.mLastLogTime = currentTimeMillis;
                }
                if (this.mChannel == i3 && this.mSampleHz == i2) {
                    audioCallback.updateAudioFrame(buffer, i, j);
                } else {
                    throw new AndroidRuntimeException("Interact client BUG!");
                }
            }
        } else if (audioCallback != null) {
            audioCallback.onAudioWarning("AudioClient no start.");
        }
        if (statistics != null) {
            statistics.add(System.currentTimeMillis() - j2);
        }
    }
}
