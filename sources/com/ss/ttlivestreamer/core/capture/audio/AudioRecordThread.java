package com.ss.ttlivestreamer.core.capture.audio;

import X.C0NY;
import X.X1D;
import android.media.AudioRecord;
import android.os.Process;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.ByteBufferUtils;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import defpackage.i0;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public class AudioRecordThread implements Runnable {
    public int delayIndex;
    public AudioRecord mAudioRecord;
    public IAudioRecordThreadObserver mAudioRecordThreadObserver;
    public final ByteBuffer mByteBuffer;
    public final int mChannel;
    public SafeHandlerThread mDeliverThread;
    public final int mSample;
    public final int mScreenAudioCaptureDelayMicPackage;
    public volatile boolean keepAlive = true;
    public Deque<ByteBuffer> mQueue = new LinkedList();

    /* loaded from: classes12.dex */
    public interface IAudioRecordThreadObserver {
        void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        void onError(int i, Exception exc);
    }

    @Override // java.lang.Runnable
    public void run() {
        com_ss_ttlivestreamer_core_capture_audio_AudioRecordThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void com_ss_ttlivestreamer_core_capture_audio_AudioRecordThread__run$___twin___() {
        int i;
        Process.setThreadPriority(-19);
        long nativeNanoTime = TimeUtils.nativeNanoTime() / 1000;
        while (this.keepAlive) {
            try {
                AudioRecord audioRecord = this.mAudioRecord;
                ByteBuffer byteBuffer = this.mByteBuffer;
                i = audioRecord.read(byteBuffer, byteBuffer.capacity());
            } catch (Throwable unused) {
                i = -3;
            }
            if (i == this.mByteBuffer.capacity()) {
                IAudioRecordThreadObserver iAudioRecordThreadObserver = this.mAudioRecordThreadObserver;
                Deque<ByteBuffer> deque = this.mQueue;
                if (this.mScreenAudioCaptureDelayMicPackage > 0 && deque != null) {
                    ByteBuffer clone = ByteBufferUtils.clone(this.mByteBuffer);
                    int i2 = this.delayIndex;
                    this.delayIndex = i2 + 1;
                    if (i2 < this.mScreenAudioCaptureDelayMicPackage) {
                        ByteBuffer allocate = ByteBuffer.allocate(this.mByteBuffer.capacity());
                        while (allocate.hasRemaining()) {
                            allocate.put((byte) 0);
                        }
                        allocate.flip();
                        deque.addFirst(allocate);
                    }
                    deque.addLast(clone);
                    this.mByteBuffer.rewind();
                    this.mByteBuffer.put(deque.poll());
                }
                if (iAudioRecordThreadObserver != null) {
                    ByteBuffer byteBuffer2 = this.mByteBuffer;
                    int i3 = this.mSample;
                    iAudioRecordThreadObserver.onData(byteBuffer2, i3 / 100, i3, this.mChannel, nativeNanoTime);
                }
                nativeNanoTime += 10000;
            } else {
                AVLog.e("AudioRecordThread", "AudioRecord.read failed: " + i);
                if (i == -3) {
                    this.keepAlive = false;
                    AVLog.e("AudioRecordThread", "AudioRecord read error, invalid operation");
                    IAudioRecordThreadObserver iAudioRecordThreadObserver2 = this.mAudioRecordThreadObserver;
                    if (iAudioRecordThreadObserver2 != null) {
                        iAudioRecordThreadObserver2.onError(-302, new Exception("AudioRecord read error, invalid operation"));
                    }
                }
                AudioRecord audioRecord2 = this.mAudioRecord;
                if (audioRecord2 != null) {
                    String LIZIZ = C0NY.LIZIZ("AudioRecord read error (", i, ") stat ");
                    try {
                        int state = audioRecord2.getState();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(LIZIZ);
                        LIZ.append(state);
                        LIZIZ = X1D.LIZIZ(LIZ);
                    } catch (Throwable unused2) {
                        LIZIZ = i0.LJFF(LIZIZ, "unknown");
                    }
                    AVLog2.logToIODevice2(4, "AudioRecordThread", LIZIZ, null, 49, 10000);
                }
            }
        }
    }

    public void start() {
        this.mDeliverThread.post(this);
    }

    public void stop() {
        SafeHandlerThreadPoolExecutor.unlockThread(this.mDeliverThread);
        AVLog.d("AudioRecordThread", "stop");
        this.keepAlive = false;
        Deque<ByteBuffer> deque = this.mQueue;
        if (deque != null) {
            deque.clear();
            this.mQueue = null;
        }
    }

    public static void com_ss_ttlivestreamer_core_capture_audio_AudioRecordThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AudioRecordThread audioRecordThread) {
        boolean LIZ;
        try {
            audioRecordThread.com_ss_ttlivestreamer_core_capture_audio_AudioRecordThread__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public void setAudioDataObserver(IAudioRecordThreadObserver iAudioRecordThreadObserver) {
        this.mAudioRecordThreadObserver = iAudioRecordThreadObserver;
    }

    public AudioRecordThread(AudioRecord audioRecord, int i) {
        this.mScreenAudioCaptureDelayMicPackage = i;
        int channelCount = audioRecord.getChannelCount();
        this.mChannel = channelCount;
        int sampleRate = audioRecord.getSampleRate();
        this.mSample = sampleRate;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((sampleRate / 100) * channelCount * 2);
        this.mByteBuffer = allocateDirect;
        if (allocateDirect.hasArray()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("byteBuffer.capacity: ");
            LIZ.append(allocateDirect.capacity());
            LIZ.append(" mScreenAudioCaptureDelayMicPackage :");
            LIZ.append(i);
            AVLog.d("AudioRecordThread", X1D.LIZIZ(LIZ));
            this.mAudioRecord = audioRecord;
            SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("AudioRecordJavaThread");
            this.mDeliverThread = lockThread;
            lockThread.start();
            return;
        }
        AVLog.logKibana(6, "AudioRecordThread", "ByteBuffer does not have backing array.", null);
        throw new IllegalStateException("ByteBuffer does not have backing array.");
    }
}
