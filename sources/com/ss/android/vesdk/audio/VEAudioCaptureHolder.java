package com.ss.android.vesdk.audio;

import X.C06460Ne;
import X.C63877P5d;
import X.P4F;
import X.P4Q;
import X.P5Z;
import X.Q4K;
import X.V0N;
import X.X1D;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEInfo;

/* loaded from: classes12.dex */
public enum VEAudioCaptureHolder implements P4F {
    INSTANCE;

    public P4F mAudioDataInterface;
    public boolean mFeedPcm = true;
    public C63877P5d mPresenter;
    public VEAudioEncodeSettings mVEAudioEncodeSettings;

    public void startFeedPCM() {
        this.mFeedPcm = true;
    }

    public void stopFeedPCM() {
        this.mFeedPcm = false;
    }

    public static VEAudioCaptureHolder valueOf(String str) {
        return (VEAudioCaptureHolder) V0N.LJJJ(VEAudioCaptureHolder.class, str);
    }

    @Override // X.P4F
    public void onReceive(VEAudioSample vEAudioSample) {
        if (this.mPresenter == null) {
            P4Q.LIZJ("AudioCaptureHolder", "onReceiver error: please set buffer consumer, before init AudioCapture");
            return;
        }
        if (!this.mFeedPcm) {
            P4Q.LJFF("AudioCaptureHolder", "pcm feed stop");
            return;
        }
        if (vEAudioSample.getSampleBuffer() instanceof P5Z) {
            C63877P5d c63877P5d = this.mPresenter;
            vEAudioSample.getByteSize();
            vEAudioSample.getTimeStamp();
            c63877P5d.getClass();
            return;
        }
        P4F p4f = this.mAudioDataInterface;
        if (p4f == null) {
            return;
        }
        p4f.onReceive(vEAudioSample);
    }

    public void setAudioEncodeSettings(VEAudioEncodeSettings vEAudioEncodeSettings) {
        this.mVEAudioEncodeSettings = vEAudioEncodeSettings;
    }

    VEAudioCaptureHolder() {
    }

    public void setAudioBufferConsumer(C63877P5d c63877P5d, P4F p4f) {
        this.mPresenter = c63877P5d;
        this.mAudioDataInterface = p4f;
    }

    @Override // X.P4F
    public void onError(int i, int i2, String str) {
        StringBuilder LIZJ = C06460Ne.LIZJ("errType", i, "ret:", i2, "msg:");
        LIZJ.append(str);
        P4Q.LJFF("AudioCaptureHolder", X1D.LIZIZ(LIZJ));
    }

    @Override // X.P4F
    public void onInfo(int i, int i2, double d, Object obj) {
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
            P4F p4f = this.mAudioDataInterface;
            if (p4f != null) {
                p4f.onInfo(i, i2, d, obj);
            }
            if (i2 == 0) {
                VEAudioCaptureSettings vEAudioCaptureSettings = (VEAudioCaptureSettings) obj;
                if (this.mVEAudioEncodeSettings == null) {
                    P4Q.LIZJ("AudioCaptureHolder", "please set VEAudioEncodeSettings, before init AudioCapture");
                    return;
                }
                C63877P5d c63877P5d = this.mPresenter;
                if (c63877P5d == null) {
                    P4Q.LIZJ("AudioCaptureHolder", "please set buffer consumer, before init AudioCapture");
                    return;
                }
                vEAudioCaptureSettings.getSampleRate();
                vEAudioCaptureSettings.getChannel();
                this.mVEAudioEncodeSettings.getSampleRate();
                this.mVEAudioEncodeSettings.getChannelCount();
                this.mVEAudioEncodeSettings.getBps();
                c63877P5d.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mVEAudioCapture inited: channelCount:");
                LIZ.append(vEAudioCaptureSettings.getChannel());
                LIZ.append(" sampleHz:");
                LIZ.append(vEAudioCaptureSettings.getSampleRate());
                LIZ.append(" encode sample rate:");
                LIZ.append(this.mVEAudioEncodeSettings.getSampleRate());
                LIZ.append(" encode channel count:");
                LIZ.append(this.mVEAudioEncodeSettings.getChannelCount());
                P4Q.LJFF("AudioCaptureHolder", X1D.LIZIZ(LIZ));
            } else {
                Q4K.LJ("initAudio error:", i2, "AudioCaptureHolder");
            }
            if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
                this.mFeedPcm = true;
            }
        }
    }
}
