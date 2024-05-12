package com.bytedance.bae.codec;

import X.C16880lQ;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.bytedance.realx.base.RXLogging;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class MediaCodecAACDecoder {
    public long input_ts;
    public MediaCodec mAACDecoder;
    public byte[] mAsc;
    public MediaCodec.BufferInfo mBufferInfo;
    public byte[] mDecodedData;
    public int mHasADTS;
    public ByteBuffer[] mInputBuffers;
    public ByteBuffer[] mOutputBuffers;
    public MediaFormat mOutputFormat;
    public long output_ts;
    public String mMimeType = "audio/mp4a-latm";
    public int mSampleRate = 44100;
    public int mChannels = 1;
    public int mProfile = 2;

    public boolean configAndStartDecoder() {
        try {
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            createAudioFormat.setInteger("aac-profile", this.mProfile);
            createAudioFormat.setInteger("is-adts", this.mHasADTS);
            createAudioFormat.setInteger("aac-max-output-channel_count", this.mChannels);
            genAsc();
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(this.mAsc));
            this.mAACDecoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            this.mAACDecoder.start();
            this.mBufferInfo = new MediaCodec.BufferInfo();
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            closeDecoder();
            RXLogging.e("MediaCodecAACDecoder", "Config and Start Decoder Error");
            return false;
        }
    }

    public boolean openEncoder() {
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(this.mMimeType);
            this.mAACDecoder = createDecoderByType;
            return createDecoderByType != null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            this.mAACDecoder = null;
            RXLogging.e("MediaCodecAACDecoder", "Open AAC Decoder failed");
            return false;
        }
    }

    private void genAsc() {
        int i;
        int i2;
        int i3 = this.mProfile;
        int i4 = 4;
        if (i3 == 2) {
            this.mAsc = new byte[2];
        } else {
            this.mAsc = new byte[4];
        }
        int i5 = this.mSampleRate;
        if (48000 == i5) {
            i4 = 3;
            i = 6;
        } else if (44100 == i5) {
            i = 7;
        } else if (32000 == i5) {
            i4 = 5;
            i = 8;
        } else {
            i4 = 0;
            i = 0;
        }
        int i6 = this.mChannels;
        if (1 == i6) {
            i2 = 1;
        } else if (2 == i6) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        byte b = (byte) i3;
        if (2 == i3) {
            byte[] bArr = this.mAsc;
            bArr[0] = (byte) ((b << 3) | (i4 >> 1));
            bArr[1] = (byte) ((i4 << 7) | (i2 << 3));
        } else {
            if (5 == i3) {
                byte[] bArr2 = this.mAsc;
                bArr2[0] = (byte) ((b << 3) | (i >> 1));
                bArr2[1] = (byte) ((i << 7) | (i2 << 3) | (i4 >> 1));
                bArr2[2] = (byte) ((i4 << 7) | 8);
                bArr2[3] = 0;
                return;
            }
            if (29 != i3) {
                return;
            }
            byte[] bArr3 = this.mAsc;
            bArr3[0] = (byte) ((b << 3) | (i >> 1));
            bArr3[1] = (byte) ((i << 7) | 8 | (i4 >> 1));
            bArr3[2] = (byte) ((i4 << 7) | 8);
            bArr3[3] = 0;
        }
    }

    public void closeDecoder() {
        try {
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACDecoder.release();
                this.mAACDecoder = null;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            RXLogging.e("MediaCodecAACDecoder", "close AAC decoder failed");
        }
    }

    public int getOutputChannels() {
        return this.mOutputFormat.getInteger("channel-count");
    }

    public int getOutputSampleRate() {
        return this.mOutputFormat.getInteger("sample-rate");
    }

    public MediaCodecAACDecoder() {
        RXLogging.e("MediaCodecAACDecoder", "MediaCodecAAC Decoder Created");
    }

    public byte[] getDecodedData() {
        return this.mDecodedData;
    }

    public long getOutputTs() {
        return this.output_ts;
    }

    public boolean decodeProcess(byte[] bArr) {
        try {
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec == null) {
                return false;
            }
            this.mDecodedData = null;
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(300L);
            if (dequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = this.mAACDecoder.getInputBuffer(dequeueInputBuffer);
                inputBuffer.clear();
                inputBuffer.put(bArr);
                this.mAACDecoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, (this.input_ts * 1000000) / this.mSampleRate, 0);
            }
            int dequeueOutputBuffer = this.mAACDecoder.dequeueOutputBuffer(this.mBufferInfo, 0L);
            MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
            int i = bufferInfo.size;
            if (i > 0 && dequeueOutputBuffer >= 0) {
                this.output_ts = (bufferInfo.presentationTimeUs * this.mSampleRate) / 1000000;
                ByteBuffer outputBuffer = this.mAACDecoder.getOutputBuffer(dequeueOutputBuffer);
                byte[] bArr2 = new byte[i];
                this.mDecodedData = bArr2;
                MediaCodec.BufferInfo bufferInfo2 = this.mBufferInfo;
                outputBuffer.get(bArr2, bufferInfo2.offset, bufferInfo2.size);
                outputBuffer.clear();
                this.mOutputFormat = this.mAACDecoder.getOutputFormat(dequeueOutputBuffer);
                this.mAACDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            RXLogging.e("MediaCodecAACDecoder", "AAC Decoder Decode failed");
            return false;
        }
    }

    public void setADTSValue(int i) {
        this.mHasADTS = i;
    }

    public void setChannelsValue(int i) {
        this.mChannels = i;
    }

    public void setInputTs(long j) {
        this.input_ts = j;
    }

    public void setProfileValue(String str) {
        if (str.equals("he_aac")) {
            this.mProfile = 5;
        } else if (str.equals("he_aac_v2")) {
            this.mProfile = 29;
        } else {
            this.mProfile = 2;
        }
    }

    public void setSampeRateValue(int i) {
        this.mSampleRate = i;
    }
}
