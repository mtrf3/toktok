package com.byted.cast.sdk.render.audio;

import X.C16880lQ;
import X.X1D;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.RTCAudioProfile;
import com.byted.cast.sdk.render.audio.AudioPassivePlayer;
import com.byted.cast.sdk.utils.HexDump;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes29.dex */
public class AudioPassivePlayer implements AudioJitterBufferCallback {
    public static int AAC_PROFILE = 1;
    public static int CHAN_COUNT = 2;
    public static int SAMPLE_IDX = 3;
    public static String mMineType = "audio/mp4a-latm";
    public IAudioListener mAudioListener;
    public RTCAudioProfile mAudioProfile;
    public Boolean mAutoPlayAudio;
    public MediaCodec.BufferInfo mBufferInfo;
    public ContextManager.CastContext mCastContext;
    public MediaCodec mDecoder;
    public ByteBuffer[] mInputBuffers;
    public volatile boolean mIsPlayStarted;
    public CastLogger mLogger;
    public ByteBuffer[] mOutputBuffers;
    public AudioTrack mTrack;
    public String mUserId;
    public int mAACProfile = 2;
    public int mChannel = 12;
    public int mSampleRate = 48000;
    public int mSampleFrame = 1024;
    public int mAudioFormat = 2;
    public ExecutorService mSingleExecutor = C16880lQ.LLLLZLLIL();
    public SortedSet<Long> mPtsSet = new ConcurrentSkipListSet();

    private void releaseDecoder() {
        MediaCodec mediaCodec = this.mDecoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mDecoder.release();
        }
        this.mInputBuffers = null;
        this.mOutputBuffers = null;
    }

    public int getAudioSessionId() {
        AudioTrack audioTrack = this.mTrack;
        if (audioTrack != null) {
            return audioTrack.getAudioSessionId();
        }
        return -1;
    }

    @Override // com.byted.cast.sdk.render.audio.AudioJitterBufferCallback
    public void onAudioReadyToPlay() {
        if (this.mTrack != null) {
            this.mLogger.i("AudioPassivePlayer", "Start to play");
            this.mTrack.play();
        }
    }

    public boolean prepareDecoder() {
        this.mLogger.i("AudioPassivePlayer", "prepareDecoder audio");
        this.mBufferInfo = new MediaCodec.BufferInfo();
        try {
            this.mDecoder = MediaCodec.createDecoderByType(mMineType);
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", mMineType);
            mediaFormat.setInteger("channel-count", 2);
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("is-adts", 1);
            this.mLogger.i("AudioPassivePlayer", "prepareDecoder, before dump");
            byte[] bArr = {17, -112};
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prepareDecoder, csd-0:");
            LIZ.append(HexDump.toHexString(bArr[0]));
            LIZ.append(" ");
            LIZ.append(HexDump.toHexString(bArr[1]));
            castLogger.i("AudioPassivePlayer", X1D.LIZIZ(LIZ));
            mediaFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
            this.mDecoder.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
            MediaCodec mediaCodec = this.mDecoder;
            if (mediaCodec == null) {
                return false;
            }
            mediaCodec.start();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void startPlay() {
        this.mLogger.i("AudioPassivePlayer", "AudioTrack start !");
        this.mIsPlayStarted = true;
        this.mSampleFrame = (RTCAudioProfile.getFrameSize(this.mSampleRate) / 2) / 2;
        AudioJitterBuffer audioJitterBuffer = AudioJitterBuffer.getInstance();
        audioJitterBuffer.setJitterCallback(this);
        audioJitterBuffer.setAudioFormat(this.mSampleRate, 2, 2);
        AudioJitterBuffer.getInstance().start();
        prepareDecoder();
    }

    public void stopPlay() {
        this.mLogger.i("AudioPassivePlayer", "AudioTrack stop !");
        if (!this.mIsPlayStarted) {
            return;
        }
        releaseDecoder();
        AudioJitterBuffer.getInstance().stop();
        AudioTrack audioTrack = this.mTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.mTrack = null;
        }
        this.mIsPlayStarted = false;
    }

    @Override // com.byted.cast.sdk.render.audio.AudioJitterBufferCallback
    public void onAudioSmoothOutput(byte[] bArr) {
        AudioTrack audioTrack = this.mTrack;
        if (audioTrack != null && audioTrack.write(bArr, 0, bArr.length) != bArr.length) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAudioSmoothOutput output len invalid：");
            LIZ.append(bArr.length);
            castLogger.e("AudioPassivePlayer", X1D.LIZIZ(LIZ));
        }
    }

    public void setVolume(float f) {
        if (this.mTrack != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setVolume:");
            LIZ.append(f);
            castLogger.i("AudioPassivePlayer", X1D.LIZIZ(LIZ));
            this.mTrack.setVolume(f);
        }
    }

    private void callbackAudioData(final byte[] bArr, final long j) {
        if (this.mAudioListener != null) {
            this.mSingleExecutor.execute(new Runnable() { // from class: X.ZaX
                @Override // java.lang.Runnable
                public final void run() {
                    AudioPassivePlayer.this.lambda$callbackAudioData$0(bArr, j);
                }
            });
        }
    }

    private void decode(byte[] bArr, long j) {
        int dequeueInputBuffer = this.mDecoder.dequeueInputBuffer(10000L);
        if (Build.VERSION.SDK_INT > 21) {
            if (dequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = this.mDecoder.getInputBuffer(dequeueInputBuffer);
                if (inputBuffer == null) {
                    return;
                }
                inputBuffer.clear();
                inputBuffer.put(bArr, 0, bArr.length);
                this.mDecoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, j, 0);
            }
            while (true) {
                int dequeueOutputBuffer = this.mDecoder.dequeueOutputBuffer(this.mBufferInfo, 10000L);
                if (dequeueOutputBuffer >= 0) {
                    ByteBuffer outputBuffer = this.mDecoder.getOutputBuffer(dequeueOutputBuffer);
                    int i = this.mBufferInfo.size;
                    byte[] bArr2 = new byte[i];
                    outputBuffer.get(bArr2, 0, i);
                    outputBuffer.clear();
                    callbackAudioData(bArr2, this.mBufferInfo.presentationTimeUs);
                    if (this.mAutoPlayAudio.booleanValue()) {
                        AudioJitterBuffer.getInstance().append(bArr2, this.mBufferInfo.presentationTimeUs);
                    }
                    this.mDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                } else {
                    return;
                }
            }
        } else {
            if (dequeueInputBuffer >= 0) {
                ByteBuffer byteBuffer = this.mInputBuffers[dequeueInputBuffer];
                if (byteBuffer == null) {
                    return;
                }
                byteBuffer.clear();
                byteBuffer.put(bArr, 0, bArr.length);
                this.mDecoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, j, 0);
            }
            while (true) {
                int dequeueOutputBuffer2 = this.mDecoder.dequeueOutputBuffer(this.mBufferInfo, 10000L);
                if (dequeueOutputBuffer2 >= 0) {
                    ByteBuffer byteBuffer2 = this.mOutputBuffers[dequeueOutputBuffer2];
                    int i2 = this.mBufferInfo.size;
                    byte[] bArr3 = new byte[i2];
                    byteBuffer2.get(bArr3, 0, i2);
                    byteBuffer2.clear();
                    callbackAudioData(bArr3, this.mBufferInfo.presentationTimeUs);
                    if (this.mAutoPlayAudio.booleanValue()) {
                        AudioJitterBuffer.getInstance().append(bArr3, this.mBufferInfo.presentationTimeUs);
                    }
                    this.mDecoder.releaseOutputBuffer(dequeueOutputBuffer2, false);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callbackAudioData$0(byte[] bArr, long j) {
        this.mAudioListener.onAudioOutput(this.mUserId, bArr, this.mSampleRate, this.mChannel, this.mAudioFormat, this.mAudioProfile.getBitrate(), j);
    }

    public void addFrame(byte[] bArr, long j) {
        if (!this.mPtsSet.contains(Long.valueOf(j))) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addFrame...New...frame.length=");
            LIZ.append(bArr.length);
            LIZ.append(" timestamp=");
            LIZ.append(j);
            castLogger.i("AudioPassivePlayer", X1D.LIZIZ(LIZ));
            this.mPtsSet.add(Long.valueOf(j));
            decode(bArr, j);
            Iterator<Long> it = this.mPtsSet.headSet(Long.valueOf(j - (this.mSampleFrame * 5))).iterator();
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                CastLogger castLogger2 = this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("addFrame...Flush...timestamp=");
                LIZ2.append(longValue);
                castLogger2.i("AudioPassivePlayer", X1D.LIZIZ(LIZ2));
                this.mPtsSet.remove(Long.valueOf(longValue));
            }
            return;
        }
        CastLogger castLogger3 = this.mLogger;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("addFrame...Skip...frame.length=");
        LIZ3.append(bArr.length);
        LIZ3.append(" timestamp=");
        LIZ3.append(j);
        castLogger3.i("AudioPassivePlayer", X1D.LIZIZ(LIZ3));
    }

    public void addPcm(byte[] bArr, long j) {
        if (this.mAutoPlayAudio.booleanValue()) {
            AudioJitterBuffer.getInstance().append(bArr, j);
        }
    }

    public AudioPassivePlayer(String str, ContextManager.CastContext castContext, Boolean bool, RTCAudioProfile rTCAudioProfile, IAudioListener iAudioListener) {
        this.mUserId = str;
        this.mCastContext = castContext;
        this.mAutoPlayAudio = bool;
        this.mAudioListener = iAudioListener;
        this.mAudioProfile = rTCAudioProfile;
        CastLogger logger = ContextManager.getLogger(castContext);
        this.mLogger = logger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioPassivePlayer, mUserId: ");
        LIZ.append(this.mUserId);
        LIZ.append(", autoplay: ");
        LIZ.append(this.mAutoPlayAudio);
        LIZ.append(", mAudioListener: ");
        LIZ.append(this.mAudioListener);
        logger.i("AudioPassivePlayer", X1D.LIZIZ(LIZ));
        int minBufferSize = AudioTrack.getMinBufferSize(this.mSampleRate, this.mChannel, this.mAudioFormat);
        if (minBufferSize == -2) {
            this.mLogger.e("AudioPassivePlayer", "Invalid parameter !");
        }
        int i = minBufferSize * 4;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AudioTrack init...minBufferSize=");
        LIZ2.append(i);
        castLogger.i("AudioPassivePlayer", X1D.LIZIZ(LIZ2));
        if (Build.VERSION.SDK_INT >= 26) {
            this.mTrack = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setPerformanceMode(1).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.mSampleRate).setEncoding(this.mAudioFormat).setChannelMask(this.mChannel).build()).setTransferMode(1).setBufferSizeInBytes(i).build();
        } else {
            this.mTrack = new AudioTrack(3, this.mSampleRate, this.mChannel, this.mAudioFormat, i, 1);
        }
    }
}
