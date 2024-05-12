package com.byted.cast.capture.encoder;

import X.X1D;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Pair;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.utils.Logger;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public abstract class MediaEncoder {
    public Thread mEncoderThread;
    public byte[] mHeadBuffer;
    public MediaCodec mMediaCodec;
    public byte[] mTmpBuffer;
    public final String TAG = getTag();
    public volatile boolean mIsRecordStarted = false;
    public volatile boolean mIsRecordPause = false;
    public volatile long last_frame = 0;
    public final Object mSync = new Object();
    public Runnable mEncoderRunnable = new Runnable() { // from class: com.byted.cast.capture.encoder.MediaEncoder.1
        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_capture_encoder_MediaEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_capture_encoder_MediaEncoder$1__run$___twin___() {
            MediaEncoder mediaEncoder;
            MediaCodec mediaCodec;
            int i;
            try {
                mediaEncoder = MediaEncoder.this;
                mediaCodec = mediaEncoder.mMediaCodec;
            } catch (Exception e) {
                String str = MediaEncoder.this.TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mEncoderThread#run");
                LIZ.append(e);
                Logger.e(str, X1D.LIZIZ(LIZ));
                MediaEncoder.this.NotifyMessager(14004008, "mEncoderThread error");
            }
            if (mediaCodec != null) {
                ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
                int i2 = 0;
                while (MediaEncoder.this.mIsRecordStarted) {
                    if (MediaEncoder.this.last_frame == 0) {
                        MediaEncoder.this.last_frame = System.currentTimeMillis();
                    } else if (System.currentTimeMillis() - MediaEncoder.this.last_frame > 1000) {
                        Logger.w(MediaEncoder.this.TAG, "No Encode data > 1s");
                        MediaEncoder.this.last_frame = System.currentTimeMillis();
                        if (!MediaEncoder.this.mIsRecordPause) {
                            MediaEncoder.this.onRecevieFrameTimeout();
                        }
                    }
                    try {
                        MediaEncoder mediaEncoder2 = MediaEncoder.this;
                        MediaCodec mediaCodec2 = mediaEncoder2.mMediaCodec;
                        if (mediaCodec2 != null) {
                            i2 = mediaCodec2.dequeueOutputBuffer(mediaEncoder2.mBufferInfo, 10000L);
                        }
                        if (i2 != -1) {
                            if (i2 == -3) {
                                Logger.d(MediaEncoder.this.TAG, "INFO_OUTPUT_BUFFERS_CHANGED");
                                outputBuffers = MediaEncoder.this.mMediaCodec.getOutputBuffers();
                            } else if (i2 == -2) {
                                Logger.i(MediaEncoder.this.TAG, "INFO_OUTPUT_FORMAT_CHANGED");
                                MediaCodec mediaCodec3 = MediaEncoder.this.mMediaCodec;
                                if (mediaCodec3 != null) {
                                    MediaEncoder.this.onOutputFormatChange(mediaCodec3.getOutputFormat());
                                }
                            } else if (i2 < 0) {
                                String str2 = MediaEncoder.this.TAG;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("drain:unexpected result from encoder#dequeueOutputBuffer: ");
                                LIZ2.append(i2);
                                Logger.w(str2, X1D.LIZIZ(LIZ2));
                            } else {
                                ByteBuffer byteBuffer = outputBuffers[i2];
                                if (byteBuffer != null) {
                                    MediaEncoder mediaEncoder3 = MediaEncoder.this;
                                    int i3 = mediaEncoder3.mBufferInfo.flags;
                                    boolean z = true;
                                    if ((i3 & 1) == 0) {
                                        i = 0;
                                    } else {
                                        i = 1;
                                    }
                                    if ((i3 & 2) == 0) {
                                        z = false;
                                    } else {
                                        mediaEncoder3.mHeadBuffer = new byte[byteBuffer.remaining()];
                                        byteBuffer.get(MediaEncoder.this.mHeadBuffer);
                                        MediaEncoder mediaEncoder4 = MediaEncoder.this;
                                        mediaEncoder4.handleOutputBuffer(mediaEncoder4.mHeadBuffer, mediaEncoder4.mBufferInfo, 1, 1);
                                        String str3 = MediaEncoder.this.TAG;
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("onOutputBufferAvailable index:");
                                        LIZ3.append(MediaEncoder.this.mBufferInfo);
                                        LIZ3.append(" size:");
                                        LIZ3.append(MediaEncoder.this.mBufferInfo.size);
                                        LIZ3.append(" remainng");
                                        LIZ3.append(byteBuffer.remaining());
                                        Logger.d(str3, X1D.LIZIZ(LIZ3));
                                        MediaEncoder mediaEncoder5 = MediaEncoder.this;
                                        mediaEncoder5.mBufferInfo.size = 0;
                                        mediaEncoder5.mHeadBuffer = null;
                                        mediaEncoder5.last_frame = System.currentTimeMillis();
                                    }
                                    if (MediaEncoder.this.mBufferInfo.size != 0 && !z) {
                                        int remaining = byteBuffer.remaining();
                                        byte[] bArr = new byte[remaining];
                                        MediaEncoder.this.mTmpBuffer = bArr;
                                        byteBuffer.get(bArr);
                                        String str4 = MediaEncoder.this.TAG;
                                        StringBuilder LIZ4 = X1D.LIZ();
                                        LIZ4.append("onOutputBufferAvailable keyFrame:");
                                        LIZ4.append(i);
                                        LIZ4.append(", size:");
                                        LIZ4.append(MediaEncoder.this.mBufferInfo.size);
                                        LIZ4.append(", remaining:");
                                        LIZ4.append(remaining);
                                        Logger.v(str4, X1D.LIZIZ(LIZ4));
                                        MediaEncoder mediaEncoder6 = MediaEncoder.this;
                                        mediaEncoder6.handleOutputBuffer(mediaEncoder6.mTmpBuffer, mediaEncoder6.mBufferInfo, i, 0);
                                        MediaEncoder mediaEncoder7 = MediaEncoder.this;
                                        mediaEncoder7.mTmpBuffer = null;
                                        mediaEncoder7.last_frame = System.currentTimeMillis();
                                    }
                                    byteBuffer.clear();
                                    try {
                                        MediaCodec mediaCodec4 = MediaEncoder.this.mMediaCodec;
                                        if (mediaCodec4 != null) {
                                            mediaCodec4.releaseOutputBuffer(i2, false);
                                        }
                                    } catch (IllegalStateException e2) {
                                        String str5 = MediaEncoder.this.TAG;
                                        StringBuilder LIZ5 = X1D.LIZ();
                                        LIZ5.append("releaseOutputBuffer:");
                                        LIZ5.append(e2);
                                        Logger.e(str5, X1D.LIZIZ(LIZ5));
                                    }
                                } else {
                                    StringBuilder LIZ6 = X1D.LIZ();
                                    LIZ6.append("couldn't fetch buffer at index ");
                                    LIZ6.append(i2);
                                    throw new RuntimeException(X1D.LIZIZ(LIZ6));
                                }
                            }
                        }
                    } catch (IllegalStateException e3) {
                        String str6 = MediaEncoder.this.TAG;
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("dequeueOutputBuffer:");
                        LIZ7.append(e3);
                        Logger.e(str6, X1D.LIZIZ(LIZ7));
                        MediaEncoder.this.NotifyMessager(14004008, "dequeueOutputBuffer error");
                        MediaEncoder.this.mIsRecordStarted = false;
                    }
                }
                MediaEncoder.this.onEncoderStop();
                Logger.i(MediaEncoder.this.TAG, "mEncoderThread EXIT");
                return;
            }
            Logger.e(mediaEncoder.TAG, "mMediaCodec is NULL");
        }

        public static void com_byted_cast_capture_encoder_MediaEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_byted_cast_capture_encoder_MediaEncoder$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public int frame_cnt = 0;
    public long time_cnt = 0;
    public long size_cnt = 0;
    public long last_t = 0;
    public long diff_t = 0;
    public long current_time = 0;
    public double frequent = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public long biterate = 0;
    public MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();

    public abstract void NotifyMessager(int i, String str);

    public abstract String getTag();

    public abstract void handleOutputBuffer(byte[] bArr, MediaCodec.BufferInfo bufferInfo, int i, int i2);

    public abstract void onEncoderStop();

    public abstract void onOutputFormatChange(MediaFormat mediaFormat);

    public abstract void onRecevieFrameTimeout();

    public void pause() {
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("zhy test pause");
        LIZ.append(this.mIsRecordPause);
        LIZ.append(" ");
        LIZ.append(this.mIsRecordStarted);
        Logger.i(str, X1D.LIZIZ(LIZ));
        synchronized (this.mSync) {
            if (!this.mIsRecordStarted || this.mIsRecordPause) {
                return;
            }
            this.mIsRecordPause = true;
            Bundle bundle = new Bundle();
            bundle.putInt("drop-input-frames", 1);
            setParameters(bundle);
        }
    }

    public void release() {
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("zhy test release");
        LIZ.append(this.mIsRecordPause);
        LIZ.append(this.mIsRecordStarted);
        Logger.i(str, X1D.LIZIZ(LIZ));
        synchronized (this.mSync) {
            this.mIsRecordStarted = false;
        }
        try {
            Thread thread = this.mEncoderThread;
            if (thread != null) {
                thread.join(100L);
                this.mEncoderThread.interrupt();
                this.mEncoderThread = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.mEncoderThread = null;
        }
        try {
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.flush();
                this.mMediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
                Logger.i(this.TAG, "release mMediaCodec");
            }
        } catch (Exception e2) {
            this.mMediaCodec = null;
            String str2 = this.TAG;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mMediaCodec release Exception");
            LIZ2.append(e2);
            Logger.i(str2, X1D.LIZIZ(LIZ2));
        }
        this.mTmpBuffer = null;
        this.mHeadBuffer = null;
        this.mEncoderRunnable = null;
        this.mBufferInfo = null;
    }

    public void resume() {
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("zhy test resume");
        LIZ.append(this.mIsRecordPause);
        LIZ.append(" ");
        LIZ.append(this.mIsRecordStarted);
        Logger.i(str, X1D.LIZIZ(LIZ));
        synchronized (this.mSync) {
            if (!this.mIsRecordStarted || !this.mIsRecordPause) {
                return;
            }
            this.mIsRecordPause = false;
            Bundle bundle = new Bundle();
            bundle.putInt("drop-input-frames", 0);
            setParameters(bundle);
        }
    }

    public void start() {
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("zhy test start");
        LIZ.append(this.mIsRecordPause);
        LIZ.append(this.mIsRecordStarted);
        Logger.i(str, X1D.LIZIZ(LIZ));
        synchronized (this.mSync) {
            this.mIsRecordStarted = true;
            this.mIsRecordPause = false;
        }
        PthreadThread pthreadThread = new PthreadThread(this.mEncoderRunnable, this.TAG);
        this.mEncoderThread = pthreadThread;
        pthreadThread.setPriority(10);
        this.mEncoderThread.start();
    }

    public final Pair<MediaCodecInfo, String> selectMediaCodecInfo(String str) {
        MediaCodecInfo mediaCodecInfo;
        String str2;
        String str3 = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("selectMediaCodecInfo:");
        LIZ.append(str);
        Logger.i(str3, X1D.LIZIZ(LIZ));
        int codecCount = MediaCodecList.getCodecCount();
        int i = 0;
        loop0: while (true) {
            if (i < codecCount) {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
                if (mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                        if (supportedTypes[i2].equalsIgnoreCase(str)) {
                            str2 = supportedTypes[i2];
                            break loop0;
                        }
                    }
                }
                i++;
            } else {
                mediaCodecInfo = null;
                str2 = "";
                break;
            }
        }
        return new Pair<>(mediaCodecInfo, str2);
    }

    public void setParameters(Bundle bundle) {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            mediaCodec.setParameters(bundle);
        }
    }

    public void printFPS(long j, int i) {
        this.frame_cnt++;
        this.time_cnt += ((System.nanoTime() / 1000) - j) / 1000;
        this.size_cnt += i;
        if (this.last_t == 0) {
            this.last_t = System.currentTimeMillis();
            return;
        }
        if (this.frame_cnt != 100) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.current_time = currentTimeMillis;
        long j2 = currentTimeMillis - this.last_t;
        this.diff_t = j2;
        this.frequent = 100000.0d / j2;
        this.biterate = (this.size_cnt * 8) / j2;
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current frequent ");
        LIZ.append(this.frequent);
        LIZ.append(" biterate:");
        LIZ.append(this.biterate);
        LIZ.append("kbps encode:");
        LIZ.append(this.time_cnt / 100);
        LIZ.append("ms");
        Logger.i(str, X1D.LIZIZ(LIZ));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("class", this.TAG);
            jSONObject.put("frequent", this.frequent);
            jSONObject.put("biterate", this.biterate);
            jSONObject.put("encode", this.time_cnt / 100);
            MediaMonitor.onMonitor("MediaCapture_Encoder_Statistics", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.last_t = this.current_time;
        this.frame_cnt = 0;
        this.time_cnt = 0L;
        this.size_cnt = 0L;
    }

    public void encode(byte[] bArr, int i, long j) {
        if (!this.mIsRecordStarted || this.mIsRecordPause) {
            return;
        }
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
            while (this.mIsRecordStarted) {
                int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(10000L);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                    byteBuffer.clear();
                    if (bArr != null) {
                        byteBuffer.put(bArr);
                    }
                    if (i <= 0) {
                        Logger.i(this.TAG, "send BUFFER_FLAG_END_OF_STREAM");
                        this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, j, 4);
                        return;
                    } else {
                        this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
                        return;
                    }
                }
            }
            return;
        }
        Logger.e(this.TAG, "mMediaCodec is NULL");
    }
}
