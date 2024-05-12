package com.ss.ttlivestreamer.core.capture.video;

import X.C16880lQ;
import X.C63816P2u;
import X.KMP;
import X.P35;
import X.Q0C;
import X.X1D;
import android.content.Intent;
import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.os.Build;
import com.bytedance.bpea.basics.Cert;
import com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.TokenCertConfigUtils;

/* loaded from: classes12.dex */
public class ScreenVideoCaptureWithInnerRecord extends ScreenVideoCapturer {
    public int SCREEN_VIDEO_CAPTURE_INNER_AUDIO_ERROR;
    public boolean enableStereoCapture;
    public AudioRecord mAudioRecord;
    public AudioRecordThread mAudioRecordThread;
    public int mMaxAudioRecordRestartCount;
    public int mRetryCount;

    @Override // com.ss.ttlivestreamer.core.capture.video.ScreenVideoCapturer, com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        Cert cert;
        AVLog.logKibana(4, "ScreenVideoCaptureWithInnerRecord", "release()", null);
        AudioRecord audioRecord = this.mAudioRecord;
        this.mAudioRecord = null;
        if (audioRecord != null) {
            TokenCertConfigUtils.TokenCertExtra cert2 = TokenCertConfigUtils.getInstance().getCert(TokenCertConfigUtils.CertType.AUDIO_STOP);
            if (cert2 == null) {
                cert = null;
            } else {
                cert = cert2.getCert();
            }
            try {
                C63816P2u.LIZ.getClass();
                P35.LIZIZ(audioRecord, cert);
            } catch (Q0C e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AudioRecord.release failed(ScreenVideoCaptureWithInnerRecord.release): ");
                LIZ.append(e.getMessage());
                AVLog.logKibana(6, "ScreenVideoCaptureWithInnerRecord", X1D.LIZIZ(LIZ), e);
            }
        }
        this.mAudioRecordThread = null;
        super.release();
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.ScreenVideoCapturer, com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void stop() {
        Cert cert = null;
        AVLog.logKibana(4, "ScreenVideoCaptureWithInnerRecord", "stop()", null);
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord != null) {
            TokenCertConfigUtils.TokenCertExtra cert2 = TokenCertConfigUtils.getInstance().getCert(TokenCertConfigUtils.CertType.AUDIO_STOP);
            if (cert2 != null) {
                cert = cert2.getCert();
            }
            try {
                C63816P2u.LIZ.getClass();
                P35.LIZLLL(audioRecord, cert);
            } catch (Q0C e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AudioRecord.stop failed(ScreenVideoCaptureWithInnerRecord.stop): ");
                LIZ.append(e.getMessage());
                AVLog.logKibana(6, "ScreenVideoCaptureWithInnerRecord", X1D.LIZIZ(LIZ), e);
            } catch (IllegalStateException e2) {
                C16880lQ.LLLLIIL(e2);
                TTLSSladarBugReportUtils.getInstance().report(e2, "ScreenVideoCaptureWithInnerRecord.stop#AudioRecord.stop");
            }
        }
        AudioRecordThread audioRecordThread = this.mAudioRecordThread;
        if (audioRecordThread != null) {
            audioRecordThread.stop();
        }
        super.stop();
    }

    private void startAudioPlayBack(Cert cert) {
        int i;
        if (this.mediaProjection == null || this.mAudioRecord != null || this.mAudioRecordThread != null) {
            return;
        }
        if (this.enableStereoCapture) {
            i = 12;
        } else {
            i = 16;
        }
        int minBufferSize = AudioRecord.getMinBufferSize(44100, i, 2);
        if (minBufferSize != -1 && minBufferSize != -2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioRecord.getMinBufferSize: ");
            LIZ.append(minBufferSize);
            AVLog.d("ScreenVideoCaptureWithInnerRecord", X1D.LIZIZ(LIZ));
            AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(this.mediaProjection);
            builder.addMatchingUsage(14);
            builder.addMatchingUsage(1);
            AudioRecord build = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(44100).setChannelMask(i).build()).setBufferSizeInBytes(minBufferSize).setAudioPlaybackCaptureConfig(builder.build()).build();
            this.mAudioRecord = build;
            try {
                C63816P2u.LIZ.getClass();
                P35.LIZJ(build, cert);
            } catch (Q0C e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("AudioRecord.startRecording failed(ScreenVideoCaptureWithInnerRecord.startAudioPlayBack): ");
                LIZ2.append(e.getMessage());
                AVLog.logKibana(6, "ScreenVideoCaptureWithInnerRecord", X1D.LIZIZ(LIZ2), e);
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread(this.mAudioRecord, 0);
            this.mAudioRecordThread = audioRecordThread;
            audioRecordThread.start();
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("AudioRecord.getMinBufferSize failed: ");
        LIZ3.append(minBufferSize);
        AVLog.logKibana(6, "ScreenVideoCaptureWithInnerRecord", X1D.LIZIZ(LIZ3), null);
        throw new IllegalStateException(KMP.LJ("AudioRecord.getMinBufferSize failed: ", minBufferSize));
    }

    public void enableScreenAudioStereoCapture(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableScreenAudioStereoCapture: ");
        LIZ.append(z);
        AVLog.logKibana(4, "ScreenVideoCaptureWithInnerRecord", X1D.LIZIZ(LIZ), null);
        this.enableStereoCapture = z;
    }

    public ScreenVideoCaptureWithInnerRecord(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
        super(intent, videoCapturerObserver);
        this.mMaxAudioRecordRestartCount = 10;
        this.SCREEN_VIDEO_CAPTURE_INNER_AUDIO_ERROR = -207;
    }

    public void setAudioPlayBackObserver(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, Cert cert) {
        int i;
        if (Build.VERSION.SDK_INT >= 29) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setAudioPlayBackObserver: ");
            if (iAudioRecordThreadObserver == null) {
                i = 0;
            } else {
                i = 1;
            }
            LIZ.append(i);
            AVLog.logKibana(4, "ScreenVideoCaptureWithInnerRecord", X1D.LIZIZ(LIZ), null);
            if (iAudioRecordThreadObserver != null) {
                try {
                    startAudioPlayBack(cert);
                } catch (Exception e) {
                    int i2 = this.mRetryCount;
                    this.mRetryCount = i2 + 1;
                    if (i2 < this.mMaxAudioRecordRestartCount) {
                        setAudioPlayBackObserver(iAudioRecordThreadObserver, cert);
                        AVLog.logKibana(5, "ScreenVideoCaptureWithInnerRecord", "try restart audioRecord", e);
                        return;
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("ScreenVideoCaptureWithInnerRecordError,code:");
                        LIZ2.append(this.SCREEN_VIDEO_CAPTURE_INNER_AUDIO_ERROR);
                        AVLog.logKibana(5, "ScreenVideoCaptureWithInnerRecord", X1D.LIZIZ(LIZ2), e);
                        return;
                    }
                }
            }
            AudioRecordThread audioRecordThread = this.mAudioRecordThread;
            if (audioRecordThread != null) {
                audioRecordThread.setAudioDataObserver(iAudioRecordThreadObserver);
            }
        }
    }
}
