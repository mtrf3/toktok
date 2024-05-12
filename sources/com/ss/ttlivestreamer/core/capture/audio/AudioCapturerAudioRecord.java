package com.ss.ttlivestreamer.core.capture.audio;

import X.C16880lQ;
import X.C63816P2u;
import X.KMP;
import X.P35;
import X.Q0C;
import X.X1D;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Build;
import com.bytedance.bpea.basics.Cert;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TokenCertConfigUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public class AudioCapturerAudioRecord extends AudioCapturer {
    public static String TAG = "AudioCapturerAudioRecord";
    public AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    public AudioRecord mAudioRecord;
    public int mAudioSource;
    public AudioRecordThread mAudioThread;
    public final int mBitWidth;
    public int mChannel;
    public boolean mPause;
    public List<AudioManager.AudioRecordingCallback> mRecordCallbackList;
    public final int mSample;
    public int mScreenAudioCaptureDelayMicPackage;
    public int mStat;

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private synchronized void releaseAllAudioRecordingCbs() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.mRecordCallbackList.size() != 0 && this.mAudioRecord != null) {
                Iterator<AudioManager.AudioRecordingCallback> it = this.mRecordCallbackList.iterator();
                while (it.hasNext()) {
                    this.mAudioRecord.unregisterAudioRecordingCallback(it.next());
                }
                this.mRecordCallbackList.clear();
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void pause() {
        this.mPause = true;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer, com.ss.ttlivestreamer.core.engine.AudioSource, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Release audioRecord ");
        LIZ.append(this);
        AVLog.iod(str, X1D.LIZIZ(LIZ));
        releaseAllAudioRecordingCbs();
        stop();
        super.release();
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void resume() {
        this.mPause = false;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public synchronized void stop() {
        Cert cert;
        String tag;
        AudioRecordThread audioRecordThread = this.mAudioThread;
        if (audioRecordThread != null) {
            audioRecordThread.stop();
            this.mAudioThread = null;
        }
        if (this.mAudioRecord != null) {
            TokenCertConfigUtils.TokenCertExtra cert2 = TokenCertConfigUtils.getInstance().getCert(TokenCertConfigUtils.CertType.AUDIO_STOP);
            if (cert2 == null) {
                cert = null;
                tag = "";
            } else {
                cert = cert2.getCert();
                tag = cert2.getTag();
            }
            try {
                AudioRecord audioRecord = this.mAudioRecord;
                C63816P2u.LIZ.getClass();
                P35.LIZLLL(audioRecord, cert);
                AVLog.iow(TAG, "AudioRecord stopped");
            } catch (Q0C | IllegalStateException e) {
                String str = TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AudioRecord.stop() error(");
                LIZ.append(tag);
                LIZ.append("): ");
                LIZ.append(e);
                AVLog.ioe(str, X1D.LIZIZ(LIZ));
                String str2 = TAG;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("AudioRecord.stop failed(AudioCaptureAudioRecord.stop): ");
                LIZ2.append(e.getMessage());
                AVLog.logKibana(6, str2, X1D.LIZIZ(LIZ2), e);
            }
            try {
                AudioRecord audioRecord2 = this.mAudioRecord;
                C63816P2u.LIZ.getClass();
                P35.LIZIZ(audioRecord2, cert);
            } catch (Q0C e2) {
                C16880lQ.LLLLIIL(e2);
                String str3 = TAG;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("AudioRecord released: error(");
                LIZ3.append(tag);
                LIZ3.append(")");
                AVLog.iow(str3, X1D.LIZIZ(LIZ3));
                String str4 = TAG;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("AudioRecord.release failed(AudioCaptureAudioRecord.stop): ");
                LIZ4.append(e2.getMessage());
                AVLog.logKibana(6, str4, X1D.LIZIZ(LIZ4), e2);
            }
            this.mAudioRecord = null;
            AVLog.iow(TAG, "AudioRecord released");
        }
        this.mAudioCaptureObserver = null;
        this.mStat = 2;
    }

    private void startRecording() {
        Cert cert;
        AVLog.d(TAG, "startRecording");
        try {
            TokenCertConfigUtils.TokenCertExtra cert2 = TokenCertConfigUtils.getInstance().getCert(TokenCertConfigUtils.CertType.AUDIO_START);
            if (cert2 == null) {
                cert = null;
            } else {
                cert = cert2.getCert();
            }
            AudioRecord audioRecord = this.mAudioRecord;
            C63816P2u.LIZ.getClass();
            P35.LIZJ(audioRecord, cert);
            if (this.mAudioRecord.getRecordingState() == 3) {
                AudioRecordThread audioRecordThread = new AudioRecordThread(this.mAudioRecord, this.mScreenAudioCaptureDelayMicPackage);
                this.mAudioThread = audioRecordThread;
                audioRecordThread.setAudioDataObserver(new AudioRecordThread.IAudioRecordThreadObserver() { // from class: com.ss.ttlivestreamer.core.capture.audio.AudioCapturerAudioRecord.1
                    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
                    public void onError(int i, Exception exc) {
                        AudioCapturer.AudioCaptureObserver audioCaptureObserver = AudioCapturerAudioRecord.this.mAudioCaptureObserver;
                        if (audioCaptureObserver != null) {
                            audioCaptureObserver.onAudioCaptureError(i, exc);
                        }
                    }

                    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
                    public void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
                        AudioCapturerAudioRecord audioCapturerAudioRecord = AudioCapturerAudioRecord.this;
                        if (!audioCapturerAudioRecord.mPause) {
                            audioCapturerAudioRecord.nativeOnData(byteBuffer, i, i2, i3, j);
                        }
                    }
                });
                this.mAudioThread.start();
                this.mStat = 1;
                AVLog.iow(TAG, "AudioRecord started");
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioRecord.startRecording failed - incorrect state :");
            LIZ.append(this.mAudioRecord.getRecordingState());
            IllegalStateException illegalStateException = new IllegalStateException(X1D.LIZIZ(LIZ));
            AVLog.w(TAG, illegalStateException.getMessage());
            AVLog.logKibana(6, TAG, illegalStateException.getMessage(), null);
            throw illegalStateException;
        } catch (Q0C | IllegalStateException e) {
            String str = TAG;
            StringBuilder LIZ2 = X1D.LIZ();
            AVLog.logKibana(6, str, KMP.LJFF(LIZ2, "AudioRecord.startRecording failed(AudioCaptureAudioRecord.startRecording): ", e, LIZ2), null);
            StringBuilder LIZ3 = X1D.LIZ();
            throw new IllegalStateException(KMP.LJFF(LIZ3, "AudioRecord.startRecording failed: ", e, LIZ3));
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void start() {
        int channelCountToConfiguration = channelCountToConfiguration(this.mChannel);
        int minBufferSize = AudioRecord.getMinBufferSize(this.mSample, channelCountToConfiguration, 2);
        Cert cert = null;
        if (minBufferSize != -1 && minBufferSize != -2) {
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioRecord.getMinBufferSize: ");
            LIZ.append(minBufferSize);
            AVLog.d(str, X1D.LIZIZ(LIZ));
            int max = Math.max(minBufferSize * 2, (this.mBitWidth / 8) * this.mChannel * (this.mSample / 100));
            String str2 = TAG;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("bufferSizeInBytes: ");
            LIZ2.append(max);
            AVLog.d(str2, X1D.LIZIZ(LIZ2));
            try {
                String str3 = TAG;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Using audio mode ");
                LIZ3.append(this.mAudioSource);
                LIZ3.append(" at AudioRecord ");
                LIZ3.append(this);
                AVLog.ioi(str3, X1D.LIZIZ(LIZ3));
                AudioRecord audioRecord = new AudioRecord(this.mAudioSource, this.mSample, channelCountToConfiguration, 2, max);
                this.mAudioRecord = audioRecord;
                if (audioRecord.getState() == 1) {
                    startRecording();
                    return;
                } else {
                    AVLog.logKibana(6, TAG, "Failed to create a new AudioRecord instance", null);
                    throw new IllegalStateException("Failed to create a new AudioRecord instance");
                }
            } catch (IllegalArgumentException e) {
                if (this.mChannel != 1) {
                    if (this.mAudioRecord != null) {
                        TokenCertConfigUtils.getInstance().saveAudioScene(TokenCertConfigUtils.SceneType.ERROR);
                        TokenCertConfigUtils.TokenCertExtra cert2 = TokenCertConfigUtils.getInstance().getCert(TokenCertConfigUtils.CertType.AUDIO_STOP);
                        if (cert2 != null) {
                            try {
                                cert = cert2.getCert();
                            } catch (Q0C e2) {
                                C16880lQ.LLLLIIL(e2);
                                String str4 = TAG;
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("AudioRecord.release failed(AudioCaptureAudioRecord.start): ");
                                LIZ4.append(e.getMessage());
                                AVLog.logKibana(6, str4, X1D.LIZIZ(LIZ4), e);
                                this.mChannel = 1;
                                AVLog.d(TAG, "AudioRecord trying mono...");
                                start();
                                return;
                            }
                        }
                        AudioRecord audioRecord2 = this.mAudioRecord;
                        C63816P2u.LIZ.getClass();
                        P35.LIZIZ(audioRecord2, cert);
                    }
                    this.mChannel = 1;
                    AVLog.d(TAG, "AudioRecord trying mono...");
                    start();
                    return;
                }
                String str5 = TAG;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("AudioRecord ctor error: ");
                LIZ5.append(e.getMessage());
                AVLog.logKibana(6, str5, X1D.LIZIZ(LIZ5), null);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("AudioRecord ctor error: ");
                LIZ6.append(e.getMessage());
                throw new IllegalStateException(X1D.LIZIZ(LIZ6));
            }
        }
        String str6 = TAG;
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("AudioRecord.getMinBufferSize failed: ");
        LIZ7.append(minBufferSize);
        AVLog.logKibana(6, str6, X1D.LIZIZ(LIZ7), null);
        throw new IllegalStateException(KMP.LJ("AudioRecord.getMinBufferSize failed: ", minBufferSize));
    }

    public int getAudioSource() {
        return this.mAudioSource;
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mChannel;
    }

    public synchronized void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        if (Build.VERSION.SDK_INT >= 29 && audioRecordingCallback != null && this.mAudioRecord != null) {
            if (!this.mRecordCallbackList.contains(audioRecordingCallback)) {
                return;
            }
            this.mRecordCallbackList.remove(audioRecordingCallback);
            this.mAudioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    public synchronized void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        if (Build.VERSION.SDK_INT >= 29 && audioRecordingCallback != null && this.mAudioRecord != null && executor != null) {
            if (this.mRecordCallbackList.contains(audioRecordingCallback)) {
                return;
            }
            this.mRecordCallbackList.add(audioRecordingCallback);
            this.mAudioRecord.registerAudioRecordingCallback(executor, audioRecordingCallback);
        }
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3) {
        this(1, i, i2, i3, null, 0);
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this(1, i, i2, i3, audioCaptureObserver, 0);
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3, int i4, AudioCapturer.AudioCaptureObserver audioCaptureObserver, int i5) {
        this.mRecordCallbackList = new ArrayList();
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Construct audioRecord ");
        LIZ.append(this);
        AVLog.iod(str, X1D.LIZIZ(LIZ));
        this.mStat = 0;
        this.mSample = i2;
        this.mChannel = i3;
        this.mBitWidth = i4;
        this.mAudioSource = i;
        this.mAudioCaptureObserver = audioCaptureObserver;
        this.mScreenAudioCaptureDelayMicPackage = i5;
        setMode(i);
        pause();
    }
}
