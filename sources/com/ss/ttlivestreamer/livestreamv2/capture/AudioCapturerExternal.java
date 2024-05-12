package com.ss.ttlivestreamer.livestreamv2.capture;

import android.os.Handler;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class AudioCapturerExternal extends AudioCapturer {
    public int m;
    public AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    public int mBitwidth;
    public int mChannel;
    public Handler mHandler;
    public int mSampleHZ;
    public long mStartTimestamp;
    public Object mStopFence = new Object();
    public boolean mStart = false;
    public int mSize = 0;
    public ByteBuffer mByteBuffer10ms = ByteBuffer.allocateDirect(4096);

    /* loaded from: classes12.dex */
    public interface AudioCaptureObserver {
        void onError(int i, Exception exc);

        void onStarted();

        void onStoped();
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return 1;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public synchronized void stop() {
        synchronized (this.mStopFence) {
            this.mStart = false;
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void start() {
        nativeAdaptedOutputFormat(this.mSampleHZ, this.mChannel, this.mBitwidth);
        synchronized (this.mStopFence) {
            this.mStart = true;
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mChannel;
    }

    public AudioCapturerExternal(int i, int i2, int i3, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mAudioCaptureObserver = audioCaptureObserver;
        this.mSampleHZ = i;
        this.mChannel = i2;
        this.mBitwidth = i3;
        this.mHandler = handler;
    }

    public void onData(final Buffer buffer, final int i, final int i2, final int i3, final long j) {
        Handler handler = this.mHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.AudioCapturerExternal.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_AudioCapturerExternal$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_AudioCapturerExternal$1__run$___twin___() {
                    AudioCapturerExternal.this.nativeOnData(buffer, i, i2, i3, j);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_AudioCapturerExternal$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_capture_AudioCapturerExternal$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            nativeOnData(buffer, i, i2, i3, j);
        }
    }

    private void adjustBufferTo10MsAndSend(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        ByteBuffer byteBuffer2;
        int i5 = ((i2 * i) / 100) * 2;
        byteBuffer.position(0);
        int i6 = i4 * 2;
        if (byteBuffer.capacity() < i6) {
            return;
        }
        if (i5 > this.mSize) {
            int position = this.mByteBuffer10ms.position();
            if (position > 0) {
                byteBuffer2 = ByteBuffer.allocate(position);
                this.mByteBuffer10ms.position(0);
                this.mByteBuffer10ms.limit(position);
                byteBuffer2.put(this.mByteBuffer10ms);
            } else {
                byteBuffer2 = null;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i5);
            this.mByteBuffer10ms = allocateDirect;
            allocateDirect.position(0);
            this.mSize = i5;
            if (byteBuffer2 != null) {
                byteBuffer2.position(0);
                this.mByteBuffer10ms.put(byteBuffer2);
            }
        }
        if (this.mByteBuffer10ms.position() + i6 >= i5) {
            this.mStartTimestamp = j / 1000;
            boolean z = true;
            int i7 = 0;
            do {
                int position2 = this.mByteBuffer10ms.position();
                byteBuffer.position(i7);
                if (position2 > 0) {
                    int i8 = i5 - position2;
                    byteBuffer.limit(i8);
                    this.mByteBuffer10ms.put(byteBuffer.slice());
                    this.mByteBuffer10ms.position(0);
                    this.mByteBuffer10ms.limit(i5);
                    this.mByteBuffer10ms.limit(this.mSize);
                    this.mByteBuffer10ms.position(0);
                    onData(byteBuffer.slice(), i / 100, i, i2, this.mStartTimestamp * 1000);
                    i7 += i8;
                    byteBuffer.limit(i6);
                } else if (i6 - i7 > i5) {
                    byteBuffer.limit(i5);
                    onData(byteBuffer.slice(), i / 100, i, i2, this.mStartTimestamp * 1000);
                    i7 += i5;
                } else {
                    byteBuffer.limit(i6);
                    this.mByteBuffer10ms.put(byteBuffer.slice());
                    z = false;
                }
                this.mStartTimestamp += 10;
            } while (z);
        }
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        ByteBuffer byteBuffer2;
        if (this.mStart) {
            if (!byteBuffer.isDirect()) {
                byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.capacity());
                byteBuffer.position(0);
                byteBuffer2.put(byteBuffer);
                byteBuffer2.position(0);
            } else {
                byteBuffer2 = byteBuffer;
            }
            onData(byteBuffer2, i4 / i2, i, i2, j);
            return 0;
        }
        return -1;
    }
}
